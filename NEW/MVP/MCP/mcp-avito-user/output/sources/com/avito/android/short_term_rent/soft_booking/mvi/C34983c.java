package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ow0.InterfaceC44950a;
import pw0.C47159c;

/* compiled from: StrSoftBookingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleContactFieldChanged$1", f = "StrSoftBookingActor.kt", i = {}, l = {256}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34983c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282687q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34981a f282689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282690t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44950a.d f282691u;

    /* compiled from: StrSoftBookingActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lpw0/c;", "validatedContacts", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lpw0/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleContactFieldChanged$1$1", f = "StrSoftBookingActor.kt", i = {}, l = {260}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.c$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrSoftBookingInternalAction>, C47159c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282692q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f282693r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ C47159c f282694s;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, C47159c c47159c, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f282693r = interfaceC43172j;
            aVar.f282694s = c47159c;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282692q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f282693r;
                StrSoftBookingInternalAction.ContactFieldChanged contactFieldChanged = new StrSoftBookingInternalAction.ContactFieldChanged(this.f282694s);
                this.f282693r = null;
                this.f282692q = 1;
                if (interfaceC43172j.emit(contactFieldChanged, this) == coroutine_suspended) {
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

    /* compiled from: StrSoftBookingActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lpw0/c;", "validatedContacts", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lpw0/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleContactFieldChanged$1$2", f = "StrSoftBookingActor.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.c$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrSoftBookingInternalAction>, C47159c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282695q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f282696r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ C47159c f282697s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, C47159c c47159c, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f282696r = interfaceC43172j;
            bVar.f282697s = c47159c;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282695q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f282696r;
                StrSoftBookingInternalAction.ContactsFieldError contactsFieldError = new StrSoftBookingInternalAction.ContactsFieldError(this.f282697s);
                this.f282696r = null;
                this.f282695q = 1;
                if (interfaceC43172j.emit(contactsFieldError, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34983c(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, InterfaceC44950a.d dVar, Continuation<? super C34983c> continuation) {
        super(2, continuation);
        this.f282689s = c34981a;
        this.f282690t = aVar;
        this.f282691u = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34983c c34983c = new C34983c(this.f282689s, this.f282690t, this.f282691u, continuation);
        c34983c.f282688r = obj;
        return c34983c;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34983c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0127 A[PHI: r6
  0x0127: PHI (r6v5 pw0.b) = (r6v4 pw0.b), (r6v6 pw0.b) binds: [B:77:0x0132, B:71:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.C34983c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
