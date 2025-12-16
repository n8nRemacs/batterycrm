package l91;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TypeId.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ll91/c;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: l91.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C43607c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f413572a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f413573b;

    public C43607c(@k String str, @l String str2) {
        this.f413572a = str;
        this.f413573b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43607c)) {
            return false;
        }
        C43607c c43607c = (C43607c) obj;
        return L.f(this.f413572a, c43607c.f413572a) && L.f(this.f413573b, c43607c.f413573b);
    }

    public final int hashCode() {
        int iHashCode = this.f413572a.hashCode() * 31;
        String str = this.f413573b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public /* synthetic */ C43607c(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }
}
