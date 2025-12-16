package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UniversalWidgetModification.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Operation;", "valuesOrder", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OrderItem;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "getValuesOrder", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "OrderItem", "Value", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UniversalWidgetModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    @c("valuesOrder")
    @l
    private final List<OrderItem> valuesOrder;

    /* compiled from: UniversalWidgetModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Operation;", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OperationType;", "valueId", "", "value", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Value;", "(Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OperationType;Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Value;)V", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OperationType;", "getValue", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Value;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Operation {

        @c("operation")
        @k
        private final OperationType operationType;

        @c("value")
        @l
        private final Value value;

        @c("valueId")
        @k
        private final String valueId;

        public Operation(@k OperationType operationType, @k String str, @l Value value) {
            this.operationType = operationType;
            this.valueId = str;
            this.value = value;
        }

        public static /* synthetic */ Operation copy$default(Operation operation, OperationType operationType, String str, Value value, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                operationType = operation.operationType;
            }
            if ((i12 & 2) != 0) {
                str = operation.valueId;
            }
            if ((i12 & 4) != 0) {
                value = operation.value;
            }
            return operation.copy(operationType, str, value);
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

        @l
        /* renamed from: component3, reason: from getter */
        public final Value getValue() {
            return this.value;
        }

        @k
        public final Operation copy(@k OperationType operationType, @k String valueId, @l Value value) {
            return new Operation(operationType, valueId, value);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) other;
            return this.operationType == operation.operationType && L.f(this.valueId, operation.valueId) && L.f(this.value, operation.value);
        }

        @k
        public final OperationType getOperationType() {
            return this.operationType;
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
            int iD2 = H.d(this.operationType.hashCode() * 31, 31, this.valueId);
            Value value = this.value;
            return iD2 + (value == null ? 0 : value.hashCode());
        }

        @k
        public String toString() {
            return "Operation(operationType=" + this.operationType + ", valueId=" + this.valueId + ", value=" + this.value + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalWidgetModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OperationType;", "", "(Ljava/lang/String;I)V", "UPDATE", "REMOVE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OperationType[] $VALUES;

        @c("update")
        public static final OperationType UPDATE = new OperationType("UPDATE", 0);

        @c("remove")
        public static final OperationType REMOVE = new OperationType("REMOVE", 1);

        private static final /* synthetic */ OperationType[] $values() {
            return new OperationType[]{UPDATE, REMOVE};
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

    /* compiled from: UniversalWidgetModification.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$OrderItem;", "", "valueId", "", "(Ljava/lang/String;)V", "getValueId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* compiled from: UniversalWidgetModification.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/UniversalWidgetModification$Value;", "", "factoid", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "text", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "imageWithText", "Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "(Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;)V", "getFactoid", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetFactoidModification;", "getImageWithText", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetImageWithTextModification;", "getText", "()Lcom/avito/android/remote/model/extended/modification/UniversalWidgetTextModification;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value {

        @l
        private final UniversalWidgetFactoidModification factoid;

        @l
        private final UniversalWidgetImageWithTextModification imageWithText;

        @l
        private final UniversalWidgetTextModification text;

        public Value(@l UniversalWidgetFactoidModification universalWidgetFactoidModification, @l UniversalWidgetTextModification universalWidgetTextModification, @l UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification) {
            this.factoid = universalWidgetFactoidModification;
            this.text = universalWidgetTextModification;
            this.imageWithText = universalWidgetImageWithTextModification;
        }

        public static /* synthetic */ Value copy$default(Value value, UniversalWidgetFactoidModification universalWidgetFactoidModification, UniversalWidgetTextModification universalWidgetTextModification, UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                universalWidgetFactoidModification = value.factoid;
            }
            if ((i12 & 2) != 0) {
                universalWidgetTextModification = value.text;
            }
            if ((i12 & 4) != 0) {
                universalWidgetImageWithTextModification = value.imageWithText;
            }
            return value.copy(universalWidgetFactoidModification, universalWidgetTextModification, universalWidgetImageWithTextModification);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final UniversalWidgetFactoidModification getFactoid() {
            return this.factoid;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final UniversalWidgetTextModification getText() {
            return this.text;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalWidgetImageWithTextModification getImageWithText() {
            return this.imageWithText;
        }

        @k
        public final Value copy(@l UniversalWidgetFactoidModification factoid, @l UniversalWidgetTextModification text, @l UniversalWidgetImageWithTextModification imageWithText) {
            return new Value(factoid, text, imageWithText);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.factoid, value.factoid) && L.f(this.text, value.text) && L.f(this.imageWithText, value.imageWithText);
        }

        @l
        public final UniversalWidgetFactoidModification getFactoid() {
            return this.factoid;
        }

        @l
        public final UniversalWidgetImageWithTextModification getImageWithText() {
            return this.imageWithText;
        }

        @l
        public final UniversalWidgetTextModification getText() {
            return this.text;
        }

        public int hashCode() {
            UniversalWidgetFactoidModification universalWidgetFactoidModification = this.factoid;
            int iHashCode = (universalWidgetFactoidModification == null ? 0 : universalWidgetFactoidModification.hashCode()) * 31;
            UniversalWidgetTextModification universalWidgetTextModification = this.text;
            int iHashCode2 = (iHashCode + (universalWidgetTextModification == null ? 0 : universalWidgetTextModification.hashCode())) * 31;
            UniversalWidgetImageWithTextModification universalWidgetImageWithTextModification = this.imageWithText;
            return iHashCode2 + (universalWidgetImageWithTextModification != null ? universalWidgetImageWithTextModification.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Value(factoid=" + this.factoid + ", text=" + this.text + ", imageWithText=" + this.imageWithText + ')';
        }
    }

    public UniversalWidgetModification(@k String str, @k List<Operation> list, @l List<OrderItem> list2) {
        this.name = str;
        this.operations = list;
        this.valuesOrder = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UniversalWidgetModification copy$default(UniversalWidgetModification universalWidgetModification, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = universalWidgetModification.name;
        }
        if ((i12 & 2) != 0) {
            list = universalWidgetModification.operations;
        }
        if ((i12 & 4) != 0) {
            list2 = universalWidgetModification.valuesOrder;
        }
        return universalWidgetModification.copy(str, list, list2);
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
    public final UniversalWidgetModification copy(@k String name, @k List<Operation> operations, @l List<OrderItem> valuesOrder) {
        return new UniversalWidgetModification(name, operations, valuesOrder);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UniversalWidgetModification)) {
            return false;
        }
        UniversalWidgetModification universalWidgetModification = (UniversalWidgetModification) other;
        return L.f(this.name, universalWidgetModification.name) && L.f(this.operations, universalWidgetModification.operations) && L.f(this.valuesOrder, universalWidgetModification.valuesOrder);
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
        StringBuilder sb2 = new StringBuilder("UniversalWidgetModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        sb2.append(this.operations);
        sb2.append(", valuesOrder=");
        return H.p(sb2, this.valuesOrder, ')');
    }

    public /* synthetic */ UniversalWidgetModification(String str, List list, List list2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : list2);
    }
}
