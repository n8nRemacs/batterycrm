package com.avito.android.util;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: ErrorPrintableFormatter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/d1;", "Lcom/avito/android/util/a1;", "<init>", "()V", "_avito-discouraged_api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.d1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35772d1 implements InterfaceC35741a1 {
    @Inject
    public C35772d1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    @Override // com.avito.android.util.InterfaceC35741a1
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.printable_text.PrintableText a(@Y61.l java.lang.Throwable r3, @Y61.k Y41.l<? super java.lang.Throwable, ? extends com.avito.android.printable_text.PrintableText> r4, @Y61.k Y41.l<? super java.lang.Throwable, ? extends com.avito.android.printable_text.PrintableText> r5) {
        /*
            r2 = this;
            boolean r0 = com.avito.android.util.K5.c(r3)
            r1 = 0
            if (r0 == 0) goto L11
            r3 = 2131957802(0x7f13182a, float:1.9552198E38)
            java.io.Serializable[] r4 = new java.io.Serializable[r1]
            com.avito.android.printable_text.PrintableText r3 = com.avito.android.printable_text.b.c(r3, r4)
            goto L59
        L11:
            boolean r0 = com.avito.android.util.K5.e(r3)
            if (r0 == 0) goto L1e
            java.lang.Object r3 = r4.invoke(r3)
            com.avito.android.printable_text.PrintableText r3 = (com.avito.android.printable_text.PrintableText) r3
            goto L59
        L1e:
            r4 = r3
        L1f:
            if (r4 != 0) goto L22
            goto L2c
        L22:
            boolean r0 = r4 instanceof com.avito.android.util.ApiException
            if (r0 == 0) goto L5a
            com.avito.android.util.ApiException r4 = (com.avito.android.util.ApiException) r4
            com.avito.android.remote.error.ApiError r4 = r4.f318522b
            boolean r1 = r4 instanceof com.avito.android.remote.error.ApiError.UnknownError
        L2c:
            if (r1 == 0) goto L35
            java.lang.Object r3 = r5.invoke(r3)
            com.avito.android.printable_text.PrintableText r3 = (com.avito.android.printable_text.PrintableText) r3
            goto L59
        L35:
            if (r3 == 0) goto L53
            java.lang.String r4 = com.avito.android.error.z.j(r3)
            r0 = 0
            if (r4 == 0) goto L4d
            boolean r1 = kotlin.text.C43066x.K(r4)
            if (r1 != 0) goto L45
            goto L46
        L45:
            r4 = r0
        L46:
            if (r4 == 0) goto L4d
            com.avito.android.printable_text.PrintableText r4 = com.avito.android.printable_text.b.f(r4)
            goto L4e
        L4d:
            r4 = r0
        L4e:
            if (r4 != 0) goto L51
            goto L53
        L51:
            r3 = r4
            goto L59
        L53:
            java.lang.Object r3 = r5.invoke(r3)
            com.avito.android.printable_text.PrintableText r3 = (com.avito.android.printable_text.PrintableText) r3
        L59:
            return r3
        L5a:
            java.lang.Throwable r4 = r4.getCause()
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.util.C35772d1.a(java.lang.Throwable, Y41.l, Y41.l):com.avito.android.printable_text.PrintableText");
    }
}
