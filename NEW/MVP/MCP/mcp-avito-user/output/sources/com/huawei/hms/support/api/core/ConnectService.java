package com.huawei.hms.support.api.core;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeReq;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public final class ConnectService {

    public static class a extends PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp> {
        @Override // com.huawei.hms.support.api.PendingResultImpl
        public final boolean checkApiClient(ApiClient apiClient) {
            return apiClient != null;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public final Result onComplete(IMessageEntity iMessageEntity) {
            ResolveResult resolveResult = new ResolveResult((ConnectResp) iMessageEntity);
            resolveResult.setStatus(Status.SUCCESS);
            HMSLog.d("connectservice", "connect - onComplete: success");
            return resolveResult;
        }
    }

    public static class b extends PendingResultImpl<ResolveResult<ConnectResp>, ConnectResp> {
        @Override // com.huawei.hms.support.api.PendingResultImpl
        public final boolean checkApiClient(ApiClient apiClient) {
            return apiClient != null;
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public final Result onComplete(IMessageEntity iMessageEntity) {
            ResolveResult resolveResult = new ResolveResult((ConnectResp) iMessageEntity);
            resolveResult.setStatus(Status.SUCCESS);
            HMSLog.d("connectservice", "forceConnect - onComplete: success");
            return resolveResult;
        }
    }

    public static class c extends PendingResultImpl<ResolveResult<JosGetNoticeResp>, JosGetNoticeResp> {
        @Override // com.huawei.hms.support.api.PendingResultImpl
        public final Result onComplete(IMessageEntity iMessageEntity) {
            JosGetNoticeResp josGetNoticeResp = (JosGetNoticeResp) iMessageEntity;
            if (josGetNoticeResp == null) {
                HMSLog.e("connectservice", "JosNoticeResp is null");
                return null;
            }
            HMSLog.i("connectservice", "josNoticeResp status code :" + josGetNoticeResp.getStatusCode());
            ResolveResult resolveResult = new ResolveResult(josGetNoticeResp);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    private ConnectService() {
    }

    public static InnerPendingResult<ResolveResult<CheckConnectResp>> checkconnect(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.CHECKCONNECT, checkConnectInfo, CheckConnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> connect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new a(apiClient, CoreNaming.CONNECT, connectInfo);
    }

    public static ResolvePendingResult<DisconnectResp> disconnect(ApiClient apiClient, DisconnectInfo disconnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.DISCONNECT, disconnectInfo, DisconnectResp.class);
    }

    public static PendingResult<ResolveResult<ConnectResp>> forceConnect(ApiClient apiClient, ConnectInfo connectInfo) {
        return new b(apiClient, CoreNaming.FORECONNECT, connectInfo);
    }

    public static PendingResult<ResolveResult<JosGetNoticeResp>> getNotice(ApiClient apiClient, int i12, String str) {
        JosGetNoticeReq josGetNoticeReq = new JosGetNoticeReq();
        josGetNoticeReq.setNoticeType(i12);
        josGetNoticeReq.setHmsSdkVersionName(str);
        if (!TextUtils.isEmpty(apiClient.getCpID())) {
            josGetNoticeReq.setCpID(apiClient.getCpID());
        }
        return new c(apiClient, CoreNaming.GETNOTICE, josGetNoticeReq);
    }
}
