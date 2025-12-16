package com.avito.android.evidence_request.mvi.evidence_details;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.D6;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: EvidenceDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVisible", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsViewImpl$3", f = "EvidenceDetailsView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class f extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f148987q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f148988r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f148988r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        f fVar = new f(this.f148988r, continuation);
        fVar.f148987q = ((Boolean) obj).booleanValue();
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((f) create(bool2, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        boolean z12 = this.f148987q;
        g gVar = this.f148988r;
        boolean z13 = !z12;
        D6.G(gVar.f148995f, z13);
        if (gVar.f149000k) {
            D6.G(gVar.f148997h, z13);
        }
        return G0.f406611a;
    }
}
