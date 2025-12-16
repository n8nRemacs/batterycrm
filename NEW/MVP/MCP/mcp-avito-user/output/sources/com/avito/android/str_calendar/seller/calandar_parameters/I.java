package com.avito.android.str_calendar.seller.calandar_parameters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarParametersViewHolder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/I;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f286678a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f286679b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f286680c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f286681d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f286682e;

    public I(@Y61.k View view, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f286678a = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.content_holder), 0, interfaceC28373a, 0, 0, 26, null);
        View viewFindViewById = view.findViewById(R.id.recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f286679b = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.apply_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f286680c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.close_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f286681d = viewFindViewById3;
        this.f286682e = (TextView) view.findViewById(R.id.title_text_view);
    }
}
