package ru.cyberity.cbr.core.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u0;
import kotlin.text.C43066x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.data.source.dynamic.c;

/* compiled from: DocumentType.kt */
@K51.d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0003\t;<B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\t\u0010\rJ#\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u0011R\u0011\u0010%\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010)\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b(\u0010$R\u0011\u0010+\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b*\u0010$R\u0011\u0010-\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b,\u0010$R\u0011\u0010/\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b.\u0010$R\u0011\u00101\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b0\u0010$R\u0011\u00103\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b2\u0010$R\u0011\u00105\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b4\u0010$R\u0011\u00107\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b6\u0010$R\u0011\u00109\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b8\u0010\u0011¨\u0006="}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType;", "Landroid/os/Parcelable;", "", "value", "<init>", "(Ljava/lang/String;)V", "", "map", "", "a", "(Ljava/util/Map;)Ljava/lang/CharSequence;", "Lru/cyberity/cbr/core/data/source/dynamic/c$c;", "strings", "(Lru/cyberity/cbr/core/data/source/dynamic/c$c;)Ljava/lang/CharSequence;", "scene", "(Lru/cyberity/cbr/core/data/source/dynamic/c$c;Ljava/lang/String;)Ljava/lang/CharSequence;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "c", "e", "()Z", "isEKyc", "g", "isIdentity", "k", "isSelfie", "h", "isPOA", "d", "isApplicantData", "i", "isPhoneVerification", "f", "isEmailVerification", "j", "isQuestionnaireVerification", "m", "isVideoIdent", "l", "isSupported", "b", "iconName", "Companion", "DocSetType", "IdentityDocItemType", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w(with = Companion.C12445a.class)
/* loaded from: classes9.dex */
public final /* data */ class DocumentType implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    private final String value;

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    public static final Parcelable.Creator<DocumentType> CREATOR = new b();

    /* compiled from: DocumentType.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType$DocSetType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "IDENTITY", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DocSetType {
        IDENTITY("IDENTITY");


        @Y61.k
        private final String value;

        DocSetType(String str) {
            this.value = str;
        }

        @Y61.k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DocumentType.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType$IdentityDocItemType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PASSPORT", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum IdentityDocItemType {
        PASSPORT("PASSPORT");


        @Y61.k
        private final String value;

        IdentityDocItemType(String str) {
            this.value = str;
        }

        @Y61.k
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: DocumentType.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\t¨\u0006\u0016"}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType$a;", "", "", "value", "Lru/cyberity/cbr/core/data/model/DocumentType;", "a", "Lkotlinx/serialization/KSerializer;", "serializer", "TYPE_APPLICANT_DATA", "Ljava/lang/String;", "TYPE_EMAIL_VERIFICATION", "TYPE_E_KYC", "TYPE_IDENTITY", "TYPE_INVESTABILITY", "TYPE_PHONE_VERIFICATION", "TYPE_POA", "TYPE_QUESTIONNAIRE_VERIFICATION", "TYPE_SELFIE", "TYPE_UNKNOWN", "TYPE_VIDEOIDENT", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.DocumentType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: DocumentType.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/model/DocumentType$a$a;", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/DocumentType;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/DocumentType;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/DocumentType;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.DocumentType$a$a, reason: collision with other inner class name */
        public static final class C12445a implements KSerializer<DocumentType> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12445a f432990a = new C12445a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private static final SerialDescriptor descriptor = kotlinx.serialization.descriptors.n.a("DocumentType", e.i.f412727a);

            private C12445a() {
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k DocumentType value) {
                encoder.b(value.getValue());
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public SerialDescriptor getF332717a() {
                return descriptor;
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DocumentType deserialize(@Y61.k Decoder decoder) {
                return DocumentType.INSTANCE.a(decoder.w());
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final DocumentType a(@Y61.l String value) {
            if ((value != null && C43066x.h0(value, "SELFIE", false)) || ((value != null && C43066x.h0(value, "IDENTITY", false)) || ((value != null && C43066x.h0(value, "APPLICANT_DATA", false)) || ((value != null && C43066x.h0(value, "PROOF_OF_RESIDENCE", false)) || ((value != null && C43066x.h0(value, "INVESTABILITY", false)) || ((value != null && C43066x.h0(value, "EMAIL_VERIFICATION", false)) || ((value != null && C43066x.h0(value, "PHONE_VERIFICATION", false)) || (value != null && C43066x.h0(value, "QUESTIONNAIRE", false))))))))) {
                return new DocumentType(value);
            }
            if (value != null) {
                return new DocumentType(value);
            }
            throw new IllegalArgumentException("Null document type");
        }

        @Y61.k
        public final KSerializer<DocumentType> serializer() {
            return C12445a.f432990a;
        }

        private Companion() {
        }
    }

    /* compiled from: DocumentType.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b implements Parcelable.Creator<DocumentType> {
        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentType createFromParcel(@Y61.k Parcel parcel) {
            return new DocumentType(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @Y61.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DocumentType[] newArray(int i12) {
            return new DocumentType[i12];
        }
    }

    public DocumentType(@Y61.k String str) {
        this.value = str;
    }

    @Y61.k
    public final CharSequence a(@Y61.l c.C12476c strings) {
        return strings == null ? "" : a(strings.d());
    }

    @Y61.k
    public final String b() {
        return "DocType/" + this.value;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean d() {
        return C43066x.h0(this.value, "APPLICANT_DATA", false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean e() {
        return C43066x.h0(this.value, "E_KYC", false);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DocumentType) && L.f(this.value, ((DocumentType) other).value);
    }

    public final boolean f() {
        return C43066x.h0(this.value, "EMAIL_VERIFICATION", false);
    }

    public final boolean g() {
        return C43066x.h0(this.value, "IDENTITY", false);
    }

    public final boolean h() {
        return C43066x.h0(this.value, "PROOF_OF_RESIDENCE", false);
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final boolean i() {
        return C43066x.h0(this.value, "PHONE_VERIFICATION", false);
    }

    public final boolean j() {
        return C43066x.h0(this.value, "QUESTIONNAIRE", false);
    }

    public final boolean k() {
        return C43066x.h0(this.value, "SELFIE", false);
    }

    public final boolean l() {
        return g() || k() || h() || d() || i() || f() || j() || e();
    }

    public final boolean m() {
        return C43066x.h0(this.value, "VIDEO_IDENT", false);
    }

    @Y61.k
    public String toString() {
        return C22026a.c(new StringBuilder("DocumentType(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.value);
    }

    private final CharSequence a(Map<String, String> map) {
        u0 u0Var = u0.f406856a;
        String str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{this.value}, 1)));
        if (str == null || str.length() == 0) {
            if (g()) {
                str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"IDENTITY"}, 1)));
            } else if (k()) {
                str = map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"SELFIE"}, 1)));
            } else {
                str = d() ? map.get(String.format("sns_step_%s_title", Arrays.copyOf(new Object[]{"APPLICANT_DATA"}, 1))) : this.value;
            }
        }
        return str != null ? str : this.value;
    }

    @Y61.k
    public final CharSequence a(@Y61.l c.C12476c strings, @Y61.l String scene) {
        String str;
        String str2;
        String str3;
        if (strings == null) {
            return "";
        }
        if (scene != null) {
            u0 u0Var = u0.f406856a;
            str = String.format("sns_step_%s_%s_prompt", Arrays.copyOf(new Object[]{this.value, scene}, 2));
            str2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            str3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        } else {
            u0 u0Var2 = u0.f406856a;
            str = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            str2 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{this.value}, 1));
            str3 = String.format("sns_step_%s_prompt", Arrays.copyOf(new Object[]{"defaults"}, 1));
        }
        String strA = strings.a(str, str2, str3);
        if (strA.length() <= 0) {
            strA = null;
        }
        return strA != null ? strA : this.value;
    }
}
