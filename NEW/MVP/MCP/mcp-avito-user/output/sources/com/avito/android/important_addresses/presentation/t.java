package com.avito.android.important_addresses.presentation;

import com.avito.android.important_addresses.ItemCoordinates;
import com.avito.android.util.R0;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImportantAddressesPresenterImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/t;", "Ldagger/internal/h;", "Lcom/avito/android/important_addresses/presentation/m;", "a", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements dagger.internal.h<m> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f169688i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<R0> f169689a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final MM.e f169690b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final cv.e f169691c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final MM.h f169692d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final LM.f f169693e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.l f169694f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f169695g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<KM.a> f169696h;

    /* compiled from: ImportantAddressesPresenterImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/important_addresses/presentation/t$a;", "", "<init>", "()V", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public t(@Y61.k Provider provider, @Y61.k MM.e eVar, @Y61.k cv.e eVar2, @Y61.k MM.h hVar, @Y61.k LM.f fVar, @Y61.k dagger.internal.l lVar, @Y61.k dagger.internal.u uVar, @Y61.k Provider provider2) {
        this.f169689a = provider;
        this.f169690b = eVar;
        this.f169691c = eVar2;
        this.f169692d = hVar;
        this.f169693e = fVar;
        this.f169694f = lVar;
        this.f169695g = uVar;
        this.f169696h = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f169689a.get();
        MM.c cVar = (MM.c) this.f169690b.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar = (com.avito.android.deeplink_handler.handler.composite.a) this.f169691c.get();
        MM.g gVar = (MM.g) this.f169692d.get();
        JM.i iVar = (JM.i) this.f169693e.get();
        ItemCoordinates itemCoordinates = (ItemCoordinates) this.f169694f.f393949a;
        JM.d dVar = (JM.d) this.f169695g.get();
        KM.a aVar2 = this.f169696h.get();
        f169688i.getClass();
        return new m(r02, cVar, aVar, gVar, iVar, itemCoordinates, dVar, aVar2);
    }
}
