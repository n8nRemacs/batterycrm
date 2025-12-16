package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/Review;", "Landroid/os/Parcelable;", "", "title", "description", "Landroid/net/Uri;", "avatar", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/net/Uri;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)Lcom/avito/android/remote/model/advert_details/realty/Review;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getDescription", "Landroid/net/Uri;", "getAvatar", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Review implements Parcelable {

    @k
    public static final Parcelable.Creator<Review> CREATOR = new Creator();

    @c("avatar")
    @k
    private final Uri avatar;

    @c("description")
    @k
    private final String description;

    @c("name")
    @k
    private final String name;

    @c("title")
    @k
    private final String title;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Review> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Review createFromParcel(@k Parcel parcel) {
            return new Review(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(Review.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Review[] newArray(int i12) {
            return new Review[i12];
        }
    }

    public Review(@k String str, @k String str2, @k Uri uri, @k String str3) {
        this.title = str;
        this.description = str2;
        this.avatar = uri;
        this.name = str3;
    }

    public static /* synthetic */ Review copy$default(Review review, String str, String str2, Uri uri, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = review.title;
        }
        if ((i12 & 2) != 0) {
            str2 = review.description;
        }
        if ((i12 & 4) != 0) {
            uri = review.avatar;
        }
        if ((i12 & 8) != 0) {
            str3 = review.name;
        }
        return review.copy(str, str2, uri, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Uri getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    public final Review copy(@k String title, @k String description, @k Uri avatar, @k String name) {
        return new Review(title, description, avatar, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Review)) {
            return false;
        }
        Review review = (Review) other;
        return L.f(this.title, review.title) && L.f(this.description, review.description) && L.f(this.avatar, review.avatar) && L.f(this.name, review.name);
    }

    @k
    public final Uri getAvatar() {
        return this.avatar;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.name.hashCode() + m.e(this.avatar, H.d(this.title.hashCode() * 31, 31, this.description), 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Review(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", name=");
        return C22026a.c(sb2, this.name, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.name);
    }
}
