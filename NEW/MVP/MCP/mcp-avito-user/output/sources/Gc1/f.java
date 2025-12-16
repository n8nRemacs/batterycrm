package gc1;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import gc1.C40660d;
import gc1.e;
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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u000f\u0014B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lgc1/f;", "", "Lgc1/e;", "property", "", "Lgc1/d;", "sections", "<init>", "(Lgc1/e;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILgc1/e;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "Lgc1/e;", "a", "()Lgc1/e;", "getProperty$annotations", "()V", "Ljava/util/List;", "b", "()Ljava/util/List;", "getSections$annotations", "Companion", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public final /* data */ class f {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final KSerializer<Object>[] f396636a = {null, new C43401f(C40660d.a.f396632a)};

    @com.google.gson.annotations.c("property")
    @l
    private final e property;

    @com.google.gson.annotations.c("sections")
    @l
    private final List<C40660d> sections;

    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/ui/models/root/RootELKResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lgc1/f;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class a implements N<f> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396637a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ PluginGeneratedSerialDescriptor f396638b;

        static {
            a aVar = new a();
            f396637a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.ui.models.root.RootELKResponse", aVar, 2);
            pluginGeneratedSerialDescriptor.j("property", true);
            pluginGeneratedSerialDescriptor.j("sections", true);
            f396638b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(e.a.f396634a), L51.a.a(f.f396636a[1])};
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        public final Object deserialize(Decoder decoder) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396638b;
            kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
            KSerializer<Object>[] kSerializerArr = f.f396636a;
            P0 p02 = null;
            boolean z12 = true;
            e eVar = null;
            List list = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    eVar = (e) cVarC.f(pluginGeneratedSerialDescriptor, 0, e.a.f396634a, eVar);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    list = (List) cVarC.f(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                    i12 |= 2;
                }
            }
            cVarC.d(pluginGeneratedSerialDescriptor);
            return new f(i12, eVar, list, p02);
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public final SerialDescriptor getF332717a() {
            return f396638b;
        }

        @Override // kotlinx.serialization.x
        public final void serialize(Encoder encoder, Object obj) {
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f396638b;
            kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
            f.c((f) obj, dVarC, pluginGeneratedSerialDescriptor);
            dVarC.d(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public final KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgc1/f$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lgc1/f;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gc1.f$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @k
        public final KSerializer<f> serializer() {
            return a.f396637a;
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this((e) null, (List) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @n
    public static final /* synthetic */ void c(f fVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        if (dVar.u() || fVar.property != null) {
            dVar.p(pluginGeneratedSerialDescriptor, 0, e.a.f396634a, fVar.property);
        }
        if (!dVar.u() && fVar.sections == null) {
            return;
        }
        dVar.p(pluginGeneratedSerialDescriptor, 1, f396636a[1], fVar.sections);
    }

    @l
    /* renamed from: a, reason: from getter */
    public final e getProperty() {
        return this.property;
    }

    @l
    public final List<C40660d> b() {
        return this.sections;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.property, fVar.property) && L.f(this.sections, fVar.sections);
    }

    public final int hashCode() {
        e eVar = this.property;
        int iHashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
        List<C40660d> list = this.sections;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RootELKResponse(property=" + this.property + ", sections=" + this.sections + ")";
    }

    @InterfaceC42830m
    public /* synthetic */ f(int i12, @v e eVar, @v List list, P0 p02) {
        if ((i12 & 1) == 0) {
            this.property = null;
        } else {
            this.property = eVar;
        }
        if ((i12 & 2) == 0) {
            this.sections = null;
        } else {
            this.sections = list;
        }
    }

    public f(@l e eVar, @l List<C40660d> list) {
        this.property = eVar;
        this.sections = list;
    }

    public /* synthetic */ f(e eVar, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : eVar, (i12 & 2) != 0 ? null : list);
    }
}
