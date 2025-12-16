package com.avito.android.wallet.page.topup.form.mvi.component;

import bP0.C25543d;
import bP0.InterfaceC25540a;
import com.avito.android.wallet.page.topup.form.mvi.entity.TopUpFormInternalAction;
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

/* compiled from: TopUpFormActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/wallet/page/topup/form/mvi/component/a;", "Lkotlinx/coroutines/flow/i;", "LbP0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$2", f = "TopUpFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements Y41.p<Q<? extends com.avito.android.wallet.page.topup.form.mvi.component.a, ? extends InterfaceC43160i<? extends InterfaceC25540a>>, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f328379q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.page.topup.form.mvi.component.b f328380r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C25543d> f328381s;

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbP0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "<anonymous>", "(LbP0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$2$1", f = "TopUpFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f328382q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.topup.form.mvi.component.b f328383r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C25543d> f328384s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.wallet.page.topup.form.mvi.component.b bVar, Y41.a<C25543d> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f328383r = bVar;
            this.f328384s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f328383r, this.f328384s, continuation);
            aVar.f328382q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC25540a interfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>> continuation) {
            return ((a) create(interfaceC25540a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f328383r.b((InterfaceC25540a) this.f328382q, this.f328384s.invoke());
        }
    }

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbP0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "<anonymous>", "(LbP0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$2$2", f = "TopUpFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f328385q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.topup.form.mvi.component.b f328386r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C25543d> f328387s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.wallet.page.topup.form.mvi.component.b bVar, Y41.a<C25543d> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f328386r = bVar;
            this.f328387s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f328386r, this.f328387s, continuation);
            bVar.f328385q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC25540a interfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>> continuation) {
            return ((b) create(interfaceC25540a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f328386r.b((InterfaceC25540a) this.f328385q, this.f328387s.invoke());
        }
    }

    /* compiled from: TopUpFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LbP0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/wallet/page/topup/form/mvi/entity/TopUpFormInternalAction;", "<anonymous>", "(LbP0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.page.topup.form.mvi.component.TopUpFormActor$process$2$3", f = "TopUpFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f328388q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.page.topup.form.mvi.component.b f328389r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C25543d> f328390s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.wallet.page.topup.form.mvi.component.b bVar, Y41.a<C25543d> aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f328389r = bVar;
            this.f328390s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f328389r, this.f328390s, continuation);
            cVar.f328388q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC25540a interfaceC25540a, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>> continuation) {
            return ((c) create(interfaceC25540a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f328389r.b((InterfaceC25540a) this.f328388q, this.f328390s.invoke());
        }
    }

    /* compiled from: TopUpFormActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet.page.topup.form.mvi.component.d$d, reason: collision with other inner class name */
    public /* synthetic */ class C10186d {
        static {
            int[] iArr = new int[com.avito.android.wallet.page.topup.form.mvi.component.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                com.avito.android.wallet.page.topup.form.mvi.component.a aVar = com.avito.android.wallet.page.topup.form.mvi.component.a.f328355b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                com.avito.android.wallet.page.topup.form.mvi.component.a aVar2 = com.avito.android.wallet.page.topup.form.mvi.component.a.f328355b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.wallet.page.topup.form.mvi.component.b bVar, Y41.a<C25543d> aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f328380r = bVar;
        this.f328381s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f328380r, this.f328381s, continuation);
        dVar.f328379q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends com.avito.android.wallet.page.topup.form.mvi.component.a, ? extends InterfaceC43160i<? extends InterfaceC25540a>> q12, Continuation<? super InterfaceC43160i<? extends TopUpFormInternalAction>> continuation) {
        return ((d) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f328379q;
        com.avito.android.wallet.page.topup.form.mvi.component.a aVar = (com.avito.android.wallet.page.topup.form.mvi.component.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        int iOrdinal = aVar.ordinal();
        Y41.a<C25543d> aVar2 = this.f328381s;
        com.avito.android.wallet.page.topup.form.mvi.component.b bVar = this.f328380r;
        if (iOrdinal == 0) {
            return C43175k.C(new a(bVar, aVar2, null), com.avito.android.arch.mvi.utils.h.d(interfaceC43160i, 300L));
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return C43175k.C(new c(bVar, aVar2, null), interfaceC43160i);
            }
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.I(bVar.f328363c.c(), C43175k.n(C43175k.C(new b(bVar, aVar2, null), C43175k.r(interfaceC43160i)), 350L));
    }
}
