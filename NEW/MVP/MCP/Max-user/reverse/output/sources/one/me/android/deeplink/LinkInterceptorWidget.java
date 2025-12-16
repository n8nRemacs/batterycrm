package one.me.android.deeplink;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.b68;
import defpackage.b6a;
import defpackage.c38;
import defpackage.ccb;
import defpackage.cdb;
import defpackage.em6;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.imb;
import defpackage.ipi;
import defpackage.j48;
import defpackage.jva;
import defpackage.k18;
import defpackage.kcb;
import defpackage.kj1;
import defpackage.ln;
import defpackage.m11;
import defpackage.qcb;
import defpackage.qq3;
import defpackage.s78;
import defpackage.t78;
import defpackage.tk4;
import defpackage.u78;
import defpackage.v78;
import defpackage.w68;
import defpackage.wu7;
import defpackage.wxc;
import defpackage.x78;
import defpackage.yo3;
import defpackage.yvi;
import defpackage.z44;
import defpackage.z7;
import kotlin.Metadata;
import one.me.android.MainActivity;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/android/deeplink/LinkInterceptorWidget;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Landroid/net/Uri;", "uri", "Lw68;", "result", "(Landroid/net/Uri;Lw68;)V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LinkInterceptorWidget extends Widget implements qq3 {
    public static final /* synthetic */ int d = 0;
    public final k18 a;
    public final Object b;
    public final boolean c;

    public LinkInterceptorWidget(Uri uri, w68 w68Var) {
        this(gwi.b(new imb("uri", uri), new imb("link_result", w68Var)));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ((kj1) this.b.getValue()).g(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: isDialog, reason: from getter */
    public final boolean getA0() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(viewGroup.getContext(), null);
        coordinatorLayout.setId(wxc.link_interceptor_widget_view);
        coordinatorLayout.setBackgroundColor(0);
        return coordinatorLayout;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((kj1) this.b.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        jva onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            j48 viewLifecycleOwner = getViewLifecycleOwner();
            z44 z44Var = new z44(true, (em6) new wu7(3, this));
            if (viewLifecycleOwner != null) {
                onBackPressedDispatcher.a(viewLifecycleOwner, z44Var);
            } else {
                onBackPressedDispatcher.b(z44Var);
            }
        }
        Uri uri = (Uri) yvi.a(getArgs(), "uri", Uri.class);
        t78 t78Var = (t78) this.a.getValue();
        w68 w68Var = (w68) yvi.a(getArgs(), "link_result", w68.class);
        t78Var.getClass();
        gw0.w(new g56(gw0.E(w68Var != null ? new m11(13, w68Var) : uri == null ? new m11(13, b68.a) : ((s78) t78Var.b.getValue()).e(uri), new v78(3, null, 0)), new x78(this, uri, null), 1), getViewLifecycleScope());
    }

    public final void y0(boolean z, ln lnVar, int i, int i2) {
        cdb cdbVar = new cdb(new qcb(i2), z7.e(getContext(), i), null, new kcb(2, 0, 0, 6));
        if (z) {
            int i3 = MainActivity.a1;
            b6a.W(lnVar, null, cdbVar, null, 10);
            lnVar.finish();
        } else {
            ccb ccbVar = new ccb(this);
            ccbVar.b = cdbVar;
            ccbVar.i();
        }
    }

    public LinkInterceptorWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(t78.class, new yo3(25, new c38(1)));
        this.b = ipi.b(3, new u78(this, 0));
        this.c = true;
    }

    public /* synthetic */ LinkInterceptorWidget(Uri uri, w68 w68Var, int i, tk4 tk4Var) {
        this(uri, (i & 2) != 0 ? null : w68Var);
    }
}
