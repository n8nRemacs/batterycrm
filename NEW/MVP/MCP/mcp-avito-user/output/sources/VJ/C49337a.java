package vj;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import mx0.InterfaceC44149a;

/* compiled from: BeduinSocketEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvj/a;", "Lmx0/a;", "_avito_beduin-shared_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C49337a implements InterfaceC44149a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, Object> f440940a;

    public C49337a(@k Map<String, ? extends Object> map) {
        this.f440940a = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C49337a) && L.f(this.f440940a, ((C49337a) obj).f440940a);
    }

    public final int hashCode() {
        return this.f440940a.hashCode();
    }

    @k
    public final String toString() {
        return r.w(new StringBuilder("BeduinSocketEvent(params="), this.f440940a, ')');
    }
}
