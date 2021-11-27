package com.bluescript.demo.repository;

import com.bluescript.demo.entity.KsdsPolyEntity;
import com.bluescript.demo.model.WfPolicyInfo;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface KsdspolyRepository extends JpaRepository<KsdsPolyEntity, String> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO KSDSPOLY (REQUESTID,CUSTOMERNUM,POLICYNUM,BPOSTCODE, BSTATUS, BCUSTOMER, EWITH_PROFITS, EEQUITIES, EMANAGED_FUND, EFUND_NAME, ELIFE_ASSURED, HPROPERTY_TYPE, HBEDROOMS, HVALUE, HPOSTCODE, HHOUSE_NAME, MMAKE, MMODEL, FMVALU, FMREGNUMBER ) VALUES (:wfRequestId,:wfCustomerNum,:wfPolicyNum, :wfBPostcode,:wfBStatus, :wfBCustomer,     :wfEWithProfits, :wfEEquities, :wfEManagedFund,:wfEFundName, :wfELifeAssured, :wfHPropertyType,     :wfHBedrooms, :wfHValue,:wfHPostcode, :wfHHouseName,:WfMMake,:wfMModel,:wfMValue, :wfMRegnumber)", nativeQuery = true)

    void saveKsdsPoly(@Param("wfRequestId") String wfRequestId, @Param("wfCustomerNum") String wfCustomerNum,
            @Param("wfPolicyNum") String wfPolicyNum, @Param("wfBPostcode") String wfBPostcode,
            @Param("wfBStatus") int wfBStatus, @Param("wfBCustomer") String wfBCustomer,
            @Param("wfEWithProfits") String wfEWithProfits, @Param("wfEEquities") String wfEEquities,
            @Param("wfEManagedFund") String wfEManagedFund, @Param("wfEFundName") String wfEFundName,
            @Param("wfELifeAssured") String wfELifeAssured, @Param("wfHPropertyType") String wfHPropertyType,
            @Param("wfHBedrooms") int wfHBedrooms, @Param("wfHValue") int wfHValue,
            @Param("wfHPostcode") String wfHPostcode, @Param("wfHHouseName") String wfHHouseName,
            @Param("WfMMake") String WfMMake, @Param("wfMModel") String wfMModel, @Param("wfMValue") int wfMValue,
            @Param("wfMRegnumber") String wfMRegnumber);

    // void saveKsdsPoly(String wfRequestId, String wfPolicyNum, String wfCustomerNum, String wfBPostcode, int
    // wfBStatus,String wfBCustomer, String wfEWithProfits, String wfEEquities, String wfEManagedFund, String
    // wfEFundName,String wfELifeAssured, String wfHPropertyType, int wfHBedrooms, int wfHValue, String
    // wfHPostcode,String wfHHouseName, String wfMMake, String wfMModel, int wfMValue, String wfMRegnumber);

}