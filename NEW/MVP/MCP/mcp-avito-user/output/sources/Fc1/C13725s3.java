package Fc1;

import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22196w1;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

@kotlin.jvm.internal.s0
@DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.preview.compose.components.FeedbackPreviewDialogPanelListKt$FeedbackPreviewDialogPanelList$1$1", f = "FeedbackPreviewDialogPanelList.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY, 34}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: Fc1.s3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13725s3 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f5814q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f5815r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22196w1 f5816s;

    /* renamed from: Fc1.s3$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.w0 f5817l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.lazy.w0 w0Var) {
            super(0);
            this.f5817l = w0Var;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f5817l.f29721h.a());
        }
    }

    /* renamed from: Fc1.s3$b */
    public static final class b implements InterfaceC43172j<Integer> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.lazy.w0 f5818b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22196w1 f5819c;

        @DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.preview.compose.components.FeedbackPreviewDialogPanelListKt$FeedbackPreviewDialogPanelList$1$1$4", f = "FeedbackPreviewDialogPanelList.kt", i = {0}, l = {35}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: Fc1.s3$b$a */
        public static final class a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public b f5820q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f5821r;

            /* renamed from: t, reason: collision with root package name */
            public int f5823t;

            public a(Continuation<? super a> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f5821r = obj;
                this.f5823t |= BeduinInputModel.MIN_TEXT_VERSION;
                return b.this.a(0, this);
            }
        }

        public b(androidx.compose.foundation.lazy.w0 w0Var, InterfaceC22196w1 interfaceC22196w1) {
            this.f5818b = w0Var;
            this.f5819c = interfaceC22196w1;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(int r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof Fc1.C13725s3.b.a
                if (r0 == 0) goto L13
                r0 = r6
                Fc1.s3$b$a r0 = (Fc1.C13725s3.b.a) r0
                int r1 = r0.f5823t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f5823t = r1
                goto L18
            L13:
                Fc1.s3$b$a r0 = new Fc1.s3$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f5821r
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f5823t
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                Fc1.s3$b r5 = r0.f5820q
                kotlin.C42729a0.b(r6)
                goto L48
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                kotlin.C42729a0.b(r6)
                androidx.compose.foundation.lazy.w0 r6 = r4.f5818b
                int r2 = r6.h()
                r0.f5820q = r4
                r0.f5823t = r3
                java.lang.Object r5 = r6.f(r2, r5, r0)
                if (r5 != r1) goto L47
                return r1
            L47:
                r5 = r4
            L48:
                androidx.compose.runtime.w1 r6 = r5.f5819c
                androidx.compose.foundation.lazy.w0 r5 = r5.f5818b
                int r5 = r5.h()
                r6.L3(r5)
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc1.C13725s3.b.a(int, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final /* bridge */ /* synthetic */ Object emit(Integer num, Continuation continuation) {
            return a(num.intValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13725s3(androidx.compose.foundation.lazy.w0 w0Var, InterfaceC22196w1 interfaceC22196w1, Continuation<? super C13725s3> continuation) {
        super(2, continuation);
        this.f5815r = w0Var;
        this.f5816s = interfaceC22196w1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C13725s3(this.f5815r, this.f5816s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C13725s3) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f5814q;
        androidx.compose.foundation.lazy.w0 w0Var = this.f5815r;
        InterfaceC22196w1 interfaceC22196w1 = this.f5816s;
        if (i12 == 0) {
            C42729a0.b(obj);
            int iE2 = interfaceC22196w1.e();
            this.f5814q = 1;
            w0.c cVar = androidx.compose.foundation.lazy.w0.f29712w;
            if (w0Var.k(iE2, 0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return kotlin.G0.f406611a;
            }
            C42729a0.b(obj);
        }
        InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(w0Var));
        b bVar = new b(w0Var, interfaceC22196w1);
        this.f5814q = 2;
        Object objCollect = interfaceC43160iN.collect(new O3(new C13592d4(bVar, w0Var)), this);
        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollect = kotlin.G0.f406611a;
        }
        if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objCollect = kotlin.G0.f406611a;
        }
        if (objCollect == coroutine_suspended) {
            return coroutine_suspended;
        }
        return kotlin.G0.f406611a;
    }
}
