package com.yandex.div.core.view2.divs;

import com.yandex.div2.DivAction;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PagerSelectedActionsDispatcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class F2 extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<DivAction> f368067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E2 f368068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F2(List<? extends DivAction> list, E2 e22) {
        super(0);
        this.f368067l = list;
        this.f368068m = e22;
    }

    @Override // Y41.a
    public final kotlin.G0 invoke() {
        for (DivAction divAction : this.f368067l) {
            E2 e22 = this.f368068m;
            e22.f368052c.a(e22.f368050a, divAction, null);
        }
        return kotlin.G0.f406611a;
    }
}
