package rw0;

import androidx.media3.common.C23088b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrustItemsViewState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lrw0/s;", "", "a", "b", "Lrw0/s$a;", "Lrw0/s$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface s {

    /* compiled from: TrustItemsViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrw0/s$a;", "Lrw0/s;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f437250a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 37142296;
        }

        @Y61.k
        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: TrustItemsViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/s$b;", "Lrw0/s;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements s {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f437251a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f437252b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final r f437253c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f437254d;

        public b(@Y61.l String str, @Y61.k List<q> list, @Y61.k r rVar, boolean z12) {
            this.f437251a = str;
            this.f437252b = list;
            this.f437253c = rVar;
            this.f437254d = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f437251a, bVar.f437251a) && L.f(this.f437252b, bVar.f437252b) && L.f(this.f437253c, bVar.f437253c) && this.f437254d == bVar.f437254d;
        }

        public final int hashCode() {
            String str = this.f437251a;
            return Boolean.hashCode(this.f437254d) + ((this.f437253c.hashCode() + C23088b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.f437252b)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Visible(title=");
            sb2.append(this.f437251a);
            sb2.append(", items=");
            sb2.append(this.f437252b);
            sb2.append(", showMoreBtnViewState=");
            sb2.append(this.f437253c);
            sb2.append(", visibilityTrackingEnabled=");
            return androidx.appcompat.app.r.x(sb2, this.f437254d, ')');
        }
    }
}
