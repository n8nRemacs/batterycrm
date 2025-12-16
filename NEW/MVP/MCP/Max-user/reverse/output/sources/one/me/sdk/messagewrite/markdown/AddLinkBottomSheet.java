package one.me.sdk.messagewrite.markdown;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a93;
import defpackage.aw0;
import defpackage.b1e;
import defpackage.bbd;
import defpackage.dpg;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fp8;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i6;
import defpackage.i6c;
import defpackage.imb;
import defpackage.iza;
import defpackage.j6;
import defpackage.j88;
import defpackage.jza;
import defpackage.k;
import defpackage.k18;
import defpackage.kti;
import defpackage.l38;
import defpackage.mab;
import defpackage.ms0;
import defpackage.nab;
import defpackage.o3;
import defpackage.o88;
import defpackage.q;
import defpackage.r35;
import defpackage.t75;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u45;
import defpackage.v9;
import defpackage.veb;
import defpackage.vid;
import defpackage.vw4;
import defpackage.w9;
import defpackage.w9b;
import defpackage.x9;
import defpackage.xb3;
import defpackage.y9;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z7;
import defpackage.z8a;
import java.util.regex.Pattern;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/sdk/messagewrite/markdown/AddLinkBottomSheet;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "Ly9;", "addLinkState", "(Ljava/lang/String;Ly9;Ltk4;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddLinkBottomSheet extends BaseBottomSheetWidget {
    public static final /* synthetic */ yy7[] B0 = {new z8a(AddLinkBottomSheet.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), ho7.d(vid.a, AddLinkBottomSheet.class, "editText", "getEditText()Lone/me/sdk/uikit/common/views/OneMeTextInput;", 0), new toc(AddLinkBottomSheet.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final k18 A0;
    public final y9 w0;
    public final bbd x0;
    public final bbd y0;
    public final k18 z0;

    public AddLinkBottomSheet(String str, y9 y9Var, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str)), new imb("bottom_sheet:add_link:key", y9Var)));
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0 */
    public final eo7 getE0() {
        return new eo7(0, new ms0(3, 3, false), 7);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        float f = 12;
        frameLayout.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(10 * vw4.d().getDisplayMetrics().density), kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(8 * vw4.d().getDisplayMetrics().density));
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 22;
        textView.setPaddingRelative(textView.getPaddingStart(), kti.d(f2 * vw4.d().getDisplayMetrics().density), textView.getPaddingEnd(), kti.d(vw4.d().getDisplayMetrics().density * f2));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setText(z7.e(getContext(), nab.q));
        dpg.d.b(textView, t75.b);
        tqi.c(new x9(3, null, 0), textView);
        linearLayout.addView(textView);
        veb vebVar = new veb(linearLayout.getContext());
        vebVar.setId(mab.v);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int iD = kti.d(f * vw4.d().getDisplayMetrics().density);
        int marginStart = layoutParams2.getMarginStart();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin;
        int marginEnd = layoutParams2.getMarginEnd();
        layoutParams2.setMarginStart(marginStart);
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i;
        layoutParams2.setMarginEnd(marginEnd);
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = iD;
        vebVar.setLayoutParams(layoutParams2);
        String str = this.w0.c;
        if (str == null) {
            o88 o88Var = (o88) this.A0.getValue();
            CharSequence charSequenceC = xb3.c(vebVar.getContext());
            o88Var.getClass();
            if (charSequenceC == null || !((Pattern) o88Var.X.getValue()).matcher(charSequenceC).matches()) {
                charSequenceC = null;
            }
            if (charSequenceC == null) {
                charSequenceC = "";
            }
            String string = charSequenceC.toString();
            if (string.length() > 0) {
                tcf tcfVar = o88Var.b;
                tcfVar.m(null, new j88(((j88) tcfVar.getValue()).b, string));
            }
            str = string;
        }
        vebVar.setText(str);
        vebVar.setBackgroundColorAttr(Integer.valueOf(w9b.N));
        vebVar.setTextColor(a93.s0.x(vebVar.getContext()).k().getText().e);
        vebVar.f(new k(4, this));
        vebVar.a.requestFocus();
        vebVar.post(new o3(5, vebVar));
        linearLayout.addView(vebVar);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(mab.u);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        oneMeButton.setText(nab.p);
        f8j.d(oneMeButton, 300L, new j6(2, this));
        linearLayout.addView(oneMeButton);
        frameLayout.addView(linearLayout, -1, -2);
        View r35Var = new r35(frameLayout.getContext());
        r35Var.setTranslationY(u45.c(6, vw4.d().getDisplayMetrics().density, -r11));
        frameLayout.addView(r35Var);
    }

    public final veb L0() {
        return (veb) this.x0.D(this, B0[1]);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        ((OneMeButton) this.y0.D(this, B0[2])).setEnabled(L0().getText().length() > 0);
        gw0.w(new g56(aw0.a(((o88) this.A0.getValue()).c, getViewLifecycleOwner().p(), l38.d), new w9(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new v9(this, 0);
    }

    public AddLinkBottomSheet(Bundle bundle) {
        super(bundle);
        hs hsVar = new hs(b1e.class, Widget.ARG_SCOPE_ID);
        Parcelable parcelable = (Parcelable) yvi.a(bundle, "bottom_sheet:add_link:key", y9.class);
        if (parcelable != null) {
            this.w0 = (y9) parcelable;
            this.x0 = viewBinding(mab.v);
            this.y0 = viewBinding(mab.u);
            yy7 yy7Var = B0[0];
            this.z0 = m39getSharedViewModelcp94BC8(((b1e) hsVar.a(this)).a, fp8.class, null);
            this.A0 = createViewModelLazy(o88.class, new q(3, new i6(4, this)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
