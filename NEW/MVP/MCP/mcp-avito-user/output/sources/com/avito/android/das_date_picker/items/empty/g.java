package com.avito.android.das_date_picker.items.empty;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.das_date_picker.model.Position;
import kotlin.Metadata;

/* compiled from: DasCalendarEmptyItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/items/empty/g;", "Lcom/avito/android/das_date_picker/items/empty/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f132339b;

    /* renamed from: c, reason: collision with root package name */
    public final View f132340c;

    public g(@k View view) {
        super(view);
        this.f132339b = view;
        this.f132340c = view.findViewById(R.id.background_view);
    }

    @Override // com.avito.android.das_date_picker.items.empty.f
    public final void C6() {
        this.f132339b.setTag(Position.f132355c);
    }

    @Override // com.avito.android.das_date_picker.items.empty.f
    public final void sd() {
        this.f132339b.setTag(Position.f132356d);
        this.f132340c.setBackground(null);
    }
}
