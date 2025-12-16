package ru.cyberity.cbr.core.data.model;

import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.w;
import ru.cyberity.cbr.core.PublicApi;
import ru.cyberity.cbr.core.data.serializer.FlowActionTypeSerializer;

/* compiled from: FlowActionType.kt */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowActionType;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", "FaceEnrollment", "Other", "Lru/cyberity/cbr/core/data/model/FlowActionType$FaceEnrollment;", "Lru/cyberity/cbr/core/data/model/FlowActionType$Other;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@w(with = FlowActionTypeSerializer.class)
@PublicApi
/* loaded from: classes9.dex */
public abstract class FlowActionType {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = new Companion(null);

    @Y61.k
    private final String value;

    /* compiled from: FlowActionType.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¨\u0006\t"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowActionType$Companion;", "", "()V", "get", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "value", "", "serializer", "Lkotlinx/serialization/KSerializer;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Y61.k
        public final FlowActionType get(@Y61.l String value) {
            FaceEnrollment faceEnrollment = FaceEnrollment.INSTANCE;
            if (L.f(value, faceEnrollment.getValue())) {
                return faceEnrollment;
            }
            if (value == null) {
                value = "";
            }
            return new Other(value);
        }

        @Y61.k
        public final KSerializer<FlowActionType> serializer() {
            return FlowActionTypeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: FlowActionType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowActionType$FaceEnrollment;", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FaceEnrollment extends FlowActionType {

        @Y61.k
        public static final FaceEnrollment INSTANCE = new FaceEnrollment();

        private FaceEnrollment() {
            super("faceEnrollment", null);
        }
    }

    /* compiled from: FlowActionType.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/model/FlowActionType$Other;", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "", "value", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Other extends FlowActionType {

        @Y61.k
        private final String value;

        public Other(@Y61.k String str) {
            super(str, null);
            this.value = str;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Other) && L.f(getValue(), ((Other) other).getValue());
        }

        @Override // ru.cyberity.cbr.core.data.model.FlowActionType
        @Y61.k
        public String getValue() {
            return this.value;
        }

        public int hashCode() {
            return getValue().hashCode();
        }

        @Y61.k
        public String toString() {
            return "Other(value=" + getValue() + ')';
        }
    }

    public /* synthetic */ FlowActionType(String str, C42822w c42822w) {
        this(str);
    }

    @Y61.k
    public String getValue() {
        return this.value;
    }

    private FlowActionType(String str) {
        this.value = str;
    }
}
