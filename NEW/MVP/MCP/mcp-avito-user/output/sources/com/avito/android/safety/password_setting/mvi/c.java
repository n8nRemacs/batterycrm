package com.avito.android.safety.password_setting.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.credman.o;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingInternalAction;
import com.avito.android.safety.password_setting.mvi.entity.PasswordSettingState;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import so0.InterfaceC48391a;

/* compiled from: PasswordSettingActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/password_setting/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "Lso0/a;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingInternalAction;", "Lcom/avito/android/safety/password_setting/mvi/entity/PasswordSettingState;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC48391a, PasswordSettingInternalAction, PasswordSettingState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final o f257484a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.password_setting.i f257485b;

    @Inject
    public c(@Y61.k o oVar, @Y61.k com.avito.android.safety.password_setting.i iVar) {
        this.f257484a = oVar;
        this.f257485b = iVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PasswordSettingInternalAction> b(InterfaceC48391a interfaceC48391a, PasswordSettingState passwordSettingState) {
        InterfaceC48391a interfaceC48391a2 = interfaceC48391a;
        PasswordSettingState passwordSettingState2 = passwordSettingState;
        if (interfaceC48391a2.equals(InterfaceC48391a.C12644a.f438853a)) {
            return new C43210w(PasswordSettingInternalAction.Close.f257489b);
        }
        if (interfaceC48391a2.equals(InterfaceC48391a.c.f438855a)) {
            return new C43210w(PasswordSettingInternalAction.FocusInput.f257495b);
        }
        boolean z12 = interfaceC48391a2 instanceof InterfaceC48391a.e;
        String str = passwordSettingState2.f257504c;
        if (z12) {
            String str2 = ((InterfaceC48391a.e) interfaceC48391a2).f438857a;
            return !L.f(str, str2) ? new C43210w(new PasswordSettingInternalAction.UpdatePassword(str2)) : C43175k.w();
        }
        if (!(interfaceC48391a2 instanceof InterfaceC48391a.d)) {
            if (interfaceC48391a2 instanceof InterfaceC48391a.b) {
                return ((InterfaceC48391a.b) interfaceC48391a2).f438854a ? C43175k.w() : new C43210w(PasswordSettingInternalAction.Close.f257489b);
            }
            throw new NoWhenBranchMatchedException();
        }
        if (str.length() == 0) {
            return new C43210w(new PasswordSettingInternalAction.HighlightInput(com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0])));
        }
        if (((InterfaceC48391a.d) interfaceC48391a2).f438856a) {
            return C43175k.C(new b(passwordSettingState2.f257505d, this, str, null), this.f257485b.b(str));
        }
        return new C43210w(PasswordSettingInternalAction.FocusInput.f257495b);
    }
}
