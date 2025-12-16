package com.avito.android.travel_file_download_deeplink.mvi;

import com.avito.android.travel_file_download_deeplink.FileDownloadResult;
import com.avito.android.travel_file_download_deeplink.mvi.entity.FileDownloadInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FileDownloadActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/travel_file_download_deeplink/mvi/entity/FileDownloadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.travel_file_download_deeplink.mvi.FileDownloadActor$process$2", f = "FileDownloadActor.kt", i = {}, l = {AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super FileDownloadInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f301770q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f301771r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HE0.c f301772s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f301773t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HE0.c cVar, c cVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f301772s = cVar;
        this.f301773t = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f301772s, this.f301773t, continuation);
        bVar.f301771r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FileDownloadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f301770q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f301771r;
            Long l12 = this.f301772s.f7020b;
            if (l12 != null) {
                this.f301773t.f301774a.f301832a.remove(l12.longValue());
            }
            FileDownloadInternalAction.CloseWithResult closeWithResult = new FileDownloadInternalAction.CloseWithResult(FileDownloadResult.Canceled.f301668b);
            this.f301770q = 1;
            if (interfaceC43172j.emit(closeWithResult, this) == coroutine_suspended) {
                return coroutine_suspended;
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
