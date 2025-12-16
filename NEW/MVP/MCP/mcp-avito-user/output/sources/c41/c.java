package C41;

import C41.a;
import C41.d;
import C41.e;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B?\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"LC41/c;", "", "", "seen1", "LC41/d;", Constants.REFERRER_API_META, "LC41/e;", "profile", "", "LC41/a;", "data", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILC41/d;LC41/e;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
@w
/* loaded from: classes8.dex */
public final /* data */ class c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f1944a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f1945b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<C41.a> f1946c;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/sber/platform/clickstream/clickstreamlite/internal/models/EventsPackage.$serializer", "Lkotlinx/serialization/internal/N;", "LC41/c;", "<init>", "()V", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    @InterfaceC42830m
    public static final class a implements N<c> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1947a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1948b;

        static {
            a aVar = new a();
            f1947a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.sber.platform.clickstream.clickstreamlite.internal.models.EventsPackage", aVar, 3);
            pluginGeneratedSerialDescriptor.j(Constants.REFERRER_API_META, false);
            pluginGeneratedSerialDescriptor.j("profile", false);
            pluginGeneratedSerialDescriptor.j("data", false);
            f1948b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{d.a.f1962a, e.a.f1978a, new C43401f(a.C0090a.f1938a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1948b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            Object objV = null;
            boolean z12 = true;
            Object objV2 = null;
            Object objV3 = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objV = cVarC.v(pluginGeneratedSerialDescriptor, 0, d.a.f1962a, objV);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    objV2 = cVarC.v(pluginGeneratedSerialDescriptor, 1, e.a.f1978a, objV2);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV3 = cVarC.v(pluginGeneratedSerialDescriptor, 2, new C43401f(a.C0090a.f1938a), objV3);
                    i12 |= 4;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new c(i12, (d) objV, (e) objV2, (List) objV3, null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f1948b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            c cVar = (c) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1948b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            Companion companion = c.INSTANCE;
            dVarC.F(pluginGeneratedSerialDescriptor, 0, d.a.f1962a, cVar.f1944a);
            dVarC.F(pluginGeneratedSerialDescriptor, 1, e.a.f1978a, cVar.f1945b);
            dVarC.F(pluginGeneratedSerialDescriptor, 2, new C43401f(a.C0090a.f1938a), cVar.f1946c);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC41/c$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LC41/c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    /* renamed from: C41.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<c> serializer() {
            return a.f1947a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public c(int i12, d dVar, e eVar, List list, P0 p02) {
        if (7 != (i12 & 7)) {
            a.f1947a.getClass();
            E0.b(i12, 7, a.f1948b);
            throw null;
        }
        this.f1944a = dVar;
        this.f1945b = eVar;
        this.f1946c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f1944a, cVar.f1944a) && L.f(this.f1945b, cVar.f1945b) && L.f(this.f1946c, cVar.f1946c);
    }

    public final int hashCode() {
        return this.f1946c.hashCode() + ((this.f1945b.hashCode() + (this.f1944a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventsPackage(meta=");
        sb2.append(this.f1944a);
        sb2.append(", profile=");
        sb2.append(this.f1945b);
        sb2.append(", data=");
        return H.p(sb2, this.f1946c, ')');
    }

    public c(@k d dVar, @k e eVar, @k List<C41.a> list) {
        this.f1944a = dVar;
        this.f1945b = eVar;
        this.f1946c = list;
    }
}
