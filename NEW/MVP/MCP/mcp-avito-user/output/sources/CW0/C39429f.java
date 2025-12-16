package cw0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormViewState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcw0/f;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cw0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C39429f {

    /* renamed from: a, reason: collision with root package name */
    public final long f393088a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f393089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C39428e f393090c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C39427d f393091d;

    /* JADX WARN: Multi-variable type inference failed */
    public C39429f(long j12, @k List<? extends com.avito.conveyor_item.a> list, @k C39428e c39428e, @k C39427d c39427d) {
        this.f393088a = j12;
        this.f393089b = list;
        this.f393090c = c39428e;
        this.f393091d = c39427d;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39429f)) {
            return false;
        }
        C39429f c39429f = (C39429f) obj;
        return this.f393088a == c39429f.f393088a && L.f(this.f393089b, c39429f.f393089b) && L.f(this.f393090c, c39429f.f393090c) && L.f(this.f393091d, c39429f.f393091d);
    }

    public final int hashCode() {
        return this.f393091d.hashCode() + ((this.f393090c.hashCode() + H.e(Long.hashCode(this.f393088a) * 31, 31, this.f393089b)) * 31);
    }

    @k
    public final String toString() {
        return "PageItem(id=" + this.f393088a + ", items=" + this.f393089b + ", header=" + this.f393090c + ", footer=" + this.f393091d + ')';
    }
}
