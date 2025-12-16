package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DisplayingOptions.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b'\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/ClearanceValue;", "Landroid/os/Parcelable;", "", InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "", "title", "buttonTitle", "description", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/ClearanceValue;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getTo", "getFrom", "Ljava/lang/String;", "getTitle", "getButtonTitle", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ClearanceValue implements Parcelable {

    @k
    public static final Parcelable.Creator<ClearanceValue> CREATOR = new Creator();

    @c("buttonTitle")
    @k
    private final String buttonTitle;

    @c("description")
    @k
    private final String description;

    @c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
    private final int from;

    @c("title")
    @k
    private final String title;

    @c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
    private final int to;

    /* compiled from: DisplayingOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClearanceValue> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ClearanceValue createFromParcel(@k Parcel parcel) {
            return new ClearanceValue(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ClearanceValue[] newArray(int i12) {
            return new ClearanceValue[i12];
        }
    }

    public ClearanceValue(int i12, int i13, @k String str, @k String str2, @k String str3) {
        this.to = i12;
        this.from = i13;
        this.title = str;
        this.buttonTitle = str2;
        this.description = str3;
    }

    public static /* synthetic */ ClearanceValue copy$default(ClearanceValue clearanceValue, int i12, int i13, String str, String str2, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i12 = clearanceValue.to;
        }
        if ((i14 & 2) != 0) {
            i13 = clearanceValue.from;
        }
        int i15 = i13;
        if ((i14 & 4) != 0) {
            str = clearanceValue.title;
        }
        String str4 = str;
        if ((i14 & 8) != 0) {
            str2 = clearanceValue.buttonTitle;
        }
        String str5 = str2;
        if ((i14 & 16) != 0) {
            str3 = clearanceValue.description;
        }
        return clearanceValue.copy(i12, i15, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTo() {
        return this.to;
    }

    /* renamed from: component2, reason: from getter */
    public final int getFrom() {
        return this.from;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final ClearanceValue copy(int to2, int from, @k String title, @k String buttonTitle, @k String description) {
        return new ClearanceValue(to2, from, title, buttonTitle, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClearanceValue)) {
            return false;
        }
        ClearanceValue clearanceValue = (ClearanceValue) other;
        return this.to == clearanceValue.to && this.from == clearanceValue.from && L.f(this.title, clearanceValue.title) && L.f(this.buttonTitle, clearanceValue.buttonTitle) && L.f(this.description, clearanceValue.description);
    }

    @k
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public final int getFrom() {
        return this.from;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.description.hashCode() + H.d(H.d(r.e(this.from, Integer.hashCode(this.to) * 31, 31), 31, this.title), 31, this.buttonTitle);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ClearanceValue(to=");
        sb2.append(this.to);
        sb2.append(", from=");
        sb2.append(this.from);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", buttonTitle=");
        sb2.append(this.buttonTitle);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.to);
        parcel.writeInt(this.from);
        parcel.writeString(this.title);
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.description);
    }
}
