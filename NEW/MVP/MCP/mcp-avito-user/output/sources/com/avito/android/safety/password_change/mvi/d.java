package com.avito.android.safety.password_change.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.safety.password_change.PasswordChangeParams;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeInternalAction;
import com.avito.android.safety.password_change.mvi.entity.PasswordChangeState;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qo0.C47423b;
import ro0.InterfaceC47696a;

/* compiled from: PasswordChangeActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/safety/password_change/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "Lro0/a;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeInternalAction;", "Lcom/avito/android/safety/password_change/mvi/entity/PasswordChangeState;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC47696a, PasswordChangeInternalAction, PasswordChangeState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PasswordChangeParams f257303a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f257304b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p f257305c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.o f257306d;

    @Inject
    public d(@Y61.k PasswordChangeParams passwordChangeParams, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k p pVar, @Y61.k com.avito.android.credman.o oVar) {
        this.f257303a = passwordChangeParams;
        this.f257304b = interfaceC28373a;
        this.f257305c = pVar;
        this.f257306d = oVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<PasswordChangeInternalAction> b(InterfaceC47696a interfaceC47696a, PasswordChangeState passwordChangeState) {
        C43210w c43210w;
        InterfaceC47696a interfaceC47696a2 = interfaceC47696a;
        PasswordChangeState passwordChangeState2 = passwordChangeState;
        boolean z12 = interfaceC47696a2 instanceof InterfaceC47696a.c;
        String str = passwordChangeState2.f257344f;
        p pVar = this.f257305c;
        PasswordChangeParams passwordChangeParams = this.f257303a;
        String str2 = passwordChangeState2.f257342d;
        String str3 = passwordChangeState2.f257341c;
        if (z12) {
            if (str3.length() == 0 || str2.length() == 0) {
                return new C43210w(new PasswordChangeInternalAction.HighlightInputs(str3.length() == 0 ? com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]) : null, str2.length() == 0 ? com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]) : null));
            }
            if (!((InterfaceC47696a.c) interfaceC47696a2).f430170a) {
                return new C43210w(new PasswordChangeInternalAction.FocusInput(InputType.f257312c));
            }
            boolean zA2 = com.avito.android.safety.password_change.t.a(passwordChangeParams);
            String str4 = passwordChangeParams.f257235e;
            if (zA2) {
                String str5 = passwordChangeParams.f257234d;
                if (str5 == null) {
                    str5 = "";
                }
                this.f257304b.c(new C47423b(str4, str5));
            }
            return C43175k.C(new a(str, this, str2, null), pVar.c(str3, str2, str4, passwordChangeParams.f257233c));
        }
        boolean z13 = interfaceC47696a2 instanceof InterfaceC47696a.e;
        InputType inputType = passwordChangeState2.f257343e;
        if (z13) {
            InputType inputType2 = ((InterfaceC47696a.e) interfaceC47696a2).f430172a;
            if (inputType == inputType2) {
                return C43175k.w();
            }
            c43210w = new C43210w(new PasswordChangeInternalAction.SaveFocusedInput(inputType2));
        } else {
            boolean zEquals = interfaceC47696a2.equals(InterfaceC47696a.f.f430173a);
            boolean z14 = passwordChangeState2.f257345g;
            if (zEquals) {
                return new C43207v(new PasswordChangeInternalAction[]{new PasswordChangeInternalAction.ToggleOldPasswordHidden(z14), new PasswordChangeInternalAction.FocusInput(inputType)});
            }
            if (interfaceC47696a2 instanceof InterfaceC47696a.h) {
                String str6 = ((InterfaceC47696a.h) interfaceC47696a2).f430175a;
                if (L.f(str2, str6)) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new PasswordChangeInternalAction.UpdateNewPassword(str6));
            } else {
                if (!(interfaceC47696a2 instanceof InterfaceC47696a.i)) {
                    if (interfaceC47696a2.equals(InterfaceC47696a.b.f430169a)) {
                        return new C43210w(PasswordChangeInternalAction.Close.f257315b);
                    }
                    if (interfaceC47696a2 instanceof InterfaceC47696a.C12393a) {
                        return ((InterfaceC47696a.C12393a) interfaceC47696a2).f430168a ? C43175k.N(pVar.a(), C43175k.G(new b(this, null))) : com.avito.android.safety.password_change.t.a(passwordChangeParams) ? new C43210w(PasswordChangeInternalAction.NavigateHome.f257327b) : new C43210w(PasswordChangeInternalAction.Close.f257315b);
                    }
                    if (interfaceC47696a2.equals(InterfaceC47696a.d.f430171a)) {
                        return new C43210w(new PasswordChangeInternalAction.OpenPasswordRecovery(str));
                    }
                    if (interfaceC47696a2 instanceof InterfaceC47696a.g) {
                        return new C43210w(new PasswordChangeInternalAction.ToggleOldPasswordHidden(!z14));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String str7 = ((InterfaceC47696a.i) interfaceC47696a2).f430176a;
                if (L.f(str3, str7)) {
                    return C43175k.w();
                }
                c43210w = new C43210w(new PasswordChangeInternalAction.UpdateOldPassword(str7));
            }
        }
        return c43210w;
    }
}
