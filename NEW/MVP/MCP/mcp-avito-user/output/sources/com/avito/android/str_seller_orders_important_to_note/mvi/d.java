package com.avito.android.str_seller_orders_important_to_note.mvi;

import Y41.p;
import aA0.InterfaceC19747a;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerImportantToNoteActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.mvi.StrSellerImportantToNoteActor$process$2", f = "StrSellerImportantToNoteActor.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerImportantToNoteInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f291385q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f291386r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19747a f291387s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f291388t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC19747a interfaceC19747a, a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f291387s = interfaceC19747a;
        this.f291388t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f291387s, this.f291388t, continuation);
        dVar.f291386r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSellerImportantToNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        com.avito.android.str_seller_orders_important_to_note.domain.e eVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f291385q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f291386r;
            InterfaceC19747a.C1485a c1485a = (InterfaceC19747a.C1485a) this.f291387s;
            com.avito.android.str_seller_orders_important_to_note.domain.d dVar = c1485a.f20781a.f291308b;
            com.avito.android.str_seller_orders_important_to_note.domain.h hVar = (dVar == null || (eVar = dVar.f291313a) == null) ? null : eVar.f291318a;
            a aVar = this.f291388t;
            if (hVar != null) {
                int i13 = a.f291372e;
                aVar.c(hVar);
            }
            com.avito.android.str_seller_orders_important_to_note.domain.b bVar = c1485a.f20781a;
            int i14 = a.f291372e;
            aVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new b(bVar, aVar, null));
            this.f291385q = 1;
            if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
