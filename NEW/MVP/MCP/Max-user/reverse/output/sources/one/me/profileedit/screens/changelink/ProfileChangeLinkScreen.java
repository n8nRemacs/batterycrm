package one.me.profileedit.screens.changelink;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a93;
import defpackage.api;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.cfc;
import defpackage.cm6;
import defpackage.d53;
import defpackage.d9e;
import defpackage.dfc;
import defpackage.em6;
import defpackage.eo7;
import defpackage.f8j;
import defpackage.fb6;
import defpackage.ffb;
import defpackage.g44;
import defpackage.g4b;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.gza;
import defpackage.hfb;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.iqb;
import defpackage.iv8;
import defpackage.iza;
import defpackage.jfb;
import defpackage.jza;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kti;
import defpackage.l38;
import defpackage.l3b;
import defpackage.mfb;
import defpackage.pcc;
import defpackage.qfb;
import defpackage.qq3;
import defpackage.r8b;
import defpackage.rcc;
import defpackage.s3;
import defpackage.scc;
import defpackage.tcc;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u82;
import defpackage.u8b;
import defpackage.ucc;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vo8;
import defpackage.vw4;
import defpackage.xu9;
import defpackage.yec;
import defpackage.yfb;
import defpackage.yy7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Lqq3;", "", "Lg44;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Ldfc;", "type", "Lcfc;", "flow", "(JLdfc;Lcfc;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileChangeLinkScreen extends Widget implements qq3, g44 {
    public static final /* synthetic */ yy7[] t0 = {new toc(ProfileChangeLinkScreen.class, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0), ho7.d(vid.a, ProfileChangeLinkScreen.class, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), new toc(ProfileChangeLinkScreen.class, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0), new toc(ProfileChangeLinkScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new toc(ProfileChangeLinkScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0)};
    public final fb6 X;
    public final bbd Y;
    public final bbd Z;
    public final hs a;
    public final hs b;
    public final ka5 c;
    public final eo7 d;
    public final k18 o;
    public final bbd s0;

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(cfc.class, "entity:flow_type");
        this.b = new hs(dfc.class, "entity:id_type");
        this.c = new ka5(new ffb(16, this), (cm6) null, 6);
        this.d = eo7.f;
        this.o = createViewModelLazy(u82.class, new iv8(29, new l3b(bundle, 8, this)));
        this.X = new fb6(((g4b) yec.a.getAccessor().c(56)).a(), this, 5);
        this.Y = viewBinding(r8b.v0);
        this.Z = viewBinding(r8b.w0);
        this.s0 = viewBinding(r8b.C0);
        gw0.w(new g56(new d53(A0().d, 12), new rcc(null, this), 1), getLifecycleScope());
        gw0.w(new g56(A0().Z, new scc(null, this), 1), getLifecycleScope());
    }

    public static final OneMeButton y0(ProfileChangeLinkScreen profileChangeLinkScreen) {
        return (OneMeButton) profileChangeLinkScreen.s0.D(profileChangeLinkScreen, t0[4]);
    }

    public final u82 A0() {
        return (u82) this.o.getValue();
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        A0().b.i(i);
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        A0().b.h(i);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getD() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // defpackage.c54
    public final boolean handleBack() {
        api.c(this);
        return super.handleBack();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mfb gfbVar;
        int i;
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        yfb yfbVar = new yfb(linearLayout.getContext(), 6);
        yfbVar.setId(r8b.w0);
        final iqb iqbVar = new iqb(10, this);
        int iOrdinal = z0().ordinal();
        if (iOrdinal == 0) {
            final int i2 = 0;
            gfbVar = new gfb(new em6() { // from class: qcc
                @Override // defpackage.em6
                public final Object invoke(Object obj) throws Throwable {
                    int i3 = i2;
                    qqg qqgVar = qqg.a;
                    iqb iqbVar2 = iqbVar;
                    View view = (View) obj;
                    switch (i3) {
                        case 0:
                            yy7[] yy7VarArr = ProfileChangeLinkScreen.t0;
                            iqbVar2.invoke(view);
                            break;
                        default:
                            yy7[] yy7VarArr2 = ProfileChangeLinkScreen.t0;
                            iqbVar2.invoke(view);
                            break;
                    }
                    return qqgVar;
                }
            });
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            final int i3 = 1;
            gfbVar = new hfb(new em6() { // from class: qcc
                @Override // defpackage.em6
                public final Object invoke(Object obj) throws Throwable {
                    int i32 = i3;
                    qqg qqgVar = qqg.a;
                    iqb iqbVar2 = iqbVar;
                    View view = (View) obj;
                    switch (i32) {
                        case 0:
                            yy7[] yy7VarArr = ProfileChangeLinkScreen.t0;
                            iqbVar2.invoke(view);
                            break;
                        default:
                            yy7[] yy7VarArr2 = ProfileChangeLinkScreen.t0;
                            iqbVar2.invoke(view);
                            break;
                    }
                    return qqgVar;
                }
            });
        }
        yfbVar.setLeftActions(gfbVar);
        yfbVar.setRightActions(jfb.a);
        yfbVar.setForm(qfb.a);
        yfbVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        v1a v1aVar = a93.s0;
        yfbVar.setBackgroundColor(v1aVar.y(yfbVar).b().k);
        linearLayout.addView(yfbVar);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        float f = 16;
        layoutParams2.topMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams2.weight = 1.0f;
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.X);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        recyclerView.j(new d9e(v1aVar.y(recyclerView), new xu9(17, this), null, null, 28));
        recyclerView.j(new vo8(0));
        linearLayout.addView(recyclerView);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(r8b.C0);
        oneMeButton.setSize(jza.c);
        oneMeButton.setMode(iza.a);
        oneMeButton.setAppearance(gza.c);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 12;
        layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams3);
        int iOrdinal2 = z0().ordinal();
        if (iOrdinal2 == 0) {
            i = u8b.A1;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = u8b.B1;
        }
        oneMeButton.setText(i);
        f8j.d(oneMeButton, 300L, new pcc(0, this));
        linearLayout.addView(oneMeButton);
        tqi.c(new s3(this, continuation, 25), linearLayout);
        return linearLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(new d53(A0().X, 12), new ucc(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(A0().Y, getViewLifecycleOwner().p(), l38.d), new tcc(null, this), 1), getViewLifecycleScope());
    }

    public final cfc z0() {
        yy7 yy7Var = t0[0];
        return (cfc) this.a.a(this);
    }

    public ProfileChangeLinkScreen(long j, dfc dfcVar, cfc cfcVar) {
        this(gwi.b(new imb("entity:id", Long.valueOf(j)), new imb("entity:id_type", dfcVar), new imb("entity:flow_type", cfcVar)));
    }
}
