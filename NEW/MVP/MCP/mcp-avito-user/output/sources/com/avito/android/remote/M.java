package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EvidenceApi_Module_ProvideEvidenceApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/M;", "Ldagger/internal/h;", "Lcom/avito/android/remote/K;", "a", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class M implements dagger.internal.h<K> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253031b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253032a;

    /* compiled from: EvidenceApi_Module_ProvideEvidenceApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/M$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_evidence-request"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public M(@Y61.k dagger.internal.f fVar) {
        this.f253032a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253032a.get();
        f253031b.getClass();
        L.f253029a.getClass();
        K k12 = (K) r02.create(K.class);
        dagger.internal.t.b(k12, "Cannot return null from a non-@Nullable @Provides method");
        return k12;
    }
}
