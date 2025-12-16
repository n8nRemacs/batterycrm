package com.avito.android.advertising.loaders.beduin;

import com.avito.android.advertising.loaders.beduin.A;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CommercialBDUITrackPixelInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/C;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/android/advertising/loaders/beduin/A;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class C extends com.avito.beduin.v2.handler.flow.i<A> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<H> f88065c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.android.advertising.loaders.event_service.c> f88066d;

    /* JADX WARN: Multi-variable type inference failed */
    public C(@Y61.k Y41.a<? extends H> aVar, @Y61.k Y41.a<? extends com.avito.android.advertising.loaders.event_service.c> aVar2) {
        super(A.a.f88062b);
        this.f88065c = aVar;
        this.f88066d = aVar2;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i p(dU0.b bVar) {
        return C43175k.G(new B(this, (A) bVar, null));
    }
}
