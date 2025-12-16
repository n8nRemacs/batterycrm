package com.avito.android.avl_entry.impl.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ShortVideosInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/util/P2;", "", "Lcom/avito/conveyor_item/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl_entry.impl.domain.ShortVideosInteractorImpl$loadShortVideos$3", f = "ShortVideosInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super P2<? super List<? extends com.avito.conveyor_item.a>>>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f98489q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f98490r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f98490r = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super P2<? super List<? extends com.avito.conveyor_item.a>>> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f98490r, continuation);
        dVar.f98489q = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        new P2.a(this.f98490r.f98492b.a(this.f98489q));
        return G0.f406611a;
    }
}
