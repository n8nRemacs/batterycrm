package com.avito.android.seller_coach.hints_dialog.item.header;

import Y61.k;
import kotlin.Metadata;

/* compiled from: HeaderHintDataItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267474b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267475c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f267476d;

    public a(@k String str, @k String str2, @k String str3) {
        this.f267474b = str;
        this.f267475c = str2;
        this.f267476d = str3;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF229812b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229812b() {
        return this.f267474b;
    }
}
