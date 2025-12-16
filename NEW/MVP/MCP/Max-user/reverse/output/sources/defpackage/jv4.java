package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class jv4 implements yfe {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jv4(Object obj, int i, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.yfe
    public final void a() {
        switch (this.d) {
            case 0:
                lv4 lv4Var = (lv4) this.e;
                if (((lv4) ((WeakReference) this.f).get()) != null) {
                    lv4Var.e.reset();
                    break;
                }
                break;
            default:
                s7j.a((Context) this.e, (z7c) this.f);
                break;
        }
    }
}
