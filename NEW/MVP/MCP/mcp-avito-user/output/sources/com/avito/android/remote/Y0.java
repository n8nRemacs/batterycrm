package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchApi_Module_ProvideSearchApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/Y0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/V0;", "a", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Y0 implements dagger.internal.h<V0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253064b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253065a;

    /* compiled from: SearchApi_Module_ProvideSearchApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/Y0$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Y0(@Y61.k dagger.internal.f fVar) {
        this.f253065a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253065a.get();
        f253064b.getClass();
        X0.f253059a.getClass();
        V0 v02 = (V0) r02.create(V0.class);
        dagger.internal.t.b(v02, "Cannot return null from a non-@Nullable @Provides method");
        return v02;
    }
}
