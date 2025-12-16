package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class dqf extends y0f {
    public final cqf o;

    public dqf(cqf cqfVar, ExecutorService executorService) {
        super(executorService);
        this.o = cqfVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, k18] */
    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(gqf gqfVar, int i) {
        fqf fqfVar = (fqf) ((t98) C(i));
        v0b v0bVar = (v0b) gqfVar.a;
        v0bVar.setId(mab.B);
        CharSequence charSequence = fqfVar.b;
        v0bVar.setTitle(charSequence);
        v0bVar.setSubtitle(fqfVar.d);
        int i2 = fqfVar.Y;
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 1 || i2 == 2) {
            v0bVar.g(fqfVar.a, charSequence, fqfVar.c);
        } else {
            ?? r0 = v0bVar.b;
            if (r0.e()) {
                ((uxa) r0.getValue()).setVisibility(8);
            }
        }
        boolean zIsEmpty = fqfVar.X.isEmpty();
        cqf cqfVar = this.o;
        if (zIsEmpty) {
            v0bVar.i(null, (4 & 2) != 0 ? iza.b : iza.d, gza.c, null);
        } else {
            v0bVar.i(Integer.valueOf(lab.a), (4 & 2) != 0 ? iza.b : iza.d, gza.c, new da1(cqfVar, v0bVar, fqfVar, 18));
        }
        f8j.d(v0bVar, 300L, new wfe(cqfVar, 15, fqfVar));
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new gqf(new v0b(viewGroup.getContext(), false));
    }
}
