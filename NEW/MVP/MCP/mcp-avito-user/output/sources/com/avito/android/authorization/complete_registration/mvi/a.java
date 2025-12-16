package com.avito.android.authorization.complete_registration.mvi;

import com.avito.android.R;
import com.avito.android.arch.mvi.a;
import com.avito.android.authorization.complete_registration.mvi.entity.CompleteRegistrationInternalAction;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import ee.InterfaceC40093a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompleteRegistrationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/authorization/complete_registration/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lee/a;", "Lcom/avito/android/authorization/complete_registration/mvi/entity/CompleteRegistrationInternalAction;", "Lee/c;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC40093a, CompleteRegistrationInternalAction, ee.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f93451a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f93452b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f93453c;

    @Inject
    public a(@Y61.k f fVar, @Y61.k @com.avito.android.authorization.complete_registration.di.g String str, @com.avito.android.authorization.complete_registration.di.f @Y61.k String str2) {
        this.f93451a = fVar;
        this.f93452b = str;
        this.f93453c = str2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<CompleteRegistrationInternalAction> b(InterfaceC40093a interfaceC40093a, ee.c cVar) {
        C43210w c43210w;
        InterfaceC40093a interfaceC40093a2 = interfaceC40093a;
        ee.c cVar2 = cVar;
        boolean z12 = interfaceC40093a2 instanceof InterfaceC40093a.c;
        String str = cVar2.f395281d;
        String str2 = cVar2.f395280c;
        if (z12) {
            if (str2.length() == 0 || str.length() == 0) {
                return new C43210w(new CompleteRegistrationInternalAction.HighlightInputs(str2.length() == 0 ? com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]) : null, str.length() == 0 ? com.avito.android.printable_text.b.c(R.string.empty_input_error, new Serializable[0]) : null));
            }
            if (((InterfaceC40093a.c) interfaceC40093a2).f395265a) {
                return this.f93451a.a(this.f93452b, this.f93453c, cVar2.f395280c, cVar2.f395281d, cVar2.f395282e);
            }
            return new C43210w(new CompleteRegistrationInternalAction.FocusInput(InputType.f93480c));
        }
        if (interfaceC40093a2 instanceof InterfaceC40093a.C11094a) {
            InterfaceC40093a.C11094a c11094a = (InterfaceC40093a.C11094a) interfaceC40093a2;
            return this.f93451a.b(c11094a.f395262a, c11094a.f395263b, this.f93452b, cVar2.f395282e, str);
        }
        boolean zEquals = interfaceC40093a2.equals(InterfaceC40093a.d.f395266a);
        InputType inputType = cVar2.f395283f;
        if (zEquals) {
            return new C43210w(new CompleteRegistrationInternalAction.FocusInput(inputType));
        }
        if (interfaceC40093a2 instanceof InterfaceC40093a.b) {
            InputType inputType2 = ((InterfaceC40093a.b) interfaceC40093a2).f395264a;
            if (inputType == inputType2) {
                return C43175k.w();
            }
            c43210w = new C43210w(new CompleteRegistrationInternalAction.SaveFocusedInput(inputType2));
        } else if (interfaceC40093a2 instanceof InterfaceC40093a.e) {
            String str3 = ((InterfaceC40093a.e) interfaceC40093a2).f395267a;
            if (L.f(str2, str3)) {
                return C43175k.w();
            }
            c43210w = new C43210w(new CompleteRegistrationInternalAction.UpdateName(str3));
        } else {
            if (!(interfaceC40093a2 instanceof InterfaceC40093a.f)) {
                throw new NoWhenBranchMatchedException();
            }
            String str4 = ((InterfaceC40093a.f) interfaceC40093a2).f395268a;
            if (L.f(str, str4)) {
                return C43175k.w();
            }
            c43210w = new C43210w(new CompleteRegistrationInternalAction.UpdatePassword(str4));
        }
        return c43210w;
    }
}
