package rw0;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import rw0.f;

/* compiled from: AccommodationInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47926a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f437169a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final f.b f437170b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final g f437171c;

    public C47926a(@Y61.k String str, @Y61.k f.b bVar, @Y61.l g gVar) {
        this.f437169a = str;
        this.f437170b = bVar;
        this.f437171c = gVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47926a)) {
            return false;
        }
        C47926a c47926a = (C47926a) obj;
        return L.f(this.f437169a, c47926a.f437169a) && this.f437170b.equals(c47926a.f437170b) && L.f(this.f437171c, c47926a.f437171c);
    }

    public final int hashCode() {
        int iHashCode = (this.f437170b.hashCode() + (this.f437169a.hashCode() * 31)) * 31;
        g gVar = this.f437171c;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "AccommodationInfo(title=" + this.f437169a + ", dateRangeFieldState=" + this.f437170b + ", guestCountFieldState=" + this.f437171c + ')';
    }
}
