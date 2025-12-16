package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class o06 implements vva {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ o06(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    @Override // defpackage.vva
    public final void a(Object obj) throws NumberFormatException {
        boolean z;
        switch (this.a) {
            case 0:
                jdg jdgVar = (jdg) obj;
                if (!this.b.e.i() || jdgVar.h.a() == null) {
                    return;
                }
                synchronized (jdgVar) {
                    z = jdgVar.g;
                }
                if (z) {
                    return;
                }
                jdgVar.f(0L);
                return;
            default:
                FirebaseMessaging firebaseMessaging = this.b;
                yc3 yc3Var = (yc3) obj;
                n4e n4eVar = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                if (yc3Var != null) {
                    qwi.b(yc3Var.a);
                    firebaseMessaging.g();
                    return;
                }
                return;
        }
    }
}
