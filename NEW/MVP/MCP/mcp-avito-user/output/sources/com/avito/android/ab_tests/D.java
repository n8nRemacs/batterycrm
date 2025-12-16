package com.avito.android.ab_tests;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExposureEventVisualizerImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/D;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/C;", "a", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class D implements dagger.internal.h<C> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67702d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f67703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f67704b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f67705c;

    /* compiled from: ExposureEventVisualizerImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/D$a;", "", "<init>", "()V", "_avito_ab-tests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public D(@Y61.k C30102l3 c30102l3, @Y61.k com.avito.android.S s5, @Y61.k Provider provider) {
        this.f67703a = c30102l3;
        this.f67704b = s5;
        this.f67705c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f67703a.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f67704b.get();
        com.avito.android.util.C c12 = this.f67705c.get();
        f67702d.getClass();
        return new C(context, p12, c12);
    }
}
