package y01;

import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.DeleteTokenResp;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import n01.C44163a;

/* compiled from: DeleteTokenTask.java */
/* loaded from: classes7.dex */
public class p extends TaskApiCall<C44163a, Void> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, com.huawei.hmf.tasks.l<Void> lVar) {
        C44163a c44163a = (C44163a) anyClient;
        if (responseErrorCode.getErrorCode() == 0) {
            ErrorEnum errorEnumA = ErrorEnum.a(((DeleteTokenResp) JsonUtil.jsonToEntity(str, new DeleteTokenResp())).getRetCode());
            if (errorEnumA != ErrorEnum.SUCCESS) {
                lVar.a(errorEnumA.b());
                return;
            } else {
                lVar.b(null);
                HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
                return;
            }
        }
        HMSLog.e("HmsInstanceId", "DeleteTokenTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
        ErrorEnum errorEnumA2 = ErrorEnum.a(responseErrorCode.getErrorCode());
        if (errorEnumA2 != ErrorEnum.ERROR_UNKNOWN) {
            lVar.a(errorEnumA2.b());
        } else {
            lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getMinApkVersion() {
        throw null;
    }
}
