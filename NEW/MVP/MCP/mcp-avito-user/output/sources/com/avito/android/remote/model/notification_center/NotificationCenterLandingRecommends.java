package com.avito.android.remote.model.notification_center;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationCenterLandingRecommends.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001$BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "title", "description", "", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element;", "elements", "", "analyticParams", "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Ljava/util/List;", "getElements", "()Ljava/util/List;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "Element", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class NotificationCenterLandingRecommends implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationCenterLandingRecommends> CREATOR = new Creator();

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("description")
    @k
    private final String description;

    @c("elements")
    @k
    private final List<Element> elements;

    @c("image")
    @k
    private final Image image;

    @c("title")
    @k
    private final String title;

    /* compiled from: NotificationCenterLandingRecommends.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationCenterLandingRecommends> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationCenterLandingRecommends createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Image image = (Image) parcel.readParcelable(NotificationCenterLandingRecommends.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(NotificationCenterLandingRecommends.class, parcel, arrayList, iL2, 1);
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new NotificationCenterLandingRecommends(image, string, string2, arrayList, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationCenterLandingRecommends[] newArray(int i12) {
            return new NotificationCenterLandingRecommends[i12];
        }
    }

    /* compiled from: NotificationCenterLandingRecommends.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element;", "Landroid/os/Parcelable;", "()V", "Advert", "Title", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element$Advert;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element$Title;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Element implements Parcelable {

        /* compiled from: NotificationCenterLandingRecommends.kt */
        @d
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b\r\u0010(R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element$Advert;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element;", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "title", "price", "priceWithoutDiscount", "location", "distance", AddressParameter.TYPE, "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getTitle", "getPrice", "getPriceWithoutDiscount", "getLocation", "getDistance", "getAddress", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Advert extends Element {

            @k
            public static final Parcelable.Creator<Advert> CREATOR = new Creator();

            @c(AddressParameter.TYPE)
            @l
            private final String address;

            @c(TooltipAttribute.PARAM_DEEP_LINK)
            @k
            private final DeepLink deepLink;

            @c("distance")
            @l
            private final String distance;

            @c("id")
            @k
            private final String id;

            @c("image")
            @k
            private final Image image;

            @c("isFavorite")
            private final boolean isFavorite;

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

            /* compiled from: NotificationCenterLandingRecommends.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Advert> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Advert createFromParcel(@k Parcel parcel) {
                    return new Advert(parcel.readString(), (Image) parcel.readParcelable(Advert.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(Advert.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Advert[] newArray(int i12) {
                    return new Advert[i12];
                }
            }

            public Advert(@k String str, @k Image image, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l String str7, boolean z12, @k DeepLink deepLink) {
                super(null);
                this.id = str;
                this.image = image;
                this.title = str2;
                this.price = str3;
                this.priceWithoutDiscount = str4;
                this.location = str5;
                this.distance = str6;
                this.address = str7;
                this.isFavorite = z12;
                this.deepLink = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @l
            public final String getAddress() {
                return this.address;
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @l
            public final String getDistance() {
                return this.distance;
            }

            @k
            public final String getId() {
                return this.id;
            }

            @k
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

            /* renamed from: isFavorite, reason: from getter */
            public final boolean getIsFavorite() {
                return this.isFavorite;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.id);
                parcel.writeParcelable(this.image, flags);
                parcel.writeString(this.title);
                parcel.writeString(this.price);
                parcel.writeString(this.priceWithoutDiscount);
                parcel.writeString(this.location);
                parcel.writeString(this.distance);
                parcel.writeString(this.address);
                parcel.writeInt(this.isFavorite ? 1 : 0);
                parcel.writeParcelable(this.deepLink, flags);
            }
        }

        /* compiled from: NotificationCenterLandingRecommends.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element$Title;", "Lcom/avito/android/remote/model/notification_center/NotificationCenterLandingRecommends$Element;", "", "title", "Lcom/avito/android/remote/model/Action;", "action", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Action;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Title extends Element {

            @k
            public static final Parcelable.Creator<Title> CREATOR = new Creator();

            @c("action")
            @k
            private final Action action;

            @c("title")
            @k
            private final String title;

            /* compiled from: NotificationCenterLandingRecommends.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Title> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Title createFromParcel(@k Parcel parcel) {
                    return new Title(parcel.readString(), (Action) parcel.readParcelable(Title.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Title[] newArray(int i12) {
                    return new Title[i12];
                }
            }

            public Title(@k String str, @k Action action) {
                super(null);
                this.title = str;
                this.action = action;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final Action getAction() {
                return this.action;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.action, flags);
            }
        }

        public /* synthetic */ Element(C42822w c42822w) {
            this();
        }

        private Element() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationCenterLandingRecommends(@k Image image, @k String str, @k String str2, @k List<? extends Element> list, @l Map<String, String> map) {
        this.image = image;
        this.title = str;
        this.description = str2;
        this.elements = list;
        this.analyticParams = map;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<Element> getElements() {
        return this.elements;
    }

    @k
    public final Image getImage() {
        return this.image;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Iterator itJ = C0.j(this.elements, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        Map<String, String> map = this.analyticParams;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
