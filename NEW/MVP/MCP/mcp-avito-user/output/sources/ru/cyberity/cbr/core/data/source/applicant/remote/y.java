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
import ru.cyberity.cbr.core.data.source.applicant.remote.h;

/* compiled from: QuestionnaireResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002(.Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBu\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b!\u0010\"J(\u0010(\u001a\u00020 2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&HÇ\u0001¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010*\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010*\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010*\u0012\u0004\b6\u0010-\u001a\u0004\b5\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u0010*\u0012\u0004\b9\u0010-\u001a\u0004\b8\u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010-\u001a\u0004\b<\u0010=R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010@\u0012\u0004\bC\u0010-\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/y;", "Landroid/os/Parcelable;", "", "id", "createdAt", "title", "desc", "condition", "", "delimiter", "", "Lru/cyberity/cbr/core/data/source/applicant/remote/h;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "a", "(Lru/cyberity/cbr/core/data/source/applicant/remote/y;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "p", "getId$annotations", "()V", "b", "j", "getCreatedAt$annotations", "c", "t", "getTitle$annotations", "d", "n", "getDesc$annotations", "e", "h", "getCondition$annotations", "f", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "getDelimiter$annotations", "g", "Ljava/util/List;", "r", "()Ljava/util/List;", "getItems$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.w
/* loaded from: classes9.dex */
public final /* data */ class y implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String createdAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String desc;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String condition;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final Boolean delimiter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final List<h> items;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<y> CREATOR = new c();

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/source/applicant/remote/Section.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/source/applicant/remote/y;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/source/applicant/remote/y;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/source/applicant/remote/y;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<y> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433604a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433605b;

        static {
            a aVar = new a();
            f433604a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.source.applicant.remote.Section", aVar, 7);
            pluginGeneratedSerialDescriptor.j("id", true);
            pluginGeneratedSerialDescriptor.j("createdAt", true);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("desc", true);
            pluginGeneratedSerialDescriptor.j("condition", true);
            pluginGeneratedSerialDescriptor.j("delimiter", true);
            pluginGeneratedSerialDescriptor.j("items", true);
            f433605b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y deserialize(@Y61.k Decoder decoder) {
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
            Object objF7 = null;
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
                        objF6 = cVarC.f(f412706c, 5, C43407i.f412866a, objF6);
                        i12 |= 32;
                        break;
                    case 6:
                        objF7 = cVarC.f(f412706c, 6, new C43401f(h.a.f433525a), objF7);
                        i12 |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iJ2);
                }
            }
            cVarC.d(f412706c);
            return new y(i12, (String) objF, (String) objF2, (String) objF3, (String) objF4, (String) objF5, (Boolean) objF6, (List) objF7, (P0) null);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a), L51.a.a(new C43401f(h.a.f433525a))};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433605b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k y value) {
            SerialDescriptor f412706c = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f412706c);
            y.a(value, dVarC, f412706c);
            dVarC.d(f412706c);
        }
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/source/applicant/remote/y$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/source/applicant/remote/y;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.source.applicant.remote.y$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final KSerializer<y> serializer() {
            return a.f433604a;
        }

        private Companion() {
        }
    }

    public y() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (List) null, 127, (C42822w) null);
    }

    @X41.n
    public static final void a(@Y61.k y self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.id != null) {
            output.p(serialDesc, 0, V0.f412822a, self.id);
        }
        if (output.u() || self.createdAt != null) {
            output.p(serialDesc, 1, V0.f412822a, self.createdAt);
        }
        if (output.u() || self.title != null) {
            output.p(serialDesc, 2, V0.f412822a, self.title);
        }
        if (output.u() || self.desc != null) {
            output.p(serialDesc, 3, V0.f412822a, self.desc);
        }
        if (output.u() || self.condition != null) {
            output.p(serialDesc, 4, V0.f412822a, self.condition);
        }
        if (output.u() || self.delimiter != null) {
            output.p(serialDesc, 5, C43407i.f412866a, self.delimiter);
        }
        if (!output.u() && self.items == null) {
            return;
        }
        output.p(serialDesc, 6, new C43401f(h.a.f433525a), self.items);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof y)) {
            return false;
        }
        y yVar = (y) other;
        return L.f(this.id, yVar.id) && L.f(this.createdAt, yVar.createdAt) && L.f(this.title, yVar.title) && L.f(this.desc, yVar.desc) && L.f(this.condition, yVar.condition) && L.f(this.delimiter, yVar.delimiter) && L.f(this.items, yVar.items);
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.createdAt;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.condition;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.delimiter;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<h> list = this.items;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final Boolean getDelimiter() {
        return this.delimiter;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    public final List<h> r() {
        return this.items;
    }

    @Y61.l
    /* renamed from: t, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Section(id=");
        sb2.append(this.id);
        sb2.append(", createdAt=");
        sb2.append(this.createdAt);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", desc=");
        sb2.append(this.desc);
        sb2.append(", condition=");
        sb2.append(this.condition);
        sb2.append(", delimiter=");
        sb2.append(this.delimiter);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.title);
        parcel.writeString(this.desc);
        parcel.writeString(this.condition);
        Boolean bool = this.delimiter;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<h> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((h) itA.next()).writeToParcel(parcel, flags);
        }
    }

    @InterfaceC42830m
    public /* synthetic */ y(int i12, @kotlinx.serialization.v String str, @kotlinx.serialization.v String str2, @kotlinx.serialization.v String str3, @kotlinx.serialization.v String str4, @kotlinx.serialization.v String str5, @kotlinx.serialization.v Boolean bool, @kotlinx.serialization.v List list, P0 p02) {
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
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i12 & 8) == 0) {
            this.desc = null;
        } else {
            this.desc = str4;
        }
        if ((i12 & 16) == 0) {
            this.condition = null;
        } else {
            this.condition = str5;
        }
        if ((i12 & 32) == 0) {
            this.delimiter = null;
        } else {
            this.delimiter = bool;
        }
        if ((i12 & 64) == 0) {
            this.items = null;
        } else {
            this.items = list;
        }
    }

    public y(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l List<h> list) {
        this.id = str;
        this.createdAt = str2;
        this.title = str3;
        this.desc = str4;
        this.condition = str5;
        this.delimiter = bool;
        this.items = list;
    }

    /* compiled from: QuestionnaireResponse.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c implements Parcelable.Creator<y> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y createFromParcel(@Y61.k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(h.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new y(string, string2, string3, string4, string5, boolValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y[] newArray(int i12) {
            return new y[i12];
        }
    }

    public /* synthetic */ y(String str, String str2, String str3, String str4, String str5, Boolean bool, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : bool, (i12 & 64) != 0 ? null : list);
    }
}
