package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a0d;
import defpackage.aw0;
import defpackage.d53;
import defpackage.efd;
import defpackage.eo7;
import defpackage.f1e;
import defpackage.g56;
import defpackage.gw0;
import defpackage.j0c;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.l38;
import defpackage.l3b;
import defpackage.o4d;
import defpackage.pse;
import defpackage.rse;
import defpackage.vdc;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SetupPinCodeScreen extends Widget {
    public static final /* synthetic */ int d = 0;
    public final k18 a;
    public final ka5 b;
    public final eo7 c;

    public SetupPinCodeScreen() {
        super(null, 0, 3, null);
        this.a = createViewModelLazy(rse.class, new vdc(20, new efd(29)));
        this.b = new ka5(f1e.SETTINGS_PRIVACY_NEW_PINCODE);
        this.c = eo7.f;
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

    @Override // one.me.sdk.arch.Widget, defpackage.c54
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j0c j0cVar = new j0c(viewGroup.getContext());
        j0cVar.setId(a0d.oneme_settings_privacy_setup_pin_code_root_view);
        j0cVar.setListener((rse) this.a.getValue());
        j0cVar.setTitle(o4d.oneme_settings_privacy_onboarding_come_up_pin_code);
        j0cVar.setLocked(false);
        j0cVar.setOnBackPress(new l3b(j0cVar, 27, this));
        return j0cVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        gw0.w(new g56(aw0.a(new d53(((rse) this.a.getValue()).o, 12), getViewLifecycleOwner().p(), l38.d), new pse(2, null), 1), getViewLifecycleScope());
    }
}
