package com.avito.android.delivery_tarifikator.domain;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationTermsDataGuardImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/v;", "Ldagger/internal/h;", "Lcom/avito/android/delivery_tarifikator/domain/u;", "a", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.delivery_tarifikator.domain.v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29825v implements dagger.internal.h<C29824u> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f135342b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<Mv.i> f135343a;

    /* compiled from: LocationTermsDataGuardImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/v$a;", "", "<init>", "()V", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.delivery_tarifikator.domain.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C29825v(@Y61.k Provider<Mv.i> provider) {
        this.f135343a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Mv.i iVar = this.f135343a.get();
        f135342b.getClass();
        return new C29824u(iVar);
    }
}
