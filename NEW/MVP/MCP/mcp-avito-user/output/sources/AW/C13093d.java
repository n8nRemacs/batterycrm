package Aw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReturnToWorkState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LAw/d;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Aw.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C13093d {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f701c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f702a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f703b;

    /* compiled from: ReturnToWorkState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAw/d$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Aw.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C13093d(@k String str, boolean z12) {
        this.f702a = str;
        this.f703b = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13093d)) {
            return false;
        }
        C13093d c13093d = (C13093d) obj;
        return L.f(this.f702a, c13093d.f702a) && this.f703b == c13093d.f703b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f703b) + (this.f702a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReturnToWorkState(applicationId=");
        sb2.append(this.f702a);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f703b, ')');
    }
}
