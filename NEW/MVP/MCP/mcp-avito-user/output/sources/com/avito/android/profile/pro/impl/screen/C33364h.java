package com.avito.android.profile.pro.impl.screen;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import t90.InterfaceC48524a;

/* compiled from: ProfileProFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectContentEvents$1", f = "ProfileProFragment.kt", i = {}, l = {693}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile.pro.impl.screen.h, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33364h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f222964q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ProfileProFragment f222965r;

    /* compiled from: ProfileProFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "params", "Lcom/avito/android/profile/pro/impl/interactor/ProfileProWidgetsParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.h$a */
    public static final class a extends N implements Y41.l<ProfileProWidgetsParams, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f222966l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final String invoke(ProfileProWidgetsParams profileProWidgetsParams) {
            return profileProWidgetsParams.f222674b;
        }
    }

    /* compiled from: ProfileProFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.h$b */
    public /* synthetic */ class b implements InterfaceC43172j, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC48524a f222967b;

        public b(InterfaceC48524a interfaceC48524a) {
            this.f222967b = interfaceC48524a;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            this.f222967b.g((ProfileProWidgetsParams) obj);
            G0 g02 = G0.f406611a;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            return g02;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
                return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return new C42801a(2, this.f222967b, InterfaceC48524a.class, "trackContentEvent", "trackContentEvent(Lcom/avito/android/profile/pro/impl/interactor/ProfileProWidgetsParams;)V", 4);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.h$c */
    public static final class c implements InterfaceC43160i<D90.d> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f222968b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.pro.impl.screen.h$c$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f222969b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectContentEvents$1$invokeSuspend$$inlined$filter$1$2", f = "ProfileProFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.pro.impl.screen.h$c$a$a, reason: collision with other inner class name */
            public static final class C6742a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f222970q;

                /* renamed from: r, reason: collision with root package name */
                public int f222971r;

                public C6742a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f222970q = obj;
                    this.f222971r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f222969b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile.pro.impl.screen.C33364h.c.a.C6742a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.pro.impl.screen.h$c$a$a r0 = (com.avito.android.profile.pro.impl.screen.C33364h.c.a.C6742a) r0
                    int r1 = r0.f222971r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f222971r = r1
                    goto L18
                L13:
                    com.avito.android.profile.pro.impl.screen.h$c$a$a r0 = new com.avito.android.profile.pro.impl.screen.h$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f222970q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f222971r
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
                    r6 = r5
                    D90.d r6 = (D90.d) r6
                    boolean r2 = r6.f3062b
                    if (r2 != 0) goto L4a
                    java.lang.String r6 = r6.f3063c
                    if (r6 != 0) goto L4a
                    r0.f222971r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f222969b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.C33364h.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(n2 n2Var) {
            this.f222968b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super D90.d> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f222968b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.profile.pro.impl.screen.h$d */
    public static final class d implements InterfaceC43160i<ProfileProWidgetsParams> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f222973b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile.pro.impl.screen.h$d$a */
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f222974b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.profile.pro.impl.screen.ProfileProFragment$collectContentEvents$1$invokeSuspend$$inlined$map$1$2", f = "ProfileProFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.profile.pro.impl.screen.h$d$a$a, reason: collision with other inner class name */
            public static final class C6743a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f222975q;

                /* renamed from: r, reason: collision with root package name */
                public int f222976r;

                public C6743a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f222975q = obj;
                    this.f222976r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f222974b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.profile.pro.impl.screen.C33364h.d.a.C6743a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.profile.pro.impl.screen.h$d$a$a r0 = (com.avito.android.profile.pro.impl.screen.C33364h.d.a.C6743a) r0
                    int r1 = r0.f222976r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f222976r = r1
                    goto L18
                L13:
                    com.avito.android.profile.pro.impl.screen.h$d$a$a r0 = new com.avito.android.profile.pro.impl.screen.h$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f222975q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f222976r
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
                    D90.d r5 = (D90.d) r5
                    com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams r5 = r5.f3071k
                    r0.f222976r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f222974b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.pro.impl.screen.C33364h.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(c cVar) {
            this.f222973b = cVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super ProfileProWidgetsParams> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f222973b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33364h(ProfileProFragment profileProFragment, Continuation<? super C33364h> continuation) {
        super(2, continuation);
        this.f222965r = profileProFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C33364h(this.f222965r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C33364h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f222964q;
        if (i12 == 0) {
            C42729a0.b(obj);
            ProfileProFragment profileProFragment = this.f222965r;
            D d12 = profileProFragment.f222885t0;
            if (d12 == null) {
                d12 = null;
            }
            InterfaceC43160i interfaceC43160iS = C43175k.s(new d(new c(d12.getState())), a.f222966l);
            R0 r02 = profileProFragment.f222876O0;
            if (r02 == null) {
                r02 = null;
            }
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iS);
            t90.b bVar = profileProFragment.f222869H0;
            b bVar2 = new b(bVar != null ? bVar : null);
            this.f222964q = 1;
            if (interfaceC43160iI.collect(bVar2, this) == coroutine_suspended) {
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
