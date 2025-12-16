package hJ;

import hJ.m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: SupportsDeleteHtmlNode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LhJ/p;", "", "b", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface p {

    /* compiled from: SupportsDeleteHtmlNode.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: SupportsDeleteHtmlNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LhJ/p$b;", "", "_common_html-formatter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f397172a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f397173b;

        public b(@Y61.k ArrayList arrayList, @Y61.k LinkedHashMap linkedHashMap) {
            this.f397172a = arrayList;
            this.f397173b = linkedHashMap;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f397172a.equals(bVar.f397172a) && this.f397173b.equals(bVar.f397173b);
        }

        public final int hashCode() {
            return this.f397173b.hashCode() + (this.f397172a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OperationTransaction(removedNodes=");
            sb2.append(this.f397172a);
            sb2.append(", replacedNodes=");
            return org.webrtc.h.e(sb2, this.f397173b, ')');
        }
    }

    @Y61.l
    m.a b(int i12, int i13, @Y61.l b bVar);
}
