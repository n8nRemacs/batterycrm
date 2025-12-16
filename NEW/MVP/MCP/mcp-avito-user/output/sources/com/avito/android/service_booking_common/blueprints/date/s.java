package com.avito.android.service_booking_common.blueprints.date;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.service_booking_common.di.InterfaceC34925a;
import com.avito.android.service_booking_common.di.InterfaceC34927c;
import com.avito.android.service_booking_common.di.InterfaceC34928d;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35945t1;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import qt0.C47440d;

/* compiled from: SbDateViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/s;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f276370p = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.j f276371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f276372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f276373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<Long> f276374e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f276375f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f276376g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f276377h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f276378i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Spinner f276379j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276380k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f276381l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f276382m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public a f276383n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public N f276384o;

    /* compiled from: SbDateViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/service_booking_common/blueprints/date/s$a", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends RecyclerView.r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N f276386c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super Integer, ? super Integer, G0> pVar) {
            this.f276386c = (N) pVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Y41.p, kotlin.jvm.internal.N] */
        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @Y61.k RecyclerView recyclerView) {
            if (i12 == 0) {
                int i13 = s.f276370p;
                ?? r22 = this.f276386c;
                s.this.getClass();
                s.B80(recyclerView, r22);
            }
        }
    }

    public s(@Y61.k View view, @InterfaceC34927c @Y61.k com.avito.konveyor.adapter.j jVar, @InterfaceC34927c @Y61.k com.avito.konveyor.adapter.a aVar, @InterfaceC34928d @Y61.k com.avito.konveyor.adapter.j jVar2, @InterfaceC34928d @Y61.k com.avito.konveyor.adapter.a aVar2, @Y61.k @InterfaceC34925a InterfaceC35945t1<Long> interfaceC35945t1, @Y61.k com.avito.android.service_booking_common.blueprints.date.date_list.c cVar) throws Resources.NotFoundException {
        super(view);
        this.f276371b = jVar;
        this.f276372c = aVar;
        this.f276373d = aVar2;
        this.f276374e = interfaceC35945t1;
        this.f276375f = (TextView) this.itemView.findViewById(R.id.sb_date_title);
        this.f276376g = (TextView) this.itemView.findViewById(R.id.sb_month_title);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.sb_dates);
        this.f276377h = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) this.itemView.findViewById(R.id.sb_timeslots);
        this.f276378i = recyclerView2;
        this.f276379j = (Spinner) this.itemView.findViewById(R.id.sb_spinner);
        this.f276380k = (ViewGroup) this.itemView.findViewById(R.id.placeholder_container);
        this.f276381l = (ViewGroup) this.itemView.findViewById(R.id.timeslots_empty_view);
        this.f276382m = (Button) this.itemView.findViewById(R.id.placeholder_button);
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(jVar);
        recyclerView.l(cVar, -1);
        new J().b(recyclerView);
        int dimensionPixelSize = recyclerView2.getResources().getDimensionPixelSize(R.dimen.sb_timeslot_item_padding);
        Resources resources = recyclerView2.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.timeslots_horizontal_padding);
        float f12 = displayMetrics.widthPixels;
        float f13 = displayMetrics.density;
        int i12 = (int) ((f12 / f13) / (((dimensionPixelSize2 + dimensionPixelSize) / f13) + 78));
        i12 = i12 > 4 ? 4 : i12;
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new GridLayoutManager(i12));
        recyclerView2.setItemAnimator(null);
        recyclerView2.l(new com.avito.android.service_booking_common.blueprints.date.timeslot_list.c(i12, recyclerView2.getResources().getDimensionPixelSize(R.dimen.sb_timeslot_list_padding), dimensionPixelSize), -1);
        recyclerView2.setAdapter(jVar2);
    }

    public static void B80(RecyclerView recyclerView, Y41.p pVar) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            pVar.invoke(Integer.valueOf(linearLayoutManager.H1()), Integer.valueOf(linearLayoutManager.L1()));
        }
    }

    public final String C80(Calendar calendar) {
        String strA = this.f276374e.a(Long.valueOf(calendar.getTimeInMillis()));
        if (strA.length() <= 0) {
            return strA;
        }
        return Character.toUpperCase(strA.charAt(0)) + strA.substring(1);
    }

    public final String D80(Calendar calendar, RecyclerView recyclerView, LinkedHashMap linkedHashMap) {
        String strC80;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        String strC802 = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return null;
        }
        int iH1 = linearLayoutManager.H1();
        int iL1 = linearLayoutManager.L1();
        if (iH1 == -1 || iL1 == -1) {
            return null;
        }
        com.avito.konveyor.adapter.j jVar = this.f276371b;
        Date date = (Date) linkedHashMap.get(Long.valueOf(jVar.f338513c.getItemId(iH1)));
        if (date != null) {
            calendar.setTime(date);
            strC80 = C80(calendar);
        } else {
            strC80 = null;
        }
        Date date2 = (Date) linkedHashMap.get(Long.valueOf(jVar.f338513c.getItemId(iL1)));
        if (date2 != null) {
            calendar.setTime(date2);
            strC802 = C80(calendar);
        }
        return L.f(strC80, strC802) ? strC802 : androidx.appcompat.app.r.r(strC80, " – ", strC802);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [Y41.l, kotlin.jvm.internal.N] */
    public final void E80(@Y61.l C47440d.a aVar, @Y61.k C47440d.c cVar) {
        ?? r72;
        boolean z12 = cVar instanceof C47440d.c.b;
        ViewGroup viewGroup = this.f276380k;
        Spinner spinner = this.f276379j;
        RecyclerView recyclerView = this.f276378i;
        if (z12) {
            D6.w(recyclerView);
            D6.w(spinner);
            D6.H(viewGroup);
            this.f276382m.setOnClickListener(new com.avito.android.service_booking_calendar.flexible.header.toolbar.g(4, aVar, this));
            return;
        }
        boolean z13 = cVar instanceof C47440d.c.C12339c;
        ViewGroup viewGroup2 = this.f276381l;
        if (z13) {
            List<C47440d.a> list = ((C47440d.c.C12339c) cVar).f429423a;
            boolean zIsEmpty = list.isEmpty();
            com.avito.konveyor.adapter.a aVar2 = this.f276373d;
            if (zIsEmpty) {
                D6.H(viewGroup2);
                D6.w(recyclerView);
                D6.w(spinner);
                D6.w(viewGroup);
                aVar2.c(new UV0.c(C42784z0.f406748b));
                return;
            }
            D6.w(viewGroup2);
            D6.H(recyclerView);
            D6.w(spinner);
            D6.w(viewGroup);
            aVar2.c(new UV0.c(list));
            return;
        }
        if (!cVar.equals(C47440d.c.e.f429425a)) {
            if (cVar.equals(C47440d.c.C12340d.f429424a)) {
                D6.w(viewGroup2);
                D6.w(recyclerView);
                D6.H(spinner);
                D6.w(viewGroup);
                return;
            }
            return;
        }
        D6.w(viewGroup2);
        D6.w(recyclerView);
        D6.H(spinner);
        D6.w(viewGroup);
        if (aVar == null || !aVar.f429418e || (r72 = this.f276384o) == 0) {
            return;
        }
        r72.invoke(aVar);
    }

    public final void F80(@Y61.l Y41.p<? super Integer, ? super Integer, G0> pVar) {
        a aVar = this.f276383n;
        RecyclerView recyclerView = this.f276377h;
        if (aVar != null) {
            recyclerView.v0(aVar);
        }
        this.f276383n = null;
        if (pVar != null) {
            a aVar2 = new a(pVar);
            recyclerView.o(aVar2);
            this.f276383n = aVar2;
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f276383n = null;
        this.f276377h.s();
    }
}
