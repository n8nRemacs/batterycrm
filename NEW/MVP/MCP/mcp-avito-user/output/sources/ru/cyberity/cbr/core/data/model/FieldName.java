package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.e;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.w;

/* compiled from: ApplicantDataField.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b)\b\u0087\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldName;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "a", "firstName", "lastName", "middleName", "email", "phone", "countryOfBirth", "stateOfBirth", "dob", "placeOfBirth", "legalName", "gender", "nationality", "country", "taxResidenceCountry", "street", "subStreet", "buildingNumber", "flatNumber", "town", VoiceInfo.STATE, "postCode", "transactionAmount", "incomeSourceType", "investmentKnowledgeLevel", "annualIncome", "netWorth", "tin", "number", "issuedDate", PluralsKeys.OTHER, "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
@w(with = Companion.C12446a.class)
/* loaded from: classes9.dex */
public enum FieldName {
    firstName("firstName"),
    lastName("lastName"),
    middleName("middleName"),
    email("email"),
    phone("phone"),
    countryOfBirth("countryOfBirth"),
    stateOfBirth("stateOfBirth"),
    dob("dob"),
    placeOfBirth("placeOfBirth"),
    legalName("legalName"),
    gender("gender"),
    nationality("nationality"),
    country("country"),
    taxResidenceCountry("taxResidenceCountry"),
    street("street"),
    subStreet("subStreet"),
    buildingNumber("buildingNumber"),
    flatNumber("flatNumber"),
    town("town"),
    state(VoiceInfo.STATE),
    postCode("postCode"),
    transactionAmount("transactionAmount"),
    incomeSourceType("incomeSourceType"),
    investmentKnowledgeLevel("investmentKnowledgeLevel"),
    annualIncome("annualIncome"),
    netWorth("netWorth"),
    tin("tin"),
    number("number"),
    issuedDate("issuedDate"),
    other("");


    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private String value;

    /* compiled from: ApplicantDataField.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001¨\u0006\n"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldName$a;", "", "", "value", "Lru/cyberity/cbr/core/data/model/FieldName;", "a", "Lkotlinx/serialization/KSerializer;", "serializer", "<init>", "()V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.core.data.model.FieldName$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: ApplicantDataField.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/model/FieldName$a$a;", "Lkotlinx/serialization/KSerializer;", "Lru/cyberity/cbr/core/data/model/FieldName;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lkotlin/G0;", "a", "(Lkotlinx/serialization/encoding/Encoder;Lru/cyberity/cbr/core/data/model/FieldName;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "(Lkotlinx/serialization/encoding/Decoder;)Lru/cyberity/cbr/core/data/model/FieldName;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "b", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
        /* renamed from: ru.cyberity.cbr.core.data.model.FieldName$a$a, reason: collision with other inner class name */
        public static final class C12446a implements KSerializer<FieldName> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C12446a f432992a = new C12446a();

            /* renamed from: b, reason: collision with root package name and from kotlin metadata */
            @Y61.k
            private static final SerialDescriptor descriptor = kotlinx.serialization.descriptors.n.a("FieldName", e.i.f412727a);

            private C12446a() {
            }

            @Override // kotlinx.serialization.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void serialize(@Y61.k Encoder encoder, @Y61.k FieldName value) {
                encoder.b(value.getValue());
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FieldName deserialize(@Y61.k Decoder decoder) {
                FieldName fieldName;
                String strW = decoder.w();
                FieldName[] fieldNameArrValues = FieldName.values();
                int length = fieldNameArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        fieldName = null;
                        break;
                    }
                    fieldName = fieldNameArrValues[i12];
                    if (L.f(fieldName.getValue(), strW)) {
                        break;
                    }
                    i12++;
                }
                if (fieldName != null) {
                    return fieldName;
                }
                FieldName fieldName2 = FieldName.other;
                fieldName2.setValue(strW);
                return fieldName2;
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final FieldName a(@Y61.l String value) {
            FieldName fieldName;
            FieldName[] fieldNameArrValues = FieldName.values();
            int length = fieldNameArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    fieldName = null;
                    break;
                }
                fieldName = fieldNameArrValues[i12];
                if (L.f(fieldName.getValue(), value)) {
                    break;
                }
                i12++;
            }
            if (fieldName == null) {
                fieldName = FieldName.other;
                if (value == null) {
                    value = "";
                }
                fieldName.setValue(value);
            }
            return fieldName;
        }

        @Y61.k
        public final KSerializer<FieldName> serializer() {
            return C12446a.f432992a;
        }

        private Companion() {
        }
    }

    FieldName(String str) {
        this.value = str;
    }

    @Y61.k
    public final String getValue() {
        return this.value;
    }

    public final void setValue(@Y61.k String str) {
        this.value = str;
    }
}
