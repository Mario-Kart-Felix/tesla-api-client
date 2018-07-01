/*
 * Tesla Model S JSON API
 * TODO: Add a description
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jonahwh.tesla_api_client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ChargeState
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T23:11:34.231-07:00")
public class ChargeState {
  @SerializedName("charging_state")
  private String chargingState = null;

  @SerializedName("fast_charger_type")
  private String fastChargerType = null;

  @SerializedName("fast_charger_brand")
  private String fastChargerBrand = null;

  @SerializedName("charge_limit_soc")
  private Integer chargeLimitSoc = null;

  @SerializedName("charge_limit_soc_std")
  private Integer chargeLimitSocStd = null;

  @SerializedName("charge_limit_soc_min")
  private Integer chargeLimitSocMin = null;

  @SerializedName("charge_limit_soc_max")
  private Integer chargeLimitSocMax = null;

  @SerializedName("charge_to_max_range")
  private Boolean chargeToMaxRange = null;

  @SerializedName("max_range_charge_counter")
  private Integer maxRangeChargeCounter = null;

  @SerializedName("fast_charger_present")
  private Boolean fastChargerPresent = null;

  @SerializedName("battery_range")
  private Double batteryRange = null;

  @SerializedName("est_battery_range")
  private Double estBatteryRange = null;

  @SerializedName("ideal_battery_range")
  private Double idealBatteryRange = null;

  @SerializedName("battery_level")
  private Integer batteryLevel = null;

  @SerializedName("usable_battery_level")
  private Integer usableBatteryLevel = null;

  @SerializedName("charge_energy_added")
  private Double chargeEnergyAdded = null;

  @SerializedName("charge_miles_added_rated")
  private Double chargeMilesAddedRated = null;

  @SerializedName("charge_miles_added_ideal")
  private Double chargeMilesAddedIdeal = null;

  @SerializedName("charger_voltage")
  private Integer chargerVoltage = null;

  @SerializedName("charger_pilot_current")
  private Integer chargerPilotCurrent = null;

  @SerializedName("charger_actual_current")
  private Integer chargerActualCurrent = null;

  @SerializedName("charger_power")
  private Integer chargerPower = null;

  @SerializedName("time_to_full_charge")
  private Double timeToFullCharge = null;

  @SerializedName("trip_charging")
  private Boolean tripCharging = null;

  @SerializedName("charge_rate")
  private Double chargeRate = null;

  @SerializedName("charge_port_door_open")
  private Boolean chargePortDoorOpen = null;

  @SerializedName("conn_charge_cable")
  private String connChargeCable = null;

  @SerializedName("scheduled_charging_start_time")
  private BigDecimal scheduledChargingStartTime = null;

  @SerializedName("scheduled_charging_pending")
  private Boolean scheduledChargingPending = null;

  @SerializedName("user_charge_enable_request")
  private Boolean userChargeEnableRequest = null;

  @SerializedName("charge_enable_request")
  private Boolean chargeEnableRequest = null;

  @SerializedName("charger_phases")
  private Integer chargerPhases = null;

  @SerializedName("charge_port_latch")
  private String chargePortLatch = null;

  @SerializedName("charge_current_request")
  private Integer chargeCurrentRequest = null;

  @SerializedName("charge_current_request_max")
  private Integer chargeCurrentRequestMax = null;

  @SerializedName("managed_charging_active")
  private Boolean managedChargingActive = null;

  @SerializedName("managed_charging_user_canceled")
  private Boolean managedChargingUserCanceled = null;

  @SerializedName("managed_charging_start_time")
  private BigDecimal managedChargingStartTime = null;

  @SerializedName("battery_heater_on")
  private Boolean batteryHeaterOn = null;

  @SerializedName("not_enough_power_to_heat")
  private Boolean notEnoughPowerToHeat = null;

  public ChargeState chargingState(String chargingState) {
    this.chargingState = chargingState;
    return this;
  }

   /**
   * Get chargingState
   * @return chargingState
  **/
  @ApiModelProperty(value = "")
  public String getChargingState() {
    return chargingState;
  }

  public void setChargingState(String chargingState) {
    this.chargingState = chargingState;
  }

  public ChargeState fastChargerType(String fastChargerType) {
    this.fastChargerType = fastChargerType;
    return this;
  }

   /**
   * Get fastChargerType
   * @return fastChargerType
  **/
  @ApiModelProperty(value = "")
  public String getFastChargerType() {
    return fastChargerType;
  }

  public void setFastChargerType(String fastChargerType) {
    this.fastChargerType = fastChargerType;
  }

  public ChargeState fastChargerBrand(String fastChargerBrand) {
    this.fastChargerBrand = fastChargerBrand;
    return this;
  }

   /**
   * Get fastChargerBrand
   * @return fastChargerBrand
  **/
  @ApiModelProperty(value = "")
  public String getFastChargerBrand() {
    return fastChargerBrand;
  }

  public void setFastChargerBrand(String fastChargerBrand) {
    this.fastChargerBrand = fastChargerBrand;
  }

  public ChargeState chargeLimitSoc(Integer chargeLimitSoc) {
    this.chargeLimitSoc = chargeLimitSoc;
    return this;
  }

   /**
   * Get chargeLimitSoc
   * @return chargeLimitSoc
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeLimitSoc() {
    return chargeLimitSoc;
  }

  public void setChargeLimitSoc(Integer chargeLimitSoc) {
    this.chargeLimitSoc = chargeLimitSoc;
  }

  public ChargeState chargeLimitSocStd(Integer chargeLimitSocStd) {
    this.chargeLimitSocStd = chargeLimitSocStd;
    return this;
  }

   /**
   * Get chargeLimitSocStd
   * @return chargeLimitSocStd
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeLimitSocStd() {
    return chargeLimitSocStd;
  }

  public void setChargeLimitSocStd(Integer chargeLimitSocStd) {
    this.chargeLimitSocStd = chargeLimitSocStd;
  }

  public ChargeState chargeLimitSocMin(Integer chargeLimitSocMin) {
    this.chargeLimitSocMin = chargeLimitSocMin;
    return this;
  }

   /**
   * Get chargeLimitSocMin
   * @return chargeLimitSocMin
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeLimitSocMin() {
    return chargeLimitSocMin;
  }

  public void setChargeLimitSocMin(Integer chargeLimitSocMin) {
    this.chargeLimitSocMin = chargeLimitSocMin;
  }

  public ChargeState chargeLimitSocMax(Integer chargeLimitSocMax) {
    this.chargeLimitSocMax = chargeLimitSocMax;
    return this;
  }

   /**
   * Get chargeLimitSocMax
   * @return chargeLimitSocMax
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeLimitSocMax() {
    return chargeLimitSocMax;
  }

  public void setChargeLimitSocMax(Integer chargeLimitSocMax) {
    this.chargeLimitSocMax = chargeLimitSocMax;
  }

  public ChargeState chargeToMaxRange(Boolean chargeToMaxRange) {
    this.chargeToMaxRange = chargeToMaxRange;
    return this;
  }

   /**
   * Get chargeToMaxRange
   * @return chargeToMaxRange
  **/
  @ApiModelProperty(value = "")
  public Boolean isChargeToMaxRange() {
    return chargeToMaxRange;
  }

  public void setChargeToMaxRange(Boolean chargeToMaxRange) {
    this.chargeToMaxRange = chargeToMaxRange;
  }

  public ChargeState maxRangeChargeCounter(Integer maxRangeChargeCounter) {
    this.maxRangeChargeCounter = maxRangeChargeCounter;
    return this;
  }

   /**
   * Get maxRangeChargeCounter
   * @return maxRangeChargeCounter
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxRangeChargeCounter() {
    return maxRangeChargeCounter;
  }

  public void setMaxRangeChargeCounter(Integer maxRangeChargeCounter) {
    this.maxRangeChargeCounter = maxRangeChargeCounter;
  }

  public ChargeState fastChargerPresent(Boolean fastChargerPresent) {
    this.fastChargerPresent = fastChargerPresent;
    return this;
  }

   /**
   * Get fastChargerPresent
   * @return fastChargerPresent
  **/
  @ApiModelProperty(value = "")
  public Boolean isFastChargerPresent() {
    return fastChargerPresent;
  }

  public void setFastChargerPresent(Boolean fastChargerPresent) {
    this.fastChargerPresent = fastChargerPresent;
  }

  public ChargeState batteryRange(Double batteryRange) {
    this.batteryRange = batteryRange;
    return this;
  }

   /**
   * Get batteryRange
   * @return batteryRange
  **/
  @ApiModelProperty(value = "")
  public Double getBatteryRange() {
    return batteryRange;
  }

  public void setBatteryRange(Double batteryRange) {
    this.batteryRange = batteryRange;
  }

  public ChargeState estBatteryRange(Double estBatteryRange) {
    this.estBatteryRange = estBatteryRange;
    return this;
  }

   /**
   * Get estBatteryRange
   * @return estBatteryRange
  **/
  @ApiModelProperty(value = "")
  public Double getEstBatteryRange() {
    return estBatteryRange;
  }

  public void setEstBatteryRange(Double estBatteryRange) {
    this.estBatteryRange = estBatteryRange;
  }

  public ChargeState idealBatteryRange(Double idealBatteryRange) {
    this.idealBatteryRange = idealBatteryRange;
    return this;
  }

   /**
   * Get idealBatteryRange
   * @return idealBatteryRange
  **/
  @ApiModelProperty(value = "")
  public Double getIdealBatteryRange() {
    return idealBatteryRange;
  }

  public void setIdealBatteryRange(Double idealBatteryRange) {
    this.idealBatteryRange = idealBatteryRange;
  }

  public ChargeState batteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
    return this;
  }

   /**
   * Get batteryLevel
   * @return batteryLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getBatteryLevel() {
    return batteryLevel;
  }

  public void setBatteryLevel(Integer batteryLevel) {
    this.batteryLevel = batteryLevel;
  }

  public ChargeState usableBatteryLevel(Integer usableBatteryLevel) {
    this.usableBatteryLevel = usableBatteryLevel;
    return this;
  }

   /**
   * Get usableBatteryLevel
   * @return usableBatteryLevel
  **/
  @ApiModelProperty(value = "")
  public Integer getUsableBatteryLevel() {
    return usableBatteryLevel;
  }

  public void setUsableBatteryLevel(Integer usableBatteryLevel) {
    this.usableBatteryLevel = usableBatteryLevel;
  }

  public ChargeState chargeEnergyAdded(Double chargeEnergyAdded) {
    this.chargeEnergyAdded = chargeEnergyAdded;
    return this;
  }

   /**
   * Get chargeEnergyAdded
   * @return chargeEnergyAdded
  **/
  @ApiModelProperty(value = "")
  public Double getChargeEnergyAdded() {
    return chargeEnergyAdded;
  }

  public void setChargeEnergyAdded(Double chargeEnergyAdded) {
    this.chargeEnergyAdded = chargeEnergyAdded;
  }

  public ChargeState chargeMilesAddedRated(Double chargeMilesAddedRated) {
    this.chargeMilesAddedRated = chargeMilesAddedRated;
    return this;
  }

   /**
   * Get chargeMilesAddedRated
   * @return chargeMilesAddedRated
  **/
  @ApiModelProperty(value = "")
  public Double getChargeMilesAddedRated() {
    return chargeMilesAddedRated;
  }

  public void setChargeMilesAddedRated(Double chargeMilesAddedRated) {
    this.chargeMilesAddedRated = chargeMilesAddedRated;
  }

  public ChargeState chargeMilesAddedIdeal(Double chargeMilesAddedIdeal) {
    this.chargeMilesAddedIdeal = chargeMilesAddedIdeal;
    return this;
  }

   /**
   * Get chargeMilesAddedIdeal
   * @return chargeMilesAddedIdeal
  **/
  @ApiModelProperty(value = "")
  public Double getChargeMilesAddedIdeal() {
    return chargeMilesAddedIdeal;
  }

  public void setChargeMilesAddedIdeal(Double chargeMilesAddedIdeal) {
    this.chargeMilesAddedIdeal = chargeMilesAddedIdeal;
  }

  public ChargeState chargerVoltage(Integer chargerVoltage) {
    this.chargerVoltage = chargerVoltage;
    return this;
  }

   /**
   * Get chargerVoltage
   * @return chargerVoltage
  **/
  @ApiModelProperty(value = "")
  public Integer getChargerVoltage() {
    return chargerVoltage;
  }

  public void setChargerVoltage(Integer chargerVoltage) {
    this.chargerVoltage = chargerVoltage;
  }

  public ChargeState chargerPilotCurrent(Integer chargerPilotCurrent) {
    this.chargerPilotCurrent = chargerPilotCurrent;
    return this;
  }

   /**
   * Get chargerPilotCurrent
   * @return chargerPilotCurrent
  **/
  @ApiModelProperty(value = "")
  public Integer getChargerPilotCurrent() {
    return chargerPilotCurrent;
  }

  public void setChargerPilotCurrent(Integer chargerPilotCurrent) {
    this.chargerPilotCurrent = chargerPilotCurrent;
  }

  public ChargeState chargerActualCurrent(Integer chargerActualCurrent) {
    this.chargerActualCurrent = chargerActualCurrent;
    return this;
  }

   /**
   * Get chargerActualCurrent
   * @return chargerActualCurrent
  **/
  @ApiModelProperty(value = "")
  public Integer getChargerActualCurrent() {
    return chargerActualCurrent;
  }

  public void setChargerActualCurrent(Integer chargerActualCurrent) {
    this.chargerActualCurrent = chargerActualCurrent;
  }

  public ChargeState chargerPower(Integer chargerPower) {
    this.chargerPower = chargerPower;
    return this;
  }

   /**
   * Get chargerPower
   * @return chargerPower
  **/
  @ApiModelProperty(value = "")
  public Integer getChargerPower() {
    return chargerPower;
  }

  public void setChargerPower(Integer chargerPower) {
    this.chargerPower = chargerPower;
  }

  public ChargeState timeToFullCharge(Double timeToFullCharge) {
    this.timeToFullCharge = timeToFullCharge;
    return this;
  }

   /**
   * Get timeToFullCharge
   * @return timeToFullCharge
  **/
  @ApiModelProperty(value = "")
  public Double getTimeToFullCharge() {
    return timeToFullCharge;
  }

  public void setTimeToFullCharge(Double timeToFullCharge) {
    this.timeToFullCharge = timeToFullCharge;
  }

  public ChargeState tripCharging(Boolean tripCharging) {
    this.tripCharging = tripCharging;
    return this;
  }

   /**
   * Get tripCharging
   * @return tripCharging
  **/
  @ApiModelProperty(value = "")
  public Boolean isTripCharging() {
    return tripCharging;
  }

  public void setTripCharging(Boolean tripCharging) {
    this.tripCharging = tripCharging;
  }

  public ChargeState chargeRate(Double chargeRate) {
    this.chargeRate = chargeRate;
    return this;
  }

   /**
   * Get chargeRate
   * @return chargeRate
  **/
  @ApiModelProperty(value = "")
  public Double getChargeRate() {
    return chargeRate;
  }

  public void setChargeRate(Double chargeRate) {
    this.chargeRate = chargeRate;
  }

  public ChargeState chargePortDoorOpen(Boolean chargePortDoorOpen) {
    this.chargePortDoorOpen = chargePortDoorOpen;
    return this;
  }

   /**
   * Get chargePortDoorOpen
   * @return chargePortDoorOpen
  **/
  @ApiModelProperty(value = "")
  public Boolean isChargePortDoorOpen() {
    return chargePortDoorOpen;
  }

  public void setChargePortDoorOpen(Boolean chargePortDoorOpen) {
    this.chargePortDoorOpen = chargePortDoorOpen;
  }

  public ChargeState connChargeCable(String connChargeCable) {
    this.connChargeCable = connChargeCable;
    return this;
  }

   /**
   * Get connChargeCable
   * @return connChargeCable
  **/
  @ApiModelProperty(value = "")
  public String getConnChargeCable() {
    return connChargeCable;
  }

  public void setConnChargeCable(String connChargeCable) {
    this.connChargeCable = connChargeCable;
  }

  public ChargeState scheduledChargingStartTime(BigDecimal scheduledChargingStartTime) {
    this.scheduledChargingStartTime = scheduledChargingStartTime;
    return this;
  }

   /**
   * Get scheduledChargingStartTime
   * @return scheduledChargingStartTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getScheduledChargingStartTime() {
    return scheduledChargingStartTime;
  }

  public void setScheduledChargingStartTime(BigDecimal scheduledChargingStartTime) {
    this.scheduledChargingStartTime = scheduledChargingStartTime;
  }

  public ChargeState scheduledChargingPending(Boolean scheduledChargingPending) {
    this.scheduledChargingPending = scheduledChargingPending;
    return this;
  }

   /**
   * Get scheduledChargingPending
   * @return scheduledChargingPending
  **/
  @ApiModelProperty(value = "")
  public Boolean isScheduledChargingPending() {
    return scheduledChargingPending;
  }

  public void setScheduledChargingPending(Boolean scheduledChargingPending) {
    this.scheduledChargingPending = scheduledChargingPending;
  }

  public ChargeState userChargeEnableRequest(Boolean userChargeEnableRequest) {
    this.userChargeEnableRequest = userChargeEnableRequest;
    return this;
  }

   /**
   * Get userChargeEnableRequest
   * @return userChargeEnableRequest
  **/
  @ApiModelProperty(value = "")
  public Boolean isUserChargeEnableRequest() {
    return userChargeEnableRequest;
  }

  public void setUserChargeEnableRequest(Boolean userChargeEnableRequest) {
    this.userChargeEnableRequest = userChargeEnableRequest;
  }

  public ChargeState chargeEnableRequest(Boolean chargeEnableRequest) {
    this.chargeEnableRequest = chargeEnableRequest;
    return this;
  }

   /**
   * Get chargeEnableRequest
   * @return chargeEnableRequest
  **/
  @ApiModelProperty(value = "")
  public Boolean isChargeEnableRequest() {
    return chargeEnableRequest;
  }

  public void setChargeEnableRequest(Boolean chargeEnableRequest) {
    this.chargeEnableRequest = chargeEnableRequest;
  }

  public ChargeState chargerPhases(Integer chargerPhases) {
    this.chargerPhases = chargerPhases;
    return this;
  }

   /**
   * Get chargerPhases
   * @return chargerPhases
  **/
  @ApiModelProperty(value = "")
  public Integer getChargerPhases() {
    return chargerPhases;
  }

  public void setChargerPhases(Integer chargerPhases) {
    this.chargerPhases = chargerPhases;
  }

  public ChargeState chargePortLatch(String chargePortLatch) {
    this.chargePortLatch = chargePortLatch;
    return this;
  }

   /**
   * Get chargePortLatch
   * @return chargePortLatch
  **/
  @ApiModelProperty(value = "")
  public String getChargePortLatch() {
    return chargePortLatch;
  }

  public void setChargePortLatch(String chargePortLatch) {
    this.chargePortLatch = chargePortLatch;
  }

  public ChargeState chargeCurrentRequest(Integer chargeCurrentRequest) {
    this.chargeCurrentRequest = chargeCurrentRequest;
    return this;
  }

   /**
   * Get chargeCurrentRequest
   * @return chargeCurrentRequest
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeCurrentRequest() {
    return chargeCurrentRequest;
  }

  public void setChargeCurrentRequest(Integer chargeCurrentRequest) {
    this.chargeCurrentRequest = chargeCurrentRequest;
  }

  public ChargeState chargeCurrentRequestMax(Integer chargeCurrentRequestMax) {
    this.chargeCurrentRequestMax = chargeCurrentRequestMax;
    return this;
  }

   /**
   * Get chargeCurrentRequestMax
   * @return chargeCurrentRequestMax
  **/
  @ApiModelProperty(value = "")
  public Integer getChargeCurrentRequestMax() {
    return chargeCurrentRequestMax;
  }

  public void setChargeCurrentRequestMax(Integer chargeCurrentRequestMax) {
    this.chargeCurrentRequestMax = chargeCurrentRequestMax;
  }

  public ChargeState managedChargingActive(Boolean managedChargingActive) {
    this.managedChargingActive = managedChargingActive;
    return this;
  }

   /**
   * Get managedChargingActive
   * @return managedChargingActive
  **/
  @ApiModelProperty(value = "")
  public Boolean isManagedChargingActive() {
    return managedChargingActive;
  }

  public void setManagedChargingActive(Boolean managedChargingActive) {
    this.managedChargingActive = managedChargingActive;
  }

  public ChargeState managedChargingUserCanceled(Boolean managedChargingUserCanceled) {
    this.managedChargingUserCanceled = managedChargingUserCanceled;
    return this;
  }

   /**
   * Get managedChargingUserCanceled
   * @return managedChargingUserCanceled
  **/
  @ApiModelProperty(value = "")
  public Boolean isManagedChargingUserCanceled() {
    return managedChargingUserCanceled;
  }

  public void setManagedChargingUserCanceled(Boolean managedChargingUserCanceled) {
    this.managedChargingUserCanceled = managedChargingUserCanceled;
  }

  public ChargeState managedChargingStartTime(BigDecimal managedChargingStartTime) {
    this.managedChargingStartTime = managedChargingStartTime;
    return this;
  }

   /**
   * Get managedChargingStartTime
   * @return managedChargingStartTime
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getManagedChargingStartTime() {
    return managedChargingStartTime;
  }

  public void setManagedChargingStartTime(BigDecimal managedChargingStartTime) {
    this.managedChargingStartTime = managedChargingStartTime;
  }

  public ChargeState batteryHeaterOn(Boolean batteryHeaterOn) {
    this.batteryHeaterOn = batteryHeaterOn;
    return this;
  }

   /**
   * Get batteryHeaterOn
   * @return batteryHeaterOn
  **/
  @ApiModelProperty(value = "")
  public Boolean isBatteryHeaterOn() {
    return batteryHeaterOn;
  }

  public void setBatteryHeaterOn(Boolean batteryHeaterOn) {
    this.batteryHeaterOn = batteryHeaterOn;
  }

  public ChargeState notEnoughPowerToHeat(Boolean notEnoughPowerToHeat) {
    this.notEnoughPowerToHeat = notEnoughPowerToHeat;
    return this;
  }

   /**
   * Get notEnoughPowerToHeat
   * @return notEnoughPowerToHeat
  **/
  @ApiModelProperty(value = "")
  public Boolean isNotEnoughPowerToHeat() {
    return notEnoughPowerToHeat;
  }

  public void setNotEnoughPowerToHeat(Boolean notEnoughPowerToHeat) {
    this.notEnoughPowerToHeat = notEnoughPowerToHeat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargeState chargeState = (ChargeState) o;
    return Objects.equals(this.chargingState, chargeState.chargingState) &&
        Objects.equals(this.fastChargerType, chargeState.fastChargerType) &&
        Objects.equals(this.fastChargerBrand, chargeState.fastChargerBrand) &&
        Objects.equals(this.chargeLimitSoc, chargeState.chargeLimitSoc) &&
        Objects.equals(this.chargeLimitSocStd, chargeState.chargeLimitSocStd) &&
        Objects.equals(this.chargeLimitSocMin, chargeState.chargeLimitSocMin) &&
        Objects.equals(this.chargeLimitSocMax, chargeState.chargeLimitSocMax) &&
        Objects.equals(this.chargeToMaxRange, chargeState.chargeToMaxRange) &&
        Objects.equals(this.maxRangeChargeCounter, chargeState.maxRangeChargeCounter) &&
        Objects.equals(this.fastChargerPresent, chargeState.fastChargerPresent) &&
        Objects.equals(this.batteryRange, chargeState.batteryRange) &&
        Objects.equals(this.estBatteryRange, chargeState.estBatteryRange) &&
        Objects.equals(this.idealBatteryRange, chargeState.idealBatteryRange) &&
        Objects.equals(this.batteryLevel, chargeState.batteryLevel) &&
        Objects.equals(this.usableBatteryLevel, chargeState.usableBatteryLevel) &&
        Objects.equals(this.chargeEnergyAdded, chargeState.chargeEnergyAdded) &&
        Objects.equals(this.chargeMilesAddedRated, chargeState.chargeMilesAddedRated) &&
        Objects.equals(this.chargeMilesAddedIdeal, chargeState.chargeMilesAddedIdeal) &&
        Objects.equals(this.chargerVoltage, chargeState.chargerVoltage) &&
        Objects.equals(this.chargerPilotCurrent, chargeState.chargerPilotCurrent) &&
        Objects.equals(this.chargerActualCurrent, chargeState.chargerActualCurrent) &&
        Objects.equals(this.chargerPower, chargeState.chargerPower) &&
        Objects.equals(this.timeToFullCharge, chargeState.timeToFullCharge) &&
        Objects.equals(this.tripCharging, chargeState.tripCharging) &&
        Objects.equals(this.chargeRate, chargeState.chargeRate) &&
        Objects.equals(this.chargePortDoorOpen, chargeState.chargePortDoorOpen) &&
        Objects.equals(this.connChargeCable, chargeState.connChargeCable) &&
        Objects.equals(this.scheduledChargingStartTime, chargeState.scheduledChargingStartTime) &&
        Objects.equals(this.scheduledChargingPending, chargeState.scheduledChargingPending) &&
        Objects.equals(this.userChargeEnableRequest, chargeState.userChargeEnableRequest) &&
        Objects.equals(this.chargeEnableRequest, chargeState.chargeEnableRequest) &&
        Objects.equals(this.chargerPhases, chargeState.chargerPhases) &&
        Objects.equals(this.chargePortLatch, chargeState.chargePortLatch) &&
        Objects.equals(this.chargeCurrentRequest, chargeState.chargeCurrentRequest) &&
        Objects.equals(this.chargeCurrentRequestMax, chargeState.chargeCurrentRequestMax) &&
        Objects.equals(this.managedChargingActive, chargeState.managedChargingActive) &&
        Objects.equals(this.managedChargingUserCanceled, chargeState.managedChargingUserCanceled) &&
        Objects.equals(this.managedChargingStartTime, chargeState.managedChargingStartTime) &&
        Objects.equals(this.batteryHeaterOn, chargeState.batteryHeaterOn) &&
        Objects.equals(this.notEnoughPowerToHeat, chargeState.notEnoughPowerToHeat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargingState, fastChargerType, fastChargerBrand, chargeLimitSoc, chargeLimitSocStd, chargeLimitSocMin, chargeLimitSocMax, chargeToMaxRange, maxRangeChargeCounter, fastChargerPresent, batteryRange, estBatteryRange, idealBatteryRange, batteryLevel, usableBatteryLevel, chargeEnergyAdded, chargeMilesAddedRated, chargeMilesAddedIdeal, chargerVoltage, chargerPilotCurrent, chargerActualCurrent, chargerPower, timeToFullCharge, tripCharging, chargeRate, chargePortDoorOpen, connChargeCable, scheduledChargingStartTime, scheduledChargingPending, userChargeEnableRequest, chargeEnableRequest, chargerPhases, chargePortLatch, chargeCurrentRequest, chargeCurrentRequestMax, managedChargingActive, managedChargingUserCanceled, managedChargingStartTime, batteryHeaterOn, notEnoughPowerToHeat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargeState {\n");
    
    sb.append("    chargingState: ").append(toIndentedString(chargingState)).append("\n");
    sb.append("    fastChargerType: ").append(toIndentedString(fastChargerType)).append("\n");
    sb.append("    fastChargerBrand: ").append(toIndentedString(fastChargerBrand)).append("\n");
    sb.append("    chargeLimitSoc: ").append(toIndentedString(chargeLimitSoc)).append("\n");
    sb.append("    chargeLimitSocStd: ").append(toIndentedString(chargeLimitSocStd)).append("\n");
    sb.append("    chargeLimitSocMin: ").append(toIndentedString(chargeLimitSocMin)).append("\n");
    sb.append("    chargeLimitSocMax: ").append(toIndentedString(chargeLimitSocMax)).append("\n");
    sb.append("    chargeToMaxRange: ").append(toIndentedString(chargeToMaxRange)).append("\n");
    sb.append("    maxRangeChargeCounter: ").append(toIndentedString(maxRangeChargeCounter)).append("\n");
    sb.append("    fastChargerPresent: ").append(toIndentedString(fastChargerPresent)).append("\n");
    sb.append("    batteryRange: ").append(toIndentedString(batteryRange)).append("\n");
    sb.append("    estBatteryRange: ").append(toIndentedString(estBatteryRange)).append("\n");
    sb.append("    idealBatteryRange: ").append(toIndentedString(idealBatteryRange)).append("\n");
    sb.append("    batteryLevel: ").append(toIndentedString(batteryLevel)).append("\n");
    sb.append("    usableBatteryLevel: ").append(toIndentedString(usableBatteryLevel)).append("\n");
    sb.append("    chargeEnergyAdded: ").append(toIndentedString(chargeEnergyAdded)).append("\n");
    sb.append("    chargeMilesAddedRated: ").append(toIndentedString(chargeMilesAddedRated)).append("\n");
    sb.append("    chargeMilesAddedIdeal: ").append(toIndentedString(chargeMilesAddedIdeal)).append("\n");
    sb.append("    chargerVoltage: ").append(toIndentedString(chargerVoltage)).append("\n");
    sb.append("    chargerPilotCurrent: ").append(toIndentedString(chargerPilotCurrent)).append("\n");
    sb.append("    chargerActualCurrent: ").append(toIndentedString(chargerActualCurrent)).append("\n");
    sb.append("    chargerPower: ").append(toIndentedString(chargerPower)).append("\n");
    sb.append("    timeToFullCharge: ").append(toIndentedString(timeToFullCharge)).append("\n");
    sb.append("    tripCharging: ").append(toIndentedString(tripCharging)).append("\n");
    sb.append("    chargeRate: ").append(toIndentedString(chargeRate)).append("\n");
    sb.append("    chargePortDoorOpen: ").append(toIndentedString(chargePortDoorOpen)).append("\n");
    sb.append("    connChargeCable: ").append(toIndentedString(connChargeCable)).append("\n");
    sb.append("    scheduledChargingStartTime: ").append(toIndentedString(scheduledChargingStartTime)).append("\n");
    sb.append("    scheduledChargingPending: ").append(toIndentedString(scheduledChargingPending)).append("\n");
    sb.append("    userChargeEnableRequest: ").append(toIndentedString(userChargeEnableRequest)).append("\n");
    sb.append("    chargeEnableRequest: ").append(toIndentedString(chargeEnableRequest)).append("\n");
    sb.append("    chargerPhases: ").append(toIndentedString(chargerPhases)).append("\n");
    sb.append("    chargePortLatch: ").append(toIndentedString(chargePortLatch)).append("\n");
    sb.append("    chargeCurrentRequest: ").append(toIndentedString(chargeCurrentRequest)).append("\n");
    sb.append("    chargeCurrentRequestMax: ").append(toIndentedString(chargeCurrentRequestMax)).append("\n");
    sb.append("    managedChargingActive: ").append(toIndentedString(managedChargingActive)).append("\n");
    sb.append("    managedChargingUserCanceled: ").append(toIndentedString(managedChargingUserCanceled)).append("\n");
    sb.append("    managedChargingStartTime: ").append(toIndentedString(managedChargingStartTime)).append("\n");
    sb.append("    batteryHeaterOn: ").append(toIndentedString(batteryHeaterOn)).append("\n");
    sb.append("    notEnoughPowerToHeat: ").append(toIndentedString(notEnoughPowerToHeat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

