package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import one.me.main.MainScreen;

/* loaded from: classes2.dex */
public final class cm8 extends dtf implements sm6 {
    public final /* synthetic */ bm8 X;
    public final /* synthetic */ a93 Y;
    public final /* synthetic */ MainScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm8(MainScreen mainScreen, bm8 bm8Var, a93 a93Var, Continuation continuation) {
        super(2, continuation);
        this.o = mainScreen;
        this.X = bm8Var;
        this.Y = a93Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cm8 cm8Var = (cm8) l((yeb) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cm8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cm8(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        a93 a93Var;
        g8j.b(obj);
        Iterator it = this.o.c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            a93Var = this.Y;
            if (!zHasNext) {
                break;
            }
            ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getValue();
            if (!viewGroup.isAttachedToWindow()) {
                a93.h(a93Var, viewGroup);
            }
        }
        bm8 bm8Var = this.X;
        if (!bm8Var.isAttachedToWindow()) {
            a93.h(a93Var, bm8Var);
        }
        return qqg.a;
    }
}
