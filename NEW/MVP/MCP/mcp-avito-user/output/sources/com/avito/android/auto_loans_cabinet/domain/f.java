package com.avito.android.auto_loans_cabinet.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: FinishedBlank.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_loans_cabinet/domain/f;", "", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f95394a;

    /* renamed from: b, reason: collision with root package name */
    public final long f95395b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Bank f95396c;

    public f(long j12, long j13, @k Bank bank) {
        this.f95394a = j12;
        this.f95395b = j13;
        this.f95396c = bank;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f95394a == fVar.f95394a && this.f95395b == fVar.f95395b && this.f95396c == fVar.f95396c;
    }

    public final int hashCode() {
        return this.f95396c.hashCode() + r.g(Long.hashCode(this.f95394a) * 31, 31, this.f95395b);
    }

    @k
    public final String toString() {
        return "FinishedBlank(blankId=" + this.f95394a + ", itemId=" + this.f95395b + ", bank=" + this.f95396c + ')';
    }
}
