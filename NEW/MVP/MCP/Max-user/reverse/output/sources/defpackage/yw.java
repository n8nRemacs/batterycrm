package defpackage;

import android.view.Surface;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class yw implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uid b;

    public /* synthetic */ yw(uid uidVar, int i) {
        this.a = i;
        this.b = uidVar;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((ArrayList) this.b.a).add((si9) obj);
                return qqg.a;
            case 1:
                ku3 ku3Var = (ku3) obj;
                uid uidVar = this.b;
                return ((hf9) uidVar.a).B(new ar2(po8.r(ku3Var), po8.k(((f8c) ((hf9) uidVar.a).x0.getValue()).a(ku3Var.p())), 0L));
            default:
                this.b.a = (Surface) obj;
                return qqg.a;
        }
    }
}
