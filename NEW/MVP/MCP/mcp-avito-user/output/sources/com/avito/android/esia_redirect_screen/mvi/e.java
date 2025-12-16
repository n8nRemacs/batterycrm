package com.avito.android.esia_redirect_screen.mvi;

import Iz.AbstractC14176a;
import Iz.AbstractC14178c;
import com.avito.android.arch.mvi.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EsiaRedirectActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LIz/a;", "LIz/c;", "LIz/e;", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.a<AbstractC14176a, AbstractC14178c, Iz.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f148073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.esia_redirect_screen.mvi.data_loaders.b f148074b;

    @Inject
    public e(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.esia_redirect_screen.mvi.data_loaders.b bVar) {
        this.f148073a = aVar;
        this.f148074b = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AbstractC14178c> b(AbstractC14176a abstractC14176a, Iz.e eVar) {
        AbstractC14176a abstractC14176a2 = abstractC14176a;
        if (abstractC14176a2 instanceof AbstractC14176a.b) {
            return C43175k.G(new a(this, abstractC14176a2, null));
        }
        if (abstractC14176a2 instanceof AbstractC14176a.c) {
            return C43175k.G(new b(this, abstractC14176a2, null));
        }
        if (abstractC14176a2 instanceof AbstractC14176a.C0497a) {
            return C43175k.G(new c(2, null));
        }
        if (abstractC14176a2 instanceof AbstractC14176a.d) {
            return C43175k.G(new d(this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
