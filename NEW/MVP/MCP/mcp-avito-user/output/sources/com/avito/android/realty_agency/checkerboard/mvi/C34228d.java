package com.avito.android.realty_agency.checkerboard.mvi;

import Zh0.C19563e;
import Zh0.InterfaceC19561c;
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

/* compiled from: CheckerboardActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$3", f = "CheckerboardActor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.realty_agency.checkerboard.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C34228d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251242q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251243r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34225a f251244s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C19563e f251245t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34228d(C19563e c19563e, C34225a c34225a, Continuation continuation) {
        super(2, continuation);
        this.f251244s = c34225a;
        this.f251245t = c19563e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34228d c34228d = new C34228d(this.f251245t, this.f251244s, continuation);
        c34228d.f251243r = obj;
        return c34228d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34228d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251242q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251243r;
            y yVar = this.f251244s.f251227a;
            C19563e c19563e = this.f251245t;
            InterfaceC43160i<InterfaceC19561c> interfaceC43160iA = yVar.a(c19563e.f20462e, 1L, c19563e.f20466i, c19563e.f20465h, c19563e.f20459b);
            this.f251242q = 1;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
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
