package hJ;

import com.avito.android.html_formatter.FormatChange;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditorOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/d;", "LhJ/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends AbstractC40837b {

    /* renamed from: a, reason: collision with root package name */
    public final int f397153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397154b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FormatChange f397155c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f397156d;

    public d(int i12, int i13, @Y61.k FormatChange formatChange) {
        super(null);
        this.f397153a = i12;
        this.f397154b = i13;
        this.f397155c = formatChange;
        this.f397156d = (formatChange instanceof com.avito.android.html_formatter.a) && i12 == i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f397153a == dVar.f397153a && this.f397154b == dVar.f397154b && L.f(this.f397155c, dVar.f397155c);
    }

    public final int hashCode() {
        return this.f397155c.hashCode() + androidx.appcompat.app.r.e(this.f397154b, Integer.hashCode(this.f397153a) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "FormatOperation(from=" + this.f397153a + ", to=" + this.f397154b + ", formatChange=" + this.f397155c + ')';
    }
}
