package yc0;

import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileSettingsAction.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyc0/u;", "Lyc0/D;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class u implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.promoblock.a f443349a;

    public u(@Y61.k com.avito.android.promoblock.a aVar) {
        this.f443349a = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && L.f(this.f443349a, ((u) obj).f443349a);
    }

    public final int hashCode() {
        return this.f443349a.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "PromoBlockWidgetAction(action=" + this.f443349a + ')';
    }
}
