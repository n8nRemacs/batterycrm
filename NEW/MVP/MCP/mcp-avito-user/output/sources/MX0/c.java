package mx0;

import Y61.k;
import Y61.l;
import com.avito.android.socketEvents.SocketEventParser;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SocketEventMapping.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx0/c;", "", "_avito_socket-events_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Class<? extends InterfaceC44149a> f414830a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f414831b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SocketEventParser f414832c;

    public c(@k Class<? extends InterfaceC44149a> cls, @k e eVar, @k SocketEventParser socketEventParser) {
        this.f414830a = cls;
        this.f414831b = eVar;
        this.f414832c = socketEventParser;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f414830a, cVar.f414830a) && L.f(this.f414831b, cVar.f414831b) && L.f(this.f414832c, cVar.f414832c);
    }

    public final int hashCode() {
        return this.f414832c.hashCode() + ((this.f414831b.hashCode() + (this.f414830a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "SocketEventMapping(socketEventClass=" + this.f414830a + ", type=" + this.f414831b + ", parser=" + this.f414832c + ')';
    }
}
