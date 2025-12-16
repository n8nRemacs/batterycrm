package com.avito.android.profile.pro.impl.screen.item.geo_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProGeoBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/ProfileProGeoBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Action", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProGeoBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProGeoBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223261b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f223262c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f223263d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f223264e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Action f223265f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f223266g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalImage f223267h;

    /* compiled from: ProfileProGeoBannerItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/geo_banner/ProfileProGeoBannerItem$Action;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f223268b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f223269c;

        /* compiled from: ProfileProGeoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action((DeepLink) parcel.readParcelable(Action.class.getClassLoader()), (PrintableText) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k DeepLink deepLink, @k PrintableText printableText) {
            this.f223268b = deepLink;
            this.f223269c = printableText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f223268b, i12);
            parcel.writeParcelable(this.f223269c, i12);
        }
    }

    /* compiled from: ProfileProGeoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProGeoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProGeoBannerItem createFromParcel(Parcel parcel) {
            return new ProfileProGeoBannerItem(parcel.readString(), (PrintableText) parcel.readParcelable(ProfileProGeoBannerItem.class.getClassLoader()), (PrintableText) parcel.readParcelable(ProfileProGeoBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ProfileProGeoBannerItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (UniversalImage) parcel.readParcelable(ProfileProGeoBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProGeoBannerItem[] newArray(int i12) {
            return new ProfileProGeoBannerItem[i12];
        }
    }

    public ProfileProGeoBannerItem(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @l AttributedText attributedText, @l Action action, boolean z12, @l UniversalImage universalImage) {
        this.f223261b = str;
        this.f223262c = printableText;
        this.f223263d = printableText2;
        this.f223264e = attributedText;
        this.f223265f = action;
        this.f223266g = z12;
        this.f223267h = universalImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProGeoBannerItem)) {
            return false;
        }
        ProfileProGeoBannerItem profileProGeoBannerItem = (ProfileProGeoBannerItem) obj;
        return L.f(this.f223261b, profileProGeoBannerItem.f223261b) && L.f(this.f223262c, profileProGeoBannerItem.f223262c) && L.f(this.f223263d, profileProGeoBannerItem.f223263d) && L.f(this.f223264e, profileProGeoBannerItem.f223264e) && L.f(this.f223265f, profileProGeoBannerItem.f223265f) && this.f223266g == profileProGeoBannerItem.f223266g && L.f(this.f223267h, profileProGeoBannerItem.f223267h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF202482h() {
        return this.f223261b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f223263d, com.avito.android.actions_sheet.a.f(this.f223262c, this.f223261b.hashCode() * 31, 31), 31);
        AttributedText attributedText = this.f223264e;
        int iHashCode = (iF2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Action action = this.f223265f;
        int i12 = r.i((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.f223266g);
        UniversalImage universalImage = this.f223267h;
        return i12 + (universalImage != null ? universalImage.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProGeoBannerItem(stringId=");
        sb2.append(this.f223261b);
        sb2.append(", title=");
        sb2.append(this.f223262c);
        sb2.append(", subtitle=");
        sb2.append(this.f223263d);
        sb2.append(", addressAttrText=");
        sb2.append(this.f223264e);
        sb2.append(", action=");
        sb2.append(this.f223265f);
        sb2.append(", closable=");
        sb2.append(this.f223266g);
        sb2.append(", image=");
        return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.f223267h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223261b);
        parcel.writeParcelable(this.f223262c, i12);
        parcel.writeParcelable(this.f223263d, i12);
        parcel.writeParcelable(this.f223264e, i12);
        Action action = this.f223265f;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f223266g ? 1 : 0);
        parcel.writeParcelable(this.f223267h, i12);
    }
}
