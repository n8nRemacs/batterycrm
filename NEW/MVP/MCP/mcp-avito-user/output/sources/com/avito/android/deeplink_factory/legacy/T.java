package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.SingleTimeLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/SingleTimeLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class T extends kotlin.jvm.internal.N implements Y41.l<Uri, SingleTimeLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134260l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(E2 e22) {
        super(1);
        this.f134260l = e22;
    }

    @Override // Y41.l
    public final SingleTimeLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134260l;
        e22.getClass();
        return new SingleTimeLink(Ku.i.p(uri2, "key"), ((com.avito.android.deep_linking.x) e22.f134220i.getValue()).b(Ku.i.p(uri2, "redirect")));
    }
}
