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

/* compiled from: AdvertVerification.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\n¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AdvertVerification;", "Landroid/os/Parcelable;", "", "title", "subtitle", "descriptionTitle", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/AdvertVerification;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "getDescriptionTitle", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertVerification implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertVerification> CREATOR = new Creator();

    @c("description")
    @k
    private final String description;

    @c("descriptionTitle")
    @k
    private final String descriptionTitle;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: AdvertVerification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertVerification> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertVerification createFromParcel(@k Parcel parcel) {
            return new AdvertVerification(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertVerification[] newArray(int i12) {
            return new AdvertVerification[i12];
        }
    }

    public AdvertVerification(@k String str, @l String str2, @k String str3, @k String str4) {
        this.title = str;
        this.subtitle = str2;
        this.descriptionTitle = str3;
        this.description = str4;
    }

    public static /* synthetic */ AdvertVerification copy$default(AdvertVerification advertVerification, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertVerification.title;
        }
        if ((i12 & 2) != 0) {
            str2 = advertVerification.subtitle;
        }
        if ((i12 & 4) != 0) {
            str3 = advertVerification.descriptionTitle;
        }
        if ((i12 & 8) != 0) {
            str4 = advertVerification.description;
        }
        return advertVerification.copy(str, str2, str3, str4);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getDescriptionTitle() {
        return this.descriptionTitle;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final AdvertVerification copy(@k String title, @l String subtitle, @k String descriptionTitle, @k String description) {
        return new AdvertVerification(title, subtitle, descriptionTitle, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertVerification)) {
            return false;
        }
        AdvertVerification advertVerification = (AdvertVerification) other;
        return L.f(this.title, advertVerification.title) && L.f(this.subtitle, advertVerification.subtitle) && L.f(this.descriptionTitle, advertVerification.descriptionTitle) && L.f(this.description, advertVerification.description);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getDescriptionTitle() {
        return this.descriptionTitle;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.description.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.descriptionTitle);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertVerification(title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", descriptionTitle=");
        sb2.append(this.descriptionTitle);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.descriptionTitle);
        parcel.writeString(this.description);
    }
}
