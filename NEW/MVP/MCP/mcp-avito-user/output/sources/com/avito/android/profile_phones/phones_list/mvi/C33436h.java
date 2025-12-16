package com.avito.android.profile_phones.phones_list.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PhonesListMviActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_phones.phones_list.mvi.PhonesListMviActor$loadPhonesAndIac$1", f = "PhonesListMviActor.kt", i = {0, 1, 2, 2}, l = {204, 205, 209, 211, 214}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "iacData"}, s = {"L$0", "L$0", "L$0", "L$1"})
/* renamed from: com.avito.android.profile_phones.phones_list.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33436h extends SuspendLambda implements Y41.p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C33432d f228041q;

    /* renamed from: r, reason: collision with root package name */
    public int f228042r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f228043s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33433e f228044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33436h(C33433e c33433e, Continuation<? super C33436h> continuation) {
        super(2, continuation);
        this.f228044t = c33433e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33436h c33436h = new C33436h(this.f228044t, continuation);
        c33436h.f228043s = obj;
        return c33436h;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33436h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:64)|(1:(1:(1:(1:(3:12|58|59)(2:10|11))(8:13|60|14|44|50|(2:52|(1:54))(2:55|(1:57))|58|59))(9:18|19|32|35|(1:37)(1:38)|39|62|40|(1:42)(6:43|44|50|(0)(0)|58|59)))(1:23))(2:24|(1:26)(1:27))|28|29|(1:31)|32|35|(0)(0)|39|62|40|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        r8 = r1;
        r1 = r10;
        r10 = r4;
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a7, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.mvi.C33436h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
