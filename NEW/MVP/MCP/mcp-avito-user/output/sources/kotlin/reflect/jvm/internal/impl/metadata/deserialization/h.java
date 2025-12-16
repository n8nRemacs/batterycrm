package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Y61.k;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: VersionRequirement.kt */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f409142b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final h f409143c = new h(C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<ProtoBuf.VersionRequirement> f409144a;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static h a(@k ProtoBuf.m mVar) {
            return mVar.f409086c.size() == 0 ? h.f409143c : new h(mVar.f409086c, null);
        }

        public a() {
        }
    }

    public /* synthetic */ h(List list, C42822w c42822w) {
        this(list);
    }

    public h(List<ProtoBuf.VersionRequirement> list) {
        this.f409144a = list;
    }
}
