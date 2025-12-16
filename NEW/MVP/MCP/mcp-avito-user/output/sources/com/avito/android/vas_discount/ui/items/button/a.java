package com.avito.android.vas_discount.ui.items.button;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ButtonItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_discount/ui/items/button/a;", "Lcom/avito/conveyor_item/a;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319717b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f319718c;

    public a(@k String str, @k DeepLink deepLink) {
        this.f319717b = str;
        this.f319718c = deepLink;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272437b() {
        return 198295492;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF317713b() {
        return "action_id";
    }
}
