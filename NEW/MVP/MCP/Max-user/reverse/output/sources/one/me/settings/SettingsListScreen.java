package one.me.settings;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ale;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.ble;
import defpackage.bpe;
import defpackage.bqi;
import defpackage.bwf;
import defpackage.ci5;
import defpackage.cpe;
import defpackage.dpe;
import defpackage.efd;
import defpackage.ei4;
import defpackage.ele;
import defpackage.eo7;
import defpackage.epe;
import defpackage.fpe;
import defpackage.g39;
import defpackage.g4b;
import defpackage.g56;
import defpackage.g5e;
import defpackage.gpe;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hn;
import defpackage.ho7;
import defpackage.hpe;
import defpackage.i84;
import defpackage.imb;
import defpackage.in;
import defpackage.ipi;
import defpackage.is7;
import defpackage.jd0;
import defpackage.joe;
import defpackage.k18;
import defpackage.koe;
import defpackage.l38;
import defpackage.l48;
import defpackage.lke;
import defpackage.lzf;
import defpackage.mke;
import defpackage.nxg;
import defpackage.obb;
import defpackage.ose;
import defpackage.pf0;
import defpackage.pgc;
import defpackage.prd;
import defpackage.q2b;
import defpackage.qf0;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.s3e;
import defpackage.ske;
import defpackage.svi;
import defpackage.sxa;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tqi;
import defpackage.vdc;
import defpackage.vid;
import defpackage.woe;
import defpackage.xc0;
import defpackage.xfh;
import defpackage.xpe;
import defpackage.yfb;
import defpackage.yke;
import defpackage.yoe;
import defpackage.yy7;
import defpackage.z71;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.sdk.sections.SectionRecyclerWidget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Ljoe;", "Lhn;", "Lqq3;", "Lg39;", "Ljd0;", "Ls3e;", "<init>", "()V", "settings-screen_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SettingsListScreen extends SectionRecyclerWidget implements joe, hn, qq3, g39, jd0, s3e {
    public static final /* synthetic */ yy7[] A0 = {new toc(SettingsListScreen.class, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), ho7.d(vid.a, SettingsListScreen.class, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final bwf X;
    public final k18 Y;
    public final bbd Z;
    public final eo7 d = eo7.f;
    public final k18 o;
    public final bbd s0;
    public final Object t0;
    public final k18 u0;
    public final k18 v0;
    public final ExecutorService w0;
    public in x0;
    public final koe y0;
    public final z71 z0;

    public SettingsListScreen() {
        woe woeVar = woe.a;
        this.o = woeVar.getAccessor().d(487);
        this.X = new bwf(new efd(27));
        this.Y = createViewModelLazy(ele.class, new vdc(17, hpe.Z));
        this.Z = viewBinding(obb.j);
        this.s0 = viewBinding(obb.i);
        this.t0 = ipi.b(3, new prd(16, this));
        this.u0 = woeVar.getAccessor().d(10);
        this.v0 = woeVar.getAccessor().d(151);
        ExecutorService executorServiceA = ((g4b) woeVar.getAccessor().c(56)).a();
        this.w0 = executorServiceA;
        this.y0 = new koe(this, executorServiceA);
        this.z0 = new z71(executorServiceA, 5);
        hbd hbdVar = D0().E0;
        l48 l48VarP = this.lifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new dpe(null, this), 1), getLifecycleScope());
        gw0.w(new g56(aw0.a(D0().G0, this.lifecycleOwner.p(), l38Var), new epe(null, this), 1), getLifecycleScope());
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: A0, reason: from getter */
    public final koe getY0() {
        return this.y0;
    }

    public final ose C0() {
        return (ose) this.Z.D(this, A0[0]);
    }

    public final ele D0() {
        return (ele) this.Y.getValue();
    }

    @Override // defpackage.fn
    public final void c0(in inVar, int i) {
        float fAbs = Math.abs(i) / inVar.getTotalScrollRange();
        ((yfb) this.s0.D(this, A0[1])).setTitleAlpha(fAbs);
        C0().setAlpha(1.0f - fAbs);
    }

    @Override // defpackage.joe
    public final void e0(long j, boolean z) {
    }

    @Override // defpackage.s3e
    public final void f0() {
        xfh.r(D0().C0, yoe.a);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        ele eleVarD0 = D0();
        ci5 ci5Var = eleVarD0.B0;
        if (i != obb.d) {
            if (i == obb.c) {
                xfh.r(ci5Var, xpe.b);
                return;
            } else {
                if (i == obb.b) {
                    eleVarD0.z();
                    return;
                }
                return;
            }
        }
        Long lX = eleVarD0.x();
        if (lX != null) {
            long jLongValue = lX.longValue();
            bpe.c.getClass();
            xc0.l(":neuro-avatars?id=" + jLongValue, ci5Var);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.d;
    }

    @Override // defpackage.joe
    public final void h(long j) {
        ei4 ei4Var;
        ei4 ei4Var2;
        ele eleVarD0 = D0();
        t9f t9fVar = eleVarD0.J0;
        if (j == lke.FOLDERS.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/folder-list");
        } else if (j == lke.APPEARANCE.a) {
            qf0 qf0Var = (qf0) eleVarD0.z0.getValue();
            qf0Var.h.O(qf0Var, qf0.i[0], svi.d((nxg) qf0Var.d.getValue(), ((q2b) ((lzf) qf0Var.c.getValue())).a(), i84.b, new pf0(qf0Var, null)));
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/appearance");
        } else if (j == lke.NOTIFICATIONS.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/notifications");
        } else if (j == lke.PRIVACY.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/privacy");
        } else if (j == lke.MESSAGES.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/messages");
        } else if (j == lke.SUPPORT.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":webview/faq");
        } else if (j == lke.BATTERY.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/media");
        } else if (j == lke.STORAGE.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/caching");
        } else if (j == lke.ABOUT.a) {
            bpe.c.getClass();
            ei4Var2 = new ei4(":settings/aboutapp");
        } else {
            if (j == lke.ESIA_CONNECT.a) {
                bpe bpeVar = bpe.c;
                long jM = eleVarD0.w().b.m(g5e.b, -1L);
                bpeVar.getClass();
                ei4Var = new ei4(":webapp:root?bot_id=" + jM + "&entry_point=settings");
            } else {
                if (j == lke.INVITE_FRIENDS.a) {
                    yy7[] yy7VarArr = ele.M0;
                    qt7 qt7Var = (qt7) t9fVar.D(eleVarD0, yy7VarArr[0]);
                    if (qt7Var == null || !qt7Var.isActive()) {
                        ((is7) eleVarD0.v0.getValue()).a("click_link", "main", "invite_friends");
                        t9fVar.O(eleVarD0, yy7VarArr[0], xfh.o(eleVarD0, ((q2b) eleVarD0.v()).c().plus(eleVarD0.u()), new ale(eleVarD0, null), 2));
                        return;
                    }
                    return;
                }
                if (j == lke.SAVED_MESSAGES.a) {
                    xfh.o(eleVarD0, ((q2b) eleVarD0.v()).a().plus(eleVarD0.u()), new ble(eleVarD0, null), 2);
                    return;
                }
                mke mkeVar = (mke) eleVarD0.L0.c((int) j);
                if (mkeVar == null) {
                    return;
                }
                Long l = mkeVar.c;
                String str = mkeVar.d;
                if (l == null) {
                    if (str != null) {
                        bpe.c.p0().b(":link-intercept", gwi.b(new imb("link", Uri.parse(str))));
                        return;
                    }
                    return;
                }
                bpe bpeVar2 = bpe.c;
                long jLongValue = l.longValue();
                String str2 = mkeVar.e;
                bpeVar2.getClass();
                StringBuilder sb = new StringBuilder(":webapp:root?bot_id=");
                sb.append(jLongValue);
                sb.append("&entry_point=settings");
                if (str2 != null && str2.length() != 0) {
                    sb.append("&start_param=");
                    sb.append(str2);
                }
                ei4Var = new ei4(sb.toString());
            }
            ei4Var2 = ei4Var;
        }
        xfh.r(eleVarD0.B0, ei4Var2);
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            ele eleVarD0 = D0();
            svi.e(eleVarD0.a, ((q2b) eleVarD0.v()).b().plus(eleVarD0.u()), null, new ske(eleVarD0, intent != null ? intent.getData() : null, null), 2);
        }
    }

    @Override // defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        D0().t();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        cpe cpeVar = new cpe(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(obb.f);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tqi.c(new pgc(3, null, 1), coordinatorLayout);
        cpeVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qsb) this.u0.getValue()).c(strArr)) {
            D0().z();
        }
        D0().t();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        in inVar = this.x0;
        if (inVar != null) {
            inVar.a(bqi.b(this, inVar, getViewLifecycleOwner()));
        }
        C0().setAvatarClickedListener(new sxa(0, D0(), ele.class, "openUserAvatars", "openUserAvatars()V", 0, 3));
        C0().setNicknameClickListener(new sxa(0, D0(), ele.class, "copyProfileLink", "copyProfileLink()V", 0, 4));
        C0().setUserPhoneClickListener(new sxa(0, D0(), ele.class, "copyUserPhone", "copyUserPhone()V", 0, 5));
        gw0.w(new g56(aw0.a(D0().B0, this.lifecycleOwner.p(), l38.o), new gpe(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(D0().C0, getViewLifecycleOwner().p(), l38.d), new fpe(null, this), 1), getViewLifecycleScope());
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        D0().y(str, rectF);
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        ele eleVarD0 = D0();
        svi.e(eleVarD0.a, ((q2b) eleVarD0.v()).b().plus(eleVarD0.u()), null, new yke(eleVarD0, rectF, null), 2);
    }

    @Override // one.me.sdk.sections.SectionRecyclerWidget
    /* renamed from: y0, reason: from getter */
    public final z71 getZ0() {
        return this.z0;
    }
}
