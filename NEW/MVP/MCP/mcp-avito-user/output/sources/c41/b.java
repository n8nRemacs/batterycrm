package C41;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB/\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"LC41/b;", "", "", "seen1", "", "key", "value", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Companion", "a", "b", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
@w
/* loaded from: classes8.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f1940a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1941b;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ru/sber/platform/clickstream/clickstreamlite/internal/models/EventProperty.$serializer", "Lkotlinx/serialization/internal/N;", "LC41/b;", "<init>", "()V", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1942a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f1943b;

        static {
            a aVar = new a();
            f1942a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.sber.platform.clickstream.clickstreamlite.internal.models.EventProperty", aVar, 2);
            pluginGeneratedSerialDescriptor.j("key", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            f1943b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1943b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            boolean z12 = true;
            String strS = null;
            String strS2 = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                    i12 |= 2;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new b(i12, strS, strS2, null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f1943b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            b bVar = (b) obj;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f1943b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            dVarC.l(pluginGeneratedSerialDescriptor, 0, bVar.f1940a);
            dVarC.l(pluginGeneratedSerialDescriptor, 1, bVar.f1941b);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LC41/b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LC41/b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "clickstreamLite"}, k = 1, mv = {1, 8, 0})
    /* renamed from: C41.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<b> serializer() {
            return a.f1942a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    @InterfaceC42830m
    public b(int i12, String str, String str2, P0 p02) {
        if (3 == (i12 & 3)) {
            this.f1940a = str;
            this.f1941b = str2;
        } else {
            a.f1942a.getClass();
            E0.b(i12, 3, a.f1943b);
            throw null;
        }
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f1940a, bVar.f1940a) && L.f(this.f1941b, bVar.f1941b);
    }

    public final int hashCode() {
        return this.f1941b.hashCode() + (this.f1940a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventProperty(key=");
        sb2.append(this.f1940a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f1941b, ')');
    }

    public b(@k String str, @k String str2) {
        this.f1940a = str;
        this.f1941b = str2;
    }
}
