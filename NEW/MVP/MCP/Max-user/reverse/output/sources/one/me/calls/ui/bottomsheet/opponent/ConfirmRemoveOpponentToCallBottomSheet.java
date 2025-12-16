package one.me.calls.ui.bottomsheet.opponent;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.az1;
import defpackage.cnb;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.fq3;
import defpackage.fua;
import defpackage.gwi;
import defpackage.gza;
import defpackage.imb;
import defpackage.iza;
import defpackage.j0b;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.l5j;
import defpackage.m0b;
import defpackage.onb;
import defpackage.r35;
import defpackage.t75;
import defpackage.tcf;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.yeb;
import defpackage.yo3;
import defpackage.zi1;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmRemoveOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lzi1;", "opponentId", "(Lzi1;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmRemoveOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int D0 = 0;
    public final k18 C0;

    public ConfirmRemoveOpponentToCallBottomSheet(Bundle bundle) {
        super(null, 1, null);
        this.C0 = createViewModelLazy(fq3.class, new yo3(3, new wj1(bundle, 2)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(j0b.Q0);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(0, kti.d(24 * vw4.d().getDisplayMetrics().density), 0, 0);
        textView.setText(m0b.b1);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(j0b.P0);
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        dpg.l.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().g);
        textView2.setGravity(17);
        Context context = textView2.getContext();
        int i = m0b.a1;
        fq3 fq3Var = (fq3) this.C0.getValue();
        cnb cnbVar = (cnb) ((onb) ((tcf) fq3Var.c.e()).getValue()).c.get(fq3Var.b);
        String name = cnbVar != null ? cnbVar.b.getName() : null;
        if (name == null) {
            name = "";
        }
        textView2.setText(context.getString(i, name));
        constraintLayout.addView(textView2);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(j0b.O0);
        oneMeButton.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        gza gzaVar = gza.c;
        oneMeButton.setAppearance(gzaVar);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.a);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        oneMeButton.setText(m0b.Z0);
        final int i2 = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: eq3
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.D0;
                        fq3 fq3Var2 = (fq3) confirmRemoveOpponentToCallBottomSheet.C0.getValue();
                        fq3Var2.d.g(fq3Var2.b);
                        confirmRemoveOpponentToCallBottomSheet.E0(true);
                        break;
                    default:
                        int i5 = ConfirmRemoveOpponentToCallBottomSheet.D0;
                        confirmRemoveOpponentToCallBottomSheet.E0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton2.setId(j0b.N0);
        oneMeButton2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.b);
        oneMeButton2.setCustomTheme(v1aVar.B(oneMeButton2).c);
        oneMeButton2.setText(m0b.Y0);
        final int i3 = 1;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: eq3
            public final /* synthetic */ ConfirmRemoveOpponentToCallBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = this.b;
                switch (i32) {
                    case 0:
                        int i4 = ConfirmRemoveOpponentToCallBottomSheet.D0;
                        fq3 fq3Var2 = (fq3) confirmRemoveOpponentToCallBottomSheet.C0.getValue();
                        fq3Var2.d.g(fq3Var2.b);
                        confirmRemoveOpponentToCallBottomSheet.E0(true);
                        break;
                    default:
                        int i5 = ConfirmRemoveOpponentToCallBottomSheet.D0;
                        confirmRemoveOpponentToCallBottomSheet.E0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(oneMeButton2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = textView.getId();
        ut3VarG.d(id, 3, 0, 3);
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, textView2.getId(), 3);
        new fua(ut3VarG, 4, id, 5).e(kti.d(16 * vw4.d().getDisplayMetrics().density));
        ut3VarG.g(id).d.W = 2;
        int id2 = textView2.getId();
        ut3VarG.d(id2, 3, textView.getId(), 4);
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 4, oneMeButton2.getId(), 3);
        new fua(ut3VarG, 4, id2, 5).e(kti.d(28 * vw4.d().getDisplayMetrics().density));
        int id3 = oneMeButton.getId();
        ut3VarG.d(id3, 3, textView2.getId(), 4);
        ut3VarG.d(id3, 7, oneMeButton2.getId(), 6);
        float f = 4;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 4, 0, 3);
        int id4 = oneMeButton2.getId();
        ut3VarG.d(id4, 3, oneMeButton.getId(), 3);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 6, oneMeButton.getId(), 7);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id4, 4, oneMeButton.getId(), 4);
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        r35 r35Var = this.x0;
        if (r35Var != null) {
            r35Var.setCustomTheme(C0());
        }
    }

    public ConfirmRemoveOpponentToCallBottomSheet(zi1 zi1Var) {
        this(gwi.b(new imb("opponent_id", zi1Var)));
    }
}
