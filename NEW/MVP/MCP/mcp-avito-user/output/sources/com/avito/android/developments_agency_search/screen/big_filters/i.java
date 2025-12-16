package com.avito.android.developments_agency_search.screen.big_filters;

import Ap0.InterfaceC13067b;
import android.graphics.Rect;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import j.U;
import kotlin.Metadata;

/* compiled from: BigFiltersOffsetProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/big_filters/i;", "LAp0/b;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements InterfaceC13067b {

    /* renamed from: a, reason: collision with root package name */
    public final int f136666a;

    public i(@U int i12) {
        this.f136666a = i12;
    }

    @Override // Ap0.InterfaceC13067b
    public final void a(@Y61.k Rect rect, @Y61.k com.avito.conveyor_item.a aVar, @Y61.l com.avito.conveyor_item.a aVar2, @Y61.k RecyclerView.C c12) {
        if (aVar2 == null || !(aVar2 instanceof com.avito.android.search.filter.converter.common.b)) {
            rect.set(0, 0, 0, this.f136666a);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
