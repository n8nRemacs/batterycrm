package com.avito.android.favorite_sellers.adapter.recommendation;

import com.avito.android.favorite_sellers.RecommendationItem;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecommendationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.reactivex.rxjava3.internal.observers.y f155682l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f155683m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ RecommendationItem f155684n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A f155685o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(io.reactivex.rxjava3.internal.observers.y yVar, i iVar, RecommendationItem recommendationItem, A a12) {
        super(0);
        this.f155682l = yVar;
        this.f155683m = iVar;
        this.f155684n = recommendationItem;
        this.f155685o = a12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DisposableHelper.a(this.f155682l);
        i iVar = this.f155683m;
        HashMap<String, A> map = iVar.f155660k;
        RecommendationItem recommendationItem = this.f155684n;
        map.remove(recommendationItem.f155459b);
        iVar.f155661l.remove(recommendationItem.f155459b);
        this.f155685o.d(null);
        return G0.f406611a;
    }
}
