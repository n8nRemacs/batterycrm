package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DisplayingOptions.kt */
@d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "Landroid/os/Parcelable;", "", "hideDialogSearch", "hideDialogHeader", "", "dialogTitle", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getHideDialogSearch", "getHideDialogHeader", "Ljava/lang/String;", "getDialogTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DialogDisplaying implements Parcelable {

    @k
    public static final Parcelable.Creator<DialogDisplaying> CREATOR = new Creator();

    @c("title")
    @l
    private final String dialogTitle;

    @c("hideHeader")
    @l
    private final Boolean hideDialogHeader;

    @c("hideSearch")
    @l
    private final Boolean hideDialogSearch;

    /* compiled from: DisplayingOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DialogDisplaying> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DialogDisplaying createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DialogDisplaying(boolValueOf, boolValueOf2, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DialogDisplaying[] newArray(int i12) {
            return new DialogDisplaying[i12];
        }
    }

    public DialogDisplaying() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DialogDisplaying copy$default(DialogDisplaying dialogDisplaying, Boolean bool, Boolean bool2, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = dialogDisplaying.hideDialogSearch;
        }
        if ((i12 & 2) != 0) {
            bool2 = dialogDisplaying.hideDialogHeader;
        }
        if ((i12 & 4) != 0) {
            str = dialogDisplaying.dialogTitle;
        }
        return dialogDisplaying.copy(bool, bool2, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getHideDialogSearch() {
        return this.hideDialogSearch;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getHideDialogHeader() {
        return this.hideDialogHeader;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @k
    public final DialogDisplaying copy(@l Boolean hideDialogSearch, @l Boolean hideDialogHeader, @l String dialogTitle) {
        return new DialogDisplaying(hideDialogSearch, hideDialogHeader, dialogTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogDisplaying)) {
            return false;
        }
        DialogDisplaying dialogDisplaying = (DialogDisplaying) other;
        return L.f(this.hideDialogSearch, dialogDisplaying.hideDialogSearch) && L.f(this.hideDialogHeader, dialogDisplaying.hideDialogHeader) && L.f(this.dialogTitle, dialogDisplaying.dialogTitle);
    }

    @l
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @l
    public final Boolean getHideDialogHeader() {
        return this.hideDialogHeader;
    }

    @l
    public final Boolean getHideDialogSearch() {
        return this.hideDialogSearch;
    }

    public int hashCode() {
        Boolean bool = this.hideDialogSearch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.hideDialogHeader;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.dialogTitle;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DialogDisplaying(hideDialogSearch=");
        sb2.append(this.hideDialogSearch);
        sb2.append(", hideDialogHeader=");
        sb2.append(this.hideDialogHeader);
        sb2.append(", dialogTitle=");
        return C22026a.c(sb2, this.dialogTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.hideDialogSearch;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.hideDialogHeader;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.dialogTitle);
    }

    public DialogDisplaying(@l Boolean bool, @l Boolean bool2, @l String str) {
        this.hideDialogSearch = bool;
        this.hideDialogHeader = bool2;
        this.dialogTitle = str;
    }

    public /* synthetic */ DialogDisplaying(Boolean bool, Boolean bool2, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : bool, (i12 & 2) != 0 ? null : bool2, (i12 & 4) != 0 ? null : str);
    }
}
