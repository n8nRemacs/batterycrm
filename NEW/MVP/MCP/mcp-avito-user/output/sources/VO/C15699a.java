package Vo;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CodeInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVo/a;", "", "_avito_code-confirmation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vo.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C15699a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f17383a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17384b;

    public C15699a(@k String str, long j12) {
        this.f17383a = str;
        this.f17384b = j12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15699a)) {
            return false;
        }
        C15699a c15699a = (C15699a) obj;
        return L.f(this.f17383a, c15699a.f17383a) && this.f17384b == c15699a.f17384b;
    }

    public final int hashCode() {
        return Integer.hashCode(5) + r.g(this.f17383a.hashCode() * 31, 31, this.f17384b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeInfo(text=");
        sb2.append(this.f17383a);
        sb2.append(", timeout=");
        return c.j(this.f17384b, ", length=5)", sb2);
    }
}
