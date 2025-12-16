package Kn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryArguments.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKn/b;", "", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Kn.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14332b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f9651a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f9652b;

    public C14332b(@l String str, @l String str2) {
        this.f9651a = str;
        this.f9652b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14332b)) {
            return false;
        }
        C14332b c14332b = (C14332b) obj;
        return L.f(this.f9651a, c14332b.f9651a) && L.f(this.f9652b, c14332b.f9652b);
    }

    public final int hashCode() {
        String str = this.f9651a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9652b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryArguments(id=");
        sb2.append(this.f9651a);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f9652b, ')');
    }
}
