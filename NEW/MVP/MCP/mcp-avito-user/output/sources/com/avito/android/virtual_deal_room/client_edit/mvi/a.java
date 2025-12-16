package com.avito.android.virtual_deal_room.client_edit.mvi;

import Y41.p;
import com.avito.android.virtual_deal_room.client_edit.mvi.entity.ClientEditInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientEditActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.mvi.ClientEditActor$saveUser$1", f = "ClientEditActor.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6}, l = {45, 49, 53, 57, 61, 66, 67, 86, 89}, m = "invokeSuspend", n = {"$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "validationSuccessful", "$this$flow", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ClientEditInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l0.a f326203q;

    /* renamed from: r, reason: collision with root package name */
    public Object f326204r;

    /* renamed from: s, reason: collision with root package name */
    public int f326205s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f326206t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b f326207u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ CN0.c f326208v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, CN0.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f326207u = bVar;
        this.f326208v = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f326207u, this.f326208v, continuation);
        aVar.f326206t = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientEditInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room.client_edit.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
