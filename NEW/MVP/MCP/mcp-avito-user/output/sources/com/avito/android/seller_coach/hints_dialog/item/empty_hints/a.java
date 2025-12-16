package com.avito.android.seller_coach.hints_dialog.item.empty_hints;

import Y61.k;
import kotlin.Metadata;

/* compiled from: EmptyHintDataItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/empty_hints/a;", "Lcom/avito/conveyor_item/a;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267464b;

    public a(@k String str) {
        this.f267464b = str;
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
        return this.f267464b;
    }
}
