package com.avito.android.confirm_documents_bottom_sheet.mvi;

import SK0.b;
import com.avito.android.confirm_documents_bottom_sheet.models.ConfirmDocumentsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wr.AbstractC49674b;
import xr.C49986a;

/* compiled from: ConfirmDocumentsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/confirm_documents_bottom_sheet/models/ConfirmDocumentsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.confirm_documents_bottom_sheet.mvi.ConfirmDocumentsActor$process$4", f = "ConfirmDocumentsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ConfirmDocumentsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AbstractC49674b f125610q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f125611r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AbstractC49674b abstractC49674b, e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f125610q = abstractC49674b;
        this.f125611r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f125610q, this.f125611r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ConfirmDocumentsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        AbstractC49674b abstractC49674b = this.f125610q;
        if ((abstractC49674b instanceof AbstractC49674b.a) && ((AbstractC49674b.a) abstractC49674b).f441818d) {
            b.a.a(this.f125611r.f125615d, new C49986a(), null, null, null, 14);
        }
        return G0.f406611a;
    }
}
