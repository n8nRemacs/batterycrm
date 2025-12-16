package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.api;
import defpackage.aw0;
import defpackage.bbd;
import defpackage.ci5;
import defpackage.cm6;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.g56;
import defpackage.gw0;
import defpackage.j0c;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l48;
import defpackage.o4d;
import defpackage.og5;
import defpackage.pg5;
import defpackage.ps3;
import defpackage.qg5;
import defpackage.sg5;
import defpackage.toc;
import defpackage.vid;
import defpackage.yo3;
import defpackage.yy7;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "ng5", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ yy7[] o;
    public final eo7 a;
    public final ka5 b;
    public final k18 c;
    public final bbd d;

    static {
        toc tocVar = new toc(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0);
        vid.a.getClass();
        o = new yy7[]{tocVar};
    }

    public EnterPinCodeScreen() {
        super(null, 0, 3, null);
        this.a = eo7.f;
        this.b = new ka5(f1e.SETTINGS_PRIVACY_INSERT_PINCODE);
        this.c = createViewModelLazy(sg5.class, new yo3(9, new ps3(27)));
        this.d = viewBinding(a0d.oneme_settings_privacy_enter_pin_code_root);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final eo7 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j0c j0cVar = new j0c(viewGroup.getContext());
        j0cVar.setId(a0d.oneme_settings_privacy_enter_pin_code_root);
        j0cVar.setListener((sg5) this.c.getValue());
        j0cVar.setTitle(o4d.oneme_settings_privacy_enter_pin_code_title);
        j0cVar.setDescription(Integer.valueOf(o4d.oneme_settings_privacy_enter_pin_code_description));
        j0cVar.setLocked(true);
        final int i = 0;
        j0cVar.setOnBackPress(new cm6(this) { // from class: mg5
            public final /* synthetic */ EnterPinCodeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i2 = i;
                qqg qqgVar = qqg.a;
                EnterPinCodeScreen enterPinCodeScreen = this.b;
                switch (i2) {
                    case 0:
                        yy7[] yy7VarArr = EnterPinCodeScreen.o;
                        api.e(enterPinCodeScreen.getView());
                        jva onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                        break;
                    default:
                        yy7[] yy7VarArr2 = EnterPinCodeScreen.o;
                        sg5 sg5Var = (sg5) enterPinCodeScreen.c.getValue();
                        if (!sg5Var.s0) {
                            xfh.r(sg5Var.Y, qqgVar);
                            break;
                        }
                        break;
                }
                return qqgVar;
            }
        });
        final int i2 = 1;
        j0cVar.setForgotPinCodeClickListener(new cm6(this) { // from class: mg5
            public final /* synthetic */ EnterPinCodeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                int i22 = i2;
                qqg qqgVar = qqg.a;
                EnterPinCodeScreen enterPinCodeScreen = this.b;
                switch (i22) {
                    case 0:
                        yy7[] yy7VarArr = EnterPinCodeScreen.o;
                        api.e(enterPinCodeScreen.getView());
                        jva onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                        break;
                    default:
                        yy7[] yy7VarArr2 = EnterPinCodeScreen.o;
                        sg5 sg5Var = (sg5) enterPinCodeScreen.c.getValue();
                        if (!sg5Var.s0) {
                            xfh.r(sg5Var.Y, qqgVar);
                            break;
                        }
                        break;
                }
                return qqgVar;
            }
        });
        return j0cVar;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        api.e(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        k18 k18Var = this.c;
        ci5 ci5Var = ((sg5) k18Var.getValue()).o;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(ci5Var, l48VarP, l38Var), new og5(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((sg5) k18Var.getValue()).X, getViewLifecycleOwner().p(), l38Var), new pg5(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(((sg5) k18Var.getValue()).Y, getViewLifecycleOwner().p(), l38Var), new qg5(null, this), 1), getViewLifecycleScope());
    }
}
