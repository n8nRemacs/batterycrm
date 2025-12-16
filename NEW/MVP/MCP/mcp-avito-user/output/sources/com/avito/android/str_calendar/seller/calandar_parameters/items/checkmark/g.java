package com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.str_calendar.booking_calendar.items.day.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckmarkItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/checkmark/g;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/items/checkmark/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f287056c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ListItemCheckmark f287057b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.checkmark_list_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemCheckmark");
        }
        this.f287057b = (ListItemCheckmark) viewFindViewById;
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f287057b.setOnClickListener(new h(3, aVar));
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark.f
    public final void setSelected(boolean z12) {
        this.f287057b.setChecked(z12);
    }

    @Override // com.avito.android.str_calendar.seller.calandar_parameters.items.checkmark.f
    public final void setTitle(@k CharSequence charSequence) {
        this.f287057b.setTitle(charSequence);
    }
}
