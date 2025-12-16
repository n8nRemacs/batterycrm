package com.avito.android.blueprints.publish.checkable;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: CheckableItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CheckableItem f106093l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f106094m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CheckableItem checkableItem, f fVar) {
        super(0);
        this.f106093l = checkableItem;
        this.f106094m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        G0 g02;
        CheckableItem checkableItem = this.f106093l;
        DeepLink deepLink = checkableItem.f106088f;
        String str = checkableItem.f106084b;
        f fVar = this.f106094m;
        if (deepLink != null) {
            fVar.f106096c.accept(new Q<>(str, deepLink));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            fVar.f106095b.accept(str);
        }
        return G0.f406611a;
    }
}
