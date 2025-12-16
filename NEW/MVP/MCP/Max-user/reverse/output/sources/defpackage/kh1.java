package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class kh1 extends d2f {
    public final /* synthetic */ int E0;
    public final Object F0;
    public final ViewGroup G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(FrameLayout frameLayout, pp1 pp1Var) {
        super(frameLayout);
        this.E0 = 0;
        this.F0 = pp1Var;
        this.G0 = (qp1) frameLayout.findViewById(eyc.call_copy_link_preview);
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        switch (this.E0) {
            case 0:
                ((qp1) this.G0).setListener((pp1) this.F0);
                break;
            case 1:
                v0b v0bVar = (v0b) this.G0;
                x0f x0fVar = t98Var instanceof x0f ? (x0f) t98Var : null;
                if (x0fVar != null) {
                    CharSequence charSequenceB = x0fVar.b.b(v0bVar.getContext());
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    v0bVar.setTitle(charSequenceB);
                    CharSequence charSequenceB2 = x0fVar.c.b(v0bVar.getContext());
                    CharSequence charSequence = charSequenceB2 != null ? charSequenceB2 : "";
                    v0bVar.setSubtitle(charSequence);
                    f8j.d(v0bVar, 300L, new ub(this, 11, charSequence));
                    v0bVar.setLongClickable(true);
                    v0bVar.setOnLongClickListener(new d72(this, 0, charSequence));
                    break;
                }
                break;
            default:
                n0b n0bVar = (n0b) this.G0;
                if (t98Var instanceof nde) {
                    View view = this.a;
                    n0bVar.setText(view.getContext().getString(t2d.about_app_send_report));
                    n0bVar.setIcon(view.getContext().getDrawable(ivd.K0));
                    f8j.d(n0bVar, 300L, new pcc(19, this));
                    n0bVar.setLongClickable(true);
                    n0bVar.setOnLongClickListener(new bn0(6, this));
                    break;
                }
                break;
        }
    }

    public kh1(Context context, kce kceVar, int i) {
        this.E0 = i;
        switch (i) {
            case 2:
                n0b n0bVar = new n0b(context);
                super(n0bVar);
                this.F0 = kceVar;
                this.G0 = n0bVar;
                break;
            default:
                v0b v0bVar = new v0b(context, false);
                super(v0bVar);
                this.F0 = kceVar;
                this.G0 = v0bVar;
                break;
        }
    }
}
