package io.ktor.http;

import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpMethod.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/http/l0;", "", "a", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.l0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C41531l0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f400052b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C41531l0 f400053c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C41531l0 f400054d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final C41531l0 f400055e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final List<C41531l0> f400056f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f400057a;

    /* compiled from: HttpMethod.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/l0$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.l0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        C41531l0 c41531l0 = new C41531l0("GET");
        f400053c = c41531l0;
        C41531l0 c41531l02 = new C41531l0("POST");
        f400054d = c41531l02;
        C41531l0 c41531l03 = new C41531l0("PUT");
        C41531l0 c41531l04 = new C41531l0("PATCH");
        C41531l0 c41531l05 = new C41531l0("DELETE");
        C41531l0 c41531l06 = new C41531l0("HEAD");
        f400055e = c41531l06;
        f400056f = C42745f0.U(c41531l0, c41531l02, c41531l03, c41531l04, c41531l05, c41531l06, new C41531l0("OPTIONS"));
    }

    public C41531l0(@Y61.k String str) {
        this.f400057a = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41531l0) && kotlin.jvm.internal.L.f(this.f400057a, ((C41531l0) obj).f400057a);
    }

    public final int hashCode() {
        return this.f400057a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("HttpMethod(value="), this.f400057a, ')');
    }
}
