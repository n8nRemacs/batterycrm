package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder;

import W80.d;
import X80.b;
import X80.c;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchPositionViewModelBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c;", "", "a", "b", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c f220768a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a f220769b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f220770c;

    /* compiled from: SearchPositionViewModelBinder.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$a;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final R0 f220771a;

        @Inject
        public a(@Y61.k R0 r02) {
            this.f220771a = r02;
        }
    }

    /* compiled from: SearchPositionViewModelBinder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b;", "", "a", "b", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: SearchPositionViewModelBinder.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b$a;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final b.g f220772a;

            public a(@Y61.k b.g gVar) {
                this.f220772a = gVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f220772a, ((a) obj).f220772a);
            }

            public final int hashCode() {
                return this.f220772a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Action(action=" + this.f220772a + ')';
            }
        }

        /* compiled from: SearchPositionViewModelBinder.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b$b;", "Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/c$b;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6659b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C6659b f220773a = new C6659b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C6659b);
            }

            public final int hashCode() {
                return 2058789402;
            }

            @Y61.k
            public final String toString() {
                return "NoneAction";
            }
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c, reason: collision with other inner class name */
    public static final class C6660c implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1 f220774b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f220775b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.SearchPositionViewModelBinder$bindPositionInfoToPeriodAction$$inlined$filterIsInstance$1$2", f = "SearchPositionViewModelBinder.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c$a$a, reason: collision with other inner class name */
            public static final class C6661a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f220776q;

                /* renamed from: r, reason: collision with root package name */
                public int f220777r;

                public C6661a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f220776q = obj;
                    this.f220777r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f220775b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.C6660c.a.C6661a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.C6660c.a.C6661a) r0
                    int r1 = r0.f220777r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220777r = r1
                    goto L18
                L13:
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f220776q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f220777r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    boolean r6 = r5 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.b.a
                    if (r6 == 0) goto L43
                    r0.f220777r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f220775b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.C6660c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C6660c(C1 c12) {
            this.f220774b = c12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f220774b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<X80.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C6660c f220779b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f220780b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.SearchPositionViewModelBinder$bindPositionInfoToPeriodAction$$inlined$map$1$2", f = "SearchPositionViewModelBinder.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$d$a$a, reason: collision with other inner class name */
            public static final class C6662a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f220781q;

                /* renamed from: r, reason: collision with root package name */
                public int f220782r;

                public C6662a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f220781q = obj;
                    this.f220782r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f220780b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.d.a.C6662a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$d$a$a r0 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.d.a.C6662a) r0
                    int r1 = r0.f220782r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f220782r = r1
                    goto L18
                L13:
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$d$a$a r0 = new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f220781q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f220782r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c$b$a r5 = (com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.b.a) r5
                    X80.b$g r5 = r5.f220772a
                    r0.f220782r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f220780b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder.c.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(C6660c c6660c) {
            this.f220779b = c6660c;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super X80.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f220779b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SearchPositionViewModelBinder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends C42801a implements Y41.q<W80.h, X80.j, Continuation<? super b>, Object>, SuspendFunction {
        @Override // Y41.q
        public final Object invoke(W80.h hVar, X80.j jVar, Continuation<? super b> continuation) {
            W80.h hVar2 = hVar;
            X80.j jVar2 = jVar;
            ((c) this.receiver).getClass();
            W80.d dVar = hVar2.f17799e;
            if (dVar instanceof d.C1254d) {
                return b.C6659b.f220773a;
            }
            if (dVar instanceof d.b) {
                return b.C6659b.f220773a;
            }
            if (dVar instanceof d.a) {
                return jVar2.f18714f instanceof c.d ? new b.a(b.f.f18660a) : new b.a(new b.i(hVar2.f17797c));
            }
            if (dVar instanceof d.c) {
                return b.C6659b.f220773a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: SearchPositionViewModelBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LX80/b;", "action", "Lkotlin/G0;", "emit", "(LX80/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements InterfaceC43172j {
        public f() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            c.this.f220769b.accept((X80.b) obj);
            return G0.f406611a;
        }
    }

    public c(com.avito.android.position_in_search.stats.screen.old_position_in_search.view.c cVar, com.avito.android.position_in_search.stats.screen.old_position_in_search.view.a aVar, R0 r02, C42822w c42822w) {
        this.f220768a = cVar;
        this.f220769b = aVar;
        this.f220770c = r02;
    }

    @Y61.l
    public final Object a(@Y61.k Continuation<? super G0> continuation) {
        Object objCollect = C43175k.I(this.f220770c.c(), new d(new C6660c(new C1(this.f220768a.getState(), this.f220769b.getState(), new e(3, this, c.class, "mapToAction", "mapToAction(Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/info/entity/PositionInfoState;Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/mvi/period/entity/PeriodInfoState;)Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/binder/SearchPositionViewModelBinder$PeriodActionWrapper;", 4))))).collect(new f(), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
