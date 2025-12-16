package com.avito.android.mortgage.root.mvi.domain;

import com.avito.android.util.R0;
import i00.InterfaceC41203a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.C43259k;

/* compiled from: SelectBanksTabUseCase.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/mvi/domain/I;", "Lcom/avito/android/mortgage/root/mvi/domain/G;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class I implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41203a> f202999a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f203000b;

    @Inject
    public I(@Y61.k R0 r02, @Y61.k h31.e eVar) {
        this.f202999a = eVar;
        this.f203000b = r02;
    }

    @Override // com.avito.android.mortgage.root.mvi.domain.G
    @Y61.l
    public final Object a(@Y61.k ArrayList arrayList, @Y61.k String str, @Y61.k Continuation continuation) {
        Object objG = C43259k.g(this.f203000b.a(), new H(this, str, arrayList, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
