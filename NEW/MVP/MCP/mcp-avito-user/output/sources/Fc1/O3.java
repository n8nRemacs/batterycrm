package Fc1;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class O3<T> implements InterfaceC43172j {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13592d4 f5122b;

    @kotlin.jvm.internal.s0
    @DebugMetadata(c = "feedback.shared.sdk.ui.pages.fields.screenshot.dialogs.preview.compose.components.FeedbackPreviewDialogPanelListKt$FeedbackPreviewDialogPanelList$1$1$invokeSuspend$$inlined$filter$1$2", f = "FeedbackPreviewDialogPanelList.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5123q;

        /* renamed from: r, reason: collision with root package name */
        public int f5124r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f5123q = obj;
            this.f5124r |= BeduinInputModel.MIN_TEXT_VERSION;
            return O3.this.emit(null, this);
        }
    }

    public O3(C13592d4 c13592d4) {
        this.f5122b = c13592d4;
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
            boolean r0 = r6 instanceof Fc1.O3.a
            if (r0 == 0) goto L13
            r0 = r6
            Fc1.O3$a r0 = (Fc1.O3.a) r0
            int r1 = r0.f5124r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5124r = r1
            goto L18
        L13:
            Fc1.O3$a r0 = new Fc1.O3$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5123q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f5124r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r6)
            r6 = r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L48
            r0.f5124r = r3
            Fc1.d4 r6 = r4.f5122b
            java.lang.Object r5 = r6.emit(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fc1.O3.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
