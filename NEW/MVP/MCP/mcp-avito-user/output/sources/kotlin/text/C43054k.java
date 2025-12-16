package kotlin.text;

import kotlin.Metadata;

/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/k;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.text.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* data */ class C43054k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f410612a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.ranges.l f410613b;

    public C43054k(@Y61.k String str, @Y61.k kotlin.ranges.l lVar) {
        this.f410612a = str;
        this.f410613b = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43054k)) {
            return false;
        }
        C43054k c43054k = (C43054k) obj;
        return kotlin.jvm.internal.L.f(this.f410612a, c43054k.f410612a) && kotlin.jvm.internal.L.f(this.f410613b, c43054k.f410613b);
    }

    public final int hashCode() {
        return this.f410613b.hashCode() + (this.f410612a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "MatchGroup(value=" + this.f410612a + ", range=" + this.f410613b + ')';
    }
}
