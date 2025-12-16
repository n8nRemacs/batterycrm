package com.avito.android.di.module;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceCoreModule_ProvideViewedItemsDaoFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y6;", "Ldagger/internal/h;", "Lwu/b;", "a", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.y6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30247y6 implements dagger.internal.h<wu.b> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f144720c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.db.f> f144721a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.server_time.a> f144722b;

    /* compiled from: PersistenceCoreModule_ProvideViewedItemsDaoFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/y6$a;", "", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.y6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30247y6(@Y61.k C30192t6 c30192t6, @Y61.k Provider<com.avito.android.db.f> provider, @Y61.k Provider<com.avito.android.server_time.a> provider2) {
        this.f144721a = provider;
        this.f144722b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.db.f fVar = this.f144721a.get();
        com.avito.android.server_time.a aVar = this.f144722b.get();
        f144720c.getClass();
        return new wu.c(aVar, fVar);
    }
}
