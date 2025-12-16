package com.avito.android.profile.user_profile.cards.passport;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryRestrictionCard.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/DeliveryRestrictionCard;", "Landroid/os/Parcelable;", "DeliveryRestrictionAction", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeliveryRestrictionCard implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryRestrictionCard> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f225112b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeliveryRestrictionAction f225113c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final UniversalImage f225114d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalColor f225115e;

    /* compiled from: DeliveryRestrictionCard.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/passport/DeliveryRestrictionCard$DeliveryRestrictionAction;", "Landroid/os/Parcelable;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeliveryRestrictionAction implements Parcelable {

        @k
        public static final Parcelable.Creator<DeliveryRestrictionAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f225116b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final DeepLink f225117c;

        /* compiled from: DeliveryRestrictionCard.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DeliveryRestrictionAction> {
            @Override // android.os.Parcelable.Creator
            public final DeliveryRestrictionAction createFromParcel(Parcel parcel) {
                return new DeliveryRestrictionAction(parcel.readString(), (DeepLink) parcel.readParcelable(DeliveryRestrictionAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeliveryRestrictionAction[] newArray(int i12) {
                return new DeliveryRestrictionAction[i12];
            }
        }

        public DeliveryRestrictionAction(@k String str, @k DeepLink deepLink) {
            this.f225116b = str;
            this.f225117c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryRestrictionAction)) {
                return false;
            }
            DeliveryRestrictionAction deliveryRestrictionAction = (DeliveryRestrictionAction) obj;
            return L.f(this.f225116b, deliveryRestrictionAction.f225116b) && L.f(this.f225117c, deliveryRestrictionAction.f225117c);
        }

        public final int hashCode() {
            return this.f225117c.hashCode() + (this.f225116b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeliveryRestrictionAction(title=");
            sb2.append(this.f225116b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f225117c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f225116b);
            parcel.writeParcelable(this.f225117c, i12);
        }
    }

    /* compiled from: DeliveryRestrictionCard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryRestrictionCard> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryRestrictionCard createFromParcel(Parcel parcel) {
            return new DeliveryRestrictionCard((AttributedText) parcel.readParcelable(DeliveryRestrictionCard.class.getClassLoader()), DeliveryRestrictionAction.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(DeliveryRestrictionCard.class.getClassLoader()), (UniversalColor) parcel.readParcelable(DeliveryRestrictionCard.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryRestrictionCard[] newArray(int i12) {
            return new DeliveryRestrictionCard[i12];
        }
    }

    public DeliveryRestrictionCard(@k AttributedText attributedText, @k DeliveryRestrictionAction deliveryRestrictionAction, @k UniversalImage universalImage, @l UniversalColor universalColor) {
        this.f225112b = attributedText;
        this.f225113c = deliveryRestrictionAction;
        this.f225114d = universalImage;
        this.f225115e = universalColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryRestrictionCard)) {
            return false;
        }
        DeliveryRestrictionCard deliveryRestrictionCard = (DeliveryRestrictionCard) obj;
        return L.f(this.f225112b, deliveryRestrictionCard.f225112b) && L.f(this.f225113c, deliveryRestrictionCard.f225113c) && L.f(this.f225114d, deliveryRestrictionCard.f225114d) && L.f(this.f225115e, deliveryRestrictionCard.f225115e);
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a((this.f225113c.hashCode() + (this.f225112b.hashCode() * 31)) * 31, 31, this.f225114d);
        UniversalColor universalColor = this.f225115e;
        return iA2 + (universalColor == null ? 0 : universalColor.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryRestrictionCard(title=");
        sb2.append(this.f225112b);
        sb2.append(", action=");
        sb2.append(this.f225113c);
        sb2.append(", image=");
        sb2.append(this.f225114d);
        sb2.append(", backgroundColor=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.f225115e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f225112b, i12);
        this.f225113c.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f225114d, i12);
        parcel.writeParcelable(this.f225115e, i12);
    }
}
