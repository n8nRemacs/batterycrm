package iw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import hw.InterfaceC41178c;
import j.U;
import kotlin.Metadata;

/* compiled from: SearchInputLayoutChange.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liw/a;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C42120a {

    /* renamed from: a, reason: collision with root package name */
    public final int f405389a;

    /* renamed from: b, reason: collision with root package name */
    public final int f405390b;

    public C42120a(@U int i12, @U int i13) {
        this.f405389a = i12;
        this.f405390b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42120a)) {
            return false;
        }
        C42120a c42120a = (C42120a) obj;
        return this.f405389a == c42120a.f405389a && this.f405390b == c42120a.f405390b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f405390b) + (Integer.hashCode(this.f405389a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchInputLayoutChange(marginLeft=");
        sb2.append(this.f405389a);
        sb2.append(", width=");
        return r.t(sb2, this.f405390b, ')');
    }
}
