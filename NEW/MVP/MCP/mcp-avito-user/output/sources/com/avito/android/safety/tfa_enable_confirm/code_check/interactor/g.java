package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.EmptyDeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import oo0.InterfaceC44834b;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements InterfaceC43160i<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f258142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmptyDeepLink f258143c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f258144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f258145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC44834b f258146f;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f258147b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EmptyDeepLink f258148c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f258149d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f258150e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC44834b f258151f;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.safety.tfa_enable_confirm.code_check.interactor.TfaEnableCodeCheckCodeConfirmInteractorImpl$confirm$1$result$1$3$invoke$$inlined$map$1$2", f = "TfaEnableCodeCheckCodeConfirmInteractor.kt", i = {}, l = {222, 219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g$a$a, reason: collision with other inner class name */
        public static final class C7750a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f258152q;

            /* renamed from: r, reason: collision with root package name */
            public int f258153r;

            /* renamed from: s, reason: collision with root package name */
            public InterfaceC43172j f258154s;

            public C7750a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f258152q = obj;
                this.f258153r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, EmptyDeepLink emptyDeepLink, i iVar, String str, InterfaceC44834b interfaceC44834b) {
            this.f258147b = interfaceC43172j;
            this.f258148c = emptyDeepLink;
            this.f258149d = iVar;
            this.f258150e = str;
            this.f258151f = interfaceC44834b;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x007b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, @Y61.k kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g.a.C7750a
                if (r0 == 0) goto L13
                r0 = r10
                com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g$a$a r0 = (com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g.a.C7750a) r0
                int r1 = r0.f258153r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f258153r = r1
                goto L18
            L13:
                com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g$a$a r0 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f258152q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f258153r
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L3b
                if (r2 == r5) goto L35
                if (r2 != r4) goto L2d
                kotlin.C42729a0.b(r10)
                goto L7c
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                kotlinx.coroutines.flow.j r9 = r0.f258154s
                kotlin.C42729a0.b(r10)
                goto L70
            L3b:
                kotlin.C42729a0.b(r10)
                com.avito.android.deep_linking.links.DeepLink r9 = (com.avito.android.deep_linking.links.DeepLink) r9
                com.avito.android.deep_linking.links.EmptyDeepLink r10 = r8.f258148c
                boolean r9 = kotlin.jvm.internal.L.f(r9, r10)
                kotlinx.coroutines.flow.j r10 = r8.f258147b
                if (r9 == 0) goto L71
                oo0.b r9 = r8.f258151f
                oo0.b$b r9 = (oo0.InterfaceC44834b.C12197b) r9
                java.lang.String r9 = r9.getHash()
                com.avito.android.safety.tfa_enable_confirm.code_check.interactor.i r2 = r8.f258149d
                r2.getClass()
                com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h r6 = new com.avito.android.safety.tfa_enable_confirm.code_check.interactor.h
                java.lang.String r7 = r8.f258150e
                r6.<init>(r2, r7, r9, r3)
                kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.C43175k.G(r6)
                r0.f258154s = r10
                r0.f258153r = r5
                kotlinx.coroutines.flow.Y1<To.a> r2 = r2.f258172d
                java.lang.Object r9 = kotlinx.coroutines.flow.C43175k.u(r0, r9, r2)
                if (r9 != r1) goto L6f
                return r1
            L6f:
                r9 = r10
            L70:
                r10 = r9
            L71:
                r0.f258154s = r3
                r0.f258153r = r4
                java.lang.Object r9 = r10.emit(r3, r0)
                if (r9 != r1) goto L7c
                return r1
            L7c:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safety.tfa_enable_confirm.code_check.interactor.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public g(InterfaceC43160i interfaceC43160i, EmptyDeepLink emptyDeepLink, i iVar, String str, InterfaceC44834b interfaceC44834b) {
        this.f258142b = interfaceC43160i;
        this.f258143c = emptyDeepLink;
        this.f258144d = iVar;
        this.f258145e = str;
        this.f258146f = interfaceC44834b;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Void> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f258142b.collect(new a(interfaceC43172j, this.f258143c, this.f258144d, this.f258145e, this.f258146f), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
