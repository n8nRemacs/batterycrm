package com.avito.android.user_adverts_filters.main.mvi_delegate;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lj.InterfaceC43779a;
import qJ0.InterfaceC47305a;
import qJ0.InterfaceC47306b;
import qJ0.InterfaceC47308d;

/* compiled from: FiltersDelegateActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_delegate/a;", "Lcom/avito/android/arch/mvi/a;", "LqJ0/a;", "LqJ0/b;", "LqJ0/d;", "a", "b", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35708a implements com.avito.android.arch.mvi.a<InterfaceC47305a, InterfaceC47306b, InterfaceC47308d> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f316084i = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f316085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f316086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f316087c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f316088d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f316089e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f316090f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f316091g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43779a f316092h;

    /* compiled from: FiltersDelegateActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_delegate/a$a;", "", "<init>", "()V", "", "BACK_CHANGE_DELAY_MS", "J", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.a$a, reason: collision with other inner class name */
    public static final class C9802a {
        public /* synthetic */ C9802a(C42822w c42822w) {
            this();
        }

        public C9802a() {
        }
    }

    /* compiled from: FiltersDelegateActor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/mvi_delegate/a$b;", "", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f316093a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Map<String, Object> f316094b;

        public b(@Y61.k Map<String, ? extends Object> map, @Y61.k Map<String, ? extends Object> map2) {
            this.f316093a = map;
            this.f316094b = map2;
        }
    }

    /* compiled from: FiltersDelegateActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LqJ0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$process$2", f = "FiltersDelegateActor.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.a$c */
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC47306b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316095q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316096r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47308d f316098t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC47308d interfaceC47308d, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f316098t = interfaceC47308d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = C35708a.this.new c(this.f316098t, continuation);
            cVar.f316096r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC47306b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f316095q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f316096r;
                InterfaceC47306b.a aVar = InterfaceC47306b.a.f429166a;
                this.f316095q = 1;
                if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            InterfaceC47308d.a aVar2 = (InterfaceC47308d.a) this.f316098t;
            this.f316095q = 2;
            if (C35708a.c(C35708a.this, aVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FiltersDelegateActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LqJ0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts_filters.main.mvi_delegate.FiltersDelegateActor$process$3", f = "FiltersDelegateActor.kt", i = {0}, l = {73, 74}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.user_adverts_filters.main.mvi_delegate.a$d */
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC47306b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f316099q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f316100r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47308d f316102t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC47308d interfaceC47308d, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f316102t = interfaceC47308d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = C35708a.this.new d(this.f316102t, continuation);
            dVar.f316100r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC47306b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f316099q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f316100r;
                InterfaceC47308d.a aVar = (InterfaceC47308d.a) this.f316102t;
                this.f316100r = interfaceC43172j;
                this.f316099q = 1;
                if (C35708a.e(C35708a.this, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f316100r;
                C42729a0.b(obj);
            }
            InterfaceC47306b.e eVar = InterfaceC47306b.e.f429173a;
            this.f316100r = null;
            this.f316099q = 2;
            if (interfaceC43172j.emit(eVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new C9802a(null);
    }

    @Inject
    public C35708a(@Y61.k InterfaceC40691b interfaceC40691b, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k R0 r02) {
        this.f316085a = interfaceC40691b;
        this.f316086b = interfaceC28373a;
        this.f316087c = r02;
        this.f316088d = interfaceC40691b.j();
        this.f316089e = interfaceC40691b.j();
        this.f316090f = interfaceC40691b.j();
        this.f316091g = interfaceC40691b.j();
        this.f316092h = interfaceC40691b.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:26:0x007b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a r10, qJ0.InterfaceC47308d.a r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof com.avito.android.user_adverts_filters.main.mvi_delegate.C35709b
            if (r0 == 0) goto L16
            r0 = r12
            com.avito.android.user_adverts_filters.main.mvi_delegate.b r0 = (com.avito.android.user_adverts_filters.main.mvi_delegate.C35709b) r0
            int r1 = r0.f316108v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f316108v = r1
            goto L1b
        L16:
            com.avito.android.user_adverts_filters.main.mvi_delegate.b r0 = new com.avito.android.user_adverts_filters.main.mvi_delegate.b
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.f316106t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f316108v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            goto L37
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            java.util.Iterator r10 = r0.f316105s
            qJ0.d$a r11 = r0.f316104r
            com.avito.android.user_adverts_filters.main.mvi_delegate.a r2 = r0.f316103q
            kotlin.C42729a0.b(r12)
            goto L7b
        L41:
            kotlin.C42729a0.b(r12)
            java.util.List<qJ0.d$a$a> r12 = r11.f429178d
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r9 = r11
            r11 = r10
            r10 = r12
            r12 = r9
        L50:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r10.next()
            qJ0.d$a$a r2 = (qJ0.InterfaceC47308d.a.C12320a) r2
            java.lang.String r6 = r2.f429181a
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel r7 = r12.f429175a
            java.lang.String r7 = r7.f316057e
            boolean r7 = kotlin.jvm.internal.L.f(r6, r7)
            if (r7 == 0) goto L7e
            lj.a r6 = r11.f316088d
            r0.f316103q = r11
            r0.f316104r = r12
            r0.f316105s = r10
            r0.f316108v = r5
            java.lang.Object r2 = r11.g(r6, r2, r0)
            if (r2 != r1) goto L79
            goto Lb4
        L79:
            r2 = r11
            r11 = r12
        L7b:
            r12 = r11
            r11 = r2
            goto L50
        L7e:
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel r7 = r12.f429175a
            java.lang.String r8 = r7.f316059g
            boolean r8 = kotlin.jvm.internal.L.f(r6, r8)
            if (r8 == 0) goto L99
            lj.a r6 = r11.f316089e
            r0.f316103q = r11
            r0.f316104r = r12
            r0.f316105s = r10
            r0.f316108v = r4
            java.lang.Object r2 = r11.g(r6, r2, r0)
            if (r2 != r1) goto L79
            goto Lb4
        L99:
            java.lang.String r7 = r7.f316061i
            boolean r6 = kotlin.jvm.internal.L.f(r6, r7)
            if (r6 == 0) goto L50
            lj.a r6 = r11.f316090f
            r0.f316103q = r11
            r0.f316104r = r12
            r0.f316105s = r10
            r0.f316108v = r3
            java.lang.Object r2 = r11.g(r6, r2, r0)
            if (r2 != r1) goto L79
            goto Lb4
        Lb2:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lb4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.c(com.avito.android.user_adverts_filters.main.mvi_delegate.a, qJ0.d$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a r9, qJ0.InterfaceC47308d r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.d(com.avito.android.user_adverts_filters.main.mvi_delegate.a, qJ0.d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a r6, qJ0.InterfaceC47308d.a r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof com.avito.android.user_adverts_filters.main.mvi_delegate.C35711d
            if (r0 == 0) goto L16
            r0 = r8
            com.avito.android.user_adverts_filters.main.mvi_delegate.d r0 = (com.avito.android.user_adverts_filters.main.mvi_delegate.C35711d) r0
            int r1 = r0.f316118u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f316118u = r1
            goto L1b
        L16:
            com.avito.android.user_adverts_filters.main.mvi_delegate.d r0 = new com.avito.android.user_adverts_filters.main.mvi_delegate.d
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f316116s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f316118u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            qJ0.d$a r6 = r0.f316115r
            com.avito.android.user_adverts_filters.main.mvi_delegate.a r7 = r0.f316114q
            kotlin.C42729a0.b(r8)
            goto L7b
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            qJ0.d$a r7 = r0.f316115r
            com.avito.android.user_adverts_filters.main.mvi_delegate.a r6 = r0.f316114q
            kotlin.C42729a0.b(r8)
            goto L5f
        L43:
            kotlin.C42729a0.b(r8)
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel r8 = r7.f429175a
            java.lang.String r8 = r8.f316059g
            lj.a r2 = r6.f316092h
            java.util.List r2 = r2.f()
            r0.f316114q = r6
            r0.f316115r = r7
            r0.f316118u = r4
            lj.a r4 = r6.f316089e
            java.lang.Object r8 = r6.j(r4, r8, r2, r0)
            if (r8 != r1) goto L5f
            goto L8f
        L5f:
            lj.a r8 = r6.f316088d
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel r2 = r7.f429175a
            java.lang.String r2 = r2.f316057e
            lj.a r4 = r6.f316091g
            java.util.List r4 = r4.f()
            r0.f316114q = r6
            r0.f316115r = r7
            r0.f316118u = r3
            java.lang.Object r8 = r6.j(r8, r2, r4, r0)
            if (r8 != r1) goto L78
            goto L8f
        L78:
            r5 = r7
            r7 = r6
            r6 = r5
        L7b:
            com.avito.android.analytics.a r7 = r7.f316086b
            oJ0.a r8 = new oJ0.a
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinModel r0 = r6.f429175a
            com.avito.android.user_adverts_filters.main.model.UserAdvertsFiltersBeduinScreen r0 = r0.f316055c
            java.lang.String r0 = r0.f316078b
            java.lang.String r6 = r6.f429180f
            r8.<init>(r0, r6)
            r7.c(r8)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.e(com.avito.android.user_adverts_filters.main.mvi_delegate.a, qJ0.d$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a r5, lj.InterfaceC43779a r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.avito.android.user_adverts_filters.main.mvi_delegate.g
            if (r0 == 0) goto L16
            r0 = r7
            com.avito.android.user_adverts_filters.main.mvi_delegate.g r0 = (com.avito.android.user_adverts_filters.main.mvi_delegate.g) r0
            int r1 = r0.f316130t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f316130t = r1
            goto L1b
        L16:
            com.avito.android.user_adverts_filters.main.mvi_delegate.g r0 = new com.avito.android.user_adverts_filters.main.mvi_delegate.g
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f316128r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f316130t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            com.avito.android.user_adverts_filters.main.mvi_delegate.a r5 = r0.f316127q
            kotlin.C42729a0.b(r7)
            goto L50
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r7)
            com.avito.android.util.R0 r7 = r5.f316087c
            kotlinx.coroutines.d1 r7 = r7.b()
            com.avito.android.user_adverts_filters.main.mvi_delegate.h r2 = new com.avito.android.user_adverts_filters.main.mvi_delegate.h
            r4 = 0
            r2.<init>(r6, r4)
            r0.f316127q = r5
            r0.f316130t = r3
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r7, r2, r0)
            if (r7 != r1) goto L50
            goto L58
        L50:
            java.util.List r7 = (java.util.List) r7
            gj.b r5 = r5.f316085a
            java.util.Map r1 = com.avito.android.beduin_shared.model.utils.q.a(r7, r5)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.f(com.avito.android.user_adverts_filters.main.mvi_delegate.a, lj.a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43779a interfaceC43779a = this.f316089e;
        C43137a0 c43137a0H = h(interfaceC43779a);
        InterfaceC43779a interfaceC43779a2 = this.f316092h;
        C43137a0 c43137a0H2 = h(interfaceC43779a2);
        o oVar = o.f316164b;
        C1 c12 = new C1(c43137a0H, c43137a0H2, oVar);
        InterfaceC43779a interfaceC43779a3 = this.f316088d;
        return new C43137a0(new t(this, aVar, null), C43175k.N(new r(new q(new C1(c12, new C1(h(interfaceC43779a3), h(this.f316091g), oVar), s.f316180b))), new k(kotlinx.coroutines.rx3.y.a(interfaceC43779a.getF103348p())), new p(kotlinx.coroutines.rx3.y.a(interfaceC43779a3.getF103348p())), new i(kotlinx.coroutines.rx3.y.a(this.f316090f.getF103348p())), new l(h(interfaceC43779a)), new j(h(interfaceC43779a2)), C43175k.B(new u(this, aVar, null), c43197r1)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(lj.InterfaceC43779a r7, qJ0.InterfaceC47308d.a.C12320a r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.avito.android.user_adverts_filters.main.mvi_delegate.e
            if (r0 == 0) goto L13
            r0 = r9
            com.avito.android.user_adverts_filters.main.mvi_delegate.e r0 = (com.avito.android.user_adverts_filters.main.mvi_delegate.e) r0
            int r1 = r0.f316124v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316124v = r1
            goto L18
        L13:
            com.avito.android.user_adverts_filters.main.mvi_delegate.e r0 = new com.avito.android.user_adverts_filters.main.mvi_delegate.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f316122t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f316124v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r9)
            goto L75
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            qJ0.d$a$a r8 = r0.f316121s
            lj.a r7 = r0.f316120r
            com.avito.android.user_adverts_filters.main.mvi_delegate.a r2 = r0.f316119q
            kotlin.C42729a0.b(r9)
            goto L5a
        L3e:
            kotlin.C42729a0.b(r9)
            java.lang.String r9 = r8.f429181a
            if (r9 != 0) goto L48
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L48:
            r0.f316119q = r6
            r0.f316120r = r7
            r0.f316121s = r8
            r0.f316124v = r4
            r4 = 300(0x12c, double:1.48E-321)
            java.lang.Object r9 = kotlinx.coroutines.C43131e0.b(r4, r0)
            if (r9 != r1) goto L59
            return r1
        L59:
            r2 = r6
        L5a:
            com.avito.android.util.R0 r9 = r2.f316087c
            kotlinx.coroutines.d1 r9 = r9.b()
            com.avito.android.user_adverts_filters.main.mvi_delegate.f r2 = new com.avito.android.user_adverts_filters.main.mvi_delegate.f
            r4 = 0
            r2.<init>(r7, r8, r4)
            r0.f316119q = r4
            r0.f316120r = r4
            r0.f316121s = r4
            r0.f316124v = r3
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r9, r2, r0)
            if (r7 != r1) goto L75
            return r1
        L75:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts_filters.main.mvi_delegate.C35708a.g(lj.a, qJ0.d$a$a, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final C43137a0 h(InterfaceC43779a interfaceC43779a) {
        return new C43137a0(new n(2, null), new m(kotlinx.coroutines.rx3.y.a(interfaceC43779a.getF103348p()), this, interfaceC43779a));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<InterfaceC47306b> b(@Y61.k InterfaceC47305a interfaceC47305a, @Y61.k InterfaceC47308d interfaceC47308d) {
        C43210w c43210w;
        if (!(interfaceC47308d instanceof InterfaceC47308d.a)) {
            return C43175k.w();
        }
        if (interfaceC47305a.equals(InterfaceC47305a.C12316a.f429162a)) {
            return C43175k.G(new c(interfaceC47308d, null));
        }
        if (interfaceC47305a.equals(InterfaceC47305a.d.f429165a)) {
            return C43175k.G(new d(interfaceC47308d, null));
        }
        if (interfaceC47305a.equals(InterfaceC47305a.b.f429163a)) {
            UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel = ((InterfaceC47308d.a) interfaceC47308d).f429175a;
            c43210w = new C43210w(new InterfaceC47306b.f(C42745f0.U(new InterfaceC47308d.a.C12320a(userAdvertsFiltersBeduinModel.f316059g, this.f316089e.e()), new InterfaceC47308d.a.C12320a(userAdvertsFiltersBeduinModel.f316057e, this.f316088d.e()))));
        } else {
            if (!interfaceC47305a.equals(InterfaceC47305a.c.f429164a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(InterfaceC47306b.a.f429166a);
        }
        return c43210w;
    }

    public final Object j(InterfaceC43779a interfaceC43779a, String str, List list, ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f316087c.b(), new v(str, list, interfaceC43779a, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
