package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;", "Landroid/os/Parcelable;", "", "query", "", "value", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/avito/android/remote/model/ShowOnlyActiveFavoritesSwitchInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getQuery", "Z", "getValue", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ShowOnlyActiveFavoritesSwitchInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ShowOnlyActiveFavoritesSwitchInfo> CREATOR = new Creator();

    @c("queryParam")
    @k
    private final String query;

    @c("value")
    private final boolean value;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ShowOnlyActiveFavoritesSwitchInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShowOnlyActiveFavoritesSwitchInfo createFromParcel(@k Parcel parcel) {
            return new ShowOnlyActiveFavoritesSwitchInfo(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ShowOnlyActiveFavoritesSwitchInfo[] newArray(int i12) {
            return new ShowOnlyActiveFavoritesSwitchInfo[i12];
        }
    }

    public ShowOnlyActiveFavoritesSwitchInfo(@k String str, boolean z12) {
        this.query = str;
        this.value = z12;
    }

    public static /* synthetic */ ShowOnlyActiveFavoritesSwitchInfo copy$default(ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo, String str, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = showOnlyActiveFavoritesSwitchInfo.query;
        }
        if ((i12 & 2) != 0) {
            z12 = showOnlyActiveFavoritesSwitchInfo.value;
        }
        return showOnlyActiveFavoritesSwitchInfo.copy(str, z12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    @k
    public final ShowOnlyActiveFavoritesSwitchInfo copy(@k String query, boolean value) {
        return new ShowOnlyActiveFavoritesSwitchInfo(query, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowOnlyActiveFavoritesSwitchInfo)) {
            return false;
        }
        ShowOnlyActiveFavoritesSwitchInfo showOnlyActiveFavoritesSwitchInfo = (ShowOnlyActiveFavoritesSwitchInfo) other;
        return L.f(this.query, showOnlyActiveFavoritesSwitchInfo.query) && this.value == showOnlyActiveFavoritesSwitchInfo.value;
    }

    @k
    public final String getQuery() {
        return this.query;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value) + (this.query.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShowOnlyActiveFavoritesSwitchInfo(query=");
        sb2.append(this.query);
        sb2.append(", value=");
        return r.x(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.query);
        parcel.writeInt(this.value ? 1 : 0);
    }
}
