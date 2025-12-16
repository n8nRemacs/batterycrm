package com.avito.android.safedeal.universal_delivery_type.mvi;

import Un0.C15542c;
import com.avito.android.safedeal.universal_delivery_type.mvi.entity.UniversalDeliveryTypeInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalDeliveryTypeReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LUn0/c$a$a;", "invoke", "(LUn0/c$a$a;)LUn0/c$a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class x extends N implements Y41.l<C15542c.a.C1145a, C15542c.a.C1145a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalDeliveryTypeInternalAction f256736l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(UniversalDeliveryTypeInternalAction universalDeliveryTypeInternalAction) {
        super(1);
        this.f256736l = universalDeliveryTypeInternalAction;
    }

    @Override // Y41.l
    public final C15542c.a.C1145a invoke(C15542c.a.C1145a c1145a) {
        return new C15542c.a.C1145a(c1145a.f16594a, ((UniversalDeliveryTypeInternalAction.TabSelect) this.f256736l).f256673b);
    }
}
