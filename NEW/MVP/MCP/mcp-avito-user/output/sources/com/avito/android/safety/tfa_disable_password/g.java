package com.avito.android.safety.tfa_disable_password;

import Zd.InterfaceC19542a;
import android.content.Intent;
import android.view.View;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import qK0.C47313c;
import wo0.InterfaceC49660b;

/* compiled from: TfaDisablePasswordFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class g extends H implements Y41.l<InterfaceC49660b, G0> {
    @Override // Y41.l
    public final G0 invoke(InterfaceC49660b interfaceC49660b) {
        InterfaceC49660b interfaceC49660b2 = interfaceC49660b;
        TfaDisablePasswordFragment tfaDisablePasswordFragment = (TfaDisablePasswordFragment) this.receiver;
        TfaDisablePasswordFragment.a aVar = TfaDisablePasswordFragment.f258071x0;
        tfaDisablePasswordFragment.getClass();
        if (interfaceC49660b2 instanceof InterfaceC49660b.a) {
            tfaDisablePasswordFragment.s5(((InterfaceC49660b.a) interfaceC49660b2).f441785a);
        } else if (L.f(interfaceC49660b2, InterfaceC49660b.C12831b.f441786a)) {
            InterfaceC19542a interfaceC19542a = tfaDisablePasswordFragment.f258075p0;
            if (interfaceC19542a == null) {
                interfaceC19542a = null;
            }
            Intent intentA = InterfaceC19542a.C1444a.a(interfaceC19542a, null, 7);
            intentA.setFlags(603979776);
            tfaDisablePasswordFragment.startActivity(intentA);
        } else if (interfaceC49660b2 instanceof InterfaceC49660b.d) {
            InterfaceC49660b.d dVar = (InterfaceC49660b.d) interfaceC49660b2;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            C47313c c47313c = tfaDisablePasswordFragment.f258080u0;
            kotlin.reflect.n<Object> nVar = TfaDisablePasswordFragment.f258072y0[3];
            com.avito.android.component.toast.c.b(cVar, (View) c47313c.a(), dVar.f441788a, null, null, null, dVar.f441789b, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        } else if (interfaceC49660b2 instanceof InterfaceC49660b.e) {
            CE0.a.a(tfaDisablePasswordFragment.q5(), false, null, null);
        } else if (L.f(interfaceC49660b2, InterfaceC49660b.c.f441787a)) {
            Input inputQ5 = tfaDisablePasswordFragment.q5();
            inputQ5.v();
            inputQ5.q();
        }
        return G0.f406611a;
    }
}
