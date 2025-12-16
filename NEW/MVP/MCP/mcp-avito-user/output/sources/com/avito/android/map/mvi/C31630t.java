package com.avito.android.map.mvi;

import com.avito.android.map.MapArguments;
import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.remote.model.SearchParams;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MapBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/t;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/map/mvi/entity/MapInternalAction;", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.map.mvi.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31630t implements com.avito.android.arch.mvi.b<MapInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31635y f185305a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f185306b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MapArguments f185307c;

    @Inject
    public C31630t(@Y61.k InterfaceC31635y interfaceC31635y, @Y61.k T t12, @Y61.k MapArguments mapArguments) {
        this.f185305a = interfaceC31635y;
        this.f185306b = t12;
        this.f185307c = mapArguments;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<MapInternalAction> a() {
        MapArguments mapArguments = this.f185307c;
        SearchParams searchParams = mapArguments.f184810b;
        if (searchParams == null) {
            return C43175k.w();
        }
        InterfaceC43160i<MapInternalAction> interfaceC43160iA = this.f185306b.a(true);
        SearchParams searchParams2 = mapArguments.f184810b;
        return C43175k.N(interfaceC43160iA, this.f185305a.b(mapArguments.f184812d, searchParams2.getDrawId(), mapArguments.f184814f, mapArguments.f184818j, searchParams, mapArguments.f184816h, false, false, (768 & 256) != 0 ? false : false, (768 & 512) != 0 ? false : false), this.f185305a.a(searchParams2, mapArguments.f184818j));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
