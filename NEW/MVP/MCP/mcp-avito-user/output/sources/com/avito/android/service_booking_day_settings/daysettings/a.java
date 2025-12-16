package com.avito.android.service_booking_day_settings.daysettings;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DaySettingsBreaksViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/a;", "", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f276713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f276714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f276715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f276716d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f276717e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276718f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f276719g;

    public a(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k Y41.a<G0> aVar2) {
        this.f276713a = jVar;
        this.f276714b = aVar;
        this.f276715c = aVar2;
        this.f276716d = (TextView) view.findViewById(R.id.breaks_title);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.breaks_rv);
        this.f276717e = recyclerView;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.add_break_container);
        this.f276718f = viewGroup;
        this.f276719g = (TextView) view.findViewById(R.id.add_break_title);
        recyclerView.setAdapter(jVar);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        viewGroup.setOnClickListener(new com.avito.android.review_gallery.g(this, 25));
    }
}
