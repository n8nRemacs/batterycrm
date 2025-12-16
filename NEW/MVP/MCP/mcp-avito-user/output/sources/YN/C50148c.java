package yN;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InfoPageLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import wN.InterfaceC49541a;

/* compiled from: InfoPageLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LyN/c;", "Lev/b;", "Lcom/avito/android/deep_linking/links/InfoPageLink;", "_avito_info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yN.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C50148c extends AbstractC40162b<InfoPageLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f443081d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC49541a f443082e;

    @Inject
    public C50148c(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC49541a interfaceC49541a) {
        this.f443081d = interfaceC4053a;
        this.f443082e = interfaceC49541a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        InfoPageLink infoPageLink = (InfoPageLink) deepLink;
        this.f443081d.R(this.f443082e.c(infoPageLink.f133372b, infoPageLink.f133373c), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
