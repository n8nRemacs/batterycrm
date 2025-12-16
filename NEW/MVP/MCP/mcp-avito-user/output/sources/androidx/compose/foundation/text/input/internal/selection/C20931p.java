package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TextFieldSelectionState.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState", f = "TextFieldSelectionState.kt", i = {0}, l = {1325, 1327}, m = "canPaste", n = {"this"}, s = {"L$0"})
/* renamed from: androidx.compose.foundation.text.input.internal.selection.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20931p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public TextFieldSelectionState f31404q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f31405r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionState f31406s;

    /* renamed from: t, reason: collision with root package name */
    public int f31407t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20931p(TextFieldSelectionState textFieldSelectionState, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f31406s = textFieldSelectionState;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
        /*
            r7 = this;
            r7.f31405r = r8
            int r8 = r7.f31407t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r0
            r7.f31407t = r8
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r7.f31406s
            r8.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.text.input.internal.selection.C20931p
            if (r0 == 0) goto L1f
            int r0 = r7.f31407t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L1f
            int r0 = r0 - r1
            r7.f31407t = r0
            r0 = r7
            goto L24
        L1f:
            androidx.compose.foundation.text.input.internal.selection.p r0 = new androidx.compose.foundation.text.input.internal.selection.p
            r0.<init>(r8, r7)
        L24:
            java.lang.Object r1 = r0.f31405r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f31407t
            r4 = 2
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L47
            if (r3 == r6) goto L41
            if (r3 != r4) goto L39
            kotlin.C42729a0.b(r1)
            goto L93
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L41:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8 = r0.f31404q
            kotlin.C42729a0.b(r1)
            goto L61
        L47:
            kotlin.C42729a0.b(r1)
            boolean r1 = r8.f31261b
            if (r1 == 0) goto L9e
            boolean r1 = r8.f31262c
            if (r1 != 0) goto L9e
            androidx.compose.ui.platform.M0 r1 = r8.f31267h
            if (r1 == 0) goto L6d
            r0.f31404q = r8
            r0.f31407t = r6
            androidx.compose.ui.platform.K0 r1 = r1.a()
            if (r1 != r2) goto L61
            goto La2
        L61:
            androidx.compose.ui.platform.K0 r1 = (androidx.compose.ui.platform.K0) r1
            if (r1 == 0) goto L6d
            boolean r1 = androidx.compose.foundation.internal.b.a(r1)
            if (r1 != r6) goto L6d
            r1 = r6
            goto L6e
        L6d:
            r1 = r5
        L6e:
            if (r1 == 0) goto L75
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            goto La2
        L75:
            Y41.a<? extends androidx.compose.foundation.content.internal.c> r1 = r8.f31269j
            r3 = 0
            if (r1 == 0) goto L81
            java.lang.Object r1 = r1.invoke()
            androidx.compose.foundation.content.internal.c r1 = (androidx.compose.foundation.content.internal.c) r1
            goto L82
        L81:
            r1 = r3
        L82:
            if (r1 == 0) goto L99
            androidx.compose.ui.platform.M0 r8 = r8.f31267h
            if (r8 == 0) goto L96
            r0.f31404q = r3
            r0.f31407t = r4
            androidx.compose.ui.platform.K0 r1 = r8.a()
            if (r1 != r2) goto L93
            goto La2
        L93:
            r3 = r1
            androidx.compose.ui.platform.K0 r3 = (androidx.compose.ui.platform.K0) r3
        L96:
            if (r3 == 0) goto L99
            r5 = r6
        L99:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            goto La2
        L9e:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.C20931p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
