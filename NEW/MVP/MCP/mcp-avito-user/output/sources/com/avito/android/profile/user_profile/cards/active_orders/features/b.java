package com.avito.android.profile.user_profile.cards.active_orders.features;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ActiveOrdersFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/features/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f224657d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f224658b = A0.u(this, "Обновление блока активных заказов на профиле с использованием клиентской шины данных", "profileActiveOrdersUseClientEventBus", Boolean.FALSE, false, 0, Owners.f210421K0, 56);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f224659c = A0.u(this, "Выполнять принудительное обновление списка активных заказов по таймауту в профиле", "profileActiveOrdersClientEventBusForceUpdate", Boolean.TRUE, false, 0, Owners.f210418J0, 56);

    static {
        h0 h0Var = new h0(b.class, "profileActiveOrdersUseClientEventBus", "getProfileActiveOrdersUseClientEventBus()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f224657d = new n[]{n0Var.i(h0Var), C0.k(b.class, "profileActiveOrdersClientEventBusForceUpdate", "getProfileActiveOrdersClientEventBusForceUpdate()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }
}
