package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.FakeDoorDialogLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Z;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/FakeDoorDialogLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.e0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29716e0 extends kotlin.jvm.internal.N implements Y41.l<Uri, FakeDoorDialogLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134288l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29716e0(E2 e22) {
        super(1);
        this.f134288l = e22;
    }

    @Override // Y41.l
    public final FakeDoorDialogLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        List list;
        Object bVar;
        Uri uri2 = uri;
        E2 e22 = this.f134288l;
        e22.getClass();
        Gson gson = e22.f134215d;
        String queryParameter = uri2.getQueryParameter("title");
        String strP = Ku.i.p(uri2, "type");
        C29704b0 c29704b0 = new C29704b0(uri2);
        try {
            Type type = new C29708c0().getType();
            String queryParameter2 = uri2.getQueryParameter("stages");
            if (queryParameter2 != null && (list = (List) gson.e(queryParameter2, type)) != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    try {
                        int i12 = kotlin.Z.f406624c;
                        try {
                            Type type2 = new C29712d0().getType();
                            String queryParameter3 = uri2.getQueryParameter("analyticsParams");
                            bVar = (Map) (queryParameter3 != null ? gson.e(queryParameter3, type2) : null);
                        } catch (JsonParseException e12) {
                            throw new DeeplinkParsingError.WrongParameterValue(uri2.toString(), "analyticsParams", DeeplinkParsingError.FieldConstraint.Json.f133986b, e12);
                        }
                    } catch (Throwable th2) {
                        int i13 = kotlin.Z.f406624c;
                        bVar = new Z.b(th2);
                    }
                    return new FakeDoorDialogLink(strP, queryParameter, list, (Map) (bVar instanceof Z.b ? null : bVar));
                }
            }
            c29704b0.invoke(new IllegalArgumentException("Parameter stages is null!"));
            throw null;
        } catch (JsonParseException e13) {
            c29704b0.invoke(e13);
            throw null;
        }
    }
}
