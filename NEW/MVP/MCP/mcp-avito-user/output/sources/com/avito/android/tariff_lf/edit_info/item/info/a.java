package com.avito.android.tariff_lf.edit_info.item.info;

import Y61.k;
import kotlin.Metadata;

/* compiled from: InfoItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/info/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f299000b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f299001c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f299002d;

    public a(@k String str, @k String str2, @k String str3) {
        this.f299000b = str;
        this.f299001c = str2;
        this.f299002d = str3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF299000b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF299000b() {
        return this.f299000b;
    }
}
