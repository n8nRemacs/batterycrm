package one.me.calls.ui.bottomsheet.raisehand;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.az1;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.f7d;
import defpackage.f8j;
import defpackage.fua;
import defpackage.g56;
import defpackage.g7d;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.imb;
import defpackage.iza;
import defpackage.j0b;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.l5j;
import defpackage.m0b;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wj1;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.zi1;
import kotlin.Metadata;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/raisehand/RaiseHandActionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Lzi1;", "opponentId", "(Ljava/lang/String;Lzi1;Ltk4;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RaiseHandActionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] F0 = {new toc(RaiseHandActionBottomSheet.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), ho7.d(vid.a, RaiseHandActionBottomSheet.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), new toc(RaiseHandActionBottomSheet.class, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(RaiseHandActionBottomSheet.class, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 C0;
    public final bbd D0;
    public final bbd E0;

    public RaiseHandActionBottomSheet(String str, zi1 zi1Var, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("opponent_id", zi1Var)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(j0b.m1);
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        textView.setGravity(17);
        float f = 24;
        textView.setPadding(0, kti.d(vw4.d().getDisplayMetrics().density * f), 0, 0);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(j0b.l1);
        dpg.l.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().g);
        textView2.setGravity(17);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(j0b.j1);
        gza gzaVar = gza.c;
        oneMeButton.setAppearance(gzaVar);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.b);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        oneMeButton.setText(m0b.D1);
        final int i = 0;
        f8j.d(oneMeButton, 300L, new View.OnClickListener(this) { // from class: e7d
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = RaiseHandActionBottomSheet.F0;
                        raiseHandActionBottomSheet.E0(true);
                        break;
                    default:
                        yy7[] yy7VarArr2 = RaiseHandActionBottomSheet.F0;
                        g7d g7dVar = (g7d) raiseHandActionBottomSheet.C0.getValue();
                        zi1 zi1Var = g7dVar.b;
                        qv1 qv1Var = g7dVar.c;
                        cnb cnbVarD = qv1Var.d();
                        z01 z01Var = qv1Var.l;
                        if (fni.a(zi1Var, cnbVarD.a.getId())) {
                            ((v11) z01Var).i(false);
                        } else {
                            v11 v11Var = (v11) z01Var;
                            ParticipantStatesManager participantStatesManagerF = v11Var.f();
                            if (participantStatesManagerF != null) {
                                participantStatesManagerF.lowerHandParticipant(knb.c(zi1Var));
                            }
                            v11Var.C0.h(ib.a);
                        }
                        raiseHandActionBottomSheet.E0(true);
                        break;
                }
            }
        });
        OneMeButton oneMeButton2 = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton2.setId(j0b.k1);
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.a);
        oneMeButton2.setCustomTheme(v1aVar.B(oneMeButton2).c);
        oneMeButton2.setText(m0b.E1);
        final int i2 = 1;
        f8j.d(oneMeButton2, 300L, new View.OnClickListener(this) { // from class: e7d
            public final /* synthetic */ RaiseHandActionBottomSheet b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = RaiseHandActionBottomSheet.F0;
                        raiseHandActionBottomSheet.E0(true);
                        break;
                    default:
                        yy7[] yy7VarArr2 = RaiseHandActionBottomSheet.F0;
                        g7d g7dVar = (g7d) raiseHandActionBottomSheet.C0.getValue();
                        zi1 zi1Var = g7dVar.b;
                        qv1 qv1Var = g7dVar.c;
                        cnb cnbVarD = qv1Var.d();
                        z01 z01Var = qv1Var.l;
                        if (fni.a(zi1Var, cnbVarD.a.getId())) {
                            ((v11) z01Var).i(false);
                        } else {
                            v11 v11Var = (v11) z01Var;
                            ParticipantStatesManager participantStatesManagerF = v11Var.f();
                            if (participantStatesManagerF != null) {
                                participantStatesManagerF.lowerHandParticipant(knb.c(zi1Var));
                            }
                            v11Var.C0.h(ib.a);
                        }
                        raiseHandActionBottomSheet.E0(true);
                        break;
                }
            }
        });
        constraintLayout.addView(textView, -1, -2);
        constraintLayout.addView(textView2, -1, -2);
        constraintLayout.addView(oneMeButton2, 0, -2);
        constraintLayout.addView(oneMeButton, 0, -2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = textView.getId();
        ut3VarG.d(id, 3, 0, 3);
        az1.q(16, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 7, 0, 7);
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 4, textView2.getId(), 3);
        ut3VarG.g(id).d.W = 2;
        int id2 = textView2.getId();
        ut3VarG.d(id2, 3, textView.getId(), 4);
        float f2 = 4;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id2, 5));
        ut3VarG.d(id2, 7, 0, 7);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 4, oneMeButton2.getId(), 3);
        int id3 = oneMeButton2.getId();
        ut3VarG.d(id3, 3, textView2.getId(), 4);
        new fua(ut3VarG, 3, id3, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id3, 7, oneMeButton.getId(), 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 4, 0, 3);
        int id4 = oneMeButton.getId();
        ut3VarG.d(id4, 3, oneMeButton2.getId(), 3);
        ut3VarG.d(id4, 7, 0, 7);
        ut3VarG.d(id4, 6, oneMeButton2.getId(), 7);
        new fua(ut3VarG, 6, id4, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id4, 4, oneMeButton2.getId(), 4);
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(((g7d) this.C0.getValue()).d, new f7d(this, null), 1), getViewLifecycleScope());
    }

    public RaiseHandActionBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = createViewModelLazy(g7d.class, new vdc(7, new wj1(bundle, 11)));
        this.D0 = viewBinding(j0b.m1);
        this.E0 = viewBinding(j0b.l1);
        viewBinding(j0b.k1);
        viewBinding(j0b.j1);
    }
}
