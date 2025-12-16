package B01;

import com.huawei.hmf.tasks.l;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import n01.C44163a;

/* compiled from: BaseVoidTask.java */
/* loaded from: classes7.dex */
public class a extends TaskApiCall<C44163a, Void> {
    public void a(C44163a c44163a, ResponseErrorCode responseErrorCode, l lVar) {
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("BaseVoidTask", "Operate succeed");
            lVar.b(null);
        } else {
            HMSLog.e("BaseVoidTask", "Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumA = ErrorEnum.a(responseErrorCode.getErrorCode());
            if (errorEnumA != ErrorEnum.ERROR_UNKNOWN) {
                lVar.a(errorEnumA.b());
            } else {
                lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public /* bridge */ /* synthetic */ void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, l<Void> lVar) {
        a((C44163a) anyClient, responseErrorCode, lVar);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public int getMinApkVersion() {
        return 30000000;
    }
}
