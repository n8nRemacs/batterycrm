package one.me.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aw0;
import defpackage.az1;
import defpackage.b44;
import defpackage.b6g;
import defpackage.bbd;
import defpackage.bqi;
import defpackage.ccb;
import defpackage.cj8;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dq4;
import defpackage.enb;
import defpackage.eo7;
import defpackage.es0;
import defpackage.evd;
import defpackage.fdc;
import defpackage.fde;
import defpackage.ff1;
import defpackage.fvd;
import defpackage.g39;
import defpackage.g44;
import defpackage.g56;
import defpackage.gnc;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.h08;
import defpackage.h6j;
import defpackage.hdc;
import defpackage.hfh;
import defpackage.ho7;
import defpackage.i88;
import defpackage.imb;
import defpackage.in;
import defpackage.ipi;
import defpackage.jd0;
import defpackage.js0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kj1;
import defpackage.kmc;
import defpackage.l38;
import defpackage.l3b;
import defpackage.l48;
import defpackage.lmc;
import defpackage.mlc;
import defpackage.n5g;
import defpackage.njc;
import defpackage.nkc;
import defpackage.nlc;
import defpackage.olc;
import defpackage.ooi;
import defpackage.pdc;
import defpackage.plc;
import defpackage.pnc;
import defpackage.q07;
import defpackage.q2b;
import defpackage.qcb;
import defpackage.qlc;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.r40;
import defpackage.r5g;
import defpackage.rlc;
import defpackage.s3;
import defpackage.slc;
import defpackage.svi;
import defpackage.teh;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ue3;
import defpackage.uog;
import defpackage.v8b;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.veh;
import defpackage.vhb;
import defpackage.vid;
import defpackage.wib;
import defpackage.x8b;
import defpackage.xb3;
import defpackage.xfh;
import defpackage.xmc;
import defpackage.xnb;
import defpackage.xpb;
import defpackage.yfb;
import defpackage.yq5;
import defpackage.yud;
import defpackage.yy7;
import defpackage.z41;
import defpackage.zg5;
import defpackage.zlc;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lzlc;", "Lg44;", "Lqq3;", "Lg39;", "Ljd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lpdc;", "type", "", "isOpenedFromDialog", "(JLpdc;Z)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileScreen extends Widget implements zlc, g44, qq3, g39, jd0 {
    public static final /* synthetic */ yy7[] C0 = {new toc(ProfileScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), ho7.d(vid.a, ProfileScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new toc(ProfileScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ProfileScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), new toc(ProfileScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new toc(ProfileScreen.class, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0), new toc(ProfileScreen.class, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0), new toc(ProfileScreen.class, "linkView", "getLinkView()Lone/me/profile/LinkView;", 0), new toc(ProfileScreen.class, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0), new toc(ProfileScreen.class, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), new toc(ProfileScreen.class, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0), new toc(ProfileScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public final k18 A0;
    public final k18 B0;
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final Object d;
    public final bbd o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final bbd w0;
    public final bbd x0;
    public final bbd y0;
    public final k18 z0;

    public ProfileScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new hdc(13), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(pnc.class, new vdc(5, new l3b(bundle, 13, this)));
        this.d = ipi.b(3, new nlc(this, 0));
        this.o = viewBinding(v8b.j1);
        this.X = viewBinding(v8b.r1);
        this.Y = viewBinding(v8b.q1);
        this.Z = viewBinding(v8b.l1);
        this.s0 = viewBinding(v8b.k1);
        this.t0 = viewBinding(v8b.o1);
        this.u0 = viewBinding(v8b.n1);
        this.v0 = viewBinding(v8b.X);
        this.w0 = viewBinding(v8b.G);
        this.x0 = viewBinding(v8b.i1);
        viewBinding(v8b.W);
        this.y0 = childSlotRouter(v8b.p1);
        fdc fdcVar = fdc.a;
        this.z0 = fdcVar.getAccessor().d(10);
        this.A0 = fdcVar.getAccessor().d(151);
        this.B0 = fdcVar.getAccessor().d(156);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void y0(one.me.profile.ProfileScreen r2, defpackage.yfb r3, boolean r4) {
        /*
            android.widget.TextView r2 = r3.getTitle()
            float r2 = defpackage.b6g.e(r2)
            int r2 = defpackage.kpi.r(r2)
            r0 = 0
            if (r4 == 0) goto L20
            android.widget.TextView r1 = r3.getTitle()
            xzg r1 = defpackage.b6g.a(r1)
            if (r1 == 0) goto L1c
            int r1 = r1.a
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 != r2) goto L20
            return
        L20:
            if (r4 == 0) goto L3c
            android.widget.TextView r4 = r3.getTitle()
            xzg r4 = defpackage.b6g.a(r4)
            if (r4 == 0) goto L2e
            int r0 = r4.a
        L2e:
            if (r0 == r2) goto L3c
            xzg r4 = new xzg
            android.content.Context r0 = r3.getContext()
            rha r1 = defpackage.rha.z0
            r4.<init>(r0, r2, r1)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            android.widget.TextView r2 = r3.getTitle()
            defpackage.b6g.d(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.y0(one.me.profile.ProfileScreen, yfb, boolean):void");
    }

    public final TextView A0() {
        return (TextView) this.t0.D(this, C0[5]);
    }

    public final yfb B0() {
        return (yfb) this.Y.D(this, C0[2]);
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        String str;
        String string;
        i88 i88Var;
        String string2;
        i88 i88Var2;
        n5g n5gVar;
        str = "";
        if (i == v8b.e1) {
            Context context = getContext();
            pnc pncVarD0 = D0();
            String strO = pncVarD0.T0.o();
            str = strO != null ? strO : "";
            xfh.r(pncVarD0.E0, new kmc(new n5g(x8b.J0), Integer.valueOf(yud.v)));
            xb3.a(context, "+" + ((Object) str));
            return;
        }
        if (i == v8b.h1) {
            pnc pncVarD02 = D0();
            String strO2 = pncVarD02.T0.o();
            if (strO2 == null) {
                return;
            }
            xfh.r(pncVarD02.F0, new nkc("+".concat(strO2)));
            return;
        }
        if (i == v8b.g1) {
            D0().B(false);
            return;
        }
        if (i == v8b.f1) {
            D0().B(true);
            return;
        }
        if (i == v8b.V) {
            Context context2 = getContext();
            pnc pncVarD03 = D0();
            String strH = pncVarD03.T0.h();
            if (strH != null) {
                if (xb3.b()) {
                    xfh.r(pncVarD03.E0, new kmc(new n5g(x8b.r1), Integer.valueOf(yud.v)));
                }
                str = strH;
            }
            xb3.a(context2, str);
            return;
        }
        if (i == v8b.v0) {
            if (bundle != null) {
                long j = bundle.getLong("profile:participant_id_for_action");
                pnc pncVarD04 = D0();
                lmc lmcVarZ = pncVarD04.T0.z(j);
                if (lmcVarZ == null) {
                    return;
                }
                xfh.r(pncVarD04.E0, lmcVarZ);
                return;
            }
            return;
        }
        int i2 = evd.g;
        zg5 zg5Var = i88.Z;
        if (i == i2 || i == evd.e || i == evd.h || i == evd.i) {
            if (bundle == null || (string = bundle.getString("profile:contextmenu:link")) == null || (i88Var = (i88) ue3.J(bundle.getInt("profile:contextmenu:link_type", -1), zg5Var)) == null) {
                return;
            }
            D0().C(4, string, i88Var);
            D0().z(string, i88Var);
            return;
        }
        if ((i != evd.b && i != evd.a && i != evd.c && i != evd.d) || bundle == null || (string2 = bundle.getString("profile:contextmenu:link")) == null || (i88Var2 = (i88) ue3.J(bundle.getInt("profile:contextmenu:link_type", -1), zg5Var)) == null) {
            return;
        }
        D0().C(3, string2, i88Var2);
        xb3.a(getContext(), ooi.a(string2));
        if (xb3.b()) {
            int iV = az1.v(ooi.b(string2) ? 3 : ooi.c(string2) ? 2 : 1);
            if (iV == 0) {
                n5gVar = i88Var2 == i88.o ? new n5g(fvd.u) : new n5g(fvd.t);
            } else if (iV == 1) {
                n5gVar = new n5g(fvd.w);
            } else {
                if (iV != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n5gVar = new n5g(fvd.v);
            }
            ccb ccbVar = new ccb(this);
            ccbVar.g(n5gVar);
            ccbVar.e(new qcb(yud.t));
            ccbVar.i();
        }
    }

    public final EndlessRecyclerView2 C0() {
        return (EndlessRecyclerView2) this.X.D(this, C0[1]);
    }

    public final pnc D0() {
        return (pnc) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    public final void E0(String str, i88 i88Var, MotionEvent motionEvent) {
        List listJ;
        fde fdeVar = ((njc) D0().M0.getValue()).a;
        int iOrdinal = i88Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 4 || iOrdinal == 6) {
            int iV = az1.v(ooi.b(str) ? 3 : ooi.c(str) ? 2 : 1);
            if (iV != 0) {
                if (iV == 1) {
                    xpb xpbVar = (xpb) fdeVar.c;
                    listJ = ve3.j((b44) xpbVar.b, (b44) xpbVar.c);
                } else {
                    if (iV != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vhb vhbVar = (vhb) fdeVar.b;
                    listJ = ve3.j((b44) vhbVar.b, (b44) vhbVar.c);
                }
            } else if (i88Var == i88.o) {
                wib wibVar = (wib) ((h08) fdeVar.d).b;
                listJ = ve3.j((b44) wibVar.b, (b44) wibVar.c);
            } else {
                enb enbVar = (enb) fdeVar.a;
                listJ = ve3.j((b44) enbVar.b, (b44) enbVar.c);
            }
        } else {
            listJ = null;
        }
        if (listJ == null || listJ.isEmpty()) {
            return;
        }
        D0().C(2, str, i88Var);
        h6j.a(1).D().q(motionEvent.getRawX(), motionEvent.getRawY()).x(gwi.b(new imb("profile:contextmenu:link", str), new imb("profile:contextmenu:link_type", Integer.valueOf(i88Var.ordinal())))).G(new r5g(str)).o(listJ).build().u(this);
        View view = getView();
        if (view != null) {
            uog.i(view, q07.LONG_PRESS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x01f3  */
    @Override // defpackage.qq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.g(int, android.os.Bundle):void");
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            pnc pncVarD0 = D0();
            svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).b().plus(pncVarD0.w()), null, new xmc(pncVarD0, intent != null ? intent.getData() : null, null), 2);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new es0(12, this));
        } else if (b6g.c(B0().getTitle())) {
            y0(this, B0(), true);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mlc mlcVar = new mlc(this, 2);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(v8b.m1);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        mlcVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!z0().b(i, strArr, iArr) && i == 158 && ((qsb) this.z0.getValue()).c(strArr)) {
            D0().D();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 3;
        svi.e(getViewLifecycleScope(), null, null, new olc(null, this), 3);
        tqi.c(new s3(this, null, 26), view);
        EndlessRecyclerView2 endlessRecyclerView2C0 = C0();
        int i2 = 7;
        dq4 dq4Var = new dq4(new js0(i, this), i2, new Rect(endlessRecyclerView2C0.getPaddingLeft(), endlessRecyclerView2C0.getPaddingTop(), endlessRecyclerView2C0.getPaddingRight(), endlessRecyclerView2C0.getPaddingBottom()));
        WeakHashMap weakHashMap = hfh.a;
        veh.u(endlessRecyclerView2C0, dq4Var);
        if (endlessRecyclerView2C0.F0) {
            teh.c(endlessRecyclerView2C0);
        } else {
            endlessRecyclerView2C0.addOnAttachStateChangeListener(new r40(endlessRecyclerView2C0, i2, endlessRecyclerView2C0));
        }
        yq5 yq5Var = new yq5();
        yy7[] yy7VarArr = C0;
        yy7 yy7Var = yy7VarArr[0];
        bbd bbdVar = this.o;
        ((in) bbdVar.D(this, yy7Var)).a(bqi.b(new ff1(yq5Var, this, i), (in) bbdVar.D(this, yy7VarArr[0]), getViewLifecycleOwner()));
        d53 d53Var = new d53(D0().S0, 12);
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new plc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(gw0.m(new z41(D0().O0, D0().Q0, new cj8(3, null, 3), 3)), getViewLifecycleOwner().p(), l38Var), new qlc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new xnb(D0().E0, 6), getViewLifecycleOwner().p(), l38Var), new rlc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().F0, getViewLifecycleOwner().p(), l38Var), new slc(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        D0().A(str, rectF);
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        pnc pncVarD0 = D0();
        svi.e(pncVarD0.a, ((q2b) pncVarD0.x()).b().plus(pncVarD0.w()), null, new gnc(pncVarD0, rectF, null), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final kj1 z0() {
        return (kj1) this.d.getValue();
    }

    public ProfileScreen(long j, pdc pdcVar, boolean z) {
        this(gwi.b(new imb("profile:id", Long.valueOf(j)), new imb("profile:id_type", pdcVar), new imb("profile:opened_from_dialog", Boolean.valueOf(z))));
    }
}
