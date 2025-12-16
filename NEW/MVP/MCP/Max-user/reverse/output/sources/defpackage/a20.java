package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class a20 extends qmc {
    public final /* synthetic */ int E0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a20(View view, int i) {
        super(view);
        this.E0 = i;
    }

    @Override // defpackage.d2f
    public void D() {
        switch (this.E0) {
            case 11:
                fwe fweVar = ((dwe) this.a).d;
                fweVar.b.d();
                fweVar.c = false;
                fweVar.invalidate();
                break;
        }
    }

    @Override // defpackage.qmc
    public void G(ukd ukdVar) {
        switch (this.E0) {
            case 2:
                ((du2) this.a).setListener(new a3b(9, ukdVar));
                break;
            case 4:
                ((l04) this.a).setListener(new r5j(12, ukdVar));
                break;
        }
    }

    @Override // defpackage.qmc
    public void H(View.OnClickListener onClickListener) {
        switch (this.E0) {
            case 0:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 1:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 3:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 5:
                f8j.d((TextView) this.a, 300L, onClickListener);
                break;
            case 6:
                f8j.d((TextView) this.a, 300L, onClickListener);
                break;
            case 7:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 8:
                f8j.d(this.a, 300L, onClickListener);
                break;
            case 9:
                f8j.d(this.a, 300L, onClickListener);
                break;
        }
    }

    @Override // defpackage.qmc
    public void I(View.OnLongClickListener onLongClickListener) {
        switch (this.E0) {
            case 3:
                ((v0b) this.a).setOnLongClickListener(onLongClickListener);
                break;
            case 9:
                ((roe) this.a).setOnLongClickListener(onLongClickListener);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.CharSequence] */
    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        int i = this.E0;
        View view = this.a;
        switch (i) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                ((du2) view).setDescription(((xic) t98Var).a);
                return;
            case 3:
                gdc gdcVar = ((bjc) t98Var).a;
                v0b v0bVar = (v0b) view;
                v0bVar.setId(Long.hashCode(gdcVar.a));
                long j = gdcVar.e;
                CharSequence charSequence = gdcVar.f;
                String str = gdcVar.d;
                v0bVar.g(j, charSequence, str != null ? str : "");
                v0bVar.setTitle(gdcVar.b);
                v0bVar.setSubtitle(gdcVar.c.b(v0bVar.getContext()));
                return;
            case 4:
                djc djcVar = (djc) t98Var;
                l04 l04Var = (l04) view;
                ?? B = djcVar.b.b(l04Var.getContext());
                l04Var.setTitle(B != 0 ? B : "");
                l04Var.setDescription(djcVar.a);
                return;
            case 5:
                ((TextView) view).setText("#id " + ((ejc) t98Var).a);
                return;
            case 6:
                t98Var.getClass();
                throw new ClassCastException();
            case 7:
                sic sicVar = (sic) t98Var;
                OneMeButton oneMeButton = (OneMeButton) view;
                sicVar.getClass();
                oneMeButton.setMode(iza.a);
                oneMeButton.setSize(jza.c);
                oneMeButton.setAppearance(sicVar.b);
                oneMeButton.setText(sicVar.a);
                return;
            case 8:
                return;
            case 9:
                ((roe) view).setModelItem(new toe(v8b.i1, 0, new r5g(((jjc) t98Var).a), null, null, null, null, null, new n5g(x8b.N), 248));
                return;
            case 10:
                tic ticVar = (tic) t98Var;
                TextView textView = (TextView) view;
                textView.setText(ticVar.a);
                tqi.c(new z8e(ticVar, (Continuation) null, 1), textView);
                t5g t5gVar = dpg.a;
                ticVar.c.b(textView, t75.b);
                return;
            default:
                fwe fweVar = ((dwe) view).d;
                fweVar.c = true;
                fweVar.b.c();
                return;
        }
    }

    public a20(Context context) {
        this.E0 = 10;
        TextView textView = new TextView(context);
        super(textView);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }
}
