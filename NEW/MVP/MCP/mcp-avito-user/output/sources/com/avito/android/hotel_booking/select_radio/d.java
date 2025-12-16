package com.avito.android.hotel_booking.select_radio;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35976x4;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectRadioViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hotel_booking/select_radio/d;", "", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final RecyclerView f163998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f163999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayoutManager f164000c;

    public d(@k View view) {
        View viewFindViewById = view.findViewById(R.id.items);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f163998a = recyclerView;
        View viewFindViewById2 = view.findViewById(R.id.apply);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f163999b = (Button) viewFindViewById2;
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.f164000c = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        C35976x4.a(recyclerView);
        recyclerView.l(new b(), -1);
    }
}
