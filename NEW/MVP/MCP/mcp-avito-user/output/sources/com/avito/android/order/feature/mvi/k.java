package com.avito.android.order.feature.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OrderActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.order.feature.mvi.OrderActor", f = "OrderActor.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3}, l = {146, 150, 157, 159}, m = "workPolling", n = {"this", "$this$workPolling", "previousState", "this", "$this$workPolling", "previousState", "shouldDoImmediately", "this", "$this$workPolling", "previousState", "result", "shouldDoImmediately", "newLastUpdate", "this", "$this$workPolling", "previousState", "shouldDoImmediately"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes15.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public C32941a f209655q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f209656r;

    /* renamed from: s, reason: collision with root package name */
    public Y41.a f209657s;

    /* renamed from: t, reason: collision with root package name */
    public O40.c f209658t;

    /* renamed from: u, reason: collision with root package name */
    public int f209659u;

    /* renamed from: v, reason: collision with root package name */
    public int f209660v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f209661w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C32941a f209662x;

    /* renamed from: y, reason: collision with root package name */
    public int f209663y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C32941a c32941a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f209662x = c32941a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f209661w = obj;
        this.f209663y |= BeduinInputModel.MIN_TEXT_VERSION;
        return C32941a.c(this.f209662x, null, null, this);
    }
}
