package com.avito.android.map_core.view.pin_items;

import Y61.l;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: AdvertsSheetClipper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map_core/view/pin_items/c;", "Lcom/avito/android/map_core/view/pin_items/b;", "<init>", "()V", "_avito-discouraged_avito-libs_search-map-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f185813a = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public RecyclerView f185814b;

    public final void a(@l FrameLayout frameLayout, @Y61.k RecyclerView recyclerView) {
        a aVar = this.f185813a;
        aVar.f185810a = frameLayout;
        this.f185814b = recyclerView;
        recyclerView.setClipToOutline(true);
        recyclerView.setOutlineProvider(aVar);
    }
}
