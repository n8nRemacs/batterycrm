package com.avito.android.edit_address.adapter.add_schedule;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AddScheduleItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/edit_address/adapter/add_schedule/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/edit_address/adapter/add_schedule/h;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f145775c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f145776b;

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.edit_address_location_add_more_link);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f145776b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.edit_address.adapter.add_schedule.h
    public final void c(@k Y41.a<G0> aVar) {
        this.f145776b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(6, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f145776b.setOnClickListener(null);
    }
}
