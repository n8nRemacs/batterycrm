package com.avito.android.di.module;

import f90.C40248B;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PersistenceCoreModule_ProvidePrefVersionStorageFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/w6;", "Ldagger/internal/h;", "Lf90/B;", "a", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.w6, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30225w6 implements dagger.internal.h<C40248B> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f144691c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30214v6 f144692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f144693b;

    /* compiled from: PersistenceCoreModule_ProvidePrefVersionStorageFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/w6$a;", "", "<init>", "()V", "_avito-discouraged_persistence_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.w6$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30225w6(@Y61.k C30192t6 c30192t6, @Y61.k C30214v6 c30214v6, @Y61.k Provider provider) {
        this.f144692a = c30214v6;
        this.f144693b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        AK0.l lVar = (AK0.l) this.f144692a.get();
        com.avito.android.util.C c12 = this.f144693b.get();
        f144691c.getClass();
        return new C40248B(lVar, c12.a());
    }
}
