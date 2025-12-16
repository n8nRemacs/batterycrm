package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.d53;
import defpackage.dq3;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.g56;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.ho7;
import defpackage.hs;
import defpackage.imb;
import defpackage.j0c;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.o4d;
import defpackage.toc;
import defpackage.vid;
import defpackage.wp3;
import defpackage.xp3;
import defpackage.yo3;
import defpackage.yp3;
import defpackage.yy7;
import defpackage.zp3;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "(Ljava/lang/String;)V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ yy7[] X = {new toc(ConfirmPinCodeScreen.class, "hash", "getHash()Ljava/lang/String;", 0), ho7.d(vid.a, ConfirmPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    public final hs a;
    public final k18 b;
    public final ka5 c;
    public final eo7 d;
    public final bbd o;

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new hs(String.class, "confirm_pin_code:hash");
        this.b = createViewModelLazy(dq3.class, new yo3(2, new wp3(this, 1)));
        this.c = new ka5(f1e.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.d = eo7.f;
        this.o = viewBinding(a0d.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final j0c y0(ConfirmPinCodeScreen confirmPinCodeScreen) {
        return (j0c) confirmPinCodeScreen.o.D(confirmPinCodeScreen, X[1]);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j0c j0cVar = new j0c(viewGroup.getContext());
        j0cVar.setId(a0d.oneme_settings_privacy_setup_pin_code_root_view);
        j0cVar.setListener((dq3) this.b.getValue());
        j0cVar.setTitle(o4d.oneme_settings_privacy_onboarding_re_enter_pin_code);
        j0cVar.setLocked(true);
        j0cVar.setOnBackPress(new wp3(this, 0));
        return j0cVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k18 k18Var = this.b;
        d53 d53Var = ((dq3) k18Var.getValue()).Z;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new xp3(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((dq3) k18Var.getValue()).u0, getViewLifecycleOwner().p(), l38Var), new yp3(2, null), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((dq3) k18Var.getValue()).t0, getViewLifecycleOwner().p(), l38Var), new zp3(null, this), 1), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str) {
        this(gwi.b(new imb("confirm_pin_code:hash", str)));
    }
}
