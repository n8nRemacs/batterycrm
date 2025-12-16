package com.avito.android.verification.verification_fetch_invoice.mvi;

import OM0.b;
import Y41.p;
import androidx.core.os.C22777e;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.verification_fetch_invoice.mvi.entity.FetchInvoiceInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FetchInvoiceActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/verification/verification_fetch_invoice/mvi/entity/FetchInvoiceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.verification_fetch_invoice.mvi.FetchInvoiceActor$process$3", f = "FetchInvoiceActor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<InterfaceC43172j<? super FetchInvoiceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f325196q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f325197r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ OM0.b f325198s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f325199t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(OM0.b bVar, a aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f325198s = bVar;
        this.f325199t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f325198s, this.f325199t, continuation);
        dVar.f325197r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super FetchInvoiceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f325196q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f325197r;
            b.c cVar = (b.c) this.f325198s;
            ButtonItem buttonItem = cVar.f12208a;
            if (buttonItem.f323905f) {
                FetchInvoiceInternalAction.DoNothing doNothing = new FetchInvoiceInternalAction.DoNothing();
                this.f325196q = 1;
                if (interfaceC43172j.emit(doNothing, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                b.a.a(this.f325199t.f325190b, cVar.f12208a.f323903d, null, C22777e.b(new Q("string_id", buttonItem.f323901b)), 2);
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
