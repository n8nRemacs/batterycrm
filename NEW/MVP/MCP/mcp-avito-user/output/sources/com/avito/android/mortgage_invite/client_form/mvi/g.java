package com.avito.android.mortgage_invite.client_form.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_form.model.ApplicationClientFormArguments;
import com.avito.android.mortgage_invite.client_form.mvi.entity.ApplicationClientFormInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ApplicationClientFormBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage_invite/client_form/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage_invite/client_form/mvi/entity/ApplicationClientFormInternalAction;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements com.avito.android.arch.mvi.b<ApplicationClientFormInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApplicationClientFormArguments f205253a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage_invite.client_form.domain.k f205254b;

    @Inject
    public g(@Y61.k ApplicationClientFormArguments applicationClientFormArguments, @Y61.k com.avito.android.mortgage_invite.client_form.domain.k kVar) {
        this.f205253a = applicationClientFormArguments;
        this.f205254b = kVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ApplicationClientFormInternalAction> a() {
        return this.f205254b.a(this.f205253a.f205210b);
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
