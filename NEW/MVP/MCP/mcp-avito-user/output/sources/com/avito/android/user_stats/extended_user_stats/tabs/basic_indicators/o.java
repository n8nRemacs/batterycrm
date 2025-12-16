package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BasicIndicatorsTabViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/o;", "Landroidx/lifecycle/P0$c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_stats.b f317510a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f317511b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f317512c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35863o4 f317513d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f317514e;

    @Inject
    public o(@Y61.k com.avito.android.user_stats.b bVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35863o4 interfaceC35863o4, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f317510a = bVar;
        this.f317511b = interfaceC35745a5;
        this.f317512c = fVar;
        this.f317513d = interfaceC35863o4;
        this.f317514e = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(i.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new i(this.f317510a, this.f317511b, this.f317512c, this.f317513d, this.f317514e);
    }
}
