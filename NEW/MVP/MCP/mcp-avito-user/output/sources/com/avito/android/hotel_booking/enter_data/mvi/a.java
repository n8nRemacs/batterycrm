package com.avito.android.hotel_booking.enter_data.mvi;

import com.avito.android.hotel_booking.Group;
import com.avito.android.hotel_booking.Input;
import com.avito.android.hotel_booking.enter_data.mvi.entity.EnterDataInternalAction;
import java.util.Collection;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EnterDataActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.mvi.EnterDataActor$onApplyClick$1", f = "EnterDataActor.kt", i = {1, 1, 1, 1}, l = {45, 52, 69, 71}, m = "invokeSuspend", n = {"$this$flow", "destination$iv$iv", "destination$iv$iv", "input"}, s = {"L$0", "L$3", "L$6", "L$8"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super EnterDataInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public int f163542A;

    /* renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f163543B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ QI.c f163544C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ c f163545D;

    /* renamed from: q, reason: collision with root package name */
    public c f163546q;

    /* renamed from: r, reason: collision with root package name */
    public QI.c f163547r;

    /* renamed from: s, reason: collision with root package name */
    public Collection f163548s;

    /* renamed from: t, reason: collision with root package name */
    public Iterator f163549t;

    /* renamed from: u, reason: collision with root package name */
    public Group f163550u;

    /* renamed from: v, reason: collision with root package name */
    public Collection f163551v;

    /* renamed from: w, reason: collision with root package name */
    public Iterator f163552w;

    /* renamed from: x, reason: collision with root package name */
    public Input f163553x;

    /* renamed from: y, reason: collision with root package name */
    public Collection f163554y;

    /* renamed from: z, reason: collision with root package name */
    public Collection f163555z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(QI.c cVar, c cVar2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f163544C = cVar;
        this.f163545D = cVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f163544C, this.f163545D, continuation);
        aVar.f163543B = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super EnterDataInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bb A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0090 -> B:27:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00dd -> B:33:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011a -> B:46:0x011e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.hotel_booking.enter_data.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
