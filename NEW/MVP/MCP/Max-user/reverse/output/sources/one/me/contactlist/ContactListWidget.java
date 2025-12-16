package one.me.contactlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a93;
import defpackage.api;
import defpackage.aw0;
import defpackage.az1;
import defpackage.az3;
import defpackage.b0i;
import defpackage.b14;
import defpackage.b44;
import defpackage.bbd;
import defpackage.bda;
import defpackage.bwf;
import defpackage.bz3;
import defpackage.c7j;
import defpackage.ccb;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.cv6;
import defpackage.cz3;
import defpackage.dv6;
import defpackage.dz3;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gz3;
import defpackage.hd5;
import defpackage.ho7;
import defpackage.hs;
import defpackage.hz3;
import defpackage.i4d;
import defpackage.i62;
import defpackage.i84;
import defpackage.ia;
import defpackage.imb;
import defpackage.ipi;
import defpackage.ji0;
import defpackage.jva;
import defpackage.jyc;
import defpackage.jz3;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kd5;
import defpackage.kj1;
import defpackage.kt3;
import defpackage.kz3;
import defpackage.l14;
import defpackage.l38;
import defpackage.l48;
import defpackage.lz3;
import defpackage.mvd;
import defpackage.mz3;
import defpackage.n5g;
import defpackage.nx3;
import defpackage.nz3;
import defpackage.okf;
import defpackage.oz3;
import defpackage.p23;
import defpackage.pb3;
import defpackage.ps3;
import defpackage.px3;
import defpackage.q3e;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.qtb;
import defpackage.r5j;
import defpackage.rsb;
import defpackage.rx1;
import defpackage.s14;
import defpackage.s2i;
import defpackage.s3;
import defpackage.s3e;
import defpackage.s5b;
import defpackage.sn0;
import defpackage.svi;
import defpackage.t9f;
import defpackage.tk4;
import defpackage.toc;
import defpackage.tqi;
import defpackage.tx1;
import defpackage.tx3;
import defpackage.u14;
import defpackage.u1b;
import defpackage.u5b;
import defpackage.usd;
import defpackage.v1b;
import defpackage.ve3;
import defpackage.vid;
import defpackage.w4e;
import defpackage.wj1;
import defpackage.wrb;
import defpackage.x3b;
import defpackage.xfh;
import defpackage.xx3;
import defpackage.y9b;
import defpackage.yfb;
import defpackage.ym3;
import defpackage.yo3;
import defpackage.yud;
import defpackage.yx1;
import defpackage.yy7;
import defpackage.z41;
import defpackage.z8a;
import defpackage.zh0;
import defpackage.zm3;
import defpackage.zy3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\tB\u0013\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lbda;", "Lpx3;", "Lcv6;", "Lb14;", "Ls14;", "Lg44;", "Lqq3;", "Ls3e;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lhz3;", "type", "(Lhz3;)V", "contact-list_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContactListWidget extends Widget implements bda, px3, cv6, b14, s14, g44, qq3, s3e {
    public static final /* synthetic */ yy7[] O0 = {new toc(ContactListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), ho7.d(vid.a, ContactListWidget.class, "snackBar", "getSnackBar()Lone/me/sdk/snackbar/OneMeSnackbar;", 0), new toc(ContactListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new z8a(ContactListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new z8a(ContactListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new z8a(ContactListWidget.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new z8a(ContactListWidget.class, "isInSearch", "isInSearch()Z"), new z8a(ContactListWidget.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), new z8a(ContactListWidget.class, "isPermissionChecked", "isPermissionChecked()Z")};
    public final sn0 A0;
    public final bbd B0;
    public final Object C0;
    public final List D0;
    public final k18 E0;
    public final k18 F0;
    public final bwf G0;
    public final t9f H0;
    public final hs I0;
    public final hs J0;
    public final hs K0;
    public final hs L0;
    public final hs M0;
    public final ka5 N0;
    public final b0i X;
    public final ji0 Y;
    public final b0i Z;
    public final eo7 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final ExecutorService o;
    public final ji0 s0;
    public final ji0 t0;
    public final zm3 u0;
    public final k18 v0;
    public final sn0 w0;
    public final Object x0;
    public final Object y0;
    public final k18 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactListWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.b14
    public final void A(int i) {
        int iV = az1.v(i);
        if (iV == 5 || iV == 6) {
            z0().j(new s2i(this, 1), qsb.h, 160);
        } else {
            E0();
        }
    }

    public final CharSequence A0() {
        yy7 yy7Var = O0[5];
        return (CharSequence) this.J0.a(this);
    }

    public final yfb B0() {
        yy7 yy7Var = O0[0];
        return (yfb) this.w0.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        yy7[] yy7VarArr = O0;
        yy7 yy7Var = yy7VarArr[4];
        hs hsVar = this.I0;
        Long l = (Long) hsVar.a(this);
        long jLongValue = l != null ? l.longValue() : 0L;
        qt7 qt7Var = (qt7) this.H0.D(this, yy7VarArr[3]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        yy7 yy7Var2 = yy7VarArr[4];
        hsVar.b(this, null);
        C0().u(i, jLongValue);
    }

    public final zy3 C0() {
        return (zy3) this.v0.getValue();
    }

    public final boolean D0() {
        yy7 yy7Var = O0[6];
        return ((Boolean) this.K0.a(this)).booleanValue();
    }

    public final void E0() {
        z0().j(new s2i(this, 1), qsb.e, 156);
    }

    public final void F0() {
        boolean zB = ((nx3) C0().E0.i.a.getValue()).b();
        ji0 ji0Var = this.s0;
        ji0 ji0Var2 = this.t0;
        if (!zB || !D0()) {
            CharSequence charSequenceA0 = A0();
            ji0Var2.E((charSequenceA0 == null || charSequenceA0.length() == 0) ? (List) ((zh0) this.z0.getValue()).Z.a.getValue() : hd5.a);
            ji0Var.E(null);
        } else {
            boolean zC = z0().c(qsb.f);
            int i = yud.a;
            int i2 = v1b.a;
            u14 u14Var = new u14(zC ? v1b.s : v1b.r, zC ? null : Integer.valueOf(v1b.q));
            ji0Var2.E(null);
            ji0Var.E(Collections.singletonList(u14Var));
        }
    }

    @Override // defpackage.cv6
    public final void L(dv6 dv6Var) {
        api.c(this);
        svi.e(getViewLifecycleScope(), null, null, new kz3(this, dv6Var, null), 3);
    }

    @Override // defpackage.cv6
    public final void Q(dv6 dv6Var, boolean z) {
        y0().f = 1;
        y0().d = rx1.c;
        y0().i(tx1.CALL_CONTACT, z);
        svi.e(getViewLifecycleScope(), null, null, new jz3(this, dv6Var, z, null), 3);
    }

    @Override // defpackage.px3
    public final void S() {
        yy7 yy7Var = O0[1];
        ccb ccbVar = (ccb) this.A0.getValue();
        ccbVar.h(getContext().getString(v1b.u));
        ccbVar.i();
    }

    @Override // defpackage.s14
    public final void W() {
        E0();
    }

    @Override // defpackage.px3
    public final void d(long j) {
        Object next;
        List list = ((nx3) C0().C0.a.getValue()).c;
        qtb qtbVar = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((xx3) next).a == j) {
                        break;
                    }
                }
            }
            xx3 xx3Var = (xx3) next;
            if (xx3Var != null) {
                qtbVar = xx3Var.v0;
            }
        }
        if (qtbVar != null) {
            C0().v();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.px3
    public final void f(long j, boolean z) {
        y0().f = 1;
        y0().d = rx1.c;
        y0().i(tx1.CALL_CONTACT, z);
        api.c(this);
        ((kj1) this.C0.getValue()).l(j, z, new cz3(j, z));
    }

    @Override // defpackage.s3e
    public final void f0() {
        xfh.r(C0().G0, q3e.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (((kj1) this.C0.getValue()).g(i) || bundle == null) {
            return;
        }
        C0().u(i, bundle.getLong("selected.contactId.Action"));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.N0;
    }

    @Override // defpackage.px3
    public final void i(long j, View view) {
        int iOrdinal = C0().b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr = O0;
            yy7 yy7Var = yy7VarArr[4];
            if (((Long) this.I0.a(this)) == null) {
                yy7 yy7Var2 = yy7VarArr[3];
                t9f t9fVar = this.H0;
                qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var2);
                if (qt7Var == null || !qt7Var.isActive()) {
                    t9fVar.O(this, yy7VarArr[3], svi.e(getViewLifecycleScope(), null, i84.b, new oz3(this, j, view, null), 1));
                }
            }
        }
    }

    @Override // defpackage.bda
    public final f1e n() {
        return D0() ? f1e.CONTACTS_SEARCH : f1e.CONTACTS_TAB;
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        yy7[] yy7VarArr = O0;
        yy7 yy7Var = yy7VarArr[8];
        hs hsVar = this.M0;
        if (((Boolean) hsVar.a(this)).booleanValue()) {
            return;
        }
        yy7 yy7Var2 = yy7VarArr[8];
        hsVar.b(this, Boolean.TRUE);
        boolean zC = z0().c(qsb.f);
        k18 k18Var = this.F0;
        if (!zC) {
            ((w4e) ((pb3) k18Var.getValue())).G();
            qsb qsbVarZ0 = z0();
            s2i s2iVar = new s2i(this, 1);
            qsbVarZ0.getClass();
            qsb.f(qsbVarZ0, s2iVar, qsb.e, 156, true, i4d.permissions_contacts_request_rationale, i4d.permissions_contacts_request, i4d.permissions_dialog_yes, new wrb(y9b.e), null, 256);
            return;
        }
        qsb qsbVarZ02 = z0();
        String[] strArr = qsb.g;
        if (qsbVarZ02.c(strArr)) {
            return;
        }
        w4e w4eVar = (w4e) ((pb3) k18Var.getValue());
        if (((Boolean) w4eVar.L.D(w4eVar, w4e.m0[29])).booleanValue()) {
            return;
        }
        ((w4e) ((pb3) k18Var.getValue())).G();
        z0().j(new s2i(this, 1), strArr, 156);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(u1b.p);
        yfb yfbVarB0 = B0();
        kt3 kt3Var = new kt3(-1, -2);
        kt3Var.i = 0;
        kt3Var.e = 0;
        kt3Var.h = 0;
        constraintLayout.addView(yfbVarB0, kt3Var);
        x3b x3bVar = new x3b(constraintLayout.getContext());
        x3bVar.setIcon(yud.o0);
        x3bVar.setTitle(new n5g(v1b.p));
        x3bVar.setSubtitle(new n5g(v1b.o));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(constraintLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(jyc.oneme_contactlist_rv);
        endlessRecyclerView2.setItemAnimator(null);
        zm3 zm3Var = this.u0;
        endlessRecyclerView2.setAdapter(zm3Var);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setEmptyView(x3bVar);
        r5j r5jVar = new r5j(24, new bz3(this, 0));
        okf okfVar = new okf(endlessRecyclerView2, zm3Var, r5jVar);
        endlessRecyclerView2.j(okfVar);
        endlessRecyclerView2.j(new tx3(r5jVar, a93.s0.y(endlessRecyclerView2), new i62(17, this)));
        int i = 12;
        okf okfVar2 = new okf(endlessRecyclerView2, zm3Var, new usd(i, new ia(this, i, endlessRecyclerView2)));
        endlessRecyclerView2.j(okfVar2);
        tqi.c(new s3(okfVar, okfVar2, null, 9), endlessRecyclerView2);
        kt3 kt3Var2 = new kt3(-1, 0);
        kt3Var2.j = B0().getId();
        kt3Var2.e = 0;
        kt3Var2.h = 0;
        kt3Var2.l = 0;
        constraintLayout.addView(endlessRecyclerView2, kt3Var2);
        kt3 kt3Var3 = new kt3(-1, 0);
        kt3Var3.j = B0().getId();
        kt3Var3.e = 0;
        kt3Var3.h = 0;
        kt3Var3.l = 0;
        constraintLayout.addView(x3bVar, kt3Var3);
        return constraintLayout;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((EndlessRecyclerView2) this.B0.D(this, O0[2])).setAdapter(null);
        ((lz3) this.x0.getValue()).e();
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7[] yy7VarArr = O0;
        qt7 qt7Var = (qt7) this.H0.D(this, yy7VarArr[3]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        yy7 yy7Var = yy7VarArr[4];
        this.I0.b(this, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (((kj1) this.C0.getValue()).b(i, strArr, iArr)) {
            return;
        }
        if (i == 156) {
            qsb qsbVarZ0 = z0();
            s2i s2iVar = new s2i(this, 1);
            String[] strArr2 = qsb.e;
            int i2 = mvd.a1;
            int i3 = mvd.b1;
            wrb wrbVar = new wrb(y9b.e);
            qsbVarZ0.getClass();
            qsb.r(s2iVar, strArr, iArr, strArr2, i2, i3, wrbVar);
        }
        F0();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        jva jvaVarH = getRouter().h();
        if (jvaVarH != null) {
            jvaVarH.a(getViewLifecycleOwner(), (lz3) this.x0.getValue());
        }
        gw0.w(new z41(C0().C0, ((zh0) this.z0.getValue()).Z, new s3(this, null, 10), 3), getViewLifecycleScope());
        gw0.w(new g56(C0().I0, new mz3(this, null), 1), getViewLifecycleScope());
        gw0.w(new g56(C0().E0.i, new nz3(this, null), 1), getViewLifecycleScope());
    }

    @Override // defpackage.b14
    public final void x() {
        E0();
    }

    public final yx1 y0() {
        return (yx1) this.c.getValue();
    }

    @Override // defpackage.px3
    public final void z(long j) {
        api.c(this);
        C0().u(u1b.j, j);
    }

    public final qsb z0() {
        return (qsb) this.E0.getValue();
    }

    public /* synthetic */ ContactListWidget(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactListWidget(Bundle bundle) {
        int i = 0;
        int i2 = 2;
        super(bundle, i, i2, null);
        this.a = eo7.f;
        l14 l14Var = l14.a;
        this.b = l14Var.getAccessor().d(151);
        this.c = l14Var.getAccessor().d(156);
        this.d = l14Var.getAccessor().d(487);
        ExecutorService executorServiceA = ((g4b) l14Var.getAccessor().c(56)).a();
        this.o = executorServiceA;
        b0i b0iVar = new b0i(this, executorServiceA, i2);
        this.X = b0iVar;
        ji0 ji0Var = new ji0((cv6) this, executorServiceA);
        this.Y = ji0Var;
        b0i b0iVar2 = new b0i(this, executorServiceA, i2);
        this.Z = b0iVar2;
        ji0 ji0Var2 = new ji0((s14) this, executorServiceA);
        this.s0 = ji0Var2;
        ji0 ji0Var3 = new ji0((b14) this, executorServiceA);
        this.t0 = ji0Var3;
        int i3 = 5;
        int i4 = 3;
        int i5 = 4;
        zm3 zm3Var = new zm3(new ym3(false, 1), ji0Var3, b0iVar, ji0Var, b0iVar2, ji0Var2);
        az3 az3Var = new az3(this, i);
        int i6 = 7;
        zm3Var.z(new kd5(i6, az3Var));
        this.u0 = zm3Var;
        this.v0 = createViewModelLazy(zy3.class, new yo3(i3, new wj1(bundle, i4)));
        this.w0 = binding(new az3(this, i4));
        this.x0 = ipi.b(3, new az3(this, i5));
        this.y0 = ipi.b(3, new wj1(bundle, i5));
        int i7 = 6;
        this.z0 = createViewModelLazy(zh0.class, new yo3(i7, new az3(this, i3)));
        this.A0 = binding(new az3(this, i7));
        this.B0 = viewBinding(jyc.oneme_contactlist_rv);
        this.C0 = ipi.b(3, new az3(this, i6));
        this.D0 = ve3.j(new b44(u1b.s, new n5g(v1b.l), Integer.valueOf(yud.I0), (Integer) null, 20), new b44(u1b.t, new n5g(mvd.a), Integer.valueOf(yud.Z1), (Integer) null, 20), new b44(s5b.d, new n5g(u5b.e), Integer.valueOf(yud.a1), (Integer) null, 20), new b44(s5b.e, new n5g(u5b.f), Integer.valueOf(yud.e0), (Integer) null, 20));
        this.E0 = rsb.a.a();
        this.F0 = l14Var.getAccessor().d(46);
        l14Var.getAccessor().d(47);
        l14Var.getAccessor().d(318);
        this.G0 = new bwf(new ps3(4));
        this.H0 = c7j.c();
        this.I0 = new hs(Long.class, null, "selected.contactId.Action");
        this.J0 = new hs(CharSequence.class, null, "contact_list_widget_search_query");
        Boolean bool = Boolean.FALSE;
        this.K0 = new hs(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.L0 = new hs(Boolean.class, bool, "contact_list_widget_is_need_scroll_to_top");
        this.M0 = new hs(Boolean.class, bool, "contact_list_widget_permission_check");
        this.N0 = new ka5(new az3(this, 8), (cm6) null, 6);
        ci5 ci5Var = C0().F0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new dz3(this, null), 1), getLifecycleScope());
        gw0.w(new g56(new p23(aw0.a(C0().G0, this.lifecycleOwner.p(), l38Var), 1), new gz3(this, null), 1), getLifecycleScope());
    }

    public ContactListWidget(hz3 hz3Var) {
        this(gwi.b(new imb("contact_screen_open_mode", hz3Var.name())));
    }
}
