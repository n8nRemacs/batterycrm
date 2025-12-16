package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class en0 extends d2f {
    public final /* synthetic */ int E0 = 2;
    public Object F0;

    public /* synthetic */ en0(View view) {
        super(view);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) throws NumberFormatException {
        rf7 rf7VarA;
        rf7 rf7VarA2;
        switch (this.E0) {
            case 0:
                mb6 mb6Var = (mb6) t98Var;
                dn0 dn0Var = (dn0) this.a;
                String str = mb6Var.b;
                CharSequence charSequence = mb6Var.c;
                String str2 = mb6Var.d;
                SimpleDraweeView simpleDraweeView = dn0Var.s0;
                rpd rpdVar = dn0Var.a;
                dn0Var.d.setText(str);
                dn0Var.o.setText(charSequence);
                dn0Var.setBackground(dn0Var.c);
                tuf tufVar = new tuf(22);
                float f = 32;
                int iD = kti.d(vw4.d().getDisplayMetrics().density * f);
                int iD2 = kti.d(f * vw4.d().getDisplayMetrics().density);
                tufVar.c = iD;
                tufVar.d = iD2;
                uuf uufVar = new uuf(tufVar);
                if (str2 != null) {
                    sf7 sf7VarD = sf7.d(Uri.parse(str2));
                    sf7VarD.f = uufVar;
                    sf7VarD.d = dn0Var.b;
                    rf7VarA = sf7VarD.a();
                } else {
                    rf7VarA = null;
                }
                if (rf7VarA != null) {
                    df7 df7VarE = zk6.e();
                    df7VarE.getClass();
                    rpdVar.a(new cf7(df7VarE, rf7VarA, dn0Var));
                    if (simpleDraweeView.getController() == null) {
                        c2c c2cVarA = zk6.a.a();
                        c2cVarA.d = rpdVar;
                        c2cVarA.h = true;
                        simpleDraweeView.setController(c2cVarA.a());
                    }
                    simpleDraweeView.setVisibility(0);
                } else {
                    simpleDraweeView.setController(null);
                    simpleDraweeView.setVisibility(8);
                }
                f8j.d(dn0Var, 300L, new ub(this, 2, mb6Var));
                break;
            case 1:
                ((w71) this.F0).setLabel(((v71) t98Var).b);
                break;
            case 2:
                mb6 mb6Var2 = (mb6) t98Var;
                nb6 nb6Var = (nb6) this.a;
                String str3 = mb6Var2.b;
                CharSequence charSequence2 = mb6Var2.c;
                String str4 = mb6Var2.d;
                SimpleDraweeView simpleDraweeView2 = nb6Var.s0;
                rpd rpdVar2 = nb6Var.a;
                nb6Var.d.setText(str3);
                nb6Var.o.setText(charSequence2);
                nb6Var.setBackground(nb6Var.c);
                tuf tufVar2 = new tuf(22);
                float f2 = 20;
                int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f2);
                int iD4 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
                tufVar2.c = iD3;
                tufVar2.d = iD4;
                uuf uufVar2 = new uuf(tufVar2);
                if (str4 != null) {
                    sf7 sf7VarD2 = sf7.d(Uri.parse(str4));
                    sf7VarD2.f = uufVar2;
                    sf7VarD2.d = nb6Var.b;
                    rf7VarA2 = sf7VarD2.a();
                } else {
                    rf7VarA2 = null;
                }
                if (rf7VarA2 != null) {
                    df7 df7VarE2 = zk6.e();
                    df7VarE2.getClass();
                    rpdVar2.a(new cf7(df7VarE2, rf7VarA2, nb6Var));
                    if (simpleDraweeView2.getController() == null) {
                        c2c c2cVarA2 = zk6.a.a();
                        c2cVarA2.d = rpdVar2;
                        c2cVarA2.h = true;
                        simpleDraweeView2.setController(c2cVarA2.a());
                    }
                    simpleDraweeView2.setVisibility(0);
                } else {
                    simpleDraweeView2.setController(null);
                    simpleDraweeView2.setVisibility(8);
                }
                f8j.d(nb6Var, 300L, new ub(this, 29, mb6Var2));
                break;
            case 3:
                View view = this.a;
                gb6 gb6Var = view instanceof gb6 ? (gb6) view : null;
                if (gb6Var != null) {
                    gb6Var.setIcon(yud.z0);
                    gb6Var.setTitle(new n5g(g3d.chats_list_empty_state_title));
                    gb6Var.f(gb6Var.getContext().getString(g3d.chats_list_empty_state_action), new j6(28, this));
                    break;
                }
                break;
            case 4:
                ob6 ob6Var = (ob6) t98Var;
                View view2 = this.a;
                sb6 sb6Var = view2 instanceof sb6 ? (sb6) view2 : null;
                if (sb6Var != null) {
                    ub6 ub6Var = ob6Var instanceof ub6 ? (ub6) ob6Var : null;
                    if (ub6Var != null) {
                        ArrayList arrayList = ub6Var.a;
                        sb6Var.setVisibility(!arrayList.isEmpty() ? 0 : 8);
                        sb6Var.U1.E(arrayList);
                        sb6Var.setListener((qb6) this.F0);
                        break;
                    }
                }
                break;
            default:
                hl8 hl8Var = (hl8) t98Var;
                this.F0 = hl8Var;
                ((TextView) this.a).setText(hl8Var.b);
                break;
        }
    }

    public en0(w71 w71Var) {
        super(w71Var);
        this.F0 = w71Var;
    }

    public en0(Context context, eb6 eb6Var) {
        super(new nb6(context));
        this.F0 = eb6Var;
    }

    public en0(Context context, eb6 eb6Var, byte b) {
        super(new dn0(context));
        this.F0 = eb6Var;
    }

    public en0(Context context, ExecutorService executorService, i62 i62Var) {
        super(new sb6(context, executorService));
        this.F0 = i62Var;
    }

    public en0(Context context, l53 l53Var) {
        gb6 gb6Var = new gb6(context);
        gb6Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        super(gb6Var);
        this.F0 = l53Var;
    }
}
