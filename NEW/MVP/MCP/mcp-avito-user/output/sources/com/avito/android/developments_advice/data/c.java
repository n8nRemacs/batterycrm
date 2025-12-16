package com.avito.android.developments_advice.data;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.developments_advice.mvi.entity.DevelopmentsAdviceInternalAction;
import com.avito.android.developments_advice.remote.model.CallInterval;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ConsultationFormInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_advice.data.ConsultationFormInteractorImpl$requestConsultation$2", f = "ConsultationFormInteractor.kt", i = {0}, l = {84, 109, 112, 114, 119, 123, 137}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes12.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super DevelopmentsAdviceInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f135975A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ String f135976B;

    /* renamed from: q, reason: collision with root package name */
    public int f135977q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f135978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f135979s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f135980t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f135981u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f135982v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f135983w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f135984x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CallInterval f135985y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f135986z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, String str3, String str4, String str5, CallInterval callInterval, String str6, String str7, String str8, Continuation continuation) {
        super(2, continuation);
        this.f135979s = dVar;
        this.f135980t = str;
        this.f135981u = str2;
        this.f135982v = str3;
        this.f135983w = str4;
        this.f135984x = str5;
        this.f135985y = callInterval;
        this.f135986z = str6;
        this.f135975A = str7;
        this.f135976B = str8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f135979s, this.f135980t, this.f135981u, this.f135982v, this.f135983w, this.f135984x, this.f135985y, this.f135986z, this.f135975A, this.f135976B, continuation);
        cVar.f135978r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super DevelopmentsAdviceInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.developments_advice.data.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
