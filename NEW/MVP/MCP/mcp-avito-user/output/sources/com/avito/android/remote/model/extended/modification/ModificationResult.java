package com.avito.android.remote.model.extended.modification;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.FieldModerationStatus;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModificationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult;", "", "IncorrectValues", "Ok", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues;", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface ModificationResult {

    /* compiled from: ModificationResult.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues;", "Lcom/avito/android/remote/model/extended/modification/ModificationResult;", "errors", "", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues$FieldError;", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "FieldError", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectValues implements ModificationResult {

        @c("errors")
        @k
        private final List<FieldError> errors;

        /* compiled from: ModificationResult.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult$IncorrectValues$FieldError;", "", "fieldName", "", "valueId", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "getMessage", "getValueId", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class FieldError {

            @c("fieldName")
            @k
            private final String fieldName;

            @c("message")
            @k
            private final String message;

            @c("valueId")
            @k
            private final String valueId;

            public FieldError(@k String str, @k String str2, @k String str3) {
                this.fieldName = str;
                this.valueId = str2;
                this.message = str3;
            }

            public static /* synthetic */ FieldError copy$default(FieldError fieldError, String str, String str2, String str3, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = fieldError.fieldName;
                }
                if ((i12 & 2) != 0) {
                    str2 = fieldError.valueId;
                }
                if ((i12 & 4) != 0) {
                    str3 = fieldError.message;
                }
                return fieldError.copy(str, str2, str3);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getFieldName() {
                return this.fieldName;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getValueId() {
                return this.valueId;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            @k
            public final FieldError copy(@k String fieldName, @k String valueId, @k String message) {
                return new FieldError(fieldName, valueId, message);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FieldError)) {
                    return false;
                }
                FieldError fieldError = (FieldError) other;
                return L.f(this.fieldName, fieldError.fieldName) && L.f(this.valueId, fieldError.valueId) && L.f(this.message, fieldError.message);
            }

            @k
            public final String getFieldName() {
                return this.fieldName;
            }

            @k
            public final String getMessage() {
                return this.message;
            }

            @k
            public final String getValueId() {
                return this.valueId;
            }

            public int hashCode() {
                return this.message.hashCode() + H.d(this.fieldName.hashCode() * 31, 31, this.valueId);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("FieldError(fieldName=");
                sb2.append(this.fieldName);
                sb2.append(", valueId=");
                sb2.append(this.valueId);
                sb2.append(", message=");
                return C22026a.c(sb2, this.message, ')');
            }
        }

        public IncorrectValues(@k List<FieldError> list) {
            this.errors = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ IncorrectValues copy$default(IncorrectValues incorrectValues, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = incorrectValues.errors;
            }
            return incorrectValues.copy(list);
        }

        @k
        public final List<FieldError> component1() {
            return this.errors;
        }

        @k
        public final IncorrectValues copy(@k List<FieldError> errors) {
            return new IncorrectValues(errors);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IncorrectValues) && L.f(this.errors, ((IncorrectValues) other).errors);
        }

        @k
        public final List<FieldError> getErrors() {
            return this.errors;
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("IncorrectValues(errors="), this.errors, ')');
        }
    }

    /* compiled from: ModificationResult.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok;", "Lcom/avito/android/remote/model/extended/modification/ModificationResult;", LocalPublishState.FIELDS, "", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok$Field;", "(Ljava/util/List;)V", "getFields", "()Ljava/util/List;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "Field", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ok implements ModificationResult {

        @c(LocalPublishState.FIELDS)
        @k
        private final List<Field> fields;

        /* compiled from: ModificationResult.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok$Field;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok$Field$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Field {

            @c("name")
            @k
            private final String name;

            @c("values")
            @l
            private final List<FieldValue> values;

            /* compiled from: ModificationResult.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/extended/modification/ModificationResult$Ok$Field$FieldValue;", "", "valueId", "", "moderationStatus", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getModerationStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class FieldValue {

                @c("status")
                @l
                private final FieldModerationStatus moderationStatus;

                @c("valueId")
                @k
                private final String valueId;

                public FieldValue(@k String str, @l FieldModerationStatus fieldModerationStatus) {
                    this.valueId = str;
                    this.moderationStatus = fieldModerationStatus;
                }

                public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = fieldValue.valueId;
                    }
                    if ((i12 & 2) != 0) {
                        fieldModerationStatus = fieldValue.moderationStatus;
                    }
                    return fieldValue.copy(str, fieldModerationStatus);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getValueId() {
                    return this.valueId;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final FieldModerationStatus getModerationStatus() {
                    return this.moderationStatus;
                }

                @k
                public final FieldValue copy(@k String valueId, @l FieldModerationStatus moderationStatus) {
                    return new FieldValue(valueId, moderationStatus);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof FieldValue)) {
                        return false;
                    }
                    FieldValue fieldValue = (FieldValue) other;
                    return L.f(this.valueId, fieldValue.valueId) && L.f(this.moderationStatus, fieldValue.moderationStatus);
                }

                @l
                public final FieldModerationStatus getModerationStatus() {
                    return this.moderationStatus;
                }

                @k
                public final String getValueId() {
                    return this.valueId;
                }

                public int hashCode() {
                    int iHashCode = this.valueId.hashCode() * 31;
                    FieldModerationStatus fieldModerationStatus = this.moderationStatus;
                    return iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode());
                }

                @k
                public String toString() {
                    return "FieldValue(valueId=" + this.valueId + ", moderationStatus=" + this.moderationStatus + ')';
                }
            }

            public Field(@k String str, @l List<FieldValue> list) {
                this.name = str;
                this.values = list;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Field copy$default(Field field, String str, List list, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = field.name;
                }
                if ((i12 & 2) != 0) {
                    list = field.values;
                }
                return field.copy(str, list);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getName() {
                return this.name;
            }

            @l
            public final List<FieldValue> component2() {
                return this.values;
            }

            @k
            public final Field copy(@k String name, @l List<FieldValue> values) {
                return new Field(name, values);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Field)) {
                    return false;
                }
                Field field = (Field) other;
                return L.f(this.name, field.name) && L.f(this.values, field.values);
            }

            @k
            public final String getName() {
                return this.name;
            }

            @l
            public final List<FieldValue> getValues() {
                return this.values;
            }

            public int hashCode() {
                int iHashCode = this.name.hashCode() * 31;
                List<FieldValue> list = this.values;
                return iHashCode + (list == null ? 0 : list.hashCode());
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("Field(name=");
                sb2.append(this.name);
                sb2.append(", values=");
                return H.p(sb2, this.values, ')');
            }
        }

        public Ok(@k List<Field> list) {
            this.fields = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Ok copy$default(Ok ok2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = ok2.fields;
            }
            return ok2.copy(list);
        }

        @k
        public final List<Field> component1() {
            return this.fields;
        }

        @k
        public final Ok copy(@k List<Field> fields) {
            return new Ok(fields);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Ok) && L.f(this.fields, ((Ok) other).fields);
        }

        @k
        public final List<Field> getFields() {
            return this.fields;
        }

        public int hashCode() {
            return this.fields.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("Ok(fields="), this.fields, ')');
        }
    }
}
