package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3}, l = {1660, 1669, 1671, 1680}, m = "confirmDiscountDispatch", n = {"this", "$this$confirmDiscountDispatch", "emit", "oldState", "this", "$this$confirmDiscountDispatch", "emit", "oldState", "this", "$this$confirmDiscountDispatch", "emit", "oldState", "$this$onFailureSuspend$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0"})
/* renamed from: com.avito.android.sbc.create.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34473c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f259574q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259575r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.p f259576s;

    /* renamed from: t, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259577t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f259578u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34469a f259579v;

    /* renamed from: w, reason: collision with root package name */
    public int f259580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34473c(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259579v = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259578u = obj;
        this.f259580w |= BeduinInputModel.MIN_TEXT_VERSION;
        return C34469a.e(this.f259579v, null, null, this);
    }
}
