package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.MarkChannelUnreadLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/MarkChannelUnreadLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Q0 extends kotlin.jvm.internal.N implements Y41.l<Uri, MarkChannelUnreadLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134254l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(E2 e22) {
        super(1);
        this.f134254l = e22;
    }

    @Override // Y41.l
    public final MarkChannelUnreadLink invoke(Uri uri) {
        this.f134254l.getClass();
        return new MarkChannelUnreadLink(Ku.i.p(uri, "channelId"));
    }
}
