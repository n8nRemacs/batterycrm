package com.avito.android.short_term_rent.soft_booking.mvi;

import Xv0.InterfaceC17053a;
import com.avito.android.short_term_rent.soft_booking.entity.StrSoftBookingContactFieldType;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import pw0.C47158b;
import pw0.C47159c;

/* compiled from: StrSoftBookingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleApplyBookingClick$1", f = "StrSoftBookingActor.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34982b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282674q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282675r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34981a f282676s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282677t;

    /* compiled from: StrSoftBookingActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lpw0/c;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lpw0/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleApplyBookingClick$1$1", f = "StrSoftBookingActor.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.b$a */
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrSoftBookingInternalAction>, C47159c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282678q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f282679r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C34981a f282680s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282681t;

        /* compiled from: StrSoftBookingActor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "orderId", "promoCode", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C8447a extends N implements Y41.p<String, String, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ C34981a f282682l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C8447a(C34981a c34981a) {
                super(2);
                this.f282682l = c34981a;
            }

            @Override // Y41.p
            public final G0 invoke(String str, String str2) {
                this.f282682l.f282673d.i(str, str2);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f282680s = c34981a;
            this.f282681t = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, C47159c c47159c, Continuation<? super G0> continuation) {
            a aVar = new a(this.f282680s, this.f282681t, continuation);
            aVar.f282679r = interfaceC43172j;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282678q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f282679r;
                C34981a c34981a = this.f282680s;
                InterfaceC17053a interfaceC17053a = c34981a.f282673d;
                com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282681t;
                interfaceC17053a.d(aVar.f282801j);
                X xA2 = c34981a.f282671b.a(aVar, new C8447a(c34981a));
                this.f282678q = 1;
                if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleApplyBookingClick$1$2", f = "StrSoftBookingActor.kt", i = {0, 0}, l = {382, 384}, m = "invokeSuspend", n = {"$this$invoke", "validatedContacts"}, s = {"L$0", "L$1"})
    /* renamed from: com.avito.android.short_term_rent.soft_booking.mvi.b$b, reason: collision with other inner class name */
    public static final class C8448b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StrSoftBookingInternalAction>, C47159c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f282683q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f282684r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ C47159c f282685s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C34981a f282686t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8448b(C34981a c34981a, Continuation<? super C8448b> continuation) {
            super(3, continuation);
            this.f282686t = c34981a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, C47159c c47159c, Continuation<? super G0> continuation) {
            C8448b c8448b = new C8448b(this.f282686t, continuation);
            c8448b.f282684r = interfaceC43172j;
            c8448b.f282685s = c47159c;
            return c8448b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            C47159c c47159c;
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f282683q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j2 = this.f282684r;
                c47159c = this.f282685s;
                StrSoftBookingInternalAction.ContactsFieldError contactsFieldError = new StrSoftBookingInternalAction.ContactsFieldError(c47159c);
                this.f282684r = interfaceC43172j2;
                this.f282685s = c47159c;
                this.f282683q = 1;
                if (interfaceC43172j2.emit(contactsFieldError, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                interfaceC43172j = interfaceC43172j2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                c47159c = this.f282685s;
                interfaceC43172j = this.f282684r;
                C42729a0.b(obj);
            }
            this.f282686t.getClass();
            C47158b c47158b = c47159c.f428859a;
            if ((c47158b != null ? c47158b.f428858d : null) == null) {
                c47158b = c47159c.f428860b;
                if ((c47158b != null ? c47158b.f428858d : null) == null) {
                    c47158b = c47159c.f428861c;
                    if ((c47158b != null ? c47158b.f428858d : null) == null) {
                        c47158b = null;
                    }
                }
            }
            StrSoftBookingContactFieldType strSoftBookingContactFieldType = c47158b != null ? c47158b.f428857c : null;
            if (strSoftBookingContactFieldType != null) {
                StrSoftBookingInternalAction.Scroll scroll = new StrSoftBookingInternalAction.Scroll(strSoftBookingContactFieldType);
                this.f282684r = null;
                this.f282685s = null;
                this.f282683q = 2;
                if (interfaceC43172j.emit(scroll, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34982b(C34981a c34981a, com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, Continuation<? super C34982b> continuation) {
        super(2, continuation);
        this.f282676s = c34981a;
        this.f282677t = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34982b c34982b = new C34982b(this.f282676s, this.f282677t, continuation);
        c34982b.f282675r = obj;
        return c34982b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34982b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.soft_booking.mvi.C34982b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
