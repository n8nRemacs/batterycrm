package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* loaded from: classes2.dex */
public final class vw6 implements alf {
    public final Context a;
    public final bwf c;
    public final String b = vw6.class.getName();
    public int d = -1;
    public int e = -1;
    public final String f = "Google Play Services";
    public final mk3 g = new mk3();

    public vw6(Context context, k18 k18Var, k18 k18Var2, tsd tsdVar, lzf lzfVar) {
        this.a = context;
        this.c = new bwf(new da1(this, k18Var2, k18Var, 7));
        svi.e(tsdVar, ((q2b) lzfVar).a(), null, new uw6(this, k18Var2, null), 2);
    }

    public final boolean a() {
        if (this.d == -1) {
            this.d = tv6.d.c(this.a, uv6.a);
        }
        return this.d == 0;
    }

    public final Object b(oxf oxfVar) {
        if (!a()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        lwd lwdVar = new lwd(hni.f(oxfVar));
        FirebaseMessaging firebaseMessagingC = FirebaseMessaging.c();
        firebaseMessagingC.getClass();
        n2g n2gVar = new n2g();
        firebaseMessagingC.f.execute(new p06(firebaseMessagingC, n2gVar, 0));
        n2gVar.a.i(new s7c(this, lwdVar));
        return lwdVar.a();
    }
}
