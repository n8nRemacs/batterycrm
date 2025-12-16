package com.avito.android.service_booking_settings.work_hours;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22983P;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.service_booking_settings.work_hours.mvi.entity.a;
import com.avito.android.util.C35835l0;
import com.google.android.material.appbar.MaterialToolbar;
import i31.InterfaceC41220a;
import kotlin.Metadata;

/* compiled from: ServiceBookingWorkHoursStateRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/h;", "Lcom/avito/android/service_booking_settings/work_hours/x;", "a", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f277935a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e f277936b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f277937c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a f277938d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.service_booking_settings.work_hours.item.schedule_period.c f277939e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final w f277940f;

    /* compiled from: ServiceBookingWorkHoursStateRenderer.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/h$a;", "", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        h a(@Y61.k View view, @Y61.k e eVar);
    }

    @i31.c
    public h(@InterfaceC41220a @Y61.k View view, @InterfaceC41220a @Y61.k e eVar, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.avito.android.service_booking_settings.work_hours.item.booking_restrictions.a aVar2, @Y61.k com.avito.android.service_booking_settings.work_hours.item.schedule_period.c cVar) {
        this.f277935a = view;
        this.f277936b = eVar;
        this.f277937c = aVar;
        this.f277938d = aVar2;
        this.f277939e = cVar;
        w wVar = new w(view);
        this.f277940f = wVar;
        InterfaceC22983P interfaceC22983PA = V0.a(view);
        if (interfaceC22983PA != null) {
            t.a(aVar2.getF277947d(), interfaceC22983PA, l.f278041l, new m(this));
            t.a(aVar2.getF277948e(), interfaceC22983PA, n.f278129l, new o(this));
            t.a(cVar.getF278032d(), interfaceC22983PA, p.f278131l, new q(this));
        }
        final int i12 = 0;
        wVar.f278147f.a(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_settings.work_hours.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f277934c;

            {
                this.f277934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        this.f277934c.f277936b.accept(a.f.f278102a);
                        break;
                    case 1:
                        this.f277934c.f277936b.accept(a.C8259a.f278094a);
                        break;
                    default:
                        this.f277934c.f277936b.accept(new a.g(false));
                        break;
                }
            }
        });
        view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        RecyclerView recyclerView = wVar.f278145d;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(jVar);
        MaterialToolbar materialToolbar = wVar.f278142a;
        Drawable navigationIcon = materialToolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(C35835l0.d(R.attr.black, materialToolbar.getContext()));
        }
        final int i13 = 1;
        materialToolbar.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_settings.work_hours.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f277934c;

            {
                this.f277934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        this.f277934c.f277936b.accept(a.f.f278102a);
                        break;
                    case 1:
                        this.f277934c.f277936b.accept(a.C8259a.f278094a);
                        break;
                    default:
                        this.f277934c.f277936b.accept(new a.g(false));
                        break;
                }
            }
        });
        final int i14 = 2;
        wVar.f278143b.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.service_booking_settings.work_hours.g

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f277934c;

            {
                this.f277934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.f277934c.f277936b.accept(a.f.f278102a);
                        break;
                    case 1:
                        this.f277934c.f277936b.accept(a.C8259a.f278094a);
                        break;
                    default:
                        this.f277934c.f277936b.accept(new a.g(false));
                        break;
                }
            }
        });
    }
}
