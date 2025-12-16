package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43401f;
import kotlinx.serialization.internal.C43407i;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.I;
import kotlinx.serialization.internal.P0;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.model.FieldName;
import ru.cyberity.cbr.core.data.model.q;

/* compiled from: ApplicantDataField.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00162\u00020\u0001:\u0004\u0014\u0012\u0017\u0018B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013\u0082\u0001\u0003\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lru/cyberity/cbr/core/data/model/h;", "", "<init>", "()V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/h;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "c", "()Ljava/lang/String;", "b", "formItemId", "Companion", "d", "e", "Lru/cyberity/cbr/core/data/model/h$c;", "Lru/cyberity/cbr/core/data/model/h$d;", "Lru/cyberity/cbr/core/data/model/h$e;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w
/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private static final InterfaceC42726C<KSerializer<Object>> f433116a = C42727D.b(LazyThreadSafetyMode.f406615c, a.f433117a);

    /* compiled from: ApplicantDataField.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends N implements Y41.a<KSerializer<Object>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f433117a = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KSerializer<Object> invoke() {
            n0 n0Var = m0.f406844a;
            return new kotlinx.serialization.r("ru.cyberity.cbr.core.data.model.ApplicantDataField", n0Var.b(h.class), new kotlin.reflect.d[]{n0Var.b(c.class), n0Var.b(d.class)}, new KSerializer[]{c.a.f433121a, d.a.f433130a}, new Annotation[0]);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/h;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.h$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        private final /* synthetic */ InterfaceC42726C a() {
            return h.f433116a;
        }

        @Y61.k
        public final KSerializer<h> serializer() {
            return (KSerializer) a().getValue();
        }

        private Companion() {
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u0002\u0015%B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB?\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÇ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010#\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0018R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010&\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010)\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u0018¨\u00064"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$c;", "Lru/cyberity/cbr/core/data/model/h;", "Landroid/os/Parcelable;", "", "name", "displayName", "", "isRequired", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/P0;)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lkotlin/G0;", "a", "(Lru/cyberity/cbr/core/data/model/h$c;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "b", "Ljava/lang/String;", "i", "getName$annotations", "()V", "c", "g", "getDisplayName$annotations", "d", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "isRequired$annotations", "formItemId", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @K51.d
    @w
    public static final /* data */ class c extends h implements Parcelable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String displayName;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final Boolean isRequired;

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        @Y61.k
        public static final Parcelable.Creator<c> CREATOR = new C12449c();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/ApplicantDataField.CustomField.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/h$c;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/h$c;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/h$c;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements kotlinx.serialization.internal.N<c> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433121a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433122b;

            static {
                a aVar = new a();
                f433121a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.ApplicantDataField.CustomField", aVar, 3);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("displayName", false);
                pluginGeneratedSerialDescriptor.j("required", false);
                f433122b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f332717a = getF412706c();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                Object objF = null;
                boolean z12 = true;
                int i12 = 0;
                Object objF2 = null;
                Object objF3 = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    if (iJ2 == -1) {
                        z12 = false;
                    } else if (iJ2 == 0) {
                        objF = cVarC.f(f332717a, 0, V0.f412822a, objF);
                        i12 |= 1;
                    } else if (iJ2 == 1) {
                        objF2 = cVarC.f(f332717a, 1, V0.f412822a, objF2);
                        i12 |= 2;
                    } else {
                        if (iJ2 != 2) {
                            throw new UnknownFieldException(iJ2);
                        }
                        objF3 = cVarC.f(f332717a, 2, C43407i.f412866a, objF3);
                        i12 |= 4;
                    }
                }
                cVarC.d(f332717a);
                return new c(i12, (String) objF, (String) objF2, (Boolean) objF3, null);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(C43407i.f412866a)};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return f433122b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k c value) {
                SerialDescriptor f332717a = getF412706c();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                c.a(value, dVarC, f332717a);
                dVarC.d(f332717a);
            }
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$c$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/h$c;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.h$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<c> serializer() {
                return a.f433121a;
            }

            private Companion() {
            }
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.data.model.h$c$c, reason: collision with other inner class name */
        public static final class C12449c implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(@Y61.k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new c(string, string2, boolValueOf);
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i12) {
                return new c[i12];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v String str, @v String str2, @v Boolean bool, P0 p02) {
            super(i12, p02);
            if (7 != (i12 & 7)) {
                E0.b(i12, 7, a.f433121a.getF412706c());
                throw null;
            }
            this.name = str;
            this.displayName = str2;
            this.isRequired = bool;
        }

        @X41.n
        public static final void a(@Y61.k c self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            h.a(self, output, serialDesc);
            V0 v02 = V0.f412822a;
            output.p(serialDesc, 0, v02, self.name);
            output.p(serialDesc, 1, v02, self.displayName);
            output.p(serialDesc, 2, C43407i.f412866a, self.isRequired);
        }

        @Override // ru.cyberity.cbr.core.data.model.h
        @Y61.k
        public String b() {
            String str = this.name;
            return str == null ? "" : str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return L.f(this.name, cVar.name) && L.f(this.displayName, cVar.displayName) && L.f(this.isRequired, cVar.isRequired);
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        public int hashCode() {
            String str = this.name;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.displayName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.isRequired;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final Boolean getIsRequired() {
            return this.isRequired;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CustomField(name=");
            sb2.append(this.name);
            sb2.append(", displayName=");
            sb2.append(this.displayName);
            sb2.append(", isRequired=");
            return C0.g(sb2, this.isRequired, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.displayName);
            Boolean bool = this.isRequired;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }

        public c(@Y61.l String str, @Y61.l String str2, @Y61.l Boolean bool) {
            super(null);
            this.name = str;
            this.displayName = str2;
            this.isRequired = bool;
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0087\b\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0002\u0019/B[\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011Bs\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018Jh\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ \u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b'\u0010(J(\u0010\u0019\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,HÇ\u0001¢\u0006\u0004\b\u0019\u0010.R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u00104\u001a\u0004\b;\u0010<R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0018R(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bB\u0010C\u0012\u0004\bF\u00104\u001a\u0004\bD\u0010ER\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bG\u0010H\u0012\u0004\bK\u00104\u001a\u0004\bI\u0010JR\"\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bL\u0010?\u0012\u0004\bN\u00104\u001a\u0004\bM\u0010\u0018R\u0011\u0010P\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bO\u00107R\u0011\u0010R\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bQ\u00107R\u0011\u0010T\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bS\u00107R\u0011\u0010V\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bU\u00107R\u0014\u0010W\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0018¨\u0006Y"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d;", "Lru/cyberity/cbr/core/data/model/h;", "Landroid/os/Parcelable;", "Lru/cyberity/cbr/core/data/model/FieldName;", "name", "", "isRequired", "Lru/cyberity/cbr/core/data/model/FieldType;", "type", "", "mask", "", "masks", "Lru/cyberity/cbr/core/data/model/q;", "format", ChannelContext.Item.PLACEHOLDER, "<init>", "(Lru/cyberity/cbr/core/data/model/FieldName;ZLru/cyberity/cbr/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/core/data/model/q;Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILru/cyberity/cbr/core/data/model/FieldName;ZLru/cyberity/cbr/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/core/data/model/q;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "c", "()Ljava/lang/String;", "a", "(Lru/cyberity/cbr/core/data/model/FieldName;ZLru/cyberity/cbr/core/data/model/FieldType;Ljava/lang/String;Ljava/util/List;Lru/cyberity/cbr/core/data/model/q;Ljava/lang/String;)Lru/cyberity/cbr/core/data/model/h$d;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "self", "Lkotlinx/serialization/encoding/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "(Lru/cyberity/cbr/core/data/model/h$d;Lkotlinx/serialization/encoding/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "Lru/cyberity/cbr/core/data/model/FieldName;", "q", "()Lru/cyberity/cbr/core/data/model/FieldName;", "getName$annotations", "()V", "Z", "A", "()Z", "isRequired$annotations", "d", "Lru/cyberity/cbr/core/data/model/FieldType;", "u", "()Lru/cyberity/cbr/core/data/model/FieldType;", "getType$annotations", "e", "Ljava/lang/String;", "m", "getMask$annotations", "f", "Ljava/util/List;", "o", "()Ljava/util/List;", "getMasks$annotations", "g", "Lru/cyberity/cbr/core/data/model/q;", "k", "()Lru/cyberity/cbr/core/data/model/q;", "getFormat$annotations", "h", "s", "getPlaceholder$annotations", "x", "isCoreRelated", "w", "isAddressRelated", "z", "isInfoRelated", "y", "isDateRelated", "formItemId", "Companion", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    @K51.d
    @w
    public static final /* data */ class d extends h implements Parcelable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final FieldName name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isRequired;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final FieldType type;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String mask;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final List<String> masks;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final q format;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @Y61.l
        private final String placeholder;

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        @Y61.k
        public static final Parcelable.Creator<d> CREATOR = new c();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"ru/cyberity/cbr/core/data/model/ApplicantDataField.Field.$serializer", "Lkotlinx/serialization/internal/N;", "Lru/cyberity/cbr/core/data/model/h$d;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "a", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/h$d;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/h$d;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        @InterfaceC42830m
        public static final class a implements kotlinx.serialization.internal.N<d> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433130a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ SerialDescriptor f433131b;

            static {
                a aVar = new a();
                f433130a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.cyberity.cbr.core.data.model.ApplicantDataField.Field", aVar, 7);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("required", false);
                pluginGeneratedSerialDescriptor.j("type", true);
                pluginGeneratedSerialDescriptor.j("mask", true);
                pluginGeneratedSerialDescriptor.j("masks", true);
                pluginGeneratedSerialDescriptor.j("format", true);
                pluginGeneratedSerialDescriptor.j(ChannelContext.Item.PLACEHOLDER, true);
                f433131b = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d deserialize(@Y61.k Decoder decoder) {
                SerialDescriptor f332717a = getF412706c();
                kotlinx.serialization.encoding.c cVarC = decoder.c(f332717a);
                Object objF = null;
                boolean z12 = true;
                int i12 = 0;
                boolean zD2 = false;
                Object objF2 = null;
                Object objF3 = null;
                Object objF4 = null;
                Object objF5 = null;
                Object objF6 = null;
                while (z12) {
                    int iJ2 = cVarC.j(f332717a);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            objF = cVarC.f(f332717a, 0, FieldName.Companion.C12446a.f432992a, objF);
                            i12 |= 1;
                            break;
                        case 1:
                            zD2 = cVarC.D(f332717a, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            objF2 = cVarC.f(f332717a, 2, new I("ru.cyberity.cbr.core.data.model.FieldType", FieldType.values()), objF2);
                            i12 |= 4;
                            break;
                        case 3:
                            objF3 = cVarC.f(f332717a, 3, V0.f412822a, objF3);
                            i12 |= 8;
                            break;
                        case 4:
                            objF4 = cVarC.f(f332717a, 4, new C43401f(V0.f412822a), objF4);
                            i12 |= 16;
                            break;
                        case 5:
                            objF5 = cVarC.f(f332717a, 5, q.Companion.a.f433171a, objF5);
                            i12 |= 32;
                            break;
                        case 6:
                            objF6 = cVarC.f(f332717a, 6, V0.f412822a, objF6);
                            i12 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(f332717a);
                return new d(i12, (FieldName) objF, zD2, (FieldType) objF2, (String) objF3, (List) objF4, (q) objF5, (String) objF6, (P0) null);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] childSerializers() {
                KSerializer<?> kSerializerA = L51.a.a(FieldName.Companion.C12446a.f432992a);
                KSerializer<?> kSerializerA2 = L51.a.a(new I("ru.cyberity.cbr.core.data.model.FieldType", FieldType.values()));
                V0 v02 = V0.f412822a;
                return new KSerializer[]{kSerializerA, C43407i.f412866a, kSerializerA2, L51.a.a(v02), L51.a.a(new C43401f(v02)), L51.a.a(q.Companion.a.f433171a), L51.a.a(v02)};
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return f433131b;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k d value) {
                SerialDescriptor f332717a = getF412706c();
                kotlinx.serialization.encoding.d dVarC = encoder.c(f332717a);
                d.a(value, dVarC, f332717a);
                dVarC.d(f332717a);
            }
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$d$b;", "", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/h$d;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.h$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }

            @Y61.k
            public final KSerializer<d> serializer() {
                return a.f433130a;
            }

            private Companion() {
            }
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class c implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(@Y61.k Parcel parcel) {
                return new d(parcel.readInt() == 0 ? null : FieldName.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : FieldType.valueOf(parcel.readString()), parcel.readString(), parcel.createStringArrayList(), (q) parcel.readParcelable(d.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i12) {
                return new d[i12];
            }
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.data.model.h$d$d, reason: collision with other inner class name */
        public /* synthetic */ class C12450d {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f433132a;

            static {
                int[] iArr = new int[FieldName.values().length];
                iArr[FieldName.country.ordinal()] = 1;
                iArr[FieldName.street.ordinal()] = 2;
                iArr[FieldName.subStreet.ordinal()] = 3;
                iArr[FieldName.buildingNumber.ordinal()] = 4;
                iArr[FieldName.flatNumber.ordinal()] = 5;
                iArr[FieldName.town.ordinal()] = 6;
                iArr[FieldName.state.ordinal()] = 7;
                iArr[FieldName.postCode.ordinal()] = 8;
                f433132a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @InterfaceC42830m
        public /* synthetic */ d(int i12, @v FieldName fieldName, @v boolean z12, @v FieldType fieldType, @v String str, @v List list, @v q qVar, @v String str2, P0 p02) {
            super(i12, p02);
            if (3 != (i12 & 3)) {
                E0.b(i12, 3, a.f433130a.getF412706c());
                throw null;
            }
            this.name = fieldName;
            this.isRequired = z12;
            if ((i12 & 4) == 0) {
                this.type = null;
            } else {
                this.type = fieldType;
            }
            if ((i12 & 8) == 0) {
                this.mask = null;
            } else {
                this.mask = str;
            }
            if ((i12 & 16) == 0) {
                this.masks = null;
            } else {
                this.masks = list;
            }
            if ((i12 & 32) == 0) {
                this.format = null;
            } else {
                this.format = qVar;
            }
            if ((i12 & 64) == 0) {
                this.placeholder = null;
            } else {
                this.placeholder = str2;
            }
        }

        /* renamed from: A, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        @Y61.k
        public final d a(@Y61.l FieldName name, boolean isRequired, @Y61.l FieldType type, @Y61.l String mask, @Y61.l List<String> masks, @Y61.l q format, @Y61.l String placeholder) {
            return new d(name, isRequired, type, mask, masks, format, placeholder);
        }

        @Override // ru.cyberity.cbr.core.data.model.h
        @Y61.k
        public String b() {
            String value;
            FieldName fieldName = this.name;
            return (fieldName == null || (value = fieldName.getValue()) == null) ? "" : value;
        }

        @Override // ru.cyberity.cbr.core.data.model.h
        @Y61.k
        public String c() {
            return ru.cyberity.cbr.core.common.s.a(this) + ", name=" + this.name + ", type=" + this.type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return this.name == dVar.name && this.isRequired == dVar.isRequired && this.type == dVar.type && L.f(this.mask, dVar.mask) && L.f(this.masks, dVar.masks) && L.f(this.format, dVar.format) && L.f(this.placeholder, dVar.placeholder);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            FieldName fieldName = this.name;
            int iHashCode = (fieldName == null ? 0 : fieldName.hashCode()) * 31;
            boolean z12 = this.isRequired;
            int i12 = z12;
            if (z12 != 0) {
                i12 = 1;
            }
            int i13 = (iHashCode + i12) * 31;
            FieldType fieldType = this.type;
            int iHashCode2 = (i13 + (fieldType == null ? 0 : fieldType.hashCode())) * 31;
            String str = this.mask;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.masks;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            q qVar = this.format;
            int iHashCode5 = (iHashCode4 + (qVar == null ? 0 : qVar.hashCode())) * 31;
            String str2 = this.placeholder;
            return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: k, reason: from getter */
        public final q getFormat() {
            return this.format;
        }

        @Y61.l
        /* renamed from: m, reason: from getter */
        public final String getMask() {
            return this.mask;
        }

        @Y61.l
        public final List<String> o() {
            return this.masks;
        }

        @Y61.l
        /* renamed from: q, reason: from getter */
        public final FieldName getName() {
            return this.name;
        }

        @Y61.l
        /* renamed from: s, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Field(name=");
            sb2.append(this.name);
            sb2.append(", isRequired=");
            sb2.append(this.isRequired);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", mask=");
            sb2.append(this.mask);
            sb2.append(", masks=");
            sb2.append(this.masks);
            sb2.append(", format=");
            sb2.append(this.format);
            sb2.append(", placeholder=");
            return C22026a.c(sb2, this.placeholder, ')');
        }

        public final boolean w() {
            FieldName fieldName = this.name;
            switch (fieldName == null ? -1 : C12450d.f433132a[fieldName.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
                default:
                    return false;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            FieldName fieldName = this.name;
            if (fieldName == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fieldName.name());
            }
            parcel.writeInt(this.isRequired ? 1 : 0);
            FieldType fieldType = this.type;
            if (fieldType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(fieldType.name());
            }
            parcel.writeString(this.mask);
            parcel.writeStringList(this.masks);
            parcel.writeParcelable(this.format, flags);
            parcel.writeString(this.placeholder);
        }

        public final boolean x() {
            String value;
            FieldName fieldName = this.name;
            if (fieldName == null || (value = fieldName.getValue()) == null) {
                return false;
            }
            return i.a(value);
        }

        public final boolean y() {
            FieldName fieldName = this.name;
            return fieldName == FieldName.dob || fieldName == FieldName.issuedDate || this.type == FieldType.date;
        }

        public final boolean z() {
            return (x() || w()) ? false : true;
        }

        public /* synthetic */ d(FieldName fieldName, boolean z12, FieldType fieldType, String str, List list, q qVar, String str2, int i12, C42822w c42822w) {
            this(fieldName, z12, (i12 & 4) != 0 ? null : fieldType, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : qVar, (i12 & 64) != 0 ? null : str2);
        }

        public static /* synthetic */ d a(d dVar, FieldName fieldName, boolean z12, FieldType fieldType, String str, List list, q qVar, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                fieldName = dVar.name;
            }
            if ((i12 & 2) != 0) {
                z12 = dVar.isRequired;
            }
            boolean z13 = z12;
            if ((i12 & 4) != 0) {
                fieldType = dVar.type;
            }
            FieldType fieldType2 = fieldType;
            if ((i12 & 8) != 0) {
                str = dVar.mask;
            }
            String str3 = str;
            if ((i12 & 16) != 0) {
                list = dVar.masks;
            }
            List list2 = list;
            if ((i12 & 32) != 0) {
                qVar = dVar.format;
            }
            q qVar2 = qVar;
            if ((i12 & 64) != 0) {
                str2 = dVar.placeholder;
            }
            return dVar.a(fieldName, z13, fieldType2, str3, list2, qVar2, str2);
        }

        public d(@Y61.l FieldName fieldName, boolean z12, @Y61.l FieldType fieldType, @Y61.l String str, @Y61.l List<String> list, @Y61.l q qVar, @Y61.l String str2) {
            super(null);
            this.name = fieldName;
            this.isRequired = z12;
            this.type = fieldType;
            this.mask = str;
            this.masks = list;
            this.format = qVar;
            this.placeholder = str2;
        }

        @X41.n
        public static final void a(@Y61.k d self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
            h.a(self, output, serialDesc);
            output.p(serialDesc, 0, FieldName.Companion.C12446a.f432992a, self.name);
            output.k(serialDesc, 1, self.isRequired);
            if (output.u() || self.type != null) {
                output.p(serialDesc, 2, new I("ru.cyberity.cbr.core.data.model.FieldType", FieldType.values()), self.type);
            }
            if (output.u() || self.mask != null) {
                output.p(serialDesc, 3, V0.f412822a, self.mask);
            }
            if (output.u() || self.masks != null) {
                output.p(serialDesc, 4, new C43401f(V0.f412822a), self.masks);
            }
            if (output.u() || self.format != null) {
                output.p(serialDesc, 5, q.Companion.a.f433171a, self.format);
            }
            if (!output.u() && self.placeholder == null) {
                return;
            }
            output.p(serialDesc, 6, V0.f412822a, self.placeholder);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\u0003B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e;", "Lru/cyberity/cbr/core/data/model/h;", "", "b", "()Ljava/lang/String;", "formItemId", "<init>", "()V", "a", "Lru/cyberity/cbr/core/data/model/h$e$a;", "Lru/cyberity/cbr/core/data/model/h$e$b;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class e extends h {

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$b;", "Lru/cyberity/cbr/core/data/model/h$e;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/CharSequence;", "e", "()Ljava/lang/CharSequence;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class b extends e {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final CharSequence text;

            public b(@Y61.k CharSequence charSequence) {
                super(null);
                this.text = charSequence;
            }

            @Y61.k
            /* renamed from: e, reason: from getter */
            public final CharSequence getText() {
                return this.text;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof b) && L.f(this.text, ((b) other).text);
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @Y61.k
            public String toString() {
                return AK.c.r(new StringBuilder("Text(text="), this.text, ')');
            }
        }

        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        @Override // ru.cyberity.cbr.core.data.model.h
        @Y61.k
        public String b() {
            return c();
        }

        private e() {
            super(null);
        }

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001eB+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a;", "Lru/cyberity/cbr/core/data/model/h$e;", "", "label", "", "currentSelectedItem", "", "Lru/cyberity/cbr/core/data/model/h$e$a$a;", "items", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "i", "c", "I", "g", "d", "Ljava/util/List;", "h", "()Ljava/util/List;", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        public static final /* data */ class a extends e {

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.l
            private final String label;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata */
            private final int currentSelectedItem;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private final List<C12451a> items;

            /* compiled from: ApplicantDataField.kt */
            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/h$e$a$a;", "", "", "id", "label", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
            /* renamed from: ru.cyberity.cbr.core.data.model.h$e$a$a, reason: collision with other inner class name */
            public static final /* data */ class C12451a {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                @Y61.k
                private final String id;

                /* renamed from: b, reason: collision with root package name and from kotlin metadata */
                @Y61.k
                private final String label;

                public C12451a(@Y61.k String str, @Y61.k String str2) {
                    this.id = str;
                    this.label = str2;
                }

                @Y61.k
                /* renamed from: c, reason: from getter */
                public final String getId() {
                    return this.id;
                }

                @Y61.k
                /* renamed from: d, reason: from getter */
                public final String getLabel() {
                    return this.label;
                }

                public boolean equals(@Y61.l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof C12451a)) {
                        return false;
                    }
                    C12451a c12451a = (C12451a) other;
                    return L.f(this.id, c12451a.id) && L.f(this.label, c12451a.label);
                }

                public int hashCode() {
                    return this.label.hashCode() + (this.id.hashCode() * 31);
                }

                @Y61.k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("DropDownItem(id=");
                    sb2.append(this.id);
                    sb2.append(", label=");
                    return C22026a.c(sb2, this.label, ')');
                }
            }

            public a(@Y61.l String str, int i12, @Y61.k List<C12451a> list) {
                super(null);
                this.label = str;
                this.currentSelectedItem = i12;
                this.items = list;
            }

            public boolean equals(@Y61.l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof a)) {
                    return false;
                }
                a aVar = (a) other;
                return L.f(this.label, aVar.label) && this.currentSelectedItem == aVar.currentSelectedItem && L.f(this.items, aVar.items);
            }

            /* renamed from: g, reason: from getter */
            public final int getCurrentSelectedItem() {
                return this.currentSelectedItem;
            }

            @Y61.k
            public final List<C12451a> h() {
                return this.items;
            }

            public int hashCode() {
                String str = this.label;
                return this.items.hashCode() + androidx.appcompat.app.r.e(this.currentSelectedItem, (str == null ? 0 : str.hashCode()) * 31, 31);
            }

            @Y61.l
            /* renamed from: i, reason: from getter */
            public final String getLabel() {
                return this.label;
            }

            @Y61.k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Dropdown(label=");
                sb2.append(this.label);
                sb2.append(", currentSelectedItem=");
                sb2.append(this.currentSelectedItem);
                sb2.append(", items=");
                return H.p(sb2, this.items, ')');
            }

            public a(String str, int i12, List list, int i13, C42822w c42822w) {
                this(str, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? C42784z0.f406748b : list);
            }
        }
    }

    public /* synthetic */ h(C42822w c42822w) {
        this();
    }

    @X41.n
    public static final void a(@Y61.k h self, @Y61.k kotlinx.serialization.encoding.d output, @Y61.k SerialDescriptor serialDesc) {
    }

    @Y61.k
    public abstract String b();

    @Y61.k
    public String c() {
        return ru.cyberity.cbr.core.common.s.a(this);
    }

    private h() {
    }

    @InterfaceC42830m
    public /* synthetic */ h(int i12, P0 p02) {
    }
}
