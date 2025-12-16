package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.C30277e1;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.HelpCenterRequestLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/HelpCenterRequestLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class V1 extends kotlin.jvm.internal.N implements Y41.l<Uri, HelpCenterRequestLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(E2 e22) {
        super(1);
        this.f134266l = e22;
    }

    @Override // Y41.l
    public final HelpCenterRequestLink invoke(Uri uri) throws DeeplinkParsingError.FeatureToggleDisabled {
        Uri uri2 = uri;
        C30277e1 c30277e1 = this.f134266l.f134212a;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[4];
        Ku.i.k(uri2, c30277e1.f145011f.a());
        return new HelpCenterRequestLink(uri2.getQueryParameter(BeduinPromoBlockModel.SERIALIZED_NAME_THEME), uri2.getQueryParameter("advertisementId"), uri2.getQueryParameter("context"));
    }
}
