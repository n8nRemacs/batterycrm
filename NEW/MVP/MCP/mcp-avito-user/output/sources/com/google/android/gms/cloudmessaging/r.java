package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import j.P;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final Messenger f348837a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final zzd f348838b;

    public r(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f348837a = new Messenger(iBinder);
            this.f348838b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f348838b = new zzd(iBinder);
            this.f348837a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            if (strValueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(strValueOf);
            }
            throw new RemoteException();
        }
    }
}
