package com.avito.android.publish.slots.imv.item;

import Y41.l;
import com.avito.android.remote.model.category_parameters.slot.imv.BubbleInfo;
import com.avito.android.remote.model.search.suggest.SuggestAction;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: InstantMarketValueItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;", "bubbleInfo", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/category_parameters/slot/imv/BubbleInfo;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c extends N implements l<BubbleInfo, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f244274l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(1);
        this.f244274l = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(BubbleInfo bubbleInfo) {
        List<SuggestAction> actions = bubbleInfo.getActions();
        if (actions != null) {
            this.f244274l.f244276c.accept(actions);
        }
        return G0.f406611a;
    }
}
