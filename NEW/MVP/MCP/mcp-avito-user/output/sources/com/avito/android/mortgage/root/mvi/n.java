package com.avito.android.mortgage.root.mvi;

import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import com.facebook.imageutils.JfifUtil;
import f10.InterfaceC40199a;
import g10.C40513c;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$6", f = "MortgageRootActor.kt", i = {0, 0}, l = {JfifUtil.MARKER_RST0, JfifUtil.MARKER_EOI}, m = "invokeSuspend", n = {"$this$flow", "banks"}, s = {"L$0", "L$1"})
/* loaded from: classes15.dex */
final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f203297q;

    /* renamed from: r, reason: collision with root package name */
    public int f203298r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f203299s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f203300t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C40513c f203301u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40199a f203302v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(s sVar, InterfaceC40199a interfaceC40199a, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203300t = sVar;
        this.f203301u = c40513c;
        this.f203302v = interfaceC40199a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C40513c c40513c = this.f203301u;
        n nVar = new n(this.f203300t, this.f203302v, c40513c, continuation);
        nVar.f203299s = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.mortgage.root.mvi.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
