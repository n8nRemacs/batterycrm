package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.travel_file_download_deeplink.FileDownloadResult;
import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileDownloadActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadActor$process$1", f = "FileDownloadActor.kt", i = {}, l = {21, 23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FileDownloadInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301767q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f301768r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HE0.c f301769s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HE0.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f301769s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f301769s, continuation);
        aVar.f301768r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FileDownloadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301767q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f301768r;
            HE0.c cVar = this.f301769s;
            if (cVar.f7020b != null) {
                FileDownloadInternalAction.CloseWithResult closeWithResult = new FileDownloadInternalAction.CloseWithResult(new FileDownloadResult.Pending(cVar.f7020b.longValue()));
                this.f301767q = 1;
                if (interfaceC43172j.emit(closeWithResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                FileDownloadInternalAction.CloseWithResult closeWithResult2 = new FileDownloadInternalAction.CloseWithResult(FileDownloadResult.Failed.f301669b);
                this.f301767q = 2;
                if (interfaceC43172j.emit(closeWithResult2, this) == coroutine_suspended) {
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
