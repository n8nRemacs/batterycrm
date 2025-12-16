package com.avito.android.select_districts.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.District;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import java.util.Comparator;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.i2;

/* compiled from: SelectDistrictsSearchInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/domain/p;", "Lcom/avito/android/select_districts/domain/o;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f266938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.select_districts.domain.b f266939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f266940c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<com.avito.android.select_districts.domain.a> f266941d;

    /* compiled from: SelectDistrictsSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_districts/domain/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.select_districts.domain.SelectDistrictsSearchInteractorImpl$searchResultFlow$2", f = "SelectDistrictsSearchInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super com.avito.android.select_districts.domain.a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f266942q;

        public a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.select_districts.domain.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            a aVar = new a(3, continuation);
            aVar.f266942q = th2;
            return aVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.e("An error occurred while searching", this.f266942q);
            return G0.f406611a;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f266943b;

        public b(String str) {
            this.f266943b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            String title = ((District) t12).getTitle();
            String str = this.f266943b;
            return kotlin.comparisons.a.b(Integer.valueOf(!C43066x.h0(title, str, true) ? 1 : 0), Integer.valueOf(!C43066x.h0(((District) t13).getTitle(), str, true) ? 1 : 0));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<com.avito.android.select_districts.domain.a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f266944b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f266945c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f266946b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p f266947c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.select_districts.domain.SelectDistrictsSearchInteractorImpl$special$$inlined$map$1$2", f = "SelectDistrictsSearchInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.select_districts.domain.p$c$a$a, reason: collision with other inner class name */
            public static final class C7963a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f266948q;

                /* renamed from: r, reason: collision with root package name */
                public int f266949r;

                public C7963a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f266948q = obj;
                    this.f266949r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, p pVar) {
                this.f266946b = interfaceC43172j;
                this.f266947c = pVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.avito.android.select_districts.domain.p.c.a.C7963a
                    if (r0 == 0) goto L13
                    r0 = r9
                    com.avito.android.select_districts.domain.p$c$a$a r0 = (com.avito.android.select_districts.domain.p.c.a.C7963a) r0
                    int r1 = r0.f266949r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f266949r = r1
                    goto L18
                L13:
                    com.avito.android.select_districts.domain.p$c$a$a r0 = new com.avito.android.select_districts.domain.p$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f266948q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f266949r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r9)
                    goto L94
                L29:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L31:
                    kotlin.C42729a0.b(r9)
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r9 = kotlin.text.C43066x.K(r8)
                    if (r9 == 0) goto L3f
                    com.avito.android.select_districts.domain.a$c r8 = com.avito.android.select_districts.domain.a.c.f266917a
                    goto L89
                L3f:
                    com.avito.android.select_districts.domain.p r9 = r7.f266947c
                    com.avito.android.select_districts.domain.d r2 = r9.f266938a
                    java.util.ArrayList r2 = r2.getF266922b()
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r4.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L50:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L6b
                    java.lang.Object r5 = r2.next()
                    r6 = r5
                    com.avito.android.remote.model.District r6 = (com.avito.android.remote.model.District) r6
                    java.lang.String r6 = r6.getTitle()
                    boolean r6 = kotlin.text.C43066x.q(r6, r8, r3)
                    if (r6 == 0) goto L50
                    r4.add(r5)
                    goto L50
                L6b:
                    com.avito.android.select_districts.domain.p$b r2 = new com.avito.android.select_districts.domain.p$b
                    r2.<init>(r8)
                    java.util.List r8 = kotlin.collections.C42745f0.B0(r4, r2)
                    boolean r2 = r8.isEmpty()
                    if (r2 == 0) goto L7d
                    com.avito.android.select_districts.domain.a$a r8 = com.avito.android.select_districts.domain.a.C7962a.f266915a
                    goto L89
                L7d:
                    com.avito.android.select_districts.domain.a$b r2 = new com.avito.android.select_districts.domain.a$b
                    com.avito.android.select_districts.domain.b r9 = r9.f266939b
                    java.util.ArrayList r8 = r9.a(r8)
                    r2.<init>(r8)
                    r8 = r2
                L89:
                    r0.f266949r = r3
                    kotlinx.coroutines.flow.j r9 = r7.f266946b
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L94
                    return r1
                L94:
                    kotlin.G0 r8 = kotlin.G0.f406611a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.select_districts.domain.p.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(InterfaceC43160i interfaceC43160i, p pVar) {
            this.f266944b = interfaceC43160i;
            this.f266945c = pVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.select_districts.domain.a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f266944b.collect(new a(interfaceC43172j, this.f266945c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public p(@Y61.k R0 r02, @Y61.k T t12, @Y61.k d dVar, @Y61.k com.avito.android.select_districts.domain.b bVar) {
        this.f266938a = dVar;
        this.f266939b = bVar;
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f266940c = e2VarB;
        InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), new C43152f0(C43175k.r(new c(C43175k.n(e2VarB, 400L), this)), new a(3, null)));
        i2.f411430a.getClass();
        this.f266941d = C43175k.S(interfaceC43160iI, t12, i2.a.f411433c, 0);
    }

    @Override // com.avito.android.select_districts.domain.o
    public final void a(@Y61.k String str) {
        this.f266940c.K5(str);
    }

    @Override // com.avito.android.select_districts.domain.o
    @Y61.k
    public final InterfaceC43160i<com.avito.android.select_districts.domain.a> b() {
        return this.f266941d;
    }
}
