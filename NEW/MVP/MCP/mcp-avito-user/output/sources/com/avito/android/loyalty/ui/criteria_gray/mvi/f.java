package com.avito.android.loyalty.ui.criteria_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.criteria_gray.mvi.entity.CriteriaGrayInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CriteriaGrayBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria_gray/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/loyalty/ui/criteria_gray/mvi/entity/CriteriaGrayInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements com.avito.android.arch.mvi.b<CriteriaGrayInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.criteria_gray.f f183625a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final JW.a f183626b;

    @Inject
    public f(@Y61.k com.avito.android.loyalty.ui.criteria_gray.f fVar, @Y61.k JW.a aVar) {
        this.f183625a = fVar;
        this.f183626b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CriteriaGrayInternalAction> a() {
        return C43175k.G(new a(this.f183625a.a(), null, this.f183626b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
