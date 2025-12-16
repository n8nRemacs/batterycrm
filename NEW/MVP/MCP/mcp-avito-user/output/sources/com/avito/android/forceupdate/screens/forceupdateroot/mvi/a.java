package com.avito.android.forceupdate.screens.forceupdateroot.mvi;

import Y41.p;
import com.avito.android.forceupdate.screens.forceupdateroot.mvi.entity.ForceUpdateRootInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ForceUpdateRootActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/forceupdate/screens/forceupdateroot/mvi/entity/ForceUpdateRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.forceupdate.screens.forceupdateroot.mvi.ForceUpdateRootActor$process$1", f = "ForceUpdateRootActor.kt", i = {0, 1, 2, 5, 6, 7, 9, 10, 12, 13, 14}, l = {34, 35, 36, 37, 39, 42, 43, 44, 45, 51, 52, 53, 58, 59, 60, 61, 65}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super ForceUpdateRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f158564q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f158565r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OE.a f158566s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f158567t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ OE.c f158568u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(OE.a aVar, b bVar, OE.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f158566s = aVar;
        this.f158567t = bVar;
        this.f158568u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f158566s, this.f158567t, this.f158568u, continuation);
        aVar.f158565r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ForceUpdateRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0182 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.forceupdate.screens.forceupdateroot.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
