package com.avito.android.remote.model.extended;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.L;

/* compiled from: FieldModerationStatus.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/avito/android/remote/model/extended/FieldModerationStatus;", "", "name", "Lcom/avito/android/remote/model/extended/FieldModerationStatus$StatusName;", "title", "", "subtitle", "Lcom/avito/android/remote/model/text/AttributedText;", "(Lcom/avito/android/remote/model/extended/FieldModerationStatus$StatusName;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "getName", "()Lcom/avito/android/remote/model/extended/FieldModerationStatus$StatusName;", "getSubtitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "StatusName", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FieldModerationStatus {

    @c("name")
    @k
    private final StatusName name;

    @c("subtitle")
    @l
    private final AttributedText subtitle;

    @c("title")
    @l
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FieldModerationStatus.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/extended/FieldModerationStatus$StatusName;", "", "rawValue", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "MODERATION_PENDING", "REJECTED", "RELEASED", "_avito-discouraged_avito-api_profile-management"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusName {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ StatusName[] $VALUES;

        @c("wait_of_moderation")
        public static final StatusName MODERATION_PENDING = new StatusName("MODERATION_PENDING", 0, "wait_of_moderation");

        @c("rejected")
        public static final StatusName REJECTED = new StatusName("REJECTED", 1, "rejected");

        @c("released")
        public static final StatusName RELEASED = new StatusName("RELEASED", 2, "released");

        @k
        private final String rawValue;

        private static final /* synthetic */ StatusName[] $values() {
            return new StatusName[]{MODERATION_PENDING, REJECTED, RELEASED};
        }

        static {
            StatusName[] statusNameArr$values = $values();
            $VALUES = statusNameArr$values;
            $ENTRIES = kotlin.enums.c.a(statusNameArr$values);
        }

        private StatusName(String str, int i12, String str2) {
            this.rawValue = str2;
        }

        @k
        public static a<StatusName> getEntries() {
            return $ENTRIES;
        }

        public static StatusName valueOf(String str) {
            return (StatusName) Enum.valueOf(StatusName.class, str);
        }

        public static StatusName[] values() {
            return (StatusName[]) $VALUES.clone();
        }

        @k
        public final String getRawValue() {
            return this.rawValue;
        }
    }

    public FieldModerationStatus(@k StatusName statusName, @l String str, @l AttributedText attributedText) {
        this.name = statusName;
        this.title = str;
        this.subtitle = attributedText;
    }

    public static /* synthetic */ FieldModerationStatus copy$default(FieldModerationStatus fieldModerationStatus, StatusName statusName, String str, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            statusName = fieldModerationStatus.name;
        }
        if ((i12 & 2) != 0) {
            str = fieldModerationStatus.title;
        }
        if ((i12 & 4) != 0) {
            attributedText = fieldModerationStatus.subtitle;
        }
        return fieldModerationStatus.copy(statusName, str, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final StatusName getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @k
    public final FieldModerationStatus copy(@k StatusName name, @l String title, @l AttributedText subtitle) {
        return new FieldModerationStatus(name, title, subtitle);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FieldModerationStatus)) {
            return false;
        }
        FieldModerationStatus fieldModerationStatus = (FieldModerationStatus) other;
        return this.name == fieldModerationStatus.name && L.f(this.title, fieldModerationStatus.title) && L.f(this.subtitle, fieldModerationStatus.subtitle);
    }

    @k
    public final StatusName getName() {
        return this.name;
    }

    @l
    public final AttributedText getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.subtitle;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FieldModerationStatus(name=");
        sb2.append(this.name);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        return com.avito.android.actions_sheet.a.w(sb2, this.subtitle, ')');
    }
}
