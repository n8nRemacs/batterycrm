package com.avito.android.advert.item.neighboring_dates;

import Y41.p;
import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.I1;
import com.avito.android.advert.item.neighboring_dates.a;
import com.avito.android.advert.item.neighboring_dates.d;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.AdvertShortTermRent;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: NeighboringDatesPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/e;", "Lcom/avito/android/advert/item/neighboring_dates/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.advert.item.neighboring_dates.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.neighboring_dates.a f77757a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final E4.g f77758b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f77759c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.neighboring_dates.tools.e f77760d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Long f77761e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public String f77762f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public d.a f77763g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public N f77764h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public C43238h f77765i;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<AdvertDetailsNeighboringDatesItem> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43137a0 f77766b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f77767c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f77768d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.advert.item.neighboring_dates.e$a$a, reason: collision with other inner class name */
        public static final class C2300a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f77769b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f77770c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f77771d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadInitial$$inlined$map$1$2", f = "NeighboringDatesPresenter.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.advert.item.neighboring_dates.e$a$a$a, reason: collision with other inner class name */
            public static final class C2301a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f77772q;

                /* renamed from: r, reason: collision with root package name */
                public int f77773r;

                public C2301a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f77772q = obj;
                    this.f77773r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C2300a.this.emit(null, this);
                }
            }

            public C2300a(InterfaceC43172j interfaceC43172j, e eVar, String str) {
                this.f77769b = interfaceC43172j;
                this.f77770c = eVar;
                this.f77771d = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.avito.android.advert.item.neighboring_dates.e.a.C2300a.C2301a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.avito.android.advert.item.neighboring_dates.e$a$a$a r0 = (com.avito.android.advert.item.neighboring_dates.e.a.C2300a.C2301a) r0
                    int r1 = r0.f77773r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f77773r = r1
                    goto L18
                L13:
                    com.avito.android.advert.item.neighboring_dates.e$a$a$a r0 = new com.avito.android.advert.item.neighboring_dates.e$a$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f77772q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f77773r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r12)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    kotlin.C42729a0.b(r12)
                    r5 = r11
                    com.avito.android.advert.item.neighboring_dates.a$a r5 = (com.avito.android.advert.item.neighboring_dates.a.InterfaceC2298a) r5
                    com.avito.android.advert.item.neighboring_dates.e r4 = r10.f77770c
                    E4.g r6 = r4.f77758b
                    com.avito.android.advert.item.neighboring_dates.d$a r8 = r4.f77763g
                    r9 = 1
                    java.lang.String r7 = r10.f77771d
                    com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem r11 = com.avito.android.advert.item.neighboring_dates.e.e(r4, r5, r6, r7, r8, r9)
                    r0.f77773r = r3
                    kotlinx.coroutines.flow.j r12 = r10.f77769b
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.neighboring_dates.e.a.C2300a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(C43137a0 c43137a0, e eVar, String str) {
            this.f77766b = c43137a0;
            this.f77767c = eVar;
            this.f77768d = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super AdvertDetailsNeighboringDatesItem> interfaceC43172j, @k Continuation continuation) throws Throwable {
            Object objCollect = this.f77766b.collect(new C2300a(interfaceC43172j, this.f77767c, this.f77768d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: NeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadInitial$1", f = "NeighboringDatesPresenter.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<InterfaceC43172j<? super a.InterfaceC2298a>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f77775q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f77776r;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f77776r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super a.InterfaceC2298a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f77775q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f77776r;
                a.InterfaceC2298a.c cVar = a.InterfaceC2298a.c.f77748a;
                this.f77775q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
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

    /* compiled from: NeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadInitial$3", f = "NeighboringDatesPresenter.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<AdvertDetailsNeighboringDatesItem, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f77777q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f77778r;

        /* compiled from: NeighboringDatesPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadInitial$3$1", f = "NeighboringDatesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ e f77780q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertDetailsNeighboringDatesItem f77781r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f77780q = eVar;
                this.f77781r = advertDetailsNeighboringDatesItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f77780q, this.f77781r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                ?? r22 = this.f77780q.f77764h;
                if (r22 != 0) {
                    r22.invoke(this.f77781r);
                }
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = e.this.new c(continuation);
            cVar.f77778r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, Continuation<? super G0> continuation) {
            return ((c) create(advertDetailsNeighboringDatesItem, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f77777q;
            if (i12 == 0) {
                C42729a0.b(obj);
                AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem = (AdvertDetailsNeighboringDatesItem) this.f77778r;
                e eVar = e.this;
                AbstractC43129d1 abstractC43129d1B = eVar.f77759c.b();
                a aVar = new a(eVar, advertDetailsNeighboringDatesItem, null);
                this.f77777q = 1;
                if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<AdvertDetailsNeighboringDatesItem> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ X f77782b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f77783c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f77784d;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f77785b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f77786c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f77787d;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadNext$$inlined$map$1$2", f = "NeighboringDatesPresenter.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.advert.item.neighboring_dates.e$d$a$a, reason: collision with other inner class name */
            public static final class C2302a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f77788q;

                /* renamed from: r, reason: collision with root package name */
                public int f77789r;

                public C2302a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f77788q = obj;
                    this.f77789r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, e eVar, String str) {
                this.f77785b = interfaceC43172j;
                this.f77786c = eVar;
                this.f77787d = str;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, @Y61.k kotlin.coroutines.Continuation r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof com.avito.android.advert.item.neighboring_dates.e.d.a.C2302a
                    if (r0 == 0) goto L13
                    r0 = r12
                    com.avito.android.advert.item.neighboring_dates.e$d$a$a r0 = (com.avito.android.advert.item.neighboring_dates.e.d.a.C2302a) r0
                    int r1 = r0.f77789r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f77789r = r1
                    goto L18
                L13:
                    com.avito.android.advert.item.neighboring_dates.e$d$a$a r0 = new com.avito.android.advert.item.neighboring_dates.e$d$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.f77788q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f77789r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r12)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    kotlin.C42729a0.b(r12)
                    r5 = r11
                    com.avito.android.advert.item.neighboring_dates.a$a r5 = (com.avito.android.advert.item.neighboring_dates.a.InterfaceC2298a) r5
                    com.avito.android.advert.item.neighboring_dates.e r4 = r10.f77786c
                    E4.g r6 = r4.f77758b
                    com.avito.android.advert.item.neighboring_dates.d$a r8 = r4.f77763g
                    r9 = 0
                    java.lang.String r7 = r10.f77787d
                    com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem r11 = com.avito.android.advert.item.neighboring_dates.e.e(r4, r5, r6, r7, r8, r9)
                    r0.f77789r = r3
                    kotlinx.coroutines.flow.j r12 = r10.f77785b
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L4f
                    return r1
                L4f:
                    kotlin.G0 r11 = kotlin.G0.f406611a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.neighboring_dates.e.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(X x12, e eVar, String str) {
            this.f77782b = x12;
            this.f77783c = eVar;
            this.f77784d = str;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super AdvertDetailsNeighboringDatesItem> interfaceC43172j, @k Continuation continuation) throws Throwable {
            Object objCollect = this.f77782b.collect(new a(interfaceC43172j, this.f77783c, this.f77784d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: NeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadNext$1", f = "NeighboringDatesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.advert.item.neighboring_dates.e$e, reason: collision with other inner class name */
    public static final class C2303e extends SuspendLambda implements p<InterfaceC43172j<? super a.InterfaceC2298a>, Continuation<? super G0>, Object> {
        public C2303e(Continuation<? super C2303e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return e.this.new C2303e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super a.InterfaceC2298a> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C2303e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f77760d.setLoading(true);
            return G0.f406611a;
        }
    }

    /* compiled from: NeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert/item/neighboring_dates/a$a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadNext$2", f = "NeighboringDatesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements q<InterfaceC43172j<? super a.InterfaceC2298a>, Throwable, Continuation<? super G0>, Object> {
        public f(Continuation<? super f> continuation) {
            super(3, continuation);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super a.InterfaceC2298a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            return e.this.new f(continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f77760d.setLoading(false);
            return G0.f406611a;
        }
    }

    /* compiled from: NeighboringDatesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/advert_details_items/neighboring_dates/AdvertDetailsNeighboringDatesItem;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadNext$4", f = "NeighboringDatesPresenter.kt", i = {}, l = {170}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<AdvertDetailsNeighboringDatesItem, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f77793q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f77794r;

        /* compiled from: NeighboringDatesPresenter.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advert.item.neighboring_dates.NeighboringDatesPresenterImpl$loadNext$4$1", f = "NeighboringDatesPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ e f77796q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ AdvertDetailsNeighboringDatesItem f77797r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f77796q = eVar;
                this.f77797r = advertDetailsNeighboringDatesItem;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f77796q, this.f77797r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [Y41.l, kotlin.jvm.internal.N] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                ?? r22 = this.f77796q.f77764h;
                if (r22 != 0) {
                    r22.invoke(this.f77797r);
                }
                return G0.f406611a;
            }
        }

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            g gVar = e.this.new g(continuation);
            gVar.f77794r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, Continuation<? super G0> continuation) {
            return ((g) create(advertDetailsNeighboringDatesItem, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f77793q;
            if (i12 == 0) {
                C42729a0.b(obj);
                AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem = (AdvertDetailsNeighboringDatesItem) this.f77794r;
                e eVar = e.this;
                AbstractC43129d1 abstractC43129d1B = eVar.f77759c.b();
                a aVar = new a(eVar, advertDetailsNeighboringDatesItem, null);
                this.f77793q = 1;
                if (C43259k.g(abstractC43129d1B, aVar, this) == coroutine_suspended) {
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

    @Inject
    public e(@k com.avito.android.advert.item.neighboring_dates.a aVar, @k E4.g gVar, @k R0 r02, @k com.avito.android.advert_details_items.neighboring_dates.tools.e eVar) {
        this.f77757a = aVar;
        this.f77758b = gVar;
        this.f77759c = r02;
        this.f77760d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem e(com.avito.android.advert.item.neighboring_dates.e r18, com.avito.android.advert.item.neighboring_dates.a.InterfaceC2298a r19, E4.g r20, java.lang.String r21, com.avito.android.advert.item.neighboring_dates.d.a r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.advert.item.neighboring_dates.e.e(com.avito.android.advert.item.neighboring_dates.e, com.avito.android.advert.item.neighboring_dates.a$a, E4.g, java.lang.String, com.avito.android.advert.item.neighboring_dates.d$a, boolean):com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void a(long j12, @k String str, @l d.a aVar, @k Y41.l<? super AdvertDetailsNeighboringDatesItem, G0> lVar) {
        this.f77761e = Long.valueOf(j12);
        this.f77762f = str;
        this.f77763g = aVar;
        this.f77764h = (N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void b(@l String str, @k AdvertDetails advertDetails, @k Y41.l<? super AdvertDetailsNeighboringDatesItem, G0> lVar) {
        Long lZ02;
        AdvertShortTermRent shortTermRent;
        AdvertShortTermRent.NeighboringDates neighboringDates;
        String title;
        AdvertShortTermRent.Actions actions;
        SimpleAction changedDates;
        if (str == null || (lZ02 = C43066x.z0(str)) == null || (shortTermRent = advertDetails.getShortTermRent()) == null || (neighboringDates = shortTermRent.getNeighboringDates()) == null || (title = neighboringDates.getTitle()) == null) {
            return;
        }
        AdvertShortTermRent shortTermRent2 = advertDetails.getShortTermRent();
        d.a aVar = (shortTermRent2 == null || (actions = shortTermRent2.getActions()) == null || (changedDates = actions.getChangedDates()) == null) ? null : new d.a(changedDates.getTitle(), changedDates.getUri());
        this.f77761e = lZ02;
        this.f77762f = title;
        this.f77763g = aVar;
        this.f77764h = (N) lVar;
    }

    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void c(@k String str) {
        Long l12;
        C43238h c43238h = this.f77765i;
        if (c43238h == null || (l12 = this.f77761e) == null) {
            return;
        }
        long jLongValue = l12.longValue();
        String str2 = this.f77762f;
        if (str2 == null) {
            return;
        }
        com.avito.android.advert.item.neighboring_dates.a aVar = this.f77757a;
        aVar.getClass();
        C43175k.K(new C43197r1(new c(null), C43175k.I(this.f77759c.a(), new a(new C43137a0(new b(2, null), C43175k.G(new com.avito.android.advert.item.neighboring_dates.b(aVar, jLongValue, str, null))), this, str2))), c43238h);
    }

    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void d(@k String str) {
        Long l12;
        C43238h c43238h = this.f77765i;
        if (c43238h == null || (l12 = this.f77761e) == null) {
            return;
        }
        long jLongValue = l12.longValue();
        String str2 = this.f77762f;
        if (str2 == null) {
            return;
        }
        com.avito.android.advert.item.neighboring_dates.a aVar = this.f77757a;
        aVar.getClass();
        C43175k.K(new C43197r1(new g(null), C43175k.I(this.f77759c.a(), new d(new X(new C43137a0(new C2303e(null), C43175k.G(new com.avito.android.advert.item.neighboring_dates.b(aVar, jLongValue, str, null))), new f(null)), this, str2))), c43238h);
    }

    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void e0() {
        this.f77761e = null;
        this.f77762f = null;
        this.f77763g = null;
        C43238h c43238h = this.f77765i;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f77765i = null;
    }

    @Override // com.avito.android.advert.item.neighboring_dates.d
    public final void k(@k I1 i12) {
        this.f77765i = U.a(this.f77759c.b());
    }
}
