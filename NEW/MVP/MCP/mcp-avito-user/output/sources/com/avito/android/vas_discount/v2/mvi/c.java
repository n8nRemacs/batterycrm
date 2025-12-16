package com.avito.android.vas_discount.v2.mvi;

import Y61.l;
import com.avito.android.vas_discount.v2.mvi.entity.VasDiscountV2InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VasDiscountV2Bootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_discount/v2/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/vas_discount/v2/mvi/entity/VasDiscountV2InternalAction;", "_avito_vas-discount_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.b<VasDiscountV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f319803a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_discount.v2.domain.a f319804b;

    @Inject
    public c(@com.avito.android.vas_discount.di.c @Y61.k String str, @Y61.k com.avito.android.vas_discount.v2.domain.a aVar) {
        this.f319803a = str;
        this.f319804b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<VasDiscountV2InternalAction> a() {
        return this.f319804b.a(this.f319803a);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
