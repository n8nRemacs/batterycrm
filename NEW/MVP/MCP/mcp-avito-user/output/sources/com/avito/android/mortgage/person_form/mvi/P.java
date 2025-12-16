package com.avito.android.mortgage.person_form.mvi;

import G00.b;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormReducer.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/P;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "LG00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class P implements com.avito.android.arch.mvi.u<PersonFormInternalAction, G00.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final D00.a f200891b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.analytics.c f200892c;

    @Inject
    public P(@Y61.k D00.a aVar, @Y61.k com.avito.android.mortgage.person_form.analytics.c cVar) {
        this.f200891b = aVar;
        this.f200892c = cVar;
    }

    public static final G00.c b(P p12, G00.c cVar, JZ.m mVar) {
        p12.getClass();
        return G00.c.a(cVar, null, null, null, null, null, null, 0, mVar.getNeedCheckAccess(), mVar.getTitle(), null, mVar.getVerificationBanner(), mVar.getActionBanner(), false, null, b.a.f6137a, null, 45695);
    }

    @Override // com.avito.android.arch.mvi.u
    public final G00.c a(PersonFormInternalAction personFormInternalAction, G00.c cVar) {
        PersonFormInternalAction personFormInternalAction2 = personFormInternalAction;
        G00.c cVar2 = cVar;
        G00.c cVarA = this.f200891b.a((G00.c) new O(personFormInternalAction2, this, cVar2).invoke(cVar2));
        this.f200892c.a(personFormInternalAction2, cVarA);
        return cVarA;
    }
}
