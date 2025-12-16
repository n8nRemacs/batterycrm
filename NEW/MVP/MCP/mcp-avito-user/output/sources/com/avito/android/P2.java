package com.avito.android;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertFeaturesModule_ProvideUserAdvertFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/P2;", "Ldagger/internal/h;", "Lcom/avito/android/N2;", "a", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class P2 implements dagger.internal.h<N2> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f67444b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C34161r> f67445a;

    /* compiled from: UserAdvertFeaturesModule_ProvideUserAdvertFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/P2$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public P2(@Y61.k Provider<C34161r> provider) {
        this.f67445a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f67445a.get();
        f67444b.getClass();
        O2.f67369a.getClass();
        return (N2) c34161r.f246393a.b(N2.class);
    }
}
