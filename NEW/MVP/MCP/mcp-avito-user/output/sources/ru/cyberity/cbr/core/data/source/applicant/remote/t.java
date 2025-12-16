package ru.cyberity.cbr.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import ru.cyberity.cbr.core.data.source.applicant.remote.y;

/* compiled from: QuestionnaireResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002)/Bm\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\u0081\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J(\u0010)\u001a\u00020!2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÇ\u0001¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010+\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010+\u0012\u0004\b4\u0010.\u001a\u0004\b3\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010.\u001a\u0004\b7\u00108R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010+\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u0010+\u0012\u0004\b?\u0010.\u001a\u0004\b>\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010+\u0012\u0004\bB\u0010.\u001a\u0004\bA\u0010\u0016R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bC\u0010D\u0012\u0004\bG\u0010.\u001a\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "Landroid/os/Parcelable;", "", "internalId", "id", "clientId", "", "modifiable", "createdAt", "title", "desc", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/y;", "sections", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/t;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "q", "getInternalId$annotations", "()V", "b", "o", "getId$annotations", "c", "i", "getClientId$annotations", "d", "Ljava/lang/Boolean;", "s", "()Ljava/lang/Boolean;", "getModifiable$annotations", "e", "k", "getCreatedAt$annotations", "f", "w", "getTitle$annotations", "g", "m", "getDesc$annotations", "h", "Ljava/util/List;", "u", "()Ljava/util/List;", "getSections$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class t implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String internalId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String clientId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Boolean modifiable;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String createdAt;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String title;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String desc;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<y> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<t> CREATOR = new c();

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/QuestionnaireResponse.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/t;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<t> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433572a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433573b;

        static {
            a aVar = new a();
            f433572a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.QuestionnaireResponse", aVar, 8);
            pluginGeneratedSerialDescriptor.j("_id", true);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("clientId", true);
            pluginGeneratedSerialDescriptor.j("modifiable", true);
            pluginGeneratedSerialDescriptor.j("createdAt", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("desc", true);
            pluginGeneratedSerialDescriptor.j("sections", true);
            f433573b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f412706c);
            Object objF = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF2 = null;
            Object objF3 = null;
            Object objF4 = null;
            Object objF5 = null;
            Object objF6 = null;
            Object objF7 = null;
            Object objF8 = null;
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
                        objF4 = cVarC.f(f412706c, 3, C43407i.f412866a, objF4);
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
                        objF8 = cVarC.f(f412706c, 7, new C43401f(y.a.f433604a), objF8);
                        i12 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new t(i12, (String) objF, (String) objF2, (String) objF3, (Boolean) objF4, (String) objF5, (String) objF6, (String) objF7, (List) objF8, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(new C43401f(y.a.f433604a))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433573b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k t value) {
            SerialDescriptor f412706c = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            t.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/t$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.t$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<t> serializer() {
            return a.f433572a;
        }

        private Companion() {
        }
    }

    public t() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (String) null, (List) null, 255, (C42822w) null);
    }

    @X41.n
    public static final void a(@Y61.k t self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.internalId != null) {
            output.p(serialDesc, 0, V0.f412822a, self.internalId);
        }
        if (output.u() || self.id != null) {
            output.p(serialDesc, 1, V0.f412822a, self.id);
        }
        if (output.u() || self.clientId != null) {
            output.p(serialDesc, 2, V0.f412822a, self.clientId);
        }
        if (output.u() || self.modifiable != null) {
            output.p(serialDesc, 3, C43407i.f412866a, self.modifiable);
        }
        if (output.u() || self.createdAt != null) {
            output.p(serialDesc, 4, V0.f412822a, self.createdAt);
        }
        if (output.u() || self.title != null) {
            output.p(serialDesc, 5, V0.f412822a, self.title);
        }
        if (output.u() || self.desc != null) {
            output.p(serialDesc, 6, V0.f412822a, self.desc);
        }
        if (!output.u() && self.sections == null) {
            return;
        }
        output.p(serialDesc, 7, new C43401f(y.a.f433604a), self.sections);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return L.f(this.internalId, tVar.internalId) && L.f(this.id, tVar.id) && L.f(this.clientId, tVar.clientId) && L.f(this.modifiable, tVar.modifiable) && L.f(this.createdAt, tVar.createdAt) && L.f(this.title, tVar.title) && L.f(this.desc, tVar.desc) && L.f(this.sections, tVar.sections);
    }

    public int hashCode() {
        String str = this.internalId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.clientId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.modifiable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List<y> list = this.sections;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuestionnaireResponse(internalId=");
        sb2.append(this.internalId);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", clientId=");
        sb2.append(this.clientId);
        sb2.append(", modifiable=");
        sb2.append(this.modifiable);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", desc=");
        sb2.append(this.desc);
        sb2.append(", sections=");
        return H.p(sb2, this.sections, ')');
    }

    @Y61.l
    public final List<y> u() {
        return this.sections;
    }

    @Y61.l
    /* renamed from: w, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.internalId);
        parcel.writeString(this.id);
        parcel.writeString(this.clientId);
        Boolean bool = this.modifiable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.createdAt);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        List<y> list = this.sections;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((y) itA.next()).writeToParcel(parcel, flags);
        }
    }

    @InterfaceC42830m
    public /* synthetic */ t(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v String str2, @kotlinx.serialization.v String str3, @kotlinx.serialization.v Boolean bool, @kotlinx.serialization.v String str4, @kotlinx.serialization.v String str5, @kotlinx.serialization.v String str6, @kotlinx.serialization.v List list, P0 p02) {
        if ((i12 & 1) == 0) {
            this.internalId = null;
        } else {
            this.internalId = str;
        }
        if ((i12 & 2) == 0) {
            this.id = null;
        } else {
            this.id = str2;
        }
        if ((i12 & 4) == 0) {
            this.clientId = null;
        } else {
            this.clientId = str3;
        }
        if ((i12 & 8) == 0) {
            this.modifiable = null;
        } else {
            this.modifiable = bool;
        }
        if ((i12 & 16) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str4;
        }
        if ((i12 & 32) == 0) {
            this.title = null;
        } else {
            this.title = str5;
        }
        if ((i12 & 64) == 0) {
            this.desc = null;
        } else {
            this.desc = str6;
        }
        if ((i12 & 128) == 0) {
            this.sections = null;
        } else {
            this.sections = list;
        }
    }

    public t(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l List<y> list) {
        this.internalId = str;
        this.id = str2;
        this.clientId = str3;
        this.modifiable = bool;
        this.createdAt = str4;
        this.title = str5;
        this.desc = str6;
        this.sections = list;
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<t> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t createFromParcel(@Y61.k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(y.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new t(string, string2, string3, boolValueOf, string4, string5, string6, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t[] newArray(int i12) {
            return new t[i12];
        }
    }

    public /* synthetic */ t(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : str6, (i12 & 128) == 0 ? list : null);
    }
}
