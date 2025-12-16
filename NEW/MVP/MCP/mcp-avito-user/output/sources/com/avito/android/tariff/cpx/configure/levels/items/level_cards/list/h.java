package com.avito.android.tariff.cpx.configure.levels.items.level_cards.list;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LevelCardPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f296174l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f296175m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f296176n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, DeepLink deepLink, d dVar) {
        super(0);
        this.f296174l = jVar;
        this.f296175m = deepLink;
        this.f296176n = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f296174l.f296179b.invoke(this.f296175m, Long.valueOf(this.f296176n.getF272342b()));
        return G0.f406611a;
    }
}
