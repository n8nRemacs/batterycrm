package Fc1;

import Fc1.C13725s3;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

@kotlin.jvm.internal.s0
/* renamed from: Fc1.d4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13592d4<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13725s3.b f5448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.w0 f5449c;

    @kotlin.jvm.internal.s0
    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.preview.compose.components.FeedbackPreviewDialogPanelListKt$FeedbackPreviewDialogPanelList$1$1$invokeSuspend$$inlined$map$1$2", f = "FeedbackPreviewDialogPanelList.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
    /* renamed from: Fc1.d4$a */
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5450q;

        /* renamed from: r, reason: collision with root package name */
        public int f5451r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f5450q = obj;
            this.f5451r |= BeduinInputModel.MIN_TEXT_VERSION;
            return C13592d4.this.emit(null, this);
        }
    }

    public C13592d4(C13725s3.b bVar, androidx.compose.foundation.lazy.w0 w0Var) {
        this.f5448b = bVar;
        this.f5449c = w0Var;
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
            boolean r0 = r8 instanceof Fc1.C13592d4.a
            if (r0 == 0) goto L13
            r0 = r8
            Fc1.d4$a r0 = (Fc1.C13592d4.a) r0
            int r1 = r0.f5451r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5451r = r1
            goto L18
        L13:
            Fc1.d4$a r0 = new Fc1.d4$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5450q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5451r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L6f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.C42729a0.b(r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.getClass()
            androidx.compose.foundation.lazy.w0 r7 = r6.f5449c
            androidx.compose.foundation.lazy.Y r8 = r7.j()
            long r4 = r8.c()
            androidx.compose.ui.unit.u$a r8 = androidx.compose.ui.unit.u.f42871b
            r8 = 32
            long r4 = r4 >> r8
            int r2 = (int) r4
            int r2 = r2 / 2
            int r4 = r7.i()
            if (r4 <= r2) goto L5d
            androidx.compose.foundation.lazy.Y r7 = r7.j()
            long r4 = r7.c()
            long r7 = r4 >> r8
            int r7 = (int) r7
            goto L60
        L5d:
            int r7 = kotlin.jvm.internal.J.f406821a
            r7 = 0
        L60:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r0.f5451r = r3
            Fc1.s3$b r8 = r6.f5448b
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L6f
            return r1
        L6f:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.C13592d4.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
