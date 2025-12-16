package com.avito.android.universal_map.map.point_info;

import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35308n;
import com.avito.android.util.InterfaceC35745a5;
import dj.InterfaceC39737b;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oG0.InterfaceC44637a;

/* compiled from: UniversalMapPointInfoViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/point_info/o;", "Landroidx/lifecycle/P0$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f305855a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f305856b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f305857c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f305858d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f305859e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f305860f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39737b f305861g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f305862h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.o f305863i;

    @Inject
    public o(@Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC44637a interfaceC44637a, @Y61.k InterfaceC40691b interfaceC40691b, @InterfaceC35308n @Y61.k String str, @Y61.l @InterfaceC35299e Map<String, ? extends Object> map, @Y61.k InterfaceC39737b interfaceC39737b, @Y61.k com.avito.android.universal_map.map.tracker.c cVar, @Y61.k com.avito.android.map_core.beduin.action_handler.o oVar) {
        this.f305855a = aVar;
        this.f305856b = interfaceC35745a5;
        this.f305857c = interfaceC44637a;
        this.f305858d = interfaceC40691b;
        this.f305859e = str;
        this.f305860f = map;
        this.f305861g = interfaceC39737b;
        this.f305862h = cVar;
        this.f305863i = oVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(s.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new s(this.f305855a, this.f305856b, this.f305857c, this.f305858d, this.f305859e, this.f305860f, this.f305861g, this.f305862h, this.f305863i);
    }
}
