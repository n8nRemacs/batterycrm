package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class dc6 extends y0f {
    public final fc6 X;
    public final t9f Y;
    public final jx0 o;

    public dc6(ExecutorService executorService, jx0 jx0Var, fc6 fc6Var, t9f t9fVar) {
        super(executorService);
        this.o = jx0Var;
        this.X = fc6Var;
        this.Y = t9fVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(hxg hxgVar, int i) {
        fxg fxgVar = (fxg) ((t98) C(i));
        View view = hxgVar.a;
        gxg gxgVar = (gxg) view;
        gxgVar.setType(fxgVar.b);
        CharSequence charSequenceA = fxgVar.c.a(hxgVar);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        gxgVar.setTitle(charSequenceA);
        hxgVar.E0 = this.Y;
        exg exgVar = fxgVar.b;
        if (exgVar == exg.a) {
            ((gxg) view).setOnClickListener(null);
        } else {
            f8j.d(view, 300L, new ta6(this.o, fxgVar, 1));
        }
        if (exgVar == exg.b) {
            gxg gxgVar2 = (gxg) view;
            gxgVar2.setOnDragIconTouchListener(new qk(24, hxgVar));
            gxgVar2.setActionMenuIconClickListener(new uv1(this.X, fxgVar, hxgVar, 11));
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        int iOrdinal = ((fxg) ((t98) C(i))).b.ordinal();
        if (iOrdinal == 0) {
            return d5b.h;
        }
        if (iOrdinal == 1) {
            return d5b.p;
        }
        if (iOrdinal == 2) {
            return d5b.i;
        }
        if (iOrdinal == 3) {
            return d5b.l;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        exg exgVar;
        if (i == d5b.h) {
            exgVar = exg.a;
        } else if (i == d5b.p) {
            exgVar = exg.b;
        } else if (i == d5b.i) {
            exgVar = exg.c;
        } else {
            if (i != d5b.l) {
                throw new IllegalStateException(ho7.f(i, "Unknown viewtype in "));
            }
            exgVar = exg.d;
        }
        return new hxg(new gxg(exgVar, viewGroup.getContext()));
    }
}
