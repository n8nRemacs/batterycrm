package com.avito.android.str_calendar.seller.calendar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.lib.design.floating_container.FloatingContainer;
import com.avito.android.progress_overlay.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrSellerCalendarViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calendar/i;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f287596a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f287597b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f287598c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f287599d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FloatingContainer f287600e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f287601f;

    public i(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f287596a = (RecyclerView) viewFindViewById;
        this.f287597b = new l((ViewGroup) view.findViewById(R.id.content_holder), 0, interfaceC28373a, 0, 0, 26, null);
        this.f287598c = view.findViewById(R.id.clear_button);
        this.f287599d = view.findViewById(R.id.close_button);
        this.f287600e = (FloatingContainer) view.findViewById(R.id.edit_button);
        this.f287601f = (TextView) view.findViewById(R.id.title_text_view);
    }
}
