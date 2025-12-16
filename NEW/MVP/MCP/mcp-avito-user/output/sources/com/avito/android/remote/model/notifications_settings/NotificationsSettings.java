package com.avito.android.remote.model.notifications_settings;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettings.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section;", "sections", "", RequestReviewResultKt.INFO_TYPE, "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getSections", "Ljava/lang/String;", "getInfo", "Section", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NotificationsSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<NotificationsSettings> CREATOR = new Creator();

    @c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final String info;

    @c("sections")
    @k
    private final List<Section> sections;

    /* compiled from: NotificationsSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NotificationsSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationsSettings createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(Section.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new NotificationsSettings(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NotificationsSettings[] newArray(int i12) {
            return new NotificationsSettings[i12];
        }
    }

    /* compiled from: NotificationsSettings.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section;", "Landroid/os/Parcelable;", "", "type", "title", "subtitle", "", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "channels", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "isSectionMessenger", "()Z", "isImportantSection", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTitle", "getSubtitle", "Ljava/util/List;", "getChannels", "Companion", "Channel", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Section implements Parcelable {

        @k
        public static final String CHANNEL_TYPE_PUSH = "push";

        @k
        public static final String SECTION_CALLS = "limit_calls";

        @k
        public static final String SECTION_DELIVERY = "delivery";

        @k
        public static final String SECTION_MESSENGER = "messenger";

        @k
        public static final String SECTION_MESSENGER_REMINDER = "messenger_reminder";

        @k
        public static final String SECTION_PAID_SERVICES = "notification";

        @k
        public static final String SECTION_REVIEWS = "user_reviews";

        @c("channels")
        @k
        private final List<Channel> channels;

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        @c("type")
        @k
        private final String type;

        @k
        public static final Parcelable.Creator<Section> CREATOR = new Creator();

        /* compiled from: NotificationsSettings.kt */
        @InterfaceC19823a
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "Landroid/os/Parcelable;", "type", "", "title", "value", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getTitle", "()Ljava/lang/String;", "getType", "getValue", "()Z", "setValue", "(Z)V", "Email", "Other", "Push", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Email;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Other;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Push;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Channel implements Parcelable {

            @k
            private final String title;

            @k
            private final String type;
            private boolean value;

            /* compiled from: NotificationsSettings.kt */
            @InterfaceC19823a
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Email;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "", "type", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Email;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTitle", "Z", "getValue", "setValue", "(Z)V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Email extends Channel {

                @k
                public static final Parcelable.Creator<Email> CREATOR = new Creator();

                @k
                private final String title;

                @k
                private final String type;
                private boolean value;

                /* compiled from: NotificationsSettings.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Email> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Email createFromParcel(@k Parcel parcel) {
                        return new Email(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Email[] newArray(int i12) {
                        return new Email[i12];
                    }
                }

                public Email(@k String str, @k String str2, boolean z12) {
                    super(str, str2, z12, null);
                    this.type = str;
                    this.title = str2;
                    this.value = z12;
                }

                public static /* synthetic */ Email copy$default(Email email, String str, String str2, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = email.type;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = email.title;
                    }
                    if ((i12 & 4) != 0) {
                        z12 = email.value;
                    }
                    return email.copy(str, str2, z12);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                @k
                public final Email copy(@k String type, @k String title, boolean value) {
                    return new Email(type, title, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Email)) {
                        return false;
                    }
                    Email email = (Email) other;
                    return L.f(this.type, email.type) && L.f(this.title, email.title) && this.value == email.value;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getTitle() {
                    return this.title;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getType() {
                    return this.type;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value) + H.d(this.type.hashCode() * 31, 31, this.title);
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public void setValue(boolean z12) {
                    this.value = z12;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Email(type=");
                    sb2.append(this.type);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", value=");
                    return r.x(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeInt(this.value ? 1 : 0);
                }
            }

            /* compiled from: NotificationsSettings.kt */
            @InterfaceC19823a
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Other;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "", "type", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Other;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTitle", "Z", "getValue", "setValue", "(Z)V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Other extends Channel {

                @k
                public static final Parcelable.Creator<Other> CREATOR = new Creator();

                @k
                private final String title;

                @k
                private final String type;
                private boolean value;

                /* compiled from: NotificationsSettings.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Other> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Other createFromParcel(@k Parcel parcel) {
                        return new Other(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Other[] newArray(int i12) {
                        return new Other[i12];
                    }
                }

                public Other(@k String str, @k String str2, boolean z12) {
                    super(str, str2, z12, null);
                    this.type = str;
                    this.title = str2;
                    this.value = z12;
                }

                public static /* synthetic */ Other copy$default(Other other, String str, String str2, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = other.type;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = other.title;
                    }
                    if ((i12 & 4) != 0) {
                        z12 = other.value;
                    }
                    return other.copy(str, str2, z12);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                @k
                public final Other copy(@k String type, @k String title, boolean value) {
                    return new Other(type, title, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Other)) {
                        return false;
                    }
                    Other other2 = (Other) other;
                    return L.f(this.type, other2.type) && L.f(this.title, other2.title) && this.value == other2.value;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getTitle() {
                    return this.title;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getType() {
                    return this.type;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value) + H.d(this.type.hashCode() * 31, 31, this.title);
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public void setValue(boolean z12) {
                    this.value = z12;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Other(type=");
                    sb2.append(this.type);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", value=");
                    return r.x(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeInt(this.value ? 1 : 0);
                }
            }

            /* compiled from: NotificationsSettings.kt */
            @InterfaceC19823a
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\nR\"\u0010\u0006\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Push;", "Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel;", "", "type", "title", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/notifications_settings/NotificationsSettings$Section$Channel$Push;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getTitle", "Z", "getValue", "setValue", "(Z)V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Push extends Channel {

                @k
                public static final Parcelable.Creator<Push> CREATOR = new Creator();

                @k
                private final String title;

                @k
                private final String type;
                private boolean value;

                /* compiled from: NotificationsSettings.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Push> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Push createFromParcel(@k Parcel parcel) {
                        return new Push(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Push[] newArray(int i12) {
                        return new Push[i12];
                    }
                }

                public Push(@k String str, @k String str2, boolean z12) {
                    super(str, str2, z12, null);
                    this.type = str;
                    this.title = str2;
                    this.value = z12;
                }

                public static /* synthetic */ Push copy$default(Push push, String str, String str2, boolean z12, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = push.type;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = push.title;
                    }
                    if ((i12 & 4) != 0) {
                        z12 = push.value;
                    }
                    return push.copy(str, str2, z12);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final String getType() {
                    return this.type;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                /* renamed from: component3, reason: from getter */
                public final boolean getValue() {
                    return this.value;
                }

                @k
                public final Push copy(@k String type, @k String title, boolean value) {
                    return new Push(type, title, value);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Push)) {
                        return false;
                    }
                    Push push = (Push) other;
                    return L.f(this.type, push.type) && L.f(this.title, push.title) && this.value == push.value;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getTitle() {
                    return this.title;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                @k
                public String getType() {
                    return this.type;
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public boolean getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return Boolean.hashCode(this.value) + H.d(this.type.hashCode() * 31, 31, this.title);
                }

                @Override // com.avito.android.remote.model.notifications_settings.NotificationsSettings.Section.Channel
                public void setValue(boolean z12) {
                    this.value = z12;
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Push(type=");
                    sb2.append(this.type);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", value=");
                    return r.x(sb2, this.value, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.type);
                    parcel.writeString(this.title);
                    parcel.writeInt(this.value ? 1 : 0);
                }
            }

            public /* synthetic */ Channel(String str, String str2, boolean z12, C42822w c42822w) {
                this(str, str2, z12);
            }

            @k
            public String getTitle() {
                return this.title;
            }

            @k
            public String getType() {
                return this.type;
            }

            public boolean getValue() {
                return this.value;
            }

            public void setValue(boolean z12) {
                this.value = z12;
            }

            private Channel(String str, String str2, boolean z12) {
                this.type = str;
                this.title = str2;
                this.value = z12;
            }
        }

        /* compiled from: NotificationsSettings.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Section> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Section createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(Section.class, parcel, arrayList, iL2, 1);
                }
                return new Section(string, string2, string3, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Section[] newArray(int i12) {
                return new Section[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Section(@k String str, @k String str2, @k String str3, @k List<? extends Channel> list) {
            this.type = str;
            this.title = str2;
            this.subtitle = str3;
            this.channels = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, String str, String str2, String str3, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = section.type;
            }
            if ((i12 & 2) != 0) {
                str2 = section.title;
            }
            if ((i12 & 4) != 0) {
                str3 = section.subtitle;
            }
            if ((i12 & 8) != 0) {
                list = section.channels;
            }
            return section.copy(str, str2, str3, list);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final List<Channel> component4() {
            return this.channels;
        }

        @k
        public final Section copy(@k String type, @k String title, @k String subtitle, @k List<? extends Channel> channels) {
            return new Section(type, title, subtitle, channels);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Section)) {
                return false;
            }
            Section section = (Section) other;
            return L.f(this.type, section.type) && L.f(this.title, section.title) && L.f(this.subtitle, section.subtitle) && L.f(this.channels, section.channels);
        }

        @k
        public final List<Channel> getChannels() {
            return this.channels;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.channels.hashCode() + H.d(H.d(this.type.hashCode() * 31, 31, this.title), 31, this.subtitle);
        }

        public final boolean isImportantSection() {
            return isSectionMessenger() || L.f(this.type, SECTION_PAID_SERVICES) || L.f(this.type, SECTION_REVIEWS) || L.f(this.type, SECTION_DELIVERY) || L.f(this.type, SECTION_CALLS);
        }

        public final boolean isSectionMessenger() {
            return L.f(this.type, SECTION_MESSENGER) || L.f(this.type, SECTION_MESSENGER_REMINDER);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Section(type=");
            sb2.append(this.type);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", channels=");
            return H.p(sb2, this.channels, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            Iterator itJ = C0.j(this.channels, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    public NotificationsSettings(@k List<Section> list, @k String str) {
        this.sections = list;
        this.info = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationsSettings copy$default(NotificationsSettings notificationsSettings, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = notificationsSettings.sections;
        }
        if ((i12 & 2) != 0) {
            str = notificationsSettings.info;
        }
        return notificationsSettings.copy(list, str);
    }

    @k
    public final List<Section> component1() {
        return this.sections;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @k
    public final NotificationsSettings copy(@k List<Section> sections, @k String info) {
        return new NotificationsSettings(sections, info);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationsSettings)) {
            return false;
        }
        NotificationsSettings notificationsSettings = (NotificationsSettings) other;
        return L.f(this.sections, notificationsSettings.sections) && L.f(this.info, notificationsSettings.info);
    }

    @k
    public final String getInfo() {
        return this.info;
    }

    @k
    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return this.info.hashCode() + (this.sections.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotificationsSettings(sections=");
        sb2.append(this.sections);
        sb2.append(", info=");
        return C22026a.c(sb2, this.info, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.sections, parcel);
        while (itJ.hasNext()) {
            ((Section) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.info);
    }
}
