package e60;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileToConvertState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le60/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e60.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C39958c extends q {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f394962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TV0.a> f394963c;

    public C39958c() {
        this(null, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39958c)) {
            return false;
        }
        C39958c c39958c = (C39958c) obj;
        return L.f(this.f394962b, c39958c.f394962b) && L.f(this.f394963c, c39958c.f394963c);
    }

    public final int hashCode() {
        String str = this.f394962b;
        return this.f394963c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileToConvertState(selectedUserId=");
        sb2.append(this.f394962b);
        sb2.append(", items=");
        return H.p(sb2, this.f394963c, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C39958c(@l String str, @k List<? extends TV0.a> list) {
        this.f394962b = str;
        this.f394963c = list;
    }

    public C39958c(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
