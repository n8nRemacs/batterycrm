package com.avito.android.safedeal.universal_delivery_type.courier.mvi;

import Qn0.c;
import com.avito.android.safedeal.universal_delivery_type.courier.mvi.entity.UniversalDeliveryTypeCourierInternalAction;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UniversalDeliveryTypeCourierReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LQn0/c$a;", "invoke", "(LQn0/c$a;)LQn0/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class n extends N implements Y41.l<c.a, c.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UniversalDeliveryTypeCourierInternalAction f256553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(UniversalDeliveryTypeCourierInternalAction universalDeliveryTypeCourierInternalAction) {
        super(1);
        this.f256553l = universalDeliveryTypeCourierInternalAction;
    }

    @Override // Y41.l
    public final c.a invoke(c.a aVar) {
        return c.a.a(aVar, null, null, ((UniversalDeliveryTypeCourierInternalAction.ExecuteRequestStateChanged) this.f256553l).f256534b, 111);
    }
}
