package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes.dex */
public final /* synthetic */ class p06 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ n2g c;

    public /* synthetic */ p06(FirebaseMessaging firebaseMessaging, n2g n2gVar, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = n2gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                n2g n2gVar = this.c;
                n4e n4eVar = FirebaseMessaging.k;
                try {
                    n2gVar.b(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    n2gVar.a(e);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                n2g n2gVar2 = this.c;
                n4e n4eVar2 = FirebaseMessaging.k;
                try {
                    lz9 lz9Var = firebaseMessaging2.c;
                    lz9Var.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    n5e.a(lz9Var.f(lz9Var.j(f9h.b((h06) lz9Var.a), "*", bundle)));
                    n4e n4eVarD = FirebaseMessaging.d(firebaseMessaging2.b);
                    String strE = firebaseMessaging2.e();
                    String strB = f9h.b(firebaseMessaging2.a);
                    synchronized (n4eVarD) {
                        String strC = n4e.c(strE, strB);
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) n4eVarD.a).edit();
                        editorEdit.remove(strC);
                        editorEdit.commit();
                    }
                    n2gVar2.b(null);
                    return;
                } catch (Exception e2) {
                    n2gVar2.a(e2);
                    return;
                }
        }
    }
}
