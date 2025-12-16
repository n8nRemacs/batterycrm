package com.avito.android.scroll_tracker;

import Y41.p;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.T;

/* compiled from: SnippetScrollDepthRecyclerViewScrollListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.scroll_tracker.SnippetScrollDepthRecyclerViewScrollHandlerImpl$onViewedItemChangedDelayed$1", f = "SnippetScrollDepthRecyclerViewScrollListener.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f261711q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f261712r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f261713s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, int i12, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f261712r = bVar;
        this.f261713s = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f261712r, this.f261713s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Float fL2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f261711q;
        int i13 = this.f261713s;
        b bVar = this.f261712r;
        if (i12 == 0) {
            C42729a0.b(obj);
            bVar.f261710f.add(Boxing.boxInt(i13));
            this.f261711q = 1;
            if (C43131e0.b(2000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        int iK1 = bVar.f261708d.K1();
        int iM1 = bVar.f261708d.M1();
        if (iK1 <= i13 && i13 <= iM1 && (fL2 = bVar.l(i13)) != null && fL2.floatValue() >= 0.8f) {
            Object adapter = bVar.f261707c.getAdapter();
            com.avito.conveyor_item.a aVar = null;
            com.avito.konveyor.adapter.i iVar = adapter instanceof com.avito.konveyor.adapter.i ? (com.avito.konveyor.adapter.i) adapter : null;
            if (iVar != null) {
                TV0.a item = iVar.getItem(i13);
                if (item instanceof com.avito.conveyor_item.a) {
                    aVar = (com.avito.conveyor_item.a) item;
                }
            }
            if (aVar != null) {
                bVar.f261706b.f112822b.f112719f.e(aVar);
            }
            bVar.f261710f.remove(Boxing.boxInt(i13));
        }
        return G0.f406611a;
    }
}
