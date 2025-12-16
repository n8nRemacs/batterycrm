package com.avito.android.remote.cv_state;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/cv_state/CvStateType;", "Landroid/os/Parcelable;", "", "id", "slug", "updatedAt", "title", "subtitleOnChange", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getSlug", "d", "getTitle", "c", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CvStateType implements Parcelable {

    @k
    public static final Parcelable.Creator<CvStateType> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("slug")
    @k
    private final String slug;

    @c("subtitleOnChange")
    @l
    private final String subtitleOnChange;

    @c("title")
    @l
    private final String title;

    @c("updatedAt")
    @l
    private final String updatedAt;

    /* compiled from: CvState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvStateType> {
        @Override // android.os.Parcelable.Creator
        public final CvStateType createFromParcel(Parcel parcel) {
            return new CvStateType(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CvStateType[] newArray(int i12) {
            return new CvStateType[i12];
        }
    }

    public CvStateType(@k String str, @k String str2, @l String str3, @l String str4, @l String str5) {
        this.id = str;
        this.slug = str2;
        this.updatedAt = str3;
        this.title = str4;
        this.subtitleOnChange = str5;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getSubtitleOnChange() {
        return this.subtitleOnChange;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvStateType)) {
            return false;
        }
        CvStateType cvStateType = (CvStateType) obj;
        return L.f(this.id, cvStateType.id) && L.f(this.slug, cvStateType.slug) && L.f(this.updatedAt, cvStateType.updatedAt) && L.f(this.title, cvStateType.title) && L.f(this.subtitleOnChange, cvStateType.subtitleOnChange);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @k
    public final String getSlug() {
        return this.slug;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.slug);
        String str = this.updatedAt;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subtitleOnChange;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvStateType(id=");
        sb2.append(this.id);
        sb2.append(", slug=");
        sb2.append(this.slug);
        sb2.append(", updatedAt=");
        sb2.append(this.updatedAt);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitleOnChange=");
        return C22026a.c(sb2, this.subtitleOnChange, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.slug);
        parcel.writeString(this.updatedAt);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitleOnChange);
    }
}
