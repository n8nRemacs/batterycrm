package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentShowProgressToastActorDelegate$subscribeShowToast$$inlined$flatMapLatest$1", f = "BxContentShowProgressToastActorDelegate.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class Y0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction.ShowProgressToast>, ProgressInfoToastBarData, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111501q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f111502r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f111503s;

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction.ShowProgressToast> interfaceC43172j, ProgressInfoToastBarData progressInfoToastBarData, Continuation<? super kotlin.G0> continuation) {
        Y0 y02 = new Y0(3, continuation);
        y02.f111502r = interfaceC43172j;
        y02.f111503s = progressInfoToastBarData;
        return y02.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111501q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f111502r;
            C43210w c43210w = new C43210w(new BxContentInternalAction.ShowProgressToast((ProgressInfoToastBarData) this.f111503s));
            this.f111501q = 1;
            if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
