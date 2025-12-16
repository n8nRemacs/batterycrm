package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.e;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes7.dex */
public class IPCCallback extends c.a {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? extends IMessageEntity> f363317a;

    /* renamed from: b, reason: collision with root package name */
    private final DatagramTransport.a f363318b;

    public IPCCallback(Class<? extends IMessageEntity> cls, DatagramTransport.a aVar) {
        this.f363317a = cls;
        this.f363318b = aVar;
    }

    @Override // com.huawei.hms.core.aidl.c
    public void call(com.huawei.hms.core.aidl.b bVar) throws RemoteException {
        IMessageEntity iMessageEntityNewResponseInstance;
        if (bVar == null || TextUtils.isEmpty(bVar.f363445a)) {
            HMSLog.e("IPCCallback", "In call, URI cannot be empty.");
            throw new RemoteException();
        }
        e eVarA = com.huawei.hms.core.aidl.a.a(bVar.c());
        if (bVar.b() > 0) {
            iMessageEntityNewResponseInstance = newResponseInstance();
            if (iMessageEntityNewResponseInstance != null) {
                eVarA.a(bVar.a(), iMessageEntityNewResponseInstance);
            }
        } else {
            iMessageEntityNewResponseInstance = null;
        }
        if (bVar.f363446b == null) {
            this.f363318b.a(0, iMessageEntityNewResponseInstance);
            return;
        }
        ResponseHeader responseHeader = new ResponseHeader();
        eVarA.a(bVar.f363446b, responseHeader);
        this.f363318b.a(responseHeader.getStatusCode(), iMessageEntityNewResponseInstance);
    }

    public IMessageEntity newResponseInstance() {
        Class<? extends IMessageEntity> cls = this.f363317a;
        if (cls == null) {
            return null;
        }
        try {
            return cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e12) {
            HMSLog.e("IPCCallback", "In newResponseInstance, instancing exception." + e12.getMessage());
            return null;
        }
    }
}
