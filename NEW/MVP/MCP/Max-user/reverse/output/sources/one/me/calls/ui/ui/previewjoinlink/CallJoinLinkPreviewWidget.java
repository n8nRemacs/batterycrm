package one.me.calls.ui.ui.previewjoinlink;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.aw0;
import defpackage.az1;
import defpackage.bbd;
import defpackage.bsb;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.eo7;
import defpackage.etd;
import defpackage.fua;
import defpackage.g31;
import defpackage.g56;
import defpackage.gt1;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.he1;
import defpackage.ho7;
import defpackage.ie1;
import defpackage.imb;
import defpackage.ipi;
import defpackage.it1;
import defpackage.j0b;
import defpackage.j2e;
import defpackage.jtd;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kdb;
import defpackage.kj1;
import defpackage.kt3;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5j;
import defpackage.le1;
import defpackage.m0b;
import defpackage.m3;
import defpackage.me1;
import defpackage.ms8;
import defpackage.n5g;
import defpackage.ne1;
import defpackage.nha;
import defpackage.q;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.rsb;
import defpackage.s2i;
import defpackage.sn0;
import defpackage.toc;
import defpackage.ut3;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vw4;
import defpackage.yeb;
import defpackage.yy7;
import defpackage.zi1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/calls/ui/ui/previewjoinlink/CallJoinLinkPreviewWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Lnha;", "Lj2e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "link", "", "videoCall", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CallJoinLinkPreviewWidget extends Widget implements qq3, nha, j2e {
    public static final /* synthetic */ yy7[] A0 = {new toc(CallJoinLinkPreviewWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), ho7.d(vid.a, CallJoinLinkPreviewWidget.class, "closeView", "getCloseView()Lone/me/calls/ui/view/RoundButtonView;", 0), new toc(CallJoinLinkPreviewWidget.class, "oneMeStackAvatarView", "getOneMeStackAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeStackAvatarView;", 0), new toc(CallJoinLinkPreviewWidget.class, "microphoneSwitch", "getMicrophoneSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), new toc(CallJoinLinkPreviewWidget.class, "videoSwitch", "getVideoSwitch()Lone/me/calls/ui/view/RoundButtonView;", 0), new toc(CallJoinLinkPreviewWidget.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(CallJoinLinkPreviewWidget.class, "previewView", "getPreviewView()Lone/me/calls/ui/view/CallUserView;", 0)};
    public final sn0 X;
    public final sn0 Y;
    public final sn0 Z;
    public final s2i a;
    public final bsb b;
    public final Object c;
    public final k18 d;
    public final sn0 o;
    public final sn0 s0;
    public final sn0 t0;
    public final bbd u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public final ka5 z0;

    public CallJoinLinkPreviewWidget(String str, Boolean bool) {
        this(gwi.b(new imb("call_join_link", str), new imb("is_video_call", bool)));
    }

    public static void D0(jtd jtdVar, Drawable drawable, Drawable drawable2, ms8 ms8Var, n5g n5gVar, n5g n5gVar2) {
        v1a v1aVar = a93.s0;
        jtdVar.setVisibility(ms8Var != ms8.d ? 0 : 8);
        int iOrdinal = ms8Var.ordinal();
        etd etdVar = etd.d;
        if (iOrdinal == 0) {
            jtdVar.A(drawable2, v1aVar.B(jtdVar).c.getIcon().g);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(n5gVar2);
        } else {
            if (iOrdinal == 1) {
                yeb yebVar = v1aVar.B(jtdVar).c;
                jtdVar.A(drawable, -1);
                jtdVar.setMode(etd.o);
                jtdVar.setAccessibility(n5gVar);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            jtdVar.A(drawable2, v1aVar.B(jtdVar).c.getIcon().c);
            jtdVar.setMode(etdVar);
            jtdVar.setAccessibility(n5gVar2);
        }
    }

    public final TextView A0() {
        yy7 yy7Var = A0[0];
        return (TextView) this.o.getValue();
    }

    public final jtd B0() {
        yy7 yy7Var = A0[4];
        return (jtd) this.s0.getValue();
    }

    public final he1 C0() {
        return (he1) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.c.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final eo7 getB() {
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.z0;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setLayoutParams(new kt3(-1, -1));
        v1a v1aVar = a93.s0;
        constraintLayout.setBackgroundColor(v1aVar.B(constraintLayout).c.b().k);
        FrameLayout frameLayout = new FrameLayout(constraintLayout.getContext());
        frameLayout.setId(j0b.i0);
        it1 it1Var = new it1(frameLayout.getContext(), 0);
        it1Var.setId(j0b.h0);
        it1Var.setMode(gt1.d);
        it1Var.H(null, it1Var.getContext().getString(m0b.w0));
        le1 le1Var = new le1(this);
        it1Var.h1 = zi1.c;
        it1Var.b1 = le1Var;
        it1Var.setCustomTheme(v1aVar.B(it1Var).c);
        frameLayout.addView(it1Var, -1, -1);
        constraintLayout.addView(frameLayout, -1, 0);
        constraintLayout.addView(A0(), -2, -2);
        yy7[] yy7VarArr = A0;
        yy7 yy7Var = yy7VarArr[1];
        sn0 sn0Var = this.X;
        constraintLayout.addView((jtd) sn0Var.getValue());
        constraintLayout.addView(z0());
        constraintLayout.addView(y0(), -2, -2);
        constraintLayout.addView(B0(), -2, -2);
        yy7 yy7Var2 = yy7VarArr[5];
        sn0 sn0Var2 = this.t0;
        constraintLayout.addView((OneMeButton) sn0Var2.getValue(), -1, -2);
        ut3 ut3VarG = l5j.g(constraintLayout);
        int id = A0().getId();
        ut3VarG.d(id, 6, 0, 6);
        float f = 60;
        az1.q(f, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id, 5));
        ut3VarG.d(id, 3, 0, 3);
        float f2 = 16;
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 7, 0, 7);
        new fua(ut3VarG, 7, id, 5).e(kti.d(f * vw4.d().getDisplayMetrics().density));
        ut3VarG.g(id).d.l0 = true;
        yy7 yy7Var3 = yy7VarArr[1];
        int id2 = ((jtd) sn0Var.getValue()).getId();
        ut3VarG.d(id2, 3, A0().getId(), 3);
        ut3VarG.d(id2, 4, A0().getId(), 4);
        ut3VarG.d(id2, 7, 0, 7);
        new fua(ut3VarG, 7, id2, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id3 = z0().getId();
        ut3VarG.d(id3, 3, A0().getId(), 4);
        float f3 = 24;
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        new fua(ut3VarG, 6, id3, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.d(id3, 4, frameLayout.getId(), 3);
        int id4 = frameLayout.getId();
        ut3VarG.d(id4, 3, z0().getId(), 4);
        az1.q(f3, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id4, 5));
        ut3VarG.d(id4, 7, 0, 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 7, id4, 5));
        ut3VarG.d(id4, 6, 0, 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id4, 5));
        yy7 yy7Var4 = yy7VarArr[5];
        ut3VarG.d(id4, 4, ((OneMeButton) sn0Var2.getValue()).getId(), 3);
        new fua(ut3VarG, 4, id4, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        int id5 = y0().getId();
        ut3VarG.d(id5, 4, frameLayout.getId(), 4);
        new fua(ut3VarG, 4, id5, 5).e(kti.d(f3 * vw4.d().getDisplayMetrics().density));
        ut3VarG.d(id5, 7, B0().getId(), 6);
        ut3VarG.d(id5, 6, 0, 6);
        ut3VarG.g(id5).d.V = 2;
        int id6 = B0().getId();
        ut3VarG.d(id6, 4, y0().getId(), 4);
        ut3VarG.d(id6, 3, y0().getId(), 3);
        ut3VarG.d(id6, 7, 0, 7);
        ut3VarG.d(id6, 6, y0().getId(), 7);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id6, 5));
        yy7 yy7Var5 = yy7VarArr[5];
        int id7 = ((OneMeButton) sn0Var2.getValue()).getId();
        ut3VarG.d(id7, 7, frameLayout.getId(), 7);
        new fua(ut3VarG, 7, id7, 5).e(kti.d(vw4.d().getDisplayMetrics().density * f2));
        ut3VarG.d(id7, 6, frameLayout.getId(), 6);
        az1.q(f2, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 6, id7, 5));
        ut3VarG.d(id7, 4, 0, 4);
        new fua(ut3VarG, 4, id7, 5).e(kti.d(f2 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(constraintLayout);
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        bsb bsbVar = this.b;
        if (i == 159 && bsbVar.b().c(qsb.m)) {
            C0().v(true);
        } else if (i == 160 && bsbVar.b().c(qsb.h)) {
            C0().u(true);
        } else {
            ((kj1) this.c.getValue()).b(i, strArr, iArr);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ci5 ci5Var = C0().A0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new me1(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().x0, getViewLifecycleOwner().p(), l38Var), new ne1(null, this), 1), getViewLifecycleScope());
    }

    public final jtd y0() {
        yy7 yy7Var = A0[3];
        return (jtd) this.Z.getValue();
    }

    public final kdb z0() {
        yy7 yy7Var = A0[2];
        return (kdb) this.Y.getValue();
    }

    public CallJoinLinkPreviewWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new s2i(this, 1);
        this.b = new bsb(rsb.a.a());
        this.c = ipi.b(3, new ie1(this, 0));
        this.d = createViewModelLazy(he1.class, new q(16, new m3(bundle, this, 13)));
        this.o = binding(new ie1(this, 7));
        this.X = binding(new ie1(this, 8));
        this.Y = binding(new ie1(this, 9));
        this.Z = binding(new ie1(this, 10));
        this.s0 = binding(new ie1(this, 11));
        this.t0 = binding(new ie1(this, 1));
        this.u0 = viewBinding(j0b.h0);
        this.v0 = ipi.b(3, new ie1(this, 2));
        this.w0 = ipi.b(3, new ie1(this, 3));
        this.x0 = ipi.b(3, new ie1(this, 5));
        this.y0 = ipi.b(3, new ie1(this, 6));
        this.z0 = new ka5(new g31(13), (cm6) null, 6);
    }
}
