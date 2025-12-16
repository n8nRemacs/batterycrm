package com.avito.android.mortgage_calculator.internal.mvi.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.mortgage_calculator.model.MortgageCalculatorConfig;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoadInitialValuesUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.mortgage_calculator.internal.mvi.domain.LoadInitialValuesUseCase", f = "LoadInitialValuesUseCase.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {41, 48}, m = "handleRetryLoading", n = {"this", Navigation.CONFIG, "i", "this", Navigation.CONFIG, "result", "i"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes15.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f204512q;

    /* renamed from: r, reason: collision with root package name */
    public MortgageCalculatorConfig f204513r;

    /* renamed from: s, reason: collision with root package name */
    public TypedResult f204514s;

    /* renamed from: t, reason: collision with root package name */
    public int f204515t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f204516u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f204517v;

    /* renamed from: w, reason: collision with root package name */
    public int f204518w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f204517v = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f204516u = obj;
        this.f204518w |= BeduinInputModel.MIN_TEXT_VERSION;
        return b.a(this.f204517v, null, this);
    }
}
