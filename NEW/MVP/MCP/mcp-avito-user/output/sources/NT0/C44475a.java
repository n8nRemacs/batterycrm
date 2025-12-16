package nt0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: CalendarViewDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnt0/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44475a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f419219b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419220c;

    /* renamed from: d, reason: collision with root package name */
    public final int f419221d;

    /* renamed from: e, reason: collision with root package name */
    public final int f419222e;

    /* renamed from: f, reason: collision with root package name */
    public final int f419223f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419224g;

    public C44475a(@k com.avito.konveyor.a aVar, int i12, int i13, int i14, int i15) {
        this.f419219b = i12;
        this.f419220c = i13;
        this.f419221d = i14;
        this.f419222e = i15;
        this.f419223f = aVar.Y(com.avito.android.service_booking_calendar.view.month.a.class);
        this.f419224g = aVar.Y(com.avito.android.service_booking_calendar.view.day.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int iU2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null || (iU2 = RecyclerView.U(view)) == -1) {
            return;
        }
        int itemViewType = adapter.getItemViewType(iU2);
        if (itemViewType == this.f419223f) {
            if (iU2 == 0) {
                rect.top = this.f419219b;
            } else {
                rect.top = this.f419220c;
            }
            rect.bottom = this.f419221d;
            return;
        }
        if (itemViewType != this.f419224g || iU2 < adapter.getItemCount() - 7) {
            return;
        }
        rect.bottom = this.f419222e;
    }
}
