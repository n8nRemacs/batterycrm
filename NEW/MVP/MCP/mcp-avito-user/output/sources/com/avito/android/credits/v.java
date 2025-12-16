package com.avito.android.credits;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CreditConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/credits/v;", "", "_avito_credits_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credits.utils.a f129056a;

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Y61.l
    public static Integer a(int i12, int i13, int i14, float f12) {
        Double dValueOf;
        double d12 = f12;
        if (0.0d > d12 || d12 > 100.0d || i12 <= 0) {
            dValueOf = null;
        } else {
            dValueOf = Double.valueOf(((100.0d - d12) * i12) / 100.0d);
        }
        if (dValueOf != null) {
            return Integer.valueOf(Math.min(Math.max(kotlin.math.b.a(dValueOf.doubleValue()), i13), i14));
        }
        return null;
    }

    @Y61.l
    public static Float b(@Y61.l String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(',', '.');
        StringBuilder sb2 = new StringBuilder();
        int length = strReplace.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = strReplace.charAt(i12);
            if (Character.isDigit(cCharAt) || cCharAt == '.' || cCharAt == '-') {
                sb2.append(cCharAt);
            }
        }
        return C43066x.x0(sb2.toString());
    }

    public v(@Y61.k com.avito.android.credits.utils.a aVar) {
        this.f129056a = aVar;
    }

    public /* synthetic */ v(com.avito.android.credits.utils.a aVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new com.avito.android.credits.utils.c() : aVar);
    }
}
