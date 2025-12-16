package com.avito.android.di.module;

import com.avito.android.app.task.C28583p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreModule_ProvideMutableApplicationStartupTasksRegistryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/s3;", "Ldagger/internal/h;", "Lcom/avito/android/app/task/M0;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.s3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30178s3 implements dagger.internal.h<com.avito.android.app.task.M0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144574b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144575a;

    /* compiled from: CoreModule_ProvideMutableApplicationStartupTasksRegistryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/s3$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.s3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30178s3(@Y61.k C30080j3 c30080j3, @Y61.k com.avito.android.S s5) {
        this.f144575a = s5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f144575a.get();
        f144574b.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[21];
        return new C28583p(((Boolean) p12.f67428q.a().invoke()).booleanValue());
    }
}
