package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.LogFirebaseEventLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/LogFirebaseEventLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class S1 extends kotlin.jvm.internal.N implements Y41.l<Uri, LogFirebaseEventLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134259l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(E2 e22) {
        super(1);
        this.f134259l = e22;
    }

    @Override // Y41.l
    public final LogFirebaseEventLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134259l;
        e22.getClass();
        String strP = Ku.i.p(uri2, "name");
        Gson gson = e22.f134215d;
        Q1 q12 = new Q1(uri2);
        try {
            Type type = new R1().getType();
            String queryParameter = uri2.getQueryParameter("params");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE == null) {
                q12.invoke(new IllegalArgumentException("Parameter params is null!"));
                throw null;
            }
            Map map = (Map) objE;
            String queryParameter2 = uri2.getQueryParameter("redirect");
            return new LogFirebaseEventLink(strP, map, queryParameter2 != null ? ((com.avito.android.deep_linking.x) e22.f134220i.getValue()).b(queryParameter2) : null);
        } catch (JsonParseException e12) {
            q12.invoke(e12);
            throw null;
        }
    }
}
