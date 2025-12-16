package SU0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NetworkRequestBody.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LSU0/j;", "", "a", "b", "c", "LSU0/j$a;", "LSU0/j$b;", "LSU0/j$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f15013a;

    /* compiled from: NetworkRequestBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$a;", "LSU0/j;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends j {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final c[] f15014b;

        public a(@Y61.k c[] cVarArr) {
            super("application/octet-stream", null);
            this.f15014b = cVarArr;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f15014b, ((a) obj).f15014b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f15014b);
        }

        @Y61.k
        public final String toString() {
            return "ItemsArray(items=" + Arrays.toString(this.f15014b) + ')';
        }
    }

    /* compiled from: NetworkRequestBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$b;", "LSU0/j;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends j {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final p[] f15015b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f15016c;

        public b(@Y61.k p[] pVarArr, @Y61.l String str) {
            super("multipart/form-data", null);
            this.f15015b = pVarArr;
            this.f15016c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15015b, bVar.f15015b) && L.f(this.f15016c, bVar.f15016c);
        }

        public final int hashCode() {
            int iHashCode = Arrays.hashCode(this.f15015b) * 31;
            String str = this.f15016c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Multipart(content=");
            sb2.append(Arrays.toString(this.f15015b));
            sb2.append(", boundary=");
            return C22026a.c(sb2, this.f15016c, ')');
        }
    }

    /* compiled from: NetworkRequestBody.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSU0/j$c;", "LSU0/j;", "a", "b", "c", "d", "LSU0/j$c$a;", "LSU0/j$c$b;", "LSU0/j$c$c;", "LSU0/j$c$d;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c extends j {

        /* compiled from: NetworkRequestBody.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$c$a;", "LSU0/j$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f15017b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f15018c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f15019d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.k
            public final Y41.a<byte[]> f15020e;

            public /* synthetic */ a(String str, String str2, String str3, Y41.a aVar, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, str2, str3, aVar);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f15017b, aVar.f15017b) && L.f(this.f15018c, aVar.f15018c) && L.f(this.f15019d, aVar.f15019d) && L.f(this.f15020e, aVar.f15020e);
            }

            public final int hashCode() {
                String str = this.f15017b;
                return this.f15020e.hashCode() + H.d(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f15018c), 31, this.f15019d);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Binary(name=");
                sb2.append(this.f15017b);
                sb2.append(", uri=");
                sb2.append(this.f15018c);
                sb2.append(", type=");
                sb2.append(this.f15019d);
                sb2.append(", contentProvider=");
                return r.v(sb2, this.f15020e, ')');
            }

            public a(@Y61.l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k Y41.a<byte[]> aVar) {
                super("application/octet-stream", null);
                this.f15017b = str;
                this.f15018c = str2;
                this.f15019d = str3;
                this.f15020e = aVar;
            }
        }

        /* compiled from: NetworkRequestBody.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$c$b;", "LSU0/j$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f15021b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f15022c;

            public /* synthetic */ b(String str, String str2, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : str, str2);
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f15021b, bVar.f15021b) && L.f(this.f15022c, bVar.f15022c);
            }

            public final int hashCode() {
                String str = this.f15021b;
                return this.f15022c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("File(name=");
                sb2.append(this.f15021b);
                sb2.append(", uri=");
                return C22026a.c(sb2, this.f15022c, ')');
            }

            public b(@Y61.l String str, @Y61.k String str2) {
                super("application/octet-stream", null);
                this.f15021b = str;
                this.f15022c = str2;
            }
        }

        /* compiled from: NetworkRequestBody.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$c$c;", "LSU0/j$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: SU0.j$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1022c extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f15023b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f15024c;

            public C1022c(@Y61.k String str, @Y61.k String str2) {
                super(str2, null);
                this.f15023b = str;
                this.f15024c = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1022c)) {
                    return false;
                }
                C1022c c1022c = (C1022c) obj;
                return L.f(this.f15023b, c1022c.f15023b) && L.f(this.f15024c, c1022c.f15024c);
            }

            public final int hashCode() {
                return this.f15024c.hashCode() + (this.f15023b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Text(content=");
                sb2.append(this.f15023b);
                sb2.append(", contentType=");
                return C22026a.c(sb2, this.f15024c, ')');
            }
        }

        /* compiled from: NetworkRequestBody.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSU0/j$c$d;", "LSU0/j$c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final HV0.d[] f15025b;

            public d(@Y61.k HV0.d[] dVarArr) {
                super("application/x-www-form-urlencoded", null);
                this.f15025b = dVarArr;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f15025b, ((d) obj).f15025b);
            }

            public final int hashCode() {
                return Arrays.hashCode(this.f15025b);
            }

            @Y61.k
            public final String toString() {
                return "UrlEncoded(params=" + Arrays.toString(this.f15025b) + ')';
            }
        }

        public c(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    public j(String str, C42822w c42822w) {
        this.f15013a = str;
    }
}
