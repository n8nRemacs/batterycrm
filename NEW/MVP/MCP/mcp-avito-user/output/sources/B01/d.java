package B01;

import android.content.Intent;
import android.os.Bundle;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
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
import z01.g;

/* compiled from: SendUpStreamTask.java */
/* loaded from: classes7.dex */
public class d extends TaskApiCall<C44163a, a> {
    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, l<a> lVar) {
        C44163a c44163a = (C44163a) anyClient;
        if (responseErrorCode.getErrorCode() == 0) {
            HMSLog.i("SendUpStreamTask", "send up stream task,Operate succeed");
            lVar.b(null);
        } else {
            HMSLog.e("SendUpStreamTask", "send up stream task,Operate failed with ret=" + responseErrorCode.getErrorCode());
            ErrorEnum errorEnumA = ErrorEnum.a(responseErrorCode.getErrorCode());
            if (errorEnumA != ErrorEnum.ERROR_UNKNOWN) {
                lVar.a(errorEnumA.b());
            } else {
                lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            }
        }
        HMSLog.i("SendUpStreamTask", "receive upstream, msgId :null , packageName = null , errorCode = " + responseErrorCode.getErrorCode());
        Intent intent = new Intent("com.huawei.push.action.MESSAGING_EVENT");
        intent.setPackage(null);
        Bundle bundleM = com.avito.android.actions_sheet.a.m(MessageSuggest.MESSAGE_ID, null);
        bundleM.putInt("error", responseErrorCode.getErrorCode());
        ErrorEnum errorEnum = ErrorEnum.SUCCESS;
        if (responseErrorCode.getErrorCode() == 0) {
            bundleM.putString("message_type", "sent_message");
        } else {
            bundleM.putString("message_type", "send_error");
        }
        if (new g().a(c44163a.getContext(), intent, bundleM)) {
            HMSLog.i("SendUpStreamTask", "receive upstream, start service success");
            HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
        } else {
            HMSLog.w("SendUpStreamTask", "receive upstream, start service failed");
            HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), Status.SUCCESS.getStatusCode(), 907122052, 60300301);
        }
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getMinApkVersion() {
        return 40003000;
    }
}
