package hJ;

import com.avito.android.html_formatter.jsoup.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MutableHtmlNode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"LhJ/m;", "LhJ/f;", "LhJ/s;", "LhJ/q;", "a", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface m extends f, s, q {
    @Y61.l
    a0 h();

    int k();

    /* compiled from: MutableHtmlNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/m$a;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final m f397167a;

        /* renamed from: b, reason: collision with root package name */
        public final int f397168b;

        public a(@Y61.l m mVar, int i12) {
            this.f397167a = mVar;
            this.f397168b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f397167a, aVar.f397167a) && this.f397168b == aVar.f397168b;
        }

        public final int hashCode() {
            m mVar = this.f397167a;
            return Integer.hashCode(this.f397168b) + ((mVar == null ? 0 : mVar.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OperationResult(replacedNode=");
            sb2.append(this.f397167a);
            sb2.append(", cursorPositionShift=");
            return androidx.appcompat.app.r.t(sb2, this.f397168b, ')');
        }

        public /* synthetic */ a(m mVar, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? null : mVar, i12);
        }
    }
}
