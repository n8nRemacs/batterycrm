package pN0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import oN0.C44668a;

/* compiled from: VideoRequirementsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LpN0/d;", "", "a", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f428514b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final d f428515c = new d(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final C44668a f428516a;

    /* compiled from: VideoRequirementsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LpN0/d$a;", "", "<init>", "()V", "_avito_video-requirements_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l C44668a c44668a) {
        this.f428516a = c44668a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f428516a, ((d) obj).f428516a);
    }

    public final int hashCode() {
        C44668a c44668a = this.f428516a;
        if (c44668a == null) {
            return 0;
        }
        return c44668a.hashCode();
    }

    @k
    public final String toString() {
        return "VideoRequirementsState(videoRequirements=" + this.f428516a + ')';
    }
}
