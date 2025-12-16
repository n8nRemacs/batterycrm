package com.avito.android.mortgage.document_upload.mvi;

import Y41.p;
import com.avito.android.mortgage.api.model.RemoteValidFile;
import com.avito.android.mortgage.document_upload.mvi.entity.DocumentUploadInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import d00.C39479c;
import f00.C40196c;
import f00.InterfaceC40194a;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DocumentUploadActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/document_upload/mvi/entity/DocumentUploadInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.mvi.DocumentUploadActor$process$1", f = "DocumentUploadActor.kt", i = {}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super DocumentUploadInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f199393q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f199394r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f199395s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40196c f199396t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40194a f199397u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, C40196c c40196c, InterfaceC40194a interfaceC40194a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f199395s = bVar;
        this.f199396t = c40196c;
        this.f199397u = interfaceC40194a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f199395s, this.f199396t, this.f199397u, continuation);
        aVar.f199394r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DocumentUploadInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f199393q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f199394r;
            com.avito.android.mortgage.document_upload.interactor.f fVar = this.f199395s.f199398a;
            C40196c c40196c = this.f199396t;
            Iterator<T> it = c40196c.f395542b.iterator();
            long jC2 = 0;
            while (it.hasNext()) {
                jC2 += ((C39479c) it.next()).f393606c;
            }
            List<RemoteValidFile> list = c40196c.f395543c;
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                jC2 += ((RemoteValidFile) it2.next()).c();
            }
            InterfaceC43160i interfaceC43160iB = fVar.b(list.size() + c40196c.f395542b.size(), jC2, c40196c.f395552l, c40196c.f395553m, c40196c.f395554n, c40196c.f395561u, ((InterfaceC40194a.C11119a) this.f199397u).f395523a);
            this.f199393q = 1;
            if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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
