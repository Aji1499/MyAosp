/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * DO NOT EDIT MANUALLY!!!
 *
 * Generated by tools/generate_annotation_enums.py.
 */

// clang-format off

package android.hardware.automotive.vehicle;

import java.util.List;
import java.util.Map;

public final class EnumForVehicleProperty {

    public static final Map<Integer, List<Class<?>>> values = Map.ofEntries(
        Map.entry(VehicleProperty.INFO_FUEL_TYPE, List.of(FuelType.class)),
        Map.entry(VehicleProperty.INFO_EV_CONNECTOR_TYPE, List.of(EvConnectorType.class)),
        Map.entry(VehicleProperty.INFO_FUEL_DOOR_LOCATION, List.of(PortLocationType.class)),
        Map.entry(VehicleProperty.INFO_EV_PORT_LOCATION, List.of(PortLocationType.class)),
        Map.entry(VehicleProperty.INFO_DRIVER_SEAT, List.of(VehicleAreaSeat.class)),
        Map.entry(VehicleProperty.INFO_MULTI_EV_PORT_LOCATIONS, List.of(PortLocationType.class)),
        Map.entry(VehicleProperty.ENGINE_OIL_LEVEL, List.of(VehicleOilLevel.class)),
        Map.entry(VehicleProperty.GEAR_SELECTION, List.of(VehicleGear.class)),
        Map.entry(VehicleProperty.CURRENT_GEAR, List.of(VehicleGear.class)),
        Map.entry(VehicleProperty.TURN_SIGNAL_STATE, List.of(VehicleTurnSignal.class)),
        Map.entry(VehicleProperty.IGNITION_STATE, List.of(VehicleIgnitionState.class)),
        Map.entry(VehicleProperty.EV_STOPPING_MODE, List.of(EvStoppingMode.class)),
        Map.entry(VehicleProperty.HVAC_FAN_DIRECTION, List.of(VehicleHvacFanDirection.class)),
        Map.entry(VehicleProperty.HVAC_TEMPERATURE_DISPLAY_UNITS, List.of(VehicleUnit.class)),
        Map.entry(VehicleProperty.HVAC_FAN_DIRECTION_AVAILABLE, List.of(VehicleHvacFanDirection.class)),
        Map.entry(VehicleProperty.DISTANCE_DISPLAY_UNITS, List.of(VehicleUnit.class)),
        Map.entry(VehicleProperty.FUEL_VOLUME_DISPLAY_UNITS, List.of(VehicleUnit.class)),
        Map.entry(VehicleProperty.TIRE_PRESSURE_DISPLAY_UNITS, List.of(VehicleUnit.class)),
        Map.entry(VehicleProperty.EV_BATTERY_DISPLAY_UNITS, List.of(VehicleUnit.class)),
        Map.entry(VehicleProperty.HW_ROTARY_INPUT, List.of(RotaryInputType.class)),
        Map.entry(VehicleProperty.HW_CUSTOM_INPUT, List.of(CustomInputType.class)),
        Map.entry(VehicleProperty.SEAT_FOOTWELL_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.SEAT_FOOTWELL_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.SEAT_OCCUPANCY, List.of(VehicleSeatOccupancyState.class)),
        Map.entry(VehicleProperty.WINDSHIELD_WIPERS_STATE, List.of(WindshieldWipersState.class)),
        Map.entry(VehicleProperty.WINDSHIELD_WIPERS_SWITCH, List.of(WindshieldWipersSwitch.class)),
        Map.entry(VehicleProperty.HEADLIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.HIGH_BEAM_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.FOG_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.HAZARD_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.HEADLIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.HIGH_BEAM_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.FOG_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.HAZARD_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.CABIN_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.CABIN_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.READING_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.READING_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.STEERING_WHEEL_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.STEERING_WHEEL_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.ELECTRONIC_TOLL_COLLECTION_CARD_TYPE, List.of(ElectronicTollCollectionCardType.class)),
        Map.entry(VehicleProperty.ELECTRONIC_TOLL_COLLECTION_CARD_STATUS, List.of(ElectronicTollCollectionCardStatus.class)),
        Map.entry(VehicleProperty.FRONT_FOG_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.FRONT_FOG_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.REAR_FOG_LIGHTS_STATE, List.of(VehicleLightState.class)),
        Map.entry(VehicleProperty.REAR_FOG_LIGHTS_SWITCH, List.of(VehicleLightSwitch.class)),
        Map.entry(VehicleProperty.EV_CHARGE_STATE, List.of(EvChargeState.class)),
        Map.entry(VehicleProperty.EV_REGENERATIVE_BRAKING_STATE, List.of(EvRegenerativeBrakingState.class)),
        Map.entry(VehicleProperty.TRAILER_PRESENT, List.of(TrailerState.class)),
        Map.entry(VehicleProperty.GENERAL_SAFETY_REGULATION_COMPLIANCE_REQUIREMENT, List.of(GsrComplianceRequirementType.class)),
        Map.entry(VehicleProperty.SHUTDOWN_REQUEST, List.of(VehicleApPowerStateShutdownParam.class)),
        Map.entry(VehicleProperty.AUTOMATIC_EMERGENCY_BRAKING_STATE, List.of(AutomaticEmergencyBrakingState.class, ErrorState.class)),
        Map.entry(VehicleProperty.FORWARD_COLLISION_WARNING_STATE, List.of(ForwardCollisionWarningState.class, ErrorState.class)),
        Map.entry(VehicleProperty.BLIND_SPOT_WARNING_STATE, List.of(BlindSpotWarningState.class, ErrorState.class)),
        Map.entry(VehicleProperty.LANE_DEPARTURE_WARNING_STATE, List.of(LaneDepartureWarningState.class, ErrorState.class)),
        Map.entry(VehicleProperty.LANE_KEEP_ASSIST_STATE, List.of(LaneKeepAssistState.class, ErrorState.class)),
        Map.entry(VehicleProperty.LANE_CENTERING_ASSIST_COMMAND, List.of(LaneCenteringAssistCommand.class)),
        Map.entry(VehicleProperty.LANE_CENTERING_ASSIST_STATE, List.of(LaneCenteringAssistState.class, ErrorState.class)),
        Map.entry(VehicleProperty.EMERGENCY_LANE_KEEP_ASSIST_STATE, List.of(EmergencyLaneKeepAssistState.class, ErrorState.class)),
        Map.entry(VehicleProperty.CRUISE_CONTROL_TYPE, List.of(CruiseControlType.class, ErrorState.class)),
        Map.entry(VehicleProperty.CRUISE_CONTROL_STATE, List.of(CruiseControlState.class, ErrorState.class)),
        Map.entry(VehicleProperty.CRUISE_CONTROL_COMMAND, List.of(CruiseControlCommand.class)),
        Map.entry(VehicleProperty.HANDS_ON_DETECTION_DRIVER_STATE, List.of(HandsOnDetectionDriverState.class, ErrorState.class)),
        Map.entry(VehicleProperty.HANDS_ON_DETECTION_WARNING, List.of(HandsOnDetectionWarning.class, ErrorState.class)),
        Map.entry(VehicleProperty.DRIVER_DROWSINESS_ATTENTION_STATE, List.of(DriverDrowsinessAttentionState.class, ErrorState.class))
    );

}
