package com.avito.beduin.v2.component.common.utils;

import Y41.q;
import com.avito.beduin.v2.component.common.ScrollType;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScrollBaseStateReader.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/beduin/v2/engine/field/m;", "Lkotlin/G0;", "callback", "Lkotlin/Function3;", "", "Lcom/avito/beduin/v2/component/common/ScrollType;", "invoke", "(LY41/l;)LY41/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n extends N implements Y41.l<Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0>, q<? super Integer, ? super Integer, ? super ScrollType, ? extends G0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC36250j.b f335722l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AbstractC36250j.b bVar) {
        super(1);
        this.f335722l = bVar;
    }

    @Override // Y41.l
    public final q<? super Integer, ? super Integer, ? super ScrollType, ? extends G0> invoke(Y41.l<? super com.avito.beduin.v2.engine.field.m, ? extends G0> lVar) {
        return new m(lVar, this.f335722l);
    }
}
