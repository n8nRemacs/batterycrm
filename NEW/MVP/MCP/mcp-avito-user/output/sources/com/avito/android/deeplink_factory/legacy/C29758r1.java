package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.auth.LandlinePhoneVerificationLink;
import com.avito.android.deep_linking.links.auth.PhoneVerificationLinkContext;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/auth/LandlinePhoneVerificationLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.r1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29758r1 extends kotlin.jvm.internal.N implements Y41.l<Uri, LandlinePhoneVerificationLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134332l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29758r1(E2 e22) {
        super(1);
        this.f134332l = e22;
    }

    @Override // Y41.l
    public final LandlinePhoneVerificationLink invoke(Uri uri) throws DeeplinkParsingError.WrongParameterValue {
        Uri uri2 = uri;
        E2 e22 = this.f134332l;
        e22.getClass();
        String queryParameter = uri2.getQueryParameter("phone");
        boolean z12 = Boolean.parseBoolean(uri2.getQueryParameter("isManual"));
        Gson gson = e22.f134215d;
        C29753p1 c29753p1 = new C29753p1(uri2);
        try {
            Type type = new C29756q1().getType();
            String queryParameter2 = uri2.getQueryParameter("context");
            Object objE = queryParameter2 != null ? gson.e(queryParameter2, type) : null;
            if (objE != null) {
                return new LandlinePhoneVerificationLink((PhoneVerificationLinkContext) objE, z12, queryParameter);
            }
            c29753p1.invoke(new IllegalArgumentException("Parameter context is null!"));
            throw null;
        } catch (JsonParseException e12) {
            c29753p1.invoke(e12);
            throw null;
        }
    }
}
