package io.ktor.http.auth;

import Y61.k;
import Y61.l;
import io.ktor.http.P;
import io.ktor.http.parsing.ParseException;
import io.ktor.util.C41589c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: HttpAuthHeader.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/auth/b;", "", "a", "b", "c", "d", "Lio/ktor/http/auth/b$b;", "Lio/ktor/http/auth/b$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f399926a;

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/auth/b$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/auth/b$c;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {
        static {
            new c();
        }
    }

    /* compiled from: HttpAuthHeader.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/auth/b$d;", "Lio/ktor/http/auth/b;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends b {
        @Override // io.ktor.http.auth.b
        @k
        public final String a() {
            return AK.c.s(new StringBuilder(), this.f399926a, " null");
        }

        public final boolean equals(@l Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!C43066x.C(dVar.f399926a, this.f399926a, true)) {
                return false;
            }
            dVar.getClass();
            return C43066x.C(null, null, true);
        }

        public final int hashCode() {
            C41589c0 c41589c0 = C41589c0.f400430a;
            this.f399926a.toLowerCase(Locale.ROOT);
            throw null;
        }
    }

    static {
        new a(null);
    }

    public b(String str, C42822w c42822w) {
        this.f399926a = str;
        if (!e.f399934c.e(str)) {
            throw new ParseException("Invalid authScheme value: it should be token, but instead it is ".concat(str), null, 2, null);
        }
    }

    @k
    public abstract String a();

    @k
    public final String toString() {
        return a();
    }

    /* compiled from: HttpAuthHeader.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/auth/b$b;", "Lio/ktor/http/auth/b;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.auth.b$b, reason: collision with other inner class name */
    public static final class C11410b extends b {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f399927d = 0;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<P> f399928b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final HeaderValueEncoding f399929c;

        /* compiled from: HttpAuthHeader.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: io.ktor.http.auth.b$b$a */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public C11410b() {
            throw null;
        }

        public /* synthetic */ C11410b(String str, List list, HeaderValueEncoding headerValueEncoding, int i12, C42822w c42822w) {
            this(str, list, (i12 & 4) != 0 ? HeaderValueEncoding.f399924b : headerValueEncoding);
        }

        @Override // io.ktor.http.auth.b
        @k
        public final String a() {
            List<P> list = this.f399928b;
            boolean zIsEmpty = list.isEmpty();
            String str = this.f399926a;
            if (zIsEmpty) {
                return str;
            }
            return C42745f0.O(list, ", ", str + ' ', null, new io.ktor.http.auth.c(this, this.f399929c), 28);
        }

        public final boolean equals(@l Object obj) {
            if (!(obj instanceof C11410b)) {
                return false;
            }
            C11410b c11410b = (C11410b) obj;
            return C43066x.C(c11410b.f399926a, this.f399926a, true) && L.f(c11410b.f399928b, this.f399928b);
        }

        public final int hashCode() {
            C41589c0 c41589c0 = C41589c0.f400430a;
            Object[] objArr = {this.f399926a.toLowerCase(Locale.ROOT), this.f399928b};
            c41589c0.getClass();
            return C42756l.g0(objArr).hashCode();
        }

        public C11410b(@k String str, @k List<P> list, @k HeaderValueEncoding headerValueEncoding) {
            super(str, null);
            this.f399928b = list;
            this.f399929c = headerValueEncoding;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!e.f399934c.e(((P) it.next()).f399891a)) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        public C11410b(String str, Map map, HeaderValueEncoding headerValueEncoding, int i12, C42822w c42822w) {
            headerValueEncoding = (i12 & 4) != 0 ? HeaderValueEncoding.f399924b : headerValueEncoding;
            Set<Map.Entry> setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList(C42745f0.q(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                arrayList.add(new P((String) entry.getKey(), (String) entry.getValue()));
            }
            this(str, arrayList, headerValueEncoding);
        }
    }
}
