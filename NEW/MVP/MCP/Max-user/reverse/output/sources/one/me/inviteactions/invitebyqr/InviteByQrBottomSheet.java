package one.me.inviteactions.invitebyqr;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.a93;
import defpackage.as7;
import defpackage.avd;
import defpackage.bbd;
import defpackage.bwf;
import defpackage.c7j;
import defpackage.crc;
import defpackage.d53;
import defpackage.drc;
import defpackage.ds7;
import defpackage.eo7;
import defpackage.erc;
import defpackage.f8j;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gza;
import defpackage.h5b;
import defpackage.ho7;
import defpackage.hs;
import defpackage.i77;
import defpackage.ipi;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kti;
import defpackage.ld0;
import defpackage.ls0;
import defpackage.ms0;
import defpackage.pb3;
import defpackage.qt7;
import defpackage.r35;
import defpackage.s5b;
import defpackage.so3;
import defpackage.t9f;
import defpackage.toc;
import defpackage.tqi;
import defpackage.u45;
import defpackage.u9b;
import defpackage.v1a;
import defpackage.vid;
import defpackage.vq7;
import defpackage.vw4;
import defpackage.w4e;
import defpackage.xr7;
import defpackage.y83;
import defpackage.ye6;
import defpackage.yo3;
import defpackage.yr7;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/inviteactions/invitebyqr/InviteByQrBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "invite-actions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InviteByQrBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] O0 = {new toc(InviteByQrBottomSheet.class, "qrCodeHeight", "getQrCodeHeight()I", 0), ho7.d(vid.a, InviteByQrBottomSheet.class, "qrCodeImageView", "getQrCodeImageView()Landroidx/appcompat/widget/AppCompatImageView;", 0), new toc(InviteByQrBottomSheet.class, "shareButton", "getShareButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new z8a(InviteByQrBottomSheet.class, "shareQrCodeJob", "getShareQrCodeJob()Lkotlinx/coroutines/Job;"), new z8a(InviteByQrBottomSheet.class, "isCurrentThemeDark", "isCurrentThemeDark()Z")};
    public final eo7 C0;
    public final hs D0;
    public final bbd E0;
    public final bbd F0;
    public final Object G0;
    public final k18 H0;
    public final k18 I0;
    public final Context J0;
    public final k18 K0;
    public final t9f L0;
    public final bwf M0;
    public final hs N0;

    public InviteByQrBottomSheet(Bundle bundle) {
        super(bundle);
        this.C0 = eo7.e;
        this.D0 = new hs(Integer.class, "height");
        this.E0 = viewBinding(s5b.k);
        this.F0 = viewBinding(s5b.l);
        this.G0 = ipi.b(3, new xr7(this, 0));
        vq7 vq7Var = vq7.a;
        this.H0 = vq7Var.getAccessor().d(46);
        this.I0 = vq7Var.getAccessor().d(487);
        so3 so3Var = (so3) vq7Var.getAccessor().c(488);
        this.J0 = (Context) vq7Var.getAccessor().c(12);
        this.K0 = createViewModelLazy(ds7.class, new yo3(20, new xr7(this, 1)));
        so3Var.a(so3.c, new yr7(0, this));
        this.L0 = c7j.c();
        this.M0 = new bwf(new i77(17));
        this.N0 = new hs(Boolean.class, "is_current_theme_dark");
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0, reason: from getter */
    public final eo7 getX() {
        return this.C0;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        return new FrameLayout(getContext());
    }

    public final erc O0() {
        long j = getArgs().getLong("id");
        String name = a93.s0.x(this.J0).k().getName();
        String string = getArgs().getString("type");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 3052376) {
                if (iHashCode == 951526432 && string.equals("contact")) {
                    return new drc(j, name);
                }
            } else if (string.equals("chat")) {
                return new crc(j, name);
            }
        }
        return new drc(((w4e) ((pb3) this.H0.getValue())).s(), name);
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        qt7 qt7Var = (qt7) this.L0.D(this, O0[3]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(new y83(new d53(((ds7) this.K0.getValue()).Z, 12), 15, this), new as7(this, null), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final FrameLayout y0(LayoutInflater layoutInflater, Bundle bundle) {
        v1a v1aVar = a93.s0;
        boolean zL = v1aVar.x(getContext()).l();
        yy7[] yy7VarArr = O0;
        yy7 yy7Var = yy7VarArr[4];
        this.N0.b(this, Boolean.valueOf(zL));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(u9b.b);
        yy7 yy7Var2 = yy7VarArr[0];
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, u45.q(78, vw4.d().getDisplayMetrics().density, ((Number) this.D0.a(this)).intValue())));
        frameLayout.setClipToPadding(false);
        frameLayout.setOutlineProvider(new ls0(1, vw4.d().getDisplayMetrics().density * 20.0f));
        AppCompatImageView appCompatImageView = new AppCompatImageView(frameLayout.getContext(), null);
        appCompatImageView.setId(s5b.k);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        frameLayout.addView(appCompatImageView);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        float f = 12;
        layoutParams.leftMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.rightMargin = kti.d(vw4.d().getDisplayMetrics().density * f);
        layoutParams.bottomMargin = kti.d(f * vw4.d().getDisplayMetrics().density);
        frameLayout2.setLayoutParams(layoutParams);
        zfi.b(frameLayout2, new eo7(0, new ms0(3, 3, false), 7), null);
        OneMeButton oneMeButton = new OneMeButton(frameLayout2.getContext(), null);
        oneMeButton.setId(s5b.l);
        oneMeButton.setMode(iza.a);
        oneMeButton.setSize(jza.c);
        oneMeButton.setAppearance(gza.a);
        oneMeButton.setCustomTheme(h5b.d.a(v1aVar.x(oneMeButton.getContext()).l()));
        oneMeButton.setText(avd.f);
        f8j.d(oneMeButton, 300L, new ye6(8, this));
        frameLayout2.addView(oneMeButton);
        frameLayout.addView(frameLayout2);
        View r35Var = new r35(frameLayout.getContext());
        r35Var.setTranslationY(kti.d(6 * vw4.d().getDisplayMetrics().density));
        frameLayout.addView(r35Var);
        tqi.c(new ld0((Object) this, (Continuation) null, 17, false), frameLayout);
        return frameLayout;
    }
}
