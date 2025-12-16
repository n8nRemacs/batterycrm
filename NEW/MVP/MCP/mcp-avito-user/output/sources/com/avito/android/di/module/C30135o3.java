package com.avito.android.di.module;

import android.util.DisplayMetrics;
import android.view.Display;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreModule_ProvideDeviceMetricsFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/o3;", "Ldagger/internal/h;", "Lcom/avito/android/util/L0;", "a", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.o3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30135o3 implements dagger.internal.h<com.avito.android.util.L0> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f144487d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f144488a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30157q3 f144489b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C30167r3 f144490c;

    /* compiled from: CoreModule_ProvideDeviceMetricsFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/o3$a;", "", "<init>", "()V", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.o3$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30135o3(@Y61.k C30080j3 c30080j3, @Y61.k Provider provider, @Y61.k C30157q3 c30157q3, @Y61.k C30167r3 c30167r3) {
        this.f144488a = provider;
        this.f144489b = c30157q3;
        this.f144490c = c30167r3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.util.C c12 = this.f144488a.get();
        Display display = (Display) this.f144489b.get();
        DisplayMetrics displayMetrics = (DisplayMetrics) this.f144490c.get();
        f144487d.getClass();
        return new com.avito.android.util.M0(c12, display, displayMetrics);
    }
}
