package one.me.profileedit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ahc;
import defpackage.api;
import defpackage.aw0;
import defpackage.b95;
import defpackage.bbd;
import defpackage.bgc;
import defpackage.bhc;
import defpackage.bqi;
import defpackage.cgc;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.d53;
import defpackage.dfc;
import defpackage.e95;
import defpackage.eo7;
import defpackage.fb6;
import defpackage.ff1;
import defpackage.fhc;
import defpackage.g39;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.imb;
import defpackage.in;
import defpackage.jc3;
import defpackage.jd0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l3b;
import defpackage.lgc;
import defpackage.mgc;
import defpackage.n5g;
import defpackage.ngc;
import defpackage.ogc;
import defpackage.pgc;
import defpackage.pq3;
import defpackage.q2b;
import defpackage.qgc;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.r8b;
import defpackage.rfc;
import defpackage.sn0;
import defpackage.svi;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u8b;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.xc0;
import defpackage.xfh;
import defpackage.yec;
import defpackage.yfb;
import defpackage.ygc;
import defpackage.yq5;
import defpackage.yy7;
import defpackage.zfc;
import kotlin.Metadata;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqq3;", "Lg39;", "Ljd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ldfc;", "type", "(JLdfc;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileEditScreen extends Widget implements qq3, g39, jd0 {
    public static final /* synthetic */ yy7[] x0 = {new toc(ProfileEditScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), ho7.d(vid.a, ProfileEditScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(ProfileEditScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ProfileEditScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), new toc(ProfileEditScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0)};
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final long a;
    public final ka5 b;
    public final eo7 c;
    public final k18 d;
    public final fb6 o;
    public final bbd s0;
    public final bbd t0;
    public final k18 u0;
    public final k18 v0;
    public final sn0 w0;

    public ProfileEditScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = bundle.getLong("profile:id");
        final int i = 0;
        this.b = new ka5(new cm6(this) { // from class: jgc
            public final /* synthetic */ ProfileEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                ProfileEditScreen profileEditScreen = this.b;
                switch (i2) {
                    case 0:
                        return profileEditScreen.a == ((w4e) ((pb3) yec.a.getAccessor().d(46).getValue())).s() ? f1e.SETTINGS_PROFILE_EDITING : f1e.CHAT_INFO_EDITING;
                    default:
                        yy7[] yy7VarArr = ProfileEditScreen.x0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), null);
                        oneMeButton.setId(r8b.c0);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setAppearance(gza.d);
                        d74 d74Var = new d74(-1, -2);
                        d74Var.c = 80;
                        float f = 16;
                        d74Var.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(d74Var);
                        oneMeButton.setText(u8b.Q);
                        f8j.d(oneMeButton, 300L, new kgc(profileEditScreen, 1));
                        return oneMeButton;
                }
            }
        }, (cm6) null, 6);
        this.c = eo7.f;
        this.d = createViewModelLazy(fhc.class, new vdc(2, new l3b(this, 10, bundle)));
        yec yecVar = yec.a;
        this.o = new fb6(((g4b) yecVar.getAccessor().c(56)).a(), this, 6);
        this.X = viewBinding(r8b.T);
        this.Y = viewBinding(r8b.q0);
        this.Z = viewBinding(r8b.p0);
        this.s0 = viewBinding(r8b.a0);
        this.t0 = viewBinding(r8b.U);
        this.u0 = yecVar.getAccessor().d(10);
        this.v0 = yecVar.getAccessor().d(151);
        gw0.w(new g56(new d53(z0().s0, 12), new mgc(this, null), 1), getLifecycleScope());
        gw0.w(aw0.a(new g56(new d53(z0().v0, 12), new ngc(this, null), 1), this.lifecycleOwner.p(), l38.o), getLifecycleScope());
        gw0.w(new g56(z0().w0, new ogc(this, null), 1), getLifecycleScope());
        final int i2 = 1;
        this.w0 = binding(new cm6(this) { // from class: jgc
            public final /* synthetic */ ProfileEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                ProfileEditScreen profileEditScreen = this.b;
                switch (i22) {
                    case 0:
                        return profileEditScreen.a == ((w4e) ((pb3) yec.a.getAccessor().d(46).getValue())).s() ? f1e.SETTINGS_PROFILE_EDITING : f1e.CHAT_INFO_EDITING;
                    default:
                        yy7[] yy7VarArr = ProfileEditScreen.x0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), null);
                        oneMeButton.setId(r8b.c0);
                        oneMeButton.setSize(jza.c);
                        oneMeButton.setMode(iza.a);
                        oneMeButton.setAppearance(gza.d);
                        d74 d74Var = new d74(-1, -2);
                        d74Var.c = 80;
                        float f = 16;
                        d74Var.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), 0, kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(12 * vw4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(d74Var);
                        oneMeButton.setText(u8b.Q);
                        f8j.d(oneMeButton, 300L, new kgc(profileEditScreen, 1));
                        return oneMeButton;
                }
            }
        });
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        fhc fhcVarZ0 = z0();
        b95 b95Var = fhcVarZ0.b;
        ci5 ci5Var = fhcVarZ0.v0;
        if (i == r8b.c0) {
            xfh.r(ci5Var, zfc.b);
            return;
        }
        if (i == r8b.b0) {
            xfh.r(ci5Var, jc3.b);
            return;
        }
        if (i == r8b.Z) {
            xfh.r(ci5Var, bgc.b);
            return;
        }
        if (i == r8b.X) {
            rfc rfcVar = rfc.c;
            long jE = b95Var.e();
            rfcVar.getClass();
            xc0.l(":neuro-avatars?id=" + jE, ci5Var);
            return;
        }
        if (i == r8b.Y) {
            fhcVarZ0.u();
            return;
        }
        if (i == r8b.W) {
            b95Var.j();
        } else {
            if (i == r8b.e || i == r8b.f0 || i == r8b.V) {
                return;
            }
            b95Var.g(i);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getB() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        api.c(this);
        fhc fhcVarZ0 = z0();
        b95 b95Var = fhcVarZ0.b;
        e95 e95Var = (e95) b95Var.i.getValue();
        Boolean bool = null;
        if (e95Var != null && e95Var.a((e95) b95Var.j.getValue())) {
            xfh.r(fhcVarZ0.v0, new cgc(new n5g(u8b.P), null, ve3.j(new pq3(r8b.c0, new n5g(u8b.Q), 3, 56), new pq3(r8b.b0, new n5g(u8b.O), 2, 56))));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : super.handleBack();
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            fhc fhcVarZ0 = z0();
            svi.e(fhcVarZ0.a, ((q2b) fhcVarZ0.t()).b(), null, new ygc(fhcVarZ0, intent != null ? intent.getData() : null, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        lgc lgcVar = new lgc(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(r8b.a);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tqi.c(new pgc(3, null, 0), coordinatorLayout);
        lgcVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qsb) this.u0.getValue()).c(strArr)) {
            z0().u();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yq5 yq5Var = new yq5();
        yy7[] yy7VarArr = x0;
        yy7 yy7Var = yy7VarArr[0];
        bbd bbdVar = this.X;
        ((in) bbdVar.D(this, yy7Var)).a(bqi.b(new ff1(yq5Var, this, 2), (in) bbdVar.D(this, yy7VarArr[0]), getViewLifecycleOwner()));
        gw0.w(new g56(new d53(z0().u0, 12), new qgc(this, view, null), 1), getViewLifecycleScope());
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        fhc fhcVarZ0 = z0();
        svi.e(fhcVarZ0.a, ((q2b) fhcVarZ0.t()).b(), null, new ahc(fhcVarZ0, str, rectF, null), 2);
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        fhc fhcVarZ0 = z0();
        svi.e(fhcVarZ0.a, ((q2b) fhcVarZ0.t()).b(), null, new bhc(fhcVarZ0, rectF, null), 2);
    }

    public final yfb y0() {
        return (yfb) this.Z.D(this, x0[2]);
    }

    public final fhc z0() {
        return (fhc) this.d.getValue();
    }

    public ProfileEditScreen(long j, dfc dfcVar) {
        this(gwi.b(new imb("profile:id", Long.valueOf(j)), new imb("profile:type", dfcVar)));
    }
}
