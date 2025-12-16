package com.avito.android.user_adverts.tab_screens.adverts.domain.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertActionsInfoDomain.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain;", "Landroid/os/Parcelable;", "AttributedDescription", "AttributedShortcutVariant", "BadgeInfo", "a", "Config", "c", "DialogInfo", "Limit", "TextDescription", "TextShortcutVariant", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertActionsInfoDomain implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertActionsInfoDomain> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Limit f314984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Config f314985c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Config f314986d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Config f314987e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Config f314988f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Config f314989g;

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$AttributedDescription;", "Landroid/os/Parcelable;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c;", "Lcom/avito/android/remote/model/text/AttributedText;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AttributedDescription implements Parcelable, c<AttributedText> {

        @k
        public static final Parcelable.Creator<AttributedDescription> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f314990b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f314991c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f314992d;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedDescription> {
            @Override // android.os.Parcelable.Creator
            public final AttributedDescription createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AttributedText attributedText = (AttributedText) parcel.readParcelable(AttributedDescription.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AttributedDescription.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(AttributedShortcutVariant.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new AttributedDescription(attributedText, attributedText2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedDescription[] newArray(int i12) {
                return new AttributedDescription[i12];
            }
        }

        public AttributedDescription(@k AttributedText attributedText, @l AttributedText attributedText2, @l ArrayList arrayList) {
            this.f314990b = attributedText;
            this.f314991c = attributedText2;
            this.f314992d = arrayList;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        @l
        public final List<c.a<AttributedText>> c() {
            return this.f314992d;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        /* renamed from: d, reason: from getter */
        public final AttributedText getF315007c() {
            return this.f314991c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttributedDescription)) {
                return false;
            }
            AttributedDescription attributedDescription = (AttributedDescription) obj;
            return L.f(this.f314990b, attributedDescription.f314990b) && L.f(this.f314991c, attributedDescription.f314991c) && L.f(this.f314992d, attributedDescription.f314992d);
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        /* renamed from: getDefault, reason: from getter */
        public final AttributedText getF315006b() {
            return this.f314990b;
        }

        public final int hashCode() {
            int iHashCode = this.f314990b.hashCode() * 31;
            AttributedText attributedText = this.f314991c;
            int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            ArrayList arrayList = this.f314992d;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedDescription(default=");
            sb2.append(this.f314990b);
            sb2.append(", multiDefault=");
            sb2.append(this.f314991c);
            sb2.append(", variant=");
            return e.p(sb2, this.f314992d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f314990b, i12);
            parcel.writeParcelable(this.f314991c, i12);
            ArrayList arrayList = this.f314992d;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((AttributedShortcutVariant) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$AttributedShortcutVariant;", "Landroid/os/Parcelable;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c$a;", "Lcom/avito/android/remote/model/text/AttributedText;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AttributedShortcutVariant implements Parcelable, c.a<AttributedText> {

        @k
        public static final Parcelable.Creator<AttributedShortcutVariant> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f314993b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f314994c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Set<String> f314995d;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AttributedShortcutVariant> {
            @Override // android.os.Parcelable.Creator
            public final AttributedShortcutVariant createFromParcel(Parcel parcel) {
                AttributedText attributedText = (AttributedText) parcel.readParcelable(AttributedShortcutVariant.class.getClassLoader());
                AttributedText attributedText2 = (AttributedText) parcel.readParcelable(AttributedShortcutVariant.class.getClassLoader());
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new AttributedShortcutVariant(attributedText, attributedText2, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final AttributedShortcutVariant[] newArray(int i12) {
                return new AttributedShortcutVariant[i12];
            }
        }

        public AttributedShortcutVariant(@k AttributedText attributedText, @l AttributedText attributedText2, @k Set<String> set) {
            this.f314993b = attributedText;
            this.f314994c = attributedText2;
            this.f314995d = set;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        @k
        public final Set<String> c() {
            return this.f314995d;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        /* renamed from: d, reason: from getter */
        public final AttributedText getF315010c() {
            return this.f314994c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttributedShortcutVariant)) {
                return false;
            }
            AttributedShortcutVariant attributedShortcutVariant = (AttributedShortcutVariant) obj;
            return L.f(this.f314993b, attributedShortcutVariant.f314993b) && L.f(this.f314994c, attributedShortcutVariant.f314994c) && L.f(this.f314995d, attributedShortcutVariant.f314995d);
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        /* renamed from: getText, reason: from getter */
        public final AttributedText getF315009b() {
            return this.f314993b;
        }

        public final int hashCode() {
            int iHashCode = this.f314993b.hashCode() * 31;
            AttributedText attributedText = this.f314994c;
            return this.f314995d.hashCode() + ((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AttributedShortcutVariant(text=");
            sb2.append(this.f314993b);
            sb2.append(", multiText=");
            sb2.append(this.f314994c);
            sb2.append(", useForShortcut=");
            return AK.c.u(sb2, this.f314995d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f314993b, i12);
            parcel.writeParcelable(this.f314994c, i12);
            Set<String> set = this.f314995d;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$BadgeInfo;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BadgeInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<BadgeInfo> CREATOR = new a();

        @com.google.gson.annotations.c("text")
        @k
        private final String text;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BadgeInfo> {
            @Override // android.os.Parcelable.Creator
            public final BadgeInfo createFromParcel(Parcel parcel) {
                return new BadgeInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BadgeInfo[] newArray(int i12) {
                return new BadgeInfo[i12];
            }
        }

        public BadgeInfo(@k String str) {
            this.text = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BadgeInfo) && L.f(this.text, ((BadgeInfo) obj).text);
        }

        @k
        public final String getText() {
            return this.text;
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("BadgeInfo(text="), this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.text);
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$Config;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$a;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements a, Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DialogInfo f314996b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final TextDescription f314997c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final BadgeInfo f314998d;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Config> {
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                return new Config(parcel.readInt() == 0 ? null : DialogInfo.CREATOR.createFromParcel(parcel), TextDescription.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BadgeInfo.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@l DialogInfo dialogInfo, @k TextDescription textDescription, @l BadgeInfo badgeInfo) {
            this.f314996b = dialogInfo;
            this.f314997c = textDescription;
            this.f314998d = badgeInfo;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.a
        @l
        /* renamed from: c, reason: from getter */
        public final DialogInfo getF314996b() {
            return this.f314996b;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final TextDescription getF314997c() {
            return this.f314997c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return L.f(this.f314996b, config.f314996b) && L.f(this.f314997c, config.f314997c) && L.f(this.f314998d, config.f314998d);
        }

        public final int hashCode() {
            DialogInfo dialogInfo = this.f314996b;
            int iHashCode = (this.f314997c.hashCode() + ((dialogInfo == null ? 0 : dialogInfo.hashCode()) * 31)) * 31;
            BadgeInfo badgeInfo = this.f314998d;
            return iHashCode + (badgeInfo != null ? badgeInfo.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Config(dialogInfo=" + this.f314996b + ", title=" + this.f314997c + ", badgeInfo=" + this.f314998d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            DialogInfo dialogInfo = this.f314996b;
            if (dialogInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                dialogInfo.writeToParcel(parcel, i12);
            }
            this.f314997c.writeToParcel(parcel, i12);
            BadgeInfo badgeInfo = this.f314998d;
            if (badgeInfo == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badgeInfo.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$DialogInfo;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DialogInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<DialogInfo> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedDescription f314999b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f315000c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f315001d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f315002e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f315003f;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DialogInfo> {
            @Override // android.os.Parcelable.Creator
            public final DialogInfo createFromParcel(Parcel parcel) {
                return new DialogInfo(AttributedDescription.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DialogInfo[] newArray(int i12) {
                return new DialogInfo[i12];
            }
        }

        public DialogInfo(@k AttributedDescription attributedDescription, @k String str, @k String str2, boolean z12, @k String str3) {
            this.f314999b = attributedDescription;
            this.f315000c = str;
            this.f315001d = str2;
            this.f315002e = z12;
            this.f315003f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DialogInfo)) {
                return false;
            }
            DialogInfo dialogInfo = (DialogInfo) obj;
            return L.f(this.f314999b, dialogInfo.f314999b) && L.f(this.f315000c, dialogInfo.f315000c) && L.f(this.f315001d, dialogInfo.f315001d) && this.f315002e == dialogInfo.f315002e && L.f(this.f315003f, dialogInfo.f315003f);
        }

        public final int hashCode() {
            return this.f315003f.hashCode() + r.i(H.d(H.d(this.f314999b.hashCode() * 31, 31, this.f315000c), 31, this.f315001d), 31, this.f315002e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DialogInfo(description=");
            sb2.append(this.f314999b);
            sb2.append(", primaryActionTitle=");
            sb2.append(this.f315000c);
            sb2.append(", secondaryActionTitle=");
            sb2.append(this.f315001d);
            sb2.append(", showAdvertCounter=");
            sb2.append(this.f315002e);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f315003f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f314999b.writeToParcel(parcel, i12);
            parcel.writeString(this.f315000c);
            parcel.writeString(this.f315001d);
            parcel.writeInt(this.f315002e ? 1 : 0);
            parcel.writeString(this.f315003f);
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$Limit;", "Landroid/os/Parcelable;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Limit implements Parcelable {

        @k
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315004b;

        /* renamed from: c, reason: collision with root package name */
        public final int f315005c;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Limit> {
            @Override // android.os.Parcelable.Creator
            public final Limit createFromParcel(Parcel parcel) {
                return new Limit(parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Limit[] newArray(int i12) {
                return new Limit[i12];
            }
        }

        public Limit(@k String str, int i12) {
            this.f315004b = str;
            this.f315005c = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) obj;
            return L.f(this.f315004b, limit.f315004b) && this.f315005c == limit.f315005c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f315005c) + (this.f315004b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Limit(title=");
            sb2.append(this.f315004b);
            sb2.append(", limit=");
            return r.t(sb2, this.f315005c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315004b);
            parcel.writeInt(this.f315005c);
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$TextDescription;", "Landroid/os/Parcelable;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TextDescription implements Parcelable, c<String> {

        @k
        public static final Parcelable.Creator<TextDescription> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315006b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315007c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ArrayList f315008d;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextDescription> {
            @Override // android.os.Parcelable.Creator
            public final TextDescription createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(TextShortcutVariant.CREATOR, parcel, arrayList2, iC2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new TextDescription(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final TextDescription[] newArray(int i12) {
                return new TextDescription[i12];
            }
        }

        public TextDescription(@k String str, @l String str2, @l ArrayList arrayList) {
            this.f315006b = str;
            this.f315007c = str2;
            this.f315008d = arrayList;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        @l
        public final List<c.a<String>> c() {
            return this.f315008d;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        /* renamed from: d, reason: from getter */
        public final String getF315007c() {
            return this.f315007c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextDescription)) {
                return false;
            }
            TextDescription textDescription = (TextDescription) obj;
            return L.f(this.f315006b, textDescription.f315006b) && L.f(this.f315007c, textDescription.f315007c) && L.f(this.f315008d, textDescription.f315008d);
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c
        /* renamed from: getDefault, reason: from getter */
        public final String getF315006b() {
            return this.f315006b;
        }

        public final int hashCode() {
            int iHashCode = this.f315006b.hashCode() * 31;
            String str = this.f315007c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ArrayList arrayList = this.f315008d;
            return iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextDescription(default=");
            sb2.append(this.f315006b);
            sb2.append(", multiDefault=");
            sb2.append(this.f315007c);
            sb2.append(", variant=");
            return e.p(sb2, this.f315008d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315006b);
            parcel.writeString(this.f315007c);
            ArrayList arrayList = this.f315008d;
            if (arrayList == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((TextShortcutVariant) itY.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$TextShortcutVariant;", "Landroid/os/Parcelable;", "Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class TextShortcutVariant implements Parcelable, c.a<String> {

        @k
        public static final Parcelable.Creator<TextShortcutVariant> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f315009b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f315010c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Set<String> f315011d;

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextShortcutVariant> {
            @Override // android.os.Parcelable.Creator
            public final TextShortcutVariant createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readString());
                }
                return new TextShortcutVariant(string, string2, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final TextShortcutVariant[] newArray(int i12) {
                return new TextShortcutVariant[i12];
            }
        }

        public TextShortcutVariant(@k String str, @l String str2, @k Set<String> set) {
            this.f315009b = str;
            this.f315010c = str2;
            this.f315011d = set;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        @k
        public final Set<String> c() {
            return this.f315011d;
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        /* renamed from: d, reason: from getter */
        public final String getF315010c() {
            return this.f315010c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextShortcutVariant)) {
                return false;
            }
            TextShortcutVariant textShortcutVariant = (TextShortcutVariant) obj;
            return L.f(this.f315009b, textShortcutVariant.f315009b) && L.f(this.f315010c, textShortcutVariant.f315010c) && L.f(this.f315011d, textShortcutVariant.f315011d);
        }

        @Override // com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain.c.a
        /* renamed from: getText, reason: from getter */
        public final String getF315009b() {
            return this.f315009b;
        }

        public final int hashCode() {
            int iHashCode = this.f315009b.hashCode() * 31;
            String str = this.f315010c;
            return this.f315011d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextShortcutVariant(text=");
            sb2.append(this.f315009b);
            sb2.append(", multiText=");
            sb2.append(this.f315010c);
            sb2.append(", useForShortcut=");
            return AK.c.u(sb2, this.f315011d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f315009b);
            parcel.writeString(this.f315010c);
            Set<String> set = this.f315011d;
            parcel.writeInt(set.size());
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString(it.next());
            }
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @l
        /* renamed from: c */
        DialogInfo getF314996b();
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UserAdvertActionsInfoDomain> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertActionsInfoDomain createFromParcel(Parcel parcel) {
            Limit limitCreateFromParcel = Limit.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<Config> creator = Config.CREATOR;
            return new UserAdvertActionsInfoDomain(limitCreateFromParcel, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertActionsInfoDomain[] newArray(int i12) {
            return new UserAdvertActionsInfoDomain[i12];
        }
    }

    /* compiled from: UserAdvertActionsInfoDomain.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c;", "T", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c<T> {

        /* compiled from: UserAdvertActionsInfoDomain.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/domain/model/UserAdvertActionsInfoDomain$c$a;", "T", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a<T> {
            @k
            Set<String> c();

            @l
            /* renamed from: d */
            T getF315010c();

            /* renamed from: getText */
            T getF315009b();
        }

        @l
        List<a<T>> c();

        @l
        /* renamed from: d */
        T getF315007c();

        /* renamed from: getDefault */
        T getF315006b();
    }

    public UserAdvertActionsInfoDomain(@k Limit limit, @k Config config, @k Config config2, @k Config config3, @k Config config4, @l Config config5) {
        this.f314984b = limit;
        this.f314985c = config;
        this.f314986d = config2;
        this.f314987e = config3;
        this.f314988f = config4;
        this.f314989g = config5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertActionsInfoDomain)) {
            return false;
        }
        UserAdvertActionsInfoDomain userAdvertActionsInfoDomain = (UserAdvertActionsInfoDomain) obj;
        return L.f(this.f314984b, userAdvertActionsInfoDomain.f314984b) && L.f(this.f314985c, userAdvertActionsInfoDomain.f314985c) && L.f(this.f314986d, userAdvertActionsInfoDomain.f314986d) && L.f(this.f314987e, userAdvertActionsInfoDomain.f314987e) && L.f(this.f314988f, userAdvertActionsInfoDomain.f314988f) && L.f(this.f314989g, userAdvertActionsInfoDomain.f314989g);
    }

    public final int hashCode() {
        int iHashCode = (this.f314988f.hashCode() + ((this.f314987e.hashCode() + ((this.f314986d.hashCode() + ((this.f314985c.hashCode() + (this.f314984b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Config config = this.f314989g;
        return iHashCode + (config == null ? 0 : config.hashCode());
    }

    @k
    public final String toString() {
        return "UserAdvertActionsInfoDomain(limitInfo=" + this.f314984b + ", deleteConfig=" + this.f314985c + ", activateConfig=" + this.f314986d + ", closeConfig=" + this.f314987e + ", restoreConfig=" + this.f314988f + ", copyConfig=" + this.f314989g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f314984b.writeToParcel(parcel, i12);
        this.f314985c.writeToParcel(parcel, i12);
        this.f314986d.writeToParcel(parcel, i12);
        this.f314987e.writeToParcel(parcel, i12);
        this.f314988f.writeToParcel(parcel, i12);
        Config config = this.f314989g;
        if (config == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            config.writeToParcel(parcel, i12);
        }
    }
}
