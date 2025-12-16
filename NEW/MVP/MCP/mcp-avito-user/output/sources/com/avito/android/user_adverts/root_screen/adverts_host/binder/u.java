package com.avito.android.user_adverts.root_screen.adverts_host.binder;

import androidx.view.InterfaceC22983P;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.root_screen.adverts_host.shortcuts.mvi.e0;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.M;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import wI0.C49518c;
import wI0.InterfaceC49516a;

/* compiled from: ShortcutsStateEventBinder.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/u;", "LwI0/a;", "LTI0/c;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class u implements InterfaceC49516a<TI0.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f312508a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k f312509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C49518c<TI0.c> f312510c;

    /* compiled from: ShortcutsStateEventBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/binder/u$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final e0 f312511a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final R0 f312512b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k f312513c;

        @Inject
        public a(@Y61.k e0 e0Var, @Y61.k R0 r02, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k kVar) {
            this.f312511a = e0Var;
            this.f312512b = r02;
            this.f312513c = kVar;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/q1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.host_view.b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f312514b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k f312515c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/q1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f312516b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k f312517c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.binder.ShortcutsStateEventBinder$bindHostViewEvent$$inlined$mapNotNull$1$2", f = "ShortcutsStateEventBinder.kt", i = {}, l = {221}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.binder.u$b$a$a, reason: collision with other inner class name */
            public static final class C9545a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f312518q;

                /* renamed from: r, reason: collision with root package name */
                public int f312519r;

                public C9545a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f312518q = obj;
                    this.f312519r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k kVar) {
                this.f312516b = interfaceC43172j;
                this.f312517c = kVar;
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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.root_screen.adverts_host.binder.u.b.a.C9545a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.root_screen.adverts_host.binder.u$b$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.binder.u.b.a.C9545a) r0
                    int r1 = r0.f312519r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f312519r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.root_screen.adverts_host.binder.u$b$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.binder.u$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f312518q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f312519r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L50
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    TI0.c r5 = (TI0.c) r5
                    com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k r6 = r4.f312517c
                    r6.getClass()
                    boolean r5 = r5.f15560i
                    if (r5 != 0) goto L41
                    r5 = 0
                    goto L43
                L41:
                    com.avito.android.user_adverts.root_screen.adverts_host.host_view.b$d r5 = com.avito.android.user_adverts.root_screen.adverts_host.host_view.b.d.f313010a
                L43:
                    if (r5 == 0) goto L50
                    r0.f312519r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f312516b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L50
                    return r1
                L50:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.binder.u.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k kVar) {
            this.f312514b = interfaceC43160i;
            this.f312515c = kVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.user_adverts.root_screen.adverts_host.host_view.b> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f312514b.collect(new a(interfaceC43172j, this.f312515c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: ShortcutsStateEventBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTI0/c;", VoiceInfo.STATE, "", "invoke", "(LTI0/c;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<TI0.c, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f312521l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(TI0.c cVar) {
            return Boolean.valueOf(cVar.f15560i);
        }
    }

    public u() {
        throw null;
    }

    public u(n2 n2Var, InterfaceC22983P interfaceC22983P, M m12, com.avito.android.user_adverts.root_screen.adverts_host.binder.mapper.k kVar, C42822w c42822w) {
        this.f312508a = m12;
        this.f312509b = kVar;
        this.f312510c = new C49518c<>(n2Var, interfaceC22983P);
    }

    @Y61.k
    public final InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.host_view.b> a() {
        return C43175k.I(this.f312508a, new b(C43175k.s(this.f312510c.f441371a.f441370b, c.f312521l), this.f312509b));
    }
}
