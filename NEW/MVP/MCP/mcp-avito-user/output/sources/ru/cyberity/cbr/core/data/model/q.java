package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.category_parameters.NumericParameter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.w;

/* compiled from: ApplicantDataField.kt */
@K51.d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lru/cyberity/cbr/core/data/model/q;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lru/cyberity/cbr/core/data/model/q$a;", "Lru/cyberity/cbr/core/data/model/q$b;", "Lru/cyberity/cbr/core/data/model/q$c;", "Lru/cyberity/cbr/core/data/model/q$d;", "Lru/cyberity/cbr/core/data/model/q$f;", "Lru/cyberity/cbr/core/data/model/q$g;", "Lru/cyberity/cbr/core/data/model/q$h;", "Lru/cyberity/cbr/core/data/model/q$i;", "Lru/cyberity/cbr/core/data/model/q$j;", "Lru/cyberity/cbr/core/data/model/q$k;", "Lru/cyberity/cbr/core/data/model/q$l;", "Lru/cyberity/cbr/core/data/model/q$m;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w(with = Companion.a.class)
/* loaded from: classes9.dex */
public abstract class q implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$a;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final a f433167e = new a();

        @Y61.k
        public static final Parcelable.Creator<a> CREATOR = new C12452a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: ru.cyberity.cbr.core.data.model.q$a$a, reason: collision with other inner class name */
        public static final class C12452a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return a.f433167e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i12) {
                return new a[i12];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$b;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class b extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final b f433168e = new b();

        @Y61.k
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return b.f433168e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i12) {
                return new b[i12];
            }
        }

        private b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$c;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class c extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final c f433169e = new c();

        @Y61.k
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return c.f433169e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i12) {
                return new c[i12];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$d;", "Lru/cyberity/cbr/core/data/model/q;", "Lru/cyberity/cbr/core/data/source/applicant/remote/g;", "value", "<init>", "(Lru/cyberity/cbr/core/data/source/applicant/remote/g;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Lru/cyberity/cbr/core/data/source/applicant/remote/g;", "a", "()Lru/cyberity/cbr/core/data/source/applicant/remote/g;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class d extends q {

        @Y61.k
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final ru.cyberity.cbr.core.data.source.applicant.remote.g value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(@Y61.k Parcel parcel) {
                return new d(ru.cyberity.cbr.core.data.source.applicant.remote.g.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i12) {
                return new d[i12];
            }
        }

        public d(@Y61.k ru.cyberity.cbr.core.data.source.applicant.remote.g gVar) {
            super(null);
            this.value = gVar;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final ru.cyberity.cbr.core.data.source.applicant.remote.g getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            this.value.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$e;", "", "", "format", "Lru/cyberity/cbr/core/data/model/q;", "a", "Lkotlinx/serialization/KSerializer;", "serializer", "ANDROID_TEXT_VARIATION_EMAIL_ADDRESS", "Ljava/lang/String;", "ANDROID_TEXT_WITH_CAP_WORDS", "FORMAT_MIN_VALUE", "FORMAT_VALUE_DELIMITER", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.q$e, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$e$a;", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/q;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/q;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.q$e$a */
        public static final class a implements KSerializer<q> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f433171a = new a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private static final SerialDescriptor descriptor = kotlinx.serialization.descriptors.n.a("FieldFormat", e.i.f412727a);

            private a() {
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.l q value) {
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF412706c() {
                return descriptor;
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public q deserialize(@Y61.k Decoder decoder) {
                return q.INSTANCE.a(decoder.w());
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.l
        public final q a(@Y61.l String format) {
            if (format == null) {
                return null;
            }
            List listF0 = C43066x.f0(format, new String[]{":"}, 0, 6);
            if (listF0.size() == 1) {
                String str = (String) listF0.get(0);
                switch (str.hashCode()) {
                    case -2000413939:
                        if (str.equals(NumericParameter.TYPE)) {
                            return k.f433178e;
                        }
                        return null;
                    case -1626286546:
                        if (str.equals("alpha_spaces")) {
                            return a.f433167e;
                        }
                        return null;
                    case -59614510:
                        if (str.equals("validPhone")) {
                            return m.f433180e;
                        }
                        return null;
                    case 96619420:
                        if (str.equals("email")) {
                            return b.f433168e;
                        }
                        return null;
                    case 572016716:
                        if (str.equals("android_tetxt_cap_words")) {
                            return c.f433169e;
                        }
                        return null;
                    default:
                        return null;
                }
            }
            if (listF0.size() != 2) {
                return null;
            }
            String str2 = (String) listF0.get(0);
            String str3 = (String) listF0.get(1);
            switch (str2.hashCode()) {
                case -232128810:
                    if (!str2.equals("max_value")) {
                        return null;
                    }
                    Double dW02 = C43066x.w0(str3);
                    return new h(dW02 != null ? dW02.doubleValue() : Double.MAX_VALUE);
                case -216634360:
                    if (!str2.equals("between")) {
                        return null;
                    }
                    List listF02 = C43066x.f0(str3, new String[]{","}, 0, 6);
                    Double dW03 = C43066x.w0((String) listF02.get(0));
                    double dDoubleValue = dW03 != null ? dW03.doubleValue() : Double.MIN_VALUE;
                    Double dW04 = C43066x.w0((String) listF02.get(1));
                    return new d(new ru.cyberity.cbr.core.data.source.applicant.remote.g(dDoubleValue, dW04 != null ? dW04.doubleValue() : Double.MAX_VALUE));
                case 107876:
                    if (!str2.equals("max")) {
                        return null;
                    }
                    Integer numY0 = C43066x.y0(str3);
                    return new g(numY0 != null ? numY0.intValue() : Integer.MAX_VALUE);
                case 108114:
                    if (!str2.equals("min")) {
                        return null;
                    }
                    Integer numY02 = C43066x.y0(str3);
                    return new i(numY02 != null ? numY02.intValue() : BeduinInputModel.MIN_TEXT_VERSION);
                case 108392519:
                    if (str2.equals("regex")) {
                        return new l(str3);
                    }
                    return null;
                case 540349764:
                    if (!str2.equals("min_value")) {
                        return null;
                    }
                    Double dW05 = C43066x.w0(str3);
                    return new j(dW05 != null ? dW05.doubleValue() : Double.MIN_VALUE);
                default:
                    return null;
            }
        }

        @Y61.k
        public final KSerializer<q> serializer() {
            return a.f433171a;
        }

        private Companion() {
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$f;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class f extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final f f433173e = new f();

        @Y61.k
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return f.f433173e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i12) {
                return new f[i12];
            }
        }

        private f() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$g;", "Lru/cyberity/cbr/core/data/model/q;", "", "value", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "I", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class g extends q {

        @Y61.k
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(@Y61.k Parcel parcel) {
                return new g(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i12) {
                return new g[i12];
            }
        }

        public g(int i12) {
            super(null);
            this.value = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$h;", "Lru/cyberity/cbr/core/data/model/q;", "", "value", "<init>", "(D)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "D", "a", "()D", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class h extends q {

        @Y61.k
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final double value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(@Y61.k Parcel parcel) {
                return new h(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i12) {
                return new h[i12];
            }
        }

        public h(double d12) {
            super(null);
            this.value = d12;
        }

        /* renamed from: a, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeDouble(this.value);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$i;", "Lru/cyberity/cbr/core/data/model/q;", "", "value", "<init>", "(I)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "I", "a", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class i extends q {

        @Y61.k
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(@Y61.k Parcel parcel) {
                return new i(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i12) {
                return new i[i12];
            }
        }

        public i(int i12) {
            super(null);
            this.value = i12;
        }

        /* renamed from: a, reason: from getter */
        public final int getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(this.value);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$j;", "Lru/cyberity/cbr/core/data/model/q;", "", "value", "<init>", "(D)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "D", "a", "()D", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class j extends q {

        @Y61.k
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final double value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(@Y61.k Parcel parcel) {
                return new j(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i12) {
                return new j[i12];
            }
        }

        public j(double d12) {
            super(null);
            this.value = d12;
        }

        /* renamed from: a, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeDouble(this.value);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$k;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class k extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final k f433178e = new k();

        @Y61.k
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return k.f433178e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i12) {
                return new k[i12];
            }
        }

        private k() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$l;", "Lru/cyberity/cbr/core/data/model/q;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "e", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class l extends q {

        @Y61.k
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Y61.k
        private final String value;

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(@Y61.k Parcel parcel) {
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i12) {
                return new l[i12];
            }
        }

        public l(@Y61.k String str) {
            super(null);
            this.value = str;
        }

        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeString(this.value);
        }
    }

    /* compiled from: ApplicantDataField.kt */
    @K51.d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/data/model/q$m;", "Lru/cyberity/cbr/core/data/model/q;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class m extends q {

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public static final m f433180e = new m();

        @Y61.k
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* compiled from: ApplicantDataField.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(@Y61.k Parcel parcel) {
                parcel.readInt();
                return m.f433180e;
            }

            @Override // android.os.Parcelable.Creator
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i12) {
                return new m[i12];
            }
        }

        private m() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ q(C42822w c42822w) {
        this();
    }

    private q() {
    }
}
