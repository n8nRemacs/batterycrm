package com.avito.android.search.filter.adapter.switcher;

import Y41.l;
import com.avito.android.search.filter.converter.common.SwitcherItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SwitcherItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SwitcherItem f262609l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f262610m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SwitcherItem switcherItem, f fVar) {
        super(1);
        this.f262609l = switcherItem;
        this.f262610m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        SwitcherItem switcherItem = this.f262609l;
        com.avito.android.search.filter.converter.common.b bVar = new com.avito.android.search.filter.converter.common.b(switcherItem.f262934b, switcherItem.f262935c, switcherItem.f262936d, switcherItem.f262937e, switcherItem.f262938f, switcherItem.f262939g, switcherItem.f262940h, switcherItem.f262941i, switcherItem.f262942j);
        bVar.f262953d = zBooleanValue;
        this.f262610m.f262611b.accept(bVar);
        return G0.f406611a;
    }
}
