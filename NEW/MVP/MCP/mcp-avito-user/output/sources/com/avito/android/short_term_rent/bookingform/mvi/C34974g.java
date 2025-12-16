package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleInputTextChange$1", f = "BookingFormActor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {319, 321, 330, 347}, m = "invokeSuspend", n = {"$this$flow", "parameterId", "input", "updatedInput", "inputs", "$this$flow", "parameterId", "input", "updatedInput", "$this$flow", "parameterId", "input", "updatedInput"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34974g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f281869q;

    /* renamed from: r, reason: collision with root package name */
    public aw0.e f281870r;

    /* renamed from: s, reason: collision with root package name */
    public aw0.e f281871s;

    /* renamed from: t, reason: collision with root package name */
    public Map f281872t;

    /* renamed from: u, reason: collision with root package name */
    public int f281873u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f281874v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a.g f281875w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C39425b f281876x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C34968a f281877y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34974g(a.g gVar, C39425b c39425b, C34968a c34968a, Continuation<? super C34974g> continuation) {
        super(2, continuation);
        this.f281875w = gVar;
        this.f281876x = c39425b;
        this.f281877y = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34974g c34974g = new C34974g(this.f281875w, this.f281876x, this.f281877y, continuation);
        c34974g.f281874v = obj;
        return c34974g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34974g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.C34974g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
