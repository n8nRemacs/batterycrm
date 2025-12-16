package com.avito.android.calendar_select.presentation.view.konveyor.items.empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.calendar_select.presentation.view.konveyor.items.day.Position;
import kotlin.Metadata;

/* compiled from: EmptyItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/f;", "Lcom/avito/android/calendar_select/presentation/view/konveyor/items/empty/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f113532b;

    /* renamed from: c, reason: collision with root package name */
    public final View f113533c;

    public f(@k View view) {
        super(view);
        this.f113532b = view;
        this.f113533c = view.findViewById(R.id.background_view);
    }

    @Override // com.avito.android.calendar_select.presentation.view.konveyor.items.empty.e
    public final void GC() {
        this.f113532b.setTag(Position.f113506c);
        this.f113533c.setBackground(null);
    }
}
