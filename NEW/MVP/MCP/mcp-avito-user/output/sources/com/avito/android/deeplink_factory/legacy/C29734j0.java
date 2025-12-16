package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.ImvGoodsPollLink;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBody;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/ImvGoodsPollLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.j0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29734j0 extends kotlin.jvm.internal.N implements Y41.l<Uri, ImvGoodsPollLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134303l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29734j0(E2 e22) {
        super(1);
        this.f134303l = e22;
    }

    @Override // Y41.l
    public final ImvGoodsPollLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        Gson gson = this.f134303l.f134215d;
        C29728h0 c29728h0 = new C29728h0(uri2);
        try {
            Type type = new C29731i0().getType();
            String queryParameter = uri2.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new ImvGoodsPollLink((ImvGoodsPollLinkBody) objE, Ku.i.m(uri2, "itemId"), Ku.i.p(uri2, "answerSlug"));
            }
            c29728h0.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c29728h0.invoke(e12);
            throw null;
        }
    }
}
