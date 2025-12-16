package com.avito.android;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertDetailsFeaturesModule_ProvideAdvertDetailsFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/f;", "Ldagger/internal/h;", "Lcom/avito/android/d;", "a", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C30563f implements dagger.internal.h<C29640d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f155063b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C34161r> f155064a;

    /* compiled from: AdvertDetailsFeaturesModule_ProvideAdvertDetailsFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/f$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.f$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30563f(@Y61.k Provider<C34161r> provider) {
        this.f155064a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f155064a.get();
        f155063b.getClass();
        C30275e.f144943a.getClass();
        return (C29640d) c34161r.f246393a.b(C29640d.class);
    }
}
