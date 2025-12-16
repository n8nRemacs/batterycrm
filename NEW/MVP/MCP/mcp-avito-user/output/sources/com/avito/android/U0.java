package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: MapFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/U0;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_map"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U0 extends A0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67574c = {kotlin.jvm.internal.m0.f406844a.i(new kotlin.jvm.internal.h0(U0.class, "yandexMapsEnabled", "getYandexMapsEnabled()Lcom/avito/android/toggle/Feature;", 0))};

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67575b = A0.u(this, "Яндекс карты в приложении Авито", "yandexMaps", Boolean.TRUE, false, 0, Owners.f210485f0, 56);

    @Y61.k
    public final DE0.a<Boolean> v() {
        kotlin.reflect.n<Object> nVar = f67574c[0];
        return this.f67575b.a();
    }
}
