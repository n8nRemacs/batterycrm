package com.avito.android.remote.model.messenger;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChannelDisplayInfo.kt */
@d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001=BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJn\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020!HÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020!HÖ\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b:\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b<\u0010\u001d¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/Image;", "avatar", "Lcom/avito/android/remote/model/Action;", "link", "status", ChannelContext.Item.USER_ID, "", "rating", "description", "Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;", "details", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "()Lcom/avito/android/remote/model/Action;", "component4", "component5", "component6", "()Ljava/lang/Float;", "component7", "component8", "()Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;)Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Lcom/avito/android/remote/model/Action;", "getLink", "getStatus", "getUserId", "Ljava/lang/Float;", "getRating", "getDescription", "Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;", "getDetails", "Details", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ChannelDisplayInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<ChannelDisplayInfo> CREATOR = new Creator();

    @c("avatar")
    @l
    private final Image avatar;

    @c("description")
    @l
    private final String description;

    @c("details")
    @l
    private final Details details;

    @c("link")
    @l
    private final Action link;

    @c("name")
    @k
    private final String name;

    @c("rating")
    @l
    private final Float rating;

    @c("status")
    @l
    private final String status;

    @c(ChannelContext.Item.USER_ID)
    @l
    private final String userId;

    /* compiled from: ChannelDisplayInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChannelDisplayInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelDisplayInfo createFromParcel(@k Parcel parcel) {
            return new ChannelDisplayInfo(parcel.readString(), (Image) parcel.readParcelable(ChannelDisplayInfo.class.getClassLoader()), (Action) parcel.readParcelable(ChannelDisplayInfo.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readString(), parcel.readInt() != 0 ? Details.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ChannelDisplayInfo[] newArray(int i12) {
            return new ChannelDisplayInfo[i12];
        }
    }

    /* compiled from: ChannelDisplayInfo.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/messenger/ChannelDisplayInfo$Details;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @k
        public static final Parcelable.Creator<Details> CREATOR = new Creator();

        @c("text")
        @l
        private final AttributedText text;

        @c("title")
        @l
        private final String title;

        /* compiled from: ChannelDisplayInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Details> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Details createFromParcel(@k Parcel parcel) {
                return new Details(parcel.readString(), (AttributedText) parcel.readParcelable(Details.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Details[] newArray(int i12) {
                return new Details[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Details() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Details copy$default(Details details, String str, AttributedText attributedText, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = details.title;
            }
            if ((i12 & 2) != 0) {
                attributedText = details.text;
            }
            return details.copy(str, attributedText);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @k
        public final Details copy(@l String title, @l AttributedText text) {
            return new Details(title, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return L.f(this.title, details.title) && L.f(this.text, details.text);
        }

        @l
        public final AttributedText getText() {
            return this.text;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            AttributedText attributedText = this.text;
            return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Details(title=");
            sb2.append(this.title);
            sb2.append(", text=");
            return a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.text, flags);
        }

        public Details(@l String str, @l AttributedText attributedText) {
            this.title = str;
            this.text = attributedText;
        }

        public /* synthetic */ Details(String str, AttributedText attributedText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : attributedText);
        }
    }

    public ChannelDisplayInfo(@k String str, @l Image image, @l Action action, @l String str2, @l String str3, @l Float f12, @l String str4, @l Details details) {
        this.name = str;
        this.avatar = image;
        this.link = action;
        this.status = str2;
        this.userId = str3;
        this.rating = f12;
        this.description = str4;
        this.details = details;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Action getLink() {
        return this.link;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Float getRating() {
        return this.rating;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Details getDetails() {
        return this.details;
    }

    @k
    public final ChannelDisplayInfo copy(@k String name, @l Image avatar, @l Action link, @l String status, @l String userId, @l Float rating, @l String description, @l Details details) {
        return new ChannelDisplayInfo(name, avatar, link, status, userId, rating, description, details);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelDisplayInfo)) {
            return false;
        }
        ChannelDisplayInfo channelDisplayInfo = (ChannelDisplayInfo) other;
        return L.f(this.name, channelDisplayInfo.name) && L.f(this.avatar, channelDisplayInfo.avatar) && L.f(this.link, channelDisplayInfo.link) && L.f(this.status, channelDisplayInfo.status) && L.f(this.userId, channelDisplayInfo.userId) && L.f(this.rating, channelDisplayInfo.rating) && L.f(this.description, channelDisplayInfo.description) && L.f(this.details, channelDisplayInfo.details);
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Details getDetails() {
        return this.details;
    }

    @l
    public final Action getLink() {
        return this.link;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final Float getRating() {
        return this.rating;
    }

    @l
    public final String getStatus() {
        return this.status;
    }

    @l
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Image image = this.avatar;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Action action = this.link;
        int iHashCode3 = (iHashCode2 + (action == null ? 0 : action.hashCode())) * 31;
        String str = this.status;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f12 = this.rating;
        int iHashCode6 = (iHashCode5 + (f12 == null ? 0 : f12.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Details details = this.details;
        return iHashCode7 + (details != null ? details.hashCode() : 0);
    }

    @k
    public String toString() {
        return "ChannelDisplayInfo(name=" + this.name + ", avatar=" + this.avatar + ", link=" + this.link + ", status=" + this.status + ", userId=" + this.userId + ", rating=" + this.rating + ", description=" + this.description + ", details=" + this.details + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeParcelable(this.link, flags);
        parcel.writeString(this.status);
        parcel.writeString(this.userId);
        Float f12 = this.rating;
        if (f12 == null) {
            parcel.writeInt(0);
        } else {
            a.B(parcel, 1, f12);
        }
        parcel.writeString(this.description);
        Details details = this.details;
        if (details == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            details.writeToParcel(parcel, flags);
        }
    }
}
