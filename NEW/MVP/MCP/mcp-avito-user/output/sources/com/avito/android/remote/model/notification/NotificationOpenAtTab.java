package com.avito.android.remote.model.notification;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NotificationOpenAtTab.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "Landroid/os/Parcelable;", NotificationOpenAtTab.TAB, "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Tab;", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Tab;)V", "getTab", "()Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Tab;", "Account", "Companion", "Favorites", "Main", "Messenger", "Profile", "Tab", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Account;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Favorites;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Main;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Profile;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class NotificationOpenAtTab implements Parcelable {

    @k
    public static final String TAB = "tab";

    @c(TAB)
    @l
    private final Tab tab;

    /* compiled from: NotificationOpenAtTab.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Account;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Account extends NotificationOpenAtTab {

        @k
        public static final Account INSTANCE = new Account();

        @k
        public static final Parcelable.Creator<Account> CREATOR = new Creator();

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Account> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Account createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return Account.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Account[] newArray(int i12) {
                return new Account[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Account() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Account);
        }

        public int hashCode() {
            return 1033172619;
        }

        @k
        public String toString() {
            return "Account";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationOpenAtTab.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Favorites;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Favorites extends NotificationOpenAtTab {

        @k
        public static final Favorites INSTANCE = new Favorites();

        @k
        public static final Parcelable.Creator<Favorites> CREATOR = new Creator();

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Favorites> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Favorites createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return Favorites.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Favorites[] newArray(int i12) {
                return new Favorites[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Favorites() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Favorites);
        }

        public int hashCode() {
            return 783234869;
        }

        @k
        public String toString() {
            return "Favorites";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationOpenAtTab.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Main;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Main extends NotificationOpenAtTab {

        @k
        public static final Main INSTANCE = new Main();

        @k
        public static final Parcelable.Creator<Main> CREATOR = new Creator();

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Main> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Main createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return Main.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Main[] newArray(int i12) {
                return new Main[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Main() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Main);
        }

        public int hashCode() {
            return -808835557;
        }

        @k
        public String toString() {
            return "Main";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationOpenAtTab.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;", "settings", "<init>", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;)V", "component1", "()Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;", "copy", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;)Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;", "getSettings", "Settings", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Messenger extends NotificationOpenAtTab {

        @k
        public static final Parcelable.Creator<Messenger> CREATOR = new Creator();

        @c("settings")
        @k
        private final Settings settings;

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Messenger> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger createFromParcel(@k Parcel parcel) {
                return new Messenger(Settings.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Messenger[] newArray(int i12) {
                return new Messenger[i12];
            }
        }

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;", "filters", "<init>", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;)V", "component1", "()Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;", "copy", "(Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;)Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;", "getFilters", "Filters", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Settings implements Parcelable {

            @k
            public static final Parcelable.Creator<Settings> CREATOR = new Creator();

            @c("filters")
            @k
            private final Filters filters;

            /* compiled from: NotificationOpenAtTab.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Settings> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Settings createFromParcel(@k Parcel parcel) {
                    return new Settings(Filters.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Settings[] newArray(int i12) {
                    return new Settings[i12];
                }
            }

            /* compiled from: NotificationOpenAtTab.kt */
            @d
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;", "Landroid/os/Parcelable;", "", "unreadOnly", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Messenger$Settings$Filters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getUnreadOnly", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Filters implements Parcelable {

                @k
                public static final Parcelable.Creator<Filters> CREATOR = new Creator();

                @c("unreadOnly")
                private final boolean unreadOnly;

                /* compiled from: NotificationOpenAtTab.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Filters> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Filters createFromParcel(@k Parcel parcel) {
                        return new Filters(parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Filters[] newArray(int i12) {
                        return new Filters[i12];
                    }
                }

                public Filters() {
                    this(false, 1, null);
                }

                public static /* synthetic */ Filters copy$default(Filters filters, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        z12 = filters.unreadOnly;
                    }
                    return filters.copy(z12);
                }

                /* renamed from: component1, reason: from getter */
                public final boolean getUnreadOnly() {
                    return this.unreadOnly;
                }

                @k
                public final Filters copy(boolean unreadOnly) {
                    return new Filters(unreadOnly);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Filters) && this.unreadOnly == ((Filters) other).unreadOnly;
                }

                public final boolean getUnreadOnly() {
                    return this.unreadOnly;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.unreadOnly);
                }

                @k
                public String toString() {
                    return r.x(new StringBuilder("Filters(unreadOnly="), this.unreadOnly, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeInt(this.unreadOnly ? 1 : 0);
                }

                public Filters(boolean z12) {
                    this.unreadOnly = z12;
                }

                public /* synthetic */ Filters(boolean z12, int i12, C42822w c42822w) {
                    this((i12 & 1) != 0 ? false : z12);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Settings() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Settings copy$default(Settings settings, Filters filters, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    filters = settings.filters;
                }
                return settings.copy(filters);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final Filters getFilters() {
                return this.filters;
            }

            @k
            public final Settings copy(@k Filters filters) {
                return new Settings(filters);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Settings) && L.f(this.filters, ((Settings) other).filters);
            }

            @k
            public final Filters getFilters() {
                return this.filters;
            }

            public int hashCode() {
                return this.filters.hashCode();
            }

            @k
            public String toString() {
                return "Settings(filters=" + this.filters + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                this.filters.writeToParcel(parcel, flags);
            }

            public Settings(@k Filters filters) {
                this.filters = filters;
            }

            public /* synthetic */ Settings(Filters filters, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? new Filters(false, 1, null) : filters);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Messenger() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ Messenger copy$default(Messenger messenger, Settings settings, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                settings = messenger.settings;
            }
            return messenger.copy(settings);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Settings getSettings() {
            return this.settings;
        }

        @k
        public final Messenger copy(@k Settings settings) {
            return new Messenger(settings);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Messenger) && L.f(this.settings, ((Messenger) other).settings);
        }

        @k
        public final Settings getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode();
        }

        @k
        public String toString() {
            return "Messenger(settings=" + this.settings + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            this.settings.writeToParcel(parcel, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Messenger(Settings settings, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new Settings(null, 1, 0 == true ? 1 : 0) : settings);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Messenger(@k Settings settings) {
            super(null, 1, 0 == true ? 1 : 0);
            this.settings = settings;
        }
    }

    /* compiled from: NotificationOpenAtTab.kt */
    @d
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Profile;", "Lcom/avito/android/remote/model/notification/NotificationOpenAtTab;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Profile extends NotificationOpenAtTab {

        @k
        public static final Profile INSTANCE = new Profile();

        @k
        public static final Parcelable.Creator<Profile> CREATOR = new Creator();

        /* compiled from: NotificationOpenAtTab.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Profile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Profile createFromParcel(@k Parcel parcel) {
                parcel.readInt();
                return Profile.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Profile[] newArray(int i12) {
                return new Profile[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Profile() {
            super(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Profile);
        }

        public int hashCode() {
            return 1901065735;
        }

        @k
        public String toString() {
            return "Profile";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NotificationOpenAtTab.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/notification/NotificationOpenAtTab$Tab;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "MAIN", "FAVORITES", "ACCOUNT", "PROFILE", "MESSENGER", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Tab[] $VALUES;

        @k
        private final String value;

        @c("main")
        public static final Tab MAIN = new Tab("MAIN", 0, "main");

        @c("favorites")
        public static final Tab FAVORITES = new Tab("FAVORITES", 1, "favorites");

        @c("account")
        public static final Tab ACCOUNT = new Tab("ACCOUNT", 2, "account");

        @c("profile")
        public static final Tab PROFILE = new Tab("PROFILE", 3, "profile");

        @c(NotificationsSettings.Section.SECTION_MESSENGER)
        public static final Tab MESSENGER = new Tab("MESSENGER", 4, NotificationsSettings.Section.SECTION_MESSENGER);

        private static final /* synthetic */ Tab[] $values() {
            return new Tab[]{MAIN, FAVORITES, ACCOUNT, PROFILE, MESSENGER};
        }

        static {
            Tab[] tabArr$values = $values();
            $VALUES = tabArr$values;
            $ENTRIES = kotlin.enums.c.a(tabArr$values);
        }

        private Tab(String str, int i12, String str2) {
            this.value = str2;
        }

        @k
        public static a<Tab> getEntries() {
            return $ENTRIES;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) $VALUES.clone();
        }

        @k
        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ NotificationOpenAtTab(Tab tab, C42822w c42822w) {
        this(tab);
    }

    @l
    public final Tab getTab() {
        return this.tab;
    }

    private NotificationOpenAtTab(Tab tab) {
        this.tab = tab;
    }

    public /* synthetic */ NotificationOpenAtTab(Tab tab, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : tab, null);
    }
}
