package com.avito.android.bundles.vas_union.item.lightning_block;

import Y61.k;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: LightningBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/lightning_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f108590b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f108591c;

    public a(@k AttributedText attributedText, @k Image image) {
        this.f108590b = attributedText;
        this.f108591c = image;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84833b() {
        return 1975761624;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF130049b() {
        return "lightning_block";
    }
}
