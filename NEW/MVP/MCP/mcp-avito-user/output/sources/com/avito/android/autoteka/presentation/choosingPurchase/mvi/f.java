package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.remote.model.TypedResult;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;

/* compiled from: AutotekaChoosingPurchaseBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.arch.mvi.b<AutotekaChoosingPurchaseInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.choosingProduct.a f97182a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ChoosingPurchaseDetails f97183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f97184c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final If.f f97185d;

    /* compiled from: AutotekaChoosingPurchaseBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.choosingPurchase.mvi.AutotekaChoosingPurchaseBootstrap$produce$1", f = "AutotekaChoosingPurchaseBootstrap.kt", i = {0}, l = {30, 33, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaChoosingPurchaseInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public If.f f97186q;

        /* renamed from: r, reason: collision with root package name */
        public int f97187r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f97188s;

        /* compiled from: AutotekaChoosingPurchaseBootstrap.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LCj0/g;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.autoteka.presentation.choosingPurchase.mvi.AutotekaChoosingPurchaseBootstrap$produce$1$1", f = "AutotekaChoosingPurchaseBootstrap.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.autoteka.presentation.choosingPurchase.mvi.f$a$a, reason: collision with other inner class name */
        public static final class C2899a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<Cj0.g>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f97190q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ f f97191r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2899a(f fVar, Continuation<? super C2899a> continuation) {
                super(1, continuation);
                this.f97191r = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                return new C2899a(this.f97191r, continuation);
            }

            @Override // Y41.l
            public final Object invoke(Continuation<? super TypedResult<Cj0.g>> continuation) {
                return ((C2899a) create(continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f97190q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    f fVar = this.f97191r;
                    com.avito.android.autoteka.data.choosingProduct.a aVar = fVar.f97182a;
                    ChoosingPurchaseDetails choosingPurchaseDetails = fVar.f97183b;
                    String searchKey = choosingPurchaseDetails.getSearchKey();
                    String autotekaX = choosingPurchaseDetails.getAutotekaX();
                    Long fromBlock = choosingPurchaseDetails.getFromBlock();
                    boolean isRepurchase = choosingPurchaseDetails.getIsRepurchase();
                    this.f97190q = 1;
                    obj = aVar.a(searchKey, true, autotekaX, fromBlock, isRepurchase, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f97188s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AutotekaChoosingPurchaseInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 279
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.choosingPurchase.mvi.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public f(@Y61.k com.avito.android.autoteka.data.choosingProduct.a aVar, @Y61.k ChoosingPurchaseDetails choosingPurchaseDetails, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k If.f fVar) {
        this.f97182a = aVar;
        this.f97183b = choosingPurchaseDetails;
        this.f97184c = aVar2;
        this.f97185d = fVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AutotekaChoosingPurchaseInternalAction> a() {
        return C43175k.N(new e(new d(y.a(this.f97184c.d9()))), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
