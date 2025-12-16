package com.avito.android.phone_reverification_info.items.text;

import Y61.k;
import kotlin.Metadata;
import x70.AbstractC49786e;

/* compiled from: TextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/items/text/a;", "Lcom/avito/conveyor_item/a;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f216123b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AbstractC49786e.a f216124c;

    public a(@k String str, @k AbstractC49786e.a aVar) {
        this.f216123b = str;
        this.f216124c = aVar;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207385b() {
        return getF216123b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF216132b() {
        return this.f216123b;
    }
}
