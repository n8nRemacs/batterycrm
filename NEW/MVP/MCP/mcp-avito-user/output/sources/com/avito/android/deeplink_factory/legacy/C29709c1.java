package com.avito.android.deeplink_factory.legacy;

import android.net.Uri;
import com.avito.android.deep_linking.links.auth.ResetPasswordLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: LegacyDeepLinkFactory.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/deep_linking/links/auth/ResetPasswordLink;", TooltipAttribute.PARAM_DEEP_LINK, "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.deeplink_factory.legacy.c1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29709c1 extends kotlin.jvm.internal.N implements Y41.l<Uri, ResetPasswordLink> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2 f134283l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29709c1(E2 e22) {
        super(1);
        this.f134283l = e22;
    }

    @Override // Y41.l
    public final ResetPasswordLink invoke(Uri uri) {
        Uri uri2 = uri;
        this.f134283l.getClass();
        String queryParameter = uri2.getQueryParameter("login");
        String queryParameter2 = uri2.getQueryParameter("src");
        String queryParameter3 = uri2.getQueryParameter("skipLoginEntry");
        boolean z12 = !(queryParameter3 == null || queryParameter3.length() == 0);
        if (queryParameter == null) {
            queryParameter = "";
        }
        return new ResetPasswordLink(queryParameter, z12, queryParameter2);
    }
}
