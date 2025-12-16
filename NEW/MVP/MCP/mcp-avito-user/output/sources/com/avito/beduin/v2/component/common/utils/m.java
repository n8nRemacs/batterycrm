package com.avito.beduin.v2.component.common.utils;

import Y41.q;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: ScrollBaseStateReader.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "firstVisiblePosition", "lastVisiblePosition", "Lcom/avito/beduin/v2/component/common/ScrollType;", "type", "Lkotlin/G0;", "invoke", "(IILcom/avito/beduin/v2/component/common/ScrollType;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class m extends N implements q<Integer, Integer, ScrollType, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f335720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335721m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(3);
        this.f335720l = lVar;
        this.f335721m = bVar;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, ScrollType scrollType) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        AbstractC36250j.b bVar = this.f335721m;
        this.f335720l.invoke(com.avito.beduin.v2.engine.field.entity.n.a(bVar, new Q("firstVisiblePosition", C36273j.c(bVar, iIntValue)), new Q("lastVisiblePosition", C36273j.c(bVar, iIntValue2)), new Q("scrollType", C36273j.e(bVar, scrollType.f335667b))));
        return G0.f406611a;
    }
}
