package com.avito.android.search_suggest.adapter.banner;

import Pp0.InterfaceC14824b;
import com.avito.android.remote.model.search.suggest.BannerSuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BannerItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BannerSuggestItem f264144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f264145m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.search.a f264146n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BannerSuggestItem bannerSuggestItem, b bVar, com.avito.android.search.a aVar) {
        super(0);
        this.f264144l = bannerSuggestItem;
        this.f264145m = bVar;
        this.f264146n = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<SuggestAction> actions = this.f264144l.getActions();
        if (actions != null) {
            this.f264145m.f264147b.invoke(new InterfaceC14824b.C0869b(actions, this.f264146n));
        }
        return G0.f406611a;
    }
}
