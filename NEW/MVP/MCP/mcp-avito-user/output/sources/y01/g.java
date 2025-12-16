package y01;

import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.opendevice.OdidResp;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;

/* compiled from: OpenDeviceTaskApiCall.java */
/* loaded from: classes7.dex */
public class g extends TaskApiCall<C50033d, G01.d> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, com.huawei.hmf.tasks.l<G01.d> lVar) throws IllegalArgumentException {
        C50033d c50033d = (C50033d) anyClient;
        if (responseErrorCode == null) {
            lVar.a(new ApiException(new Status(1)));
            return;
        }
        HiAnalyticsClient.reportExit(c50033d.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.i("OpenDeviceTaskApiCall", "onResult, returnCode: " + responseErrorCode.getErrorCode());
            lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            return;
        }
        HMSLog.i("OpenDeviceTaskApiCall", "onResult, success");
        OdidResp odidResp = new OdidResp();
        JsonUtil.jsonToEntity(str, odidResp);
        G01.d dVar = new G01.d();
        odidResp.getId();
        dVar.setStatus(new Status(0));
        lVar.b(dVar);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getApiLevel() {
        return 2;
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getMinApkVersion() {
        return 50002300;
    }
}
