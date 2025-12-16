package uI;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionsBlock.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuI/a;", "", "_avito_historical-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48900a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439877a;

    /* renamed from: b, reason: collision with root package name */
    public final int f439878b;

    public C48900a(@k String str, int i12) {
        this.f439877a = str;
        this.f439878b = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48900a)) {
            return false;
        }
        C48900a c48900a = (C48900a) obj;
        return L.f(this.f439877a, c48900a.f439877a) && this.f439878b == c48900a.f439878b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f439878b) + (this.f439877a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpandButton(title=");
        sb2.append(this.f439877a);
        sb2.append(", count=");
        return r.t(sb2, this.f439878b, ')');
    }
}
