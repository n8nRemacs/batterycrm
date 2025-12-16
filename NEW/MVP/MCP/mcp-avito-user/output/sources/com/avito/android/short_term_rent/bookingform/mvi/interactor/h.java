package com.avito.android.short_term_rent.bookingform.mvi.interactor;

import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormApiInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.interactor.BookingFormApiInteractorImpl$requestFormContent$1", f = "BookingFormApiInteractor.kt", i = {0}, l = {94, 125, 132, 143, 160, 170}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281897q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281898r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C24186b f281899s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f281900t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f281901u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f281902v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C24186b c24186b, i iVar, boolean z12, boolean z13, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f281899s = c24186b;
        this.f281900t = iVar;
        this.f281901u = z12;
        this.f281902v = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f281899s, this.f281900t, this.f281901u, this.f281902v, continuation);
        hVar.f281898r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v65, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v97, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 2540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.interactor.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
