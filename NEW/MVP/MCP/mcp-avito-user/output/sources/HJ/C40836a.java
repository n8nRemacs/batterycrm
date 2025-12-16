package hJ;

import kotlin.Metadata;

/* compiled from: EditorOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/a;", "LhJ/b;", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: hJ.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C40836a extends AbstractC40837b {

    /* renamed from: a, reason: collision with root package name */
    public final int f397151a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397152b;

    public C40836a(int i12, int i13) {
        super(null);
        this.f397151a = i12;
        this.f397152b = i13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40836a)) {
            return false;
        }
        C40836a c40836a = (C40836a) obj;
        return this.f397151a == c40836a.f397151a && this.f397152b == c40836a.f397152b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f397152b) + (Integer.hashCode(this.f397151a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteOperation(from=");
        sb2.append(this.f397151a);
        sb2.append(", to=");
        return androidx.appcompat.app.r.t(sb2, this.f397152b, ')');
    }
}
