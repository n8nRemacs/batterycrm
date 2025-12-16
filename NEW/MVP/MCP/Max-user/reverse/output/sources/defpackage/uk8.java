package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class uk8 implements zef {
    public final /* synthetic */ int a;
    public final mgf b;
    public final FrameLayout c;

    public uk8(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                oef oefVar = new oef(context);
                this.c = oefVar;
                this.b = new mgf(oefVar);
                break;
            case 2:
                e1i e1iVar = new e1i(context);
                this.c = e1iVar;
                this.b = new mgf(e1iVar);
                break;
            default:
                sk8 sk8Var = new sk8(context);
                this.c = sk8Var;
                this.b = new mgf(sk8Var);
                break;
        }
    }

    private final void c(qk8 qk8Var) {
    }

    @Override // defpackage.zef
    public final void a(fff fffVar) {
        switch (this.a) {
            case 0:
                mgf mgfVar = this.b;
                mgfVar.b(fffVar);
                mgfVar.c();
                ((sk8) this.c).a(fffVar, Math.max(350, mgfVar.b));
                break;
            case 1:
                mgf mgfVar2 = this.b;
                mgfVar2.b(fffVar);
                mgfVar2.c();
                ((oef) this.c).a(fffVar);
                break;
            default:
                mgf mgfVar3 = this.b;
                mgfVar3.b(fffVar);
                mgfVar3.c();
                ((e1i) this.c).a(fffVar, Math.max(350, mgfVar3.b));
                break;
        }
    }

    @Override // defpackage.zef
    public final void b(qk8 qk8Var) {
        switch (this.a) {
            case 0:
                ((sk8) this.c).b(qk8Var);
                break;
            case 1:
                break;
            default:
                ((e1i) this.c).b(qk8Var);
                break;
        }
    }

    @Override // defpackage.zef
    public final void setParent(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                sk8 sk8Var = (sk8) this.c;
                sk8Var.setSizeConfigurator(this.b);
                viewGroup.addView(sk8Var, new ViewGroup.LayoutParams(-1, -1));
                break;
            case 1:
                oef oefVar = (oef) this.c;
                oefVar.setSizeConfigurator(this.b);
                viewGroup.addView(oefVar, new ViewGroup.LayoutParams(-1, -1));
                break;
            default:
                e1i e1iVar = (e1i) this.c;
                e1iVar.setSizeConfigurator(this.b);
                viewGroup.addView(e1iVar, new ViewGroup.LayoutParams(-1, -1));
                break;
        }
    }
}
