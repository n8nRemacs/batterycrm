package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ai8;
import defpackage.aw0;
import defpackage.b0i;
import defpackage.bbd;
import defpackage.bqi;
import defpackage.bwf;
import defpackage.ega;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fve;
import defpackage.g39;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hbd;
import defpackage.hh8;
import defpackage.hn;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.in;
import defpackage.iv8;
import defpackage.j48;
import defpackage.jd0;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.lwf;
import defpackage.lzf;
import defpackage.mkf;
import defpackage.nd6;
import defpackage.neb;
import defpackage.nfa;
import defpackage.njd;
import defpackage.o8c;
import defpackage.ofa;
import defpackage.oga;
import defpackage.pfa;
import defpackage.q2b;
import defpackage.qfa;
import defpackage.qq3;
import defpackage.qsb;
import defpackage.rea;
import defpackage.sea;
import defpackage.sfa;
import defpackage.sv2;
import defpackage.svi;
import defpackage.tea;
import defpackage.tfa;
import defpackage.toc;
import defpackage.tqi;
import defpackage.ts9;
import defpackage.ufa;
import defpackage.uxa;
import defpackage.v1a;
import defpackage.vea;
import defpackage.vfa;
import defpackage.vid;
import defpackage.wfa;
import defpackage.wm7;
import defpackage.xfa;
import defpackage.xyc;
import defpackage.yfa;
import defpackage.yq5;
import defpackage.yy7;
import defpackage.zfa;
import defpackage.zpi;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;
import one.me.android.root.RootController;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0012B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\b\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0011¨\u0006\u0013"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lqq3;", "Lg39;", "Ljd0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lnjd;", "registrationData", "Lo8c;", "presetAvatars", "(Lnjd;Lo8c;)V", "", "contactId", "(J)V", "s52", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class NeuroAvatarsScreen extends Widget implements qq3, g39, jd0 {
    public static final /* synthetic */ yy7[] K0 = {new toc(NeuroAvatarsScreen.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0), ho7.d(vid.a, NeuroAvatarsScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new toc(NeuroAvatarsScreen.class, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0), new toc(NeuroAvatarsScreen.class, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), new toc(NeuroAvatarsScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(NeuroAvatarsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), new toc(NeuroAvatarsScreen.class, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new toc(NeuroAvatarsScreen.class, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0), new toc(NeuroAvatarsScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0), new toc(NeuroAvatarsScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0), new toc(NeuroAvatarsScreen.class, "contactId", "getContactId()Ljava/lang/Long;", 0)};
    public final pfa A0;
    public final hs B0;
    public final hs C0;
    public final hs D0;
    public final k18 E0;
    public final ExecutorService F0;
    public final b0i G0;
    public final zfa H0;
    public final v1a I0;
    public final bwf J0;
    public final bbd X;
    public final bbd Y;
    public final bbd Z;
    public final /* synthetic */ lwf a;
    public final eo7 b;
    public final ka5 c;
    public final k18 d;
    public final bbd o;
    public final bbd s0;
    public final bbd t0;
    public final bbd u0;
    public final bbd v0;
    public final yq5 w0;
    public final k18 x0;
    public final k18 y0;
    public final nd6 z0;

    public NeuroAvatarsScreen(njd njdVar, o8c o8cVar) {
        this(gwi.b(new imb("registration_data_args", njdVar), new imb("avatars_args", o8cVar)));
    }

    public final njd A0() {
        yy7 yy7Var = K0[8];
        return (njd) this.B0.a(this);
    }

    public final neb B0() {
        return (neb) this.o.D(this, K0[0]);
    }

    public final oga C0() {
        return (oga) this.E0.getValue();
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        if (i == xyc.oneme_login_neuro_avatars_load_from_gallery_action) {
            ai8.c.p0().b(":media-picker/select/photo", null);
        } else if (i == xyc.oneme_login_neuro_avatars_take_photo_action) {
            C0().A();
        } else if (i == xyc.oneme_login_neuro_avatars_remove_photo_action) {
            C0().t();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getT0() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555 && i2 == -1) {
            oga ogaVarC0 = C0();
            Uri data = intent != null ? intent.getData() : null;
            ContextScope contextScope = ogaVarC0.a;
            vea veaVar = ogaVarC0.b;
            svi.e(contextScope, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new rea(veaVar, data, null), 2);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(xyc.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        tqi.c(new sv2(3, null, 3), frameLayout);
        nfa nfaVar = new nfa(this, 2);
        CoordinatorLayout coordinatorLayout = Build.VERSION.SDK_INT >= 30 ? new CoordinatorLayout(frameLayout.getContext(), null) : new sfa(frameLayout.getContext(), null);
        nfaVar.invoke(coordinatorLayout);
        frameLayout.addView(coordinatorLayout);
        return frameLayout;
    }

    @Override // defpackage.c54
    public final void onDestroyView(View view) {
        pfa pfaVar;
        z0().setAdapter(null);
        z0().s0(this.H0);
        B0().k(this.z0);
        ArrayList arrayList = y0().u0;
        if (arrayList == null || (pfaVar = this.A0) == null) {
            return;
        }
        arrayList.remove(pfaVar);
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qsb) this.x0.getValue()).c(strArr)) {
            C0().A();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        yy7[] yy7VarArr = K0;
        yy7 yy7Var = yy7VarArr[1];
        bbd bbdVar = this.X;
        uxa uxaVar = (uxa) bbdVar.D(this, yy7Var);
        j48 viewLifecycleOwner = getViewLifecycleOwner();
        hbd hbdVar = C0().u0;
        Drawable drawable = (Drawable) this.J0.getValue();
        wm7 wm7Var = new wm7(28);
        wm7 wm7Var2 = new wm7(29);
        l48 l48VarP = viewLifecycleOwner.p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(hbdVar, l48VarP, l38Var), new ega(uxaVar, drawable, wm7Var, wm7Var2, null), 1), zpi.a(viewLifecycleOwner.p()));
        fve fveVar = C0().s0;
        if (fveVar != null) {
            gw0.w(new g56(aw0.a(fveVar, getViewLifecycleOwner().p(), l38Var), new wfa(null, this), 1), getViewLifecycleScope());
        }
        gw0.w(new g56(aw0.a(C0().Z, getViewLifecycleOwner().p(), l38Var), new xfa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().w0, getViewLifecycleOwner().p(), l38Var), new yfa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().b.i, getViewLifecycleOwner().p(), l38Var), new vfa(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(C0().z0, getViewLifecycleOwner().p(), l38Var), new ufa(null, this), 1), getViewLifecycleScope());
        final int i = 0;
        f8j.d((OneMeButton) this.u0.D(this, yy7VarArr[6]), 300L, new View.OnClickListener(this) { // from class: mfa
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.u0.D(neuroAvatarsScreen, NeuroAvatarsScreen.K0[6]);
                        oneMeButton.setProgressEnabled(true);
                        oneMeButton.setClickable(false);
                        neuroAvatarsScreen.C0().w();
                        break;
                    default:
                        yy7[] yy7VarArr3 = NeuroAvatarsScreen.K0;
                        if (neuroAvatarsScreen.A0() != null) {
                            api.c(neuroAvatarsScreen);
                            List listU = neuroAvatarsScreen.C0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr4 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(neuroAvatarsScreen);
                                    c54 parentController = neuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(neuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                }
            }
        });
        B0().a(this.z0);
        y0().a(bqi.b(this.A0, y0(), getViewLifecycleOwner()));
        final int i2 = 1;
        f8j.d((uxa) bbdVar.D(this, yy7VarArr[1]), 300L, new View.OnClickListener(this) { // from class: mfa
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.u0.D(neuroAvatarsScreen, NeuroAvatarsScreen.K0[6]);
                        oneMeButton.setProgressEnabled(true);
                        oneMeButton.setClickable(false);
                        neuroAvatarsScreen.C0().w();
                        break;
                    default:
                        yy7[] yy7VarArr3 = NeuroAvatarsScreen.K0;
                        if (neuroAvatarsScreen.A0() != null) {
                            api.c(neuroAvatarsScreen);
                            List listU = neuroAvatarsScreen.C0().u();
                            oq3 oq3VarE = az1.e(t3d.oneme_login_neuro_avatars_bottomsheet_title, null, null, 6);
                            ListIterator listIterator = ((o98) listU).listIterator(0);
                            while (true) {
                                m98 m98Var = (m98) listIterator;
                                if (!m98Var.hasNext()) {
                                    yy7[] yy7VarArr4 = BottomSheetWidget.B0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                                    confirmationBottomSheetE.setTargetController(neuroAvatarsScreen);
                                    c54 parentController = neuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                                    ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                                    confirmationBottomSheetE.N0(neuroAvatarsScreen);
                                    if (ytdVarE0 != null) {
                                        bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                                        az1.u(false, budVar, true, "BottomSheetWidget");
                                        ytdVarE0.H(budVar);
                                        break;
                                    }
                                } else {
                                    oq3VarE.a((pq3) m98Var.next());
                                }
                            }
                        }
                        break;
                }
            }
        });
        b0i b0iVar = this.G0;
        b0iVar.z(new mkf(this, 1, b0iVar));
    }

    @Override // defpackage.g39
    public final void q(String str, RectF rectF, Rect rect) {
        oga ogaVarC0 = C0();
        ContextScope contextScope = ogaVarC0.a;
        vea veaVar = ogaVarC0.b;
        svi.e(contextScope, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new sea(str, veaVar, rectF, 2, rect, null), 2);
    }

    @Override // defpackage.jd0
    public final void r(String str, RectF rectF, Rect rect) {
        oga ogaVarC0 = C0();
        ContextScope contextScope = ogaVarC0.a;
        vea veaVar = ogaVarC0.b;
        svi.e(contextScope, ((q2b) ((lzf) veaVar.g.getValue())).b(), null, new tea(veaVar, rect, rectF, contextScope, null), 2);
    }

    public final in y0() {
        return (in) this.Z.D(this, K0[3]);
    }

    public final RecyclerView z0() {
        return (RecyclerView) this.t0.D(this, K0[5]);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [pfa] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new lwf();
        this.b = new eo7(3, null, 5);
        this.c = new ka5(new ofa(this, 2), new ofa(this, 3), 4);
        hh8 hh8Var = hh8.a;
        this.d = hh8Var.a();
        this.o = viewBinding(xyc.oneme_login_neuro_avatars_tabs);
        this.X = viewBinding(xyc.oneme_login_neuro_avatars_avatar);
        this.Y = viewBinding(xyc.oneme_login_neuro_avatars_collapsible);
        this.Z = viewBinding(xyc.oneme_login_neuro_avatars_appbar);
        this.s0 = viewBinding(xyc.oneme_login_neuro_avatars_toolbar);
        this.t0 = viewBinding(xyc.oneme_login_neuro_avatars_recycler_view);
        this.u0 = viewBinding(xyc.oneme_login_neuro_avatars_continue_btn);
        this.v0 = viewBinding(xyc.oneme_login_neuro_avatars_tabs_shimmer);
        this.w0 = new yq5();
        this.x0 = hh8Var.getAccessor().d(10);
        this.y0 = hh8Var.getAccessor().d(151);
        this.z0 = new nd6(2, this);
        this.A0 = new hn() { // from class: pfa
            @Override // defpackage.fn
            public final void c0(in inVar, int i) {
                yy7[] yy7VarArr = NeuroAvatarsScreen.K0;
                NeuroAvatarsScreen neuroAvatarsScreen = this.a;
                float interpolation = neuroAvatarsScreen.w0.getInterpolation(Math.abs(i) / neuroAvatarsScreen.y0().getTotalScrollRange());
                bbd bbdVar = neuroAvatarsScreen.Y;
                yy7[] yy7VarArr2 = NeuroAvatarsScreen.K0;
                ((ViewGroup) bbdVar.D(neuroAvatarsScreen, yy7VarArr2[2])).setAlpha(1.0f - interpolation);
                ((yfb) neuroAvatarsScreen.s0.D(neuroAvatarsScreen, yy7VarArr2[4])).setTitleAlpha(interpolation);
            }
        };
        this.B0 = new hs(njd.class, "registration_data_args");
        this.C0 = new hs(o8c.class, "avatars_args");
        this.D0 = new hs(Long.class, "contact_id_args");
        this.E0 = createViewModelLazy(oga.class, new iv8(16, new ofa(this, 4)));
        ExecutorService executorServiceA = ((g4b) hh8Var.getAccessor().c(56)).a();
        this.F0 = executorServiceA;
        b0i b0iVar = new b0i(executorServiceA, new tfa(C0()), 8);
        this.G0 = b0iVar;
        this.H0 = new zfa(b0iVar, new ts9(1, C0(), oga.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 4));
        this.I0 = new v1a(25);
        this.J0 = new bwf(new ofa(this, 5));
        gw0.w(new g56(C0().x0, new qfa(null, this), 1), getLifecycleScope());
    }

    public NeuroAvatarsScreen(long j) {
        this(gwi.b(new imb("contact_id_args", Long.valueOf(j))));
    }
}
