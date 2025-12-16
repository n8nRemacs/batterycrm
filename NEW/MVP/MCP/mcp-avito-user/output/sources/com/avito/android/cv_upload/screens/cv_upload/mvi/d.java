package com.avito.android.cv_upload.screens.cv_upload.mvi;

import Ot.InterfaceC14733a;
import Y41.p;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadInternalAction;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvUploadActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/cv_upload/screens/cv_upload/mvi/entity/CvUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_upload.screens.cv_upload.mvi.CvUploadActor$process$1", f = "CvUploadActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super CvUploadInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a f131743q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14733a f131744r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, InterfaceC14733a interfaceC14733a, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f131743q = aVar;
        this.f131744r = interfaceC14733a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f131743q, this.f131744r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super CvUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f131743q.f131727a, ((InterfaceC14733a.C0817a) this.f131744r).f12649a, null, null, 6);
        return G0.f406611a;
    }
}
