package com.avito.android.das_date_picker;

import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.Metadata;

/* compiled from: DasCalendarViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/f;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f132303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.a f132304f;

    public f(com.avito.konveyor.adapter.a aVar, com.avito.konveyor.a aVar2) {
        this.f132303e = aVar;
        this.f132304f = aVar2;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int iB2 = this.f132303e.b(i12);
        com.avito.konveyor.a aVar = this.f132304f;
        if (iB2 == aVar.Y(com.avito.android.das_date_picker.items.month.b.class)) {
            return 7;
        }
        if (iB2 == aVar.Y(com.avito.android.das_date_picker.items.day.b.class) || iB2 == aVar.Y(com.avito.android.das_date_picker.items.empty.b.class)) {
            return 1;
        }
        throw new UnsupportedOperationException("Unknown view type");
    }
}
