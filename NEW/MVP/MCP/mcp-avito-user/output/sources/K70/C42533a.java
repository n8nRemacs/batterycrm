package k70;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: PersonalSelectionsFeatureData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lk70/a;", "", "_avito_personal-selections_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: k70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C42533a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f406106a;

    public C42533a(boolean z12) {
        this.f406106a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42533a) && this.f406106a == ((C42533a) obj).f406106a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f406106a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("PersonalSelectionsFeatureData(shouldRequestOnStart="), this.f406106a, ')');
    }
}
