package com.avito.android.saved_searches.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchData.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Header;", "header", "Lcom/avito/android/saved_searches/model/SavedSearchData$Name;", "name", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings;", "settings", "", "subscriptionId", "<init>", "(Lcom/avito/android/saved_searches/model/SavedSearchData$Header;Lcom/avito/android/saved_searches/model/SavedSearchData$Name;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings;Ljava/lang/String;)V", "Lcom/avito/android/saved_searches/model/SavedSearchData$Header;", "c", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Header;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Name;", "d", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Name;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings;", "e", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "ButtonAction", "Header", "Name", "Settings", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchData implements Parcelable {

    @k
    public static final Parcelable.Creator<SavedSearchData> CREATOR = new a();

    @c("header")
    @l
    private final Header header;

    @c("name")
    @l
    private final Name name;

    @c("settings")
    @l
    private final Settings settings;

    @c("subscriptionId")
    @l
    private final String subscriptionId;

    /* compiled from: SavedSearchData.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Header;", "Landroid/os/Parcelable;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Header implements Parcelable {

        @k
        public static final Parcelable.Creator<Header> CREATOR = new a();

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: SavedSearchData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Header> {
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                return new Header(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i12) {
                return new Header[i12];
            }
        }

        public Header(@l String str, @l String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return L.f(this.title, header.title) && L.f(this.subtitle, header.subtitle);
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Header(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            return C22026a.c(sb2, this.subtitle, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* compiled from: SavedSearchData.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Name;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/a;", "", "id", "title", "value", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getValue", "getPlaceholder", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Name implements Parcelable, com.avito.android.saved_searches.model.a {

        @k
        public static final Parcelable.Creator<Name> CREATOR = new a();

        @c("id")
        @k
        private final String id;

        @c("motivation")
        @l
        private final AttributedText motivation;

        @c(ChannelContext.Item.PLACEHOLDER)
        @l
        private final String placeholder;

        @c("title")
        @l
        private final String title;

        @c("value")
        @l
        private final String value;

        /* compiled from: SavedSearchData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Name> {
            @Override // android.os.Parcelable.Creator
            public final Name createFromParcel(Parcel parcel) {
                return new Name(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Name.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Name[] newArray(int i12) {
                return new Name[i12];
            }
        }

        public Name(@k String str, @l String str2, @l String str3, @l String str4, @l AttributedText attributedText) {
            this.id = str;
            this.title = str2;
            this.value = str3;
            this.placeholder = str4;
            this.motivation = attributedText;
        }

        public static Name a(Name name, String str) {
            return new Name(name.id, name.title, str, name.placeholder, name.motivation);
        }

        @l
        /* renamed from: c, reason: from getter */
        public final AttributedText getMotivation() {
            return this.motivation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Name)) {
                return false;
            }
            Name name = (Name) obj;
            return L.f(this.id, name.id) && L.f(this.title, name.title) && L.f(this.value, name.value) && L.f(this.placeholder, name.placeholder) && L.f(this.motivation, name.motivation);
        }

        @Override // com.avito.android.saved_searches.model.a
        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.saved_searches.model.a
        public final Object getValue() {
            return this.value;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.value;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placeholder;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            AttributedText attributedText = this.motivation;
            return iHashCode4 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Name(id=");
            sb2.append(this.id);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", placeholder=");
            sb2.append(this.placeholder);
            sb2.append(", motivation=");
            return com.avito.android.actions_sheet.a.w(sb2, this.motivation, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.value);
            parcel.writeString(this.placeholder);
            parcel.writeParcelable(this.motivation, i12);
        }

        @Override // com.avito.android.saved_searches.model.a
        @l
        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: SavedSearchData.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Push;", "push", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email;", "email", "<init>", "(Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Push;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email;)V", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Push;", "d", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Push;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email;", "c", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email;", "Email", "Push", "SettingsDetails", "WarningBanner", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Settings implements Parcelable {

        @k
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        @c("email")
        @l
        private final Email email;

        @c("push")
        @l
        private final Push push;

        /* compiled from: SavedSearchData.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001&B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/a;", "", "id", "icon", "title", "", "value", "email", "isConfirmed", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "warningBanner", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email$EmailConfirmation;", "emailConfirmation", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "settingsDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email$EmailConfirmation;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIcon", "getTitle", "Ljava/lang/Boolean;", "getValue", "()Ljava/lang/Boolean;", "c", "f", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "e", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email$EmailConfirmation;", "getEmailConfirmation", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email$EmailConfirmation;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "d", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "EmailConfirmation", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class Email implements Parcelable, com.avito.android.saved_searches.model.a {

            @k
            public static final Parcelable.Creator<Email> CREATOR = new a();

            @c("email")
            @l
            private final String email;

            @c("emailConfirmation")
            @l
            private final EmailConfirmation emailConfirmation;

            @c("icon")
            @l
            private final String icon;

            @c("id")
            @k
            private final String id;

            @c("isConfirmed")
            @l
            private final Boolean isConfirmed;

            @c("settings")
            @l
            private final SettingsDetails settingsDetails;

            @c("title")
            @l
            private final String title;

            @c("value")
            @l
            private final Boolean value;

            @c("warningBanner")
            @l
            private final WarningBanner warningBanner;

            /* compiled from: SavedSearchData.kt */
            @d
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Email$EmailConfirmation;", "Landroid/os/Parcelable;", "", "title", ChannelContext.Item.PLACEHOLDER, "motivation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPlaceholder", "getMotivation", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class EmailConfirmation implements Parcelable {

                @k
                public static final Parcelable.Creator<EmailConfirmation> CREATOR = new a();

                @c("motivation")
                @l
                private final String motivation;

                @c(ChannelContext.Item.PLACEHOLDER)
                @l
                private final String placeholder;

                @c("title")
                @l
                private final String title;

                /* compiled from: SavedSearchData.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<EmailConfirmation> {
                    @Override // android.os.Parcelable.Creator
                    public final EmailConfirmation createFromParcel(Parcel parcel) {
                        return new EmailConfirmation(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final EmailConfirmation[] newArray(int i12) {
                        return new EmailConfirmation[i12];
                    }
                }

                public EmailConfirmation(@l String str, @l String str2, @l String str3) {
                    this.title = str;
                    this.placeholder = str2;
                    this.motivation = str3;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EmailConfirmation)) {
                        return false;
                    }
                    EmailConfirmation emailConfirmation = (EmailConfirmation) obj;
                    return L.f(this.title, emailConfirmation.title) && L.f(this.placeholder, emailConfirmation.placeholder) && L.f(this.motivation, emailConfirmation.motivation);
                }

                public final int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.placeholder;
                    int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.motivation;
                    return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("EmailConfirmation(title=");
                    sb2.append(this.title);
                    sb2.append(", placeholder=");
                    sb2.append(this.placeholder);
                    sb2.append(", motivation=");
                    return C22026a.c(sb2, this.motivation, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.title);
                    parcel.writeString(this.placeholder);
                    parcel.writeString(this.motivation);
                }
            }

            /* compiled from: SavedSearchData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Email> {
                @Override // android.os.Parcelable.Creator
                public final Email createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Boolean boolValueOf2;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    String string4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Email(string, string2, string3, boolValueOf, string4, boolValueOf2, parcel.readInt() == 0 ? null : WarningBanner.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EmailConfirmation.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SettingsDetails.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Email[] newArray(int i12) {
                    return new Email[i12];
                }
            }

            public Email(@k String str, @l String str2, @l String str3, @l Boolean bool, @l String str4, @l Boolean bool2, @l WarningBanner warningBanner, @l EmailConfirmation emailConfirmation, @l SettingsDetails settingsDetails) {
                this.id = str;
                this.icon = str2;
                this.title = str3;
                this.value = bool;
                this.email = str4;
                this.isConfirmed = bool2;
                this.warningBanner = warningBanner;
                this.emailConfirmation = emailConfirmation;
                this.settingsDetails = settingsDetails;
            }

            public static Email a(Email email, Boolean bool, SettingsDetails settingsDetails, int i12) {
                Boolean bool2 = Boolean.TRUE;
                String str = email.id;
                String str2 = email.icon;
                String str3 = email.title;
                if ((i12 & 8) != 0) {
                    bool = email.value;
                }
                Boolean bool3 = bool;
                String str4 = email.email;
                if ((i12 & 32) != 0) {
                    bool2 = email.isConfirmed;
                }
                Boolean bool4 = bool2;
                WarningBanner warningBanner = email.warningBanner;
                EmailConfirmation emailConfirmation = email.emailConfirmation;
                if ((i12 & 256) != 0) {
                    settingsDetails = email.settingsDetails;
                }
                return new Email(str, str2, str3, bool3, str4, bool4, warningBanner, emailConfirmation, settingsDetails);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final String getEmail() {
                return this.email;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final SettingsDetails getSettingsDetails() {
                return this.settingsDetails;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final WarningBanner getWarningBanner() {
                return this.warningBanner;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Email)) {
                    return false;
                }
                Email email = (Email) obj;
                return L.f(this.id, email.id) && L.f(this.icon, email.icon) && L.f(this.title, email.title) && L.f(this.value, email.value) && L.f(this.email, email.email) && L.f(this.isConfirmed, email.isConfirmed) && L.f(this.warningBanner, email.warningBanner) && L.f(this.emailConfirmation, email.emailConfirmation) && L.f(this.settingsDetails, email.settingsDetails);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final Boolean getIsConfirmed() {
                return this.isConfirmed;
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            @Override // com.avito.android.saved_searches.model.a
            @k
            public final String getId() {
                return this.id;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.saved_searches.model.a
            @l
            public final Boolean getValue() {
                return this.value;
            }

            public final int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.icon;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.title;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.value;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str3 = this.email;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool2 = this.isConfirmed;
                int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                WarningBanner warningBanner = this.warningBanner;
                int iHashCode7 = (iHashCode6 + (warningBanner == null ? 0 : warningBanner.hashCode())) * 31;
                EmailConfirmation emailConfirmation = this.emailConfirmation;
                int iHashCode8 = (iHashCode7 + (emailConfirmation == null ? 0 : emailConfirmation.hashCode())) * 31;
                SettingsDetails settingsDetails = this.settingsDetails;
                return iHashCode8 + (settingsDetails != null ? settingsDetails.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Email(id=" + this.id + ", icon=" + this.icon + ", title=" + this.title + ", value=" + this.value + ", email=" + this.email + ", isConfirmed=" + this.isConfirmed + ", warningBanner=" + this.warningBanner + ", emailConfirmation=" + this.emailConfirmation + ", settingsDetails=" + this.settingsDetails + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeString(this.icon);
                parcel.writeString(this.title);
                Boolean bool = this.value;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                parcel.writeString(this.email);
                Boolean bool2 = this.isConfirmed;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool2);
                }
                WarningBanner warningBanner = this.warningBanner;
                if (warningBanner == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    warningBanner.writeToParcel(parcel, i12);
                }
                EmailConfirmation emailConfirmation = this.emailConfirmation;
                if (emailConfirmation == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    emailConfirmation.writeToParcel(parcel, i12);
                }
                SettingsDetails settingsDetails = this.settingsDetails;
                if (settingsDetails == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    settingsDetails.writeToParcel(parcel, i12);
                }
            }

            @Override // com.avito.android.saved_searches.model.a
            public final Object getValue() {
                return this.value;
            }
        }

        /* compiled from: SavedSearchData.kt */
        @d
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$Push;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/a;", "", "id", "icon", "title", "", "value", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "warningBanner", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "settingsDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getIcon", "getTitle", "Ljava/lang/Boolean;", "getValue", "()Ljava/lang/Boolean;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "d", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "c", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Push implements Parcelable, com.avito.android.saved_searches.model.a {

            @k
            public static final Parcelable.Creator<Push> CREATOR = new a();

            @c("icon")
            @l
            private final String icon;

            @c("id")
            @k
            private final String id;

            @c("settings")
            @l
            private final SettingsDetails settingsDetails;

            @c("title")
            @l
            private final String title;

            @c("value")
            @l
            private final Boolean value;

            @c("warningBanner")
            @l
            private final WarningBanner warningBanner;

            /* compiled from: SavedSearchData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Push> {
                @Override // android.os.Parcelable.Creator
                public final Push createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Push(string, string2, string3, boolValueOf, parcel.readInt() == 0 ? null : WarningBanner.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SettingsDetails.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Push[] newArray(int i12) {
                    return new Push[i12];
                }
            }

            public Push(@k String str, @l String str2, @l String str3, @l Boolean bool, @l WarningBanner warningBanner, @l SettingsDetails settingsDetails) {
                this.id = str;
                this.icon = str2;
                this.title = str3;
                this.value = bool;
                this.warningBanner = warningBanner;
                this.settingsDetails = settingsDetails;
            }

            public static Push a(Push push, Boolean bool, SettingsDetails settingsDetails, int i12) {
                String str = push.id;
                String str2 = push.icon;
                String str3 = push.title;
                if ((i12 & 8) != 0) {
                    bool = push.value;
                }
                Boolean bool2 = bool;
                WarningBanner warningBanner = push.warningBanner;
                if ((i12 & 32) != 0) {
                    settingsDetails = push.settingsDetails;
                }
                return new Push(str, str2, str3, bool2, warningBanner, settingsDetails);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final SettingsDetails getSettingsDetails() {
                return this.settingsDetails;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final WarningBanner getWarningBanner() {
                return this.warningBanner;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Push)) {
                    return false;
                }
                Push push = (Push) obj;
                return L.f(this.id, push.id) && L.f(this.icon, push.icon) && L.f(this.title, push.title) && L.f(this.value, push.value) && L.f(this.warningBanner, push.warningBanner) && L.f(this.settingsDetails, push.settingsDetails);
            }

            @l
            public final String getIcon() {
                return this.icon;
            }

            @Override // com.avito.android.saved_searches.model.a
            @k
            public final String getId() {
                return this.id;
            }

            @l
            public final String getTitle() {
                return this.title;
            }

            @Override // com.avito.android.saved_searches.model.a
            @l
            public final Boolean getValue() {
                return this.value;
            }

            public final int hashCode() {
                int iHashCode = this.id.hashCode() * 31;
                String str = this.icon;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.title;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.value;
                int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                WarningBanner warningBanner = this.warningBanner;
                int iHashCode5 = (iHashCode4 + (warningBanner == null ? 0 : warningBanner.hashCode())) * 31;
                SettingsDetails settingsDetails = this.settingsDetails;
                return iHashCode5 + (settingsDetails != null ? settingsDetails.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "Push(id=" + this.id + ", icon=" + this.icon + ", title=" + this.title + ", value=" + this.value + ", warningBanner=" + this.warningBanner + ", settingsDetails=" + this.settingsDetails + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.id);
                parcel.writeString(this.icon);
                parcel.writeString(this.title);
                Boolean bool = this.value;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    C0.l(parcel, 1, bool);
                }
                WarningBanner warningBanner = this.warningBanner;
                if (warningBanner == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    warningBanner.writeToParcel(parcel, i12);
                }
                SettingsDetails settingsDetails = this.settingsDetails;
                if (settingsDetails == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    settingsDetails.writeToParcel(parcel, i12);
                }
            }

            @Override // com.avito.android.saved_searches.model.a
            public final Object getValue() {
                return this.value;
            }
        }

        /* compiled from: SavedSearchData.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails;", "Landroid/os/Parcelable;", "", "screenTitle", "Lcom/avito/android/remote/model/text/AttributedText;", RequestReviewResultKt.INFO_TYPE, "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;", "periodicity", "dayOfWeek", "timeOfDay", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;", "e", "()Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;", "c", "g", "Parameter", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SettingsDetails implements Parcelable {

            @k
            public static final Parcelable.Creator<SettingsDetails> CREATOR = new a();

            @c("dayOfWeek")
            @l
            private final Parameter dayOfWeek;

            @c("infoLabel")
            @l
            private final AttributedText info;

            @c("periodicity")
            @l
            private final Parameter periodicity;

            @c("screenTitle")
            @l
            private final String screenTitle;

            @c("timeOfDay")
            @l
            private final Parameter timeOfDay;

            /* compiled from: SavedSearchData.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002$%Bq\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b \u0010\u001dR(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/a;", "", "id", "title", "", "multipleSelection", "", "value", "emptyValueError", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter$Dependency;", "dependencies", "Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter$Option;", "options", "", "Lcom/avito/android/remote/model/text/AttributedText;", "motivations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Ljava/util/List;", "h", "()Ljava/util/List;", "d", "c", "g", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Dependency", "Option", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final /* data */ class Parameter implements Parcelable, com.avito.android.saved_searches.model.a {

                @k
                public static final Parcelable.Creator<Parameter> CREATOR = new a();

                @c("dependencies")
                @l
                private final List<Dependency> dependencies;

                @com.avito.android.gson.c
                @c("emptyErrorMessage")
                @k
                private final String emptyValueError;

                @c("id")
                @k
                private final String id;

                @c("motivations")
                @l
                private final Map<String, AttributedText> motivations;

                @c("multipleSelection")
                @l
                private final Boolean multipleSelection;

                @c("options")
                @l
                private final List<Option> options;

                @c("title")
                @l
                private final String title;

                @c("value")
                @l
                private final List<String> value;

                /* compiled from: SavedSearchData.kt */
                @d
                @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter$Dependency;", "Landroid/os/Parcelable;", "Lcom/avito/android/saved_searches/model/a;", "", "id", "", "value", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Dependency implements Parcelable, com.avito.android.saved_searches.model.a {

                    @k
                    public static final Parcelable.Creator<Dependency> CREATOR = new a();

                    @c("id")
                    @k
                    private final String id;

                    @c("value")
                    @k
                    private final List<String> value;

                    /* compiled from: SavedSearchData.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Dependency> {
                        @Override // android.os.Parcelable.Creator
                        public final Dependency createFromParcel(Parcel parcel) {
                            return new Dependency(parcel.readString(), parcel.createStringArrayList());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Dependency[] newArray(int i12) {
                            return new Dependency[i12];
                        }
                    }

                    public Dependency(@k String str, @k List<String> list) {
                        this.id = str;
                        this.value = list;
                    }

                    @k
                    public final List<String> c() {
                        return this.value;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Dependency)) {
                            return false;
                        }
                        Dependency dependency = (Dependency) obj;
                        return L.f(this.id, dependency.id) && L.f(this.value, dependency.value);
                    }

                    @Override // com.avito.android.saved_searches.model.a
                    @k
                    public final String getId() {
                        return this.id;
                    }

                    @Override // com.avito.android.saved_searches.model.a
                    public final Object getValue() {
                        return this.value;
                    }

                    public final int hashCode() {
                        return this.value.hashCode() + (this.id.hashCode() * 31);
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Dependency(id=");
                        sb2.append(this.id);
                        sb2.append(", value=");
                        return H.p(sb2, this.value, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.id);
                        parcel.writeStringList(this.value);
                    }
                }

                /* compiled from: SavedSearchData.kt */
                @d
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$SettingsDetails$Parameter$Option;", "Landroid/os/Parcelable;", "", "id", "title", "detailedTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "c", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Option implements Parcelable {

                    @k
                    public static final Parcelable.Creator<Option> CREATOR = new a();

                    @c("detailedTitle")
                    @l
                    private final String detailedTitle;

                    @c("id")
                    @k
                    private final String id;

                    @c("title")
                    @k
                    private final String title;

                    /* compiled from: SavedSearchData.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    public static final class a implements Parcelable.Creator<Option> {
                        @Override // android.os.Parcelable.Creator
                        public final Option createFromParcel(Parcel parcel) {
                            return new Option(parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Option[] newArray(int i12) {
                            return new Option[i12];
                        }
                    }

                    public Option(@k String str, @k String str2, @l String str3) {
                        this.id = str;
                        this.title = str2;
                        this.detailedTitle = str3;
                    }

                    @l
                    /* renamed from: c, reason: from getter */
                    public final String getDetailedTitle() {
                        return this.detailedTitle;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(@l Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Option)) {
                            return false;
                        }
                        Option option = (Option) obj;
                        return L.f(this.id, option.id) && L.f(this.title, option.title) && L.f(this.detailedTitle, option.detailedTitle);
                    }

                    @k
                    public final String getId() {
                        return this.id;
                    }

                    @k
                    public final String getTitle() {
                        return this.title;
                    }

                    public final int hashCode() {
                        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
                        String str = this.detailedTitle;
                        return iD2 + (str == null ? 0 : str.hashCode());
                    }

                    @k
                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("Option(id=");
                        sb2.append(this.id);
                        sb2.append(", title=");
                        sb2.append(this.title);
                        sb2.append(", detailedTitle=");
                        return C22026a.c(sb2, this.detailedTitle, ')');
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(@k Parcel parcel, int i12) {
                        parcel.writeString(this.id);
                        parcel.writeString(this.title);
                        parcel.writeString(this.detailedTitle);
                    }
                }

                /* compiled from: SavedSearchData.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Parameter> {
                    @Override // android.os.Parcelable.Creator
                    public final Parameter createFromParcel(Parcel parcel) {
                        Boolean boolValueOf;
                        ArrayList arrayList;
                        ArrayList arrayList2;
                        LinkedHashMap linkedHashMap;
                        String string = parcel.readString();
                        String string2 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                        String string3 = parcel.readString();
                        if (parcel.readInt() == 0) {
                            arrayList = null;
                        } else {
                            int i12 = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(i12);
                            int iC2 = 0;
                            while (iC2 != i12) {
                                iC2 = com.avito.android.actions_sheet.a.c(Dependency.CREATOR, parcel, arrayList3, iC2, 1);
                            }
                            arrayList = arrayList3;
                        }
                        if (parcel.readInt() == 0) {
                            arrayList2 = null;
                        } else {
                            int i13 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(i13);
                            int iC3 = 0;
                            while (iC3 != i13) {
                                iC3 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList4, iC3, 1);
                            }
                            arrayList2 = arrayList4;
                        }
                        if (parcel.readInt() == 0) {
                            linkedHashMap = null;
                        } else {
                            int i14 = parcel.readInt();
                            linkedHashMap = new LinkedHashMap(i14);
                            int iC4 = 0;
                            while (iC4 != i14) {
                                iC4 = f.c(Parameter.class, parcel, linkedHashMap, parcel.readString(), iC4, 1);
                            }
                        }
                        return new Parameter(string, string2, boolValueOf, arrayListCreateStringArrayList, string3, arrayList, arrayList2, linkedHashMap);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Parameter[] newArray(int i12) {
                        return new Parameter[i12];
                    }
                }

                public Parameter(@k String str, @l String str2, @l Boolean bool, @l List<String> list, @k String str3, @l List<Dependency> list2, @l List<Option> list3, @l Map<String, AttributedText> map) {
                    this.id = str;
                    this.title = str2;
                    this.multipleSelection = bool;
                    this.value = list;
                    this.emptyValueError = str3;
                    this.dependencies = list2;
                    this.options = list3;
                    this.motivations = map;
                }

                public static Parameter a(Parameter parameter, List list) {
                    return new Parameter(parameter.id, parameter.title, parameter.multipleSelection, list, parameter.emptyValueError, parameter.dependencies, parameter.options, parameter.motivations);
                }

                @l
                public final List<Dependency> c() {
                    return this.dependencies;
                }

                @k
                /* renamed from: d, reason: from getter */
                public final String getEmptyValueError() {
                    return this.emptyValueError;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @l
                public final Map<String, AttributedText> e() {
                    return this.motivations;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Parameter)) {
                        return false;
                    }
                    Parameter parameter = (Parameter) obj;
                    return L.f(this.id, parameter.id) && L.f(this.title, parameter.title) && L.f(this.multipleSelection, parameter.multipleSelection) && L.f(this.value, parameter.value) && L.f(this.emptyValueError, parameter.emptyValueError) && L.f(this.dependencies, parameter.dependencies) && L.f(this.options, parameter.options) && L.f(this.motivations, parameter.motivations);
                }

                @l
                /* renamed from: f, reason: from getter */
                public final Boolean getMultipleSelection() {
                    return this.multipleSelection;
                }

                @l
                public final List<Option> g() {
                    return this.options;
                }

                @Override // com.avito.android.saved_searches.model.a
                @k
                public final String getId() {
                    return this.id;
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @Override // com.avito.android.saved_searches.model.a
                public final Object getValue() {
                    return this.value;
                }

                @l
                public final List<String> h() {
                    return this.value;
                }

                public final int hashCode() {
                    int iHashCode = this.id.hashCode() * 31;
                    String str = this.title;
                    int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                    Boolean bool = this.multipleSelection;
                    int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
                    List<String> list = this.value;
                    int iD2 = H.d((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.emptyValueError);
                    List<Dependency> list2 = this.dependencies;
                    int iHashCode4 = (iD2 + (list2 == null ? 0 : list2.hashCode())) * 31;
                    List<Option> list3 = this.options;
                    int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
                    Map<String, AttributedText> map = this.motivations;
                    return iHashCode5 + (map != null ? map.hashCode() : 0);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Parameter(id=");
                    sb2.append(this.id);
                    sb2.append(", title=");
                    sb2.append(this.title);
                    sb2.append(", multipleSelection=");
                    sb2.append(this.multipleSelection);
                    sb2.append(", value=");
                    sb2.append(this.value);
                    sb2.append(", emptyValueError=");
                    sb2.append(this.emptyValueError);
                    sb2.append(", dependencies=");
                    sb2.append(this.dependencies);
                    sb2.append(", options=");
                    sb2.append(this.options);
                    sb2.append(", motivations=");
                    return r.w(sb2, this.motivations, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.id);
                    parcel.writeString(this.title);
                    Boolean bool = this.multipleSelection;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        C0.l(parcel, 1, bool);
                    }
                    parcel.writeStringList(this.value);
                    parcel.writeString(this.emptyValueError);
                    List<Dependency> list = this.dependencies;
                    if (list == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                        while (itA.hasNext()) {
                            ((Dependency) itA.next()).writeToParcel(parcel, i12);
                        }
                    }
                    List<Option> list2 = this.options;
                    if (list2 == null) {
                        parcel.writeInt(0);
                    } else {
                        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
                        while (itA2.hasNext()) {
                            ((Option) itA2.next()).writeToParcel(parcel, i12);
                        }
                    }
                    Map<String, AttributedText> map = this.motivations;
                    if (map == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    Iterator itH = C0.h(parcel, 1, map);
                    while (itH.hasNext()) {
                        Map.Entry entry = (Map.Entry) itH.next();
                        parcel.writeString((String) entry.getKey());
                        parcel.writeParcelable((Parcelable) entry.getValue(), i12);
                    }
                }
            }

            /* compiled from: SavedSearchData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SettingsDetails> {
                @Override // android.os.Parcelable.Creator
                public final SettingsDetails createFromParcel(Parcel parcel) {
                    return new SettingsDetails(parcel.readString(), (AttributedText) parcel.readParcelable(SettingsDetails.class.getClassLoader()), parcel.readInt() == 0 ? null : Parameter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Parameter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Parameter.CREATOR.createFromParcel(parcel) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final SettingsDetails[] newArray(int i12) {
                    return new SettingsDetails[i12];
                }
            }

            public SettingsDetails(@l String str, @l AttributedText attributedText, @l Parameter parameter, @l Parameter parameter2, @l Parameter parameter3) {
                this.screenTitle = str;
                this.info = attributedText;
                this.periodicity = parameter;
                this.dayOfWeek = parameter2;
                this.timeOfDay = parameter3;
            }

            public static SettingsDetails a(SettingsDetails settingsDetails, Parameter parameter, Parameter parameter2, Parameter parameter3, int i12) {
                String str = settingsDetails.screenTitle;
                AttributedText attributedText = settingsDetails.info;
                if ((i12 & 4) != 0) {
                    parameter = settingsDetails.periodicity;
                }
                Parameter parameter4 = parameter;
                if ((i12 & 8) != 0) {
                    parameter2 = settingsDetails.dayOfWeek;
                }
                Parameter parameter5 = parameter2;
                if ((i12 & 16) != 0) {
                    parameter3 = settingsDetails.timeOfDay;
                }
                settingsDetails.getClass();
                return new SettingsDetails(str, attributedText, parameter4, parameter5, parameter3);
            }

            @l
            /* renamed from: c, reason: from getter */
            public final Parameter getDayOfWeek() {
                return this.dayOfWeek;
            }

            @l
            /* renamed from: d, reason: from getter */
            public final AttributedText getInfo() {
                return this.info;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @l
            /* renamed from: e, reason: from getter */
            public final Parameter getPeriodicity() {
                return this.periodicity;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SettingsDetails)) {
                    return false;
                }
                SettingsDetails settingsDetails = (SettingsDetails) obj;
                return L.f(this.screenTitle, settingsDetails.screenTitle) && L.f(this.info, settingsDetails.info) && L.f(this.periodicity, settingsDetails.periodicity) && L.f(this.dayOfWeek, settingsDetails.dayOfWeek) && L.f(this.timeOfDay, settingsDetails.timeOfDay);
            }

            @l
            /* renamed from: f, reason: from getter */
            public final String getScreenTitle() {
                return this.screenTitle;
            }

            @l
            /* renamed from: g, reason: from getter */
            public final Parameter getTimeOfDay() {
                return this.timeOfDay;
            }

            public final int hashCode() {
                String str = this.screenTitle;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                AttributedText attributedText = this.info;
                int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
                Parameter parameter = this.periodicity;
                int iHashCode3 = (iHashCode2 + (parameter == null ? 0 : parameter.hashCode())) * 31;
                Parameter parameter2 = this.dayOfWeek;
                int iHashCode4 = (iHashCode3 + (parameter2 == null ? 0 : parameter2.hashCode())) * 31;
                Parameter parameter3 = this.timeOfDay;
                return iHashCode4 + (parameter3 != null ? parameter3.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "SettingsDetails(screenTitle=" + this.screenTitle + ", info=" + this.info + ", periodicity=" + this.periodicity + ", dayOfWeek=" + this.dayOfWeek + ", timeOfDay=" + this.timeOfDay + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.screenTitle);
                parcel.writeParcelable(this.info, i12);
                Parameter parameter = this.periodicity;
                if (parameter == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parameter.writeToParcel(parcel, i12);
                }
                Parameter parameter2 = this.dayOfWeek;
                if (parameter2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parameter2.writeToParcel(parcel, i12);
                }
                Parameter parameter3 = this.timeOfDay;
                if (parameter3 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parameter3.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: SavedSearchData.kt */
        @d
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$Settings$WarningBanner;", "Landroid/os/Parcelable;", "", "text", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/saved_searches/model/SavedSearchData$ButtonAction;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/saved_searches/model/SavedSearchData$ButtonAction;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "getStyle", "Lcom/avito/android/saved_searches/model/SavedSearchData$ButtonAction;", "c", "()Lcom/avito/android/saved_searches/model/SavedSearchData$ButtonAction;", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WarningBanner implements Parcelable {

            @k
            public static final Parcelable.Creator<WarningBanner> CREATOR = new a();

            @c("action")
            @l
            private final ButtonAction action;

            @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
            @l
            private final String style;

            @c("text")
            @l
            private final String text;

            /* compiled from: SavedSearchData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<WarningBanner> {
                @Override // android.os.Parcelable.Creator
                public final WarningBanner createFromParcel(Parcel parcel) {
                    return new WarningBanner(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ButtonAction.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final WarningBanner[] newArray(int i12) {
                    return new WarningBanner[i12];
                }
            }

            public WarningBanner(@l String str, @l String str2, @l ButtonAction buttonAction) {
                this.text = str;
                this.style = str2;
                this.action = buttonAction;
            }

            @l
            /* renamed from: c, reason: from getter */
            public final ButtonAction getAction() {
                return this.action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WarningBanner)) {
                    return false;
                }
                WarningBanner warningBanner = (WarningBanner) obj;
                return L.f(this.text, warningBanner.text) && L.f(this.style, warningBanner.style) && L.f(this.action, warningBanner.action);
            }

            @l
            public final String getStyle() {
                return this.style;
            }

            @l
            public final String getText() {
                return this.text;
            }

            public final int hashCode() {
                String str = this.text;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.style;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                ButtonAction buttonAction = this.action;
                return iHashCode2 + (buttonAction != null ? buttonAction.hashCode() : 0);
            }

            @k
            public final String toString() {
                return "WarningBanner(text=" + this.text + ", style=" + this.style + ", action=" + this.action + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.text);
                parcel.writeString(this.style);
                ButtonAction buttonAction = this.action;
                if (buttonAction == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    buttonAction.writeToParcel(parcel, i12);
                }
            }
        }

        /* compiled from: SavedSearchData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Settings> {
            @Override // android.os.Parcelable.Creator
            public final Settings createFromParcel(Parcel parcel) {
                return new Settings(parcel.readInt() == 0 ? null : Push.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Email.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Settings[] newArray(int i12) {
                return new Settings[i12];
            }
        }

        public Settings(@l Push push, @l Email email) {
            this.push = push;
            this.email = email;
        }

        public static Settings a(Settings settings, Push push, Email email, int i12) {
            if ((i12 & 1) != 0) {
                push = settings.push;
            }
            if ((i12 & 2) != 0) {
                email = settings.email;
            }
            return new Settings(push, email);
        }

        @l
        /* renamed from: c, reason: from getter */
        public final Email getEmail() {
            return this.email;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final Push getPush() {
            return this.push;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) obj;
            return L.f(this.push, settings.push) && L.f(this.email, settings.email);
        }

        public final int hashCode() {
            Push push = this.push;
            int iHashCode = (push == null ? 0 : push.hashCode()) * 31;
            Email email = this.email;
            return iHashCode + (email != null ? email.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Settings(push=" + this.push + ", email=" + this.email + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Push push = this.push;
            if (push == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                push.writeToParcel(parcel, i12);
            }
            Email email = this.email;
            if (email == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                email.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: SavedSearchData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchData> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchData createFromParcel(Parcel parcel) {
            return new SavedSearchData(parcel.readInt() == 0 ? null : Header.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Name.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Settings.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchData[] newArray(int i12) {
            return new SavedSearchData[i12];
        }
    }

    public SavedSearchData(@l Header header, @l Name name, @l Settings settings, @l String str) {
        this.header = header;
        this.name = name;
        this.settings = settings;
        this.subscriptionId = str;
    }

    public static SavedSearchData a(SavedSearchData savedSearchData, Name name, Settings settings, int i12) {
        Header header = savedSearchData.header;
        if ((i12 & 2) != 0) {
            name = savedSearchData.name;
        }
        if ((i12 & 4) != 0) {
            settings = savedSearchData.settings;
        }
        String str = savedSearchData.subscriptionId;
        savedSearchData.getClass();
        return new SavedSearchData(header, name, settings, str);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Header getHeader() {
        return this.header;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Settings getSettings() {
        return this.settings;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchData)) {
            return false;
        }
        SavedSearchData savedSearchData = (SavedSearchData) obj;
        return L.f(this.header, savedSearchData.header) && L.f(this.name, savedSearchData.name) && L.f(this.settings, savedSearchData.settings) && L.f(this.subscriptionId, savedSearchData.subscriptionId);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final int hashCode() {
        Header header = this.header;
        int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
        Name name = this.name;
        int iHashCode2 = (iHashCode + (name == null ? 0 : name.hashCode())) * 31;
        Settings settings = this.settings;
        int iHashCode3 = (iHashCode2 + (settings == null ? 0 : settings.hashCode())) * 31;
        String str = this.subscriptionId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchData(header=");
        sb2.append(this.header);
        sb2.append(", name=");
        sb2.append(this.name);
        sb2.append(", settings=");
        sb2.append(this.settings);
        sb2.append(", subscriptionId=");
        return C22026a.c(sb2, this.subscriptionId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Header header = this.header;
        if (header == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            header.writeToParcel(parcel, i12);
        }
        Name name = this.name;
        if (name == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            name.writeToParcel(parcel, i12);
        }
        Settings settings = this.settings;
        if (settings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            settings.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.subscriptionId);
    }

    /* compiled from: SavedSearchData.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/avito/android/saved_searches/model/SavedSearchData$ButtonAction;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getStyle", "_avito-discouraged_avito-network_saved-searches"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonAction> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink deeplink;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
        @l
        private final String style;

        @c("title")
        @k
        private final String title;

        /* compiled from: SavedSearchData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonAction> {
            @Override // android.os.Parcelable.Creator
            public final ButtonAction createFromParcel(Parcel parcel) {
                return new ButtonAction(parcel.readString(), (DeepLink) parcel.readParcelable(ButtonAction.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonAction[] newArray(int i12) {
                return new ButtonAction[i12];
            }
        }

        public ButtonAction(@k String str, @l DeepLink deepLink, @l String str2) {
            this.title = str;
            this.deeplink = deepLink;
            this.style = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return L.f(this.title, buttonAction.title) && L.f(this.deeplink, buttonAction.deeplink) && L.f(this.style, buttonAction.style);
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getStyle() {
            return this.style;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            DeepLink deepLink = this.deeplink;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str = this.style;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonAction(title=");
            sb2.append(this.title);
            sb2.append(", deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", style=");
            return C22026a.c(sb2, this.style, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deeplink, i12);
            parcel.writeString(this.style);
        }

        public /* synthetic */ ButtonAction(String str, DeepLink deepLink, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : deepLink, (i12 & 4) != 0 ? null : str2);
        }
    }
}
