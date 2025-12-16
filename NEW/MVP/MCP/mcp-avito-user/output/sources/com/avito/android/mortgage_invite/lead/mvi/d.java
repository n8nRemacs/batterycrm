package com.avito.android.mortgage_invite.lead.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.lead.model.ApplicationLeadArguments;
import com.avito.android.mortgage_invite.lead.mvi.entity.ApplicationLeadInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import m20.InterfaceC43866b;

/* compiled from: ApplicationLeadBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements com.avito.android.arch.mvi.b<ApplicationLeadInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43866b f205902a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ApplicationLeadArguments f205903b;

    @Inject
    public d(@Y61.k InterfaceC43866b interfaceC43866b, @Y61.k ApplicationLeadArguments applicationLeadArguments) {
        this.f205902a = interfaceC43866b;
        this.f205903b = applicationLeadArguments;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ApplicationLeadInternalAction> a() {
        ApplicationLeadArguments applicationLeadArguments = this.f205903b;
        this.f205902a.a(applicationLeadArguments.f205894b, applicationLeadArguments.f205895c);
        return C43175k.w();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
