package kk;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.BrandspaceLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import ok.InterfaceC44786a;

/* compiled from: BrandspaceLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkk/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/BrandspaceLink;", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kk.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C42701a extends AbstractC40162b<BrandspaceLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f406566d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC44786a f406567e;

    @Inject
    public C42701a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC44786a interfaceC44786a) {
        this.f406566d = interfaceC4053a;
        this.f406567e = interfaceC44786a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        BrandspaceLink brandspaceLink = (BrandspaceLink) deepLink;
        this.f406566d.R(this.f406567e.a(brandspaceLink.f133060b, brandspaceLink.f133061c, brandspaceLink.f133062d), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
