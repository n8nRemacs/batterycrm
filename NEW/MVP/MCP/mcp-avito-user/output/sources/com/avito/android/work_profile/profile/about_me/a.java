package com.avito.android.work_profile.profile.about_me;

import FV0.h;
import Y41.p;
import Y61.l;
import androidx.view.M0;
import androidx.view.N0;
import com.avito.android.arch.mvi.android.k;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.util.R0;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import com.avito.beduin.v2.engine.component.B;
import hQ0.C40868c;
import hQ0.InterfaceC40866a;
import hQ0.InterfaceC40867b;
import java.util.Set;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43188o0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.i2;
import kotlinx.coroutines.flow.internal.m;
import kotlinx.coroutines.flow.n2;

/* compiled from: AboutMeViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¨\u0006\u0006"}, d2 = {"Lcom/avito/android/work_profile/profile/about_me/a;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/arch/mvi/android/k;", "LhQ0/a$d;", "LhQ0/c;", "LhQ0/b$d;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a extends M0 implements k<InterfaceC40866a.d, C40868c, InterfaceC40867b.d> {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final B f330708E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final Set<h> f330709J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final aU0.b f330710K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final R0 f330711L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final ZS.b f330712M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f330713N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f330714O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final n2<C40868c> f330715P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final d f330716Q;

    /* compiled from: AboutMeViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$accept$1", f = "AboutMeViewModel.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.work_profile.profile.about_me.a$a, reason: collision with other inner class name */
    public static final class C10266a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330717q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40866a.d f330719s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10266a(InterfaceC40866a.d dVar, Continuation<? super C10266a> continuation) {
            super(2, continuation);
            this.f330719s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return a.this.new C10266a(this.f330719s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C10266a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330717q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.arch.mvi.c<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b> cVarLe = a.this.le();
                this.f330717q = 1;
                if (cVarLe.ya(this.f330719s, this) == coroutine_suspended) {
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

    /* compiled from: AboutMeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/mvi/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n.a f330720l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f330721m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n.a aVar, a aVar2) {
            super(0);
            this.f330720l = aVar;
            this.f330721m = aVar2;
        }

        @Override // Y41.a
        public final x<? super InterfaceC40047a, ? extends AbstractC40048c, ? extends BeduinOneTimeEvent> invoke() {
            return this.f330720l.a(N0.a(this.f330721m));
        }
    }

    /* compiled from: AboutMeViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/c;", "LhQ0/a;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "LhQ0/c;", "LhQ0/b;", "invoke", "()Lcom/avito/android/arch/mvi/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<com.avito.android.arch.mvi.c<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.work_profile.profile.about_me.mvi.g f330722l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f330723m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.work_profile.profile.about_me.mvi.g gVar, a aVar) {
            super(0);
            this.f330722l = gVar;
            this.f330723m = aVar;
        }

        @Override // Y41.a
        public final com.avito.android.arch.mvi.c<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b> invoke() {
            return this.f330722l.a(null, N0.a(this.f330723m));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/l1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m f330724b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/l1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.work_profile.profile.about_me.a$d$a, reason: collision with other inner class name */
        public static final class C10267a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f330725b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$filterIsInstance$1$2", f = "AboutMeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.work_profile.profile.about_me.a$d$a$a, reason: collision with other inner class name */
            public static final class C10268a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f330726q;

                /* renamed from: r, reason: collision with root package name */
                public int f330727r;

                public C10268a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f330726q = obj;
                    this.f330727r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10267a.this.emit(null, this);
                }
            }

            public C10267a(InterfaceC43172j interfaceC43172j) {
                this.f330725b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.work_profile.profile.about_me.a.d.C10267a.C10268a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.work_profile.profile.about_me.a$d$a$a r0 = (com.avito.android.work_profile.profile.about_me.a.d.C10267a.C10268a) r0
                    int r1 = r0.f330727r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f330727r = r1
                    goto L18
                L13:
                    com.avito.android.work_profile.profile.about_me.a$d$a$a r0 = new com.avito.android.work_profile.profile.about_me.a$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f330726q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f330727r
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
                    boolean r6 = r5 instanceof hQ0.InterfaceC40867b.d
                    if (r6 == 0) goto L43
                    r0.f330727r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f330725b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.a.d.C10267a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(m mVar) {
            this.f330724b = mVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@Y61.k InterfaceC43172j<? super Object> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f330724b.collect(new C10267a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$1", f = "AboutMeViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<InterfaceC43172j<? super C40868c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330729q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330730r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C43188o0 f330731s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f330732t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.work_profile.profile.about_me.a$e$a, reason: collision with other inner class name */
        public static final class C10269a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<C40868c> f330733b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f330734c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$1$1", f = "AboutMeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.work_profile.profile.about_me.a$e$a$a, reason: collision with other inner class name */
            public static final class C10270a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f330735q;

                /* renamed from: r, reason: collision with root package name */
                public int f330736r;

                public C10270a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f330735q = obj;
                    this.f330736r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10269a.this.emit(null, this);
                }
            }

            public C10269a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f330734c = aVar;
                this.f330733b = interfaceC43172j;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.work_profile.profile.about_me.a.e.C10269a.C10270a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.work_profile.profile.about_me.a$e$a$a r0 = (com.avito.android.work_profile.profile.about_me.a.e.C10269a.C10270a) r0
                    int r1 = r0.f330736r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f330736r = r1
                    goto L18
                L13:
                    com.avito.android.work_profile.profile.about_me.a$e$a$a r0 = new com.avito.android.work_profile.profile.about_me.a$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f330735q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f330736r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    eT.c r5 = (kotlin.AbstractC40048c) r5
                    com.avito.android.work_profile.profile.about_me.a r6 = r4.f330734c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    hQ0.a$e r2 = new hQ0.a$e
                    r2.<init>(r5)
                    r0.f330736r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.a.e.C10269a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C43188o0 c43188o0, Continuation continuation, a aVar) {
            super(2, continuation);
            this.f330731s = c43188o0;
            this.f330732t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f330731s, continuation, this.f330732t);
            eVar.f330730r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super C40868c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330729q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C10269a c10269a = new C10269a((InterfaceC43172j) this.f330730r, this.f330732t);
                this.f330729q = 1;
                if (this.f330731s.collect(c10269a, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$2", f = "AboutMeViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40867b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330738q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330739r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f330740s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f330741t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.work_profile.profile.about_me.a$f$a, reason: collision with other inner class name */
        public static final class C10271a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC40867b> f330742b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f330743c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$2$1", f = "AboutMeViewModel.kt", i = {}, l = {220, 222}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.work_profile.profile.about_me.a$f$a$a, reason: collision with other inner class name */
            public static final class C10272a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f330744q;

                /* renamed from: r, reason: collision with root package name */
                public int f330745r;

                public C10272a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f330744q = obj;
                    this.f330745r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10271a.this.emit(null, this);
                }
            }

            public C10271a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f330743c = aVar;
                this.f330742b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r6, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof com.avito.android.work_profile.profile.about_me.a.f.C10271a.C10272a
                    if (r0 == 0) goto L13
                    r0 = r7
                    com.avito.android.work_profile.profile.about_me.a$f$a$a r0 = (com.avito.android.work_profile.profile.about_me.a.f.C10271a.C10272a) r0
                    int r1 = r0.f330745r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f330745r = r1
                    goto L18
                L13:
                    com.avito.android.work_profile.profile.about_me.a$f$a$a r0 = new com.avito.android.work_profile.profile.about_me.a$f$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f330744q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f330745r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L35
                    if (r2 == r4) goto L31
                    if (r2 != r3) goto L29
                    goto L31
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    kotlin.C42729a0.b(r7)
                    goto L72
                L35:
                    kotlin.C42729a0.b(r7)
                    hQ0.b r6 = (hQ0.InterfaceC40867b) r6
                    boolean r7 = r6 instanceof hQ0.InterfaceC40867b.d
                    if (r7 == 0) goto L49
                    r0.f330745r = r4
                    kotlinx.coroutines.flow.j<hQ0.b> r7 = r5.f330742b
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L72
                    return r1
                L49:
                    boolean r7 = r6 instanceof hQ0.InterfaceC40867b.c
                    if (r7 == 0) goto L72
                    r7 = r6
                    hQ0.b$c r7 = (hQ0.InterfaceC40867b.c) r7
                    boolean r7 = r7 instanceof hQ0.InterfaceC40867b.a
                    if (r7 == 0) goto L72
                    com.avito.android.work_profile.profile.about_me.a r7 = r5.f330743c
                    kotlin.C r2 = r7.f330714O
                    java.lang.Object r2 = r2.getValue()
                    com.avito.android.lib.beduin_v2.feature.mvi.x r2 = (com.avito.android.lib.beduin_v2.feature.mvi.x) r2
                    eT.a$e r4 = new eT.a$e
                    hQ0.b$a r6 = (hQ0.InterfaceC40867b.a) r6
                    java.lang.String r6 = r6.f397192a
                    ZS.b r7 = r7.f330712M
                    r4.<init>(r6, r7)
                    r0.f330745r = r3
                    java.lang.Object r6 = r2.ya(r4, r0)
                    if (r6 != r1) goto L72
                    return r1
                L72:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.a.f.C10271a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC43160i interfaceC43160i, Continuation continuation, a aVar) {
            super(2, continuation);
            this.f330740s = interfaceC43160i;
            this.f330741t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f330740s, continuation, this.f330741t);
            fVar.f330739r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC40867b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330738q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C10271a c10271a = new C10271a((InterfaceC43172j) this.f330739r, this.f330741t);
                this.f330738q = 1;
                if (this.f330740s.collect(c10271a, this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$3", f = "AboutMeViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40867b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f330747q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f330748r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f330749s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f330750t;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.work_profile.profile.about_me.a$g$a, reason: collision with other inner class name */
        public static final class C10273a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC40867b> f330751b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f330752c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.AboutMeViewModel$special$$inlined$transform$3$1", f = "AboutMeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.work_profile.profile.about_me.a$g$a$a, reason: collision with other inner class name */
            public static final class C10274a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f330753q;

                /* renamed from: r, reason: collision with root package name */
                public int f330754r;

                public C10274a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f330753q = obj;
                    this.f330754r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C10273a.this.emit(null, this);
                }
            }

            public C10273a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f330752c = aVar;
                this.f330751b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.work_profile.profile.about_me.a.g.C10273a.C10274a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.work_profile.profile.about_me.a$g$a$a r0 = (com.avito.android.work_profile.profile.about_me.a.g.C10273a.C10274a) r0
                    int r1 = r0.f330754r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f330754r = r1
                    goto L18
                L13:
                    com.avito.android.work_profile.profile.about_me.a$g$a$a r0 = new com.avito.android.work_profile.profile.about_me.a$g$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f330753q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f330754r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent r5 = (com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent) r5
                    com.avito.android.work_profile.profile.about_me.a r6 = r4.f330752c
                    com.avito.android.arch.mvi.c r6 = r6.le()
                    hQ0.a$a r2 = new hQ0.a$a
                    r2.<init>(r5)
                    r0.f330754r = r3
                    java.lang.Object r5 = r6.ya(r2, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.a.g.C10273a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC43160i interfaceC43160i, Continuation continuation, a aVar) {
            super(2, continuation);
            this.f330749s = interfaceC43160i;
            this.f330750t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f330749s, continuation, this.f330750t);
            gVar.f330748r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC40867b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f330747q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C10273a c10273a = new C10273a((InterfaceC43172j) this.f330748r, this.f330750t);
                this.f330747q = 1;
                if (this.f330749s.collect(c10273a, this) == coroutine_suspended) {
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
    public a(@Y61.k com.avito.android.work_profile.profile.about_me.mvi.g gVar, @Y61.k n.a aVar, @Y61.k B b12, @Y61.k Set<h> set, @Y61.k aU0.b bVar, @Y61.k R0 r02, @Y61.k ZS.b bVar2) {
        this.f330708E = b12;
        this.f330709J = set;
        this.f330710K = bVar;
        this.f330711L = r02;
        this.f330712M = bVar2;
        this.f330713N = C42727D.c(new c(gVar, this));
        InterfaceC42726C interfaceC42726CC = C42727D.c(new b(aVar, this));
        this.f330714O = interfaceC42726CC;
        m mVarN = C43175k.N(le(), C43175k.G(new e(C43175k.t((x) interfaceC42726CC.getValue(), 1), null, this)));
        A1.a aVarA = N0.a(this);
        i2.f411430a.getClass();
        i2 i2Var = i2.a.f411433c;
        C40868c.f397195c.getClass();
        this.f330715P = C43175k.U(mVarN, aVarA, i2Var, C40868c.f397196d);
        this.f330716Q = new d(C43175k.N(C43175k.G(new f(le().f91928q, null, this)), C43175k.G(new g(((x) interfaceC42726CC.getValue()).getEvents(), null, this))));
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<InterfaceC40867b.d> getEvents() {
        return this.f330716Q;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<C40868c> getState() {
        return this.f330715P;
    }

    @Override // com.avito.android.arch.mvi.android.l
    /* renamed from: ke, reason: merged with bridge method [inline-methods] */
    public final void accept(@Y61.k InterfaceC40866a.d dVar) {
        C43259k.d(N0.a(this), this.f330711L.b(), null, new C10266a(dVar, null), 2);
    }

    public final com.avito.android.arch.mvi.c<InterfaceC40866a, AboutMeInternalAction, C40868c, InterfaceC40867b> le() {
        return (com.avito.android.arch.mvi.c) this.f330713N.getValue();
    }
}
