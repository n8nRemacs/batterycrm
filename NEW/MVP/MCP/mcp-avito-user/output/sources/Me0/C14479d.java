package Me0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepsRequestState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LMe0/d;", "", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Me0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C14479d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f10974c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final C14479d f10975d = new C14479d(true, null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f10976a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f10977b;

    /* compiled from: StepsRequestState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMe0/d$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Me0.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C14479d(boolean z12, @l String str) {
        this.f10976a = z12;
        this.f10977b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14479d)) {
            return false;
        }
        C14479d c14479d = (C14479d) obj;
        return this.f10976a == c14479d.f10976a && L.f(this.f10977b, c14479d.f10977b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f10976a) * 31;
        String str = this.f10977b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepsRequestState(isLoading=");
        sb2.append(this.f10976a);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f10977b, ')');
    }
}
