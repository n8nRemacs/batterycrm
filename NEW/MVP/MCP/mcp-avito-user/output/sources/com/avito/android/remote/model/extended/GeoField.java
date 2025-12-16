package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoWidgets.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoField;", "", "name", "", "values", "", "Lcom/avito/android/remote/model/extended/GeoField$FieldValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "FieldValue", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoField {

    @c("name")
    @k
    private final String name;

    @c("values")
    @l
    private final List<FieldValue> values;

    /* compiled from: GeoWidgets.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoField$FieldValue;", "", "valueId", "", "value", "Lcom/avito/android/remote/model/extended/GeoFieldValue;", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/GeoFieldValue;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Lcom/avito/android/remote/model/extended/GeoFieldValue;", "getValueId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldValue {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @k
        private final GeoFieldValue value;

        @c("valueId")
        @k
        private final String valueId;

        public FieldValue(@k String str, @k GeoFieldValue geoFieldValue, @l FieldModerationStatus fieldModerationStatus) {
            this.valueId = str;
            this.value = geoFieldValue;
            this.status = fieldModerationStatus;
        }

        public static /* synthetic */ FieldValue copy$default(FieldValue fieldValue, String str, GeoFieldValue geoFieldValue, FieldModerationStatus fieldModerationStatus, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = fieldValue.valueId;
            }
            if ((i12 & 2) != 0) {
                geoFieldValue = fieldValue.value;
            }
            if ((i12 & 4) != 0) {
                fieldModerationStatus = fieldValue.status;
            }
            return fieldValue.copy(str, geoFieldValue, fieldModerationStatus);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getValueId() {
            return this.valueId;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final GeoFieldValue getValue() {
            return this.value;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final FieldValue copy(@k String valueId, @k GeoFieldValue value, @l FieldModerationStatus status) {
            return new FieldValue(valueId, value, status);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldValue)) {
                return false;
            }
            FieldValue fieldValue = (FieldValue) other;
            return L.f(this.valueId, fieldValue.valueId) && L.f(this.value, fieldValue.value) && L.f(this.status, fieldValue.status);
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final GeoFieldValue getValue() {
            return this.value;
        }

        @k
        public final String getValueId() {
            return this.valueId;
        }

        public int hashCode() {
            int iHashCode = (this.value.hashCode() + (this.valueId.hashCode() * 31)) * 31;
            FieldModerationStatus fieldModerationStatus = this.status;
            return iHashCode + (fieldModerationStatus == null ? 0 : fieldModerationStatus.hashCode());
        }

        @k
        public String toString() {
            return "FieldValue(valueId=" + this.valueId + ", value=" + this.value + ", status=" + this.status + ')';
        }
    }

    public GeoField(@k String str, @l List<FieldValue> list) {
        this.name = str;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GeoField copy$default(GeoField geoField, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoField.name;
        }
        if ((i12 & 2) != 0) {
            list = geoField.values;
        }
        return geoField.copy(str, list);
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
    public final GeoField copy(@k String name, @l List<FieldValue> values) {
        return new GeoField(name, values);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoField)) {
            return false;
        }
        GeoField geoField = (GeoField) other;
        return L.f(this.name, geoField.name) && L.f(this.values, geoField.values);
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
        StringBuilder sb2 = new StringBuilder("GeoField(name=");
        sb2.append(this.name);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }
}
