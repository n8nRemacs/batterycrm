package ru.cyberity.cbr.core.data.source.applicant.remote;

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
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationStatus;
import ru.cyberity.cbr.core.data.source.applicant.remote.ConfirmationType;
import ru.cyberity.cbr.core.data.source.applicant.remote.EKycFlowStatus;
import ru.cyberity.cbr.core.data.source.applicant.remote.m;
import ru.cyberity.cbr.core.data.source.applicant.remote.p;

/* compiled from: SubmitApplicantDataResponse.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002\u001b*BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J(\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018HÇ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b.\u0010)\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010)\u001a\u0004\b5\u00106R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b<\u0010)\u001a\u0004\b:\u0010;R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\bA\u0010)\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;", "status", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "confirmationType", "", "confirmationId", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationStatus;", "confirmationStatus", "Lru/cyberity/cbr/core/data/source/applicant/remote/p;", "otpConfirmation", "Lru/cyberity/cbr/core/data/source/applicant/remote/m;", "oAuthConfirmation", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationStatus;Lru/cyberity/cbr/core/data/source/applicant/remote/p;Lru/cyberity/cbr/core/data/source/applicant/remote/m;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;Ljava/lang/String;Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationStatus;Lru/cyberity/cbr/core/data/source/applicant/remote/p;Lru/cyberity/cbr/core/data/source/applicant/remote/m;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/a0;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;", "q", "()Lru/cyberity/cbr/core/data/source/applicant/remote/EKycFlowStatus;", "getStatus$annotations", "()V", "b", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "k", "()Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationType;", "getConfirmationType$annotations", "c", "Ljava/lang/String;", "g", "getConfirmationId$annotations", "d", "Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationStatus;", "i", "()Lru/cyberity/cbr/core/data/source/applicant/remote/ConfirmationStatus;", "getConfirmationStatus$annotations", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/p;", "o", "()Lru/cyberity/cbr/core/data/source/applicant/remote/p;", "getOtpConfirmation$annotations", "f", "Lru/cyberity/cbr/core/data/source/applicant/remote/m;", "m", "()Lru/cyberity/cbr/core/data/source/applicant/remote/m;", "getOAuthConfirmation$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class a0 {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final EKycFlowStatus status;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ConfirmationType confirmationType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String confirmationId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final ConfirmationStatus confirmationStatus;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final p otpConfirmation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final m oAuthConfirmation;

    /* compiled from: SubmitApplicantDataResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/SubmitApplicantDataResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/a0;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<a0> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433452a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433453b;

        static {
            a aVar = new a();
            f433452a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.SubmitApplicantDataResponse", aVar, 6);
            pluginGeneratedSerialDescriptor.j("status", true);
            pluginGeneratedSerialDescriptor.j("confirmationType", true);
            pluginGeneratedSerialDescriptor.j("confirmationId", true);
            pluginGeneratedSerialDescriptor.j("confirmationStatus", true);
            pluginGeneratedSerialDescriptor.j("otpConfirmation", true);
            pluginGeneratedSerialDescriptor.j("oauthConfirmation", true);
            f433453b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                switch (iJ2) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        objF = cVarC.f(f412706c, 0, EKycFlowStatus.a.f433438a, objF);
                        i12 |= 1;
                        break;
                    case 1:
                        objF2 = cVarC.f(f412706c, 1, ConfirmationType.a.f433436a, objF2);
                        i12 |= 2;
                        break;
                    case 2:
                        objF3 = cVarC.f(f412706c, 2, V0.f412822a, objF3);
                        i12 |= 4;
                        break;
                    case 3:
                        objF4 = cVarC.f(f412706c, 3, ConfirmationStatus.a.f433434a, objF4);
                        i12 |= 8;
                        break;
                    case 4:
                        objF5 = cVarC.f(f412706c, 4, p.a.f433551a, objF5);
                        i12 |= 16;
                        break;
                    case 5:
                        objF6 = cVarC.f(f412706c, 5, m.a.f433541a, objF6);
                        i12 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new a0(i12, (EKycFlowStatus) objF, (ConfirmationType) objF2, (String) objF3, (ConfirmationStatus) objF4, (p) objF5, (m) objF6, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(EKycFlowStatus.a.f433438a), L51.a.a(ConfirmationType.a.f433436a), L51.a.a(V0.f412822a), L51.a.a(ConfirmationStatus.a.f433434a), L51.a.a(p.a.f433551a), L51.a.a(m.a.f433541a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433453b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k a0 value) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            a0.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: SubmitApplicantDataResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/a0$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a0;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.a0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<a0> serializer() {
            return a.f433452a;
        }

        private Companion() {
        }
    }

    public a0() {
        this((EKycFlowStatus) null, (ConfirmationType) null, (String) null, (ConfirmationStatus) null, (p) null, (m) null, 63, (C42822w) null);
    }

    @X41.n
    public static final void a(@Y61.k a0 self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.status != null) {
            output.p(serialDesc, 0, EKycFlowStatus.a.f433438a, self.status);
        }
        if (output.u() || self.confirmationType != null) {
            output.p(serialDesc, 1, ConfirmationType.a.f433436a, self.confirmationType);
        }
        if (output.u() || self.confirmationId != null) {
            output.p(serialDesc, 2, V0.f412822a, self.confirmationId);
        }
        if (output.u() || self.confirmationStatus != null) {
            output.p(serialDesc, 3, ConfirmationStatus.a.f433434a, self.confirmationStatus);
        }
        if (output.u() || self.otpConfirmation != null) {
            output.p(serialDesc, 4, p.a.f433551a, self.otpConfirmation);
        }
        if (!output.u() && self.oAuthConfirmation == null) {
            return;
        }
        output.p(serialDesc, 5, m.a.f433541a, self.oAuthConfirmation);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) other;
        return this.status == a0Var.status && this.confirmationType == a0Var.confirmationType && L.f(this.confirmationId, a0Var.confirmationId) && this.confirmationStatus == a0Var.confirmationStatus && L.f(this.otpConfirmation, a0Var.otpConfirmation) && L.f(this.oAuthConfirmation, a0Var.oAuthConfirmation);
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getConfirmationId() {
        return this.confirmationId;
    }

    public int hashCode() {
        EKycFlowStatus eKycFlowStatus = this.status;
        int iHashCode = (eKycFlowStatus == null ? 0 : eKycFlowStatus.hashCode()) * 31;
        ConfirmationType confirmationType = this.confirmationType;
        int iHashCode2 = (iHashCode + (confirmationType == null ? 0 : confirmationType.hashCode())) * 31;
        String str = this.confirmationId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ConfirmationStatus confirmationStatus = this.confirmationStatus;
        int iHashCode4 = (iHashCode3 + (confirmationStatus == null ? 0 : confirmationStatus.hashCode())) * 31;
        p pVar = this.otpConfirmation;
        int iHashCode5 = (iHashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        m mVar = this.oAuthConfirmation;
        return iHashCode5 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final ConfirmationStatus getConfirmationStatus() {
        return this.confirmationStatus;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final ConfirmationType getConfirmationType() {
        return this.confirmationType;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final m getOAuthConfirmation() {
        return this.oAuthConfirmation;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final p getOtpConfirmation() {
        return this.otpConfirmation;
    }

    @Y61.l
    /* renamed from: q, reason: from getter */
    public final EKycFlowStatus getStatus() {
        return this.status;
    }

    @Y61.k
    public String toString() {
        return "SubmitApplicantDataResponse(status=" + this.status + ", confirmationType=" + this.confirmationType + ", confirmationId=" + this.confirmationId + ", confirmationStatus=" + this.confirmationStatus + ", otpConfirmation=" + this.otpConfirmation + ", oAuthConfirmation=" + this.oAuthConfirmation + ')';
    }

    @InterfaceC42830m
    public /* synthetic */ a0(int i12, @kotlinx.serialization.v EKycFlowStatus eKycFlowStatus, @kotlinx.serialization.v ConfirmationType confirmationType, @kotlinx.serialization.v String str, @kotlinx.serialization.v ConfirmationStatus confirmationStatus, @kotlinx.serialization.v p pVar, @kotlinx.serialization.v m mVar, P0 p02) {
        if ((i12 & 1) == 0) {
            this.status = null;
        } else {
            this.status = eKycFlowStatus;
        }
        if ((i12 & 2) == 0) {
            this.confirmationType = null;
        } else {
            this.confirmationType = confirmationType;
        }
        if ((i12 & 4) == 0) {
            this.confirmationId = null;
        } else {
            this.confirmationId = str;
        }
        if ((i12 & 8) == 0) {
            this.confirmationStatus = null;
        } else {
            this.confirmationStatus = confirmationStatus;
        }
        if ((i12 & 16) == 0) {
            this.otpConfirmation = null;
        } else {
            this.otpConfirmation = pVar;
        }
        if ((i12 & 32) == 0) {
            this.oAuthConfirmation = null;
        } else {
            this.oAuthConfirmation = mVar;
        }
    }

    public a0(@Y61.l EKycFlowStatus eKycFlowStatus, @Y61.l ConfirmationType confirmationType, @Y61.l String str, @Y61.l ConfirmationStatus confirmationStatus, @Y61.l p pVar, @Y61.l m mVar) {
        this.status = eKycFlowStatus;
        this.confirmationType = confirmationType;
        this.confirmationId = str;
        this.confirmationStatus = confirmationStatus;
        this.otpConfirmation = pVar;
        this.oAuthConfirmation = mVar;
    }

    public /* synthetic */ a0(EKycFlowStatus eKycFlowStatus, ConfirmationType confirmationType, String str, ConfirmationStatus confirmationStatus, p pVar, m mVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : eKycFlowStatus, (i12 & 2) != 0 ? null : confirmationType, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : confirmationStatus, (i12 & 16) != 0 ? null : pVar, (i12 & 32) != 0 ? null : mVar);
    }
}
