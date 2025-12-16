package ru.cyberity.cbr.core.data.source.applicant.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import ru.cyberity.cbr.core.data.source.applicant.remote.u;

/* compiled from: QuestionnaireSubmitModel.kt */
@K51.d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002\u0014)B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB?\b\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0001\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ(\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011HÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010#\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0017R4\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b.\u0010(\u001a\u0004\b+\u0010,\"\u0004\b\u0014\u0010-¨\u00060"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "Landroid/os/Parcelable;", "", "id", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/u;", "sections", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/r;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getId$annotations", "()V", "b", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "(Ljava/util/Map;)V", "getSections$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class r implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private Map<String, u> sections;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<r> CREATOR = new c();

    /* compiled from: QuestionnaireSubmitModel.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/Questionnaire.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/r;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<r> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433558a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433559b;

        static {
            a aVar = new a();
            f433558a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.Questionnaire", aVar, 2);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("sections", true);
            f433559b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f332717a = getF412706c();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objV = null;
            while (z12) {
                int iJ2 = cVarC.j(f332717a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV = cVarC.v(f332717a, 1, new C43400e0(V0.f412822a, u.a.f433575a), objV);
                    i12 |= 2;
                }
            }
            cVarC.d(f332717a);
            return new r(i12, (String) objF, (Map) objV, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), new C43400e0(v02, u.a.f433575a)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF412706c() {
            return f433559b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k r value) {
            SerialDescriptor f332717a = getF412706c();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
            r.a(value, dVarC, f332717a);
            dVarC.d(f332717a);
        }
    }

    /* compiled from: QuestionnaireSubmitModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/r$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/r;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.r$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<r> serializer() {
            return a.f433558a;
        }

        private Companion() {
        }
    }

    /* compiled from: QuestionnaireSubmitModel.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r createFromParcel(@Y61.k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap.put(parcel.readString(), u.CREATOR.createFromParcel(parcel));
            }
            return new r(string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r[] newArray(int i12) {
            return new r[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this((String) null, (Map) (0 == true ? 1 : 0), 3, (C42822w) (0 == true ? 1 : 0));
    }

    @X41.n
    public static final void a(@Y61.k r self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.id != null) {
            output.p(serialDesc, 0, V0.f412822a, self.id);
        }
        if (!output.u() && L.f(self.sections, new LinkedHashMap())) {
            return;
        }
        output.F(serialDesc, 1, new C43400e0(V0.f412822a, u.a.f433575a), self.sections);
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Y61.k
    public final Map<String, u> e() {
        return this.sections;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return L.f(this.id, rVar.id) && L.f(this.sections, rVar.sections);
    }

    public int hashCode() {
        String str = this.id;
        return this.sections.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Questionnaire(id=");
        sb2.append(this.id);
        sb2.append(", sections=");
        return androidx.appcompat.app.r.w(sb2, this.sections, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Iterator itI = C0.i(parcel, this.sections);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            ((u) entry.getValue()).writeToParcel(parcel, flags);
        }
    }

    @InterfaceC42830m
    public /* synthetic */ r(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v Map map, P0 p02) {
        this.id = (i12 & 1) == 0 ? null : str;
        if ((i12 & 2) == 0) {
            this.sections = new LinkedHashMap();
        } else {
            this.sections = map;
        }
    }

    public r(@Y61.l String str, @Y61.k Map<String, u> map) {
        this.id = str;
        this.sections = map;
    }

    public /* synthetic */ r(String str, Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? new LinkedHashMap() : map);
    }
}
