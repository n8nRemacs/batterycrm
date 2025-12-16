package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes8.dex */
public final class PromoTemplateAppearance implements Parcelable {
    public static final Parcelable.Creator<PromoTemplateAppearance> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final BannerAppearance f392830a;

    /* renamed from: b, reason: collision with root package name */
    private final TextAppearance f392831b;

    /* renamed from: c, reason: collision with root package name */
    private final TextAppearance f392832c;

    /* renamed from: d, reason: collision with root package name */
    private final TextAppearance f392833d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageAppearance f392834e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageAppearance f392835f;

    /* renamed from: g, reason: collision with root package name */
    private final ButtonAppearance f392836g;

    /* renamed from: h, reason: collision with root package name */
    private final ButtonAppearance f392837h;

    public class a implements Parcelable.Creator<PromoTemplateAppearance> {
        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance createFromParcel(Parcel parcel) {
            return new PromoTemplateAppearance(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PromoTemplateAppearance[] newArray(int i12) {
            return new PromoTemplateAppearance[i12];
        }
    }

    public PromoTemplateAppearance(Parcel parcel) {
        this.f392830a = (BannerAppearance) parcel.readParcelable(BannerAppearance.class.getClassLoader());
        this.f392831b = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392832c = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392833d = (TextAppearance) parcel.readParcelable(TextAppearance.class.getClassLoader());
        this.f392834e = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f392835f = (ImageAppearance) parcel.readParcelable(ImageAppearance.class.getClassLoader());
        this.f392836g = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
        this.f392837h = (ButtonAppearance) parcel.readParcelable(ButtonAppearance.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PromoTemplateAppearance.class != obj.getClass()) {
            return false;
        }
        PromoTemplateAppearance promoTemplateAppearance = (PromoTemplateAppearance) obj;
        BannerAppearance bannerAppearance = this.f392830a;
        if (bannerAppearance == null ? promoTemplateAppearance.f392830a != null : !bannerAppearance.equals(promoTemplateAppearance.f392830a)) {
            return false;
        }
        TextAppearance textAppearance = this.f392831b;
        if (textAppearance == null ? promoTemplateAppearance.f392831b != null : !textAppearance.equals(promoTemplateAppearance.f392831b)) {
            return false;
        }
        TextAppearance textAppearance2 = this.f392832c;
        if (textAppearance2 == null ? promoTemplateAppearance.f392832c != null : !textAppearance2.equals(promoTemplateAppearance.f392832c)) {
            return false;
        }
        TextAppearance textAppearance3 = this.f392833d;
        if (textAppearance3 == null ? promoTemplateAppearance.f392833d != null : !textAppearance3.equals(promoTemplateAppearance.f392833d)) {
            return false;
        }
        ImageAppearance imageAppearance = this.f392834e;
        if (imageAppearance == null ? promoTemplateAppearance.f392834e != null : !imageAppearance.equals(promoTemplateAppearance.f392834e)) {
            return false;
        }
        ImageAppearance imageAppearance2 = this.f392835f;
        if (imageAppearance2 == null ? promoTemplateAppearance.f392835f != null : !imageAppearance2.equals(promoTemplateAppearance.f392835f)) {
            return false;
        }
        ButtonAppearance buttonAppearance = this.f392836g;
        if (buttonAppearance == null ? promoTemplateAppearance.f392836g != null : !buttonAppearance.equals(promoTemplateAppearance.f392836g)) {
            return false;
        }
        ButtonAppearance buttonAppearance2 = this.f392837h;
        return buttonAppearance2 != null ? buttonAppearance2.equals(promoTemplateAppearance.f392837h) : promoTemplateAppearance.f392837h == null;
    }

    public final int hashCode() {
        BannerAppearance bannerAppearance = this.f392830a;
        int iHashCode = (bannerAppearance != null ? bannerAppearance.hashCode() : 0) * 31;
        TextAppearance textAppearance = this.f392831b;
        int iHashCode2 = (iHashCode + (textAppearance != null ? textAppearance.hashCode() : 0)) * 31;
        TextAppearance textAppearance2 = this.f392832c;
        int iHashCode3 = (iHashCode2 + (textAppearance2 != null ? textAppearance2.hashCode() : 0)) * 31;
        TextAppearance textAppearance3 = this.f392833d;
        int iHashCode4 = (iHashCode3 + (textAppearance3 != null ? textAppearance3.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance = this.f392834e;
        int iHashCode5 = (iHashCode4 + (imageAppearance != null ? imageAppearance.hashCode() : 0)) * 31;
        ImageAppearance imageAppearance2 = this.f392835f;
        int iHashCode6 = (iHashCode5 + (imageAppearance2 != null ? imageAppearance2.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance = this.f392836g;
        int iHashCode7 = (iHashCode6 + (buttonAppearance != null ? buttonAppearance.hashCode() : 0)) * 31;
        ButtonAppearance buttonAppearance2 = this.f392837h;
        return iHashCode7 + (buttonAppearance2 != null ? buttonAppearance2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i12) {
        parcel.writeParcelable(this.f392830a, i12);
        parcel.writeParcelable(this.f392831b, i12);
        parcel.writeParcelable(this.f392832c, i12);
        parcel.writeParcelable(this.f392833d, i12);
        parcel.writeParcelable(this.f392834e, i12);
        parcel.writeParcelable(this.f392835f, i12);
        parcel.writeParcelable(this.f392836g, i12);
        parcel.writeParcelable(this.f392837h, i12);
    }
}
