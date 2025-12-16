package com.avito.android.comfortable_deal.deal.mvi;

import Ep.InterfaceC13517a;
import android.os.Parcelable;
import com.avito.android.comfortable_deal.comment.model.CommentResultStrategy;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.comfortable_deal.deal.mvi.DealActor$process$2", f = "DealActor.kt", i = {0, 2}, l = {130, 131, 135, 136, 140}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes12.dex */
final class k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super DealInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f121681q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f121682r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13517a f121683s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C29453a f121684t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ep.c f121685u;

    /* compiled from: DealActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CommentResultStrategy.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<CommentResultStrategy> creator = CommentResultStrategy.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<CommentResultStrategy> creator2 = CommentResultStrategy.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(InterfaceC13517a interfaceC13517a, Ep.c cVar, C29453a c29453a, Continuation continuation) {
        super(2, continuation);
        this.f121683s = interfaceC13517a;
        this.f121684t = c29453a;
        this.f121685u = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29453a c29453a = this.f121684t;
        k kVar = new k(this.f121683s, this.f121685u, c29453a, continuation);
        kVar.f121682r = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DealInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((k) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f121681q
            Ep.a r2 = r9.f121683s
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r1 == 0) goto L37
            if (r1 == r7) goto L2f
            if (r1 == r6) goto L1a
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L1f
        L1a:
            kotlin.C42729a0.b(r10)
            goto Lab
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            java.lang.Object r1 = r9.f121682r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L6c
        L2f:
            java.lang.Object r1 = r9.f121682r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L92
        L37:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f121682r
            r1 = r10
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            r10 = r2
            Ep.a$j r10 = (Ep.InterfaceC13517a.j) r10
            com.avito.android.comfortable_deal.comment.model.CommentResult r10 = r10.f4279a
            com.avito.android.comfortable_deal.comment.model.CommentResultStrategy r10 = r10.f120537b
            int r10 = r10.ordinal()
            if (r10 == 0) goto L82
            if (r10 == r7) goto L5f
            if (r10 == r6) goto L51
            goto Lab
        L51:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment r10 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment
            r10.<init>(r8)
            r9.f121681q = r3
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lab
            return r0
        L5f:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$ShowSaveCommentDialog r10 = com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction.ShowSaveCommentDialog.f121642b
            r9.f121682r = r1
            r9.f121681q = r5
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L6c
            return r0
        L6c:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment r10 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment
            Ep.a$j r2 = (Ep.InterfaceC13517a.j) r2
            com.avito.android.comfortable_deal.comment.model.CommentResult r2 = r2.f4279a
            java.lang.String r2 = r2.f120538c
            r10.<init>(r2)
            r9.f121682r = r8
            r9.f121681q = r4
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto Lab
            return r0
        L82:
            com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment r10 = new com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction$UpdateComment
            r10.<init>(r8)
            r9.f121682r = r1
            r9.f121681q = r7
            java.lang.Object r10 = r1.emit(r10, r9)
            if (r10 != r0) goto L92
            return r0
        L92:
            Ep.c r10 = r9.f121685u
            java.lang.String r2 = r10.f4325b
            if (r2 != 0) goto L9a
            java.lang.String r2 = ""
        L9a:
            Ep.d r10 = r10.f4331h
            com.avito.android.comfortable_deal.repository.model.CommentsFilter r10 = r10.f4339h
            r9.f121682r = r8
            r9.f121681q = r6
            com.avito.android.comfortable_deal.deal.mvi.a r3 = r9.f121684t
            java.lang.Object r10 = com.avito.android.comfortable_deal.deal.mvi.C29453a.c(r3, r1, r2, r10, r9)
            if (r10 != r0) goto Lab
            return r0
        Lab:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.comfortable_deal.deal.mvi.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
