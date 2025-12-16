package hJ;

import androidx.compose.foundation.H;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EditorOperation.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/o;", "LhJ/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class o extends AbstractC40837b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C40836a f397169a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<l> f397170b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f397171c;

    public o(@Y61.k C40836a c40836a, @Y61.k List<l> list) {
        super(null);
        this.f397169a = c40836a;
        this.f397170b = list;
        int i12 = c40836a.f397152b - c40836a.f397151a;
        Iterator<T> it = list.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((l) it.next()).f397166b.length();
        }
        this.f397171c = i12 < length;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f397169a, oVar.f397169a) && L.f(this.f397170b, oVar.f397170b);
    }

    public final int hashCode() {
        return this.f397170b.hashCode() + (this.f397169a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplaceOperation(deleteOperation=");
        sb2.append(this.f397169a);
        sb2.append(", insertOperations=");
        return H.p(sb2, this.f397170b, ')');
    }
}
