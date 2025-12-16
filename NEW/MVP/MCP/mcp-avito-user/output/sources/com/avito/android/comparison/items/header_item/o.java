package com.avito.android.comparison.items.header_item;

import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: HeaderButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/items/header_item/o;", "Lcom/avito/android/comparison/items/header_item/m;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f123996a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f123997b;

    public o(@Y61.k String str, @Y61.k DeepLink deepLink) {
        this.f123996a = str;
        this.f123997b = deepLink;
    }

    @Override // com.avito.android.comparison.items.header_item.m
    @Y61.k
    /* renamed from: getText, reason: from getter */
    public final String getF123996a() {
        return this.f123996a;
    }

    @Override // com.avito.android.comparison.items.header_item.m
    public final int h() {
        return R.attr.buttonAccentExtraSmall;
    }
}
