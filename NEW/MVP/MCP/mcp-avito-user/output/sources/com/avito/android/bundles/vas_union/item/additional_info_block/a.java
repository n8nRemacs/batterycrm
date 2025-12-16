package com.avito.android.bundles.vas_union.item.additional_info_block;

import Y61.k;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AdditionalInfoBlockItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/additional_info_block/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f108562b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f108563c;

    public a(@k AttributedText attributedText, @k UniversalImage universalImage) {
        this.f108562b = attributedText;
        this.f108563c = universalImage;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return 252272852;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF96836b() {
        return "additional_info_block";
    }
}
