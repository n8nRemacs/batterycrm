package com.avito.android.universal_map.map;

import Zi.InterfaceC19564a;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.map.di.InterfaceC35295a;
import com.avito.android.universal_map.map.di.InterfaceC35299e;
import com.avito.android.universal_map.map.di.InterfaceC35306l;
import com.avito.android.universal_map.map.di.InterfaceC35309o;
import com.avito.android.util.InterfaceC35745a5;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import oG0.InterfaceC44637a;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/U;", "Landroidx/lifecycle/P0$c;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class U implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J f304819a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f304820b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f304821c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<BeduinAction> f304822d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f304823e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final InterfaceC19564a f304824f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f304825g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.g f304826h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.i f304827i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.c f304828j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.m f304829k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.a f304830l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.e f304831m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.map_core.beduin.action_handler.k f304832n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44637a f304833o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f304834p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.universal_map.map.tracker.c f304835q;

    @Inject
    public U(@Y61.l InterfaceC19564a interfaceC19564a, @Y61.k com.avito.android.map_core.beduin.action_handler.a aVar, @Y61.k com.avito.android.map_core.beduin.action_handler.c cVar, @Y61.k com.avito.android.map_core.beduin.action_handler.e eVar, @Y61.k com.avito.android.map_core.beduin.action_handler.g gVar, @Y61.k com.avito.android.map_core.beduin.action_handler.i iVar, @Y61.k com.avito.android.map_core.beduin.action_handler.k kVar, @Y61.k com.avito.android.map_core.beduin.action_handler.m mVar, @Y61.k J j12, @Y61.k com.avito.android.universal_map.map.tracker.c cVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC40691b interfaceC40691b, @InterfaceC35309o @Y61.k String str, @Y61.l @InterfaceC35295a String str2, @Y61.l @InterfaceC35306l List list, @InterfaceC35299e @Y61.k Map map, @Y61.k InterfaceC44637a interfaceC44637a) {
        this.f304819a = j12;
        this.f304820b = str;
        this.f304821c = map;
        this.f304822d = list;
        this.f304823e = str2;
        this.f304824f = interfaceC19564a;
        this.f304825g = interfaceC40691b;
        this.f304826h = gVar;
        this.f304827i = iVar;
        this.f304828j = cVar;
        this.f304829k = mVar;
        this.f304830l = aVar;
        this.f304831m = eVar;
        this.f304832n = kVar;
        this.f304833o = interfaceC44637a;
        this.f304834p = interfaceC35745a5;
        this.f304835q = cVar2;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(g0.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f304834p;
        com.avito.android.universal_map.map.tracker.c cVar = this.f304835q;
        J j12 = this.f304819a;
        String str = this.f304820b;
        Map<String, Object> map = this.f304821c;
        List<BeduinAction> list = this.f304822d;
        String str2 = this.f304823e;
        InterfaceC19564a interfaceC19564a = this.f304824f;
        InterfaceC40691b interfaceC40691b = this.f304825g;
        com.avito.android.map_core.beduin.action_handler.i iVar = this.f304827i;
        com.avito.android.map_core.beduin.action_handler.g gVar = this.f304826h;
        return new g0(interfaceC19564a, this.f304830l, this.f304828j, this.f304831m, gVar, iVar, this.f304832n, this.f304829k, j12, cVar, interfaceC35745a5, interfaceC40691b, str, str2, list, map, this.f304833o);
    }
}
