package androidx.compose.ui.platform;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/V1;", "", "<anonymous>", "(Landroidx/compose/ui/platform/V1;)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {248}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class I0 extends SuspendLambda implements Y41.p<V1, Continuation<?>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f41138q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f41139r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f41140s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J0 f41141t;

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/I0$a", "Landroidx/compose/ui/platform/V1;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements V1 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V1 f41142b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V1 f41143c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f41144d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ J0 f41145e;

        public a(V1 v12, AtomicReference atomicReference, J0 j02) {
            this.f41143c = v12;
            this.f41144d = atomicReference;
            this.f41145e = j02;
            this.f41142b = v12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.compose.ui.platform.U1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(androidx.compose.ui.platform.O1 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof androidx.compose.ui.platform.F0
                if (r0 == 0) goto L13
                r0 = r9
                androidx.compose.ui.platform.F0 r0 = (androidx.compose.ui.platform.F0) r0
                int r1 = r0.f41113s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f41113s = r1
                goto L18
            L13:
                androidx.compose.ui.platform.F0 r0 = new androidx.compose.ui.platform.F0
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f41111q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f41113s
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 == r3) goto L2d
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2d:
                kotlin.C42729a0.b(r9)
                goto L4b
            L31:
                kotlin.C42729a0.b(r9)
                androidx.compose.ui.platform.G0 r9 = androidx.compose.ui.platform.G0.f41116l
                androidx.compose.ui.platform.H0 r2 = new androidx.compose.ui.platform.H0
                r4 = 0
                androidx.compose.ui.platform.J0 r5 = r7.f41145e
                androidx.compose.ui.platform.V1 r6 = r7.f41143c
                r2.<init>(r5, r8, r6, r4)
                r0.f41113s = r3
                java.util.concurrent.atomic.AtomicReference r8 = r7.f41144d
                java.lang.Object r8 = androidx.compose.ui.B.b(r8, r9, r2, r0)
                if (r8 != r1) goto L4b
                return r1
            L4b:
                kotlin.KotlinNothingValueException r8 = new kotlin.KotlinNothingValueException
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.I0.a.b(androidx.compose.ui.platform.O1, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
        }

        @Override // kotlinx.coroutines.T
        /* renamed from: getCoroutineContext */
        public final CoroutineContext getF400511d() {
            return this.f41142b.getF400511d();
        }

        @Override // androidx.compose.ui.platform.U1
        public final View getView() {
            return this.f41142b.getView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I0(Y41.p<? super V1, ? super Continuation<?>, ? extends Object> pVar, J0 j02, Continuation<? super I0> continuation) {
        super(2, continuation);
        this.f41140s = (SuspendLambda) pVar;
        this.f41141t = j02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        I0 i02 = new I0(this.f41140s, this.f41141t, continuation);
        i02.f41139r = obj;
        return i02;
    }

    @Override // Y41.p
    public final Object invoke(V1 v12, Continuation<?> continuation) {
        return ((I0) create(v12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f41138q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((V1) this.f41139r, new AtomicReference(null), this.f41141t);
            this.f41138q = 1;
            if (this.f41140s.invoke(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
