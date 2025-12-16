package com.avito.android.advertising.loaders.beduin;

import kotlin.Metadata;

/* compiled from: CommercialBDUITrackPixelInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/A;", "LdU0/b;", "a", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f88060a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f88061b;

    /* compiled from: CommercialBDUITrackPixelInteraction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/A$a;", "LdU0/c;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends dU0.c {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final a f88062b = new a();

        public a() {
            super("AdvTrackPixel");
        }

        @Override // dU0.c
        public final dU0.b b(com.avito.beduin.v2.engine.core.z zVar, com.avito.beduin.v2.engine.field.m mVar) {
            return new A(mVar.l(zVar, "waterfallId"), mVar.l(zVar, "type"));
        }
    }

    public A(@Y61.k String str, @Y61.k String str2) {
        this.f88060a = str;
        this.f88061b = str2;
    }
}
