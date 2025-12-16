package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionBottomSheetLink;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/BodyConditionBottomSheetLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<Uri, BodyConditionBottomSheetLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(E2 e22) {
        super(1);
        this.f134227l = e22;
    }

    @Override // Y41.l
    public final BodyConditionBottomSheetLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        Gson gson = this.f134227l.f134215d;
        E e12 = new E(uri2);
        try {
            Type type = new F().getType();
            String queryParameter = uri2.getQueryParameter("contentJson");
            Object objE = queryParameter != null ? gson.e(queryParameter, type) : null;
            if (objE != null) {
                return new BodyConditionBottomSheetLink((BodyCondition) objE, null, 2, null);
            }
            e12.invoke(new IllegalArgumentException("Parameter contentJson is null!"));
            throw null;
        } catch (JsonParseException e13) {
            e12.invoke(e13);
            throw null;
        }
    }
}
