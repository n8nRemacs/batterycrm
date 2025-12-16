package com.avito.android.remote.model.notification_center;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: NotificationCenterLandingShare.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001:\u0002*+BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b)\u0010!¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Advert;", "advert", "", "", "analytics", "button", "description", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Share;", "share", "title", "<init>", "(Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Advert;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Share;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Advert;", "getAdvert", "()Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Advert;", "Ljava/util/Map;", "getAnalytics", "()Ljava/util/Map;", "Ljava/lang/String;", "getButton", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Share;", "getShare", "()Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Share;", "getTitle", "Advert", "Share", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationCenterLandingShare implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationCenterLandingShare> CREATOR = new Creator();

    @c("advert")
    @l
    private final Advert advert;

    @c("analytics")
    @k
    private final Map<String, String> analytics;

    @c("button")
    @k
    private final String button;

    @c("description")
    @k
    private final String description;

    @c("image")
    @l
    private final Image image;

    @c("share")
    @k
    private final Share share;

    @c("title")
    @k
    private final String title;

    /* compiled from: NotificationCenterLandingShare.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Advert;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "location", "price", "priceWithoutDiscount", "title", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getLocation", "()Ljava/lang/String;", "getPrice", "getPriceWithoutDiscount", "getTitle", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Advert implements Parcelable {

        @k
        public static final Parcelable.Creator<Advert> CREATOR = new Creator();

        @c("image")
        @l
        private final Image image;

        @c("location")
        @l
        private final String location;

        @c("price")
        @k
        private final String price;

        @c("priceWithoutDiscount")
        @l
        private final String priceWithoutDiscount;

        @c("title")
        @k
        private final String title;

        /* compiled from: NotificationCenterLandingShare.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Advert> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Advert createFromParcel(@k Parcel parcel) {
                return new Advert((Image) parcel.readParcelable(Advert.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Advert[] newArray(int i12) {
                return new Advert[i12];
            }
        }

        public Advert(@l Image image, @l String str, @k String str2, @l String str3, @k String str4) {
            this.image = image;
            this.location = str;
            this.price = str2;
            this.priceWithoutDiscount = str3;
            this.title = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final String getLocation() {
            return this.location;
        }

        @k
        public final String getPrice() {
            return this.price;
        }

        @l
        public final String getPriceWithoutDiscount() {
            return this.priceWithoutDiscount;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.location);
            parcel.writeString(this.price);
            parcel.writeString(this.priceWithoutDiscount);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: NotificationCenterLandingShare.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationCenterLandingShare> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationCenterLandingShare createFromParcel(@k Parcel parcel) {
            Advert advertCreateFromParcel = parcel.readInt() == 0 ? null : Advert.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
            int iA2 = 0;
            while (iA2 != i12) {
                iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
            }
            return new NotificationCenterLandingShare(advertCreateFromParcel, linkedHashMap, parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(NotificationCenterLandingShare.class.getClassLoader()), Share.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationCenterLandingShare[] newArray(int i12) {
            return new NotificationCenterLandingShare[i12];
        }
    }

    /* compiled from: NotificationCenterLandingShare.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingShare$Share;", "Landroid/os/Parcelable;", "", "title", ContextActionHandler.Link.URL, "urlImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getUrl", "getUrlImage", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Share implements Parcelable {

        @k
        public static final Parcelable.Creator<Share> CREATOR = new Creator();

        @c("title")
        @l
        private final String title;

        @c(ContextActionHandler.Link.URL)
        @k
        private final String url;

        @c("urlImage")
        @l
        private final String urlImage;

        /* compiled from: NotificationCenterLandingShare.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Share> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Share createFromParcel(@k Parcel parcel) {
                return new Share(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Share[] newArray(int i12) {
                return new Share[i12];
            }
        }

        public Share(@l String str, @k String str2, @l String str3) {
            this.title = str;
            this.url = str2;
            this.urlImage = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getUrl() {
            return this.url;
        }

        @l
        public final String getUrlImage() {
            return this.urlImage;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.url);
            parcel.writeString(this.urlImage);
        }
    }

    public NotificationCenterLandingShare(@l Advert advert, @k Map<String, String> map, @k String str, @k String str2, @l Image image, @k Share share, @k String str3) {
        this.advert = advert;
        this.analytics = map;
        this.button = str;
        this.description = str2;
        this.image = image;
        this.share = share;
        this.title = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Advert getAdvert() {
        return this.advert;
    }

    @k
    public final Map<String, String> getAnalytics() {
        return this.analytics;
    }

    @k
    public final String getButton() {
        return this.button;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @k
    public final Share getShare() {
        return this.share;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Advert advert = this.advert;
        if (advert == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advert.writeToParcel(parcel, flags);
        }
        Iterator itI = C0.i(parcel, this.analytics);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.button);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.image, flags);
        this.share.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
    }
}
