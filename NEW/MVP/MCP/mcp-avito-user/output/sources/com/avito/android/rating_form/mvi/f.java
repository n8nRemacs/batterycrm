package com.avito.android.rating_form.mvi;

import com.avito.android.rating_form.RatingFormArguments;
import com.avito.android.rating_form.mvi.entity.RatingFormInternalAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: RatingFormBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements com.avito.android.arch.mvi.b<RatingFormInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.rating_form.interactor.i f248764a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f248765b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatingFormArguments f248766c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final R0 f248767d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f248768e;

    /* compiled from: RatingFormBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/rating_form/mvi/f$a;", "", "<init>", "()V", "", "LOADING_DALEY_MS", "J", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/rating_form/mvi/entity/RatingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.rating_form.mvi.RatingFormBootstrap$produce$1", f = "RatingFormBootstrap.kt", i = {}, l = {34, 36, 38}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super RatingFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f248769q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f248770r;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f248770r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super RatingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.f248769q
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.rating_form.mvi.f r5 = com.avito.android.rating_form.mvi.f.this
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.C42729a0.b(r13)
                goto L90
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.C42729a0.b(r13)
                goto L50
            L24:
                kotlin.C42729a0.b(r13)
                goto L41
            L28:
                kotlin.C42729a0.b(r13)
                java.lang.Object r13 = r12.f248770r
                kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
                boolean r1 = r5.f248765b
                if (r1 != 0) goto L90
                com.avito.android.rating_form.mvi.entity.RatingFormInternalAction$Loading r1 = new com.avito.android.rating_form.mvi.entity.RatingFormInternalAction$Loading
                r1.<init>()
                r12.f248769q = r4
                java.lang.Object r13 = r13.emit(r1, r12)
                if (r13 != r0) goto L41
                return r0
            L41:
                boolean r13 = r5.f248768e
                if (r13 == 0) goto L50
                r12.f248769q = r3
                r3 = 300(0x12c, double:1.48E-321)
                java.lang.Object r13 = kotlinx.coroutines.C43131e0.b(r3, r12)
                if (r13 != r0) goto L50
                return r0
            L50:
                com.avito.android.rating_form.interactor.i r6 = r5.f248764a
                com.avito.android.rating_form.RatingFormArguments r13 = r5.f248766c
                boolean r1 = r13 instanceof com.avito.android.rating_form.RatingFormArguments.RatingModelArguments
                if (r1 == 0) goto L6b
                com.avito.android.rating_form.api.remote.model.a$b$a r1 = new com.avito.android.rating_form.api.remote.model.a$b$a
                com.avito.android.rating_form.api.remote.model.a$b$a$a r3 = new com.avito.android.rating_form.api.remote.model.a$b$a$a
                com.avito.android.rating_form.RatingFormArguments$RatingModelArguments r13 = (com.avito.android.rating_form.RatingFormArguments.RatingModelArguments) r13
                int r4 = r13.f247905c
                java.lang.Integer r5 = r13.f247906d
                java.lang.String r13 = r13.f247907e
                r3.<init>(r4, r5, r13)
                r1.<init>(r3)
                goto L78
            L6b:
                boolean r1 = r13 instanceof com.avito.android.rating_form.RatingFormArguments.RatingSellerArguments
                if (r1 == 0) goto L8a
                com.avito.android.rating_form.api.remote.model.a$b$b r1 = new com.avito.android.rating_form.api.remote.model.a$b$b
                com.avito.android.rating_form.RatingFormArguments$RatingSellerArguments r13 = (com.avito.android.rating_form.RatingFormArguments.RatingSellerArguments) r13
                java.util.Map<java.lang.String, java.io.Serializable> r13 = r13.f247910c
                r1.<init>(r13)
            L78:
                java.util.List r7 = java.util.Collections.singletonList(r1)
                r12.f248769q = r2
                r9 = 0
                r11 = 14
                r8 = 0
                r10 = r12
                java.lang.Object r13 = com.avito.android.rating_form.interactor.i.a.a(r6, r7, r8, r9, r10, r11)
                if (r13 != r0) goto L90
                return r0
            L8a:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            L90:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.rating_form.mvi.f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new a(null);
    }

    @Inject
    public f(@Y61.k com.avito.android.rating_form.interactor.i iVar, @com.avito.android.rating_form.di.d boolean z12, @Y61.k RatingFormArguments ratingFormArguments, @Y61.k R0 r02, @com.avito.android.rating_form.di.b boolean z13) {
        this.f248764a = iVar;
        this.f248765b = z12;
        this.f248766c = ratingFormArguments;
        this.f248767d = r02;
        this.f248768e = z13;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<RatingFormInternalAction> a() {
        return C43175k.I(this.f248767d.a(), C43175k.N(new g(this.f248764a.getF248219h()), C43175k.G(new b(null))));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
