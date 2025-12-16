package oq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsItemPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq0/h;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f420230a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f420231b;

    public h(@k String str, boolean z12) {
        this.f420230a = str;
        this.f420231b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f420230a, hVar.f420230a) && this.f420231b == hVar.f420231b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f420231b) + (this.f420230a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableDistrictsPayload(id=");
        sb2.append(this.f420230a);
        sb2.append(", isChecked=");
        return r.x(sb2, this.f420231b, ')');
    }
}
