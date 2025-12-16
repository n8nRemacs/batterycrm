package one.me.pinbars;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a0c;
import defpackage.aw0;
import defpackage.b0c;
import defpackage.b1e;
import defpackage.c0c;
import defpackage.dz6;
import defpackage.e0c;
import defpackage.f0c;
import defpackage.g0c;
import defpackage.g56;
import defpackage.grg;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h0c;
import defpackage.hbd;
import defpackage.i0c;
import defpackage.imb;
import defpackage.k18;
import defpackage.k8b;
import defpackage.kga;
import defpackage.kj1;
import defpackage.kti;
import defpackage.l38;
import defpackage.l48;
import defpackage.n8b;
import defpackage.ncg;
import defpackage.qq3;
import defpackage.qzb;
import defpackage.s0a;
import defpackage.tk4;
import defpackage.tqi;
import defpackage.uxb;
import defpackage.vw4;
import defpackage.yzb;
import defpackage.zzb;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/pinbars/PinBarsWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lb1e;", "scopeId", "(Ljava/lang/String;Ltk4;)V", "tzb", "pinbars_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinBarsWidget extends Widget implements qq3 {
    public static final /* synthetic */ int u0 = 0;
    public n8b X;
    public grg Y;
    public dz6 Z;
    public ncg a;
    public final k18 b;
    public final k18 c;
    public final Object d;
    public s0a o;
    public n8b s0;
    public final AutoTransition t0;

    /* JADX WARN: Multi-variable type inference failed */
    public PinBarsWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.d.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(k8b.j);
        linearLayout.setShowDividers(7);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        tqi.c(new kga(shapeDrawable, (Continuation) null, 7), linearLayout);
        shapeDrawable.setIntrinsicHeight(kti.c(vw4.d().getDisplayMetrics().density * 0.5d));
        linearLayout.setDividerDrawable(shapeDrawable);
        return linearLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o = null;
        this.Y = null;
        this.X = null;
        this.Z = null;
        y0().Z.f();
        ncg ncgVar = this.a;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        this.a = null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((kj1) this.d.getValue()).b(i, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, x26] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, x26] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gw0.w(new g56(y0().s0, new f0c(view, null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(y0().z0, new g0c(view, null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(new uxb(y0().A0, this, 3), new h0c(null, this), 1), getViewLifecycleScope());
        hbd hbdVar = y0().v0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new yzb(view, null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().w0, getViewLifecycleOwner().p(), l38Var), new zzb(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().C0, getViewLifecycleOwner().p(), l38Var), new a0c(view, null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().D0, getViewLifecycleOwner().p(), l38Var), new b0c(2, null), 1), getViewLifecycleScope());
        gw0.w(gw0.j(y0().y0, y0().s0, y0().t0, y0().v0, new i0c(this, view, null)), getViewLifecycleScope());
        gw0.w(new g56(y0().E0, new e0c(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().u0, getViewLifecycleOwner().p(), l38Var), new c0c(null, this), 1), getViewLifecycleScope());
    }

    public final qzb y0() {
        return (qzb) this.c.getValue();
    }

    public PinBarsWidget(String str, tk4 tk4Var) {
        this(gwi.b(new imb(Widget.ARG_SCOPE_ID, new b1e(str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PinBarsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            if (r4 == 0) goto L16
            java.lang.String r1 = "arg_key_scope_id"
            android.os.Parcelable r4 = r4.getParcelable(r1)
            b1e r4 = (defpackage.b1e) r4
            if (r4 == 0) goto L14
            java.lang.String r2 = r4.a
        L14:
            if (r2 != 0) goto L18
        L16:
            java.lang.String r2 = ""
        L18:
            zfb r4 = new zfb
            r1 = 16
            r4.<init>(r1)
            java.lang.Class<ozb> r1 = defpackage.ozb.class
            k18 r4 = r3.m39getSharedViewModelcp94BC8(r2, r1, r4)
            r3.b = r4
            szb r4 = new szb
            r1 = 2
            r4.<init>(r3, r1)
            iv8 r1 = new iv8
            r2 = 27
            r1.<init>(r2, r4)
            java.lang.Class<qzb> r4 = defpackage.qzb.class
            k18 r4 = r3.createViewModelLazy(r4, r1)
            r3.c = r4
            szb r4 = new szb
            r1 = 3
            r4.<init>(r3, r1)
            k18 r4 = defpackage.ipi.b(r1, r4)
            r3.d = r4
            android.transition.AutoTransition r4 = new android.transition.AutoTransition
            r4.<init>()
            r4.setOrdering(r0)
            r0 = 150(0x96, double:7.4E-322)
            r4.setDuration(r0)
            r3.t0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.pinbars.PinBarsWidget.<init>(android.os.Bundle):void");
    }

    public /* synthetic */ PinBarsWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }
}
