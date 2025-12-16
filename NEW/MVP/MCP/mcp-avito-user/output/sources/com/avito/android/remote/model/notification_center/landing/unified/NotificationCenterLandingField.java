package com.avito.android.remote.model.notification_center.landing.unified;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NotificationCenterLandingField.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "Landroid/os/Parcelable;", "()V", "Button", "Description", "Divider", "Image", "Item", "PairButton", "Space", "Subtitle", "Title", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Button;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Description;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Divider;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Image;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Item;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Space;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Subtitle;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Title;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class NotificationCenterLandingField implements Parcelable {

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Button;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "Lcom/avito/android/remote/model/Action;", "action", "", "", "analyticParams", "<init>", "(Lcom/avito/android/remote/model/Action;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Button extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        @c("analyticParams")
        @l
        private final Map<String, String> analyticParams;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Button> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Action action = (Action) parcel.readParcelable(Button.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Button(action, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k Action action, @l Map<String, String> map) {
            super(null);
            this.action = action;
            this.analyticParams = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @l
        public final Map<String, String> getAnalyticParams() {
            return this.analyticParams;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
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

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Description;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "", "description", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Description extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Description> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Description> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Description createFromParcel(@k Parcel parcel) {
                return new Description(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Description[] newArray(int i12) {
                return new Description[i12];
            }
        }

        public Description(@k String str) {
            super(null);
            this.description = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.description);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Divider;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Divider extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Divider> CREATOR = new Creator();

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Divider> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Divider createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return new Divider();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Divider[] newArray(int i12) {
                return new Divider[i12];
            }
        }

        public Divider() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Image;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Image extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        @c("image")
        @k
        private final com.avito.android.remote.model.Image image;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Image> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image createFromParcel(@k Parcel parcel) {
                return new Image((com.avito.android.remote.model.Image) parcel.readParcelable(Image.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Image[] newArray(int i12) {
                return new Image[i12];
            }
        }

        public Image(@k com.avito.android.remote.model.Image image) {
            super(null);
            this.image = image;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final com.avito.android.remote.model.Image getImage() {
            return this.image;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b,\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b-\u0010*R\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b.\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b/\u0010*R\u001a\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b0\u0010*¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Item;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "", "isFavorite", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "", "analyticParams", "Lcom/avito/android/remote/model/Image;", "image", AddressParameter.TYPE, "distance", "id", "location", "price", "priceWithoutDiscount", "title", "<init>", "(ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/util/Map;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "getDistance", "getId", "getLocation", "getPrice", "getPriceWithoutDiscount", "getTitle", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Item extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Item> CREATOR = new Creator();

        @c(AddressParameter.TYPE)
        @l
        private final String address;

        @c("analyticParams")
        @l
        private final Map<String, String> analyticParams;

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
        private final com.avito.android.remote.model.Image image;

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

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int iA2 = 0;
                boolean z12 = parcel.readInt() != 0;
                DeepLink deepLink = (DeepLink) parcel.readParcelable(Item.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i12);
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                }
                return new Item(z12, deepLink, linkedHashMap, (com.avito.android.remote.model.Image) parcel.readParcelable(Item.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Item[] newArray(int i12) {
                return new Item[i12];
            }
        }

        public Item(boolean z12, @k DeepLink deepLink, @l Map<String, String> map, @k com.avito.android.remote.model.Image image, @l String str, @l String str2, @k String str3, @l String str4, @k String str5, @l String str6, @k String str7) {
            super(null);
            this.isFavorite = z12;
            this.deepLink = deepLink;
            this.analyticParams = map;
            this.image = image;
            this.address = str;
            this.distance = str2;
            this.id = str3;
            this.location = str4;
            this.price = str5;
            this.priceWithoutDiscount = str6;
            this.title = str7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getAddress() {
            return this.address;
        }

        @l
        public final Map<String, String> getAnalyticParams() {
            return this.analyticParams;
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
        public final com.avito.android.remote.model.Image getImage() {
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
            parcel.writeInt(this.isFavorite ? 1 : 0);
            parcel.writeParcelable(this.deepLink, flags);
            Map<String, String> map = this.analyticParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
            }
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.address);
            parcel.writeString(this.distance);
            parcel.writeString(this.id);
            parcel.writeString(this.location);
            parcel.writeString(this.price);
            parcel.writeString(this.priceWithoutDiscount);
            parcel.writeString(this.title);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;", "first", "second", "<init>", "(Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;", "getFirst", "()Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;", "getSecond", "OneButton", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class PairButton extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<PairButton> CREATOR = new Creator();

        @c("first")
        @k
        private final OneButton first;

        @c("second")
        @k
        private final OneButton second;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PairButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PairButton createFromParcel(@k Parcel parcel) {
                Parcelable.Creator<OneButton> creator = OneButton.CREATOR;
                return new PairButton(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PairButton[] newArray(int i12) {
                return new PairButton[i12];
            }
        }

        /* compiled from: NotificationCenterLandingField.kt */
        @d
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$PairButton$OneButton;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Action;", "action", "", "", "analyticParams", "<init>", "(Lcom/avito/android/remote/model/Action;Ljava/util/Map;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class OneButton implements Parcelable {

            @k
            public static final Parcelable.Creator<OneButton> CREATOR = new Creator();

            @c("action")
            @k
            private final Action action;

            @c("analyticParams")
            @l
            private final Map<String, String> analyticParams;

            /* compiled from: NotificationCenterLandingField.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OneButton> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OneButton createFromParcel(@k Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    Action action = (Action) parcel.readParcelable(OneButton.class.getClassLoader());
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int i12 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                        int iA2 = 0;
                        while (iA2 != i12) {
                            iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new OneButton(action, linkedHashMap);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final OneButton[] newArray(int i12) {
                    return new OneButton[i12];
                }
            }

            public OneButton(@k Action action, @l Map<String, String> map) {
                this.action = action;
                this.analyticParams = map;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final Action getAction() {
                return this.action;
            }

            @l
            public final Map<String, String> getAnalyticParams() {
                return this.analyticParams;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeParcelable(this.action, flags);
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

        public PairButton(@k OneButton oneButton, @k OneButton oneButton2) {
            super(null);
            this.first = oneButton;
            this.second = oneButton2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final OneButton getFirst() {
            return this.first;
        }

        @k
        public final OneButton getSecond() {
            return this.second;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.first.writeToParcel(parcel, flags);
            this.second.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Space;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Space extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Space> CREATOR = new Creator();

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Space> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Space createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return new Space();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Space[] newArray(int i12) {
                return new Space[i12];
            }
        }

        public Space() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Subtitle;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "Lcom/avito/android/remote/model/Action;", "action", "", "", "analyticParams", "title", "<init>", "(Lcom/avito/android/remote/model/Action;Ljava/util/Map;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Action;", "getAction", "()Lcom/avito/android/remote/model/Action;", "Ljava/util/Map;", "getAnalyticParams", "()Ljava/util/Map;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Subtitle extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Subtitle> CREATOR = new Creator();

        @c("action")
        @l
        private final Action action;

        @c("analyticParams")
        @l
        private final Map<String, String> analyticParams;

        @c("title")
        @k
        private final String title;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Subtitle> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Subtitle createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Action action = (Action) parcel.readParcelable(Subtitle.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Subtitle(action, linkedHashMap, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Subtitle[] newArray(int i12) {
                return new Subtitle[i12];
            }
        }

        public Subtitle(@l Action action, @l Map<String, String> map, @k String str) {
            super(null);
            this.action = action;
            this.analyticParams = map;
            this.title = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Action getAction() {
            return this.action;
        }

        @l
        public final Map<String, String> getAnalyticParams() {
            return this.analyticParams;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.action, flags);
            Map<String, String> map = this.analyticParams;
            if (map == null) {
                parcel.writeInt(0);
            } else {
                Iterator itH = C0.h(parcel, 1, map);
                while (itH.hasNext()) {
                    Map.Entry entry = (Map.Entry) itH.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
            }
            parcel.writeString(this.title);
        }
    }

    /* compiled from: NotificationCenterLandingField.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField$Title;", "Lcom/avito/android/remote/model/notification_center/landing/unified/NotificationCenterLandingField;", "", "title", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Title extends NotificationCenterLandingField {

        @k
        public static final Parcelable.Creator<Title> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        /* compiled from: NotificationCenterLandingField.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Title> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Title createFromParcel(@k Parcel parcel) {
                return new Title(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Title[] newArray(int i12) {
                return new Title[i12];
            }
        }

        public Title(@k String str) {
            super(null);
            this.title = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
        }
    }

    public /* synthetic */ NotificationCenterLandingField(C42822w c42822w) {
        this();
    }

    private NotificationCenterLandingField() {
    }
}
