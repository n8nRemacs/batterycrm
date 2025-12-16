package com.avito.android.campaigns_sale_search.network;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments;
import com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction;
import com.avito.android.campaigns_sale_search.mvi.entity.Filter;
import com.avito.android.component.toast.f;
import com.avito.android.error.z;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.R0;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import om.InterfaceC44818a;

/* compiled from: CampaignsSaleSearchInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/campaigns_sale_search/network/b;", "Lcom/avito/android/campaigns_sale_search/network/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.campaigns_sale_search.network.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC44818a> f114800a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f114801b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CampaignsSaleSearchArguments f114802c;

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$addItemToSale$1", f = "CampaignsSaleSearchInteractor.kt", i = {0, 1, 2}, l = {114, 116, 118, 125, 132}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114803q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114804r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f114806t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f114807u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, int i12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f114806t = str;
            this.f114807u = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f114806t, this.f114807u, continuation);
            aVar.f114804r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f114803q
                r2 = 0
                java.lang.String r3 = r10.f114806t
                r4 = 5
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                com.avito.android.campaigns_sale_search.network.b r9 = com.avito.android.campaigns_sale_search.network.b.this
                if (r1 == 0) goto L42
                if (r1 == r8) goto L3a
                if (r1 == r7) goto L32
                if (r1 == r6) goto L2a
                if (r1 == r5) goto L25
                if (r1 != r4) goto L1d
                goto L25
            L1d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L25:
                kotlin.C42729a0.b(r11)
                goto Ld9
            L2a:
                java.lang.Object r1 = r10.f114804r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L9c
            L32:
                java.lang.Object r1 = r10.f114804r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L70
            L3a:
                java.lang.Object r1 = r10.f114804r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L57
            L42:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f114804r
                r1 = r11
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowLoadingBottomsheetButton r11 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.ShowLoadingBottomsheetButton.f114739b
                r10.f114804r = r1
                r10.f114803q = r8
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L57
                return r0
            L57:
                h31.e<om.a> r11 = r9.f114800a
                java.lang.Object r11 = r11.get()
                om.a r11 = (om.InterfaceC44818a) r11
                com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments r8 = r9.f114802c
                java.lang.String r8 = r8.f114633b
                r10.f114804r = r1
                r10.f114803q = r7
                int r7 = r10.f114807u
                java.lang.Object r11 = r11.f(r8, r3, r7, r10)
                if (r11 != r0) goto L70
                return r0
            L70:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r7 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto Lb3
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ItemAddedToSale r4 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ItemAddedToSale
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r7 = r11.getResult()
                com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult r7 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult) r7
                com.avito.android.remote.model.text.AttributedText r7 = r7.getPrice()
                java.lang.Object r11 = r11.getResult()
                com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult r11 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult) r11
                com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard r11 = r11.getBonuses()
                r4.<init>(r3, r7, r11)
                r10.f114804r = r1
                r10.f114803q = r6
                java.lang.Object r11 = r1.emit(r4, r10)
                if (r11 != r0) goto L9c
                return r0
            L9c:
                r11 = 0
                java.io.Serializable[] r11 = new java.io.Serializable[r11]
                r3 = 2131952641(0x7f130401, float:1.954173E38)
                com.avito.android.printable_text.PrintableText r11 = com.avito.android.printable_text.b.c(r3, r11)
                com.avito.android.component.toast.f$a r3 = com.avito.android.component.toast.f.a.f125253a
                r10.f114804r = r2
                r10.f114803q = r5
                java.lang.Object r11 = com.avito.android.campaigns_sale_search.network.b.e(r9, r1, r11, r3, r10)
                if (r11 != r0) goto Ld9
                return r0
            Lb3:
                boolean r3 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Ld9
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r3 = r11.getError()
                java.lang.String r3 = r3.toString()
                com.avito.android.printable_text.PrintableText r3 = com.avito.android.printable_text.b.f(r3)
                com.avito.android.component.toast.f$c r5 = new com.avito.android.component.toast.f$c
                com.avito.android.remote.error.ApiError r11 = r11.getError()
                r5.<init>(r11)
                r10.f114804r = r2
                r10.f114803q = r4
                java.lang.Object r11 = com.avito.android.campaigns_sale_search.network.b.e(r9, r1, r3, r5, r10)
                if (r11 != r0) goto Ld9
                return r0
            Ld9:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.network.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$addItemToSale$2", f = "CampaignsSaleSearchInteractor.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.campaigns_sale_search.network.b$b, reason: collision with other inner class name */
    public static final class C3350b extends SuspendLambda implements q<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114808q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114809r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114810s;

        public C3350b(Continuation<? super C3350b> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C3350b c3350b = b.this.new C3350b(continuation);
            c3350b.f114809r = interfaceC43172j;
            c3350b.f114810s = th2;
            return c3350b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114808q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114809r;
                Throwable th2 = this.f114810s;
                PrintableText printableTextF = com.avito.android.printable_text.b.f(z.n(th2).toString());
                f.c cVar = new f.c(z.n(th2));
                this.f114809r = null;
                this.f114808q = 1;
                if (b.e(b.this, interfaceC43172j, printableTextF, cVar, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$deleteItemFromSale$1", f = "CampaignsSaleSearchInteractor.kt", i = {0, 1}, l = {148, 150, 157, 166}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114812q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114813r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f114815t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f114815t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f114815t, continuation);
            cVar.f114813r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00a3 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.f114812q
                r2 = 0
                java.lang.String r3 = r13.f114815t
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                if (r1 == 0) goto L35
                if (r1 == r7) goto L2d
                if (r1 == r6) goto L25
                if (r1 == r5) goto L20
                if (r1 != r4) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L20:
                kotlin.C42729a0.b(r14)
                goto Ld3
            L25:
                java.lang.Object r1 = r13.f114813r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L84
            L2d:
                java.lang.Object r1 = r13.f114813r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r14)
                goto L58
            L35:
                kotlin.C42729a0.b(r14)
                java.lang.Object r14 = r13.f114813r
                kotlinx.coroutines.flow.j r14 = (kotlinx.coroutines.flow.InterfaceC43172j) r14
                com.avito.android.campaigns_sale_search.network.b r1 = com.avito.android.campaigns_sale_search.network.b.this
                h31.e<om.a> r8 = r1.f114800a
                java.lang.Object r8 = r8.get()
                om.a r8 = (om.InterfaceC44818a) r8
                com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments r1 = r1.f114802c
                java.lang.String r1 = r1.f114633b
                r13.f114813r = r14
                r13.f114812q = r7
                java.lang.Object r1 = r8.d(r1, r3, r13)
                if (r1 != r0) goto L55
                return r0
            L55:
                r12 = r1
                r1 = r14
                r14 = r12
            L58:
                com.avito.android.remote.model.TypedResult r14 = (com.avito.android.remote.model.TypedResult) r14
                boolean r7 = r14 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto La4
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ItemDeletedFromSale r4 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ItemDeletedFromSale
                com.avito.android.remote.model.TypedResult$Success r14 = (com.avito.android.remote.model.TypedResult.Success) r14
                java.lang.Object r7 = r14.getResult()
                com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult r7 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult) r7
                com.avito.android.remote.model.text.AttributedText r7 = r7.getPrice()
                java.lang.Object r14 = r14.getResult()
                com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult r14 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchAddRemoveResult) r14
                com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard r14 = r14.getBonuses()
                r4.<init>(r3, r7, r14)
                r13.f114813r = r1
                r13.f114812q = r6
                java.lang.Object r14 = r1.emit(r4, r13)
                if (r14 != r0) goto L84
                return r0
            L84:
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast r14 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast
                r3 = 0
                java.io.Serializable[] r3 = new java.io.Serializable[r3]
                r4 = 2131952639(0x7f1303ff, float:1.9541726E38)
                com.avito.android.printable_text.PrintableText r7 = com.avito.android.printable_text.b.c(r4, r3)
                com.avito.android.component.toast.f$a r8 = com.avito.android.component.toast.f.a.f125253a
                r11 = 0
                r9 = 0
                r10 = 4
                r6 = r14
                r6.<init>(r7, r8, r9, r10, r11)
                r13.f114813r = r2
                r13.f114812q = r5
                java.lang.Object r14 = r1.emit(r14, r13)
                if (r14 != r0) goto Ld3
                return r0
            La4:
                boolean r3 = r14 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Ld3
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast r3 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast
                com.avito.android.remote.model.TypedResult$Error r14 = (com.avito.android.remote.model.TypedResult.Error) r14
                com.avito.android.remote.error.ApiError r5 = r14.getError()
                java.lang.String r5 = r5.toString()
                com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.f(r5)
                com.avito.android.component.toast.f$c r7 = new com.avito.android.component.toast.f$c
                com.avito.android.remote.error.ApiError r14 = r14.getError()
                r7.<init>(r14)
                r10 = 0
                r8 = 0
                r9 = 4
                r5 = r3
                r5.<init>(r6, r7, r8, r9, r10)
                r13.f114813r = r2
                r13.f114812q = r4
                java.lang.Object r14 = r1.emit(r3, r13)
                if (r14 != r0) goto Ld3
                return r0
            Ld3:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.network.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$deleteItemFromSale$2", f = "CampaignsSaleSearchInteractor.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114816q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114817r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114818s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f114817r = interfaceC43172j;
            dVar.f114818s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114816q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114817r;
                Throwable th2 = this.f114818s;
                CampaignsSaleSearchInternalAction.ShowToast showToast = new CampaignsSaleSearchInternalAction.ShowToast(com.avito.android.printable_text.b.f(z.n(th2).toString()), new f.c(z.n(th2)), null, 4, null);
                this.f114817r = null;
                this.f114816q = 1;
                if (interfaceC43172j.emit(showToast, this) == coroutine_suspended) {
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

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$getItemsInfo$1", f = "CampaignsSaleSearchInteractor.kt", i = {0, 1}, l = {82, 86, 92, 97, 99}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114819q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f114820r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f114821s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f114822t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ List<String> f114823u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i12, b bVar, List<String> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f114821s = i12;
            this.f114822t = bVar;
            this.f114823u = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            e eVar = new e(this.f114821s, this.f114822t, this.f114823u, continuation);
            eVar.f114820r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f114819q
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                int r7 = r10.f114821s
                if (r1 == 0) goto L37
                if (r1 == r6) goto L2f
                if (r1 == r5) goto L27
                if (r1 == r4) goto L22
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                kotlin.C42729a0.b(r11)
                goto Lbc
            L27:
                java.lang.Object r1 = r10.f114820r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L74
            L2f:
                java.lang.Object r1 = r10.f114820r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4e
            L37:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f114820r
                r1 = r11
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                if (r7 == 0) goto L4e
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$PageLoading r11 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.PageLoading.f114730b
                r10.f114820r = r1
                r10.f114819q = r6
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L4e
                return r0
            L4e:
                com.avito.android.campaigns_sale_search.network.b r11 = r10.f114822t
                h31.e<om.a> r6 = r11.f114800a
                java.lang.Object r6 = r6.get()
                om.a r6 = (om.InterfaceC44818a) r6
                com.avito.android.campaigns_sale_search.model.CampaignsSaleSearchArguments r11 = r11.f114802c
                java.lang.String r11 = r11.f114633b
                com.avito.android.util.A4 r8 = com.avito.android.util.A4.f318516a
                r8.getClass()
                java.util.List<java.lang.String> r8 = r10.f114823u
                java.lang.String r9 = "itemIds"
                java.util.Map r8 = com.avito.android.util.A4.h(r8, r9)
                r10.f114820r = r1
                r10.f114819q = r5
                java.lang.Object r11 = r6.i(r11, r8, r10)
                if (r11 != r0) goto L74
                return r0
            L74:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r5 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                r6 = 0
                if (r5 == 0) goto L93
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$PageLoaded r2 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$PageLoaded
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchItemsInfoResult r11 = (com.avito.android.campaigns_sale.network.remote.model.CampaignsSaleSearchItemsInfoResult) r11
                r2.<init>(r11, r7)
                r10.f114820r = r6
                r10.f114819q = r4
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lbc
                return r0
            L93:
                boolean r4 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lbc
                if (r7 != 0) goto Laf
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowError r2 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowError
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r11 = r11.getError()
                r2.<init>(r11)
                r10.f114820r = r6
                r10.f114819q = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lbc
                return r0
            Laf:
                com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$PageError r11 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.PageError.f114727b
                r10.f114820r = r6
                r10.f114819q = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto Lbc
                return r0
            Lbc:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.network.b.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CampaignsSaleSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/campaigns_sale_search/mvi/entity/CampaignsSaleSearchInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.campaigns_sale_search.network.CampaignsSaleSearchInteractorImpl$getItemsInfo$2", f = "CampaignsSaleSearchInteractor.kt", i = {}, l = {106, 108}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements q<InterfaceC43172j<? super CampaignsSaleSearchInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f114824q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f114825r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f114826s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f114827t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(int i12, Continuation<? super f> continuation) {
            super(3, continuation);
            this.f114827t = i12;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super CampaignsSaleSearchInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(this.f114827t, continuation);
            fVar.f114825r = interfaceC43172j;
            fVar.f114826s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f114824q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f114825r;
                Throwable th2 = this.f114826s;
                if (this.f114827t == 0) {
                    CampaignsSaleSearchInternalAction.ShowError showError = new CampaignsSaleSearchInternalAction.ShowError(z.n(th2));
                    this.f114825r = null;
                    this.f114824q = 1;
                    if (interfaceC43172j.emit(showError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CampaignsSaleSearchInternalAction.PageError pageError = CampaignsSaleSearchInternalAction.PageError.f114727b;
                    this.f114825r = null;
                    this.f114824q = 2;
                    if (interfaceC43172j.emit(pageError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k h31.e<InterfaceC44818a> eVar, @k R0 r02, @k CampaignsSaleSearchArguments campaignsSaleSearchArguments) {
        this.f114800a = eVar;
        this.f114801b = r02;
        this.f114802c = campaignsSaleSearchArguments;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.campaigns_sale_search.network.b r6, kotlinx.coroutines.flow.InterfaceC43172j r7, com.avito.android.printable_text.PrintableText r8, com.avito.android.component.toast.f r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r6.getClass()
            boolean r0 = r10 instanceof com.avito.android.campaigns_sale_search.network.c
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.campaigns_sale_search.network.c r0 = (com.avito.android.campaigns_sale_search.network.c) r0
            int r1 = r0.f114833v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f114833v = r1
            goto L1b
        L16:
            com.avito.android.campaigns_sale_search.network.c r0 = new com.avito.android.campaigns_sale_search.network.c
            r0.<init>(r6, r10)
        L1b:
            java.lang.Object r6 = r0.f114831t
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.f114833v
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L4e
            if (r1 == r4) goto L44
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            kotlin.C42729a0.b(r6)
            goto L91
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            com.avito.android.component.toast.f r7 = r0.f114830s
            com.avito.android.printable_text.PrintableText r8 = r0.f114829r
            kotlinx.coroutines.flow.j r9 = r0.f114828q
            kotlin.C42729a0.b(r6)
            goto L76
        L44:
            com.avito.android.component.toast.f r9 = r0.f114830s
            com.avito.android.printable_text.PrintableText r8 = r0.f114829r
            kotlinx.coroutines.flow.j r7 = r0.f114828q
            kotlin.C42729a0.b(r6)
            goto L62
        L4e:
            kotlin.C42729a0.b(r6)
            com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$HideKeyboard r6 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.HideKeyboard.f114716b
            r0.f114828q = r7
            r0.f114829r = r8
            r0.f114830s = r9
            r0.f114833v = r4
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r10) goto L62
            goto L93
        L62:
            com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$DismissBottomsheet r6 = com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction.DismissBottomsheet.f114713b
            r0.f114828q = r7
            r0.f114829r = r8
            r0.f114830s = r9
            r0.f114833v = r3
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r10) goto L73
            goto L93
        L73:
            r5 = r9
            r9 = r7
            r7 = r5
        L76:
            com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast r6 = new com.avito.android.campaigns_sale_search.mvi.entity.CampaignsSaleSearchInternalAction$ShowToast
            r3 = 500(0x1f4, double:2.47E-321)
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            r6.<init>(r8, r7, r1)
            r7 = 0
            r0.f114828q = r7
            r0.f114829r = r7
            r0.f114830s = r7
            r0.f114833v = r2
            java.lang.Object r6 = r9.emit(r6, r0)
            if (r6 != r10) goto L91
            goto L93
        L91:
            kotlin.G0 r10 = kotlin.G0.f406611a
        L93:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.campaigns_sale_search.network.b.e(com.avito.android.campaigns_sale_search.network.b, kotlinx.coroutines.flow.j, com.avito.android.printable_text.PrintableText, com.avito.android.component.toast.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.campaigns_sale_search.network.a
    @k
    public final InterfaceC43160i a(@k String str, @k Filter filter) {
        return C43175k.I(this.f114801b.a(), new C43152f0(C43175k.G(new com.avito.android.campaigns_sale_search.network.d(this, str, filter, null)), new com.avito.android.campaigns_sale_search.network.e(3, null)));
    }

    @Override // com.avito.android.campaigns_sale_search.network.a
    @k
    public final InterfaceC43160i<CampaignsSaleSearchInternalAction> b(@k String str) {
        return C43175k.I(this.f114801b.a(), new C43152f0(C43175k.G(new c(str, null)), new d(3, null)));
    }

    @Override // com.avito.android.campaigns_sale_search.network.a
    @k
    public final InterfaceC43160i c(int i12, @k String str) {
        return C43175k.I(this.f114801b.a(), new C43152f0(C43175k.G(new a(str, i12, null)), new C3350b(null)));
    }

    @Override // com.avito.android.campaigns_sale_search.network.a
    @k
    public final InterfaceC43160i d(int i12, @k List list) {
        return C43175k.I(this.f114801b.a(), new C43152f0(C43175k.G(new e(i12, this, list, null)), new f(i12, null)));
    }
}
