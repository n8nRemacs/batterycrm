package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaPurchaseAction.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001%B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "Landroid/os/Parcelable;", "", "label", "subLabel", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;)Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "getSubLabel", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;", "getData", "Data", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AutotekaPurchaseAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaPurchaseAction> CREATOR = new Creator();

    @c("data")
    @k
    private final Data data;

    @c("text")
    @k
    private final String label;

    @c("hint")
    @l
    private final String subLabel;

    /* compiled from: AutotekaPurchaseAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AutotekaPurchaseAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaPurchaseAction createFromParcel(@k Parcel parcel) {
            return new AutotekaPurchaseAction(parcel.readString(), parcel.readString(), Data.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AutotekaPurchaseAction[] newArray(int i12) {
            return new AutotekaPurchaseAction[i12];
        }
    }

    /* compiled from: AutotekaPurchaseAction.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;", "Landroid/os/Parcelable;", "", "actionType", "searchKey", "reportPublicId", "Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;", "autotekaAnalytic", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;)Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction$Data;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getActionType", "getSearchKey", "getReportPublicId", "Lcom/avito/android/remote/model/autotekateaser/AutotekaAnalytic;", "getAutotekaAnalytic", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data implements Parcelable {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new Creator();

        @c("eventType")
        @k
        private final String actionType;

        @c("analytics")
        @k
        private final AutotekaAnalytic autotekaAnalytic;

        @c("reportPublicId")
        @l
        private final String reportPublicId;

        @c("searchKey")
        @l
        private final String searchKey;

        /* compiled from: AutotekaPurchaseAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Data> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Data createFromParcel(@k Parcel parcel) {
                return new Data(parcel.readString(), parcel.readString(), parcel.readString(), AutotekaAnalytic.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@k String str, @l String str2, @l String str3, @k AutotekaAnalytic autotekaAnalytic) {
            this.actionType = str;
            this.searchKey = str2;
            this.reportPublicId = str3;
            this.autotekaAnalytic = autotekaAnalytic;
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, AutotekaAnalytic autotekaAnalytic, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = data.actionType;
            }
            if ((i12 & 2) != 0) {
                str2 = data.searchKey;
            }
            if ((i12 & 4) != 0) {
                str3 = data.reportPublicId;
            }
            if ((i12 & 8) != 0) {
                autotekaAnalytic = data.autotekaAnalytic;
            }
            return data.copy(str, str2, str3, autotekaAnalytic);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getActionType() {
            return this.actionType;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSearchKey() {
            return this.searchKey;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getReportPublicId() {
            return this.reportPublicId;
        }

        @k
        /* renamed from: component4, reason: from getter */
        public final AutotekaAnalytic getAutotekaAnalytic() {
            return this.autotekaAnalytic;
        }

        @k
        public final Data copy(@k String actionType, @l String searchKey, @l String reportPublicId, @k AutotekaAnalytic autotekaAnalytic) {
            return new Data(actionType, searchKey, reportPublicId, autotekaAnalytic);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return L.f(this.actionType, data.actionType) && L.f(this.searchKey, data.searchKey) && L.f(this.reportPublicId, data.reportPublicId) && L.f(this.autotekaAnalytic, data.autotekaAnalytic);
        }

        @k
        public final String getActionType() {
            return this.actionType;
        }

        @k
        public final AutotekaAnalytic getAutotekaAnalytic() {
            return this.autotekaAnalytic;
        }

        @l
        public final String getReportPublicId() {
            return this.reportPublicId;
        }

        @l
        public final String getSearchKey() {
            return this.searchKey;
        }

        public int hashCode() {
            int iHashCode = this.actionType.hashCode() * 31;
            String str = this.searchKey;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.reportPublicId;
            return this.autotekaAnalytic.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            return "Data(actionType=" + this.actionType + ", searchKey=" + this.searchKey + ", reportPublicId=" + this.reportPublicId + ", autotekaAnalytic=" + this.autotekaAnalytic + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.actionType);
            parcel.writeString(this.searchKey);
            parcel.writeString(this.reportPublicId);
            this.autotekaAnalytic.writeToParcel(parcel, flags);
        }
    }

    public AutotekaPurchaseAction(@k String str, @l String str2, @k Data data) {
        this.label = str;
        this.subLabel = str2;
        this.data = data;
    }

    public static /* synthetic */ AutotekaPurchaseAction copy$default(AutotekaPurchaseAction autotekaPurchaseAction, String str, String str2, Data data, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autotekaPurchaseAction.label;
        }
        if ((i12 & 2) != 0) {
            str2 = autotekaPurchaseAction.subLabel;
        }
        if ((i12 & 4) != 0) {
            data = autotekaPurchaseAction.data;
        }
        return autotekaPurchaseAction.copy(str, str2, data);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @k
    public final AutotekaPurchaseAction copy(@k String label, @l String subLabel, @k Data data) {
        return new AutotekaPurchaseAction(label, subLabel, data);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AutotekaPurchaseAction)) {
            return false;
        }
        AutotekaPurchaseAction autotekaPurchaseAction = (AutotekaPurchaseAction) other;
        return L.f(this.label, autotekaPurchaseAction.label) && L.f(this.subLabel, autotekaPurchaseAction.subLabel) && L.f(this.data, autotekaPurchaseAction.data);
    }

    @k
    public final Data getData() {
        return this.data;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @l
    public final String getSubLabel() {
        return this.subLabel;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        String str = this.subLabel;
        return this.data.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "AutotekaPurchaseAction(label=" + this.label + ", subLabel=" + this.subLabel + ", data=" + this.data + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.label);
        parcel.writeString(this.subLabel);
        this.data.writeToParcel(parcel, flags);
    }
}
