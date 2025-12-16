package com.avito.android.str_cancellation_settings.domain;

import Oy0.InterfaceC14756a;
import Qy0.C14950a;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrCancellationSettingsInteractor.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LQy0/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_cancellation_settings.domain.StrCancellationSettingsInteractorImpl$loadStrCancellationSettings$1", f = "StrCancellationSettingsInteractor.kt", i = {}, l = {52, 51}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class l extends SuspendLambda implements Y41.p<InterfaceC43172j<? super TypedResult<C14950a>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f288368q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f288369r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f288370s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f288371t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f288372u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f288373v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, long j12, String str, String str2, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f288370s = eVar;
        this.f288371t = j12;
        this.f288372u = str;
        this.f288373v = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f288370s, this.f288371t, this.f288372u, this.f288373v, continuation);
        lVar.f288369r = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<C14950a>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f288368q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f288369r;
            InterfaceC14756a interfaceC14756a = this.f288370s.f288335b;
            this.f288369r = interfaceC43172j;
            this.f288368q = 1;
            obj = interfaceC14756a.b(this.f288371t, this.f288372u, this.f288373v, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f288369r;
            C42729a0.b(obj);
        }
        this.f288369r = null;
        this.f288368q = 2;
        if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
