package com.avito.android.send_esia_data_screen.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.x;
import dr0.AbstractC39789a;
import dr0.AbstractC39790b;
import dr0.C39792d;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SendEsiaDataActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/send_esia_data_screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "Ldr0/a;", "Ldr0/b;", "Ldr0/d;", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC39789a, AbstractC39790b, C39792d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f268272a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f268273b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.send_esia_data_screen.domain.a f268274c;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k x xVar, @Y61.k com.avito.android.send_esia_data_screen.domain.a aVar2) {
        this.f268272a = aVar;
        this.f268273b = xVar;
        this.f268274c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC39790b> b(AbstractC39789a abstractC39789a, C39792d c39792d) {
        AbstractC39789a abstractC39789a2 = abstractC39789a;
        if (abstractC39789a2 instanceof AbstractC39789a.C11041a) {
            return C43175k.G(new a(2, null));
        }
        if (abstractC39789a2 instanceof AbstractC39789a.c) {
            return C43175k.G(new b(this, abstractC39789a2, null));
        }
        if (abstractC39789a2 instanceof AbstractC39789a.b) {
            return C43175k.G(new c(this, abstractC39789a2, null));
        }
        if (abstractC39789a2 instanceof AbstractC39789a.d) {
            return C43175k.G(new d(this, abstractC39789a2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
