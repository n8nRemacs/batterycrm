package com.avito.android.sbc.utils;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: CreateDiscountDispatchPriceFormatter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/utils/b;", "Lcom/avito/android/sbc/utils/a;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f260182a;

    public b(@k h hVar) {
        this.f260182a = hVar;
    }

    @Override // com.avito.android.sbc.utils.a
    @k
    public final String a(long j12) {
        return this.f260182a.f260189a.format(j12).concat(" ₽");
    }

    @Override // com.avito.android.sbc.utils.a
    @k
    public final String b(long j12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(j12);
        sb2.append('%');
        return sb2.toString();
    }

    @Override // com.avito.android.sbc.utils.a
    @k
    public final String c(long j12, @k String str) {
        return C43066x.a0(str, "{{discount}}", b(j12), false);
    }

    @Override // com.avito.android.sbc.utils.a
    @k
    public final String d(long j12, @k String str) {
        return C43066x.a0(str, "{{discount}}", a(j12), false);
    }
}
