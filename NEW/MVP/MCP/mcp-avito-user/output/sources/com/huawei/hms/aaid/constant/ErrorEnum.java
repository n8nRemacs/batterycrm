package com.huawei.hms.aaid.constant;

import android.util.SparseArray;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* loaded from: classes7.dex */
public enum ErrorEnum {
    SUCCESS(0, 0, 0),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_TOKEN(1, 800000000, 907122030),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(2, 800000001, 907122032),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_NETWORK(3, 800000002, 907122031),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(4, 800000003, 907122046),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PUSH_SERVER(5, 800000004, 907122047),
    ERROR_UNKNOWN(6, 800000005, 907122045),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_RIGHT(7, 800100000, 907122036),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(8, 800100001, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_LENGTH(9, 800100002, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(10, 800100003, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PARAM_INVALID(11, 800100004, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(12, 800100005, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NOT_ALLOW_CROSS_APPLY(13, 800100006, 907122053),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(14, 800100007, 907122039),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_TOKEN_DECRYPT(15, 800200001, 907122032),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(16, 800200002, 907122032),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_TOPIC_EXCEED(17, 800200003, 907122034),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(18, 800200004, 907122035),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_STORAGE_LOCATION_EMPTY(19, 800200005, 907122038),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(20, 800300000, 907122041),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_INVALID_PARAMETERS(21, 800300001, 907122042),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(22, 800300002, 907122043),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_TTL_EXCEEDED(23, 800300003, 907122044),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(24, 800300004, 907122032),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_UPSTREAM_TOKENSIGN_VALID(25, 800300005, 907122032),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(26, 800300006, 907122057),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_UPSTREAM_STORAGE_LOCATION_EMPTY(27, 800300007, 907122038),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(28, 800300008, 907122058),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_MSG_CACHE(29, 800300009, 907122059),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(30, 800300010, 907122060),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_OVER_FLOW_CONTROL_SIZE(31, 800300011, 907122061),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(32, 807135000, CommonCode.ErrorCode.ARGUMENTS_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PUSH_INTERNAL_ERROR(33, 807135001, CommonCode.ErrorCode.INTERNAL_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(34, 807135002, CommonCode.ErrorCode.NAMING_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PUSH_CLIENT_API_INVALID(35, 807135003, CommonCode.ErrorCode.CLIENT_API_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(36, 807135004, CommonCode.ErrorCode.EXECUTE_TIMEOUT),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PUSH_NOT_IN_SERVICE(37, 807135005, CommonCode.ErrorCode.NOT_IN_SERVICE),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(38, 807135006, CommonCode.ErrorCode.SESSION_INVALID),
    ERROR_ARGUMENTS_INVALID(39, CommonCode.ErrorCode.ARGUMENTS_INVALID, CommonCode.ErrorCode.ARGUMENTS_INVALID),
    ERROR_INTERNAL_ERROR(40, CommonCode.ErrorCode.INTERNAL_ERROR, CommonCode.ErrorCode.INTERNAL_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_AUTH_INFO_NOT_EXIST(41, CommonCode.ErrorCode.NAMING_INVALID, CommonCode.ErrorCode.NAMING_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(42, CommonCode.ErrorCode.CLIENT_API_INVALID, CommonCode.ErrorCode.CLIENT_API_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_EXECUTE_TIMEOUT(43, CommonCode.ErrorCode.EXECUTE_TIMEOUT, CommonCode.ErrorCode.EXECUTE_TIMEOUT),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(44, CommonCode.ErrorCode.NOT_IN_SERVICE, CommonCode.ErrorCode.NOT_IN_SERVICE),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SESSION_INVALID(45, CommonCode.ErrorCode.SESSION_INVALID, CommonCode.ErrorCode.SESSION_INVALID),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(46, 1002, 1002),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_GET_SCOPE_ERROR(47, AuthCode.ErrorCode.GET_SCOPE_ERROR, AuthCode.ErrorCode.GET_SCOPE_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(48, AuthCode.ErrorCode.SCOPE_LIST_EMPTY, AuthCode.ErrorCode.SCOPE_LIST_EMPTY),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_CERT_FINGERPRINT_EMPTY(49, AuthCode.ErrorCode.CERT_FINGERPRINT_EMPTY, AuthCode.ErrorCode.CERT_FINGERPRINT_EMPTY),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(50, AuthCode.ErrorCode.PERMISSION_LIST_EMPTY, AuthCode.ErrorCode.PERMISSION_LIST_EMPTY),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_AUTH_INFO_NOT_EXIST(51, AuthCode.StatusCode.AUTH_INFO_NOT_EXIST, AuthCode.StatusCode.AUTH_INFO_NOT_EXIST),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(52, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PERMISSION_NOT_EXIST(53, AuthCode.StatusCode.PERMISSION_NOT_EXIST, AuthCode.StatusCode.PERMISSION_NOT_EXIST),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(54, AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED, AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PERMISSION_EXPIRED(55, AuthCode.StatusCode.PERMISSION_EXPIRED, AuthCode.StatusCode.PERMISSION_EXPIRED),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(56, 907122005, 907122031),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_NO_RIGHT_SELF_MAPPING(57, 907122011, 907122036),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(58, 907122012, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_LENGTH_OLD(59, 907122013, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(60, 907122014, 907122037),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PUSH_SERVER_OLD(61, 907122017, 907122047),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(62, 907122019, 907122030),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_HMS_CLIENT_API(63, 907122048, 907122048),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(64, 907122049, 907122049),
    ERROR_MAIN_THREAD(65, 907122050, 907122050),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_HMS_DEVICE_AUTH_FAILED_SELF_MAPPING(66, 907122051, 907122051),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(67, 907122052, 907122052),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_AUTO_INITIALIZING(68, 907122054, 907122054),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(69, 907122055, 907122055),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_SEND_SELF_MAPPING(70, 907122056, 907122056),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(71, 907122064, 907122064),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_RESTRICT_GET_TOKEN(72, 800100014, 907122065),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(73, 907122101, 907122101),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_DELETE_3RD_PARTY_TOKEN_FAILED(74, 907122102, 907122102),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(75, 907122103, 907122103),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_FETCH_DOMAIN_FAILED(76, 907135104, 907135104),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(77, 907122105, 907122105),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_HWID_NOT_LOGIN(78, 907122066, 907122066),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_PROFILE_EXCEED(79, 800400000, 907122067),
    ERROR_OPER_IN_CHILD_PROCESS(80, 907122068, 907122068);


    /* renamed from: k, reason: collision with root package name */
    public static final SparseArray<ErrorEnum> f363219k = new SparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    public final int f363221b;

    /* renamed from: c, reason: collision with root package name */
    public final int f363222c;

    /* renamed from: d, reason: collision with root package name */
    public final String f363223d;

    static {
        for (ErrorEnum errorEnum : values()) {
            SparseArray<ErrorEnum> sparseArray = f363219k;
            sparseArray.put(errorEnum.f363221b, errorEnum);
            sparseArray.put(errorEnum.f363222c, errorEnum);
        }
    }

    ErrorEnum(int i12, int i13, int i14) {
        this.f363221b = i13;
        this.f363222c = i14;
        this.f363223d = str;
    }

    public static ErrorEnum a(int i12) {
        return f363219k.get(i12, ERROR_UNKNOWN);
    }

    public final ApiException b() {
        return new ApiException(new Status(this.f363222c, this.f363223d));
    }
}
