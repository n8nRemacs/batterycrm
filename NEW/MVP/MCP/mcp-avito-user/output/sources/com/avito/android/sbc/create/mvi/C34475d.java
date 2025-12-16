package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {1633, 1641, 1644, 1648}, m = "confirmDiscountDispatchVasFlow", n = {"this", "$this$confirmDiscountDispatchVasFlow", "applyVasDispatchLink", "emit", "oldState", "this", "$this$confirmDiscountDispatchVasFlow", "emit", "oldState", "this", "$this$confirmDiscountDispatchVasFlow", "emit", "oldState", "$this$onFailureSuspend$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: com.avito.android.sbc.create.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34475d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f259584q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259585r;

    /* renamed from: s, reason: collision with root package name */
    public Object f259586s;

    /* renamed from: t, reason: collision with root package name */
    public Object f259587t;

    /* renamed from: u, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259588u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f259589v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C34469a f259590w;

    /* renamed from: x, reason: collision with root package name */
    public int f259591x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34475d(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259590w = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259589v = obj;
        this.f259591x |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34469a.f(this.f259590w, null, null, null, this);
    }
}
