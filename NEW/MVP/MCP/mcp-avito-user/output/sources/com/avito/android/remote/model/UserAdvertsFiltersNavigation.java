package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersResult.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;", "Landroid/os/Parcelable;", "", "navButton", "title", "resetAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/UserAdvertsFiltersNavigation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNavButton", "getTitle", "getResetAction", "_avito-discouraged_avito-api_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserAdvertsFiltersNavigation implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersNavigation> CREATOR = new Creator();

    @c("navButton")
    @k
    private final String navButton;

    @c("resetAction")
    @l
    private final String resetAction;

    @c("title")
    @k
    private final String title;

    /* compiled from: UserAdvertsFiltersResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserAdvertsFiltersNavigation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFiltersNavigation createFromParcel(@k Parcel parcel) {
            return new UserAdvertsFiltersNavigation(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvertsFiltersNavigation[] newArray(int i12) {
            return new UserAdvertsFiltersNavigation[i12];
        }
    }

    public UserAdvertsFiltersNavigation(@k String str, @k String str2, @l String str3) {
        this.navButton = str;
        this.title = str2;
        this.resetAction = str3;
    }

    public static /* synthetic */ UserAdvertsFiltersNavigation copy$default(UserAdvertsFiltersNavigation userAdvertsFiltersNavigation, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = userAdvertsFiltersNavigation.navButton;
        }
        if ((i12 & 2) != 0) {
            str2 = userAdvertsFiltersNavigation.title;
        }
        if ((i12 & 4) != 0) {
            str3 = userAdvertsFiltersNavigation.resetAction;
        }
        return userAdvertsFiltersNavigation.copy(str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getNavButton() {
        return this.navButton;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getResetAction() {
        return this.resetAction;
    }

    @k
    public final UserAdvertsFiltersNavigation copy(@k String navButton, @k String title, @l String resetAction) {
        return new UserAdvertsFiltersNavigation(navButton, title, resetAction);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdvertsFiltersNavigation)) {
            return false;
        }
        UserAdvertsFiltersNavigation userAdvertsFiltersNavigation = (UserAdvertsFiltersNavigation) other;
        return L.f(this.navButton, userAdvertsFiltersNavigation.navButton) && L.f(this.title, userAdvertsFiltersNavigation.title) && L.f(this.resetAction, userAdvertsFiltersNavigation.resetAction);
    }

    @k
    public final String getNavButton() {
        return this.navButton;
    }

    @l
    public final String getResetAction() {
        return this.resetAction;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.navButton.hashCode() * 31, 31, this.title);
        String str = this.resetAction;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersNavigation(navButton=");
        sb2.append(this.navButton);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", resetAction=");
        return C22026a.c(sb2, this.resetAction, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.navButton);
        parcel.writeString(this.title);
        parcel.writeString(this.resetAction);
    }
}
