package com.avito.android.di.module;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lW0.C43696c;

/* compiled from: ApiInterceptorsModule_ProvideChuckerInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/s0;", "Ldagger/internal/h;", "LlW0/c;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.s0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30175s0 implements dagger.internal.h<C43696c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f144567b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C30102l3 f144568a;

    /* compiled from: ApiInterceptorsModule_ProvideChuckerInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/s0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.s0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30175s0(@Y61.k C30143p0 c30143p0, @Y61.k C30102l3 c30102l3) {
        this.f144568a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.f144568a.get();
        f144567b.getClass();
        return new C43696c(context, null, null, null, null, 30, null);
    }
}
