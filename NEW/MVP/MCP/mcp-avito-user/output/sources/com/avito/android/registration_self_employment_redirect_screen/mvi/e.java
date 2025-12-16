package com.avito.android.registration_self_employment_redirect_screen.mvi;

import aj0.AbstractC19901b;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelfEmploymentRedirectActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Laj0/b;", "Laj0/c;", "Laj0/e;", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC19901b, aj0.c, aj0.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f252752a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.registration_self_employment_redirect_screen.domain.a f252753b;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.registration_self_employment_redirect_screen.domain.a aVar2) {
        this.f252752a = aVar;
        this.f252753b = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<aj0.c> b(AbstractC19901b abstractC19901b, aj0.e eVar) {
        AbstractC19901b abstractC19901b2 = abstractC19901b;
        if (abstractC19901b2 instanceof AbstractC19901b.C1504b) {
            return C43175k.G(new a(2, null));
        }
        if (abstractC19901b2 instanceof AbstractC19901b.a) {
            return C43175k.G(new b(this, abstractC19901b2, null));
        }
        if (abstractC19901b2 instanceof AbstractC19901b.d) {
            return C43175k.G(new c(this, abstractC19901b2, null));
        }
        if (abstractC19901b2 instanceof AbstractC19901b.c) {
            return C43175k.G(new d(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
