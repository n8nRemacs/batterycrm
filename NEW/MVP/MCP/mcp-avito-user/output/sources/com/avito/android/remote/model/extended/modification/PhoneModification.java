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

/* compiled from: PhoneModification.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/PhoneModification;", "Lcom/avito/android/remote/model/extended/modification/Modification;", "name", "", "operations", "", "Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getOperations", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "Operation", "OperationType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhoneModification implements Modification {

    @c("name")
    @k
    private final String name;

    @c("values")
    @k
    private final List<Operation> operations;

    /* compiled from: PhoneModification.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation;", "", "operationType", "Lcom/avito/android/remote/model/extended/modification/PhoneModification$OperationType;", "valueId", "", "phoneValue", "Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation$PhoneValue;", "(Lcom/avito/android/remote/model/extended/modification/PhoneModification$OperationType;Ljava/lang/String;Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation$PhoneValue;)V", "getOperationType", "()Lcom/avito/android/remote/model/extended/modification/PhoneModification$OperationType;", "getPhoneValue", "()Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation$PhoneValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "PhoneValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Operation {

        @c("operation")
        @k
        private final OperationType operationType;

        @c("value")
        @l
        private final PhoneValue phoneValue;

        @c("valueId")
        @k
        private final String valueId;

        /* compiled from: PhoneModification.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/PhoneModification$Operation$PhoneValue;", "", "phone", "", "(Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PhoneValue {

            @c("phone")
            @k
            private final String phone;

            public PhoneValue(@k String str) {
                this.phone = str;
            }

            public static /* synthetic */ PhoneValue copy$default(PhoneValue phoneValue, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = phoneValue.phone;
                }
                return phoneValue.copy(str);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getPhone() {
                return this.phone;
            }

            @k
            public final PhoneValue copy(@k String phone) {
                return new PhoneValue(phone);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PhoneValue) && L.f(this.phone, ((PhoneValue) other).phone);
            }

            @k
            public final String getPhone() {
                return this.phone;
            }

            public int hashCode() {
                return this.phone.hashCode();
            }

            @k
            public String toString() {
                return C22026a.c(new StringBuilder("PhoneValue(phone="), this.phone, ')');
            }
        }

        public Operation(@k OperationType operationType, @k String str, @l PhoneValue phoneValue) {
            this.operationType = operationType;
            this.valueId = str;
            this.phoneValue = phoneValue;
        }

        public static /* synthetic */ Operation copy$default(Operation operation, OperationType operationType, String str, PhoneValue phoneValue, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                operationType = operation.operationType;
            }
            if ((i12 & 2) != 0) {
                str = operation.valueId;
            }
            if ((i12 & 4) != 0) {
                phoneValue = operation.phoneValue;
            }
            return operation.copy(operationType, str, phoneValue);
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
        public final PhoneValue getPhoneValue() {
            return this.phoneValue;
        }

        @k
        public final Operation copy(@k OperationType operationType, @k String valueId, @l PhoneValue phoneValue) {
            return new Operation(operationType, valueId, phoneValue);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Operation)) {
                return false;
            }
            Operation operation = (Operation) other;
            return this.operationType == operation.operationType && L.f(this.valueId, operation.valueId) && L.f(this.phoneValue, operation.phoneValue);
        }

        @k
        public final OperationType getOperationType() {
            return this.operationType;
        }

        @l
        public final PhoneValue getPhoneValue() {
            return this.phoneValue;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            int iD2 = H.d(this.operationType.hashCode() * 31, 31, this.valueId);
            PhoneValue phoneValue = this.phoneValue;
            return iD2 + (phoneValue == null ? 0 : phoneValue.hashCode());
        }

        @k
        public String toString() {
            return "Operation(operationType=" + this.operationType + ", valueId=" + this.valueId + ", phoneValue=" + this.phoneValue + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PhoneModification.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/PhoneModification$OperationType;", "", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public PhoneModification(@k String str, @k List<Operation> list) {
        this.name = str;
        this.operations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneModification copy$default(PhoneModification phoneModification, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = phoneModification.name;
        }
        if ((i12 & 2) != 0) {
            list = phoneModification.operations;
        }
        return phoneModification.copy(str, list);
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
    public final PhoneModification copy(@k String name, @k List<Operation> operations) {
        return new PhoneModification(name, operations);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneModification)) {
            return false;
        }
        PhoneModification phoneModification = (PhoneModification) other;
        return L.f(this.name, phoneModification.name) && L.f(this.operations, phoneModification.operations);
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
        StringBuilder sb2 = new StringBuilder("PhoneModification(name=");
        sb2.append(this.name);
        sb2.append(", operations=");
        return H.p(sb2, this.operations, ')');
    }

    public /* synthetic */ PhoneModification(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "phones" : str, list);
    }
}
