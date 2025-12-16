package com.avito.android.advertising.loaders.beduin;

import com.avito.beduin.v2.interaction.repository.flow.l;
import kotlin.Metadata;

/* compiled from: CommercialBDUIBannerObserveInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/k;", "Lcom/avito/beduin/v2/interaction/repository/flow/l;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.beduin.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28357k extends com.avito.beduin.v2.interaction.repository.flow.l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f88142e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.entity.A f88143f;

    /* compiled from: CommercialBDUIBannerObserveInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/k$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/l$a;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.beduin.k$a */
    public static final class a extends l.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f88144b = new a();

        public a() {
            super("AdvBanner", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.l.a
        @Y61.k
        public final com.avito.beduin.v2.interaction.repository.flow.l c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
            return new C28357k(mVar.l(zVar, "bannerCode"), mVar.x(zVar, "analyticParams"), lVar, aVar, lVar2, aVar2);
        }
    }

    public C28357k(@Y61.k String str, @Y61.l com.avito.beduin.v2.engine.field.entity.A a12, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.a<dU0.f> aVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar2) {
        super(lVar, aVar, lVar2, aVar2);
        this.f88142e = str;
        this.f88143f = a12;
    }
}
