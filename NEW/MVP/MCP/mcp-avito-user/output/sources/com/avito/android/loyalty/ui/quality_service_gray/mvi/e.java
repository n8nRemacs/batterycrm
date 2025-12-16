package com.avito.android.loyalty.ui.quality_service_gray.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.loyalty.ui.quality_service_gray.mvi.entity.QualityServiceGrayInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: QualityServiceGrayBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/loyalty/ui/quality_service_gray/mvi/entity/QualityServiceGrayInternalAction;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.b<QualityServiceGrayInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.quality_service_gray.f f184122a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IW.a f184123b;

    @Inject
    public e(@Y61.k com.avito.android.loyalty.ui.quality_service_gray.f fVar, @Y61.k IW.a aVar) {
        this.f184122a = fVar;
        this.f184123b = aVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<QualityServiceGrayInternalAction> a() {
        return C43175k.G(new a(this.f184122a.a(), null, this.f184123b));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
