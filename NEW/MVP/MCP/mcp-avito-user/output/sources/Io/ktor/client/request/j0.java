package io.ktor.client.request;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HttpRequestPipeline.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/request/j0;", "Lio/ktor/util/pipeline/d;", "", "Lio/ktor/client/request/d0;", "a", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class j0 extends io.ktor.util.pipeline.d<Object, d0> {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f399750g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.util.pipeline.k f399751h = new io.ktor.util.pipeline.k("Before");

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.util.pipeline.k f399752i = new io.ktor.util.pipeline.k("State");

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.util.pipeline.k f399753j = new io.ktor.util.pipeline.k("Transform");

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.util.pipeline.k f399754k = new io.ktor.util.pipeline.k("Render");

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final io.ktor.util.pipeline.k f399755l = new io.ktor.util.pipeline.k("Send");

    /* renamed from: f, reason: collision with root package name */
    public final boolean f399756f;

    /* compiled from: HttpRequestPipeline.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/request/j0$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j0() {
        this(false, 1, null);
    }

    @Override // io.ktor.util.pipeline.d
    /* renamed from: d, reason: from getter */
    public final boolean getF399770f() {
        return this.f399756f;
    }

    public /* synthetic */ j0(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public j0(boolean z12) {
        super(f399751h, f399752i, f399753j, f399754k, f399755l);
        this.f399756f = z12;
    }
}
