package com.avito.android.code_check.code_confirm.mvi;

import To.InterfaceC15383a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import kv.C43501a;

/* compiled from: CodeConfirmBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/code_confirm/mvi/h;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/code_check/code_confirm/mvi/entity/CodeConfirmInternalAction;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements com.avito.android.arch.mvi.b<CodeConfirmInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f118729a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b f118730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C43210w f118731c = new C43210w(CodeConfirmInternalAction.RequestFocus.f118718b);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final c f118732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final d f118733e;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<InterfaceC15383a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f118734b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.p f118735c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.code_check.code_confirm.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C3457a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f118736b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Y41.p f118737c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.code_check.code_confirm.mvi.CodeConfirmBootstrap$observeDeeplinkResultWithMapper$lambda$0$$inlined$map$1$2", f = "CodeConfirmBootstrap.kt", i = {}, l = {219, 219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.code_confirm.mvi.h$a$a$a, reason: collision with other inner class name */
            public static final class C3458a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f118738q;

                /* renamed from: r, reason: collision with root package name */
                public int f118739r;

                /* renamed from: s, reason: collision with root package name */
                public InterfaceC43172j f118740s;

                public C3458a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f118738q = obj;
                    this.f118739r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3457a.this.emit(null, this);
                }
            }

            public C3457a(Y41.p pVar, InterfaceC43172j interfaceC43172j) {
                this.f118736b = interfaceC43172j;
                this.f118737c = pVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.avito.android.code_check.code_confirm.mvi.h.a.C3457a.C3458a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.code_check.code_confirm.mvi.h$a$a$a r0 = (com.avito.android.code_check.code_confirm.mvi.h.a.C3457a.C3458a) r0
                    int r1 = r0.f118739r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f118739r = r1
                    goto L18
                L13:
                    com.avito.android.code_check.code_confirm.mvi.h$a$a$a r0 = new com.avito.android.code_check.code_confirm.mvi.h$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f118738q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f118739r
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.C42729a0.b(r8)
                    goto L5b
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlinx.coroutines.flow.j r7 = r0.f118740s
                    kotlin.C42729a0.b(r8)
                    goto L4f
                L3a:
                    kotlin.C42729a0.b(r8)
                    kotlinx.coroutines.flow.j r8 = r6.f118736b
                    r0.f118740s = r8
                    r0.f118739r = r4
                    Y41.p r2 = r6.f118737c
                    java.lang.Object r7 = r2.invoke(r7, r0)
                    if (r7 != r1) goto L4c
                    return r1
                L4c:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L4f:
                    r2 = 0
                    r0.f118740s = r2
                    r0.f118739r = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5b
                    return r1
                L5b:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.mvi.h.a.C3457a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Y41.p pVar, InterfaceC43160i interfaceC43160i) {
            this.f118734b = interfaceC43160i;
            this.f118735c = pVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC15383a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f118734b).collect(new C3457a(this.f118735c, interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<CodeConfirmInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f118742b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f118743b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.code_check.code_confirm.mvi.CodeConfirmBootstrap$special$$inlined$map$1$2", f = "CodeConfirmBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.code_confirm.mvi.h$b$a$a, reason: collision with other inner class name */
            public static final class C3459a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f118744q;

                /* renamed from: r, reason: collision with root package name */
                public int f118745r;

                public C3459a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f118744q = obj;
                    this.f118745r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f118743b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.code_check.code_confirm.mvi.h.b.a.C3459a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.code_check.code_confirm.mvi.h$b$a$a r0 = (com.avito.android.code_check.code_confirm.mvi.h.b.a.C3459a) r0
                    int r1 = r0.f118745r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f118745r = r1
                    goto L18
                L13:
                    com.avito.android.code_check.code_confirm.mvi.h$b$a$a r0 = new com.avito.android.code_check.code_confirm.mvi.h$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f118744q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f118745r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    To.a r5 = (To.InterfaceC15383a) r5
                    com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction r5 = com.avito.android.code_check.code_confirm.mvi.f.a(r5)
                    r0.f118745r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f118743b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.mvi.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f118742b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super CodeConfirmInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f118742b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<CodeConfirmInternalAction> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C43189o1 f118747b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f118748b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.code_check.code_confirm.mvi.CodeConfirmBootstrap$special$$inlined$map$2$2", f = "CodeConfirmBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.code_confirm.mvi.h$c$a$a, reason: collision with other inner class name */
            public static final class C3460a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f118749q;

                /* renamed from: r, reason: collision with root package name */
                public int f118750r;

                public C3460a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f118749q = obj;
                    this.f118750r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f118748b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.code_check.code_confirm.mvi.h.c.a.C3460a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.code_check.code_confirm.mvi.h$c$a$a r0 = (com.avito.android.code_check.code_confirm.mvi.h.c.a.C3460a) r0
                    int r1 = r0.f118750r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f118750r = r1
                    goto L18
                L13:
                    com.avito.android.code_check.code_confirm.mvi.h$c$a$a r0 = new com.avito.android.code_check.code_confirm.mvi.h$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f118749q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f118750r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    To.a r5 = (To.InterfaceC15383a) r5
                    com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction r5 = com.avito.android.code_check.code_confirm.mvi.f.a(r5)
                    r0.f118750r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f118748b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.mvi.h.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(C43189o1 c43189o1) {
            this.f118747b = c43189o1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super CodeConfirmInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f118747b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements InterfaceC43160i<CodeConfirmInternalAction.SetCode> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f118752b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f118753b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.code_check.code_confirm.mvi.CodeConfirmBootstrap$special$$inlined$map$3$2", f = "CodeConfirmBootstrap.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.code_check.code_confirm.mvi.h$d$a$a, reason: collision with other inner class name */
            public static final class C3461a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f118754q;

                /* renamed from: r, reason: collision with root package name */
                public int f118755r;

                public C3461a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f118754q = obj;
                    this.f118755r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f118753b = interfaceC43172j;
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
                    boolean r0 = r6 instanceof com.avito.android.code_check.code_confirm.mvi.h.d.a.C3461a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.code_check.code_confirm.mvi.h$d$a$a r0 = (com.avito.android.code_check.code_confirm.mvi.h.d.a.C3461a) r0
                    int r1 = r0.f118755r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f118755r = r1
                    goto L18
                L13:
                    com.avito.android.code_check.code_confirm.mvi.h$d$a$a r0 = new com.avito.android.code_check.code_confirm.mvi.h$d$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f118754q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f118755r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction$SetCode r6 = new com.avito.android.code_check.code_confirm.mvi.entity.CodeConfirmInternalAction$SetCode
                    r6.<init>(r5)
                    r0.f118755r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f118753b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.code_check.code_confirm.mvi.h.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public d(InterfaceC43160i interfaceC43160i) {
            this.f118752b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super CodeConfirmInternalAction.SetCode> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f118752b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC43160i<InterfaceC15383a> interfaceC43160i, @Y61.k com.avito.android.code_check_public.screen.c cVar, @Y61.k com.avito.android.code_check.otp.a aVar2) {
        this.f118729a = aVar;
        this.f118730b = new b(interfaceC43160i);
        Y41.p<C43501a, Continuation<? super InterfaceC15383a>, Object> pVar = cVar.f119340h;
        this.f118732d = pVar != null ? new c(new C43189o1(new a(pVar, y.a(aVar.d9())))) : null;
        this.f118733e = new d(aVar2.a());
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CodeConfirmInternalAction> a() {
        return C43175k.M(C42745f0.C(C42756l.l0(new InterfaceC43160i[]{this.f118731c, this.f118732d, this.f118730b, this.f118733e})));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
