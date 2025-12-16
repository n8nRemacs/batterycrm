package com.avito.android.wallet.page.topup.form.items.bubble;

import kotlin.Metadata;

/* compiled from: BubbleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/bubble/a;", "Lcom/avito/conveyor_item/a;", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f328302b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f328303c;

    public a(@Y61.k String str, @Y61.k String str2) {
        this.f328302b = str;
        this.f328303c = str2;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF322725b() {
        return getF328302b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF328302b() {
        return this.f328302b;
    }
}
