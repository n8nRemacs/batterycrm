package com.avito.android.rating.details.deep_linking.public_rating;

import Y61.k;
import android.content.Intent;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.avito.android.analytics_ratings_reviews.ReviewsOpenPageFrom;
import com.avito.android.deep_linking.PublicRatingDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.rating.f;
import com.avito.android.remote.model.FloatingBuyBlock;
import com.google.gson.Gson;
import ev.AbstractC40161a;
import java.net.URLDecoder;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.jvm.internal.s0;
import l41.g;
import l41.r;
import rv.C47918a;
import sv.C48421d;

/* compiled from: PublicRatingDetailsLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating/details/deep_linking/public_rating/b;", "Lev/a;", "Lcom/avito/android/deep_linking/PublicRatingDetailsLink;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends AbstractC40161a<PublicRatingDetailsLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.b f246961f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final f f246962g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f246963h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Gson f246964i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final x f246965j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f246966k = new io.reactivex.rxjava3.disposables.c();

    /* compiled from: PublicRatingDetailsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "it", "", "test", "(Lrv/a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements r {
        public a() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((C47918a) obj).f437155a == C48421d.a(b.this);
        }
    }

    /* compiled from: PublicRatingDetailsLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/a;", "result", "Lkotlin/G0;", "accept", "(Lrv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.rating.details.deep_linking.public_rating.b$b, reason: collision with other inner class name */
    public static final class C7416b<T> implements g {
        public C7416b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C47918a c47918a = (C47918a) obj;
            int i12 = c47918a.f437156b;
            b bVar = b.this;
            if (i12 != -1) {
                bVar.j(PublicRatingDetailsLink.b.a.f132856b);
            } else {
                Intent intent = c47918a.f437157c;
                bVar.j(new PublicRatingDetailsLink.b.C3980b(intent != null ? intent.getStringExtra("message") : null));
            }
        }
    }

    @Inject
    public b(@k a.b bVar, @k f fVar, @k a.InterfaceC4053a interfaceC4053a, @k Gson gson, @k x xVar) {
        this.f246961f = bVar;
        this.f246962g = fVar;
        this.f246963h = interfaceC4053a;
        this.f246964i = gson;
        this.f246965j = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.Z$b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.Map] */
    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        FloatingBuyBlock bVar;
        String str2;
        String str3;
        String str4;
        PublicRatingDetailsLink publicRatingDetailsLink = (PublicRatingDetailsLink) deepLink;
        ReviewsOpenPageFrom.f91254c.getClass();
        ReviewsOpenPageFrom reviewsOpenPageFromA = ReviewsOpenPageFrom.a.a(bundle);
        String str5 = (String) publicRatingDetailsLink.f132855f.get("floatingBuyBlock");
        if (str5 != null) {
            try {
                int i12 = Z.f406624c;
                Map map = (Map) this.f246964i.e(URLDecoder.decode(str5, Constants.ENCODING), new com.avito.android.rating.details.deep_linking.public_rating.a().getType());
                String str6 = (String) map.get("title");
                bVar = (str6 == null || (str2 = (String) map.get("price")) == null || (str3 = (String) map.get("imagePreviewUrl")) == null || (str4 = (String) map.get("buyButtonDeepLink")) == null) ? null : new FloatingBuyBlock(str6, str2, str3, this.f246965j.b(str4));
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            floatingBuyBlock = bVar instanceof Z.b ? null : bVar;
        }
        this.f246963h.J(this.f246962g.e(reviewsOpenPageFromA, floatingBuyBlock, publicRatingDetailsLink.f132854e, publicRatingDetailsLink.f132851b, publicRatingDetailsLink.f132852c, publicRatingDetailsLink.f132853d), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        this.f246966k.b(this.f246961f.Q().N(new a()).t0(new C7416b()));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f246966k.e();
    }
}
