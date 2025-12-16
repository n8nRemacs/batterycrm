package com.avito.android.safety.tfa_disable_password.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.safety.tfa_disable_password.mvi.entity.TfaDisablePasswordInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import wo0.C49661c;
import wo0.InterfaceC49659a;

/* compiled from: TfaDisablePasswordActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/tfa_disable_password/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lwo0/a;", "Lcom/avito/android/safety/tfa_disable_password/mvi/entity/TfaDisablePasswordInternalAction;", "Lwo0/c;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC49659a, TfaDisablePasswordInternalAction, C49661c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.safety_settings.domain.d f258112a;

    @Inject
    public b(@Y61.k com.avito.android.safety.safety_settings.domain.d dVar) {
        this.f258112a = dVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TfaDisablePasswordInternalAction> b(InterfaceC49659a interfaceC49659a, C49661c c49661c) {
        InterfaceC43160i<TfaDisablePasswordInternalAction> c43210w;
        InterfaceC49659a interfaceC49659a2 = interfaceC49659a;
        C49661c c49661c2 = c49661c;
        if (interfaceC49659a2.equals(InterfaceC49659a.C12830a.f441780a)) {
            return new C43210w(TfaDisablePasswordInternalAction.Close.f258119b);
        }
        boolean zEquals = interfaceC49659a2.equals(InterfaceC49659a.b.f441781a);
        String str = c49661c2.f441792b;
        if (zEquals) {
            if (str.length() == 0) {
                return new C43210w(new TfaDisablePasswordInternalAction.HighlightInput(com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0])));
            }
            c43210w = C43175k.G(new a(this, str, null));
        } else {
            if (interfaceC49659a2.equals(InterfaceC49659a.c.f441782a)) {
                return new C43210w(TfaDisablePasswordInternalAction.ForgotPassword.f258120b);
            }
            if (interfaceC49659a2.equals(InterfaceC49659a.d.f441783a)) {
                return new C43210w(new TfaDisablePasswordInternalAction.TogglePasswordHidden(!c49661c2.f441793c));
            }
            if (!(interfaceC49659a2 instanceof InterfaceC49659a.e)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((InterfaceC49659a.e) interfaceC49659a2).f441784a;
            if (L.f(str, str2)) {
                return C43175k.w();
            }
            c43210w = new C43210w(new TfaDisablePasswordInternalAction.UpdatePassword(str2));
        }
        return c43210w;
    }
}
