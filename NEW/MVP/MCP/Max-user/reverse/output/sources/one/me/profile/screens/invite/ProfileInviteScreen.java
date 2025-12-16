package one.me.profile.screens.invite;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.aic;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.bic;
import defpackage.bzb;
import defpackage.ci5;
import defpackage.cic;
import defpackage.cm6;
import defpackage.eic;
import defpackage.eo7;
import defpackage.fdc;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hdc;
import defpackage.imb;
import defpackage.iqb;
import defpackage.jic;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kkc;
import defpackage.l38;
import defpackage.l48;
import defpackage.lue;
import defpackage.mvd;
import defpackage.n5g;
import defpackage.pg1;
import defpackage.pq3;
import defpackage.q2b;
import defpackage.qic;
import defpackage.qq3;
import defpackage.svi;
import defpackage.toc;
import defpackage.tqi;
import defpackage.uhc;
import defpackage.v8b;
import defpackage.vdc;
import defpackage.ve3;
import defpackage.vid;
import defpackage.wj1;
import defpackage.x8b;
import defpackage.xc0;
import defpackage.xfh;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lone/me/profile/screens/invite/ProfileInviteScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqq3;", "Llue;", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileInviteScreen extends Widget implements qq3, lue, g44 {
    public static final /* synthetic */ yy7[] X;
    public final ka5 a;
    public final eo7 b;
    public final k18 c;
    public final eic d;
    public final bbd o;

    static {
        toc tocVar = new toc(ProfileInviteScreen.class, "moreActionsButton", "getMoreActionsButton()Landroid/widget/ImageView;", 0);
        vid.a.getClass();
        X = new yy7[]{tocVar};
    }

    public ProfileInviteScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new ka5(new hdc(12), (cm6) null, 6);
        this.b = eo7.f;
        this.c = createViewModelLazy(qic.class, new vdc(3, new wj1(bundle, 9)));
        eic eicVar = new eic(((g4b) fdc.a.getAccessor().c(56)).a(), this);
        this.d = eicVar;
        this.o = viewBinding(v8b.L);
        hbd hbdVar = y0().D0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new bzb(2, eicVar, eic.class, "submitList", "submitList(Ljava/util/List;)V", 4, 2), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(y0().F0, this.lifecycleOwner.p(), l38Var), new aic(null, this), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(y0().G0, getViewLifecycleOwner().p(), l38Var), new cic(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(y0().E0, this.lifecycleOwner.p(), l38Var), new bic(null, this), 1), getLifecycleScope());
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        qic qicVarY0 = y0();
        qicVarY0.getClass();
        if (i == v8b.M) {
            xfh.r(qicVarY0.F0, new uhc(new n5g(x8b.Y0), new n5g(x8b.X0), ve3.j(new pq3(v8b.I, new n5g(x8b.V0), 1, 56), new pq3(v8b.z, new n5g(mvd.p), 2, 56))));
        }
    }

    @Override // defpackage.lue
    public final void K() {
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        qic qicVarY0 = y0();
        qicVarY0.getClass();
        if (i != v8b.P) {
            if (i == v8b.I) {
                qicVarY0.y0.O(qicVarY0, qic.H0[0], svi.e(qicVarY0.a, ((q2b) qicVarY0.w()).b(), null, new jic(qicVarY0, null), 2));
                return;
            }
            return;
        }
        ci5 ci5Var = qicVarY0.E0;
        kkc kkcVar = kkc.c;
        long j = qicVarY0.b;
        kkcVar.getClass();
        xc0.l(":profile?id=" + j + "&type=local_chat", ci5Var);
        qicVarY0.B0.set(false);
    }

    @Override // defpackage.lue
    public final void g0(int i) {
        kkc.c.S0();
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

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Throwable {
        iqb iqbVar = new iqb(13, this);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        tqi.c(new pg1(3, null, 5), linearLayout);
        iqbVar.invoke(linearLayout);
        return linearLayout;
    }

    public final qic y0() {
        return (qic) this.c.getValue();
    }

    public ProfileInviteScreen(long j) {
        this(gwi.b(new imb("id", Long.valueOf(j))));
    }
}
