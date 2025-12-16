package sx0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.models.SparePartsGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SparePartsV3ClicksRelay.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsx0/a;", "", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C48428a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SparePartsGroup f438930a;

    public C48428a(@k SparePartsGroup sparePartsGroup) {
        this.f438930a = sparePartsGroup;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48428a) && L.f(this.f438930a, ((C48428a) obj).f438930a);
    }

    public final int hashCode() {
        return this.f438930a.hashCode();
    }

    @k
    public final String toString() {
        return "ClickEvent(group=" + this.f438930a + ')';
    }
}
