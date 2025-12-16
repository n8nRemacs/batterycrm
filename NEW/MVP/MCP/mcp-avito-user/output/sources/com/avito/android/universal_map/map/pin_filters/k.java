package com.avito.android.universal_map.map.pin_filters;

import Vi.C15684a;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35300f;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oG0.InterfaceC44637a;

/* compiled from: UniversalMapPinFiltersViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/k;", "Landroidx/lifecycle/P0$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f305750a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C15684a f305751b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305752c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f305753d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39737b f305754e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f305755f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f305756g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305757h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305758i;

    @Inject
    public k(@Y61.k a aVar, @Y61.k C15684a c15684a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44637a interfaceC44637a, @Y61.k InterfaceC39737b interfaceC39737b, @InterfaceC35300f @Y61.l String str, @Y61.l @InterfaceC35299e Map<String, ? extends Object> map, @Y61.k InterfaceC40691b interfaceC40691b, @Y61.k com.avito.android.universal_map.map.tracker.c cVar) {
        this.f305750a = aVar;
        this.f305751b = c15684a;
        this.f305752c = interfaceC35745a5;
        this.f305753d = interfaceC44637a;
        this.f305754e = interfaceC39737b;
        this.f305755f = str;
        this.f305756g = map;
        this.f305757h = interfaceC40691b;
        this.f305758i = cVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(o.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new o(this.f305750a, this.f305751b, this.f305752c, this.f305753d, this.f305754e, this.f305755f, this.f305756g, this.f305757h, this.f305758i);
    }
}
