package defpackage;

import android.view.View;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class rl2 extends dtf implements sm6 {
    public final /* synthetic */ yb9 X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ ChatMediaListWidget o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl2(ChatMediaListWidget chatMediaListWidget, yb9 yb9Var, View view, Continuation continuation) {
        super(2, continuation);
        this.o = chatMediaListWidget;
        this.X = yb9Var;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rl2 rl2Var = (rl2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rl2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rl2(this.o, this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Collection collectionB;
        int i;
        g8j.b(obj);
        ChatMediaListWidget chatMediaListWidget = this.o;
        yb9 yb9Var = this.X;
        chatMediaListWidget.a = yb9Var;
        y34 y34VarB = h6j.a(1).b().B(this.Y);
        jo2 jo2VarZ0 = chatMediaListWidget.z0();
        if (yb9Var instanceof tb9) {
            bk2 bk2Var = (bk2) jo2VarZ0.L0.getValue();
            bk2Var.getClass();
            o98 o98VarD = ve3.d();
            o98VarD.add((b44) bk2Var.b.getValue());
            o98VarD.add(bk2.a(x8b.v1));
            o98VarD.add((b44) bk2Var.a.getValue());
            collectionB = ve3.a(o98VarD);
        } else if (yb9Var instanceof ub9) {
            bk2 bk2Var2 = (bk2) jo2VarZ0.L0.getValue();
            bk2Var2.getClass();
            o98 o98VarD2 = ve3.d();
            o98VarD2.add(new b44(v8b.Y, new n5g(x8b.s1), Integer.valueOf(y9b.f), (Integer) null, 20));
            o98VarD2.add(new b44(v8b.f0, new n5g(x8b.D1), Integer.valueOf(y9b.z), (Integer) null, 20));
            o98VarD2.add((b44) bk2Var2.b.getValue());
            o98VarD2.add(bk2.a(x8b.x1));
            o98VarD2.add((b44) bk2Var2.a.getValue());
            collectionB = ve3.a(o98VarD2);
        } else {
            boolean z = yb9Var instanceof wb9;
            if (z) {
                bk2 bk2Var3 = (bk2) jo2VarZ0.L0.getValue();
                bk2Var3.getClass();
                if (z) {
                    wb9 wb9Var = (wb9) yb9Var;
                    int iV = az1.v(wb9Var.o);
                    if (iV == 0) {
                        i = x8b.y1;
                    } else if (iV == 1) {
                        i = x8b.z1;
                    } else {
                        if (iV != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = x8b.w1;
                    }
                    o98 o98VarD3 = ve3.d();
                    o98VarD3.add(new b44(v8b.e0, new n5g(x8b.C1), Integer.valueOf(y9b.g), (Integer) null, 20));
                    o98VarD3.add((b44) bk2Var3.b.getValue());
                    o98VarD3.add(bk2.a(i));
                    if (!wb9Var.Z) {
                        o98VarD3.add((b44) bk2Var3.a.getValue());
                    }
                    collectionB = ve3.a(o98VarD3);
                } else {
                    collectionB = hd5.a;
                }
            } else {
                if (!(yb9Var instanceof sb9) && !(yb9Var instanceof xb9)) {
                    jo2VarZ0.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                collectionB = ((bk2) jo2VarZ0.L0.getValue()).b();
            }
        }
        y34VarB.o(collectionB).build().u(chatMediaListWidget);
        return qqg.a;
    }
}
