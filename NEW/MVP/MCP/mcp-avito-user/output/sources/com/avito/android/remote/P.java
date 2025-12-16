package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileApi_Module_ProvideExtendedProfileApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/P;", "Ldagger/internal/h;", "Lcom/avito/android/remote/N;", "a", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class P implements dagger.internal.h<N> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253045b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253046a;

    /* compiled from: ExtendedProfileApi_Module_ProvideExtendedProfileApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/P$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P(@Y61.k dagger.internal.f fVar) {
        this.f253046a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253046a.get();
        f253045b.getClass();
        O.f253043a.getClass();
        N n12 = (N) r02.create(N.class);
        dagger.internal.t.b(n12, "Cannot return null from a non-@Nullable @Provides method");
        return n12;
    }
}
