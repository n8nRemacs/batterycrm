package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ContextMenuGestures.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0040 -> B:18:0x0043). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.ui.input.pointer.InterfaceC22325c r8, kotlin.coroutines.jvm.internal.BaseContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.contextmenu.h
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.contextmenu.h r0 = (androidx.compose.foundation.contextmenu.h) r0
            int r1 = r0.f27030s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27030s = r1
            goto L18
        L13:
            androidx.compose.foundation.contextmenu.h r0 = new androidx.compose.foundation.contextmenu.h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f27029r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27030s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.c r8 = r0.f27028q
            kotlin.C42729a0.b(r9)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.C42729a0.b(r9)
        L36:
            r0.f27028q = r8
            r0.f27030s = r3
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.f40174c
            java.lang.Object r9 = r8.N1(r9, r0)
            if (r9 != r1) goto L43
            goto L73
        L43:
            androidx.compose.ui.input.pointer.s r9 = (androidx.compose.ui.input.pointer.C22340s) r9
            int r2 = r9.f40280c
            r2 = r2 & 66
            if (r2 == 0) goto L36
            java.lang.Object r9 = r9.f40278a
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
            r5 = r4
        L56:
            if (r5 >= r2) goto L6f
            java.lang.Object r6 = r9.get(r5)
            androidx.compose.ui.input.pointer.C r6 = (androidx.compose.ui.input.pointer.C) r6
            boolean r7 = r6.b()
            if (r7 != 0) goto L36
            boolean r7 = r6.f40123h
            if (r7 != 0) goto L36
            boolean r6 = r6.f40119d
            if (r6 == 0) goto L36
            int r5 = r5 + 1
            goto L56
        L6f:
            java.lang.Object r1 = r9.get(r4)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.l.a(androidx.compose.ui.input.pointer.c, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }
}
