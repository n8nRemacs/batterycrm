package dU0;

import Y61.k;
import Y61.l;
import eU0.C40052a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InteractionWrapper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LdU0/f;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f393890a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f393891b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C40052a f393892c;

    public f(@k String str, @k b bVar, @l C40052a c40052a) {
        this.f393890a = str;
        this.f393891b = bVar;
        this.f393892c = c40052a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f393890a, fVar.f393890a) && L.f(this.f393891b, fVar.f393891b) && L.f(this.f393892c, fVar.f393892c);
    }

    public final int hashCode() {
        int iHashCode = (this.f393891b.hashCode() + (this.f393890a.hashCode() * 31)) * 31;
        C40052a c40052a = this.f393892c;
        return iHashCode + (c40052a == null ? 0 : c40052a.hashCode());
    }

    @k
    public final String toString() {
        return "InteractionWrapper(type=" + this.f393890a + ", interaction=" + this.f393891b + ", group=" + this.f393892c + ')';
    }

    public /* synthetic */ f(String str, b bVar, C40052a c40052a, int i12, C42822w c42822w) {
        this(str, bVar, (i12 & 4) != 0 ? null : c40052a);
    }
}
