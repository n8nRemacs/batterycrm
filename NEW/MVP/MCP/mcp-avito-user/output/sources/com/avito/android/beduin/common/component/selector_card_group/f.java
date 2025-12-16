package com.avito.android.beduin.common.component.selector_card_group;

import com.avito.android.beduin.common.component.selector_card_group.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinSelectorCardGroupComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupChange;", "change", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.l<BeduinSelectorCardGroupChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f102542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f102543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, n nVar) {
        super(1);
        this.f102542l = aVar;
        this.f102543m = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(BeduinSelectorCardGroupChange beduinSelectorCardGroupChange) {
        a aVar = this.f102542l;
        e eVar = new e(beduinSelectorCardGroupChange, aVar);
        a.C3071a c3071a = a.f102530k;
        aVar.getClass();
        n nVar = this.f102543m;
        nVar.setOnSelectChangeListener(null);
        eVar.invoke(nVar);
        nVar.setOnSelectChangeListener(new g(aVar));
        return G0.f406611a;
    }
}
