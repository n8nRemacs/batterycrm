package com.avito.android.remote.model.notification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Payload.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/notification/Payload;", "Landroid/os/Parcelable;", "openAtTab", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;)V", "getOpenAtTab", "()Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "Companion", "Messenger", "NotificationCenter", "Lcom/avito/android/remote/model/notification/Payload$Messenger;", "Lcom/avito/android/remote/model/notification/Payload$NotificationCenter;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Payload implements Parcelable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private static final Map<String, Class<? extends Payload>> mapping = P0.g(new Q("nc", NotificationCenter.class), new Q(NotificationsSettings.Section.SECTION_MESSENGER, Messenger.class));

    @c("openAtTab")
    @l
    private final NotificationOpenAtTab openAtTab;

    /* compiled from: Payload.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R%\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/notification/Payload$Companion;", "", "()V", "mapping", "", "", "Ljava/lang/Class;", "Lcom/avito/android/remote/model/notification/Payload;", "getMapping", "()Ljava/util/Map;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Map<String, Class<? extends Payload>> getMapping() {
            return Payload.mapping;
        }

        private Companion() {
        }
    }

    /* compiled from: Payload.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/notification/Payload$Messenger;", "Lcom/avito/android/remote/model/notification/Payload;", "", "id", "Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;", "redesignPushData", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;)Lcom/avito/android/remote/model/notification/Payload$Messenger;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;", "getRedesignPushData", "RedesignPushData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Messenger extends Payload {

        @k
        public static final Parcelable.Creator<Messenger> CREATOR = new Creator();

        @c("id")
        @l
        private final String id;

        @c("redesignPushData")
        @l
        private final RedesignPushData redesignPushData;

        /* compiled from: Payload.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Messenger> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger createFromParcel(@k Parcel parcel) {
                return new Messenger(parcel.readString(), parcel.readInt() == 0 ? null : RedesignPushData.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger[] newArray(int i12) {
                return new Messenger[i12];
            }
        }

        /* compiled from: Payload.kt */
        @d
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;", "Landroid/os/Parcelable;", "", "titleRedesign", "itemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/notification/Payload$Messenger$RedesignPushData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitleRedesign", "getItemName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RedesignPushData implements Parcelable {

            @k
            public static final Parcelable.Creator<RedesignPushData> CREATOR = new Creator();

            @c("itemName")
            @k
            private final String itemName;

            @c("titleRedesign")
            @k
            private final String titleRedesign;

            /* compiled from: Payload.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RedesignPushData> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RedesignPushData createFromParcel(@k Parcel parcel) {
                    return new RedesignPushData(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final RedesignPushData[] newArray(int i12) {
                    return new RedesignPushData[i12];
                }
            }

            public RedesignPushData(@k String str, @k String str2) {
                this.titleRedesign = str;
                this.itemName = str2;
            }

            public static /* synthetic */ RedesignPushData copy$default(RedesignPushData redesignPushData, String str, String str2, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = redesignPushData.titleRedesign;
                }
                if ((i12 & 2) != 0) {
                    str2 = redesignPushData.itemName;
                }
                return redesignPushData.copy(str, str2);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final String getTitleRedesign() {
                return this.titleRedesign;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getItemName() {
                return this.itemName;
            }

            @k
            public final RedesignPushData copy(@k String titleRedesign, @k String itemName) {
                return new RedesignPushData(titleRedesign, itemName);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RedesignPushData)) {
                    return false;
                }
                RedesignPushData redesignPushData = (RedesignPushData) other;
                return L.f(this.titleRedesign, redesignPushData.titleRedesign) && L.f(this.itemName, redesignPushData.itemName);
            }

            @k
            public final String getItemName() {
                return this.itemName;
            }

            @k
            public final String getTitleRedesign() {
                return this.titleRedesign;
            }

            public int hashCode() {
                return this.itemName.hashCode() + (this.titleRedesign.hashCode() * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("RedesignPushData(titleRedesign=");
                sb2.append(this.titleRedesign);
                sb2.append(", itemName=");
                return C22026a.c(sb2, this.itemName, ')');
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.titleRedesign);
                parcel.writeString(this.itemName);
            }
        }

        public /* synthetic */ Messenger(String str, RedesignPushData redesignPushData, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, redesignPushData);
        }

        public static /* synthetic */ Messenger copy$default(Messenger messenger, String str, RedesignPushData redesignPushData, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = messenger.id;
            }
            if ((i12 & 2) != 0) {
                redesignPushData = messenger.redesignPushData;
            }
            return messenger.copy(str, redesignPushData);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final RedesignPushData getRedesignPushData() {
            return this.redesignPushData;
        }

        @k
        public final Messenger copy(@l String id2, @l RedesignPushData redesignPushData) {
            return new Messenger(id2, redesignPushData);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Messenger)) {
                return false;
            }
            Messenger messenger = (Messenger) other;
            return L.f(this.id, messenger.id) && L.f(this.redesignPushData, messenger.redesignPushData);
        }

        @l
        public final String getId() {
            return this.id;
        }

        @l
        public final RedesignPushData getRedesignPushData() {
            return this.redesignPushData;
        }

        public int hashCode() {
            String str = this.id;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            RedesignPushData redesignPushData = this.redesignPushData;
            return iHashCode + (redesignPushData != null ? redesignPushData.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Messenger(id=" + this.id + ", redesignPushData=" + this.redesignPushData + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
            RedesignPushData redesignPushData = this.redesignPushData;
            if (redesignPushData == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                redesignPushData.writeToParcel(parcel, flags);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Messenger(@l String str, @l RedesignPushData redesignPushData) {
            super(null, 1, 0 == true ? 1 : 0);
            this.id = str;
            this.redesignPushData = redesignPushData;
        }
    }

    /* compiled from: Payload.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/notification/Payload$NotificationCenter;", "Lcom/avito/android/remote/model/notification/Payload;", "", "id", "", "analyticParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/avito/android/remote/model/notification/Payload$NotificationCenter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getAnalyticParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotificationCenter extends Payload {

        @k
        public static final Parcelable.Creator<NotificationCenter> CREATOR = new Creator();

        @c("analyticParams")
        @l
        private final Map<String, String> analyticParams;

        @c("id")
        @k
        private final String id;

        /* compiled from: Payload.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotificationCenter> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NotificationCenter createFromParcel(@k Parcel parcel) {
                LinkedHashMap linkedHashMap;
                String string = parcel.readString();
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
                return new NotificationCenter(string, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NotificationCenter[] newArray(int i12) {
                return new NotificationCenter[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public NotificationCenter(@k String str, @l Map<String, String> map) {
            super(null, 1, 0 == true ? 1 : 0);
            this.id = str;
            this.analyticParams = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NotificationCenter copy$default(NotificationCenter notificationCenter, String str, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = notificationCenter.id;
            }
            if ((i12 & 2) != 0) {
                map = notificationCenter.analyticParams;
            }
            return notificationCenter.copy(str, map);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @l
        public final Map<String, String> component2() {
            return this.analyticParams;
        }

        @k
        public final NotificationCenter copy(@k String id2, @l Map<String, String> analyticParams) {
            return new NotificationCenter(id2, analyticParams);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotificationCenter)) {
                return false;
            }
            NotificationCenter notificationCenter = (NotificationCenter) other;
            return L.f(this.id, notificationCenter.id) && L.f(this.analyticParams, notificationCenter.analyticParams);
        }

        @l
        public final Map<String, String> getAnalyticParams() {
            return this.analyticParams;
        }

        @k
        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Map<String, String> map = this.analyticParams;
            return iHashCode + (map == null ? 0 : map.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NotificationCenter(id=");
            sb2.append(this.id);
            sb2.append(", analyticParams=");
            return r.w(sb2, this.analyticParams, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.id);
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

    public /* synthetic */ Payload(NotificationOpenAtTab notificationOpenAtTab, C42822w c42822w) {
        this(notificationOpenAtTab);
    }

    @l
    public final NotificationOpenAtTab getOpenAtTab() {
        return this.openAtTab;
    }

    private Payload(NotificationOpenAtTab notificationOpenAtTab) {
        this.openAtTab = notificationOpenAtTab;
    }

    public /* synthetic */ Payload(NotificationOpenAtTab notificationOpenAtTab, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : notificationOpenAtTab, null);
    }
}
