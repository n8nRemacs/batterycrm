package io.ktor.http;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import org.webrtc.MediaStreamTrack;

/* compiled from: ContentTypes.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/i;", "Lio/ktor/http/Q;", "a", "b", "c", "d", "e", "f", "g", "h", "i", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41524i extends Q {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final c f400031f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C41524i f400032g = new C41524i("*", "*", null, 4, null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f400033d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f400034e;

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f400035a = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C41524i f400036b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final C41524i f400037c;

        static {
            new C41524i("application", "*", null, 4, null);
            new C41524i("application", "atom+xml", null, 4, null);
            new C41524i("application", "cbor", null, 4, null);
            f400036b = new C41524i("application", "json", null, 4, null);
            new C41524i("application", "hal+json", null, 4, null);
            new C41524i("application", "javascript", null, 4, null);
            f400037c = new C41524i("application", "octet-stream", null, 4, null);
            new C41524i("application", "rss+xml", null, 4, null);
            new C41524i("application", "xml", null, 4, null);
            new C41524i("application", "xml-dtd", null, 4, null);
            new C41524i("application", "zip", null, 4, null);
            new C41524i("application", "gzip", null, 4, null);
            new C41524i("application", "x-www-form-urlencoded", null, 4, null);
            new C41524i("application", "pdf", null, 4, null);
            new C41524i("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
            new C41524i("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);
            new C41524i("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
            new C41524i("application", "protobuf", null, 4, null);
            new C41524i("application", "wasm", null, 4, null);
            new C41524i("application", "problem+json", null, 4, null);
            new C41524i("application", "problem+xml", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$b;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$b */
    public static final class b {
        static {
            new b();
            new C41524i(MediaStreamTrack.AUDIO_TRACK_KIND, "*", null, 4, null);
            new C41524i(MediaStreamTrack.AUDIO_TRACK_KIND, "mp4", null, 4, null);
            new C41524i(MediaStreamTrack.AUDIO_TRACK_KIND, "mpeg", null, 4, null);
            new C41524i(MediaStreamTrack.AUDIO_TRACK_KIND, "ogg", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$c;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static C41524i a(@Y61.k String str) throws BadContentTypeFormatException {
            if (C43066x.K(str)) {
                return C41524i.f400032g;
            }
            int i12 = Q.f399893c;
            O o12 = (O) C42745f0.Q(C41517e0.a(str));
            String str2 = o12.f399881a;
            int iH2 = C43066x.H('/', 0, 6, str2);
            if (iH2 == -1) {
                if (!kotlin.jvm.internal.L.f(C43066x.A0(str2).toString(), "*")) {
                    throw new BadContentTypeFormatException(str);
                }
                C41524i.f400031f.getClass();
                return C41524i.f400032g;
            }
            String string = C43066x.A0(str2.substring(0, iH2)).toString();
            if (string.length() == 0) {
                throw new BadContentTypeFormatException(str);
            }
            String string2 = C43066x.A0(str2.substring(iH2 + 1)).toString();
            if (C43066x.r(string, ' ') || C43066x.r(string2, ' ')) {
                throw new BadContentTypeFormatException(str);
            }
            if (string2.length() == 0 || C43066x.r(string2, '/')) {
                throw new BadContentTypeFormatException(str);
            }
            return new C41524i(string, string2, o12.f399882b);
        }

        public c() {
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$d;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$d */
    public static final class d {
        static {
            new d();
            new C41524i("font", "*", null, 4, null);
            new C41524i("font", "collection", null, 4, null);
            new C41524i("font", "otf", null, 4, null);
            new C41524i("font", "sfnt", null, 4, null);
            new C41524i("font", "ttf", null, 4, null);
            new C41524i("font", "woff", null, 4, null);
            new C41524i("font", "woff2", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$e;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$e */
    public static final class e {
        static {
            new e();
            new C41524i("image", "*", null, 4, null);
            new C41524i("image", "gif", null, 4, null);
            new C41524i("image", "jpeg", null, 4, null);
            new C41524i("image", "png", null, 4, null);
            new C41524i("image", "svg+xml", null, 4, null);
            new C41524i("image", "x-icon", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$f;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$f */
    public static final class f {
        static {
            new f();
            new C41524i("message", "*", null, 4, null);
            new C41524i("message", "http", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$g;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f400038a = new g();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C41524i f400039b;

        static {
            new C41524i("multipart", "*", null, 4, null);
            new C41524i("multipart", "mixed", null, 4, null);
            new C41524i("multipart", "alternative", null, 4, null);
            new C41524i("multipart", "related", null, 4, null);
            f400039b = new C41524i("multipart", "form-data", null, 4, null);
            new C41524i("multipart", "signed", null, 4, null);
            new C41524i("multipart", "encrypted", null, 4, null);
            new C41524i("multipart", "byteranges", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$h;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f400040a = new h();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final C41524i f400041b;

        static {
            new C41524i("text", "*", null, 4, null);
            f400041b = new C41524i("text", "plain", null, 4, null);
            new C41524i("text", "css", null, 4, null);
            new C41524i("text", "csv", null, 4, null);
            new C41524i("text", "html", null, 4, null);
            new C41524i("text", "javascript", null, 4, null);
            new C41524i("text", "vcard", null, 4, null);
            new C41524i("text", "xml", null, 4, null);
            new C41524i("text", "event-stream", null, 4, null);
        }
    }

    /* compiled from: ContentTypes.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/i$i;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.i$i, reason: collision with other inner class name */
    public static final class C11412i {
        static {
            new C11412i();
            new C41524i("video", "*", null, 4, null);
            new C41524i("video", "mpeg", null, 4, null);
            new C41524i("video", "mp4", null, 4, null);
            new C41524i("video", "ogg", null, 4, null);
            new C41524i("video", "quicktime", null, 4, null);
        }
    }

    public C41524i(@Y61.k String str, @Y61.k String str2, @Y61.k List<P> list) {
        this(str, str2, androidx.compose.foundation.H.i('/', str, str2), list);
    }

    public final boolean b(@Y61.k C41524i c41524i) {
        boolean zC2;
        String str = c41524i.f400033d;
        if (!kotlin.jvm.internal.L.f(str, "*") && !C43066x.C(str, this.f400033d, true)) {
            return false;
        }
        String str2 = c41524i.f400034e;
        if (!kotlin.jvm.internal.L.f(str2, "*") && !C43066x.C(str2, this.f400034e, true)) {
            return false;
        }
        for (P p12 : c41524i.f399895b) {
            String str3 = p12.f399891a;
            boolean zF2 = kotlin.jvm.internal.L.f(str3, "*");
            String str4 = p12.f399892b;
            if (zF2) {
                if (!kotlin.jvm.internal.L.f(str4, "*")) {
                    List<P> list = this.f399895b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            if (C43066x.C(((P) it.next()).f399892b, str4, true)) {
                            }
                        }
                    }
                    zC2 = false;
                }
                zC2 = true;
                break;
            }
            String strA = a(str3);
            if (!kotlin.jvm.internal.L.f(str4, "*")) {
                zC2 = C43066x.C(strA, str4, true);
            } else {
                if (strA != null) {
                    zC2 = true;
                    break;
                    break;
                }
                zC2 = false;
            }
            if (!zC2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (kotlin.text.C43066x.C(r1.f399892b, r7, true) != false) goto L23;
     */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.ktor.http.C41524i c(@Y61.k java.lang.String r6, @Y61.k java.lang.String r7) {
        /*
            r5 = this;
            java.util.List<io.ktor.http.P> r0 = r5.f399895b
            int r1 = r0.size()
            if (r1 == 0) goto L55
            r2 = 1
            if (r1 == r2) goto L3d
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L1c
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1c
            goto L55
        L1c:
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            io.ktor.http.P r3 = (io.ktor.http.P) r3
            java.lang.String r4 = r3.f399891a
            boolean r4 = kotlin.text.C43066x.C(r4, r6, r2)
            if (r4 == 0) goto L20
            java.lang.String r3 = r3.f399892b
            boolean r3 = kotlin.text.C43066x.C(r3, r7, r2)
            if (r3 == 0) goto L20
            goto L54
        L3d:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            io.ktor.http.P r1 = (io.ktor.http.P) r1
            java.lang.String r3 = r1.f399891a
            boolean r3 = kotlin.text.C43066x.C(r3, r6, r2)
            if (r3 == 0) goto L55
            java.lang.String r1 = r1.f399892b
            boolean r1 = kotlin.text.C43066x.C(r1, r7, r2)
            if (r1 == 0) goto L55
        L54:
            return r5
        L55:
            io.ktor.http.i r1 = new io.ktor.http.i
            java.util.Collection r0 = (java.util.Collection) r0
            io.ktor.http.P r2 = new io.ktor.http.P
            r2.<init>(r6, r7)
            java.util.ArrayList r6 = kotlin.collections.C42745f0.i0(r2, r0)
            java.lang.String r7 = r5.f400034e
            java.lang.String r0 = r5.f399894a
            java.lang.String r2 = r5.f400033d
            r1.<init>(r2, r7, r0, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.C41524i.c(java.lang.String, java.lang.String):io.ktor.http.i");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C41524i) {
            C41524i c41524i = (C41524i) obj;
            if (C43066x.C(this.f400033d, c41524i.f400033d, true) && C43066x.C(this.f400034e, c41524i.f400034e, true)) {
                if (kotlin.jvm.internal.L.f(this.f399895b, c41524i.f399895b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.f400033d.toLowerCase(locale).hashCode();
        return (this.f399895b.hashCode() * 31) + this.f400034e.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
    }

    public C41524i(String str, String str2, String str3, List<P> list) {
        super(str3, list);
        this.f400033d = str;
        this.f400034e = str2;
    }

    public C41524i(String str, String str2, String str3, List list, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? C42784z0.f406748b : list);
    }

    public C41524i(String str, String str2, List list, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? C42784z0.f406748b : list);
    }
}
