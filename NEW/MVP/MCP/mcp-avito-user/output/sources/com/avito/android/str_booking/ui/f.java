package com.avito.android.str_booking.ui;

import android.view.View;
import androidx.recyclerview.widget.C23434z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.str_booking.domain.items_converter.InterfaceC35075o;
import com.avito.android.str_booking.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;

/* compiled from: StrBookingView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_booking/ui/f;", "Lcom/avito/android/str_booking/ui/d;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f286014a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.ui.delegates.c f286015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f286016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f286017d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.ui.banner.d f286018e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final n f286019f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35075o f286020g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_booking.domain.polling.b f286021h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public N0 f286022i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final b f286023j;

    /* compiled from: StrBookingView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            f.this.f286019f.accept(a.b.f285780a);
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/str_booking/ui/f$b", "Landroidx/recyclerview/widget/z;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C23434z {
        @Override // androidx.recyclerview.widget.C23434z
        public final int n() {
            return -1;
        }
    }

    public f(@Y61.k View view, @Y61.k com.avito.android.str_booking.ui.delegates.c cVar, @Y61.k com.avito.konveyor.adapter.d dVar, @Y61.k com.avito.konveyor.adapter.d dVar2, @Y61.k com.avito.android.str_booking.ui.banner.d dVar3, @Y61.k n nVar, @Y61.k InterfaceC35075o interfaceC35075o, @Y61.k com.avito.android.str_booking.domain.polling.b bVar) {
        this.f286014a = view;
        this.f286015b = cVar;
        this.f286016c = dVar;
        this.f286017d = dVar2;
        this.f286018e = dVar3;
        this.f286019f = nVar;
        this.f286020g = interfaceC35075o;
        this.f286021h = bVar;
        M81.c cVar2 = new M81.c(view, null, false, 4, null);
        cVar2.g5(R.drawable.ic_back_24_black, null);
        cVar2.f5(new a());
        View viewFindViewById = view.findViewById(R.id.str_booking_sections_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById).setAdapter(dVar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_header);
        if (recyclerView != null) {
            recyclerView.setAdapter(dVar2);
        }
        View viewFindViewById2 = view.findViewById(R.id.str_booking_reload_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        ((Button) viewFindViewById2).setOnClickListener(new com.avito.android.services_transportation_widget.dialog.h(this, 8));
        View viewFindViewById3 = view.findViewById(R.id.swipe_refresh_layout);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
        }
        ((SwipeRefreshLayout) viewFindViewById3).setOnRefreshListener(new com.avito.android.offlinization.ui.a(this, 27));
        this.f286023j = new b(view.getContext());
    }
}
