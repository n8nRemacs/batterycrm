package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: CarouselModification.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/CarouselModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CarouselModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    /* compiled from: CarouselModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation;", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/CarouselModification$OperationType;", "valueId", "", "carouselValue", "Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation$CarouselModifyValue;", "(Lcom/avito/android/remote/model/extended/modification/CarouselModification$OperationType;Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation$CarouselModifyValue;)V", "getCarouselValue", "()Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation$CarouselModifyValue;", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/CarouselModification$OperationType;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "CarouselModifyValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Operation {

        @c("value")
        @k
        private final CarouselModifyValue carouselValue;

        @c("operation")
        @k
        private final OperationType operationType;

        @c("valueId")
        @k
        private final String valueId;

        /* compiled from: CarouselModification.kt */
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/CarouselModification$Operation$CarouselModifyValue;", "", "nameId", "", "itemIds", "", "", "enabled", "", "(ILjava/util/List;Z)V", "getEnabled", "()Z", "getItemIds", "()Ljava/util/List;", "getNameId", "()I", "component1", "component2", "component3", "copy", "equals", PluralsKeys.OTHER, "hashCode", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class CarouselModifyValue {

            @c("enabled")
            private final boolean enabled;

            @c("itemIds")
            @k
            private final List<Long> itemIds;

            @c("nameId")
            private final int nameId;

            public CarouselModifyValue(int i12, @k List<Long> list, boolean z12) {
                this.nameId = i12;
                this.itemIds = list;
                this.enabled = z12;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CarouselModifyValue copy$default(CarouselModifyValue carouselModifyValue, int i12, List list, boolean z12, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    i12 = carouselModifyValue.nameId;
                }
                if ((i13 & 2) != 0) {
                    list = carouselModifyValue.itemIds;
                }
                if ((i13 & 4) != 0) {
                    z12 = carouselModifyValue.enabled;
                }
                return carouselModifyValue.copy(i12, list, z12);
            }

            /* renamed from: component1, reason: from getter */
            public final int getNameId() {
                return this.nameId;
            }

            @k
            public final List<Long> component2() {
                return this.itemIds;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            @k
            public final CarouselModifyValue copy(int nameId, @k List<Long> itemIds, boolean enabled) {
                return new CarouselModifyValue(nameId, itemIds, enabled);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CarouselModifyValue)) {
                    return false;
                }
                CarouselModifyValue carouselModifyValue = (CarouselModifyValue) other;
                return this.nameId == carouselModifyValue.nameId && L.f(this.itemIds, carouselModifyValue.itemIds) && this.enabled == carouselModifyValue.enabled;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }

            @k
            public final List<Long> getItemIds() {
                return this.itemIds;
            }

            public final int getNameId() {
                return this.nameId;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled) + H.e(Integer.hashCode(this.nameId) * 31, 31, this.itemIds);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("CarouselModifyValue(nameId=");
                sb2.append(this.nameId);
                sb2.append(", itemIds=");
                sb2.append(this.itemIds);
                sb2.append(", enabled=");
                return r.x(sb2, this.enabled, ')');
            }
        }

        public Operation(@k OperationType operationType, @k String str, @k CarouselModifyValue carouselModifyValue) {
            this.operationType = operationType;
            this.valueId = str;
            this.carouselValue = carouselModifyValue;
        }

        public static /* synthetic */ Operation copy$default(Operation operation, OperationType operationType, String str, CarouselModifyValue carouselModifyValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                operationType = operation.operationType;
            }
            if ((i12 & 2) != 0) {
                str = operation.valueId;
            }
            if ((i12 & 4) != 0) {
                carouselModifyValue = operation.carouselValue;
            }
            return operation.copy(operationType, str, carouselModifyValue);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final CarouselModifyValue getCarouselValue() {
            return this.carouselValue;
        }

        @k
        public final Operation copy(@k OperationType operationType, @k String valueId, @k CarouselModifyValue carouselValue) {
            return new Operation(operationType, valueId, carouselValue);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) other;
            return this.operationType == operation.operationType && L.f(this.valueId, operation.valueId) && L.f(this.carouselValue, operation.carouselValue);
        }

        @k
        public final CarouselModifyValue getCarouselValue() {
            return this.carouselValue;
        }

        @k
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            return this.carouselValue.hashCode() + H.d(this.operationType.hashCode() * 31, 31, this.valueId);
        }

        @k
        public String toString() {
            return "Operation(operationType=" + this.operationType + ", valueId=" + this.valueId + ", carouselValue=" + this.carouselValue + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CarouselModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/CarouselModification$OperationType;", "", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public CarouselModification(@k String str, @k List<Operation> list) {
        this.name = str;
        this.operations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarouselModification copy$default(CarouselModification carouselModification, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = carouselModification.name;
        }
        if ((i12 & 2) != 0) {
            list = carouselModification.operations;
        }
        return carouselModification.copy(str, list);
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
    public final CarouselModification copy(@k String name, @k List<Operation> operations) {
        return new CarouselModification(name, operations);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarouselModification)) {
            return false;
        }
        CarouselModification carouselModification = (CarouselModification) other;
        return L.f(this.name, carouselModification.name) && L.f(this.operations, carouselModification.operations);
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
        StringBuilder sb2 = new StringBuilder("CarouselModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        return H.p(sb2, this.operations, ')');
    }
}
