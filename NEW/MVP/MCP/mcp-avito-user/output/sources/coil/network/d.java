package coil.network;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import okhttp3.Headers;
import okhttp3.Request;

/* compiled from: CacheStrategy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcoil/network/d;", "", "a", "b", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f58563c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Request f58564a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f58565b;

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/network/d$a;", "", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static Headers a(@k Headers headers, @k Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i12 = 0; i12 < size; i12++) {
                String strName = headers.name(i12);
                String strValue = headers.value(i12);
                if ((!"Warning".equalsIgnoreCase(strName) || !C43066x.h0(strValue, "1", false)) && ("Content-Length".equalsIgnoreCase(strName) || "Content-Encoding".equalsIgnoreCase(strName) || "Content-Type".equalsIgnoreCase(strName) || !b(strName) || headers2.get(strName) == null)) {
                    builder.addUnsafeNonAscii(strName, strValue);
                }
            }
            int size2 = headers2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                String strName2 = headers2.name(i13);
                if (!"Content-Length".equalsIgnoreCase(strName2) && !"Content-Encoding".equalsIgnoreCase(strName2) && !"Content-Type".equalsIgnoreCase(strName2) && b(strName2)) {
                    builder.addUnsafeNonAscii(strName2, headers2.value(i13));
                }
            }
            return builder.build();
        }

        public static boolean b(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }

        public a() {
        }
    }

    /* compiled from: CacheStrategy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/network/d$b;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Request f58566a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final c f58567b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f58568c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f58569d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Date f58570e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f58571f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Date f58572g;

        /* renamed from: h, reason: collision with root package name */
        public final long f58573h;

        /* renamed from: i, reason: collision with root package name */
        public final long f58574i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f58575j;

        /* renamed from: k, reason: collision with root package name */
        public final int f58576k;

        public b(@k Request request, @l c cVar) {
            int i12;
            this.f58566a = request;
            this.f58567b = cVar;
            this.f58576k = -1;
            if (cVar != null) {
                this.f58573h = cVar.f58559c;
                this.f58574i = cVar.f58560d;
                Headers headers = cVar.f58562f;
                int size = headers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String strName = headers.name(i13);
                    if (C43066x.C(strName, "Date", true)) {
                        this.f58568c = headers.getDate("Date");
                        this.f58569d = headers.value(i13);
                    } else if (C43066x.C(strName, "Expires", true)) {
                        this.f58572g = headers.getDate("Expires");
                    } else if (C43066x.C(strName, "Last-Modified", true)) {
                        this.f58570e = headers.getDate("Last-Modified");
                        this.f58571f = headers.value(i13);
                    } else if (C43066x.C(strName, "ETag", true)) {
                        this.f58575j = headers.value(i13);
                    } else if (C43066x.C(strName, "Age", true)) {
                        String strValue = headers.value(i13);
                        Bitmap.Config[] configArr = coil.util.l.f58781a;
                        Long lZ02 = C43066x.z0(strValue);
                        if (lZ02 != null) {
                            long jLongValue = lZ02.longValue();
                            i12 = jLongValue > 2147483647L ? Integer.MAX_VALUE : jLongValue < 0 ? 0 : (int) jLongValue;
                        } else {
                            i12 = -1;
                        }
                        this.f58576k = i12;
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x0100  */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.C] */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final coil.network.d a() {
            /*
                Method dump skipped, instructions count: 408
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.network.d.b.a():coil.network.d");
        }
    }

    public d(Request request, c cVar, C42822w c42822w) {
        this.f58564a = request;
        this.f58565b = cVar;
    }
}
