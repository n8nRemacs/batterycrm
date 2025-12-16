package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.SupportChatFormLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/SupportChatFormLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class Y1 extends kotlin.jvm.internal.N implements Y41.l<Uri, SupportChatFormLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y1(E2 e22) {
        super(1);
        this.f134274l = e22;
    }

    @Override // Y41.l
    public final SupportChatFormLink invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134274l;
        e22.getClass();
        int iL2 = Ku.i.l(uri2, "problemId");
        if (iL2 != 0) {
            return new SupportChatFormLink(iL2);
        }
        Ku.i.g(e22, uri2, "problemId must not be 0");
        throw null;
    }
}
