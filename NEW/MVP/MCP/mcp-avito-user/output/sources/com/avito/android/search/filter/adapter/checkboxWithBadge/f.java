package com.avito.android.search.filter.adapter.checkboxWithBadge;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CheckBoxWithBadgeItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.search.filter.converter.common.c f262129l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f262130m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.search.filter.converter.common.c cVar, g gVar) {
        super(1);
        this.f262129l = cVar;
        this.f262130m = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        com.avito.android.search.filter.converter.common.c cVar = this.f262129l;
        cVar.f262963e = zBooleanValue;
        g gVar = this.f262130m;
        gVar.f262132c.accept(new com.avito.android.search.filter.converter.common.b(cVar.f262960b, cVar.f262961c, zBooleanValue, cVar.f262965g, cVar.f262966h, cVar.f262967i, cVar.f262968j, cVar.f262969k, cVar.f262972n));
        return G0.f406611a;
    }
}
