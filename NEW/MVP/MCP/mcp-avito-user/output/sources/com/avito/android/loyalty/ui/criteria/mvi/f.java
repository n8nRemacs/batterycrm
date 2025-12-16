package com.avito.android.loyalty.ui.criteria.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.criteria.mvi.entity.CriteriaInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CriteriaBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/loyalty/ui/criteria/mvi/entity/CriteriaInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.arch.mvi.b<CriteriaInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.criteria.c f183546a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JW.a f183547b;

    @Inject
    public f(@Y61.k com.avito.android.loyalty.ui.criteria.c cVar, @Y61.k JW.a aVar) {
        this.f183546a = cVar;
        this.f183547b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CriteriaInternalAction> a() {
        return C43175k.G(new a(this.f183546a.a(), null, this.f183547b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
