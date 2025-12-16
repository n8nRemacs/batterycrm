package com.avito.android.das_date_picker.items.empty;

import Y61.k;
import kotlin.Metadata;

/* compiled from: DasCalendarEmptyItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/items/empty/a;", "Lcom/avito/conveyor_item/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f132332b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f132333c;

    public a(@k String str, boolean z12) {
        this.f132332b = str;
        this.f132333c = z12;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF132332b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132332b() {
        return this.f132332b;
    }
}
