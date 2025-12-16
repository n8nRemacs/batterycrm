package oq0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: SelectDistrictsItemPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq0/b;", "Loq0/i;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oq0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C44844b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f420226a;

    public C44844b(int i12) {
        this.f420226a = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44844b) && this.f420226a == ((C44844b) obj).f420226a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f420226a);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("DistrictTagUncheckedPayload(position="), this.f420226a, ')');
    }
}
