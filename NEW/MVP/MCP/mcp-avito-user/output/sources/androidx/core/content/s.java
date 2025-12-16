package androidx.core.content;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.core.app.unusedapprestrictions.b;
import j.P;
import j.k0;

/* compiled from: UnusedAppRestrictionsBackportServiceConnection.java */
/* loaded from: classes.dex */
class s implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    @k0
    @P
    public androidx.core.app.unusedapprestrictions.b f44695b;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        androidx.core.app.unusedapprestrictions.b bVarE4 = b.AbstractBinderC1721b.e4(iBinder);
        this.f44695b = bVarE4;
        try {
            bVarE4.w1(new r(this));
        } catch (RemoteException unused) {
            throw null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
