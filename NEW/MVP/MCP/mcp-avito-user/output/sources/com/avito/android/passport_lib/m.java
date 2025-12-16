package com.avito.android.passport_lib;

import kotlin.Metadata;

/* compiled from: PassportStateRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport_lib/m;", "", "_avito_passport-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f213928a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f213929b;

    public m(boolean z12, boolean z13) {
        this.f213928a = z12;
        this.f213929b = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f213928a == mVar.f213928a && this.f213929b == mVar.f213929b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f213929b) + (Boolean.hashCode(this.f213928a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportState(enabled=");
        sb2.append(this.f213928a);
        sb2.append(", isMultiPassport=");
        return androidx.appcompat.app.r.x(sb2, this.f213929b, ')');
    }
}
