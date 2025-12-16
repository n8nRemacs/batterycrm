package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.extended.common.GeoCoordinates;
import com.avito.android.remote.model.extended.common.GeoSchedule;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GeoWidgets.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003Ja\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoFieldValue;", "", "formattedAddress", "", "rawAddress", "entrance", ServiceTransportationWidget.LocationField.COORDINATES, "Lcom/avito/android/remote/model/extended/common/GeoCoordinates;", "workSchedule", "", "Lcom/avito/android/remote/model/extended/common/GeoSchedule;", "phone", "Lcom/avito/android/remote/model/extended/GeoFieldValue$StringField;", "comment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/extended/common/GeoCoordinates;Ljava/util/List;Lcom/avito/android/remote/model/extended/GeoFieldValue$StringField;Lcom/avito/android/remote/model/extended/GeoFieldValue$StringField;)V", "getComment", "()Lcom/avito/android/remote/model/extended/GeoFieldValue$StringField;", "getCoordinates", "()Lcom/avito/android/remote/model/extended/common/GeoCoordinates;", "getEntrance", "()Ljava/lang/String;", "getFormattedAddress", "getPhone", "getRawAddress", "getWorkSchedule", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "StringField", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GeoFieldValue {

    @c("comment")
    @l
    private final StringField comment;

    @c(ServiceTransportationWidget.LocationField.COORDINATES)
    @k
    private final GeoCoordinates coordinates;

    @c("entrance")
    @l
    private final String entrance;

    @c("formattedAddress")
    @l
    private final String formattedAddress;

    @c("phone")
    @l
    private final StringField phone;

    @c("rawAddress")
    @l
    private final String rawAddress;

    @c("workSchedule")
    @l
    private final List<GeoSchedule> workSchedule;

    /* compiled from: GeoWidgets.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/extended/GeoFieldValue$StringField;", "", "value", "", "status", "Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "(Ljava/lang/String;Lcom/avito/android/remote/model/extended/FieldModerationStatus;)V", "getStatus", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "getValue", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StringField {

        @c("status")
        @l
        private final FieldModerationStatus status;

        @c("value")
        @k
        private final String value;

        public StringField(@k String str, @l FieldModerationStatus fieldModerationStatus) {
            this.value = str;
            this.status = fieldModerationStatus;
        }

        @l
        public final FieldModerationStatus getStatus() {
            return this.status;
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    public GeoFieldValue(@l String str, @l String str2, @l String str3, @k GeoCoordinates geoCoordinates, @l List<GeoSchedule> list, @l StringField stringField, @l StringField stringField2) {
        this.formattedAddress = str;
        this.rawAddress = str2;
        this.entrance = str3;
        this.coordinates = geoCoordinates;
        this.workSchedule = list;
        this.phone = stringField;
        this.comment = stringField2;
    }

    public static /* synthetic */ GeoFieldValue copy$default(GeoFieldValue geoFieldValue, String str, String str2, String str3, GeoCoordinates geoCoordinates, List list, StringField stringField, StringField stringField2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = geoFieldValue.formattedAddress;
        }
        if ((i12 & 2) != 0) {
            str2 = geoFieldValue.rawAddress;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = geoFieldValue.entrance;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            geoCoordinates = geoFieldValue.coordinates;
        }
        GeoCoordinates geoCoordinates2 = geoCoordinates;
        if ((i12 & 16) != 0) {
            list = geoFieldValue.workSchedule;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            stringField = geoFieldValue.phone;
        }
        StringField stringField3 = stringField;
        if ((i12 & 64) != 0) {
            stringField2 = geoFieldValue.comment;
        }
        return geoFieldValue.copy(str, str4, str5, geoCoordinates2, list2, stringField3, stringField2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getRawAddress() {
        return this.rawAddress;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getEntrance() {
        return this.entrance;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final GeoCoordinates getCoordinates() {
        return this.coordinates;
    }

    @l
    public final List<GeoSchedule> component5() {
        return this.workSchedule;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final StringField getPhone() {
        return this.phone;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final StringField getComment() {
        return this.comment;
    }

    @k
    public final GeoFieldValue copy(@l String formattedAddress, @l String rawAddress, @l String entrance, @k GeoCoordinates coordinates, @l List<GeoSchedule> workSchedule, @l StringField phone, @l StringField comment) {
        return new GeoFieldValue(formattedAddress, rawAddress, entrance, coordinates, workSchedule, phone, comment);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeoFieldValue)) {
            return false;
        }
        GeoFieldValue geoFieldValue = (GeoFieldValue) other;
        return L.f(this.formattedAddress, geoFieldValue.formattedAddress) && L.f(this.rawAddress, geoFieldValue.rawAddress) && L.f(this.entrance, geoFieldValue.entrance) && L.f(this.coordinates, geoFieldValue.coordinates) && L.f(this.workSchedule, geoFieldValue.workSchedule) && L.f(this.phone, geoFieldValue.phone) && L.f(this.comment, geoFieldValue.comment);
    }

    @l
    public final StringField getComment() {
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
    public final String getFormattedAddress() {
        return this.formattedAddress;
    }

    @l
    public final StringField getPhone() {
        return this.phone;
    }

    @l
    public final String getRawAddress() {
        return this.rawAddress;
    }

    @l
    public final List<GeoSchedule> getWorkSchedule() {
        return this.workSchedule;
    }

    public int hashCode() {
        String str = this.formattedAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rawAddress;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.entrance;
        int iHashCode3 = (this.coordinates.hashCode() + ((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        List<GeoSchedule> list = this.workSchedule;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        StringField stringField = this.phone;
        int iHashCode5 = (iHashCode4 + (stringField == null ? 0 : stringField.hashCode())) * 31;
        StringField stringField2 = this.comment;
        return iHashCode5 + (stringField2 != null ? stringField2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "GeoFieldValue(formattedAddress=" + this.formattedAddress + ", rawAddress=" + this.rawAddress + ", entrance=" + this.entrance + ", coordinates=" + this.coordinates + ", workSchedule=" + this.workSchedule + ", phone=" + this.phone + ", comment=" + this.comment + ')';
    }
}
