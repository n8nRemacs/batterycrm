package com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.inline_filters.dialog.calendar.models.FiltersCalendarPickerItemState;
import com.avito.android.str_calendar.common.models.Position;
import com.avito.android.util.D6;
import kotlin.Metadata;

/* compiled from: FiltersCalendarEmptyItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/empty/g;", "Lcom/avito/android/inline_filters/dialog/calendar/konveyor/items/empty/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f171243b;

    /* renamed from: c, reason: collision with root package name */
    public final View f171244c;

    /* compiled from: FiltersCalendarEmptyItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f171245a;

        static {
            int[] iArr = new int[FiltersCalendarPickerItemState.values().length];
            try {
                FiltersCalendarPickerItemState filtersCalendarPickerItemState = FiltersCalendarPickerItemState.f171257b;
                iArr[5] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f171245a = iArr;
        }
    }

    public g(@k View view) {
        super(view);
        this.f171243b = view;
        this.f171244c = view.findViewById(R.id.background_view);
    }

    @Override // com.avito.android.inline_filters.dialog.calendar.konveyor.items.empty.f
    public final void iP(@k FiltersCalendarPickerItemState filtersCalendarPickerItemState) {
        int i12 = a.f171245a[filtersCalendarPickerItemState.ordinal()];
        View view = this.f171244c;
        View view2 = this.f171243b;
        if (i12 == 1) {
            view2.setTag(Position.f286641e);
            D6.D(view, R.drawable.str_calendar_day_selected_middle);
        } else {
            view2.setTag(Position.f286642f);
            view.setBackground(null);
        }
    }
}
