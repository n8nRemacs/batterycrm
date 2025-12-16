package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.stickersshowcase.StickersShowcaseScreen;

/* loaded from: classes.dex */
public final class mg6 implements cbb {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public /* synthetic */ mg6(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    @Override // defpackage.cbb
    public final void J(CharSequence charSequence) {
        x9f x9fVar;
        int i = this.a;
        Widget widget = this.b;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ForwardPickerScreen.I0;
                jxb jxbVarI0 = ((ForwardPickerScreen) widget).I0();
                String string = charSequence != null ? charSequence.toString() : null;
                tcf tcfVar = jxbVarI0.s0;
                if (string == null) {
                    string = "";
                }
                tcfVar.m(null, string);
                break;
            default:
                yy7[] yy7VarArr2 = StickersShowcaseScreen.u0;
                njf njfVarZ0 = ((StickersShowcaseScreen) widget).z0();
                kif kifVar = njfVarZ0.o;
                boolean zA = kifVar.a();
                tcf tcfVar2 = kifVar.d;
                AtomicReference atomicReference = kifVar.g;
                if (!zA && (x9fVar = njfVarZ0.c.g) != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                String strValueOf = String.valueOf(charSequence);
                tcf tcfVar3 = kifVar.f;
                if (!strValueOf.equals(((gif) atomicReference.get()).b)) {
                    x9f x9fVar2 = kifVar.h;
                    if (x9fVar2 != null) {
                        x9fVar2.cancel((CancellationException) null);
                    }
                    if (strValueOf.length() != 0) {
                        tcfVar2.m(null, new hif(1, null));
                        tcfVar3.m(null, strValueOf);
                        break;
                    } else {
                        qt7 qt7Var = (qt7) kifVar.i.D(kifVar, kif.j[0]);
                        if (qt7Var != null) {
                            qt7Var.cancel(null);
                        }
                        tcfVar2.setValue(kif.k);
                        atomicReference.set(new gif((String) null, 3));
                        tcfVar3.setValue(null);
                        break;
                    }
                }
                break;
        }
    }
}
