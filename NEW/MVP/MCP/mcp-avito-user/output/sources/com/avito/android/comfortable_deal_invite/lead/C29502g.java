package com.avito.android.comfortable_deal_invite.lead;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ComfortableDealInviteFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "requestKey", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal_invite.lead.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29502g extends kotlin.jvm.internal.N implements Y41.p<DeepLink, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealInviteFragment f123647l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29502g(ComfortableDealInviteFragment comfortableDealInviteFragment) {
        super(2);
        this.f123647l = comfortableDealInviteFragment;
    }

    @Override // Y41.p
    public final G0 invoke(DeepLink deepLink, String str) {
        DeepLink deepLink2 = deepLink;
        String str2 = str;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f123647l.f123524n0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, str2, null, 4);
        return G0.f406611a;
    }
}
