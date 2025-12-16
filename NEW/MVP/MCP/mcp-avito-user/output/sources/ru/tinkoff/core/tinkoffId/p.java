package ru.tinkoff.core.tinkoffId;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TinkoffTokenPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/tinkoff/core/tinkoffId/p;", "", "tinkoff-id_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f437049b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f437050c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f437051d;

    public p(@Y61.k String str, int i12, @Y61.l String str2, @Y61.k String str3) {
        this.f437048a = str;
        this.f437049b = i12;
        this.f437050c = str2;
        this.f437051d = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f437048a, pVar.f437048a) && this.f437049b == pVar.f437049b && L.f(this.f437050c, pVar.f437050c) && L.f(this.f437051d, pVar.f437051d);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f437049b, this.f437048a.hashCode() * 31, 31);
        String str = this.f437050c;
        return this.f437051d.hashCode() + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TinkoffTokenPayload(accessToken=");
        sb2.append(this.f437048a);
        sb2.append(", expiresIn=");
        sb2.append(this.f437049b);
        sb2.append(", idToken=");
        sb2.append(this.f437050c);
        sb2.append(", refreshToken=");
        return AK.c.s(sb2, this.f437051d, ")");
    }
}
