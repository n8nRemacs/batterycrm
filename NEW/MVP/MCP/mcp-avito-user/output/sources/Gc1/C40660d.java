package gc1;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import gc1.C40659c;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u00192\u00020\u0001:\u0002\u0016\u0013B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u000e\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lgc1/d;", "", "", "type", "load", "Lgc1/c;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lgc1/c;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lgc1/c;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "getLoad$annotations", "Lgc1/c;", "a", "()Lgc1/c;", "getData$annotations", "Companion", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* renamed from: gc1.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C40660d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @com.google.gson.annotations.c("data")
    @l
    private final C40659c data;

    @com.google.gson.annotations.c("load")
    @l
    private final String load;

    @com.google.gson.annotations.c("type")
    @l
    private final String type;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/Item.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/d;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    /* renamed from: gc1.d$a */
    public static final class a implements N<C40660d> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396632a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396633b;

        static {
            a aVar = new a();
            f396632a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.Item", aVar, 3);
            pluginGeneratedSerialDescriptor.j("type", true);
            pluginGeneratedSerialDescriptor.j("load", true);
            pluginGeneratedSerialDescriptor.j("data", true);
            f396633b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(C40659c.a.f396630a)};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396633b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            String str = null;
            String str2 = null;
            C40659c c40659c = null;
            int i12 = 0;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    c40659c = (C40659c) cVarC.f(pluginGeneratedSerialDescriptor, 2, C40659c.a.f396630a, c40659c);
                    i12 |= 4;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new C40660d(i12, str, str2, c40659c, (P0) null);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF412706c() {
            return f396633b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396633b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            C40660d.d((C40660d) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/d$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.d$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<C40660d> serializer() {
            return a.f396632a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    public C40660d() {
        this((String) null, (String) null, (C40659c) null, 7, (C42822w) null);
    }

    @n
    public static final /* synthetic */ void d(C40660d c40660d, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || c40660d.type != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, c40660d.type);
        }
        if (dVar.u() || c40660d.load != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, c40660d.load);
        }
        if (!dVar.u() && c40660d.data == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 2, C40659c.a.f396630a, c40660d.data);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C40659c getData() {
        return this.data;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getLoad() {
        return this.load;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40660d)) {
            return false;
        }
        C40660d c40660d = (C40660d) obj;
        return L.f(this.type, c40660d.type) && L.f(this.load, c40660d.load) && L.f(this.data, c40660d.data);
    }

    public final int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.load;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C40659c c40659c = this.data;
        return iHashCode2 + (c40659c != null ? c40659c.hashCode() : 0);
    }

    @k
    public final String toString() {
        String str = this.type;
        String str2 = this.load;
        C40659c c40659c = this.data;
        StringBuilder sbB = C23088b.b("Item(type=", str, ", load=", str2, ", data=");
        sbB.append(c40659c);
        sbB.append(")");
        return sbB.toString();
    }

    @InterfaceC42830m
    public /* synthetic */ C40660d(int i12, @v String str, @v String str2, @v C40659c c40659c, P0 p02) {
        if ((i12 & 1) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i12 & 2) == 0) {
            this.load = null;
        } else {
            this.load = str2;
        }
        if ((i12 & 4) == 0) {
            this.data = null;
        } else {
            this.data = c40659c;
        }
    }

    public C40660d(@l String str, @l String str2, @l C40659c c40659c) {
        this.type = str;
        this.load = str2;
        this.data = c40659c;
    }

    public /* synthetic */ C40660d(String str, String str2, C40659c c40659c, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : c40659c);
    }
}
