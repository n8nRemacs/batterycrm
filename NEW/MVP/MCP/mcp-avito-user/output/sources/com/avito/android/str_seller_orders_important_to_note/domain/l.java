package com.avito.android.str_seller_orders_important_to_note.domain;

import Y41.p;
import Yz0.InterfaceC18351a;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.d1;
import com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams;
import com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction;
import com.avito.android.util.R0;
import com.yandex.metrica.YandexMetricaDefaultValues;
import java.io.Serializable;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: StrSellerImportantToNoteInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_seller_orders_important_to_note/domain/l;", "Lcom/avito/android/str_seller_orders_important_to_note/domain/k;", "_avito_str-seller-orders-important-to-note_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18351a f291335a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f291336b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final d1 f291337c;

    /* compiled from: StrSellerImportantToNoteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.domain.StrSellerImportantToNoteInteractorImpl$getSellersOrdersWithFilters$1", f = "StrSellerImportantToNoteInteractor.kt", i = {0, 1}, l = {40, 41, 45, 47, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerImportantToNoteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291338q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291339r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ ImportantToNoteOpenParams f291341t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ImportantToNoteOpenParams importantToNoteOpenParams, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f291341t = importantToNoteOpenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = l.this.new a(this.f291341t, continuation);
            aVar.f291339r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerImportantToNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x021a  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 594
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_important_to_note.domain.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrSellerImportantToNoteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.domain.StrSellerImportantToNoteInteractorImpl$makeGetRequest$1", f = "StrSellerImportantToNoteInteractor.kt", i = {0, 1}, l = {67, 68, 70, 73}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerImportantToNoteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291342q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291343r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f291345t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ ImportantToNoteOpenParams f291346u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ImportantToNoteOpenParams importantToNoteOpenParams, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f291345t = str;
            this.f291346u = importantToNoteOpenParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = l.this.new b(this.f291345t, this.f291346u, continuation);
            bVar.f291343r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerImportantToNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f291342q
                com.avito.android.str_seller_orders_important_to_note.domain.l r2 = com.avito.android.str_seller_orders_important_to_note.domain.l.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto La9
            L24:
                java.lang.Object r1 = r7.f291343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5b
            L2c:
                java.lang.Object r1 = r7.f291343r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f291343r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$Loading r1 = new com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$Loading
                r1.<init>()
                r7.f291343r = r8
                r7.f291342q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.remote.d1 r8 = r2.f291337c
                r7.f291343r = r1
                r7.f291342q = r5
                java.lang.String r5 = r7.f291345t
                java.lang.Object r8 = r8.i(r5, r7)
                if (r8 != r0) goto L5b
                return r0
            L5b:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7b
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                Ux0.b r8 = (Ux0.b) r8
                com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams r8 = r7.f291346u
                kotlinx.coroutines.flow.i r8 = r2.a(r8)
                r7.f291343r = r6
                r7.f291342q = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto La9
                return r0
            L7b:
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lac
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r4 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r4, r8)
                com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$ShowError r4 = new com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$ShowError
                java.lang.String r5 = com.avito.android.error.z.l(r8)
                com.avito.android.printable_text.PrintableText r2 = com.avito.android.str_seller_orders_important_to_note.domain.l.d(r2, r5)
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r4.<init>(r2, r8)
                r7.f291343r = r6
                r7.f291342q = r3
                java.lang.Object r8 = r1.emit(r4, r7)
                if (r8 != r0) goto La9
                return r0
            La9:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lac:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_important_to_note.domain.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: StrSellerImportantToNoteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/str_seller_orders_important_to_note/mvi/entity/StrSellerImportantToNoteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_seller_orders_important_to_note.domain.StrSellerImportantToNoteInteractorImpl$makePostRequest$1", f = "StrSellerImportantToNoteInteractor.kt", i = {0, 1}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS, 91, 96, 99}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super StrSellerImportantToNoteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291347q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291348r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f291350t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Object f291351u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ ImportantToNoteOpenParams f291352v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Map<String, String> map, ImportantToNoteOpenParams importantToNoteOpenParams, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f291350t = str;
            this.f291351u = map;
            this.f291352v = importantToNoteOpenParams;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = l.this.new c(this.f291350t, this.f291351u, this.f291352v, continuation);
            cVar.f291348r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StrSellerImportantToNoteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f291347q
                com.avito.android.str_seller_orders_important_to_note.domain.l r2 = com.avito.android.str_seller_orders_important_to_note.domain.l.this
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L34
                if (r1 == r6) goto L2c
                if (r1 == r5) goto L24
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                goto L1f
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.C42729a0.b(r8)
                goto Lab
            L24:
                java.lang.Object r1 = r7.f291348r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L5d
            L2c:
                java.lang.Object r1 = r7.f291348r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L4c
            L34:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f291348r
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$Loading r1 = new com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$Loading
                r1.<init>()
                r7.f291348r = r8
                r7.f291347q = r6
                java.lang.Object r1 = r8.emit(r1, r7)
                if (r1 != r0) goto L4b
                return r0
            L4b:
                r1 = r8
            L4c:
                com.avito.android.remote.d1 r8 = r2.f291337c
                r7.f291348r = r1
                r7.f291347q = r5
                java.lang.Object r5 = r7.f291351u
                java.lang.String r6 = r7.f291350t
                java.lang.Object r8 = r8.n(r6, r5, r7)
                if (r8 != r0) goto L5d
                return r0
            L5d:
                com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
                boolean r5 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L7d
                com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
                java.lang.Object r8 = r8.getResult()
                Ux0.b r8 = (Ux0.b) r8
                com.avito.android.str_seller_orders_important_to_note.ImportantToNoteOpenParams r8 = r7.f291352v
                kotlinx.coroutines.flow.i r8 = r2.a(r8)
                r7.f291348r = r6
                r7.f291347q = r4
                java.lang.Object r8 = kotlinx.coroutines.flow.C43175k.u(r7, r8, r1)
                if (r8 != r0) goto Lab
                return r0
            L7d:
                boolean r4 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lae
                com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
                com.avito.android.remote.error.ApiError r4 = r8.getError()
                java.lang.Throwable r8 = r8.getCause()
                com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r4, r8)
                com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$ShowError r4 = new com.avito.android.str_seller_orders_important_to_note.mvi.entity.StrSellerImportantToNoteInternalAction$ShowError
                java.lang.String r5 = com.avito.android.error.z.l(r8)
                com.avito.android.printable_text.PrintableText r2 = com.avito.android.str_seller_orders_important_to_note.domain.l.d(r2, r5)
                com.avito.android.remote.error.ApiError r8 = com.avito.android.error.z.n(r8)
                r4.<init>(r2, r8)
                r7.f291348r = r6
                r7.f291347q = r3
                java.lang.Object r8 = r1.emit(r4, r7)
                if (r8 != r0) goto Lab
                return r0
            Lab:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            Lae:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_seller_orders_important_to_note.domain.l.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public l(@Y61.k InterfaceC18351a interfaceC18351a, @Y61.k R0 r02, @Y61.k d1 d1Var) {
        this.f291335a = interfaceC18351a;
        this.f291336b = r02;
        this.f291337c = d1Var;
    }

    public static final PrintableText d(l lVar, String str) {
        lVar.getClass();
        return str.length() == 0 ? com.avito.android.printable_text.b.c(R.string.str_seller_orders_important_to_note_unknown_error, new Serializable[0]) : com.avito.android.printable_text.b.f(str);
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.domain.k
    @Y61.k
    public final InterfaceC43160i<StrSellerImportantToNoteInternalAction> a(@Y61.k ImportantToNoteOpenParams importantToNoteOpenParams) {
        return C43175k.I(this.f291336b.a(), C43175k.G(new a(importantToNoteOpenParams, null)));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.domain.k
    @Y61.k
    public final InterfaceC43160i<StrSellerImportantToNoteInternalAction> b(@Y61.k String str, @Y61.k Map<String, String> map, @Y61.k ImportantToNoteOpenParams importantToNoteOpenParams) {
        return C43175k.I(this.f291336b.a(), C43175k.G(new c(str, map, importantToNoteOpenParams, null)));
    }

    @Override // com.avito.android.str_seller_orders_important_to_note.domain.k
    @Y61.k
    public final InterfaceC43160i<StrSellerImportantToNoteInternalAction> c(@Y61.k String str, @Y61.k ImportantToNoteOpenParams importantToNoteOpenParams) {
        return C43175k.I(this.f291336b.a(), C43175k.G(new b(str, importantToNoteOpenParams, null)));
    }
}
