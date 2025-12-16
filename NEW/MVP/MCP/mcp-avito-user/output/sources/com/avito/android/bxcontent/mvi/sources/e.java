package com.avito.android.bxcontent.mvi.sources;

import Y61.k;
import com.avito.android.bxcontent.E1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: ServiceOrderRequestsDataSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/sources/e;", "Lcom/avito/android/bxcontent/mvi/sources/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final E1 f112559a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Bu0.b f112560b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.rich_snippets.service.order_request.a f112561c;

    @Inject
    public e(@k E1 e12, @k Bu0.b bVar, @k com.avito.android.serp.adapter.rich_snippets.service.order_request.a aVar) {
        this.f112559a = e12;
        this.f112560b = bVar;
        this.f112561c = aVar;
    }

    @Override // com.avito.android.bxcontent.mvi.sources.a
    @k
    public final C0 a(@k Y41.a aVar) {
        return C43175k.B(new d(2, null), C43175k.B(new c(aVar, this, null), C43175k.B(new b(aVar, this, null), this.f112560b.a())));
    }
}
