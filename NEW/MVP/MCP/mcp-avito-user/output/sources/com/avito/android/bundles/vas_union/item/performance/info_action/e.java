package com.avito.android.bundles.vas_union.item.performance.info_action;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InfoActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f108615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f108616m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar) {
        super(0);
        this.f108615l = fVar;
        this.f108616m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f108615l.f108617b.onNext(this.f108616m.f108610c);
        return G0.f406611a;
    }
}
