package y01;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.opendevice.OdidResp;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: HuaweiOpendeviceApiImpl.java */
/* loaded from: classes7.dex */
public class y extends PendingResultImpl<G01.d, OdidResp> {
    @Override // com.huawei.hms.support.api.PendingResultImpl
    public final Result onComplete(IMessageEntity iMessageEntity) {
        OdidResp odidResp = (OdidResp) iMessageEntity;
        if (odidResp == null) {
            HMSLog.e("OpenIdentifierApiImpl", "getOdid OaidResp is null");
            return null;
        }
        Status commonStatus = odidResp.getCommonStatus();
        if (commonStatus == null) {
            HMSLog.e("OpenIdentifierApiImpl", "getOdid commonStatus is null");
            return null;
        }
        HMSLog.i("OpenIdentifierApiImpl", "getOdid onComplete:" + commonStatus.getStatusCode());
        G01.d dVar = new G01.d();
        dVar.setStatus(commonStatus);
        odidResp.getId();
        return dVar;
    }
}
