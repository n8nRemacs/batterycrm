package com.avito.android.ab_tests;

import com.avito.android.Q1;
import com.avito.android.S1;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PublishAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/P;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/O;", "a", "_avito-discouraged_avito-feature_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P implements dagger.internal.h<O> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67730d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e0 f67731a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67732b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final S1 f67733c;

    /* compiled from: PublishAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/P$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P(@Y61.k e0 e0Var, @Y61.k Provider provider, @Y61.k S1 s12) {
        this.f67731a = e0Var;
        this.f67732b = provider;
        this.f67733c = s12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c0 c0Var = (c0) this.f67731a.get();
        InterfaceC27642e interfaceC27642e = this.f67732b.get();
        Q1 q12 = (Q1) this.f67733c.get();
        f67730d.getClass();
        return new O(c0Var, interfaceC27642e, q12);
    }
}
