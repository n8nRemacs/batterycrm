package com.avito.android.safety.password_setting;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.authorization.AuthSource;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import qK0.C47313c;
import so0.InterfaceC48392b;
import xn0.C49971a;

/* compiled from: PasswordSettingFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class b extends H implements Y41.l<InterfaceC48392b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC48392b interfaceC48392b) {
        InterfaceC48392b interfaceC48392b2 = interfaceC48392b;
        PasswordSettingFragment passwordSettingFragment = (PasswordSettingFragment) this.receiver;
        PasswordSettingFragment.a aVar = PasswordSettingFragment.f257418v0;
        passwordSettingFragment.getClass();
        if (interfaceC48392b2 instanceof InterfaceC48392b.a) {
            InterfaceC48392b.a aVar2 = (InterfaceC48392b.a) interfaceC48392b2;
            if (aVar2.f438858a) {
                ActivityC22955m activityC22955mL1 = passwordSettingFragment.l1();
                if (activityC22955mL1 != null) {
                    Intent intent = new Intent();
                    String str = aVar2.f438859b;
                    if (str != null) {
                        intent.putExtra("password_change_result", str);
                    }
                    intent.putExtra("update_profile", true);
                    activityC22955mL1.setResult(-1, intent);
                    activityC22955mL1.finish();
                }
            } else {
                ActivityC22955m activityC22955mL12 = passwordSettingFragment.l1();
                if (activityC22955mL12 != null) {
                    activityC22955mL12.finish();
                }
            }
        } else if (L.f(interfaceC48392b2, InterfaceC48392b.C12645b.f438860a)) {
            C49971a.a(passwordSettingFragment.requireActivity());
        } else if (L.f(interfaceC48392b2, InterfaceC48392b.c.f438861a)) {
            passwordSettingFragment.q5().postDelayed(new com.avito.android.publish.screen.objects.view.actions.h(passwordSettingFragment, 8), 100L);
        } else if (L.f(interfaceC48392b2, InterfaceC48392b.d.f438862a)) {
            InterfaceC19542a interfaceC19542a = passwordSettingFragment.f257420n0;
            if (interfaceC19542a == null) {
                interfaceC19542a = null;
            }
            passwordSettingFragment.startActivityForResult(interfaceC19542a.a(AuthSource.f92722q), 1505);
        } else if (interfaceC48392b2 instanceof InterfaceC48392b.e) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            C47313c c47313c = passwordSettingFragment.f257426t0;
            kotlin.reflect.n<Object> nVar = PasswordSettingFragment.f257419w0[2];
            InterfaceC48392b.e eVar = (InterfaceC48392b.e) interfaceC48392b2;
            com.avito.android.component.toast.c.b(cVar, (View) c47313c.a(), eVar.f438863a, null, null, null, eVar.f438864b, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
        return G0.f406611a;
    }
}
