package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.AppVersionDeepLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.text.C43066x;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/AppVersionDeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class P extends kotlin.jvm.internal.N implements Y41.l<Uri, AppVersionDeepLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134250l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(E2 e22) {
        super(1);
        this.f134250l = e22;
    }

    @Override // Y41.l
    public final AppVersionDeepLink invoke(Uri uri) throws DeeplinkParsingError.Custom, DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134250l;
        e22.getClass();
        double dJ2 = Ku.i.j(uri2, "android");
        Double dW02 = C43066x.w0(e22.f134213b.f().invoke());
        if (dW02 == null) {
            Ku.i.g(e22, uri2, "wrong appVersionName");
            throw null;
        }
        double dDoubleValue = dW02.doubleValue();
        String str = dDoubleValue == dJ2 ? "equal" : dDoubleValue > dJ2 ? "greater" : "less";
        Gson gson = e22.f134215d;
        try {
            Type type = new O().getType();
            String queryParameter = uri2.getQueryParameter(str);
            Iterable iterable = (List) (queryParameter != null ? gson.e(queryParameter, type) : null);
            if (iterable == null) {
                iterable = C42784z0.f406748b;
            }
            Iterable iterable2 = iterable;
            com.avito.android.deep_linking.x xVar = (com.avito.android.deep_linking.x) e22.f134220i.getValue();
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable2, 10));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                arrayList.add(xVar.b((String) it.next()));
            }
            return new AppVersionDeepLink(arrayList, uri2);
        } catch (JsonParseException e12) {
            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), str, DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
        }
    }
}
