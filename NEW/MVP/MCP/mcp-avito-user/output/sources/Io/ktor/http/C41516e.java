package io.ktor.http;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ContentDisposition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/e;", "Lio/ktor/http/Q;", "a", "b", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.http.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41516e extends Q {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f400000d = new a(null);

    /* compiled from: ContentDisposition.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/e$a;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.e$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ContentDisposition.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/e$b;", "", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.http.e$b */
    public static final class b {
        static {
            new b();
        }
    }

    static {
        new C41516e("file", null, 2, null);
        new C41516e("mixed", null, 2, null);
        new C41516e("attachment", null, 2, null);
        new C41516e("inline", null, 2, null);
    }

    public C41516e() {
        throw null;
    }

    public C41516e(String str, List list, int i12, C42822w c42822w) {
        super(str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C41516e) {
            C41516e c41516e = (C41516e) obj;
            if (kotlin.jvm.internal.L.f(this.f399894a, c41516e.f399894a)) {
                if (kotlin.jvm.internal.L.f(this.f399895b, c41516e.f399895b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f399895b.hashCode() + (this.f399894a.hashCode() * 31);
    }
}
