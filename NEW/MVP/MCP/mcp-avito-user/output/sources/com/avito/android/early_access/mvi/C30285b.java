package com.avito.android.early_access.mvi;

import Lx.InterfaceC14447b;
import Mx.InterfaceC14538a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.early_access.mvi.entity.EarlyAccessInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EarlyAccessActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access/mvi/entity/EarlyAccessInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.early_access.mvi.EarlyAccessActor$process$2", f = "EarlyAccessActor.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.early_access.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30285b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EarlyAccessInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f145437q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f145438r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30292i f145439s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14538a f145440t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30285b(C30292i c30292i, InterfaceC14538a interfaceC14538a, Continuation<? super C30285b> continuation) {
        super(2, continuation);
        this.f145439s = c30292i;
        this.f145440t = interfaceC14538a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30285b c30285b = new C30285b(this.f145439s, this.f145440t, continuation);
        c30285b.f145438r = obj;
        return c30285b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EarlyAccessInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30285b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        G0 g02;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f145437q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f145438r;
            String str2 = ((InterfaceC14538a.e) this.f145440t).f11108a;
            C30292i c30292i = this.f145439s;
            ReEarlyAccessData.Package packageC = c30292i.c(str2);
            if (packageC != null) {
                InterfaceC14447b interfaceC14447b = c30292i.f145500c;
                ReEarlyAccessData.Package.AnalyticsData analyticsData = packageC.f145357k;
                if (analyticsData == null || (str = analyticsData.f145358b) == null) {
                    g02 = null;
                } else {
                    interfaceC14447b.c(str);
                    g02 = G0.f406611a;
                }
                if (g02 == null) {
                    interfaceC14447b.a(packageC.f145350d);
                }
                EarlyAccessInternalAction.PackageSelected packageSelected = new EarlyAccessInternalAction.PackageSelected(packageC);
                this.f145437q = 1;
                if (interfaceC43172j.emit(packageSelected, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
