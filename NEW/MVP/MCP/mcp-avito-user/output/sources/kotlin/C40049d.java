package kotlin;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LeT/d;", "", "a", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eT.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40049d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f395219b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<com.avito.beduin.v2.interaction.navigation.flow.u, com.avito.beduin.v2.engine.D> f395220a;

    /* compiled from: BeduinState.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LeT/d$a;", "", "<init>", "()V", "_design-modules_beduin-v2_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eT.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C40049d() {
        throw null;
    }

    public C40049d(Map map, C42822w c42822w) {
        this.f395220a = map;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (C40049d.class.equals(obj != null ? obj.getClass() : null)) {
            return kotlin.jvm.internal.L.f(this.f395220a, ((C40049d) obj).f395220a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f395220a.hashCode();
    }
}
