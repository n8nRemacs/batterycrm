package ru.cyberity.cbr.core.data.source.applicant.remote;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.M;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* compiled from: Location.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0012\"B9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001d\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001f¨\u0006)"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/l;", "", "", "seen1", "", "lat", MessageBody.Location.LONGITUDE, "accuracy", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "<init>", "(IFFFLkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/l;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "F", "f", "()F", "getLat$annotations", "()V", "b", "h", "getLon$annotations", "c", "d", "getAccuracy$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class l {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float lat;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float lon;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float accuracy;

    /* compiled from: Location.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/Location.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/l;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/l;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/l;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<l> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433537a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433538b;

        static {
            a aVar = new a();
            f433537a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.Location", aVar, 3);
            pluginGeneratedSerialDescriptor.j("lat", false);
            pluginGeneratedSerialDescriptor.j(MessageBody.Location.LONGITUDE, false);
            pluginGeneratedSerialDescriptor.j("accuracy", false);
            f433538b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            int i12 = 0;
            float fK2 = 0.0f;
            float fK3 = 0.0f;
            float fK4 = 0.0f;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    fK2 = cVarC.k(f412706c, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    fK3 = cVarC.k(f412706c, 1);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    fK4 = cVarC.k(f412706c, 2);
                    i12 |= 4;
                }
            }
            cVarC.d(f412706c);
            return new l(i12, fK2, fK3, fK4, null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            M m12 = M.f412790a;
            return new KSerializer[]{m12, m12, m12};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433538b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k l value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            l.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: Location.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/l$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/l;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.l$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<l> serializer() {
            return a.f433537a;
        }

        private Companion() {
        }
    }

    @InterfaceC42830m
    public /* synthetic */ l(int i12, @kotlinx.serialization.v float f12, @kotlinx.serialization.v float f13, @kotlinx.serialization.v float f14, P0 p02) {
        if (7 != (i12 & 7)) {
            E0.b(i12, 7, a.f433537a.getF412706c());
            throw null;
        }
        this.lat = f12;
        this.lon = f13;
        this.accuracy = f14;
    }

    @X41.n
    public static final void a(@Y61.k l self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.lat);
        output.s(serialDesc, 1, self.lon);
        output.s(serialDesc, 2, self.accuracy);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return Float.valueOf(this.lat).equals(Float.valueOf(lVar.lat)) && Float.valueOf(this.lon).equals(Float.valueOf(lVar.lon)) && Float.valueOf(this.accuracy).equals(Float.valueOf(lVar.accuracy));
    }

    public int hashCode() {
        return Float.hashCode(this.accuracy) + androidx.appcompat.app.r.d(this.lon, Float.hashCode(this.lat) * 31, 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Location(lat=");
        sb2.append(this.lat);
        sb2.append(", lon=");
        sb2.append(this.lon);
        sb2.append(", accuracy=");
        return androidx.appcompat.app.r.k(')', this.accuracy, sb2);
    }
}
