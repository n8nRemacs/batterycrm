package com.avito.android.remote;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortTermRentApi_Module_ProvideShortTermRentApiFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/f1;", "Ldagger/internal/h;", "Lcom/avito/android/remote/d1;", "a", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class f1 implements dagger.internal.h<d1> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f253443b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.f f253444a;

    /* compiled from: ShortTermRentApi_Module_ProvideShortTermRentApiFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/f1$a;", "", "<init>", "()V", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f1(@Y61.k dagger.internal.f fVar) {
        this.f253444a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = (R0) this.f253444a.get();
        f253443b.getClass();
        e1.f253384a.getClass();
        d1 d1Var = (d1) r02.create(d1.class);
        dagger.internal.t.b(d1Var, "Cannot return null from a non-@Nullable @Provides method");
        return d1Var;
    }
}
