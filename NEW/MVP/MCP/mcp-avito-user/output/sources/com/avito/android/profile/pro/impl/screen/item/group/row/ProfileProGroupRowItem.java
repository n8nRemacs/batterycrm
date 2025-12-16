package com.avito.android.profile.pro.impl.screen.item.group.row;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProGroupRowItem.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/row/ProfileProGroupRowItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/profile/pro/impl/screen/item/group/row/a;", "a", "Type", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProGroupRowItem implements ParcelableItem, com.avito.android.profile.pro.impl.screen.item.group.row.a {

    @k
    public static final Parcelable.Creator<ProfileProGroupRowItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223291b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f223292c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f223293d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f223294e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f223295f;

    /* renamed from: g, reason: collision with root package name */
    public final int f223296g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Type f223297h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f223298i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f223299j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProGroupRowItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/row/ProfileProGroupRowItem$Type;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f223300b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f223301c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f223302d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f223303e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f223304f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f223305g;

        static {
            Type type = new Type("TOP", 0);
            f223300b = type;
            Type type2 = new Type("CENTER", 1);
            f223301c = type2;
            Type type3 = new Type("BOTTOM", 2);
            f223302d = type3;
            Type type4 = new Type("SINGLE", 3);
            f223303e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f223304f = typeArr;
            f223305g = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f223304f.clone();
        }
    }

    /* compiled from: ProfileProGroupRowItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/group/row/ProfileProGroupRowItem$a;", "", "<init>", "()V", "", "BADGE_ONBOARDING_TYPE", "Ljava/lang/String;", "COUNTER_ONBOARDING_TYPE", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileProGroupRowItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileProGroupRowItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProGroupRowItem createFromParcel(Parcel parcel) {
            return new ProfileProGroupRowItem(parcel.readString(), (AttributedText) parcel.readParcelable(ProfileProGroupRowItem.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ProfileProGroupRowItem.class.getClassLoader()), parcel.readInt(), Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProGroupRowItem[] newArray(int i12) {
            return new ProfileProGroupRowItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ProfileProGroupRowItem(@k String str, @l AttributedText attributedText, @l String str2, @l String str3, @l DeepLink deepLink, int i12, @k Type type, @k String str4, @k String str5) {
        this.f223291b = str;
        this.f223292c = attributedText;
        this.f223293d = str2;
        this.f223294e = str3;
        this.f223295f = deepLink;
        this.f223296g = i12;
        this.f223297h = type;
        this.f223298i = str4;
        this.f223299j = str5;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    public final List<String> L() {
        String str = this.f223294e;
        String str2 = null;
        String str3 = !(str == null || str.length() == 0) ? "badge" : null;
        String str4 = this.f223293d;
        if (str4 != null && str4.length() != 0) {
            str2 = "counter";
        }
        return C42756l.B(new String[]{str3, str2});
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: W, reason: from getter */
    public final String getF223299j() {
        return this.f223299j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProGroupRowItem)) {
            return false;
        }
        ProfileProGroupRowItem profileProGroupRowItem = (ProfileProGroupRowItem) obj;
        return L.f(this.f223291b, profileProGroupRowItem.f223291b) && L.f(this.f223292c, profileProGroupRowItem.f223292c) && L.f(this.f223293d, profileProGroupRowItem.f223293d) && L.f(this.f223294e, profileProGroupRowItem.f223294e) && L.f(this.f223295f, profileProGroupRowItem.f223295f) && this.f223296g == profileProGroupRowItem.f223296g && this.f223297h == profileProGroupRowItem.f223297h && L.f(this.f223298i, profileProGroupRowItem.f223298i) && L.f(this.f223299j, profileProGroupRowItem.f223299j);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF223298i() {
        return this.f223298i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF227497b() {
        return this.f223291b;
    }

    public final int hashCode() {
        int iHashCode = this.f223291b.hashCode() * 31;
        AttributedText attributedText = this.f223292c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str = this.f223293d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f223294e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f223295f;
        return this.f223299j.hashCode() + H.d((this.f223297h.hashCode() + r.e(this.f223296g, (iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31)) * 31, 31, this.f223298i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProGroupRowItem(stringId=");
        sb2.append(this.f223291b);
        sb2.append(", value=");
        sb2.append(this.f223292c);
        sb2.append(", notificationsCount=");
        sb2.append(this.f223293d);
        sb2.append(", badgeText=");
        sb2.append(this.f223294e);
        sb2.append(", deeplink=");
        sb2.append(this.f223295f);
        sb2.append(", topMargin=");
        sb2.append(this.f223296g);
        sb2.append(", rowType=");
        sb2.append(this.f223297h);
        sb2.append(", sectionName=");
        sb2.append(this.f223298i);
        sb2.append(", subsectionName=");
        return C22026a.c(sb2, this.f223299j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223291b);
        parcel.writeParcelable(this.f223292c, i12);
        parcel.writeString(this.f223293d);
        parcel.writeString(this.f223294e);
        parcel.writeParcelable(this.f223295f, i12);
        parcel.writeInt(this.f223296g);
        parcel.writeString(this.f223297h.name());
        parcel.writeString(this.f223298i);
        parcel.writeString(this.f223299j);
    }
}
