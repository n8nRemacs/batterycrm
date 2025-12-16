package xI0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CharityState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LxI0/b;", "", "a", "b", "LxI0/b$a;", "LxI0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: xI0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC49845b {

    /* compiled from: CharityState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LxI0/b$a;", "LxI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xI0.b$a */
    public static final /* data */ class a implements InterfaceC49845b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f442331a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -75131030;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: CharityState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxI0/b$b;", "LxI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12858b implements InterfaceC49845b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f442332a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f442333b;

        public C12858b(@k DeepLink deepLink, @k String str) {
            this.f442332a = deepLink;
            this.f442333b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12858b)) {
                return false;
            }
            C12858b c12858b = (C12858b) obj;
            return L.f(this.f442332a, c12858b.f442332a) && L.f(this.f442333b, c12858b.f442333b);
        }

        public final int hashCode() {
            return this.f442333b.hashCode() + (this.f442332a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Show(deepLink=");
            sb2.append(this.f442332a);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f442333b, ')');
        }
    }
}
