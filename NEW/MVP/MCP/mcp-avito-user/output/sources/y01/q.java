package y01;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.aaid.constant.ErrorEnum;
import com.huawei.hms.aaid.entity.TokenReq;
import com.huawei.hms.aaid.entity.TokenResp;
import com.huawei.hms.aaid.entity.TokenResult;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.ResolvableApiException;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import n01.C44163a;

/* compiled from: GetTokenTask.java */
/* loaded from: classes7.dex */
public class q extends TaskApiCall<C44163a, TokenResult> {

    /* renamed from: a, reason: collision with root package name */
    public Context f442831a;

    /* renamed from: b, reason: collision with root package name */
    public TokenReq f442832b;

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final void doExecute(AnyClient anyClient, ResponseErrorCode responseErrorCode, String str, com.huawei.hmf.tasks.l<TokenResult> lVar) {
        C44163a c44163a = (C44163a) anyClient;
        if (responseErrorCode.getErrorCode() != 0) {
            HMSLog.e("HmsInstanceId", "TokenTask failed, ErrorCode:" + responseErrorCode.getErrorCode());
            if (responseErrorCode.hasResolution()) {
                HMSLog.e("HmsInstanceId", "has resolution start hms update by user");
                lVar.a(new ResolvableApiException(responseErrorCode));
            } else {
                ErrorEnum errorEnumA = ErrorEnum.a(responseErrorCode.getErrorCode());
                if (errorEnumA != ErrorEnum.ERROR_UNKNOWN) {
                    lVar.a(errorEnumA.b());
                } else {
                    lVar.a(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                }
            }
        } else {
            TokenResp tokenResp = (TokenResp) JsonUtil.jsonToEntity(str, new TokenResp());
            ErrorEnum errorEnumA2 = ErrorEnum.a(tokenResp.getRetCode());
            if (errorEnumA2 != ErrorEnum.SUCCESS) {
                lVar.a(errorEnumA2.b());
                HMSLog.e("HmsInstanceId", "TokenTask failed, StatusCode:" + errorEnumA2.f363222c);
            } else {
                TokenResult tokenResult = new TokenResult();
                tokenResult.setToken(tokenResp.getToken());
                tokenResult.setBelongId(tokenResp.getBelongId());
                tokenResult.setRetCode(ErrorEnum.a(tokenResp.getRetCode()).f363222c);
                lVar.b(tokenResult);
                String token = tokenResp.getToken();
                if (TextUtils.isEmpty(token)) {
                    HMSLog.i("HmsInstanceId", "GetTokenTask receive a empty token, please check HmsMessageService.onNewToken receive result.");
                    HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
                    return;
                }
                String subjectId = this.f442832b.getSubjectId();
                Context context = this.f442831a;
                if (!n.g(context).i(subjectId).equals(token)) {
                    HMSLog.i("HmsInstanceId", "receive a token, refresh the local token");
                    n nVar = new n(context, "push_client_self_info");
                    nVar.f442830b = context;
                    nVar.j(subjectId, token);
                }
                new r(context, token).start();
            }
        }
        HiAnalyticsClient.reportExit(c44163a.getContext(), getUri(), responseErrorCode.getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), 60300301);
    }

    @Override // com.huawei.hms.common.internal.TaskApiCall
    public final int getMinApkVersion() {
        return this.f442832b.isMultiSender() ? 50004300 : 30000000;
    }
}
