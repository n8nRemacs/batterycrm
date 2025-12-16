package com.avito.android.service_order_map.serviceordermap.domain;

import Y61.k;
import android.app.Activity;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.location.find.o;
import com.avito.android.permissions.x;
import java.lang.ref.WeakReference;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import tu0.InterfaceC48719a;

/* compiled from: FindMeUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_order_map/serviceordermap/domain/f;", "", "_avito_service-order-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f278658a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final x f278659b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final WeakReference<Activity> f278660c;

    @Inject
    public f(@k o oVar, @k x xVar, @InterfaceC48719a @k WeakReference<Activity> weakReference) {
        this.f278658a = oVar;
        this.f278659b = xVar;
        this.f278660c = weakReference;
    }
}
