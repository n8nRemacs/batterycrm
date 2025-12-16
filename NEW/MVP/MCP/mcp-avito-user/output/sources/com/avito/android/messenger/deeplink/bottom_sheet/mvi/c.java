package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import Y41.q;
import com.avito.android.R;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import java.io.Serializable;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BottomSheetInputActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.deeplink.bottom_sheet.mvi.BottomSheetInputActor$process$3", f = "BottomSheetInputActor.kt", i = {0}, l = {53, 54}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class c extends SuspendLambda implements q<InterfaceC43172j<? super BottomSheetInputInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f195478q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f195479r;

    public c() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BottomSheetInputInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(3, continuation);
        cVar.f195479r = interfaceC43172j;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f195478q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f195479r;
            BottomSheetInputInternalAction.LoadingStateChanged loadingStateChanged = new BottomSheetInputInternalAction.LoadingStateChanged(false);
            this.f195479r = interfaceC43172j;
            this.f195478q = 1;
            if (interfaceC43172j.emit(loadingStateChanged, this) == coroutine_suspended) {
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
            interfaceC43172j = this.f195479r;
            C42729a0.b(obj);
        }
        BottomSheetInputInternalAction.ShowError showError = new BottomSheetInputInternalAction.ShowError(com.avito.android.printable_text.b.c(R.string.messenger_generic_error, new Serializable[0]));
        this.f195479r = null;
        this.f195478q = 2;
        if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
