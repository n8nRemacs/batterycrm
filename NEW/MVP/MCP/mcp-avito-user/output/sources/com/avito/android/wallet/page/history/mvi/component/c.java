package com.avito.android.wallet.page.history.mvi.component;

import com.avito.android.wallet.page.history.mvi.component.a;
import com.avito.android.wallet.page.history.mvi.entity.PaymentHistoryInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PaymentHistoryActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/wallet/page/history/mvi/component/a$a;", "Lkotlinx/coroutines/flow/i;", "LVO0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.page.history.mvi.component.PaymentHistoryActor$process$2", f = "PaymentHistoryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements Y41.p<Q<? extends a.EnumC10172a, ? extends InterfaceC43160i<? extends VO0.a>>, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f328009q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.page.history.mvi.component.a f328010r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<VO0.d> f328011s;

    /* compiled from: PaymentHistoryActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LVO0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<anonymous>", "(LVO0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.history.mvi.component.PaymentHistoryActor$process$2$1", f = "PaymentHistoryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<VO0.a, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f328012q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.history.mvi.component.a f328013r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<VO0.d> f328014s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.wallet.page.history.mvi.component.a aVar, Y41.a<VO0.d> aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f328013r = aVar;
            this.f328014s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f328013r, this.f328014s, continuation);
            aVar.f328012q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(VO0.a aVar, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            VO0.a aVar = (VO0.a) this.f328012q;
            VO0.d dVarInvoke = this.f328014s.invoke();
            com.avito.android.wallet.page.history.mvi.component.a aVar2 = this.f328013r;
            aVar2.getClass();
            return C43175k.G(new d(aVar, aVar2, dVarInvoke, null));
        }
    }

    /* compiled from: PaymentHistoryActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LVO0/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/history/mvi/entity/PaymentHistoryInternalAction;", "<anonymous>", "(LVO0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.history.mvi.component.PaymentHistoryActor$process$2$2", f = "PaymentHistoryActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<VO0.a, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f328015q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.history.mvi.component.a f328016r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<VO0.d> f328017s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.wallet.page.history.mvi.component.a aVar, Y41.a<VO0.d> aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f328016r = aVar;
            this.f328017s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f328016r, this.f328017s, continuation);
            bVar.f328015q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(VO0.a aVar, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            VO0.a aVar = (VO0.a) this.f328015q;
            VO0.d dVarInvoke = this.f328017s.invoke();
            com.avito.android.wallet.page.history.mvi.component.a aVar2 = this.f328016r;
            aVar2.getClass();
            return C43175k.G(new d(aVar, aVar2, dVarInvoke, null));
        }
    }

    /* compiled from: PaymentHistoryActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.history.mvi.component.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C10173c {
        static {
            int[] iArr = new int[a.EnumC10172a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a.EnumC10172a enumC10172a = a.EnumC10172a.f328004b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.avito.android.wallet.page.history.mvi.component.a aVar, Y41.a<VO0.d> aVar2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f328010r = aVar;
        this.f328011s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f328010r, this.f328011s, continuation);
        cVar.f328009q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.EnumC10172a, ? extends InterfaceC43160i<? extends VO0.a>> q12, Continuation<? super InterfaceC43160i<? extends PaymentHistoryInternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f328009q;
        a.EnumC10172a enumC10172a = (a.EnumC10172a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        int iOrdinal = enumC10172a.ordinal();
        Y41.a<VO0.d> aVar = this.f328011s;
        com.avito.android.wallet.page.history.mvi.component.a aVar2 = this.f328010r;
        if (iOrdinal == 0) {
            return C43175k.C(new a(aVar2, aVar, null), com.avito.android.arch.mvi.utils.h.d(interfaceC43160i, 300L));
        }
        if (iOrdinal == 1) {
            return C43175k.C(new b(aVar2, aVar, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
