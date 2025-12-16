package hJ;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditorOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/l;", "LhJ/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class l extends AbstractC40837b {

    /* renamed from: a, reason: collision with root package name */
    public final int f397165a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f397166b;

    public l(int i12, @Y61.k String str) {
        super(null);
        this.f397165a = i12;
        this.f397166b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f397165a == lVar.f397165a && L.f(this.f397166b, lVar.f397166b);
    }

    public final int hashCode() {
        return this.f397166b.hashCode() + (Integer.hashCode(this.f397165a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InsertOperation(from=");
        sb2.append(this.f397165a);
        sb2.append(", content=");
        return C22026a.c(sb2, this.f397166b, ')');
    }
}
