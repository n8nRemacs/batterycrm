package com.avito.android.hotel_available_rooms;

import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.util.C35976x4;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelAvailableRoomsViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_available_rooms/i;", "", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MaterialToolbar f162824a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f162825b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NestedScrollView f162826c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f162827d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f162828e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f162829f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f162830g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f162831h;

    public i(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.MaterialToolbar");
        }
        this.f162824a = (MaterialToolbar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.shimmer);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        this.f162825b = (ShimmerLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.error);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        }
        this.f162826c = (NestedScrollView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162827d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.description);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f162828e = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.retry);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f162829f = (Button) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.filters);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById7;
        this.f162830g = recyclerView;
        View viewFindViewById8 = view.findViewById(R.id.rooms);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView2 = (RecyclerView) viewFindViewById8;
        this.f162831h = recyclerView2;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setItemAnimator(null);
        C35976x4.a(recyclerView);
        recyclerView.l(com.avito.android.hotel_available_rooms.konveyor.a.f162833b, -1);
    }
}
