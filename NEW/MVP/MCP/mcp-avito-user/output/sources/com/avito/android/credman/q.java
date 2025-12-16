package com.avito.android.credman;

import android.content.Context;
import androidx.credentials.InterfaceC22858k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CredmanSaver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credman/q;", "Lcom/avito/android/credman/o;", "_avito_credman_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22858k f129109a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f129110b;

    @Inject
    public q(@Y61.k InterfaceC22858k interfaceC22858k, @Y61.k Context context) {
        this.f129109a = interfaceC22858k;
        this.f129110b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.avito.android.credman.o
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k java.lang.String r17, @Y61.k java.lang.String r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r19
            java.lang.String r2 = "Credman – saved successfully with "
            boolean r3 = r0 instanceof com.avito.android.credman.p
            if (r3 == 0) goto L19
            r3 = r0
            com.avito.android.credman.p r3 = (com.avito.android.credman.p) r3
            int r4 = r3.f129108t
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f129108t = r4
            goto L1e
        L19:
            com.avito.android.credman.p r3 = new com.avito.android.credman.p
            r3.<init>(r1, r0)
        L1e:
            java.lang.Object r0 = r3.f129106r
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.f129108t
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3c
            if (r5 != r7) goto L34
            java.lang.String r3 = r3.f129105q
            kotlin.C42729a0.b(r0)     // Catch: java.lang.Exception -> L32
            goto L61
        L32:
            r0 = move-exception
            goto L75
        L34:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3c:
            kotlin.C42729a0.b(r0)
            androidx.credentials.f r0 = new androidx.credentials.f     // Catch: java.lang.Exception -> L32
            r12 = 0
            r13 = 0
            r14 = 28
            r15 = 0
            r11 = 0
            r8 = r0
            r9 = r17
            r10 = r18
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L32
            androidx.credentials.k r5 = r1.f129109a     // Catch: java.lang.Exception -> L32
            android.content.Context r8 = r1.f129110b     // Catch: java.lang.Exception -> L32
            r9 = r17
            r3.f129105q = r9     // Catch: java.lang.Exception -> L32
            r3.f129108t = r7     // Catch: java.lang.Exception -> L32
            java.lang.Object r0 = r5.c(r8, r0, r3)     // Catch: java.lang.Exception -> L32
            if (r0 != r4) goto L60
            return r4
        L60:
            r3 = r9
        L61:
            com.avito.android.util.V2 r0 = com.avito.android.util.V2.f318762a     // Catch: java.lang.Exception -> L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L32
            r4.<init>(r2)     // Catch: java.lang.Exception -> L32
            r4.append(r3)     // Catch: java.lang.Exception -> L32
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L32
            r0.b(r2, r6)     // Catch: java.lang.Exception -> L32
            com.avito.android.credman.o$a$b r0 = com.avito.android.credman.o.a.b.f129104a     // Catch: java.lang.Exception -> L32
            return r0
        L75:
            com.avito.android.util.V2 r2 = com.avito.android.util.V2.f318762a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Credman – failed with "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.b(r3, r6)
            java.lang.String r2 = r0.getMessage()
            com.avito.android.credman.o$a$a r3 = new com.avito.android.credman.o$a$a
            r3.<init>(r2, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.credman.q.a(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
