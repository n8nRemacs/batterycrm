package B01;

import com.huawei.hmf.tasks.l;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import n01.C44163a;

/* compiled from: ProfileTask.java */
/* loaded from: classes7.dex */
public class c extends a {
    @Override // B01.a
    public final void a(C44163a c44163a, ResponseErrorCode responseErrorCode, l lVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("HmsInstanceId", "ProfileTask success.");
            lVar.b(null);
        } else {
            HMSLog.e("HmsInstanceId", "ProfileTask failed, ErrorCode: " + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumA = ErrorEnum.a(responseErrorCode.getErrorCode());
            if (errorEnumA != ErrorEnum.ERROR_UNKNOWN) {
                lVar.a(errorEnumA.b());
            } else {
                lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
    }

    @Override // B01.a, com.huawei.hms.common.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, l<Void> lVar) {
        a((C44163a) anyClient, responseErrorCode, lVar);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getApiLevel() {
        return 2;
    }

    @Override // B01.a, com.huawei.hms.common.internal.TaskApiCall
    public final int getMinApkVersion() {
        return 50004300;
    }
}
