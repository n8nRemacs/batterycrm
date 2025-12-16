package oq0;

import Y61.k;
import Y61.l;
import com.avito.android.select_districts.items.selected.o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectDistrictsItemPayloadCreator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loq0/a;", "Loq0/i;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C44843a implements i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final o f420225a;

    public C44843a(@k o oVar) {
        this.f420225a = oVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44843a) && L.f(this.f420225a, ((C44843a) obj).f420225a);
    }

    public final int hashCode() {
        return this.f420225a.hashCode();
    }

    @k
    public final String toString() {
        return "DistrictTagCheckedPayload(item=" + this.f420225a + ')';
    }
}
