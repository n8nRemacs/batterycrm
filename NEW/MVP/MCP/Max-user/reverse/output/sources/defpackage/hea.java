package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class hea extends vt3 {
    public final ConnectivityManager f;
    public final as3 g;

    public hea(Context context, u5i u5iVar) {
        super(context, u5iVar);
        this.f = (ConnectivityManager) ((Context) this.b).getSystemService("connectivity");
        this.g = new as3(1, this);
    }

    @Override // defpackage.vt3
    public final Object i() {
        return iea.a(this.f);
    }

    @Override // defpackage.vt3
    public final void r() {
        try {
            cei.g().c(iea.a, "Registering network callback");
            zda.a(this.f, this.g);
        } catch (IllegalArgumentException e) {
            cei.g().f(iea.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            cei.g().f(iea.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.vt3
    public final void s() {
        try {
            cei.g().c(iea.a, "Unregistering network callback");
            xda.c(this.f, this.g);
        } catch (IllegalArgumentException e) {
            cei.g().f(iea.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            cei.g().f(iea.a, "Received exception while unregistering network callback", e2);
        }
    }
}
