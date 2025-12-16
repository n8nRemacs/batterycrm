package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u00016B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JT\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0015R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010\u0019¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/Author;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "avatar", "", "name", "description", "Lcom/avito/android/remote/model/Author$Rating;", "rating", "", "online", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Author$Rating;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/Author$Rating;", "component5", "()Z", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Author$Rating;ZLcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/Author;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Ljava/lang/String;", "getName", "getDescription", "Lcom/avito/android/remote/model/Author$Rating;", "getRating", "Z", "getOnline", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Rating", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class Author implements Parcelable {

    @k
    public static final Parcelable.Creator<Author> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("link")
    @l
    private final DeepLink deepLink;

    @c("description")
    @l
    private final String description;

    @c("name")
    @k
    private final String name;

    @c("online")
    private final boolean online;

    @c("rating")
    @l
    private final Rating rating;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Author> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Author createFromParcel(@k Parcel parcel) {
            return new Author((Image) parcel.readParcelable(Author.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Rating.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(Author.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final Author[] newArray(int i12) {
            return new Author[i12];
        }
    }

    /* compiled from: FavoriteItemsWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000f¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/Author$Rating;", "Landroid/os/Parcelable;", "", "score", "", "scoreFloat", "", "text", "<init>", "(ILjava/lang/Float;Ljava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/Float;", "component3", "()Ljava/lang/String;", "copy", "(ILjava/lang/Float;Ljava/lang/String;)Lcom/avito/android/remote/model/Author$Rating;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getScore", "Ljava/lang/Float;", "getScoreFloat", "Ljava/lang/String;", "getText", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Rating implements Parcelable {

        @k
        public static final Parcelable.Creator<Rating> CREATOR = new Creator();

        @c("score")
        private final int score;

        @c("scoreFloat")
        @l
        private final Float scoreFloat;

        @c("text")
        @l
        private final String text;

        /* compiled from: FavoriteItemsWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Rating> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Rating createFromParcel(@k Parcel parcel) {
                return new Rating(parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Rating[] newArray(int i12) {
                return new Rating[i12];
            }
        }

        public Rating(int i12, @l Float f12, @l String str) {
            this.score = i12;
            this.scoreFloat = f12;
            this.text = str;
        }

        public static /* synthetic */ Rating copy$default(Rating rating, int i12, Float f12, String str, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i12 = rating.score;
            }
            if ((i13 & 2) != 0) {
                f12 = rating.scoreFloat;
            }
            if ((i13 & 4) != 0) {
                str = rating.text;
            }
            return rating.copy(i12, f12, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getScore() {
            return this.score;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Float getScoreFloat() {
            return this.scoreFloat;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final Rating copy(int score, @l Float scoreFloat, @l String text) {
            return new Rating(score, scoreFloat, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Rating)) {
                return false;
            }
            Rating rating = (Rating) other;
            return this.score == rating.score && L.f(this.scoreFloat, rating.scoreFloat) && L.f(this.text, rating.text);
        }

        public final int getScore() {
            return this.score;
        }

        @l
        public final Float getScoreFloat() {
            return this.scoreFloat;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.score) * 31;
            Float f12 = this.scoreFloat;
            int iHashCode2 = (iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31;
            String str = this.text;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Rating(score=");
            sb2.append(this.score);
            sb2.append(", scoreFloat=");
            sb2.append(this.scoreFloat);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.score);
            Float f12 = this.scoreFloat;
            if (f12 == null) {
                parcel.writeInt(0);
            } else {
                a.B(parcel, 1, f12);
            }
            parcel.writeString(this.text);
        }
    }

    public Author(@l Image image, @k String str, @l String str2, @l Rating rating, boolean z12, @l DeepLink deepLink) {
        this.avatar = image;
        this.name = str;
        this.description = str2;
        this.rating = rating;
        this.online = z12;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ Author copy$default(Author author, Image image, String str, String str2, Rating rating, boolean z12, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            image = author.avatar;
        }
        if ((i12 & 2) != 0) {
            str = author.name;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = author.description;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            rating = author.rating;
        }
        Rating rating2 = rating;
        if ((i12 & 16) != 0) {
            z12 = author.online;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            deepLink = author.deepLink;
        }
        return author.copy(image, str3, str4, rating2, z13, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getOnline() {
        return this.online;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final Author copy(@l Image avatar, @k String name, @l String description, @l Rating rating, boolean online, @l DeepLink deepLink) {
        return new Author(avatar, name, description, rating, online, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Author)) {
            return false;
        }
        Author author = (Author) other;
        return L.f(this.avatar, author.avatar) && L.f(this.name, author.name) && L.f(this.description, author.description) && L.f(this.rating, author.rating) && this.online == author.online && L.f(this.deepLink, author.deepLink);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getName() {
        return this.name;
    }

    public final boolean getOnline() {
        return this.online;
    }

    @l
    public final Rating getRating() {
        return this.rating;
    }

    public int hashCode() {
        Image image = this.avatar;
        int iD2 = H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.name);
        String str = this.description;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Rating rating = this.rating;
        int i12 = r.i((iHashCode + (rating == null ? 0 : rating.hashCode())) * 31, 31, this.online);
        DeepLink deepLink = this.deepLink;
        return i12 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Author(avatar=");
        sb2.append(this.avatar);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", online=");
        sb2.append(this.online);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        Rating rating = this.rating;
        if (rating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rating.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.online ? 1 : 0);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
