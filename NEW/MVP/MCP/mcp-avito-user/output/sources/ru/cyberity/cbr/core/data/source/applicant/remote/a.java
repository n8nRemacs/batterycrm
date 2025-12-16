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
import ru.cyberity.cbr.core.data.source.applicant.remote.n;
import ru.cyberity.cbr.core.data.source.applicant.remote.q;

/* compiled from: ApplicantDataConfirmModel.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0013#B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\"\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/q;", "otp", "Lru/cyberity/cbr/core/data/source/applicant/remote/n;", "oauth", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/q;Lru/cyberity/cbr/core/data/source/applicant/remote/n;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/source/applicant/remote/q;Lru/cyberity/cbr/core/data/source/applicant/remote/n;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/a;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/source/applicant/remote/q;", "e", "()Lru/cyberity/cbr/core/data/source/applicant/remote/q;", "getOtp$annotations", "()V", "b", "Lru/cyberity/cbr/core/data/source/applicant/remote/n;", "c", "()Lru/cyberity/cbr/core/data/source/applicant/remote/n;", "getOauth$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final q otp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final n oauth;

    /* compiled from: ApplicantDataConfirmModel.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/ApplicantDataConfirmModel.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/a;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.a$a, reason: collision with other inner class name */
    public static final class C12466a implements N<a> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12466a f433444a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433445b;

        static {
            C12466a c12466a = new C12466a();
            f433444a = c12466a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.ApplicantDataConfirmModel", c12466a, 2);
            pluginGeneratedSerialDescriptor.j("otp", true);
            pluginGeneratedSerialDescriptor.j("oauth", true);
            f433445b = pluginGeneratedSerialDescriptor;
        }

        private C12466a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objF2 = null;
            while (z12) {
                int iJ2 = cVarC.j(f412706c);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f412706c, 0, q.a.f433554a, objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objF2 = cVarC.f(f412706c, 1, n.a.f433544a, objF2);
                    i12 |= 2;
                }
            }
            cVarC.d(f412706c);
            return new a(i12, (q) objF, (n) objF2, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{L51.a.a(q.a.f433554a), L51.a.a(n.a.f433544a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433445b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k a value) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            a.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: ApplicantDataConfirmModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/a$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/a;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.a$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<a> serializer() {
            return C12466a.f433444a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this((q) null, (n) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @X41.n
    public static final void a(@Y61.k a self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.otp != null) {
            output.p(serialDesc, 0, q.a.f433554a, self.otp);
        }
        if (!output.u() && self.oauth == null) {
            return;
        }
        output.p(serialDesc, 1, n.a.f433544a, self.oauth);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a)) {
            return false;
        }
        a aVar = (a) other;
        return L.f(this.otp, aVar.otp) && L.f(this.oauth, aVar.oauth);
    }

    public int hashCode() {
        q qVar = this.otp;
        int iHashCode = (qVar == null ? 0 : qVar.hashCode()) * 31;
        n nVar = this.oauth;
        return iHashCode + (nVar != null ? nVar.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        return "ApplicantDataConfirmModel(otp=" + this.otp + ", oauth=" + this.oauth + ')';
    }

    @InterfaceC42830m
    public /* synthetic */ a(int i12, @kotlinx.serialization.v q qVar, @kotlinx.serialization.v n nVar, P0 p02) {
        if ((i12 & 1) == 0) {
            this.otp = null;
        } else {
            this.otp = qVar;
        }
        if ((i12 & 2) == 0) {
            this.oauth = null;
        } else {
            this.oauth = nVar;
        }
    }

    public a(@Y61.l q qVar, @Y61.l n nVar) {
        this.otp = qVar;
        this.oauth = nVar;
    }

    public /* synthetic */ a(q qVar, n nVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : qVar, (i12 & 2) != 0 ? null : nVar);
    }
}
