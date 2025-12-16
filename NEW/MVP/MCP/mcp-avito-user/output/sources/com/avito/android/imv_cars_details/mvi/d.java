package com.avito.android.imv_cars_details.mvi;

import Y41.q;
import com.avito.android.error.z;
import com.avito.android.imv_cars_details.mvi.entity.ImvCarsDetailsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ImvCarsDetailsActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/imv_cars_details/mvi/entity/ImvCarsDetailsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.imv_cars_details.mvi.ImvCarsDetailsActor$process$2", f = "ImvCarsDetailsActor.kt", i = {}, l = {62, 64}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<? super ImvCarsDetailsInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f169982q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f169983r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f169984s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f169985t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ WM.c f169986u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, WM.c cVar, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f169985t = eVar;
        this.f169986u = cVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ImvCarsDetailsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f169985t, this.f169986u, continuation);
        dVar.f169983r = interfaceC43172j;
        dVar.f169984s = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f169982q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f169983r;
            String strJ = z.j(this.f169984s);
            if (strJ == null) {
                strJ = this.f169985t.f169989c.getF170038a();
            }
            if (this.f169986u.f17887d != null) {
                ImvCarsDetailsInternalAction.ShowToast showToast = new ImvCarsDetailsInternalAction.ShowToast(strJ);
                this.f169983r = null;
                this.f169982q = 1;
                if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                ImvCarsDetailsInternalAction.ShowLoadingError showLoadingError = new ImvCarsDetailsInternalAction.ShowLoadingError(strJ);
                this.f169983r = null;
                this.f169982q = 2;
                if (interfaceC43172j.emit(showLoadingError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
