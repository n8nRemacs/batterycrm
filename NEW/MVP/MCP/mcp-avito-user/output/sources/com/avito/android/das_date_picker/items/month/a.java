package com.avito.android.das_date_picker.items.month;

import Y61.k;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: DasCalendarMonthItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/items/month/a;", "Lcom/avito/conveyor_item/a;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f132341b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f132342c;

    public a(@k String str, @k PrintableText printableText) {
        this.f132341b = str;
        this.f132342c = printableText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124070b() {
        return getF132341b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132341b() {
        return this.f132341b;
    }
}
