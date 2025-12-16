package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uh1 extends dtf implements um6 {
    public /* synthetic */ Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh1(r1c r1cVar, k18 k18Var, Continuation continuation) {
        super(3, continuation);
        this.o = 4;
        this.s0 = r1cVar;
        this.Z = k18Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                uh1 uh1Var = new uh1((k18) this.Z, (ci1) this.s0, (Continuation) obj3, 0);
                uh1Var.X = (Long) obj;
                uh1Var.Y = (CharSequence) obj2;
                qqg qqgVar = qqg.a;
                uh1Var.n(qqgVar);
                return qqgVar;
            case 1:
                uh1 uh1Var2 = new uh1((ImageView) this.Z, (TextView) this.s0, (Continuation) obj3, 1);
                uh1Var2.X = (LinearLayout) obj;
                uh1Var2.Y = (yeb) obj2;
                qqg qqgVar2 = qqg.a;
                uh1Var2.n(qqgVar2);
                return qqgVar2;
            case 2:
                uh1 uh1Var3 = new uh1((AppCompatImageView) this.Z, (TextView) this.s0, (Continuation) obj3, 2);
                uh1Var3.X = (FrameLayout) obj;
                uh1Var3.Y = (yeb) obj2;
                qqg qqgVar3 = qqg.a;
                uh1Var3.n(qqgVar3);
                return qqgVar3;
            case 3:
                uh1 uh1Var4 = new uh1((s5i) this.Z, (String) this.s0, (Continuation) obj3, 3);
                uh1Var4.X = (List) obj;
                uh1Var4.Y = (List) obj2;
                return uh1Var4.n(qqg.a);
            case 4:
                uh1 uh1Var5 = new uh1((r1c) this.s0, (k18) this.Z, (Continuation) obj3);
                uh1Var5.X = (cnb) obj;
                uh1Var5.Y = (mb4) obj2;
                qqg qqgVar4 = qqg.a;
                uh1Var5.n(qqgVar4);
                return qqgVar4;
            case 5:
                uh1 uh1Var6 = new uh1((Drawable) this.Y, (Drawable) this.Z, (GradientDrawable) this.s0, (Continuation) obj3, 5);
                uh1Var6.X = (yeb) obj2;
                qqg qqgVar5 = qqg.a;
                uh1Var6.n(qqgVar5);
                return qqgVar5;
            default:
                uh1 uh1Var7 = new uh1((TextView) this.Y, (TextView) this.Z, (Drawable) this.s0, (Continuation) obj3, 6);
                uh1Var7.X = (yeb) obj2;
                qqg qqgVar6 = qqg.a;
                uh1Var7.n(qqgVar6);
                return qqgVar6;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        switch (this.o) {
            case 0:
                g8j.b(obj);
                Long l = (Long) this.X;
                CharSequence charSequence = (CharSequence) this.Y;
                ((mr1) ((k18) this.Z).getValue()).getClass();
                String strF = mr1.f(l);
                if (strF != null && !vmf.F(strF)) {
                    charSequence = ((Object) charSequence) + " · " + strF;
                }
                nr1 nr1Var = new nr1(1, "", charSequence);
                pr1 pr1Var = ((ci1) this.s0).A0;
                pr1Var.b = nr1Var;
                Iterator it = pr1Var.a.iterator();
                while (it.hasNext()) {
                    ((or1) it.next()).B(nr1Var);
                }
                break;
            case 1:
                g8j.b(obj);
                LinearLayout linearLayout = (LinearLayout) this.X;
                yeb yebVar = (yeb) this.Y;
                ((ImageView) this.Z).setColorFilter(yebVar.getIcon().k);
                ((TextView) this.s0).setTextColor(yebVar.getText().j);
                linearLayout.setBackground(new RippleDrawable(ColorStateList.valueOf(yebVar.c().a.a.i), null, new ColorDrawable(-65536)));
                break;
            case 2:
                g8j.b(obj);
                FrameLayout frameLayout = (FrameLayout) this.X;
                yeb yebVar2 = (yeb) this.Y;
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.Z;
                v1a v1aVar = a93.s0;
                appCompatImageView.setImageTintList(ColorStateList.valueOf(v1aVar.y(frameLayout).getIcon().k));
                ((TextView) this.s0).setTextColor(v1aVar.y(frameLayout).getText().j);
                frameLayout.setForeground(new RippleDrawable(ColorStateList.valueOf(yebVar2.c().a.a.i), null, g86.E0));
                break;
            case 3:
                g8j.b(obj);
                List list = (List) this.X;
                List list2 = (List) this.Y;
                ue3.T(list, list2);
                s5i s5iVar = (s5i) this.Z;
                String str = (String) this.s0;
                break;
            case 4:
                g8j.b(obj);
                cnb cnbVar = (cnb) this.X;
                mb4 mb4Var = (mb4) this.Y;
                tcf tcfVar = ((r1c) this.s0).d;
                k18 k18Var = (k18) this.Z;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, ko8.f(ko8.c(cnbVar, cnbVar.a.o(), mb4Var.i, mb4Var.f, (mr1) k18Var.getValue(), mb4Var.l, null), false, mb4Var.i, mb4Var.f)));
            case 5:
                g8j.b(obj);
                yeb yebVar3 = (yeb) this.X;
                Drawable drawable = (Drawable) this.Y;
                yebVar3.getIcon();
                drawable.setTint(-1);
                ((Drawable) this.Z).setTint(-1);
                ((GradientDrawable) this.s0).setTint(-1728053248);
                break;
            default:
                g8j.b(obj);
                yeb yebVar4 = (yeb) this.X;
                ((TextView) this.Y).setTextColor(yebVar4.getText().e);
                ((TextView) this.Z).setTextColor(yebVar4.getText().g);
                ((Drawable) this.s0).setTint(yebVar4.getIcon().h);
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh1(Object obj, Object obj2, Drawable drawable, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Y = obj;
        this.Z = obj2;
        this.s0 = drawable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uh1(Object obj, Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.o = i;
        this.Z = obj;
        this.s0 = obj2;
    }
}
