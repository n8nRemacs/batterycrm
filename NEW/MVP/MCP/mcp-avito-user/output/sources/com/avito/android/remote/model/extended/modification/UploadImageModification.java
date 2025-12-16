package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UploadImageModification.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UploadImageModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation;", "valuesOrder", "Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OrderItem;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "getValuesOrder", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "OrderItem", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UploadImageModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    @c("valuesOrder")
    @l
    private final List<OrderItem> valuesOrder;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UploadImageModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OperationType;", "", "(Ljava/lang/String;I)V", "ADD", "REMOVE", "UPDATE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OperationType[] $VALUES;

        @c("add")
        public static final OperationType ADD = new OperationType("ADD", 0);

        @c("remove")
        public static final OperationType REMOVE = new OperationType("REMOVE", 1);

        @c("update")
        public static final OperationType UPDATE = new OperationType("UPDATE", 2);

        private static final /* synthetic */ OperationType[] $values() {
            return new OperationType[]{ADD, REMOVE, UPDATE};
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

    /* compiled from: UploadImageModification.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OrderItem;", "", "valueId", "", "(Ljava/lang/String;)V", "getValueId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OrderItem {

        @c("valueId")
        @k
        private final String valueId;

        public OrderItem(@k String str) {
            this.valueId = str;
        }

        public static /* synthetic */ OrderItem copy$default(OrderItem orderItem, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = orderItem.valueId;
            }
            return orderItem.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        public final OrderItem copy(@k String valueId) {
            return new OrderItem(valueId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OrderItem) && L.f(this.valueId, ((OrderItem) other).valueId);
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            return this.valueId.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("OrderItem(valueId="), this.valueId, ')');
        }
    }

    public UploadImageModification(@k String str, @k List<Operation> list, @l List<OrderItem> list2) {
        this.name = str;
        this.operations = list;
        this.valuesOrder = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadImageModification copy$default(UploadImageModification uploadImageModification, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = uploadImageModification.name;
        }
        if ((i12 & 2) != 0) {
            list = uploadImageModification.operations;
        }
        if ((i12 & 4) != 0) {
            list2 = uploadImageModification.valuesOrder;
        }
        return uploadImageModification.copy(str, list, list2);
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

    @l
    public final List<OrderItem> component3() {
        return this.valuesOrder;
    }

    @k
    public final UploadImageModification copy(@k String name, @k List<Operation> operations, @l List<OrderItem> valuesOrder) {
        return new UploadImageModification(name, operations, valuesOrder);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadImageModification)) {
            return false;
        }
        UploadImageModification uploadImageModification = (UploadImageModification) other;
        return L.f(this.name, uploadImageModification.name) && L.f(this.operations, uploadImageModification.operations) && L.f(this.valuesOrder, uploadImageModification.valuesOrder);
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final List<Operation> getOperations() {
        return this.operations;
    }

    @l
    public final List<OrderItem> getValuesOrder() {
        return this.valuesOrder;
    }

    public int hashCode() {
        int iE2 = H.e(this.name.hashCode() * 31, 31, this.operations);
        List<OrderItem> list = this.valuesOrder;
        return iE2 + (list == null ? 0 : list.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UploadImageModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        sb2.append(this.operations);
        sb2.append(", valuesOrder=");
        return H.p(sb2, this.valuesOrder, ')');
    }

    /* compiled from: UploadImageModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation;", "", "valueId", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OperationType;", "value", "Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation$Value;", "status", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OperationType;Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation$Value;Ljava/lang/String;)V", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/UploadImageModification$OperationType;", "getStatus", "()Ljava/lang/String;", "getValue", "()Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation$Value;", "getValueId", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Value", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Operation {

        @c("operation")
        @k
        private final OperationType operationType;

        @c("status")
        @l
        private final String status;

        @c("value")
        @l
        private final Value value;

        @c("valueId")
        @k
        private final String valueId;

        /* compiled from: UploadImageModification.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UploadImageModification$Operation$Value;", "", "imageId", "", "(J)V", "getImageId", "()J", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Value {

            @c("imageId")
            private final long imageId;

            public Value(long j12) {
                this.imageId = j12;
            }

            public static /* synthetic */ Value copy$default(Value value, long j12, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = value.imageId;
                }
                return value.copy(j12);
            }

            /* renamed from: component1, reason: from getter */
            public final long getImageId() {
                return this.imageId;
            }

            @k
            public final Value copy(long imageId) {
                return new Value(imageId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Value) && this.imageId == ((Value) other).imageId;
            }

            public final long getImageId() {
                return this.imageId;
            }

            public int hashCode() {
                return Long.hashCode(this.imageId);
            }

            @k
            public String toString() {
                return r.u(new StringBuilder("Value(imageId="), this.imageId, ')');
            }
        }

        public Operation(@k String str, @k OperationType operationType, @l Value value, @l String str2) {
            this.valueId = str;
            this.operationType = operationType;
            this.value = value;
            this.status = str2;
        }

        public static /* synthetic */ Operation copy$default(Operation operation, String str, OperationType operationType, Value value, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = operation.valueId;
            }
            if ((i12 & 2) != 0) {
                operationType = operation.operationType;
            }
            if ((i12 & 4) != 0) {
                value = operation.value;
            }
            if ((i12 & 8) != 0) {
                str2 = operation.status;
            }
            return operation.copy(str, operationType, value, str2);
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
        public final Value getValue() {
            return this.value;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        @k
        public final Operation copy(@k String valueId, @k OperationType operationType, @l Value value, @l String status) {
            return new Operation(valueId, operationType, value, status);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) other;
            return L.f(this.valueId, operation.valueId) && this.operationType == operation.operationType && L.f(this.value, operation.value) && L.f(this.status, operation.status);
        }

        @k
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @l
        public final String getStatus() {
            return this.status;
        }

        @l
        public final Value getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            int iHashCode = (this.operationType.hashCode() + (this.valueId.hashCode() * 31)) * 31;
            Value value = this.value;
            int iHashCode2 = (iHashCode + (value == null ? 0 : value.hashCode())) * 31;
            String str = this.status;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Operation(valueId=");
            sb2.append(this.valueId);
            sb2.append(", operationType=");
            sb2.append(this.operationType);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", status=");
            return C22026a.c(sb2, this.status, ')');
        }

        public /* synthetic */ Operation(String str, OperationType operationType, Value value, String str2, int i12, C42822w c42822w) {
            this(str, operationType, value, (i12 & 8) != 0 ? null : str2);
        }
    }

    public /* synthetic */ UploadImageModification(String str, List list, List list2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : list2);
    }
}
