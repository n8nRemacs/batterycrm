package com.avito.android.loyalty.ui.badges_list;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgesListActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f183368l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BadgesListActivity f183369m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, BadgesListActivity badgesListActivity) {
        super(1);
        this.f183368l = str;
        this.f183369m = badgesListActivity;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        Bundle bundle = new Bundle();
        RW.a.f14478a.getClass();
        String str = this.f183368l;
        if (str != null) {
            bundle.putString("user_key", str);
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f183369m.f183361o;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, null, bundle, 2);
        return G0.f406611a;
    }
}
