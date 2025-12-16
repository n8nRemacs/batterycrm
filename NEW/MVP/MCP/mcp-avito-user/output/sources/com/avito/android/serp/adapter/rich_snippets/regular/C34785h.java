package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Action;
import com.avito.android.serp.adapter.AdvertItem;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34785h extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34797u f271176l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertItem f271177m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34785h(AdvertItem advertItem, C34797u c34797u) {
        super(0);
        this.f271176l = c34797u;
        this.f271177m = advertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.avito.android.serp.adapter.rich_snippets.a aVar = this.f271176l.f271212c.get();
        AdvertItem advertItem = this.f271177m;
        String str = advertItem.f268425c;
        Action action = advertItem.f268410V;
        if (action == null || action.getDeepLink() == null) {
            new NoMatchLink();
        }
        aVar.getClass();
        return G0.f406611a;
    }
}
