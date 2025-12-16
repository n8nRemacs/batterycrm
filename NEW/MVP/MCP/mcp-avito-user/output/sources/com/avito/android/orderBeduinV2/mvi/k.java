package com.avito.android.orderBeduinV2.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrderActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.orderBeduinV2.mvi.OrderActor", f = "OrderActor.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {142, 146, 154, 156}, m = "workPolling", n = {"this", "$this$workPolling", "previousState", "this", "$this$workPolling", "previousState", "shouldDoImmediately", "this", "$this$workPolling", "previousState", "result", "shouldDoImmediately", "newLastUpdate", "this", "$this$workPolling", "previousState", "shouldDoImmediately"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes15.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f209902q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f209903r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.a f209904s;

    /* renamed from: t, reason: collision with root package name */
    public O40.c f209905t;

    /* renamed from: u, reason: collision with root package name */
    public int f209906u;

    /* renamed from: v, reason: collision with root package name */
    public int f209907v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f209908w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a f209909x;

    /* renamed from: y, reason: collision with root package name */
    public int f209910y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209909x = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209908w = obj;
        this.f209910y |= BeduinInputModel.MIN_TEXT_VERSION;
        return a.d(this.f209909x, null, null, this);
    }
}
