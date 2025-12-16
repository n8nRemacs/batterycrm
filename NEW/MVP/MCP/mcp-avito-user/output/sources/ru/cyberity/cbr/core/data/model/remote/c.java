package ru.cyberity.cbr.core.data.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;

/* compiled from: RemoteConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u0002\u0013\u001cB!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u001aJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\bHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J \u0010*\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b*\u0010+R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001bR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010\u001d¨\u00064"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/c;", "Landroid/os/Parcelable;", "", "countryCode", "", "masks", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/remote/c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "h", "()Lru/cyberity/cbr/core/data/model/remote/c;", "g", "()I", "raw", "(Ljava/lang/String;)Ljava/lang/String;", "()Ljava/lang/String;", "b", "()Ljava/util/List;", "(Ljava/lang/String;Ljava/util/List;)Lru/cyberity/cbr/core/data/model/remote/c;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "getCountryCode$annotations", "()V", "Ljava/util/List;", "e", "getMasks$annotations", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public final /* data */ class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    private final String countryCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final List<String> masks;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<c> CREATOR = new C12455c();

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/remote/Mask.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/remote/c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/remote/c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/remote/c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @InterfaceC42830m
    public static final class a implements N<c> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f433203a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SerialDescriptor f433204b;

        static {
            a aVar = new a();
            f433203a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.remote.Mask", aVar, 2);
            pluginGeneratedSerialDescriptor.j("countryCode", true);
            pluginGeneratedSerialDescriptor.j("masks", false);
            f433204b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c deserialize(@Y61.k Decoder decoder) {
            SerialDescriptor f331553a = getF332717a();
            kotlinx.serialization.encoding.c cVarC = decoder.c(f331553a);
            P0 p02 = null;
            boolean z12 = true;
            int i12 = 0;
            Object objF = null;
            Object objV = null;
            while (z12) {
                int iJ2 = cVarC.j(f331553a);
                if (iJ2 == -1) {
                    z12 = false;
                } else if (iJ2 == 0) {
                    objF = cVarC.f(f331553a, 0, V0.f412822a, objF);
                    i12 |= 1;
                } else {
                    if (iJ2 != 1) {
                        throw new UnknownFieldException(iJ2);
                    }
                    objV = cVarC.v(f331553a, 1, new C43401f(V0.f412822a), objV);
                    i12 |= 2;
                }
            }
            cVarC.d(f331553a);
            return new c(i12, (String) objF, (List) objV, p02);
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] childSerializers() {
            V0 v02 = V0.f412822a;
            return new KSerializer[]{L51.a.a(v02), new C43401f(v02)};
        }

        @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
        @Y61.k
        /* renamed from: getDescriptor */
        public SerialDescriptor getF332717a() {
            return f433204b;
        }

        @Override // kotlinx.serialization.internal.N
        @Y61.k
        public KSerializer<?>[] typeParametersSerializers() {
            return G0.f412773a;
        }

        @Override // kotlinx.serialization.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
            SerialDescriptor f331553a = getF332717a();
            kotlinx.serialization.encoding.d dVarC = encoder.c(f331553a);
            c.a(value, dVarC, f331553a);
            dVarC.d(f331553a);
        }
    }

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/data/model/remote/c$b;", "", "", "countryCode", "raw", "a", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/remote/c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final String a(@Y61.l String countryCode, @Y61.k String raw) {
            StringBuilder sb2 = new StringBuilder();
            int length = raw.length();
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = raw.charAt(i12);
                if (Character.isDigit(cCharAt)) {
                    sb2.append(cCharAt);
                }
            }
            String string = sb2.toString();
            if (countryCode == null) {
                countryCode = "";
            }
            return C43066x.U(countryCode, string);
        }

        @Y61.k
        public final KSerializer<c> serializer() {
            return a.f433203a;
        }

        private Companion() {
        }
    }

    /* compiled from: RemoteConfig.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: ru.cyberity.cbr.core.data.model.remote.c$c, reason: collision with other inner class name */
    public static final class C12455c implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(@Y61.k Parcel parcel) {
            return new c(parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i12) {
            return new c[i12];
        }
    }

    @InterfaceC42830m
    public /* synthetic */ c(int i12, @v String str, @v List list, P0 p02) {
        if (2 != (i12 & 2)) {
            E0.b(i12, 2, a.f433203a.getF332717a());
            throw null;
        }
        if ((i12 & 1) == 0) {
            this.countryCode = null;
        } else {
            this.countryCode = str;
        }
        this.masks = list;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    @Y61.k
    public final List<String> b() {
        return this.masks;
    }

    @Y61.l
    public final String c() {
        return this.countryCode;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Y61.k
    public final List<String> e() {
        return this.masks;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return L.f(this.countryCode, cVar.countryCode) && L.f(this.masks, cVar.masks);
    }

    public final int g() {
        Object obj;
        Iterator<T> it = this.masks.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int length = ((String) next).length();
                do {
                    Object next2 = it.next();
                    int length2 = ((String) next2).length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "###############";
        }
        StringBuilder sb2 = new StringBuilder();
        int length3 = str.length();
        for (int i12 = 0; i12 < length3; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '#' || Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return (str.length() - sb2.toString().length()) + 17;
    }

    @Y61.k
    public final c h() {
        List<String> list = this.masks;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C43066x.A0(C43066x.a0(C43066x.a0(C43066x.a0(C43066x.a0(C43066x.a0(C43066x.a0((String) it.next(), "[^0-9]", "#", false), "(", " ", false), ")", " ", false), "-", " ", false), "+", " ", false), "  ", " ", false)).toString());
        }
        return a(this, null, arrayList, 1, null);
    }

    public int hashCode() {
        String str = this.countryCode;
        return this.masks.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Mask(countryCode=");
        sb2.append(this.countryCode);
        sb2.append(", masks=");
        return H.p(sb2, this.masks, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.countryCode);
        parcel.writeStringList(this.masks);
    }

    public c(@Y61.l String str, @Y61.k List<String> list) {
        this.countryCode = str;
        this.masks = list;
    }

    @Y61.k
    public final c a(@Y61.l String countryCode, @Y61.k List<String> masks) {
        return new c(countryCode, masks);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ c a(c cVar, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = cVar.countryCode;
        }
        if ((i12 & 2) != 0) {
            list = cVar.masks;
        }
        return cVar.a(str, list);
    }

    @X41.n
    public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
        if (output.u() || self.countryCode != null) {
            output.p(serialDesc, 0, V0.f412822a, self.countryCode);
        }
        output.F(serialDesc, 1, new C43401f(V0.f412822a), self.masks);
    }

    public /* synthetic */ c(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, list);
    }

    @Y61.k
    public final String a(@Y61.k String raw) {
        return INSTANCE.a(this.countryCode, raw);
    }

    @v
    public static /* synthetic */ void d() {
    }

    @v
    public static /* synthetic */ void f() {
    }
}
