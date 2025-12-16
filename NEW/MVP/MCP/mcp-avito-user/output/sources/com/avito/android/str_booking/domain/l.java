package com.avito.android.str_booking.domain;

import Y41.p;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrBookingInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$onSuccess$1", f = "StrBookingInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {120, 131, 166, 172}, m = "invokeSuspend", n = {"$this$flow", "headerItems", "mainItems", "onboardings", "isEventBusUpdateEnabled", "$this$flow", "headerItems", "mainItems", "onboardings", "isEventBusUpdateEnabled", "$this$flow", "headerItems", "mainItems", "isEventBusUpdateEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes4.dex */
final class l extends SuspendLambda implements p<InterfaceC43172j<? super StrBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public List f285671q;

    /* renamed from: r, reason: collision with root package name */
    public List f285672r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f285673s;

    /* renamed from: t, reason: collision with root package name */
    public int f285674t;

    /* renamed from: u, reason: collision with root package name */
    public int f285675u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f285676v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f285677w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Ux0.c f285678x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, Ux0.c cVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f285677w = gVar;
        this.f285678x = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f285677w, this.f285678x, continuation);
        lVar.f285676v = obj;
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((l) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
