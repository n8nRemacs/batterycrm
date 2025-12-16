package com.avito.android.ab_tests;

import com.avito.android.C30566f2;
import com.avito.android.C30743h2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SbcAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/V;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/U;", "a", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V implements dagger.internal.h<U> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67741d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30743h2 f67742a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67743b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67744c;

    /* compiled from: SbcAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/V$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public V(@Y61.k C30743h2 c30743h2, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f67742a = c30743h2;
        this.f67743b = e0Var;
        this.f67744c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30566f2 c30566f2 = (C30566f2) this.f67742a.get();
        c0 c0Var = (c0) this.f67743b.get();
        InterfaceC27642e interfaceC27642e = this.f67744c.get();
        f67741d.getClass();
        return new U(c30566f2, c0Var, interfaceC27642e);
    }
}
