package one.me.calls.ui.bottomsheet.record;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.api;
import defpackage.b1e;
import defpackage.dpg;
import defpackage.f8j;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hs;
import defpackage.imb;
import defpackage.iza;
import defpackage.j0b;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.m0b;
import defpackage.mwg;
import defpackage.prd;
import defpackage.t75;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u74;
import defpackage.v0b;
import defpackage.v1a;
import defpackage.vdc;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w3b;
import defpackage.wfe;
import defpackage.wo1;
import defpackage.yeb;
import defpackage.yud;
import defpackage.yy7;
import defpackage.zbf;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/calls/ui/bottomsheet/record/StartRecordBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StartRecordBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] E0;
    public final k18 C0;
    public final k18 D0;

    static {
        toc tocVar = new toc(StartRecordBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0);
        vid.a.getClass();
        E0 = new yy7[]{tocVar};
    }

    public StartRecordBottomSheet(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final yeb C0() {
        return a93.s0.z(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() {
        api.c(this);
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(j0b.A1);
        dpg.c.b(textView, t75.b);
        v1a v1aVar = a93.s0;
        textView.setTextColor(v1aVar.B(textView).c.getText().e);
        textView.setGravity(17);
        float f = 24;
        textView.setPadding(0, kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(20 * vw4.d().getDisplayMetrics().density));
        textView.setText(m0b.V1);
        w3b w3bVar = new w3b(linearLayout.getContext(), 14);
        w3bVar.setId(j0b.x1);
        dpg.h.b(w3bVar, t75.b);
        w3bVar.setHintTextColor(v1aVar.B(w3bVar).c.getText().g);
        w3bVar.setTextColor(v1aVar.B(w3bVar).c.getText().e);
        float f2 = 16;
        int iD = kti.d(vw4.d().getDisplayMetrics().density * f2);
        w3bVar.setPadding(iD, iD, iD, iD);
        w3bVar.setMaxLines(1);
        w3bVar.setSingleLine(true);
        w3bVar.setInputType(524288);
        w3bVar.setHint((CharSequence) ((zbf) this.D0.getValue()).d.getValue());
        w3bVar.setClipToOutline(true);
        w3bVar.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(250)});
        w3bVar.setOutlineProvider(new u74(kti.d(vw4.d().getDisplayMetrics().density * f2)));
        w3bVar.setBackgroundColor(v1aVar.B(w3bVar).c.b().a.i);
        v0b v0bVar = new v0b(linearLayout.getContext(), false);
        v0bVar.setId(j0b.y1);
        v0bVar.setPadding(0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0, kti.d(f * vw4.d().getDisplayMetrics().density));
        v0bVar.setTitle(m0b.R1);
        v0bVar.setSubtitle(v0bVar.getContext().getString(m0b.Q1));
        v0bVar.setCustomTheme(v1aVar.B(v0bVar).c);
        v0bVar.g(0L, "", mwg.c(yud.N1).toString());
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(j0b.z1);
        oneMeButton.setMode(iza.a);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setCustomTheme(v1aVar.B(oneMeButton).c);
        oneMeButton.setText(m0b.U1);
        f8j.d(oneMeButton, 300L, new wfe(this, 10, w3bVar));
        linearLayout.addView(textView, -1, -2);
        linearLayout.addView(w3bVar, -1, -2);
        linearLayout.addView(v0bVar, -1, -2);
        linearLayout.addView(oneMeButton, -1, -2);
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        api.c(this);
    }

    public StartRecordBottomSheet(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(b1e.class, new b1e("default"), Widget.ARG_SCOPE_ID);
        yy7 yy7Var = E0[0];
        this.C0 = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, wo1.class, null);
        this.D0 = createViewModelLazy(zbf.class, new vdc(26, new prd(21, this)));
    }
}
