package com.avito.android.profile.pro.impl.screen.item.widget_group.widget;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/widget_group/widget/ProfileProWidgetItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/profile/pro/impl/screen/item/group/row/a;", "Type", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProWidgetItem implements ParcelableItem, com.avito.android.profile.pro.impl.screen.item.group.row.a {

    @k
    public static final Parcelable.Creator<ProfileProWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223585b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f223586c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f223587d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f223588e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f223589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f223590g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Type f223591h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f223592i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final String f223593j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ProfileProWidgetItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/widget_group/widget/ProfileProWidgetItem$Type;", "", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        /* renamed from: b, reason: collision with root package name */
        public static final Type f223594b;

        /* renamed from: c, reason: collision with root package name */
        public static final Type f223595c;

        /* renamed from: d, reason: collision with root package name */
        public static final Type f223596d;

        /* renamed from: e, reason: collision with root package name */
        public static final Type f223597e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Type[] f223598f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f223599g;

        static {
            Type type = new Type("TOP", 0);
            f223594b = type;
            Type type2 = new Type("CENTER", 1);
            f223595c = type2;
            Type type3 = new Type("BOTTOM", 2);
            f223596d = type3;
            Type type4 = new Type("SINGLE", 3);
            f223597e = type4;
            Type[] typeArr = {type, type2, type3, type4};
            f223598f = typeArr;
            f223599g = kotlin.enums.c.a(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f223598f.clone();
        }
    }

    /* compiled from: ProfileProWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetItem createFromParcel(Parcel parcel) {
            return new ProfileProWidgetItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ProfileProWidgetItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(ProfileProWidgetItem.class.getClassLoader()), parcel.readInt(), Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProWidgetItem[] newArray(int i12) {
            return new ProfileProWidgetItem[i12];
        }
    }

    public ProfileProWidgetItem(@k String str, @l String str2, @l String str3, @l DeepLink deepLink, @l UniversalImage universalImage, int i12, @k Type type, @k String str4, @k String str5) {
        this.f223585b = str;
        this.f223586c = str2;
        this.f223587d = str3;
        this.f223588e = deepLink;
        this.f223589f = universalImage;
        this.f223590g = i12;
        this.f223591h = type;
        this.f223592i = str4;
        this.f223593j = str5;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    public final List<String> L() {
        return C42784z0.f406748b;
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: W, reason: from getter */
    public final String getF223299j() {
        return this.f223593j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProWidgetItem)) {
            return false;
        }
        ProfileProWidgetItem profileProWidgetItem = (ProfileProWidgetItem) obj;
        return L.f(this.f223585b, profileProWidgetItem.f223585b) && L.f(this.f223586c, profileProWidgetItem.f223586c) && L.f(this.f223587d, profileProWidgetItem.f223587d) && L.f(this.f223588e, profileProWidgetItem.f223588e) && L.f(this.f223589f, profileProWidgetItem.f223589f) && this.f223590g == profileProWidgetItem.f223590g && this.f223591h == profileProWidgetItem.f223591h && L.f(this.f223592i, profileProWidgetItem.f223592i) && L.f(this.f223593j, profileProWidgetItem.f223593j);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.group.row.a
    @k
    /* renamed from: f, reason: from getter */
    public final String getF223298i() {
        return this.f223592i;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202667b() {
        return this.f223585b;
    }

    public final int hashCode() {
        int iHashCode = this.f223585b.hashCode() * 31;
        String str = this.f223586c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f223587d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f223588e;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        UniversalImage universalImage = this.f223589f;
        return this.f223593j.hashCode() + H.d((this.f223591h.hashCode() + r.e(this.f223590g, (iHashCode4 + (universalImage != null ? universalImage.hashCode() : 0)) * 31, 31)) * 31, 31, this.f223592i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProWidgetItem(stringId=");
        sb2.append(this.f223585b);
        sb2.append(", title=");
        sb2.append(this.f223586c);
        sb2.append(", description=");
        sb2.append(this.f223587d);
        sb2.append(", uri=");
        sb2.append(this.f223588e);
        sb2.append(", image=");
        sb2.append(this.f223589f);
        sb2.append(", topMargin=");
        sb2.append(this.f223590g);
        sb2.append(", widgetType=");
        sb2.append(this.f223591h);
        sb2.append(", sectionName=");
        sb2.append(this.f223592i);
        sb2.append(", subsectionName=");
        return C22026a.c(sb2, this.f223593j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223585b);
        parcel.writeString(this.f223586c);
        parcel.writeString(this.f223587d);
        parcel.writeParcelable(this.f223588e, i12);
        parcel.writeParcelable(this.f223589f, i12);
        parcel.writeInt(this.f223590g);
        parcel.writeString(this.f223591h.name());
        parcel.writeString(this.f223592i);
        parcel.writeString(this.f223593j);
    }
}
