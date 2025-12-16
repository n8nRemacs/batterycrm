package aw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Law0/a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C24185a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f56775a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56776b;

    public C24185a(@k String str, long j12) {
        this.f56775a = str;
        this.f56776b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24185a)) {
            return false;
        }
        C24185a c24185a = (C24185a) obj;
        return L.f(this.f56775a, c24185a.f56775a) && this.f56776b == c24185a.f56776b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f56776b) + (this.f56775a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormBonusesData(bonusStateId=");
        sb2.append(this.f56775a);
        sb2.append(", bonusValue=");
        return r.u(sb2, this.f56776b, ')');
    }
}
