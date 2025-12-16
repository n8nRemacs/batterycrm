package com.avito.android.remote.model.basic;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: BasicSettingsWidget.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/basic/Field;", "", "title", "", "suggest", "status", "Lcom/avito/android/remote/model/basic/Field$FieldStatus;", "editableInfo", "Lcom/avito/android/remote/model/basic/Field$EditableInfo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/basic/Field$FieldStatus;Lcom/avito/android/remote/model/basic/Field$EditableInfo;)V", "getEditableInfo", "()Lcom/avito/android/remote/model/basic/Field$EditableInfo;", "getStatus", "()Lcom/avito/android/remote/model/basic/Field$FieldStatus;", "getSuggest", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "EditableInfo", "FieldStatus", "Reason", "StatusType", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Field {

    @c("editable")
    @l
    private final EditableInfo editableInfo;

    @c("status")
    @l
    private final FieldStatus status;

    @c("suggest")
    @l
    private final String suggest;

    @c("title")
    @k
    private final String title;

    /* compiled from: BasicSettingsWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/model/basic/Field$EditableInfo;", "", "fieldName", "", "(Ljava/lang/String;)V", "getFieldName", "()Ljava/lang/String;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EditableInfo {

        @c("fieldName")
        @k
        private final String fieldName;

        public EditableInfo(@k String str) {
            this.fieldName = str;
        }

        public static /* synthetic */ EditableInfo copy$default(EditableInfo editableInfo, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = editableInfo.fieldName;
            }
            return editableInfo.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getFieldName() {
            return this.fieldName;
        }

        @k
        public final EditableInfo copy(@k String fieldName) {
            return new EditableInfo(fieldName);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditableInfo) && L.f(this.fieldName, ((EditableInfo) other).fieldName);
        }

        @k
        public final String getFieldName() {
            return this.fieldName;
        }

        public int hashCode() {
            return this.fieldName.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("EditableInfo(fieldName="), this.fieldName, ')');
        }
    }

    /* compiled from: BasicSettingsWidget.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JK\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/basic/Field$FieldStatus;", "", "type", "Lcom/avito/android/remote/model/basic/Field$StatusType;", "value", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", ChannelContext.Item.PLACEHOLDER, "rejectReasons", "", "Lcom/avito/android/remote/model/basic/Field$Reason;", "(Lcom/avito/android/remote/model/basic/Field$StatusType;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/util/List;)V", "getPlaceholder", "()Ljava/lang/String;", "getRejectReasons", "()Ljava/util/List;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getType", "()Lcom/avito/android/remote/model/basic/Field$StatusType;", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldStatus {

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("rejectReasons")
        @l
        private final List<Reason> rejectReasons;

        @c("subtitle")
        @l
        private final AttributedText subtitle;

        @c("type")
        @l
        private final StatusType type;

        @c("value")
        @l
        private final String value;

        public FieldStatus(@l StatusType statusType, @l String str, @l AttributedText attributedText, @l String str2, @l List<Reason> list) {
            this.type = statusType;
            this.value = str;
            this.subtitle = attributedText;
            this.placeholder = str2;
            this.rejectReasons = list;
        }

        public static /* synthetic */ FieldStatus copy$default(FieldStatus fieldStatus, StatusType statusType, String str, AttributedText attributedText, String str2, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                statusType = fieldStatus.type;
            }
            if ((i12 & 2) != 0) {
                str = fieldStatus.value;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                attributedText = fieldStatus.subtitle;
            }
            AttributedText attributedText2 = attributedText;
            if ((i12 & 8) != 0) {
                str2 = fieldStatus.placeholder;
            }
            String str4 = str2;
            if ((i12 & 16) != 0) {
                list = fieldStatus.rejectReasons;
            }
            return fieldStatus.copy(statusType, str3, attributedText2, str4, list);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final StatusType getType() {
            return this.type;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final List<Reason> component5() {
            return this.rejectReasons;
        }

        @k
        public final FieldStatus copy(@l StatusType type, @l String value, @l AttributedText subtitle, @l String placeholder, @l List<Reason> rejectReasons) {
            return new FieldStatus(type, value, subtitle, placeholder, rejectReasons);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldStatus)) {
                return false;
            }
            FieldStatus fieldStatus = (FieldStatus) other;
            return this.type == fieldStatus.type && L.f(this.value, fieldStatus.value) && L.f(this.subtitle, fieldStatus.subtitle) && L.f(this.placeholder, fieldStatus.placeholder) && L.f(this.rejectReasons, fieldStatus.rejectReasons);
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final List<Reason> getRejectReasons() {
            return this.rejectReasons;
        }

        @l
        public final AttributedText getSubtitle() {
            return this.subtitle;
        }

        @l
        public final StatusType getType() {
            return this.type;
        }

        @l
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            StatusType statusType = this.type;
            int iHashCode = (statusType == null ? 0 : statusType.hashCode()) * 31;
            String str = this.value;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.subtitle;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str2 = this.placeholder;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            List<Reason> list = this.rejectReasons;
            return iHashCode4 + (list != null ? list.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FieldStatus(type=");
            sb2.append(this.type);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", rejectReasons=");
            return H.p(sb2, this.rejectReasons, ')');
        }
    }

    /* compiled from: BasicSettingsWidget.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/basic/Field$Reason;", "", "name", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reason {

        @c("name")
        @k
        private final String name;

        @c("text")
        @k
        private final String text;

        public Reason(@k String str, @k String str2) {
            this.name = str;
            this.text = str2;
        }

        public static /* synthetic */ Reason copy$default(Reason reason, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = reason.name;
            }
            if ((i12 & 2) != 0) {
                str2 = reason.text;
            }
            return reason.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final Reason copy(@k String name, @k String text) {
            return new Reason(name, text);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) other;
            return L.f(this.name, reason.name) && L.f(this.text, reason.text);
        }

        @k
        public final String getName() {
            return this.name;
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode() + (this.name.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Reason(name=");
            sb2.append(this.name);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BasicSettingsWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/basic/Field$StatusType;", "", "(Ljava/lang/String;I)V", "WAITING", "ERROR", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StatusType[] $VALUES;

        @c("waiting")
        public static final StatusType WAITING = new StatusType("WAITING", 0);

        @c("error")
        public static final StatusType ERROR = new StatusType("ERROR", 1);

        private static final /* synthetic */ StatusType[] $values() {
            return new StatusType[]{WAITING, ERROR};
        }

        static {
            StatusType[] statusTypeArr$values = $values();
            $VALUES = statusTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(statusTypeArr$values);
        }

        private StatusType(String str, int i12) {
        }

        @k
        public static a<StatusType> getEntries() {
            return $ENTRIES;
        }

        public static StatusType valueOf(String str) {
            return (StatusType) Enum.valueOf(StatusType.class, str);
        }

        public static StatusType[] values() {
            return (StatusType[]) $VALUES.clone();
        }
    }

    public Field(@k String str, @l String str2, @l FieldStatus fieldStatus, @l EditableInfo editableInfo) {
        this.title = str;
        this.suggest = str2;
        this.status = fieldStatus;
        this.editableInfo = editableInfo;
    }

    public static /* synthetic */ Field copy$default(Field field, String str, String str2, FieldStatus fieldStatus, EditableInfo editableInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = field.title;
        }
        if ((i12 & 2) != 0) {
            str2 = field.suggest;
        }
        if ((i12 & 4) != 0) {
            fieldStatus = field.status;
        }
        if ((i12 & 8) != 0) {
            editableInfo = field.editableInfo;
        }
        return field.copy(str, str2, fieldStatus, editableInfo);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSuggest() {
        return this.suggest;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final FieldStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final EditableInfo getEditableInfo() {
        return this.editableInfo;
    }

    @k
    public final Field copy(@k String title, @l String suggest, @l FieldStatus status, @l EditableInfo editableInfo) {
        return new Field(title, suggest, status, editableInfo);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Field)) {
            return false;
        }
        Field field = (Field) other;
        return L.f(this.title, field.title) && L.f(this.suggest, field.suggest) && L.f(this.status, field.status) && L.f(this.editableInfo, field.editableInfo);
    }

    @l
    public final EditableInfo getEditableInfo() {
        return this.editableInfo;
    }

    @l
    public final FieldStatus getStatus() {
        return this.status;
    }

    @l
    public final String getSuggest() {
        return this.suggest;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.suggest;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FieldStatus fieldStatus = this.status;
        int iHashCode3 = (iHashCode2 + (fieldStatus == null ? 0 : fieldStatus.hashCode())) * 31;
        EditableInfo editableInfo = this.editableInfo;
        return iHashCode3 + (editableInfo != null ? editableInfo.hashCode() : 0);
    }

    @k
    public String toString() {
        return "Field(title=" + this.title + ", suggest=" + this.suggest + ", status=" + this.status + ", editableInfo=" + this.editableInfo + ')';
    }
}
