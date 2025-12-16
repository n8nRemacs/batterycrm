package com.avito.android.email.email_confirmation.mvi;

import Ey.InterfaceC13544a;
import com.avito.android.arch.mvi.a;
import com.avito.android.email.email_confirmation.mvi.entity.EmailConfirmationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EmailConfirmationActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LEy/a;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "LEy/c;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13544a, EmailConfirmationInternalAction, Ey.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EmailConfirmationInternalAction> b(InterfaceC13544a interfaceC13544a, Ey.c cVar) {
        return C43175k.w();
    }
}
