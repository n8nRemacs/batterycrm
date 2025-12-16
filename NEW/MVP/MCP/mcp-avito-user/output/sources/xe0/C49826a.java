package xE0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.room.InterfaceC23472t;
import androidx.room.J;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TimestampEntity.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxE0/a;", "", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@J
/* renamed from: xE0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C49826a {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @k
    public final String f442305a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @k
    public final String f442306b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    public final long f442307c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @k
    public final Map<String, Long> f442308d;

    public C49826a(long j12, @k String str, @k String str2, @k Map map) {
        this.f442305a = str;
        this.f442306b = str2;
        this.f442307c = j12;
        this.f442308d = map;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49826a)) {
            return false;
        }
        C49826a c49826a = (C49826a) obj;
        return L.f(this.f442305a, c49826a.f442305a) && L.f(this.f442306b, c49826a.f442306b) && this.f442307c == c49826a.f442307c && L.f(this.f442308d, c49826a.f442308d);
    }

    public final int hashCode() {
        return this.f442308d.hashCode() + r.g(H.d(this.f442305a.hashCode() * 31, 31, this.f442306b), 31, this.f442307c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimestampEntity(key=");
        sb2.append(this.f442305a);
        sb2.append(", uid=");
        sb2.append(this.f442306b);
        sb2.append(", timestamp=");
        sb2.append(this.f442307c);
        sb2.append(", inners=");
        return r.w(sb2, this.f442308d, ')');
    }

    public /* synthetic */ C49826a(String str, String str2, long j12, Map map, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 2) != 0 ? "" : str2, (i12 & 8) != 0 ? P0.c() : map);
    }
}
