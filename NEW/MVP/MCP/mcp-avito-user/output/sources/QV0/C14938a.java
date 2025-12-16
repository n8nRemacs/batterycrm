package Qv0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ShareLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.InterfaceC35845m2;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ShareLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LQv0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/ShareLink;", "_avito_share_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Qv0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14938a extends AbstractC40162b<ShareLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f14026d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35845m2 f14027e;

    @Inject
    public C14938a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC35845m2 interfaceC35845m2) {
        this.f14026d = interfaceC4053a;
        this.f14027e = interfaceC35845m2;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ShareLink shareLink = (ShareLink) deepLink;
        this.f14026d.R(Intent.createChooser(this.f14027e.d(shareLink.f133657c, shareLink.f133656b), shareLink.f133658d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
