package com.avito.android.blueprint.chips.single;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishChipsSinglePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f105434l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f105435m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, DeepLink deepLink) {
        super(0);
        this.f105434l = fVar;
        this.f105435m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f105434l.f105438d.accept(this.f105435m);
        return G0.f406611a;
    }
}
