package com.avito.android.service_booking_additional_settings.additionalsettings;

import Os0.InterfaceC14732a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.V0;
import com.avito.android.R;
import com.google.android.material.appbar.MaterialToolbar;
import i31.InterfaceC41220a;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingAdditionalSettingsStateRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/f;", "", "a", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f274949a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC14732a, G0> f274950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f274951c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f274952d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.c f274953e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.c f274954f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.c f274955g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final s f274956h;

    /* compiled from: ServiceBookingAdditionalSettingsStateRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/f$a;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        f a(@Y61.k View view, @Y61.k Y41.l<? super InterfaceC14732a, G0> lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i31.c
    public f(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k Y41.l<? super InterfaceC14732a, G0> lVar, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_toggle.c cVar2, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_timegap.c cVar3, @Y61.k com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.booking_tech_break.c cVar4) {
        this.f274949a = view;
        this.f274950b = lVar;
        this.f274951c = cVar;
        this.f274952d = jVar;
        this.f274953e = cVar2;
        this.f274954f = cVar3;
        this.f274955g = cVar4;
        s sVar = new s(view);
        this.f274956h = sVar;
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        if (interfaceC22983PA != null) {
            p.a(cVar2.getF275099c(), interfaceC22983PA, h.f274959l, new i(this));
            p.a(cVar3.getF275087c(), interfaceC22983PA, j.f274961l, new k(this));
            p.a(cVar4.getF275071c(), interfaceC22983PA, l.f274963l, new m(this));
        }
        Context context = view.getContext();
        RecyclerView recyclerView = (RecyclerView) sVar.f275115e.getValue();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(jVar);
        recyclerView.l(new com.avito.android.ui.h(0, 0, 0, context.getResources().getDimensionPixelSize(R.dimen.items_bottom_margin), 7, null), -1);
        InterfaceC42726C interfaceC42726C = sVar.f275111a;
        ((MaterialToolbar) interfaceC42726C.getValue()).m(R.menu.sb_help_menu);
        ((MaterialToolbar) interfaceC42726C.getValue()).setNavigationOnClickListener(new e(lVar, 2));
        sVar.f275116f.a(new e(this, 1));
    }
}
