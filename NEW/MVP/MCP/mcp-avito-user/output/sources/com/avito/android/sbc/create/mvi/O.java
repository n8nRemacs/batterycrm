package com.avito.android.sbc.create.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchState;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor", f = "CreateDiscountDispatchActor.kt", i = {0, 0, 0, 0, 0}, l = {1690}, m = "handleConfirmError", n = {"this", "$this$handleConfirmError", "errorMessage", "error", "oldState"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes3.dex */
final class O extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C34469a f259469q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.arch.mvi.utils.l f259470r;

    /* renamed from: s, reason: collision with root package name */
    public String f259471s;

    /* renamed from: t, reason: collision with root package name */
    public Throwable f259472t;

    /* renamed from: u, reason: collision with root package name */
    public CreateDiscountDispatchState.DiscountDispatchDataLoaded f259473u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f259474v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C34469a f259475w;

    /* renamed from: x, reason: collision with root package name */
    public int f259476x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C34469a c34469a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f259475w = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f259474v = obj;
        this.f259476x |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f259475w.H(null, null, null, null, null, this);
    }
}
