package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectionModification.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001a\u001b\u001c\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/SelectionModification$Operation;", "valuesOrder", "Lcom/avito/android/remote/model/extended/modification/SelectionModification$OrderItem;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "getValuesOrder", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "OrderItem", "Value", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SelectionModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    @c("valuesOrder")
    @l
    private final List<OrderItem> valuesOrder;

    /* compiled from: SelectionModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionModification$Operation;", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/SelectionModification$OperationType;", "valueId", "", "value", "Lcom/avito/android/remote/model/extended/modification/SelectionModification$Value;", "(Lcom/avito/android/remote/model/extended/modification/SelectionModification$OperationType;Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/SelectionModification$Value;)V", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/SelectionModification$OperationType;", "getValue", "()Lcom/avito/android/remote/model/extended/modification/SelectionModification$Value;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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
    /* compiled from: SelectionModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionModification$OperationType;", "", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "REMOVE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperationType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ OperationType[] $VALUES;

        @c("add")
        public static final OperationType ADD = new OperationType("ADD", 0);

        @c("update")
        public static final OperationType UPDATE = new OperationType("UPDATE", 1);

        @c("remove")
        public static final OperationType REMOVE = new OperationType("REMOVE", 2);

        private static final /* synthetic */ OperationType[] $values() {
            return new OperationType[]{ADD, UPDATE, REMOVE};
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

    /* compiled from: SelectionModification.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionModification$OrderItem;", "", "valueId", "", "(Ljava/lang/String;)V", "getValueId", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    /* compiled from: SelectionModification.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/SelectionModification$Value;", "", "itemListId", "", "title", "", "isPublished", "", "coverImageId", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)V", "getCoverImageId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getItemListId", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;)Lcom/avito/android/remote/model/extended/modification/SelectionModification$Value;", "equals", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Value {

        @c("coverImageId")
        @l
        private final Long coverImageId;

        @c("isPublished")
        @l
        private final Boolean isPublished;

        @c("itemListId")
        @l
        private final Long itemListId;

        @c("title")
        @l
        private final String title;

        public Value(@l Long l12, @l String str, @l Boolean bool, @l Long l13) {
            this.itemListId = l12;
            this.title = str;
            this.isPublished = bool;
            this.coverImageId = l13;
        }

        public static /* synthetic */ Value copy$default(Value value, Long l12, String str, Boolean bool, Long l13, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                l12 = value.itemListId;
            }
            if ((i12 & 2) != 0) {
                str = value.title;
            }
            if ((i12 & 4) != 0) {
                bool = value.isPublished;
            }
            if ((i12 & 8) != 0) {
                l13 = value.coverImageId;
            }
            return value.copy(l12, str, bool, l13);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Long getItemListId() {
            return this.itemListId;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final Boolean getIsPublished() {
            return this.isPublished;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final Long getCoverImageId() {
            return this.coverImageId;
        }

        @k
        public final Value copy(@l Long itemListId, @l String title, @l Boolean isPublished, @l Long coverImageId) {
            return new Value(itemListId, title, isPublished, coverImageId);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return L.f(this.itemListId, value.itemListId) && L.f(this.title, value.title) && L.f(this.isPublished, value.isPublished) && L.f(this.coverImageId, value.coverImageId);
        }

        @l
        public final Long getCoverImageId() {
            return this.coverImageId;
        }

        @l
        public final Long getItemListId() {
            return this.itemListId;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Long l12 = this.itemListId;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.isPublished;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Long l13 = this.coverImageId;
            return iHashCode3 + (l13 != null ? l13.hashCode() : 0);
        }

        @l
        public final Boolean isPublished() {
            return this.isPublished;
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Value(itemListId=");
            sb2.append(this.itemListId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", isPublished=");
            sb2.append(this.isPublished);
            sb2.append(", coverImageId=");
            return m.m(sb2, this.coverImageId, ')');
        }
    }

    public SelectionModification(@k String str, @k List<Operation> list, @l List<OrderItem> list2) {
        this.name = str;
        this.operations = list;
        this.valuesOrder = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectionModification copy$default(SelectionModification selectionModification, String str, List list, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = selectionModification.name;
        }
        if ((i12 & 2) != 0) {
            list = selectionModification.operations;
        }
        if ((i12 & 4) != 0) {
            list2 = selectionModification.valuesOrder;
        }
        return selectionModification.copy(str, list, list2);
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
    public final SelectionModification copy(@k String name, @k List<Operation> operations, @l List<OrderItem> valuesOrder) {
        return new SelectionModification(name, operations, valuesOrder);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionModification)) {
            return false;
        }
        SelectionModification selectionModification = (SelectionModification) other;
        return L.f(this.name, selectionModification.name) && L.f(this.operations, selectionModification.operations) && L.f(this.valuesOrder, selectionModification.valuesOrder);
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
        StringBuilder sb2 = new StringBuilder("SelectionModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        sb2.append(this.operations);
        sb2.append(", valuesOrder=");
        return H.p(sb2, this.valuesOrder, ')');
    }

    public /* synthetic */ SelectionModification(String str, List list, List list2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : list2);
    }
}
