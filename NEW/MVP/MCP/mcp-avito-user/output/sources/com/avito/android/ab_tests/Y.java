package com.avito.android.ab_tests;

import com.avito.android.C36135w2;
import com.avito.android.C36168y2;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SerpAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/Y;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/X;", "a", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Y implements dagger.internal.h<X> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67748d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36168y2 f67749a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67750b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67751c;

    /* compiled from: SerpAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/Y$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_serp"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public Y(@Y61.k C36168y2 c36168y2, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f67749a = c36168y2;
        this.f67750b = e0Var;
        this.f67751c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C36135w2 c36135w2 = (C36135w2) this.f67749a.get();
        c0 c0Var = (c0) this.f67750b.get();
        InterfaceC27642e interfaceC27642e = this.f67751c.get();
        f67748d.getClass();
        return new X(c36135w2, c0Var, interfaceC27642e);
    }
}
