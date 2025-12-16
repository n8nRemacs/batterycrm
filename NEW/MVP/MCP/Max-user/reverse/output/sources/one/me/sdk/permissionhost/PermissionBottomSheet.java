package one.me.sdk.permissionhost;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.asb;
import defpackage.b62;
import defpackage.dpg;
import defpackage.ffb;
import defpackage.gza;
import defpackage.ho7;
import defpackage.hs;
import defpackage.iza;
import defpackage.jza;
import defpackage.k18;
import defpackage.kga;
import defpackage.kti;
import defpackage.oab;
import defpackage.orb;
import defpackage.pab;
import defpackage.prb;
import defpackage.q9;
import defpackage.r40;
import defpackage.r98;
import defpackage.rsb;
import defpackage.t75;
import defpackage.tk4;
import defpackage.tqi;
import defpackage.u45;
import defpackage.vid;
import defpackage.vw4;
import defpackage.wrb;
import defpackage.xrb;
import defpackage.xs0;
import defpackage.yrb;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zrb;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003BG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0002\u0010\u000eBK\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lone/me/sdk/permissionhost/PermissionBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "", "", "permissions", "", "requestCode", "titleId", "rationaleId", "positiveButtonId", "Lyrb;", "icon", "([Ljava/lang/String;IIIILyrb;)V", "Landroid/content/Intent;", "customSettingsIntent", "", "showCancelButton", "openSettingsButtonTextRes", "(ILjava/lang/Integer;Lyrb;Landroid/content/Intent;ZLjava/lang/Integer;)V", "permission-host_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class PermissionBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ yy7[] P0 = {new z8a(PermissionBottomSheet.class, "settingsMode", "getSettingsMode()Z"), u45.h(vid.a, PermissionBottomSheet.class, "showCancelButton", "getShowCancelButton()Z"), new z8a(PermissionBottomSheet.class, "customSettingsIntent", "getCustomSettingsIntent()Landroid/content/Intent;"), new z8a(PermissionBottomSheet.class, "titleId", "getTitleId()I"), new z8a(PermissionBottomSheet.class, "rationaleId", "getRationaleId()Ljava/lang/Integer;"), new z8a(PermissionBottomSheet.class, "positiveButtonId", "getPositiveButtonId()I"), new z8a(PermissionBottomSheet.class, "requestedPermissions", "getRequestedPermissions()[Ljava/lang/String;"), new z8a(PermissionBottomSheet.class, "requestCode", "getRequestCode()I"), new z8a(PermissionBottomSheet.class, "isCallbackSent", "isCallbackSent()Z"), new z8a(PermissionBottomSheet.class, "icon", "getIcon()Lone/me/sdk/permissions/PermissionIcon;"), new z8a(PermissionBottomSheet.class, "openSettingsButtonTextRes", "getOpenSettingsButtonTextRes()I")};
    public final k18 C0;
    public final hs D0;
    public final hs E0;
    public final hs F0;
    public final hs G0;
    public final hs H0;
    public final hs I0;
    public final hs J0;
    public final hs K0;
    public final hs L0;
    public final hs M0;
    public final hs N0;
    public boolean O0;

    public PermissionBottomSheet() {
        super(null, 1, null);
        this.C0 = rsb.a.a();
        this.D0 = new hs(Boolean.class, Boolean.TRUE, "PermissionBottomSheet.settings_mode");
        Boolean bool = Boolean.FALSE;
        this.E0 = new hs(Boolean.class, bool, "PermissionBottomSheet.show_cancel_button");
        this.F0 = new hs(Intent.class, null, "PermissionBottomSheet.custom_settings_intent");
        Class<Integer> cls = Integer.class;
        this.G0 = new hs(cls, "PermissionBottomSheet.title_res");
        this.H0 = new hs(cls, "PermissionBottomSheet.rationale_res");
        this.I0 = new hs(cls, "PermissionBottomSheet.positive_button_res");
        this.J0 = new hs(String[].class, "PermissionBottomSheet.permissions");
        this.K0 = new hs(cls, "PermissionBottomSheet.request_code");
        this.L0 = new hs(Boolean.class, bool, "callback_sent");
        this.M0 = new hs(yrb.class, "PermissionBottomSheet.icon");
        this.N0 = new hs(cls, "PermissionBottomSheet.key_open_settings_button_text_res");
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View L0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        yy7[] yy7VarArr = P0;
        yy7 yy7Var = yy7VarArr[9];
        yrb yrbVar = (yrb) this.M0.a(this);
        int i = 3;
        Continuation continuation = null;
        if (yrbVar != null) {
            asb asbVar = new asb(linearLayout.getContext());
            if (yrbVar instanceof xrb) {
                RLottieImageView rLottieImageView = new RLottieImageView(asbVar.getContext());
                int iD = kti.d(36 * vw4.d().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iD, iD);
                layoutParams.gravity = 17;
                rLottieImageView.setLayoutParams(layoutParams);
                int i2 = ((xrb) yrbVar).a;
                RLottieImageViewUtils.setRawRes(rLottieImageView, i2, ho7.f(i2, "permission_"), iD, iD, false);
                tqi.c(new kga(i, continuation, 5), rLottieImageView);
                rLottieImageView.playAnimation();
                asbVar.addView(rLottieImageView);
            } else {
                if (!(yrbVar instanceof wrb)) {
                    throw new NoWhenBranchMatchedException();
                }
                AppCompatImageView appCompatImageView = new AppCompatImageView(asbVar.getContext(), null);
                int iD2 = kti.d(36 * vw4.d().getDisplayMetrics().density);
                appCompatImageView.setImageResource(((wrb) yrbVar).a);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iD2, iD2);
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                tqi.c(new zrb(3, null, 0), appCompatImageView);
                if (appCompatImageView.isAttachedToWindow()) {
                    appCompatImageView.post(new r98(14, appCompatImageView));
                } else {
                    appCompatImageView.addOnAttachStateChangeListener(new r40(appCompatImageView, 11, appCompatImageView));
                }
                asbVar.addView(appCompatImageView);
            }
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(asbVar.getLayoutParams());
            layoutParams3.gravity = 1;
            layoutParams3.topMargin = kti.d(27 * vw4.d().getDisplayMetrics().density);
            linearLayout.addView(asbVar, layoutParams3);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout.getContext(), null);
        appCompatTextView.setId(oab.c);
        yy7 yy7Var2 = yy7VarArr[3];
        appCompatTextView.setText(((Number) this.G0.a(this)).intValue());
        appCompatTextView.setGravity(1);
        appCompatTextView.setTextAlignment(4);
        dpg.D.b(appCompatTextView, t75.b);
        tqi.c(new b62(i, continuation, 2), appCompatTextView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = kti.d(19 * vw4.d().getDisplayMetrics().density);
        yy7 yy7Var3 = yy7VarArr[4];
        hs hsVar = this.H0;
        if (((Integer) hsVar.a(this)) == null) {
            layoutParams4.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
        }
        linearLayout.addView(appCompatTextView, layoutParams4);
        yy7 yy7Var4 = yy7VarArr[4];
        Integer num = (Integer) hsVar.a(this);
        if (num != null) {
            int iIntValue = num.intValue();
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout.getContext(), null);
            appCompatTextView2.setId(oab.b);
            appCompatTextView2.setText(iIntValue);
            appCompatTextView2.setGravity(1);
            appCompatTextView2.setTextAlignment(4);
            dpg.I.b(appCompatTextView2, t75.b);
            tqi.c(new b62(i, continuation, 1), appCompatTextView2);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.topMargin = kti.d(8 * vw4.d().getDisplayMetrics().density);
            layoutParams5.bottomMargin = kti.d(16 * vw4.d().getDisplayMetrics().density);
            linearLayout.addView(appCompatTextView2, layoutParams5);
        }
        yy7 yy7Var5 = yy7VarArr[0];
        boolean zBooleanValue = ((Boolean) this.D0.a(this)).booleanValue();
        gza gzaVar = gza.a;
        iza izaVar = iza.a;
        jza jzaVar = jza.c;
        if (zBooleanValue) {
            yy7 yy7Var6 = yy7VarArr[10];
            int iIntValue2 = ((Number) this.N0.a(this)).intValue();
            float f = 12;
            int iD3 = kti.d(vw4.d().getDisplayMetrics().density * f);
            int iD4 = kti.d(f * vw4.d().getDisplayMetrics().density);
            OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton.setId(oab.a);
            oneMeButton.setMode(izaVar);
            oneMeButton.setSize(jzaVar);
            oneMeButton.setAppearance(gzaVar);
            oneMeButton.setText(iIntValue2);
            oneMeButton.setOnClickListener(new prb(this, linearLayout, this));
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.bottomMargin = iD4;
            layoutParams6.topMargin = iD3;
            linearLayout.addView(oneMeButton, layoutParams6);
        } else {
            yy7 yy7Var7 = yy7VarArr[5];
            int iIntValue3 = ((Number) this.I0.a(this)).intValue();
            float f2 = 12;
            int iD5 = kti.d(vw4.d().getDisplayMetrics().density * f2);
            int iD6 = kti.d(f2 * vw4.d().getDisplayMetrics().density);
            OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton2.setId(oab.a);
            oneMeButton2.setMode(izaVar);
            oneMeButton2.setSize(jzaVar);
            oneMeButton2.setAppearance(gzaVar);
            oneMeButton2.setText(iIntValue3);
            oneMeButton2.setOnClickListener(new orb(this, this, 1));
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams7.bottomMargin = iD6;
            layoutParams7.topMargin = iD5;
            linearLayout.addView(oneMeButton2, layoutParams7);
        }
        yy7 yy7Var8 = yy7VarArr[1];
        if (((Boolean) this.E0.a(this)).booleanValue()) {
            int i3 = pab.e;
            OneMeButton oneMeButton3 = new OneMeButton(linearLayout.getContext(), null);
            oneMeButton3.setId(oab.a);
            oneMeButton3.setMode(iza.b);
            oneMeButton3.setSize(jzaVar);
            oneMeButton3.setAppearance(gza.c);
            oneMeButton3.setText(i3);
            oneMeButton3.setOnClickListener(new orb(this, this, 0));
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams8.bottomMargin = 0;
            layoutParams8.topMargin = 0;
            linearLayout.addView(oneMeButton3, layoutParams8);
        }
        return linearLayout;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        xs0 xs0Var = new xs0(this, new ffb(4, this));
        if (getRouter() != null) {
            getRouter().a(xs0Var);
        } else {
            addLifecycleListener(new q9(this, 10, xs0Var));
        }
    }

    public PermissionBottomSheet(String[] strArr, int i, int i2, int i3, int i4, yrb yrbVar) {
        this(i2, Integer.valueOf(i3), yrbVar, null, false, null, 40, null);
        hs hsVar = this.J0;
        yy7[] yy7VarArr = P0;
        yy7 yy7Var = yy7VarArr[6];
        hsVar.b(this, strArr);
        hs hsVar2 = this.K0;
        yy7 yy7Var2 = yy7VarArr[7];
        hsVar2.b(this, Integer.valueOf(i));
        hs hsVar3 = this.I0;
        yy7 yy7Var3 = yy7VarArr[5];
        hsVar3.b(this, Integer.valueOf(i4));
        hs hsVar4 = this.D0;
        yy7 yy7Var4 = yy7VarArr[0];
        hsVar4.b(this, Boolean.FALSE);
    }

    public /* synthetic */ PermissionBottomSheet(int i, Integer num, yrb yrbVar, Intent intent, boolean z, Integer num2, int i2, tk4 tk4Var) {
        this(i, num, yrbVar, (i2 & 8) != 0 ? null : intent, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? null : num2);
    }

    public PermissionBottomSheet(int i, Integer num, yrb yrbVar, Intent intent, boolean z, Integer num2) {
        this();
        hs hsVar = this.G0;
        yy7[] yy7VarArr = P0;
        yy7 yy7Var = yy7VarArr[3];
        hsVar.b(this, Integer.valueOf(i));
        hs hsVar2 = this.H0;
        yy7 yy7Var2 = yy7VarArr[4];
        hsVar2.b(this, num);
        hs hsVar3 = this.M0;
        yy7 yy7Var3 = yy7VarArr[9];
        hsVar3.b(this, yrbVar);
        hs hsVar4 = this.F0;
        yy7 yy7Var4 = yy7VarArr[2];
        hsVar4.b(this, intent);
        hs hsVar5 = this.E0;
        yy7 yy7Var5 = yy7VarArr[1];
        hsVar5.b(this, Boolean.valueOf(z));
        int iIntValue = num2 != null ? num2.intValue() : pab.f;
        hs hsVar6 = this.N0;
        yy7 yy7Var6 = yy7VarArr[10];
        hsVar6.b(this, Integer.valueOf(iIntValue));
    }
}
