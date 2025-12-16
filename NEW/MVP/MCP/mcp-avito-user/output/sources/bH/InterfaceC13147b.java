package Bh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BblConfigureV4OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LBh/b;", "", "a", "b", "LBh/b$a;", "LBh/b$b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bh.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC13147b {

    /* compiled from: BblConfigureV4OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBh/b$a;", "LBh/b;", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.b$a */
    public static final /* data */ class a implements InterfaceC13147b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1595a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 623970765;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: BblConfigureV4OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/b$b;", "LBh/b;", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0067b implements InterfaceC13147b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f1596a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Long f1597b;

        public C0067b(@l Long l12, @k DeepLink deepLink) {
            this.f1596a = deepLink;
            this.f1597b = l12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0067b)) {
                return false;
            }
            C0067b c0067b = (C0067b) obj;
            return L.f(this.f1596a, c0067b.f1596a) && L.f(this.f1597b, c0067b.f1597b);
        }

        public final int hashCode() {
            int iHashCode = this.f1596a.hashCode() * 31;
            Long l12 = this.f1597b;
            return iHashCode + (l12 == null ? 0 : l12.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deepLink=");
            sb2.append(this.f1596a);
            sb2.append(", configId=");
            return m.m(sb2, this.f1597b, ')');
        }
    }
}
