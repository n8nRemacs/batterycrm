package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.PinChannelLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/PinChannelLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class S0 extends kotlin.jvm.internal.N implements Y41.l<Uri, PinChannelLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134258l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(E2 e22) {
        super(1);
        this.f134258l = e22;
    }

    @Override // Y41.l
    public final PinChannelLink invoke(Uri uri) {
        this.f134258l.getClass();
        return new PinChannelLink(Ku.i.p(uri, "channelId"));
    }
}
