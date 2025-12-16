package com.avito.android.map.mvi;

import com.avito.android.map.mvi.entity.MapInternalAction;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/y;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.map.mvi.y, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC31635y {

    /* compiled from: MapInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.mvi.y$a */
    public static final class a {
    }

    @Y61.k
    InterfaceC43160i<MapInternalAction> a(@Y61.k SearchParams searchParams, @Y61.k PresentationType presentationType);

    @Y61.k
    InterfaceC43160i<MapInternalAction> b(@Y61.l Area area, @Y61.l String str, @Y61.k DrawingState drawingState, @Y61.k PresentationType presentationType, @Y61.k SearchParams searchParams, @Y61.l Float f12, boolean z12, boolean z13, boolean z14, boolean z15);

    @Y61.k
    InterfaceC43160i c(@Y61.l List list);

    @Y61.k
    InterfaceC43160i d(@Y61.l a.C5436a.C5437a c5437a, boolean z12, @Y61.k SearchParams searchParams, int i12);

    @Y61.k
    InterfaceC43160i e(@Y61.l a.C5436a.C5437a c5437a, boolean z12, @Y61.k SearchParams searchParams, int i12, @Y61.k PresentationType presentationType);
}
