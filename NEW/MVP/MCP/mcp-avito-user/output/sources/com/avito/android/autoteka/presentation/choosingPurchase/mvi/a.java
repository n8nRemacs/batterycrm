package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import Hf.InterfaceC13983a;
import Hf.c;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import com.avito.android.autoteka.presentation.choosingPurchase.mvi.entity.AutotekaChoosingPurchaseInternalAction;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import zf.C50557a;

/* compiled from: AutotekaChoosingPurchaseActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/mvi/entity/AutotekaChoosingPurchaseInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.choosingPurchase.mvi.AutotekaChoosingPurchaseActor$process$1", f = "AutotekaChoosingPurchaseActor.kt", i = {2, 5, 5, 10, 16}, l = {33, 47, 49, 52, 50, 70, 73, 71, 88, 99, 111, 117, 128, 141, 139, 154, 162, 170}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "searchKey", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$3", "L$0", "L$0"})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AutotekaChoosingPurchaseInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f97119q;

    /* renamed from: r, reason: collision with root package name */
    public Hf.c f97120r;

    /* renamed from: s, reason: collision with root package name */
    public String f97121s;

    /* renamed from: t, reason: collision with root package name */
    public int f97122t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f97123u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13983a f97124v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Hf.c f97125w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.autoteka.presentation.choosingPurchase.mvi.b f97126x;

    /* compiled from: AutotekaChoosingPurchaseActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LCj0/g;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.choosingPurchase.mvi.AutotekaChoosingPurchaseActor$process$1$1", f = "AutotekaChoosingPurchaseActor.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.autoteka.presentation.choosingPurchase.mvi.a$a, reason: collision with other inner class name */
    public static final class C2896a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<Cj0.g>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97127q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.choosingPurchase.mvi.b f97128r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2896a(com.avito.android.autoteka.presentation.choosingPurchase.mvi.b bVar, Continuation<? super C2896a> continuation) {
            super(1, continuation);
            this.f97128r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new C2896a(this.f97128r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<Cj0.g>> continuation) {
            return ((C2896a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97127q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.autoteka.presentation.choosingPurchase.mvi.b bVar = this.f97128r;
                com.avito.android.autoteka.data.choosingProduct.a aVar = bVar.f97135c;
                ChoosingPurchaseDetails choosingPurchaseDetails = bVar.f97134b;
                String searchKey = choosingPurchaseDetails.getSearchKey();
                String autotekaX = choosingPurchaseDetails.getAutotekaX();
                Long fromBlock = choosingPurchaseDetails.getFromBlock();
                boolean isRepurchase = choosingPurchaseDetails.getIsRepurchase();
                this.f97127q = 1;
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

    /* compiled from: AutotekaChoosingPurchaseActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lzf/a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.autoteka.presentation.choosingPurchase.mvi.AutotekaChoosingPurchaseActor$process$1$2$1", f = "AutotekaChoosingPurchaseActor.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<C50557a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f97129q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.autoteka.presentation.choosingPurchase.mvi.b f97130r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f97131s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Hf.c f97132t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.autoteka.presentation.choosingPurchase.mvi.b bVar, String str, Hf.c cVar, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f97130r = bVar;
            this.f97131s = str;
            this.f97132t = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return new b(this.f97130r, this.f97131s, this.f97132t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<C50557a>> continuation) {
            return ((b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f97129q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.autoteka.presentation.choosingPurchase.mvi.b bVar = this.f97130r;
                com.avito.android.autoteka.data.i iVar = bVar.f97133a;
                String autotekaX = bVar.f97134b.getAutotekaX();
                String str = ((c.f) this.f97132t).f7597f.f96702h;
                this.f97129q = 1;
                obj = iVar.d(this.f97131s, autotekaX, str, this);
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC13983a interfaceC13983a, Hf.c cVar, com.avito.android.autoteka.presentation.choosingPurchase.mvi.b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97124v = interfaceC13983a;
        this.f97125w = cVar;
        this.f97126x = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f97124v, this.f97125w, this.f97126x, continuation);
        aVar.f97123u = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AutotekaChoosingPurchaseInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0280 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0338 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fe  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.autoteka.presentation.choosingPurchase.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
