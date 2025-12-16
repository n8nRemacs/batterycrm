package com.avito.android.ab_tests;

import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessengerAbTestsProviderImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/J;", "Ldagger/internal/h;", "Lcom/avito/android/ab_tests/I;", "a", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class J implements dagger.internal.h<I> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f67716d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30713g1 f67717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f67718b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC27642e> f67719c;

    /* compiled from: MessengerAbTestsProviderImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ab_tests/J$a;", "", "<init>", "()V", "_avito-discouraged_avito-feature_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public J(@Y61.k C30713g1 c30713g1, @Y61.k e0 e0Var, @Y61.k Provider provider) {
        this.f67717a = c30713g1;
        this.f67718b = e0Var;
        this.f67719c = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f67717a.get();
        c0 c0Var = (c0) this.f67718b.get();
        InterfaceC27642e interfaceC27642e = this.f67719c.get();
        f67716d.getClass();
        return new I(c30277e1, c0Var, interfaceC27642e);
    }
}
