package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.e;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class IPCTransport implements DatagramTransport {

    /* renamed from: a, reason: collision with root package name */
    private final String f363319a;

    /* renamed from: b, reason: collision with root package name */
    private final IMessageEntity f363320b;

    /* renamed from: c, reason: collision with root package name */
    private final Class<? extends IMessageEntity> f363321c;

    /* renamed from: d, reason: collision with root package name */
    private int f363322d;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.f363319a = str;
        this.f363320b = iMessageEntity;
        this.f363321c = cls;
    }

    private int a(ApiClient apiClient, c cVar) {
        if (!(apiClient instanceof HuaweiApiClientImpl)) {
            if (apiClient instanceof AidlApiClient) {
                AidlApiClient aidlApiClient = (AidlApiClient) apiClient;
                com.huawei.hms.core.aidl.b bVar = new com.huawei.hms.core.aidl.b(this.f363319a, ProtocolNegotiate.getInstance().getVersion());
                bVar.a(com.huawei.hms.core.aidl.a.a(bVar.c()).a(this.f363320b, new Bundle()));
                try {
                    aidlApiClient.getService().a(bVar, cVar);
                    return 0;
                } catch (Exception e12) {
                    HMSLog.e("IPCTransport", "sync call ex:" + e12);
                }
            }
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
        com.huawei.hms.core.aidl.b bVar2 = new com.huawei.hms.core.aidl.b(this.f363319a, ProtocolNegotiate.getInstance().getVersion());
        e eVarA = com.huawei.hms.core.aidl.a.a(bVar2.c());
        bVar2.a(eVarA.a(this.f363320b, new Bundle()));
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAppID(apiClient.getAppID());
        requestHeader.setPackageName(apiClient.getPackageName());
        requestHeader.setSdkVersion(60300303);
        requestHeader.setApiNameList(((HuaweiApiClientImpl) apiClient).getApiNameList());
        requestHeader.setSessionId(apiClient.getSessionId());
        requestHeader.setApiLevel(this.f363322d);
        bVar2.f363446b = eVarA.a(requestHeader, new Bundle());
        try {
            HuaweiApiClientImpl huaweiApiClientImpl = (HuaweiApiClientImpl) apiClient;
            if (huaweiApiClientImpl.getService() == null) {
                HMSLog.e("IPCTransport", "HuaweiApiClient is not binded to service yet.");
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
            huaweiApiClientImpl.getService().a(bVar2, cVar);
            return 0;
        } catch (Exception e13) {
            HMSLog.e("IPCTransport", "sync call ex:" + e13);
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.a aVar) {
        send(apiClient, aVar);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.a aVar) {
        int iA2 = a(apiClient, new IPCCallback(this.f363321c, aVar));
        if (iA2 != 0) {
            aVar.a(iA2, null);
        }
    }

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls, int i12) {
        this.f363319a = str;
        this.f363320b = iMessageEntity;
        this.f363321c = cls;
        this.f363322d = i12;
    }
}
