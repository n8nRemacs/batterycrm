package defpackage;

import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class c19 extends dtf implements um6 {
    public /* synthetic */ FrameLayout X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c19(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                c19 c19Var = new c19(3, continuation, 0);
                c19Var.X = frameLayout;
                qqg qqgVar = qqg.a;
                c19Var.n(qqgVar);
                return qqgVar;
            case 1:
                c19 c19Var2 = new c19(3, continuation, 1);
                c19Var2.X = frameLayout;
                qqg qqgVar2 = qqg.a;
                c19Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                c19 c19Var3 = new c19(3, continuation, 2);
                c19Var3.X = frameLayout;
                qqg qqgVar3 = qqg.a;
                c19Var3.n(qqgVar3);
                return qqgVar3;
            case 3:
                c19 c19Var4 = new c19(3, continuation, 3);
                c19Var4.X = frameLayout;
                qqg qqgVar4 = qqg.a;
                c19Var4.n(qqgVar4);
                return qqgVar4;
            default:
                c19 c19Var5 = new c19(3, continuation, 4);
                c19Var5.X = frameLayout;
                qqg qqgVar5 = qqg.a;
                c19Var5.n(qqgVar5);
                return qqgVar5;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                FrameLayout frameLayout = this.X;
                frameLayout.setBackgroundColor(a93.s0.y(frameLayout).b().m);
                break;
            case 1:
                g8j.b(obj);
                FrameLayout frameLayout2 = this.X;
                frameLayout2.setBackgroundColor(a93.s0.y(frameLayout2).b().n);
                break;
            case 2:
                g8j.b(obj);
                FrameLayout frameLayout3 = this.X;
                frameLayout3.setBackgroundColor(a93.s0.y(frameLayout3).a().k().a.d);
                break;
            case 3:
                g8j.b(obj);
                FrameLayout frameLayout4 = this.X;
                frameLayout4.setBackgroundColor(a93.s0.y(frameLayout4).b().l);
                break;
            default:
                g8j.b(obj);
                FrameLayout frameLayout5 = this.X;
                frameLayout5.setBackgroundColor(a93.s0.y(frameLayout5).b().l);
                break;
        }
        return qqg.a;
    }
}
