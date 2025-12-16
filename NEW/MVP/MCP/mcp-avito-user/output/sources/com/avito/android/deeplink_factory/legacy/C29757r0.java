package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.UpdateFolderTagsLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: LegacyDeepLinkFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/UpdateFolderTagsLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.r0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29757r0 extends kotlin.jvm.internal.N implements Y41.l<Uri, UpdateFolderTagsLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134331l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29757r0(E2 e22) {
        super(1);
        this.f134331l = e22;
    }

    @Override // Y41.l
    public final UpdateFolderTagsLink invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134331l;
        e22.getClass();
        String strN = Ku.i.n(uri2, "channelId");
        String strN2 = Ku.i.n(uri2, "folderId");
        List<String> queryParameters = uri2.getQueryParameters("addTags");
        if (queryParameters == null) {
            queryParameters = C42784z0.f406748b;
        }
        List<String> queryParameters2 = uri2.getQueryParameters("removeTags");
        if (queryParameters2 == null) {
            queryParameters2 = C42784z0.f406748b;
        }
        if (!queryParameters.isEmpty() || !queryParameters2.isEmpty()) {
            return new UpdateFolderTagsLink(strN, strN2, queryParameters, queryParameters2);
        }
        Ku.i.g(e22, uri2, "addTags or removeTags must not be empty");
        throw null;
    }
}
