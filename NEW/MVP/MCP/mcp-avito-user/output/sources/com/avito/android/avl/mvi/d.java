package com.avito.android.avl.mvi;

import com.avito.android.avl_analytics.AvlFromPage;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import zg.e;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.avl.mvi.AvlPlayerActor$process$$inlined$flatMapLatest$1", f = "AvlPlayerActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
public final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Mg.c>, List<? extends com.avito.conveyor_item.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f98208q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f98209r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f98210s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f98211t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ zg.e f98212u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, Continuation continuation, zg.e eVar) {
        super(3, continuation);
        this.f98211t = nVar;
        this.f98212u = eVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super Mg.c> interfaceC43172j, List<? extends com.avito.conveyor_item.a> list, Continuation<? super G0> continuation) {
        d dVar = new d(this.f98211t, continuation, this.f98212u);
        dVar.f98209r = interfaceC43172j;
        dVar.f98210s = list;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f98208q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f98209r;
            n nVar = this.f98211t;
            com.avito.android.avl_analytics.a aVar = nVar.f98241d;
            Integer numBoxInt = Boxing.boxInt(0);
            e.h hVar = (e.h) this.f98212u;
            aVar.l(null, numBoxInt, hVar.f444142a, Boxing.boxInt(0), null, hVar.f444142a != null ? AvlFromPage.f98430e : AvlFromPage.f98431f, hVar.f444143b);
            n2<Mg.c> n2VarC = nVar.f98239b.c(nVar.f98240c);
            this.f98208q = 1;
            if (C43175k.u(this, n2VarC, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
