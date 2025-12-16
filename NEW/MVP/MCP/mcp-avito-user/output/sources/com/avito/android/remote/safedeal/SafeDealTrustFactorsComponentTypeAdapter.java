package com.avito.android.remote.safedeal;

import Y61.k;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.parse.adapter.RuntimeTypeAdapter;
import com.avito.android.remote.safedeal.SafeDeal;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: SafeDealTrustFactorsComponentTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/safedeal/SafeDealTrustFactorsComponentTypeAdapter;", "Lcom/avito/android/remote/parse/adapter/RuntimeTypeAdapter;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "<init>", "()V", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SafeDealTrustFactorsComponentTypeAdapter extends RuntimeTypeAdapter<SafeDeal.Component> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f254362a;

    public SafeDealTrustFactorsComponentTypeAdapter() {
        super(null, "params", null, 5, null);
        this.f254362a = P0.g(new Q("listItem", SafeDeal.Component.ListItem.class), new Q("button", SafeDeal.Component.Button.class), new Q("spacing", SafeDeal.Component.Spacing.class), new Q("splitText", SafeDeal.Component.SplitText.class), new Q("text", SafeDeal.Component.Text.class), new Q("header", SafeDeal.Component.Header.class), new Q("expandableListItem", SafeDeal.Component.ExpandableListItem.class), new Q("combinedButtons", SafeDeal.Component.CombinedButtons.class), new Q(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, SafeDeal.Component.BadgeBar.class), new Q("voucher", SafeDeal.Component.Voucher.class));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.reflect.Type>] */
    @Override // com.avito.android.remote.parse.adapter.RuntimeTypeAdapter
    @k
    public final Map<String, Type> getMapping() {
        return this.f254362a;
    }
}
