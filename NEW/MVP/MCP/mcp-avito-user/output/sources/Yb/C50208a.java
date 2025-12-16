package yb;

import Cb.InterfaceC13237a;
import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.advertising.o;
import com.avito.android.advertising.p;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.OpenCreativeTargetingLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: OpenCreativeTargetingLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lyb/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/OpenCreativeTargetingLink;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C50208a extends AbstractC40162b<OpenCreativeTargetingLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f443202d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC13237a f443203e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final p f443204f;

    @Inject
    public C50208a(@k a.InterfaceC4053a interfaceC4053a, @k InterfaceC13237a interfaceC13237a, @k p pVar) {
        this.f443202d = interfaceC4053a;
        this.f443203e = interfaceC13237a;
        this.f443204f = pVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ((o) this.f443204f).a(((OpenCreativeTargetingLink) deepLink).f133525b);
        this.f443202d.R(this.f443203e.a(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
