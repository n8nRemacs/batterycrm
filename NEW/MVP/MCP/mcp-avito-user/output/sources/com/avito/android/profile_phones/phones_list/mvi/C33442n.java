package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_phones/phones_list/mvi/entity/PhonesListMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$refreshPhones$1", f = "PhonesListMviActor.kt", i = {0, 1}, l = {246, 247, 249, 252}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.n, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33442n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PhonesListMviInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228059q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228060r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33433e f228061s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33442n(C33433e c33433e, Continuation<? super C33442n> continuation) {
        super(2, continuation);
        this.f228061s = c33433e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33442n c33442n = new C33442n(this.f228061s, continuation);
        c33442n.f228060r = obj;
        return c33442n;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PhonesListMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33442n) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f228059q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.C42729a0.b(r7)
            goto L90
        L22:
            java.lang.Object r1 = r6.f228060r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L5a
        L2a:
            r7 = move-exception
            goto L5f
        L2c:
            java.lang.Object r1 = r6.f228060r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L49
        L34:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f228060r
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NumbersFailedViewLoading r1 = com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction.NumbersFailedViewLoading.f227999b
            r6.f228060r = r7
            r6.f228059q = r5
            java.lang.Object r1 = r7.emit(r1, r6)
            if (r1 != r0) goto L48
            return r0
        L48:
            r1 = r7
        L49:
            com.avito.android.profile_phones.phones_list.mvi.e r7 = r6.f228061s
            com.avito.android.profile_phones.phones_list.mvi.G r7 = r7.f227964b
            int r5 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2a
            r6.f228060r = r1     // Catch: java.lang.Throwable -> L2a
            r6.f228059q = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r7.b(r6)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r0) goto L5a
            return r0
        L5a:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L2a
            int r4 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L2a
            goto L67
        L5f:
            int r4 = kotlin.Z.f406624c
            kotlin.Z$b r4 = new kotlin.Z$b
            r4.<init>(r7)
            r7 = r4
        L67:
            java.lang.Throwable r4 = kotlin.Z.b(r7)
            r5 = 0
            if (r4 != 0) goto L80
            java.util.List r7 = (java.util.List) r7
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NumbersContent r2 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NumbersContent
            r2.<init>(r7)
            r6.f228060r = r5
            r6.f228059q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto L90
            return r0
        L80:
            com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NumbersFailed r7 = new com.avito.android.profile_phones.phones_list.mvi.entity.PhonesListMviInternalAction$NumbersFailed
            r7.<init>(r4)
            r6.f228060r = r5
            r6.f228059q = r2
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L90
            return r0
        L90:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.C33442n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
