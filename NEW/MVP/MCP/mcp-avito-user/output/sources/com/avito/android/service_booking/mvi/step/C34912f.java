package com.avito.android.service_booking.mvi.step;

import Hs0.InterfaceC14030a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import i31.InterfaceC41220a;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingMviStepRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/f;", "", "a", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.service_booking.mvi.step.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34912f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f274639a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final cU.s f274640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f274641c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Is0.b f274642d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Map<String, Map<String, Set<Object>>> f274643e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final O f274644f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public Set<TV0.d<?, ?>> f274645g;

    /* compiled from: ServiceBookingMviStepRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/f$a;", "", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking.mvi.step.f$a */
    public interface a {
        @Y61.k
        C34912f a(@Y61.k View view, @Y61.k Y41.l<? super InterfaceC14030a, G0> lVar, @Y61.k String str, @Y61.k cU.s sVar);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.C] */
    @i31.c
    public C34912f(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k Y41.l lVar, @InterfaceC41220a @Y61.k cU.s sVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k C34907a c34907a, @Y61.k Is0.b bVar, @Y61.k Map map) {
        MenuItem menuItemFindItem;
        this.f274639a = view;
        this.f274640b = sVar;
        this.f274641c = aVar;
        this.f274642d = bVar;
        this.f274643e = map;
        O o12 = new O(view, sVar);
        this.f274644f = o12;
        o12.a().m(R.menu.service_booking_menu);
        o12.a().setNavigationOnClickListener(new com.avito.android.seller_promotions.b(3, lVar));
        Menu menu = o12.a().getMenu();
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.sb_close_action)) != null) {
            com.avito.android.ui.d.a(menuItemFindItem, new com.avito.android.developments_agency_search.screen.deal_room.b(1, lVar));
        }
        ?? r12 = o12.f274451d;
        ((RecyclerView) r12.getValue()).setAdapter(jVar);
        ((RecyclerView) r12.getValue()).l(c34907a, -1);
        o12.f274454g.a(new com.avito.android.seller_promotions.b(2, lVar));
        ((Button) o12.f274453f.f274290d.getValue()).setOnClickListener(new com.avito.android.serp.adapter.serp_advert_card.i(21, new C34911e(lVar)));
    }
}
