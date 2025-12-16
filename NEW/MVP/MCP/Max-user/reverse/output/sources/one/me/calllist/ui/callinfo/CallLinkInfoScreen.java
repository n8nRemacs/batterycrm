package one.me.calllist.ui.callinfo;

import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aw0;
import defpackage.b6a;
import defpackage.bbd;
import defpackage.bqi;
import defpackage.bwf;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.ef1;
import defpackage.eo7;
import defpackage.ff1;
import defpackage.g31;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.hf1;
import defpackage.ho7;
import defpackage.if1;
import defpackage.in;
import defpackage.ipi;
import defpackage.iv6;
import defpackage.k;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kgh;
import defpackage.kj1;
import defpackage.l38;
import defpackage.l48;
import defpackage.m3;
import defpackage.oc1;
import defpackage.pf1;
import defpackage.q;
import defpackage.qq3;
import defpackage.tk4;
import defpackage.toc;
import defpackage.u91;
import defpackage.vid;
import defpackage.vmf;
import defpackage.yfb;
import defpackage.yq5;
import defpackage.yx1;
import defpackage.yy7;
import defpackage.yza;
import java.io.IOException;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "b6a", "call-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallLinkInfoScreen extends Widget implements qq3 {
    public final Object X;
    public final bbd Y;
    public final bbd Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final bwf d;
    public final Object o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public kgh x0;
    public final oc1 y0;
    public final ka5 z0;
    public static final /* synthetic */ yy7[] B0 = {new toc(CallLinkInfoScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), ho7.d(vid.a, CallLinkInfoScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new toc(CallLinkInfoScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(CallLinkInfoScreen.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), new toc(CallLinkInfoScreen.class, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0), new toc(CallLinkInfoScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(CallLinkInfoScreen.class, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0)};
    public static final b6a A0 = new b6a(15);

    /* JADX WARN: Multi-variable type inference failed */
    public CallLinkInfoScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final CharSequence y0(CallLinkInfoScreen callLinkInfoScreen, CharSequence charSequence, TextView textView, int i) {
        if (charSequence != null && charSequence.length() != 0 && i > 0) {
            TextPaint paint = textView.getPaint();
            float paddingLeft = (i - textView.getPaddingLeft()) - textView.getPaddingRight();
            if (paint.measureText(charSequence.toString()) > paddingLeft) {
                float fMeasureText = paint.measureText("…");
                int iY = vmf.y(charSequence);
                CharSequence charSequenceSubSequence = charSequence.subSequence(0, 0);
                CharSequence charSequenceSubSequence2 = charSequence.subSequence(iY, charSequence.length());
                int i2 = 0;
                while (i2 < iY) {
                    CharSequence charSequenceSubSequence3 = charSequence.subSequence(0, i2);
                    CharSequence charSequenceSubSequence4 = charSequence.subSequence(iY, charSequence.length());
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) charSequenceSubSequence3);
                    sb.append((Object) charSequenceSubSequence4);
                    if (paint.measureText(sb.toString()) > paddingLeft - fMeasureText) {
                        break;
                    }
                    i2++;
                    iY--;
                    charSequenceSubSequence = charSequenceSubSequence3;
                    charSequenceSubSequence2 = charSequenceSubSequence4;
                }
                return ((Object) charSequenceSubSequence) + "…" + ((Object) charSequenceSubSequence2);
            }
        }
        return charSequence;
    }

    public final yfb A0() {
        return (yfb) this.s0.D(this, B0[2]);
    }

    public final pf1 B0() {
        return (pf1) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.X.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getT0() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.z0;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws IOException {
        k kVar = new k(21, this);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(yza.q);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        kVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.x0 = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((kj1) this.X.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        yq5 yq5Var = new yq5();
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.Z;
        ((in) bbdVar.D(this, yy7Var)).a(bqi.b(new ff1(yq5Var, this, 0), (in) bbdVar.D(this, yy7VarArr[1]), getViewLifecycleOwner()));
        ci5 ci5Var = B0().v0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new hf1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(B0().t0, getViewLifecycleOwner().p(), l38Var), new if1(null, this), 1), getViewLifecycleScope());
    }

    public final yx1 z0() {
        return (yx1) this.b.getValue();
    }

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        u91 u91Var = u91.a;
        this.a = u91Var.getAccessor().d(8);
        this.b = u91Var.getAccessor().d(156);
        this.c = createViewModelLazy(pf1.class, new q(17, new m3(bundle, this, 14)));
        this.d = new bwf(new ef1(this, 1));
        this.o = ipi.b(3, new ef1(this, 2));
        this.X = ipi.b(3, new ef1(this, 3));
        this.Y = viewBinding(yza.p);
        this.Z = viewBinding(yza.n);
        this.s0 = viewBinding(yza.t);
        this.t0 = viewBinding(yza.y);
        this.u0 = viewBinding(yza.s);
        this.v0 = viewBinding(yza.o);
        this.w0 = viewBinding(yza.r);
        this.y0 = new oc1(new iv6(6, this), ((g4b) u91Var.getAccessor().c(56)).a());
        this.z0 = new ka5(new g31(14), (cm6) null, 6);
    }

    public /* synthetic */ CallLinkInfoScreen(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public CallLinkInfoScreen(Long l, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("link_param", str);
        bundle.putString("title_param", str2);
        if (l != null) {
            bundle.putLong("id_param", l.longValue());
        }
        bundle.putBoolean("is_link_call", z);
        this(bundle);
    }
}
