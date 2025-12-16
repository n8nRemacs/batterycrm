package sC;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.account.E;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.favorite_comparison.FavoriteComparisonLink;
import com.avito.android.user_favorites.InterfaceC35727l;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteComparisonDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LsC/a;", "Lev/b;", "Lcom/avito/android/favorite_comparison/FavoriteComparisonLink;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sC.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C48024a extends AbstractC40162b<FavoriteComparisonLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35727l f437531d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final E f437532e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f437533f;

    @Inject
    public C48024a(@k InterfaceC35727l interfaceC35727l, @k E e12, @k a.InterfaceC4053a interfaceC4053a) {
        this.f437531d = interfaceC35727l;
        this.f437532e = e12;
        this.f437533f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        if (!this.f437532e.b()) {
            return AbstractC14250d.b.f9170c;
        }
        this.f437533f.R(this.f437531d.b(), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
