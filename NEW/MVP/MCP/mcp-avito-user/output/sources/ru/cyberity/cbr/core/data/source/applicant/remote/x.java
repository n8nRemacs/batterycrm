package ru.cyberity.cbr.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
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
import kotlinx.serialization.internal.C43412k0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.internal.Y;

/* compiled from: RequestCodeResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0002)/Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0087\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J(\u0010)\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÇ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010+\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010+\u0012\u0004\b7\u0010.\u001a\u0004\b6\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010+\u0012\u0004\b:\u0010.\u001a\u0004\b9\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b;\u0010+\u0012\u0004\b=\u0010.\u001a\u0004\b<\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010+\u0012\u0004\b@\u0010.\u001a\u0004\b?\u0010\u0015R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010.\u001a\u0004\bC\u0010DR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010.\u001a\u0004\bH\u0010I¨\u0006L"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "Landroid/os/Parcelable;", "", "id", "createdAt", "identifier", "identifierType", "targetType", "status", "targetId", "", "verificationCodeLength", "", "timeToResendInSec", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Lkotlinx/serialization/internal/P0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/x;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "l", "getId$annotations", "()V", "b", "j", "getCreatedAt$annotations", "c", "n", "getIdentifier$annotations", "d", "p", "getIdentifierType$annotations", "e", "v", "getTargetType$annotations", "f", "r", "getStatus$annotations", "g", "t", "getTargetId$annotations", "h", "Ljava/lang/Integer;", "z", "()Ljava/lang/Integer;", "getVerificationCodeLength$annotations", "i", "Ljava/lang/Long;", "x", "()Ljava/lang/Long;", "getTimeToResendInSec$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class x implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String identifier;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String identifierType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String targetType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String targetId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Integer verificationCodeLength;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Long timeToResendInSec;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<x> CREATOR = new c();

    /* compiled from: RequestCodeResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/RequestCodeResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/x;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<x> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433595a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433596b;

        static {
            a aVar = new a();
            f433595a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.RequestCodeResponse", aVar, 9);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("createdAt", true);
            pluginGeneratedSerialDescriptor.j("identifier", true);
            pluginGeneratedSerialDescriptor.j("identifierType", true);
            pluginGeneratedSerialDescriptor.j("targetType", true);
            pluginGeneratedSerialDescriptor.j("status", true);
            pluginGeneratedSerialDescriptor.j("targetId", true);
            pluginGeneratedSerialDescriptor.j("verificationCodeLength", true);
            pluginGeneratedSerialDescriptor.j("timeToResendInSec", true);
            f433596b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            Object objF7 = null;
            Object objF8 = null;
            Object objF9 = null;
            int i12 = 0;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        objF = cVarC.f(f412706c, 0, V0.f412822a, objF);
                        i12 |= 1;
                        break;
                    case 1:
                        objF2 = cVarC.f(f412706c, 1, V0.f412822a, objF2);
                        i12 |= 2;
                        break;
                    case 2:
                        objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f412706c, 3, V0.f412822a, objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f412706c, 4, V0.f412822a, objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f412706c, 5, V0.f412822a, objF6);
                        i12 |= 32;
                        break;
                    case 6:
                        objF7 = cVarC.f(f412706c, 6, V0.f412822a, objF7);
                        i12 |= 64;
                        break;
                    case 7:
                        objF8 = cVarC.f(f412706c, 7, Y.f412835a, objF8);
                        i12 |= 128;
                        break;
                    case 8:
                        objF9 = cVarC.f(f412706c, 8, C43412k0.f412877a, objF9);
                        i12 |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new x(i12, (String) objF, (String) objF2, (String) objF3, (String) objF4, (String) objF5, (String) objF6, (String) objF7, (Integer) objF8, (Long) objF9, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(Y.f412835a), L51.a.a(C43412k0.f412877a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433596b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k x value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            x.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: RequestCodeResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/x$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/x;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.x$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<x> serializer() {
            return a.f433595a;
        }

        private Companion() {
        }
    }

    /* compiled from: RequestCodeResponse.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(@Y61.k Parcel parcel) {
            return new x(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i12) {
            return new x[i12];
        }
    }

    public x() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Long) null, 511, (C42822w) null);
    }

    @X41.n
    public static final void a(@Y61.k x self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.id != null) {
            output.p(serialDesc, 0, V0.f412822a, self.id);
        }
        if (output.u() || self.createdAt != null) {
            output.p(serialDesc, 1, V0.f412822a, self.createdAt);
        }
        if (output.u() || self.identifier != null) {
            output.p(serialDesc, 2, V0.f412822a, self.identifier);
        }
        if (output.u() || self.identifierType != null) {
            output.p(serialDesc, 3, V0.f412822a, self.identifierType);
        }
        if (output.u() || self.targetType != null) {
            output.p(serialDesc, 4, V0.f412822a, self.targetType);
        }
        if (output.u() || self.status != null) {
            output.p(serialDesc, 5, V0.f412822a, self.status);
        }
        if (output.u() || self.targetId != null) {
            output.p(serialDesc, 6, V0.f412822a, self.targetId);
        }
        if (output.u() || self.verificationCodeLength != null) {
            output.p(serialDesc, 7, Y.f412835a, self.verificationCodeLength);
        }
        if (!output.u() && self.timeToResendInSec == null) {
            return;
        }
        output.p(serialDesc, 8, C43412k0.f412877a, self.timeToResendInSec);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return L.f(this.id, xVar.id) && L.f(this.createdAt, xVar.createdAt) && L.f(this.identifier, xVar.identifier) && L.f(this.identifierType, xVar.identifierType) && L.f(this.targetType, xVar.targetType) && L.f(this.status, xVar.status) && L.f(this.targetId, xVar.targetId) && L.f(this.verificationCodeLength, xVar.verificationCodeLength) && L.f(this.timeToResendInSec, xVar.timeToResendInSec);
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.identifier;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.identifierType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.targetType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.targetId;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.verificationCodeLength;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l12 = this.timeToResendInSec;
        return iHashCode8 + (l12 != null ? l12.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final String getIdentifierType() {
        return this.identifierType;
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestCodeResponse(id=");
        sb2.append(this.id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", identifier=");
        sb2.append(this.identifier);
        sb2.append(", identifierType=");
        sb2.append(this.identifierType);
        sb2.append(", targetType=");
        sb2.append(this.targetType);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", targetId=");
        sb2.append(this.targetId);
        sb2.append(", verificationCodeLength=");
        sb2.append(this.verificationCodeLength);
        sb2.append(", timeToResendInSec=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.timeToResendInSec, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.identifier);
        parcel.writeString(this.identifierType);
        parcel.writeString(this.targetType);
        parcel.writeString(this.status);
        parcel.writeString(this.targetId);
        Integer num = this.verificationCodeLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Long l12 = this.timeToResendInSec;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }

    @Y61.l
    /* renamed from: x, reason: from getter */
    public final Long getTimeToResendInSec() {
        return this.timeToResendInSec;
    }

    @Y61.l
    /* renamed from: z, reason: from getter */
    public final Integer getVerificationCodeLength() {
        return this.verificationCodeLength;
    }

    @InterfaceC42830m
    public /* synthetic */ x(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v String str2, @kotlinx.serialization.v String str3, @kotlinx.serialization.v String str4, @kotlinx.serialization.v String str5, @kotlinx.serialization.v String str6, @kotlinx.serialization.v String str7, @kotlinx.serialization.v Integer num, @kotlinx.serialization.v Long l12, P0 p02) {
        if ((i12 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i12 & 2) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str2;
        }
        if ((i12 & 4) == 0) {
            this.identifier = null;
        } else {
            this.identifier = str3;
        }
        if ((i12 & 8) == 0) {
            this.identifierType = null;
        } else {
            this.identifierType = str4;
        }
        if ((i12 & 16) == 0) {
            this.targetType = null;
        } else {
            this.targetType = str5;
        }
        if ((i12 & 32) == 0) {
            this.status = null;
        } else {
            this.status = str6;
        }
        if ((i12 & 64) == 0) {
            this.targetId = null;
        } else {
            this.targetId = str7;
        }
        if ((i12 & 128) == 0) {
            this.verificationCodeLength = null;
        } else {
            this.verificationCodeLength = num;
        }
        if ((i12 & 256) == 0) {
            this.timeToResendInSec = null;
        } else {
            this.timeToResendInSec = l12;
        }
    }

    public x(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l Integer num, @Y61.l Long l12) {
        this.id = str;
        this.createdAt = str2;
        this.identifier = str3;
        this.identifierType = str4;
        this.targetType = str5;
        this.status = str6;
        this.targetId = str7;
        this.verificationCodeLength = num;
        this.timeToResendInSec = l12;
    }

    public /* synthetic */ x(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Long l12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : num, (i12 & 256) == 0 ? l12 : null);
    }
}
