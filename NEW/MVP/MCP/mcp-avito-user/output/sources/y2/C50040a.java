package y2;

import android.content.ComponentName;
import android.os.RemoteException;
import androidx.browser.customtabs.f;
import androidx.browser.customtabs.k;

/* renamed from: y2.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50040a extends k {

    /* renamed from: b, reason: collision with root package name */
    public boolean f442860b;

    @Override // androidx.browser.customtabs.k
    public final void onCustomTabsServiceConnected(ComponentName componentName, f fVar) {
        try {
            fVar.getClass();
            try {
                fVar.f22862a.B2(0L);
            } catch (RemoteException unused) {
            }
            this.f442860b = true;
        } catch (Exception e12) {
            e12.getMessage();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f442860b = false;
    }
}
