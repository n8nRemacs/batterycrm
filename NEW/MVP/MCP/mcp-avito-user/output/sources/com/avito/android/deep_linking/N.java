package com.avito.android.deep_linking;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lv.C43834a;

/* compiled from: FavoriteSellersDeeplinkMappingModule_ProvideRetrySellerSubscriptionLinkMappingFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/N;", "Ldagger/internal/h;", "Llv/a;", "a", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class N implements dagger.internal.h<C43834a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f132849b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Q f132850a;

    /* compiled from: FavoriteSellersDeeplinkMappingModule_ProvideRetrySellerSubscriptionLinkMappingFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/N$a;", "", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public N(@Y61.k Q q12) {
        this.f132850a = q12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f132849b.getClass();
        M.f132848a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(RetrySellerSubscriptionLink.class, new S(), new C43834a.b.C11809b(this.f132850a));
    }
}
