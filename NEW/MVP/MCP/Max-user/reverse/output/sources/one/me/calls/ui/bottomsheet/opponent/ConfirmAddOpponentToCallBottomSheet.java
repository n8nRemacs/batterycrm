package one.me.calls.ui.bottomsheet.opponent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.ap3;
import defpackage.aw0;
import defpackage.c51;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.fu2;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gza;
import defpackage.hk1;
import defpackage.ipi;
import defpackage.iza;
import defpackage.j0b;
import defpackage.j6;
import defpackage.jza;
import defpackage.k18;
import defpackage.kk4;
import defpackage.kti;
import defpackage.l38;
import defpackage.m0b;
import defpackage.n41;
import defpackage.o73;
import defpackage.t75;
import defpackage.ub;
import defpackage.v1a;
import defpackage.vw4;
import defpackage.x9f;
import defpackage.xcf;
import defpackage.xo3;
import defpackage.yeb;
import defpackage.yo3;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmAddOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfirmAddOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int E0 = 0;
    public final k18 C0;
    public final Object D0;

    public ConfirmAddOpponentToCallBottomSheet() {
        super(null, 1, null);
        this.C0 = createViewModelLazy(ap3.class, new yo3(0, new fu2(27)));
        this.D0 = ipi.b(3, new hk1(19, this));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(j0b.M0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f = 8;
        marginLayoutParams.bottomMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(marginLayoutParams);
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(textView.getPaddingLeft(), kti.d(24 * vw4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setText(textView.getContext().getString(m0b.X0, ((n41) ((c51) ((ap3) this.C0.getValue()).b).j.getValue()).c));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(j0b.L0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(marginLayoutParams2);
        dpg.l.b(textView2, t75.b);
        textView2.setTextColor(v1aVar.B(textView2).c.getText().g);
        textView2.setGravity(17);
        textView2.setText(m0b.W0);
        linearLayout.addView(textView2);
        o73 o73Var = new o73(linearLayout.getContext(), null);
        o73Var.setId(j0b.I0);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.bottomMargin = kti.d(20 * vw4.d().getDisplayMetrics().density);
        marginLayoutParams3.setMarginStart(kti.d(vw4.d().getDisplayMetrics().density * f));
        marginLayoutParams3.setMarginEnd(kti.d(vw4.d().getDisplayMetrics().density * f));
        o73Var.setLayoutParams(marginLayoutParams3);
        o73Var.setText(m0b.T0);
        dpg.f.b(o73Var, t75.b);
        o73Var.setTextColor(v1aVar.B(o73Var).c.getText().e);
        ?? r4 = this.D0;
        kk4.e((xcf) r4.getValue(), v1aVar.B(o73Var).c);
        o73Var.setButtonDrawable((xcf) r4.getValue());
        o73Var.setPaddingBetweenCheckbox(kti.d(f * vw4.d().getDisplayMetrics().density));
        linearLayout.addView(o73Var);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(j0b.K0);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams4.bottomMargin = kti.d(12 * vw4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(marginLayoutParams4);
        gza gzaVar = gza.c;
        oneMeButton.setAppearance(gzaVar);
        jza jzaVar = jza.c;
        oneMeButton.setSize(jzaVar);
        oneMeButton.setMode(iza.a);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        oneMeButton.setText(m0b.V0);
        f8j.d(oneMeButton, 300L, new ub(this, 18, o73Var));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setId(j0b.J0);
        oneMeButton2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        oneMeButton2.setAppearance(gzaVar);
        oneMeButton2.setSize(jzaVar);
        oneMeButton2.setMode(iza.b);
        oneMeButton2.setCustomTheme(v1aVar.B(oneMeButton2).c);
        oneMeButton2.setText(m0b.U0);
        f8j.d(oneMeButton2, 300L, new j6(15, this));
        linearLayout.addView(oneMeButton2);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        x9f x9fVar = ((ap3) this.C0.getValue()).o;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(aw0.a(((ap3) this.C0.getValue()).X, getViewLifecycleOwner().p(), l38.d), new xo3(null, this), 1), getViewLifecycleScope());
    }
}
