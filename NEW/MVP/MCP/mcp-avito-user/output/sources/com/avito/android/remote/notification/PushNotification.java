package com.avito.android.remote.notification;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.notification.Payload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PushNotification.kt */
@K51.d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001:\u000245B\u008a\u0001\u0012\u0019\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018R-\u0010\u0006\u001a\u0015\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0002\b\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b/\u0010\u001eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification;", "Landroid/os/Parcelable;", "", "", "", "LK51/e;", "analytics", "title", "body", "", "soundAndVibrateEnabled", "Lcom/avito/android/remote/model/notification/Payload;", "payload", "Lcom/avito/android/remote/notification/PushNotification$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/remote/model/Action;", "actions", "Lcom/avito/android/remote/notification/TrackingInfo;", "trackingInfo", "groupId", "sortPriority", "isSilent", "<init>", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/notification/Payload;Lcom/avito/android/remote/notification/PushNotification$Style;Ljava/util/List;Lcom/avito/android/remote/notification/TrackingInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "d", "Z", "h", "()Z", "Lcom/avito/android/remote/model/notification/Payload;", "f", "()Lcom/avito/android/remote/model/notification/Payload;", "Lcom/avito/android/remote/notification/PushNotification$Style;", "i", "()Lcom/avito/android/remote/notification/PushNotification$Style;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/remote/notification/TrackingInfo;", "j", "()Lcom/avito/android/remote/notification/TrackingInfo;", "e", "g", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "a", "Style", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PushNotification implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PushNotification> CREATOR;

    @com.google.gson.annotations.c("actions")
    @Y61.l
    private final List<Action> actions;

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private final Map<String, Object> analytics;

    @com.google.gson.annotations.c("body")
    @Y61.l
    private final String body;

    @com.google.gson.annotations.c("groupId")
    @Y61.l
    private final String groupId;

    @com.google.gson.annotations.c("isSilent")
    @Y61.l
    private final Boolean isSilent;

    @com.google.gson.annotations.c("payload")
    @Y61.l
    private final Payload payload;

    @com.google.gson.annotations.c("sortPriority")
    @Y61.l
    private final String sortPriority;

    @com.google.gson.annotations.c("soundAndVibrateEnabled")
    private final boolean soundAndVibrateEnabled;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final Style style;

    @com.google.gson.annotations.c("title")
    @Y61.l
    private final String title;

    @com.google.gson.annotations.c("tracking")
    @Y61.l
    private final TrackingInfo trackingInfo;

    /* compiled from: PushNotification.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification$Style;", "Landroid/os/Parcelable;", "()V", "BigImage", "BigText", "MessengerWithIcon", "Lcom/avito/android/remote/notification/PushNotification$Style$BigImage;", "Lcom/avito/android/remote/notification/PushNotification$Style$BigText;", "Lcom/avito/android/remote/notification/PushNotification$Style$MessengerWithIcon;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Style implements Parcelable {

        /* compiled from: PushNotification.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification$Style$BigImage;", "Lcom/avito/android/remote/notification/PushNotification$Style;", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BigImage extends Style {

            @Y61.k
            public static final Parcelable.Creator<BigImage> CREATOR = new a();

            @com.google.gson.annotations.c("image")
            @Y61.k
            private final Image image;

            /* compiled from: PushNotification.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BigImage> {
                @Override // android.os.Parcelable.Creator
                public final BigImage createFromParcel(Parcel parcel) {
                    return new BigImage((Image) parcel.readParcelable(BigImage.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final BigImage[] newArray(int i12) {
                    return new BigImage[i12];
                }
            }

            public BigImage(@Y61.k Image image) {
                super(null);
                this.image = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Y61.k
            public final Image getImage() {
                return this.image;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.image, i12);
            }
        }

        /* compiled from: PushNotification.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification$Style$BigText;", "Lcom/avito/android/remote/notification/PushNotification$Style;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class BigText extends Style {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final BigText f253974b = new BigText();

            @Y61.k
            public static final Parcelable.Creator<BigText> CREATOR = new a();

            /* compiled from: PushNotification.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BigText> {
                @Override // android.os.Parcelable.Creator
                public final BigText createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return BigText.f253974b;
                }

                @Override // android.os.Parcelable.Creator
                public final BigText[] newArray(int i12) {
                    return new BigText[i12];
                }
            }

            public BigText() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: PushNotification.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification$Style$MessengerWithIcon;", "Lcom/avito/android/remote/notification/PushNotification$Style;", "Lcom/avito/android/remote/model/Image;", "image", "<init>", "(Lcom/avito/android/remote/model/Image;)V", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MessengerWithIcon extends Style {

            @Y61.k
            public static final Parcelable.Creator<MessengerWithIcon> CREATOR = new a();

            @com.google.gson.annotations.c("image")
            @Y61.k
            private final Image image;

            /* compiled from: PushNotification.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MessengerWithIcon> {
                @Override // android.os.Parcelable.Creator
                public final MessengerWithIcon createFromParcel(Parcel parcel) {
                    return new MessengerWithIcon((Image) parcel.readParcelable(MessengerWithIcon.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final MessengerWithIcon[] newArray(int i12) {
                    return new MessengerWithIcon[i12];
                }
            }

            public MessengerWithIcon(@Y61.k Image image) {
                super(null);
                this.image = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Y61.k
            public final Image getImage() {
                return this.image;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.image, i12);
            }
        }

        public /* synthetic */ Style(C42822w c42822w) {
            this();
        }

        private Style() {
        }
    }

    /* compiled from: PushNotification.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/notification/PushNotification$a;", "", "<init>", "()V", "", "MISSED_IN_APP_CALL_NOTIFICATION_ID", "Ljava/lang/String;", "NEW_MESSAGE_NOTIFICATION_ID", "NOTIFICATION_ID_ANALYTICS_KEY", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PushNotification.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<PushNotification> {
        @Override // android.os.Parcelable.Creator
        public final PushNotification createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            Boolean boolValueOf = null;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(PushNotification.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            Payload payload = (Payload) parcel.readParcelable(PushNotification.class.getClassLoader());
            Style style = (Style) parcel.readParcelable(PushNotification.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(PushNotification.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            TrackingInfo trackingInfoCreateFromParcel = parcel.readInt() == 0 ? null : TrackingInfo.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PushNotification(linkedHashMap, string, string2, z12, payload, style, arrayList, trackingInfoCreateFromParcel, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final PushNotification[] newArray(int i12) {
            return new PushNotification[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public PushNotification(@Y61.l Map<String, ? extends Object> map, @Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l Payload payload, @Y61.l Style style, @Y61.l List<Action> list, @Y61.l TrackingInfo trackingInfo, @Y61.l String str3, @Y61.l String str4, @Y61.l Boolean bool) {
        this.analytics = map;
        this.title = str;
        this.body = str2;
        this.soundAndVibrateEnabled = z12;
        this.payload = payload;
        this.style = style;
        this.actions = list;
        this.trackingInfo = trackingInfo;
        this.groupId = str3;
        this.sortPriority = str4;
        this.isSilent = bool;
    }

    @Y61.l
    public final Map<String, Object> c() {
        return this.analytics;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushNotification)) {
            return false;
        }
        PushNotification pushNotification = (PushNotification) obj;
        return kotlin.jvm.internal.L.f(this.analytics, pushNotification.analytics) && kotlin.jvm.internal.L.f(this.title, pushNotification.title) && kotlin.jvm.internal.L.f(this.body, pushNotification.body) && this.soundAndVibrateEnabled == pushNotification.soundAndVibrateEnabled && kotlin.jvm.internal.L.f(this.payload, pushNotification.payload) && kotlin.jvm.internal.L.f(this.style, pushNotification.style) && kotlin.jvm.internal.L.f(this.actions, pushNotification.actions) && kotlin.jvm.internal.L.f(this.trackingInfo, pushNotification.trackingInfo) && kotlin.jvm.internal.L.f(this.groupId, pushNotification.groupId) && kotlin.jvm.internal.L.f(this.sortPriority, pushNotification.sortPriority) && kotlin.jvm.internal.L.f(this.isSilent, pushNotification.isSilent);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final Payload getPayload() {
        return this.payload;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getSortPriority() {
        return this.sortPriority;
    }

    @Y61.l
    public final List<Action> getActions() {
        return this.actions;
    }

    @Y61.l
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSoundAndVibrateEnabled() {
        return this.soundAndVibrateEnabled;
    }

    public final int hashCode() {
        Map<String, Object> map = this.analytics;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.body;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.soundAndVibrateEnabled);
        Payload payload = this.payload;
        int iHashCode3 = (i12 + (payload == null ? 0 : payload.hashCode())) * 31;
        Style style = this.style;
        int iHashCode4 = (iHashCode3 + (style == null ? 0 : style.hashCode())) * 31;
        List<Action> list = this.actions;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        int iHashCode6 = (iHashCode5 + (trackingInfo == null ? 0 : trackingInfo.hashCode())) * 31;
        String str3 = this.groupId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sortPriority;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isSilent;
        return iHashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final Boolean getIsSilent() {
        return this.isSilent;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PushNotification(analytics=");
        sb2.append(this.analytics);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", soundAndVibrateEnabled=");
        sb2.append(this.soundAndVibrateEnabled);
        sb2.append(", payload=");
        sb2.append(this.payload);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", trackingInfo=");
        sb2.append(this.trackingInfo);
        sb2.append(", groupId=");
        sb2.append(this.groupId);
        sb2.append(", sortPriority=");
        sb2.append(this.sortPriority);
        sb2.append(", isSilent=");
        return C0.g(sb2, this.isSilent, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Map<String, Object> map = this.analytics;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeInt(this.soundAndVibrateEnabled ? 1 : 0);
        parcel.writeParcelable(this.payload, i12);
        parcel.writeParcelable(this.style, i12);
        List<Action> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        TrackingInfo trackingInfo = this.trackingInfo;
        if (trackingInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trackingInfo.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.groupId);
        parcel.writeString(this.sortPriority);
        Boolean bool = this.isSilent;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
