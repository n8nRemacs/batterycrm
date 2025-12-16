package com.avito.android.serp.adapter.gig_promo_snippet;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.promo_snippet.PromoSnippetList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: GigPromoSnippetPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/gig_promo_snippet/e;", "Lcom/avito/android/serp/adapter/gig_promo_snippet/d;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f270091b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.analytics.widgets_tracker.g f270092c;

    /* compiled from: GigPromoSnippetPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/gig_promo_snippet/e$a;", "", "<init>", "()V", "", "FROM_PAGE", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k com.avito.android.serp.analytics.widgets_tracker.g gVar) {
        this.f270091b = aVar;
        this.f270092c = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        GigPromoSnippetItem gigPromoSnippetItem = (GigPromoSnippetItem) aVar;
        f fVar = new f(this, i12, gigPromoSnippetItem);
        PromoSnippetList promoSnippetList = ((c) eVar).f270090b;
        promoSnippetList.setOnButtonClickListener(fVar);
        promoSnippetList.setState(gigPromoSnippetItem.f270079c);
    }
}
