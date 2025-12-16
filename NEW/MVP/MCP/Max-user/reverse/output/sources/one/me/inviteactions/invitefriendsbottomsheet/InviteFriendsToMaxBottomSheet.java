package one.me.inviteactions.invitefriendsbottomsheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a93;
import defpackage.avd;
import defpackage.az1;
import defpackage.c7j;
import defpackage.dpg;
import defpackage.drc;
import defpackage.ds7;
import defpackage.es7;
import defpackage.f8j;
import defpackage.fr7;
import defpackage.fs7;
import defpackage.fua;
import defpackage.hs;
import defpackage.k18;
import defpackage.kti;
import defpackage.l5j;
import defpackage.mza;
import defpackage.pb3;
import defpackage.qt7;
import defpackage.s5b;
import defpackage.t5b;
import defpackage.t75;
import defpackage.t9f;
import defpackage.tqi;
import defpackage.u45;
import defpackage.u5b;
import defpackage.ut3;
import defpackage.vid;
import defpackage.vq7;
import defpackage.vw4;
import defpackage.w4e;
import defpackage.ye6;
import defpackage.yeb;
import defpackage.yo3;
import defpackage.yy7;
import defpackage.z8a;
import kotlin.Metadata;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.sdk.bottomsheet.BottomSheetWidget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/inviteactions/invitefriendsbottomsheet/InviteFriendsToMaxBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InviteFriendsToMaxBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] L0 = {new z8a(InviteFriendsToMaxBottomSheet.class, "inviteFriendsJob", "getInviteFriendsJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, InviteFriendsToMaxBottomSheet.class, "currentAnimationTheme", "getCurrentAnimationTheme()Ljava/lang/String;")};
    public final k18 C0;
    public final k18 D0;
    public final k18 E0;
    public final k18 F0;
    public final k18 G0;
    public final int H0;
    public final k18 I0;
    public final t9f J0;
    public final hs K0;

    public InviteFriendsToMaxBottomSheet() {
        super(null, 1, null);
        vq7 vq7Var = vq7.a;
        this.C0 = vq7Var.getAccessor().d(46);
        this.D0 = vq7Var.getAccessor().d(47);
        this.E0 = vq7Var.getAccessor().d(487);
        this.F0 = vq7Var.getAccessor().d(113);
        this.G0 = vq7Var.getAccessor().d(12);
        this.H0 = 1;
        k18 k18VarCreateViewModelLazy = createViewModelLazy(ds7.class, new yo3(21, new fr7(1, this)));
        this.I0 = k18VarCreateViewModelLazy;
        this.J0 = c7j.c();
        this.K0 = new hs(String.class, "current_animation_theme");
        ((ds7) k18VarCreateViewModelLazy.getValue()).getClass();
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) throws InterruptedException {
        ConstraintLayout fs7Var = new fs7(this, getContext());
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setId(s5b.m);
        float f = 248;
        float f2 = 80;
        rLottieImageView.setAnimation(t5b.a, kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2));
        O0(rLottieImageView, false);
        rLottieImageView.playAnimation();
        fs7Var.addView(rLottieImageView, kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
        TextView textView = new TextView(getContext());
        textView.setId(s5b.o);
        textView.setGravity(17);
        dpg.D.b(textView, t75.b);
        textView.setTextColor(a93.s0.y(textView).getText().e);
        textView.setText(u5b.k);
        fs7Var.addView(textView, -2, -2);
        mza mzaVar = new mza(getContext());
        mzaVar.setId(s5b.n);
        mzaVar.setText(avd.w0);
        f8j.d(mzaVar, 300L, new ye6(9, this));
        fs7Var.addView(mzaVar, 0, -2);
        tqi.c(new es7(textView, this, rLottieImageView, null, 0), fs7Var);
        ut3 ut3VarG = l5j.g(fs7Var);
        int id = rLottieImageView.getId();
        ut3VarG.d(id, 3, 0, 3);
        az1.q(44, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id, 5));
        ut3VarG.d(id, 6, 0, 6);
        ut3VarG.d(id, 7, 0, 7);
        int id2 = textView.getId();
        ut3VarG.d(id2, 3, rLottieImageView.getId(), 4);
        ut3VarG.d(id2, 6, 0, 6);
        ut3VarG.d(id2, 7, 0, 7);
        int id3 = mzaVar.getId();
        ut3VarG.d(id3, 3, textView.getId(), 4);
        az1.q(48, vw4.d().getDisplayMetrics().density, new fua(ut3VarG, 3, id3, 5));
        ut3VarG.d(id3, 6, 0, 6);
        ut3VarG.d(id3, 7, 0, 7);
        ut3VarG.d(id3, 4, 0, 4);
        new fua(ut3VarG, 4, id3, 5).e(kti.d(24 * vw4.d().getDisplayMetrics().density));
        ut3VarG.a(fs7Var);
        return fs7Var;
    }

    public final void O0(RLottieImageView rLottieImageView, boolean z) throws InterruptedException {
        yeb yebVarK = a93.s0.x(getContext()).k();
        String name = yebVarK.getName();
        yy7 yy7Var = L0[1];
        this.K0.b(this, name);
        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
        if (z) {
            animatedDrawable.setCurrentFrame(animatedDrawable.getFramesCount() - 1);
        }
        animatedDrawable.beginApplyLayerColors();
        animatedDrawable.setLayerColor("**.Fill 1", yebVarK.b().h);
        animatedDrawable.commitApplyLayerColors();
    }

    public final drc P0() {
        return new drc(((w4e) ((pb3) this.C0.getValue())).s(), a93.s0.x((Context) this.G0.getValue()).k().getName());
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        qt7 qt7Var = (qt7) this.J0.D(this, L0[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
    }
}
