package ru.cyberity.cbr.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
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
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;

/* compiled from: RequestCode.kt */
@K51.d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002\u0013(B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010$\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u0016¨\u0006/"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "Landroid/os/Parcelable;", "", "targetType", "identifierType", "identifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/w;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "h", "getTargetType$annotations", "()V", "b", "f", "getIdentifierType$annotations", "c", "d", "getIdentifier$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class w implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String targetType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String identifierType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String identifier;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<w> CREATOR = new c();

    /* compiled from: RequestCode.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/RequestCode.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/w;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<w> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433584a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433585b;

        static {
            a aVar = new a();
            f433584a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.RequestCode", aVar, 3);
            pluginGeneratedSerialDescriptor.j("targetType", false);
            pluginGeneratedSerialDescriptor.j("identifierType", false);
            pluginGeneratedSerialDescriptor.j("identifier", false);
            f433585b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            int i12 = 0;
            String strS = null;
            String strS2 = null;
            String strS3 = null;
            boolean z12 = true;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    strS = cVarC.s(f412706c, 0);
                    i12 |= 1;
                } else if (iJ2 == 1) {
                    strS2 = cVarC.s(f412706c, 1);
                    i12 |= 2;
                } else {
                    if (iJ2 != 2) {
                        throw new UnknownFieldException(iJ2);
                    }
                    strS3 = cVarC.s(f412706c, 2);
                    i12 |= 4;
                }
            }
            cVarC.d(f412706c);
            return new w(i12, strS, strS2, strS3, null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{v02, v02, v02};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433585b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k w value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            w.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: RequestCode.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/w$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/w;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.w$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<w> serializer() {
            return a.f433584a;
        }

        private Companion() {
        }
    }

    /* compiled from: RequestCode.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w createFromParcel(@Y61.k Parcel parcel) {
            return new w(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final w[] newArray(int i12) {
            return new w[i12];
        }
    }

    @InterfaceC42830m
    public /* synthetic */ w(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v String str2, @kotlinx.serialization.v String str3, P0 p02) {
        if (7 != (i12 & 7)) {
            E0.b(i12, 7, a.f433584a.getF412706c());
            throw null;
        }
        this.targetType = str;
        this.identifierType = str2;
        this.identifier = str3;
    }

    @X41.n
    public static final void a(@Y61.k w self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        output.l(serialDesc, 0, self.targetType);
        output.l(serialDesc, 1, self.identifierType);
        output.l(serialDesc, 2, self.identifier);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w)) {
            return false;
        }
        w wVar = (w) other;
        return L.f(this.targetType, wVar.targetType) && L.f(this.identifierType, wVar.identifierType) && L.f(this.identifier, wVar.identifier);
    }

    public int hashCode() {
        return this.identifier.hashCode() + H.d(this.targetType.hashCode() * 31, 31, this.identifierType);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestCode(targetType=");
        sb2.append(this.targetType);
        sb2.append(", identifierType=");
        sb2.append(this.identifierType);
        sb2.append(", identifier=");
        return C22026a.c(sb2, this.identifier, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.targetType);
        parcel.writeString(this.identifierType);
        parcel.writeString(this.identifier);
    }

    public w(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.targetType = str;
        this.identifierType = str2;
        this.identifier = str3;
    }
}
