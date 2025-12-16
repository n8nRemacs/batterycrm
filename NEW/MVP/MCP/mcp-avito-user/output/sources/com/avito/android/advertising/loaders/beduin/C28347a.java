package com.avito.android.advertising.loaders.beduin;

import com.avito.android.remote.model.SerpDisplayType;
import com.avito.beduin.v2.engine.field.exception.BeduinPropertyException;
import com.avito.beduin.v2.interaction.repository.flow.d;
import kotlin.Metadata;

/* compiled from: CommercialBDUIBannerGetInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.beduin.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28347a extends com.avito.beduin.v2.interaction.repository.flow.d {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f88099d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f88100e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88101f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f88102g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Integer f88103h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Integer f88104i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final com.avito.beduin.v2.engine.field.entity.A f88105j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f88106k;

    /* compiled from: CommercialBDUIBannerGetInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/a$a;", "Lcom/avito/beduin/v2/interaction/repository/flow/d$a;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.beduin.a$a, reason: collision with other inner class name */
    public static final class C2609a extends d.a {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C2609a f88107b = new C2609a();

        public C2609a() {
            super("AdvBanner", null, 2, null);
        }

        @Override // com.avito.beduin.v2.interaction.repository.flow.d.a
        @Y61.k
        public final com.avito.beduin.v2.interaction.repository.flow.d c(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) throws BeduinPropertyException {
            SerpDisplayType serpDisplayTypeFromString;
            String strL = mVar.l(zVar, "waterfallId");
            String strL2 = mVar.l(zVar, "waterfall");
            Integer numS = mVar.s(zVar, "page");
            Integer numS2 = mVar.s(zVar, "itemIndex");
            Integer numS3 = mVar.s(zVar, "size");
            int iIntValue = numS3 != null ? numS3.intValue() : 1;
            String strW = mVar.w(zVar, "displayType");
            if (strW == null || (serpDisplayTypeFromString = SerpDisplayType.INSTANCE.fromString(strW)) == null) {
                serpDisplayTypeFromString = SerpDisplayType.Grid;
            }
            SerpDisplayType serpDisplayType = serpDisplayTypeFromString;
            com.avito.beduin.v2.engine.field.entity.A aX2 = mVar.x(zVar, "analyticParams");
            Boolean boolO = mVar.o(zVar, "useEvictionCache");
            return new C28347a(strL, strL2, iIntValue, serpDisplayType, numS, numS2, aX2, boolO != null ? boolO.booleanValue() : false, lVar, lVar2, aVar);
        }
    }

    public C28347a(@Y61.k String str, @Y61.k String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l com.avito.beduin.v2.engine.field.entity.A a12, boolean z12, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar, @Y61.k Y41.l<? super com.avito.beduin.v2.engine.field.d, dU0.f> lVar2, @Y61.l Y41.a<dU0.f> aVar) {
        super(aVar, lVar, lVar2);
        this.f88099d = str;
        this.f88100e = str2;
        this.f88101f = i12;
        this.f88102g = serpDisplayType;
        this.f88103h = num;
        this.f88104i = num2;
        this.f88105j = a12;
        this.f88106k = z12;
    }
}
