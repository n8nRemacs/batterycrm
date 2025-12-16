package com.avito.android.comparison.mvi;

import Rq.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ComparisonActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LRq/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comparison.mvi.ComparisonActor$process$10", f = "ComparisonActor.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.comparison.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29517a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Rq.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f124111q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f124112r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Rq.d f124113s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29517a(Rq.d dVar, Continuation<? super C29517a> continuation) {
        super(2, continuation);
        this.f124113s = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29517a c29517a = new C29517a(this.f124113s, continuation);
        c29517a.f124112r = obj;
        return c29517a;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Rq.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C29517a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        List<TV0.a> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f124111q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f124112r;
            Sq.j jVar = this.f124113s.f14694d;
            if (jVar == null || (list = jVar.f15164b) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof com.avito.android.comparison.items.header_item.b) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(C42745f0.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.avito.android.comparison.items.header_item.b) it.next()).f123952d);
                }
            }
            b.C0985b c0985b = new b.C0985b(arrayList);
            this.f124111q = 1;
            if (interfaceC43172j.emit(c0985b, this) == coroutine_suspended) {
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
