package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 1, 1, 2, 2}, l = {1726, 1731, 1736}, m = "handleGeneralFlowConfirmSuccessResult", n = {"$this$handleGeneralFlowConfirmSuccessResult", "curState", "$this$handleGeneralFlowConfirmSuccessResult", "curState", "$this$handleGeneralFlowConfirmSuccessResult", "curState"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class P extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259478q;

    /* renamed from: r, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259479r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f259480s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a f259481t;

    /* renamed from: u, reason: collision with root package name */
    public int f259482u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259481t = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259480s = obj;
        this.f259482u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f259481t.I(null, null, null, null, this);
    }
}
