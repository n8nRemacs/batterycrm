package com.avito.android.ab_tests;

import com.avito.android.C29640d;
import com.avito.android.C30563f;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/u;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/t;", "a", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.ab_tests.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27657u implements dagger.internal.h<C27656t> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f68016d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30563f f68017a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f68018b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f68019c;

    /* compiled from: AdvertDetailsAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/u$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ab_tests.u$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C27657u(@Y61.k C30563f c30563f, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f68017a = c30563f;
        this.f68018b = e0Var;
        this.f68019c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C29640d c29640d = (C29640d) this.f68017a.get();
        c0 c0Var = (c0) this.f68018b.get();
        InterfaceC27642e interfaceC27642e = this.f68019c.get();
        f68016d.getClass();
        return new C27656t(c29640d, c0Var, interfaceC27642e);
    }
}
