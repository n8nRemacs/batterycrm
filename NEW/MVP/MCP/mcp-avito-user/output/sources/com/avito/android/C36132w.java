package com.avito.android;

import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinFeaturesModule_ProvideBeduinFeaturesFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/w;", "Ldagger/internal/h;", "Lcom/avito/android/t;", "a", "_avito-discouraged_avito-feature_beduin"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.w, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C36132w implements dagger.internal.h<AbstractC35201t> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f327454b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<C34161r> f327455a;

    /* compiled from: BeduinFeaturesModule_ProvideBeduinFeaturesFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/w$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_beduin"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.w$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C36132w(@Y61.k Provider<C34161r> provider) {
        this.f327455a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C34161r c34161r = this.f327455a.get();
        f327454b.getClass();
        C35992v.f319192a.getClass();
        return (AbstractC35201t) c34161r.f246393a.b(C35287u.class);
    }
}
