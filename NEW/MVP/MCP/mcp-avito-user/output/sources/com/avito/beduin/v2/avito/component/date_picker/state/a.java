package com.avito.beduin.v2.avito.component.date_picker.state;

import com.avito.beduin.v2.engine.C36273j;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;

/* compiled from: AvitoDatePickerStateFactory.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LST0/d;", "it", "Lkotlin/G0;", "invoke", "(LST0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements Y41.l<ST0.d, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.beduin.v2.engine.field.m, G0> f334175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f334176m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Y41.l<? super com.avito.beduin.v2.engine.field.m, G0> lVar, AbstractC36250j.b bVar) {
        super(1);
        this.f334175l = lVar;
        this.f334176m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(ST0.d dVar) {
        String str = dVar.f14989a;
        AbstractC36250j.b bVar = this.f334176m;
        this.f334175l.invoke(com.avito.beduin.v2.engine.field.entity.n.a(bVar, new Q("instant", C36273j.e(bVar, str))));
        return G0.f406611a;
    }
}
