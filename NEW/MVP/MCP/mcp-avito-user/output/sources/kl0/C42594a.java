package kL0;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import Zx.C19616a;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DiscountLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.vas_discount.i;
import com.avito.android.vas_discount.v2.ui.VasDiscountV2DialogFragment;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: VasDiscountDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LkL0/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/DiscountLink;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kL0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42594a extends AbstractC40162b<DiscountLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f406238d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final i f406239e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.d f406240f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C19616a f406241g;

    @Inject
    public C42594a(@k a.InterfaceC4053a interfaceC4053a, @k i iVar, @k a.d dVar, @k C19616a c19616a) {
        this.f406238d = interfaceC4053a;
        this.f406239e = iVar;
        this.f406240f = dVar;
        this.f406241g = c19616a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        C19616a c19616a = this.f406241g;
        c19616a.getClass();
        n<Object> nVar = C19616a.f20576q[11];
        boolean zBooleanValue = ((Boolean) c19616a.f20588m.a().invoke()).booleanValue();
        String str2 = ((DiscountLink) deepLink).f133284b;
        if (zBooleanValue) {
            VasDiscountV2DialogFragment.f319825s0.getClass();
            VasDiscountV2DialogFragment vasDiscountV2DialogFragment = new VasDiscountV2DialogFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("context", str2);
            vasDiscountV2DialogFragment.setArguments(bundle2);
            this.f406240f.w1(vasDiscountV2DialogFragment, "VasDiscountV2DialogFragment");
        } else {
            this.f406238d.R(this.f406239e.a(str2), com.avito.android.deeplink_handler.view.b.f134588l);
        }
        return AbstractC14250d.c.f9171c;
    }
}
