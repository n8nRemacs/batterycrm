package ru.cyberity.ff.model;

import X41.n;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.c;
import kotlinx.serialization.encoding.d;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: FeatureFlagsResponse.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002\u0014\"B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB;\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010!\u001a\u0004\b'\u0010\u0017¨\u0006*"}, d2 = {"Lru/cyberity/ff/model/b;", "", "", "experiment", "enabled", "", "value", "<init>", "(ZZLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(IZZLjava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/ff/model/b;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "getExperiment$annotations", "()V", "b", "d", "getEnabled$annotations", "c", "Ljava/lang/String;", "h", "getValue$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class b {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean experiment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private final String value;

    /* compiled from: FeatureFlagsResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/ff/model/RemoteFeatureFlag.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/ff/model/b;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/ff/model/b;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/ff/model/b;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<b> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f435680a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f435681b;

        static {
            a aVar = new a();
            f435680a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.ff.model.RemoteFeatureFlag", aVar, 3);
            pluginGeneratedSerialDescriptor.j("experiment", true);
            pluginGeneratedSerialDescriptor.j("enabled", true);
            pluginGeneratedSerialDescriptor.j("value", true);
            f435681b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b deserialize(@k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            boolean zD2 = false;
            boolean zD3 = false;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    zD2 = cVarC.D(f412706c, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    zD3 = cVarC.D(f412706c, 1);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF = cVarC.f(f412706c, 2, V0.f412822a, objF);
                    i12 |= 4;
                }
            }
            cVarC.d(f412706c);
            return new b(i12, zD2, zD3, (String) objF, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] childSerializers() {
            KSerializer<?> kSerializerA = L51.a.a(V0.f412822a);
            C43407i c43407i = C43407i.f412866a;
            return new KSerializer[]{c43407i, c43407i, kSerializerA};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f435681b;
        }

        @Override // kotlinx.serialization.internal.N
        @k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@k Encoder encoder, @k b value) {
            SerialDescriptor f412706c = getF412706c();
            d dVarC = encoder.c(f412706c);
            b.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: FeatureFlagsResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/ff/model/b$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/ff/model/b;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.ff.model.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final KSerializer<b> serializer() {
            return a.f435680a;
        }

        private Companion() {
        }
    }

    public b() {
        this(false, false, (String) null, 7, (C42822w) null);
    }

    @n
    public static final void a(@k b self, @k d output, @k SerialDescriptor serialDesc) {
        if (output.u() || self.experiment) {
            output.k(serialDesc, 0, self.experiment);
        }
        if (output.u() || self.enabled) {
            output.k(serialDesc, 1, self.enabled);
        }
        if (!output.u() && self.value == null) {
            return;
        }
        output.p(serialDesc, 2, V0.f412822a, self.value);
    }

    /* renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return this.experiment == bVar.experiment && this.enabled == bVar.enabled && L.f(this.value, bVar.value);
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z12 = this.experiment;
        ?? r02 = z12;
        if (z12) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        boolean z13 = this.enabled;
        int i13 = (i12 + (z13 ? 1 : z13 ? 1 : 0)) * 31;
        String str = this.value;
        return i13 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteFeatureFlag(experiment=");
        sb2.append(this.experiment);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @InterfaceC42830m
    public /* synthetic */ b(int i12, @v boolean z12, @v boolean z13, @v String str, P0 p02) {
        if ((i12 & 1) == 0) {
            this.experiment = false;
        } else {
            this.experiment = z12;
        }
        if ((i12 & 2) == 0) {
            this.enabled = false;
        } else {
            this.enabled = z13;
        }
        if ((i12 & 4) == 0) {
            this.value = null;
        } else {
            this.value = str;
        }
    }

    public b(boolean z12, boolean z13, @l String str) {
        this.experiment = z12;
        this.enabled = z13;
        this.value = str;
    }

    public /* synthetic */ b(boolean z12, boolean z13, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? false : z13, (i12 & 4) != 0 ? null : str);
    }
}
