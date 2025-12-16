package com.avito.android.user_advert.advert.delegate.job_select_dialog;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_advert.advert.delegate.job_select_dialog.b;
import com.avito.android.util.C35936s;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: JobSelectBottomSheetDialogDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.job_select_dialog.JobSelectBottomSheetDialogDelegateImpl$changeCvVisibility$1", f = "JobSelectBottomSheetDialogDelegate.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f308639q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f308640r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f308641s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f308642t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, long j12, String str, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f308640r = cVar;
        this.f308641s = j12;
        this.f308642t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f308640r, this.f308641s, this.f308642t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f308639q;
        c cVar = this.f308640r;
        if (i12 == 0) {
            C42729a0.b(obj);
            cVar.f395801b.accept(b.c.f308629a);
            this.f308639q = 1;
            obj = cVar.f308631e.a(this.f308641s, this.f308642t, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Success) {
            ((TypedResult.Success) typedResult).getResult();
            cVar.f395801b.accept(b.a.f308627a);
        } else {
            if (!(typedResult instanceof TypedResult.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            TypedResult.Error error = (TypedResult.Error) typedResult;
            cVar.f395801b.accept(new b.C9468b(z.n(C35936s.a(error.getError(), error.getCause()))));
        }
        return G0.f406611a;
    }
}
