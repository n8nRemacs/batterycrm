package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.VerificationSumsubLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.verification.VerificationFlow;
import com.avito.android.remote.verification.VerificationType;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/VerificationSumsubLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29765u extends kotlin.jvm.internal.N implements Y41.l<Uri, VerificationSumsubLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134341l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29765u(E2 e22) {
        super(1);
        this.f134341l = e22;
    }

    @Override // Y41.l
    public final VerificationSumsubLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134341l;
        e22.getClass();
        String strO = Ku.i.o(uri2, "token");
        String queryParameter = uri2.getQueryParameter("baseUrl");
        String strO2 = Ku.i.o(uri2, MessageBody.SystemMessageBody.Platform.FLOW);
        String strO3 = Ku.i.o(uri2, "type");
        String queryParameter2 = uri2.getQueryParameter("onFinish");
        DeepLink deepLinkB = queryParameter2 != null ? ((com.avito.android.deep_linking.x) e22.f134220i.getValue()).b(queryParameter2) : null;
        Parcelable.Creator<VerificationFlow> creator = VerificationFlow.CREATOR;
        Parcelable.Creator<VerificationType> creator2 = VerificationType.CREATOR;
        return new VerificationSumsubLink(strO2, strO3, strO, queryParameter, deepLinkB, null);
    }
}
