package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ChannelDetailsLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.l<Uri, ChannelDetailsLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134253l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(E2 e22) {
        super(1);
        this.f134253l = e22;
    }

    @Override // Y41.l
    public final ChannelDetailsLink invoke(Uri uri) {
        Uri uri2 = uri;
        this.f134253l.getClass();
        return new ChannelDetailsLink(Ku.i.n(uri2, "channelId"), uri2.getQueryParameter("flowId"));
    }
}
