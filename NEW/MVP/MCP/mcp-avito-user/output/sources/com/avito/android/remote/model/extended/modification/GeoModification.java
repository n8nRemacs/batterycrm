package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.common.GeoCoordinates;
import com.avito.android.remote.model.extended.common.GeoSchedule;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: GeoModification.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/GeoModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    /* compiled from: GeoModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation;", "", "valueId", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/GeoModification$OperationType;", "value", "Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation$GeoModificationValue;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/GeoModification$OperationType;Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation$GeoModificationValue;)V", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/GeoModification$OperationType;", "getValue", "()Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation$GeoModificationValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "GeoModificationValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Operation {

        @c("operation")
        @k
        private final OperationType operationType;

        @c("value")
        @l
        private final GeoModificationValue value;

        @c("valueId")
        @k
        private final String valueId;

        /* compiled from: GeoModification.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/GeoModification$Operation$GeoModificationValue;", "", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/extended/common/GeoCoordinates;", "entrance", "", "comment", "workSchedule", "", "Lcom/avito/android/remote/model/extended/common/GeoSchedule;", "(Lcom/avito/android/remote/model/extended/common/GeoCoordinates;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getComment", "()Ljava/lang/String;", "getCoordinates", "()Lcom/avito/android/remote/model/extended/common/GeoCoordinates;", "getEntrance", "getWorkSchedule", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class GeoModificationValue {

            @c("comment")
            @l
            private final String comment;

            @c(ServiceTransportationWidget.LocationField.COORDINATES)
            @k
            private final GeoCoordinates coordinates;

            @c("entrance")
            @l
            private final String entrance;

            @c("workSchedule")
            @l
            private final List<GeoSchedule> workSchedule;

            public GeoModificationValue(@k GeoCoordinates geoCoordinates, @l String str, @l String str2, @l List<GeoSchedule> list) {
                this.coordinates = geoCoordinates;
                this.entrance = str;
                this.comment = str2;
                this.workSchedule = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GeoModificationValue copy$default(GeoModificationValue geoModificationValue, GeoCoordinates geoCoordinates, String str, String str2, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    geoCoordinates = geoModificationValue.coordinates;
                }
                if ((i12 & 2) != 0) {
                    str = geoModificationValue.entrance;
                }
                if ((i12 & 4) != 0) {
                    str2 = geoModificationValue.comment;
                }
                if ((i12 & 8) != 0) {
                    list = geoModificationValue.workSchedule;
                }
                return geoModificationValue.copy(geoCoordinates, str, str2, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final GeoCoordinates getCoordinates() {
                return this.coordinates;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final String getEntrance() {
                return this.entrance;
            }

            @l
            /* renamed from: component3, reason: from getter */
            public final String getComment() {
                return this.comment;
            }

            @l
            public final List<GeoSchedule> component4() {
                return this.workSchedule;
            }

            @k
            public final GeoModificationValue copy(@k GeoCoordinates coordinates, @l String entrance, @l String comment, @l List<GeoSchedule> workSchedule) {
                return new GeoModificationValue(coordinates, entrance, comment, workSchedule);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GeoModificationValue)) {
                    return false;
                }
                GeoModificationValue geoModificationValue = (GeoModificationValue) other;
                return L.f(this.coordinates, geoModificationValue.coordinates) && L.f(this.entrance, geoModificationValue.entrance) && L.f(this.comment, geoModificationValue.comment) && L.f(this.workSchedule, geoModificationValue.workSchedule);
            }

            @l
            public final String getComment() {
                return this.comment;
            }

            @k
            public final GeoCoordinates getCoordinates() {
                return this.coordinates;
            }

            @l
            public final String getEntrance() {
                return this.entrance;
            }

            @l
            public final List<GeoSchedule> getWorkSchedule() {
                return this.workSchedule;
            }

            public int hashCode() {
                int iHashCode = this.coordinates.hashCode() * 31;
                String str = this.entrance;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.comment;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                List<GeoSchedule> list = this.workSchedule;
                return iHashCode3 + (list != null ? list.hashCode() : 0);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("GeoModificationValue(coordinates=");
                sb2.append(this.coordinates);
                sb2.append(", entrance=");
                sb2.append(this.entrance);
                sb2.append(", comment=");
                sb2.append(this.comment);
                sb2.append(", workSchedule=");
                return H.p(sb2, this.workSchedule, ')');
            }
        }

        public Operation(@k String str, @k OperationType operationType, @l GeoModificationValue geoModificationValue) {
            this.valueId = str;
            this.operationType = operationType;
            this.value = geoModificationValue;
        }

        public static /* synthetic */ Operation copy$default(Operation operation, String str, OperationType operationType, GeoModificationValue geoModificationValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = operation.valueId;
            }
            if ((i12 & 2) != 0) {
                operationType = operation.operationType;
            }
            if ((i12 & 4) != 0) {
                geoModificationValue = operation.value;
            }
            return operation.copy(str, operationType, geoModificationValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final GeoModificationValue getValue() {
            return this.value;
        }

        @k
        public final Operation copy(@k String valueId, @k OperationType operationType, @l GeoModificationValue value) {
            return new Operation(valueId, operationType, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) other;
            return L.f(this.valueId, operation.valueId) && this.operationType == operation.operationType && L.f(this.value, operation.value);
        }

        @k
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @l
        public final GeoModificationValue getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            int iHashCode = (this.operationType.hashCode() + (this.valueId.hashCode() * 31)) * 31;
            GeoModificationValue geoModificationValue = this.value;
            return iHashCode + (geoModificationValue == null ? 0 : geoModificationValue.hashCode());
        }

        @k
        public String toString() {
            return "Operation(valueId=" + this.valueId + ", operationType=" + this.operationType + ", value=" + this.value + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GeoModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/GeoModification$OperationType;", "", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OperationType[] $VALUES;

        @c("add")
        public static final OperationType ADD = new OperationType("ADD", 0);

        @c("update")
        public static final OperationType UPDATE = new OperationType("UPDATE", 1);

        private static final /* synthetic */ OperationType[] $values() {
            return new OperationType[]{ADD, UPDATE};
        }

        static {
            OperationType[] operationTypeArr$values = $values();
            $VALUES = operationTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(operationTypeArr$values);
        }

        private OperationType(String str, int i12) {
        }

        @k
        public static a<OperationType> getEntries() {
            return $ENTRIES;
        }

        public static OperationType valueOf(String str) {
            return (OperationType) Enum.valueOf(OperationType.class, str);
        }

        public static OperationType[] values() {
            return (OperationType[]) $VALUES.clone();
        }
    }

    public GeoModification(@k String str, @k List<Operation> list) {
        this.name = str;
        this.operations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeoModification copy$default(GeoModification geoModification, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoModification.name;
        }
        if ((i12 & 2) != 0) {
            list = geoModification.operations;
        }
        return geoModification.copy(str, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final List<Operation> component2() {
        return this.operations;
    }

    @k
    public final GeoModification copy(@k String name, @k List<Operation> operations) {
        return new GeoModification(name, operations);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoModification)) {
            return false;
        }
        GeoModification geoModification = (GeoModification) other;
        return L.f(this.name, geoModification.name) && L.f(this.operations, geoModification.operations);
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final List<Operation> getOperations() {
        return this.operations;
    }

    public int hashCode() {
        return this.operations.hashCode() + (this.name.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GeoModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        return H.p(sb2, this.operations, ')');
    }
}
