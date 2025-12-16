package com.avito.android.phone_reverification_info.items.header;

import Y61.k;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;

/* compiled from: HeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f216115b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f216116c;

    public a(@k String str, @k PrintableText printableText) {
        this.f216115b = str;
        this.f216116c = printableText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF216115b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF216115b() {
        return this.f216115b;
    }
}
