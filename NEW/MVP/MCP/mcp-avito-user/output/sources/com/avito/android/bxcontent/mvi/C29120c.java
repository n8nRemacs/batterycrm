package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.serp.adapter.replace_main_widget.ReplaceMainWidgetItem;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$handleReplaceMainButtonClick$1", f = "BxContentActor.kt", i = {0, 0, 1, 1, 2, 2, 4}, l = {1520, 1522, 1533, 1543, 1549, 1551}, m = "invokeSuspend", n = {"$this$flow", "itemWithLoading", "$this$flow", "itemWithLoading", "$this$flow", "itemWithLoading", "$this$flow"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* renamed from: com.avito.android.bxcontent.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29120c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ReplaceMainWidgetItem.ReplaceMain f111754q;

    /* renamed from: r, reason: collision with root package name */
    public int f111755r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f111756s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC29127b.o0 f111757t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C29105a f111758u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29120c(InterfaceC29127b.o0 o0Var, C29105a c29105a, Continuation<? super C29120c> continuation) {
        super(2, continuation);
        this.f111757t = o0Var;
        this.f111758u = c29105a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29120c c29120c = new C29120c(this.f111757t, this.f111758u, continuation);
        c29120c.f111756s = obj;
        return c29120c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29120c) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29120c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
