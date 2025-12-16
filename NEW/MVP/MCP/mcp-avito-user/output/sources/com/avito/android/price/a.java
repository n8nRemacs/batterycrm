package com.avito.android.price;

import com.avito.android.common.l;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PriceInputFormatter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/price/a;", "Lcom/avito/android/common/l;", "<init>", "()V", "_avito_formatters-provider_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements l {
    @Inject
    public a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[PHI: r8
  0x0052: PHI (r8v7 int) = (r8v4 int), (r8v8 int) binds: [B:23:0x0059, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.avito.android.common.l
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.common.k a(@Y61.k com.avito.android.common.k r14) {
        /*
            r13 = this;
            java.lang.CharSequence r0 = r14.f123766a
            int r1 = r0.length()
            if (r1 != 0) goto L9
            return r14
        L9:
            int r1 = r0.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L13
            goto L7e
        L13:
            int r1 = r0.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 12
            int r6 = java.lang.Math.min(r1, r5)
            r4.<init>(r6)
            int r6 = r14.f123768c
            int r14 = r14.f123767b
            r8 = r14
            r7 = r3
            r9 = r6
        L29:
            if (r7 >= r1) goto L75
            char r10 = r0.charAt(r7)
            r11 = 10
            int r10 = java.lang.Character.digit(r10, r11)
            r11 = -1
            r12 = 48
            if (r10 == r11) goto L55
            r4.append(r10)
            int r10 = r4.length()
            if (r10 <= r2) goto L5c
            char r10 = r4.charAt(r3)
            if (r10 != r12) goto L5c
            r4.deleteCharAt(r3)
            if (r8 <= 0) goto L50
            int r8 = r8 + (-1)
        L50:
            if (r9 <= 0) goto L5c
        L52:
            int r9 = r9 + (-1)
            goto L5c
        L55:
            if (r7 >= r14) goto L59
            int r8 = r8 + (-1)
        L59:
            if (r7 >= r6) goto L5c
            goto L52
        L5c:
            int r10 = r4.length()
            if (r10 != r5) goto L72
            char r10 = r4.charAt(r3)
            if (r10 == r12) goto L72
            com.avito.android.common.k r14 = new com.avito.android.common.k
            java.lang.String r0 = r4.toString()
            r14.<init>(r8, r9, r0)
            goto L7e
        L72:
            int r7 = r7 + 1
            goto L29
        L75:
            com.avito.android.common.k r14 = new com.avito.android.common.k
            java.lang.String r0 = r4.toString()
            r14.<init>(r8, r9, r0)
        L7e:
            java.lang.CharSequence r0 = r14.f123766a
            int r1 = r0.length()
            r4 = 3
            if (r1 > r4) goto L88
            return r14
        L88:
            int r1 = r0.length()
            int r4 = r1 % 3
            if (r4 != 0) goto L92
            int r4 = r4 + 3
        L92:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r6 = r1 / 3
            int r6 = r6 + r2
            int r6 = r6 * 4
            r5.<init>(r6)
            int r2 = r14.f123768c
            int r14 = r14.f123767b
            r6 = r14
            r7 = r2
        La2:
            if (r3 >= r1) goto Lbf
            if (r3 != r4) goto Lb5
            int r4 = r4 + 3
            if (r3 >= r14) goto Lac
            int r6 = r6 + 1
        Lac:
            if (r3 >= r2) goto Lb0
            int r7 = r7 + 1
        Lb0:
            r8 = 32
            r5.append(r8)
        Lb5:
            char r8 = r0.charAt(r3)
            r5.append(r8)
            int r3 = r3 + 1
            goto La2
        Lbf:
            com.avito.android.common.k r14 = new com.avito.android.common.k
            java.lang.String r0 = r5.toString()
            r14.<init>(r6, r7, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.price.a.a(com.avito.android.common.k):com.avito.android.common.k");
    }
}
