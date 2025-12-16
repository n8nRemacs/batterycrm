package defpackage;

import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import one.me.login.neuroavatars.RegistrationNeuroAvatarsScreen;

/* loaded from: classes.dex */
public final class pg1 extends dtf implements um6 {
    public /* synthetic */ LinearLayout X;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pg1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.o = i2;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LinearLayout linearLayout = (LinearLayout) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.o) {
            case 0:
                pg1 pg1Var = new pg1(3, continuation, 0);
                pg1Var.X = linearLayout;
                qqg qqgVar = qqg.a;
                pg1Var.n(qqgVar);
                return qqgVar;
            case 1:
                pg1 pg1Var2 = new pg1(3, continuation, 1);
                pg1Var2.X = linearLayout;
                qqg qqgVar2 = qqg.a;
                pg1Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                pg1 pg1Var3 = new pg1(3, continuation, 2);
                pg1Var3.X = linearLayout;
                qqg qqgVar3 = qqg.a;
                pg1Var3.n(qqgVar3);
                return qqgVar3;
            case 3:
                pg1 pg1Var4 = new pg1(3, continuation, 3);
                pg1Var4.X = linearLayout;
                qqg qqgVar4 = qqg.a;
                pg1Var4.n(qqgVar4);
                return qqgVar4;
            case 4:
                pg1 pg1Var5 = new pg1(3, continuation, 4);
                pg1Var5.X = linearLayout;
                qqg qqgVar5 = qqg.a;
                pg1Var5.n(qqgVar5);
                return qqgVar5;
            case 5:
                pg1 pg1Var6 = new pg1(3, continuation, 5);
                pg1Var6.X = linearLayout;
                qqg qqgVar6 = qqg.a;
                pg1Var6.n(qqgVar6);
                return qqgVar6;
            default:
                pg1 pg1Var7 = new pg1(3, continuation, 6);
                pg1Var7.X = linearLayout;
                qqg qqgVar7 = qqg.a;
                pg1Var7.n(qqgVar7);
                return qqgVar7;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        switch (this.o) {
            case 0:
                g8j.b(obj);
                LinearLayout linearLayout = this.X;
                linearLayout.setBackgroundColor(a93.s0.B(linearLayout).c.b().h);
                break;
            case 1:
                g8j.b(obj);
                LinearLayout linearLayout2 = this.X;
                linearLayout2.setBackgroundColor(a93.s0.y(linearLayout2).b().k);
                break;
            case 2:
                g8j.b(obj);
                LinearLayout linearLayout3 = this.X;
                linearLayout3.setBackgroundColor(a93.s0.y(linearLayout3).b().k);
                break;
            case 3:
                g8j.b(obj);
                LinearLayout linearLayout4 = this.X;
                linearLayout4.setBackgroundColor(a93.s0.y(linearLayout4).b().k);
                break;
            case 4:
                g8j.b(obj);
                LinearLayout linearLayout5 = this.X;
                linearLayout5.setBackgroundColor(a93.s0.y(linearLayout5).b().n);
                break;
            case 5:
                g8j.b(obj);
                LinearLayout linearLayout6 = this.X;
                linearLayout6.setBackgroundColor(a93.s0.y(linearLayout6).b().k);
                break;
            default:
                g8j.b(obj);
                LinearLayout linearLayout7 = this.X;
                RegistrationNeuroAvatarsScreen.y0(linearLayout7, a93.s0.y(linearLayout7));
                break;
        }
        return qqg.a;
    }
}
