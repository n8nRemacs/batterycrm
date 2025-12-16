package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.FallbackableLink;
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

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/FallbackableLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.q, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29754q extends kotlin.jvm.internal.N implements Y41.l<Uri, FallbackableLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134327l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29754q(E2 e22) {
        super(1);
        this.f134327l = e22;
    }

    @Override // Y41.l
    public final FallbackableLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        Uri uri2 = uri;
        E2 e22 = this.f134327l;
        Gson gson = e22.f134215d;
        C29748o c29748o = new C29748o(uri2);
        try {
            Type type = new C29751p().getType();
            String queryParameter = uri2.getQueryParameter("fallbacks");
            if (queryParameter != null && (list = (List) gson.e(queryParameter, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.avito.android.deep_linking.x) e22.f134220i.getValue()).b((String) it.next()));
                    }
                    return new FallbackableLink(arrayList, uri2);
                }
            }
            c29748o.invoke(new IllegalArgumentException("Parameter fallbacks is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c29748o.invoke(e12);
            throw null;
        }
    }
}
