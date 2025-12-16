package com.avito.android.vas_union.mvi;

import Y61.l;
import com.avito.android.vas_union.mvi.entity.VasUnionV2InternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: VasUnionV2Bootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/vas_union/mvi/entity/VasUnionV2InternalAction;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.arch.mvi.b<VasUnionV2InternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_union.domain.a f323209a;

    @Inject
    public c(@Y61.k com.avito.android.vas_union.domain.a aVar) {
        this.f323209a = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<VasUnionV2InternalAction> a() {
        return this.f323209a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
