package com.avito.android.comfortable_deal_invite.lead;

import android.net.Uri;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComfortableDealInviteFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.comfortable_deal_invite.lead.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29503h extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealInviteFragment f123648l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29503h(ComfortableDealInviteFragment comfortableDealInviteFragment) {
        super(1);
        this.f123648l = comfortableDealInviteFragment;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f123648l.f123524n0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new WebViewLink.AnyDomain(Uri.parse(str2), null, null, 6, null), null, null, 6);
        return G0.f406611a;
    }
}
