package com.avito.android.referral_contacts.mvi;

import Ui0.d;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ReferralContactsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/referral_contacts/mvi/f;", "Lcom/avito/android/arch/mvi/a;", "LUi0/d;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "LUi0/f;", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.a<Ui0.d, ReferralContactsInternalAction, Ui0.f> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f252532a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.referral_contacts.c f252533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.referral_contacts.domain.h f252534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f252535d;

    @Inject
    public f(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.referral_contacts.c cVar, @Y61.k com.avito.android.referral_contacts.domain.h hVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f252532a = aVar;
        this.f252533b = cVar;
        this.f252534c = hVar;
        this.f252535d = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<ReferralContactsInternalAction> b(Ui0.d dVar, Ui0.f fVar) {
        Ui0.d dVar2 = dVar;
        if (dVar2 instanceof d.c) {
            return C43175k.G(new a(2, null));
        }
        if (dVar2 instanceof d.a) {
            return C43175k.G(new b(this, dVar2, null));
        }
        if (dVar2 instanceof d.e) {
            return C43175k.G(new c(dVar2, null));
        }
        if (dVar2.equals(d.b.f16564a)) {
            return C43175k.G(new d(this, null));
        }
        if (dVar2.equals(d.C1138d.f16566a)) {
            return C43175k.G(new e(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
