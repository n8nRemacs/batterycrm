package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: Widgets.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/PhoneEditValue;", "", "phoneId", "", "formattedPhone", "", "status", "Lcom/avito/android/remote/model/extended/PhoneEditValue$Status;", "(ILjava/lang/String;Lcom/avito/android/remote/model/extended/PhoneEditValue$Status;)V", "getFormattedPhone", "()Ljava/lang/String;", "getPhoneId", "()I", "getStatus", "()Lcom/avito/android/remote/model/extended/PhoneEditValue$Status;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "Status", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PhoneEditValue {

    @c("formattedPhone")
    @k
    private final String formattedPhone;

    @c("phoneId")
    private final int phoneId;

    @c("verificationStatus")
    @k
    private final Status status;

    /* compiled from: Widgets.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/PhoneEditValue$Status;", "", "description", "", "type", "Lcom/avito/android/remote/model/extended/PhoneEditValue$Status$Type;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/PhoneEditValue$Status$Type;)V", "getDescription", "()Ljava/lang/String;", "getType", "()Lcom/avito/android/remote/model/extended/PhoneEditValue$Status$Type;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "Type", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Status {

        @c("description")
        @k
        private final String description;

        @c("name")
        @k
        private final Type type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Widgets.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/PhoneEditValue$Status$Type;", "", "(Ljava/lang/String;I)V", "CONFIRMED", "PENDING", "NOT_CONFIRMED", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;

            @c("confirmed")
            public static final Type CONFIRMED = new Type("CONFIRMED", 0);

            @c("pending")
            public static final Type PENDING = new Type("PENDING", 1);

            @c("notConfirmed")
            public static final Type NOT_CONFIRMED = new Type("NOT_CONFIRMED", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{CONFIRMED, PENDING, NOT_CONFIRMED};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = kotlin.enums.c.a(typeArr$values);
            }

            private Type(String str, int i12) {
            }

            @k
            public static a<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public Status(@k String str, @k Type type) {
            this.description = str;
            this.type = type;
        }

        public static /* synthetic */ Status copy$default(Status status, String str, Type type, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = status.description;
            }
            if ((i12 & 2) != 0) {
                type = status.type;
            }
            return status.copy(str, type);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @k
        public final Status copy(@k String description, @k Type type) {
            return new Status(description, type);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Status)) {
                return false;
            }
            Status status = (Status) other;
            return L.f(this.description, status.description) && this.type == status.type;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.description.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Status(description=" + this.description + ", type=" + this.type + ')';
        }
    }

    public PhoneEditValue(int i12, @k String str, @k Status status) {
        this.phoneId = i12;
        this.formattedPhone = str;
        this.status = status;
    }

    public static /* synthetic */ PhoneEditValue copy$default(PhoneEditValue phoneEditValue, int i12, String str, Status status, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = phoneEditValue.phoneId;
        }
        if ((i13 & 2) != 0) {
            str = phoneEditValue.formattedPhone;
        }
        if ((i13 & 4) != 0) {
            status = phoneEditValue.status;
        }
        return phoneEditValue.copy(i12, str, status);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPhoneId() {
        return this.phoneId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getFormattedPhone() {
        return this.formattedPhone;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @k
    public final PhoneEditValue copy(int phoneId, @k String formattedPhone, @k Status status) {
        return new PhoneEditValue(phoneId, formattedPhone, status);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneEditValue)) {
            return false;
        }
        PhoneEditValue phoneEditValue = (PhoneEditValue) other;
        return this.phoneId == phoneEditValue.phoneId && L.f(this.formattedPhone, phoneEditValue.formattedPhone) && L.f(this.status, phoneEditValue.status);
    }

    @k
    public final String getFormattedPhone() {
        return this.formattedPhone;
    }

    public final int getPhoneId() {
        return this.phoneId;
    }

    @k
    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return this.status.hashCode() + H.d(Integer.hashCode(this.phoneId) * 31, 31, this.formattedPhone);
    }

    @k
    public String toString() {
        return "PhoneEditValue(phoneId=" + this.phoneId + ", formattedPhone=" + this.formattedPhone + ", status=" + this.status + ')';
    }
}
