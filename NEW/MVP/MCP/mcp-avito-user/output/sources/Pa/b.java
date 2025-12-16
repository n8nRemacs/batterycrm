package pA;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.SerpElement;
import com.avito.android.serp.adapter.l1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileAdvertsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LpA/b;", "", "a", "b", "c", "d", "LpA/b$a;", "LpA/b$b;", "LpA/b$c;", "LpA/b$d;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: ProfileAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/b$a;", "LpA/b;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f428233a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<l1> f428234b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<SerpElement> f428235c;

        /* renamed from: d, reason: collision with root package name */
        public final int f428236d;

        public a(@l String str, @k List list, int i12, @k List list2) {
            this.f428233a = str;
            this.f428234b = list;
            this.f428235c = list2;
            this.f428236d = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f428233a, aVar.f428233a) && L.f(this.f428234b, aVar.f428234b) && L.f(this.f428235c, aVar.f428235c) && this.f428236d == aVar.f428236d;
        }

        public final int hashCode() {
            String str = this.f428233a;
            return Integer.hashCode(this.f428236d) + H.e(H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f428234b), 31, this.f428235c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DataLoaded(disclaimer=");
            sb2.append(this.f428233a);
            sb2.append(", processedAdverts=");
            sb2.append(this.f428234b);
            sb2.append(", rawAdverts=");
            sb2.append(this.f428235c);
            sb2.append(", page=");
            return r.t(sb2, this.f428236d, ')');
        }
    }

    /* compiled from: ProfileAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpA/b$b;", "LpA/b;", "<init>", "()V", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: pA.b$b, reason: collision with other inner class name */
    public static final class C12256b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12256b f428237a = new C12256b();
    }

    /* compiled from: ProfileAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/b$c;", "LpA/b;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f428238a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f428239b;

        public c(@k String str, @k Throwable th2) {
            this.f428238a = str;
            this.f428239b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f428238a, cVar.f428238a) && L.f(this.f428239b, cVar.f428239b);
        }

        public final int hashCode() {
            return this.f428239b.hashCode() + (this.f428238a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DataLoadingError(errorMessage=");
            sb2.append(this.f428238a);
            sb2.append(", error=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f428239b, ')');
        }
    }

    /* compiled from: ProfileAdvertsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LpA/b$d;", "LpA/b;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<l1> f428240a;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k List<? extends l1> list) {
            this.f428240a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f428240a, ((d) obj).f428240a);
        }

        public final int hashCode() {
            return this.f428240a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("DataUpdated(processedAdverts="), this.f428240a, ')');
        }
    }
}
