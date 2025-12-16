package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "phoneLink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34791n extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34797u f271192l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271193m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f271194n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34791n(C34797u c34797u, AdvertItem advertItem, boolean z12) {
        super(1);
        this.f271192l = c34797u;
        this.f271193m = advertItem;
        this.f271194n = z12;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f271192l.f271212c.get().Sa(this.f271193m.f268425c, deepLink, this.f271194n ? ContactSource.f89920e : ContactSource.f89919d);
        return G0.f406611a;
    }
}
