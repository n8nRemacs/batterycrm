package J90;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveConfirmState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJ90/d;", "", "a", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f8820c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final d f8821d = new d(false, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8822a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f8823b;

    /* compiled from: ProfileRemoveConfirmState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJ90/d$a;", "", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(boolean z12, @l String str) {
        this.f8822a = z12;
        this.f8823b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f8822a == dVar.f8822a && L.f(this.f8823b, dVar.f8823b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f8822a) * 31;
        String str = this.f8823b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileRemoveConfirmState(isLoading=");
        sb2.append(this.f8822a);
        sb2.append(", errorMessage=");
        return C22026a.c(sb2, this.f8823b, ')');
    }
}
