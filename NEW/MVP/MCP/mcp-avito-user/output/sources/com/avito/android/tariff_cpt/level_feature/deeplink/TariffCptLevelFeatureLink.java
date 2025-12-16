package com.avito.android.tariff_cpt.level_feature.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptLevelFeatureLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/deeplink/TariffCptLevelFeatureLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Body", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptLevelFeatureLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TariffCptLevelFeatureLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Body f298450b;

    /* compiled from: TariffCptLevelFeatureLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/tariff_cpt/level_feature/deeplink/TariffCptLevelFeatureLink$Body;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Body implements Parcelable {

        @k
        public static final Parcelable.Creator<Body> CREATOR = new a();

        @c("button")
        @l
        private final ButtonAction button;

        @c("image")
        @l
        private final UniversalImage image;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: TariffCptLevelFeatureLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Body> {
            @Override // android.os.Parcelable.Creator
            public final Body createFromParcel(Parcel parcel) {
                return new Body((UniversalImage) parcel.readParcelable(Body.class.getClassLoader()), (AttributedText) parcel.readParcelable(Body.class.getClassLoader()), (ButtonAction) parcel.readParcelable(Body.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Body[] newArray(int i12) {
                return new Body[i12];
            }
        }

        public Body(@l UniversalImage universalImage, @k AttributedText attributedText, @l ButtonAction buttonAction) {
            this.image = universalImage;
            this.text = attributedText;
            this.button = buttonAction;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final ButtonAction getButton() {
            return this.button;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Body)) {
                return false;
            }
            Body body = (Body) obj;
            return L.f(this.image, body.image) && L.f(this.text, body.text) && L.f(this.button, body.button);
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        public final int hashCode() {
            UniversalImage universalImage = this.image;
            int iB2 = com.avito.android.actions_sheet.a.b((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.text);
            ButtonAction buttonAction = this.button;
            return iB2 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Body(image=");
            sb2.append(this.image);
            sb2.append(", text=");
            sb2.append(this.text);
            sb2.append(", button=");
            return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.image, i12);
            parcel.writeParcelable(this.text, i12);
            parcel.writeParcelable(this.button, i12);
        }
    }

    /* compiled from: TariffCptLevelFeatureLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptLevelFeatureLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeatureLink createFromParcel(Parcel parcel) {
            return new TariffCptLevelFeatureLink(Body.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptLevelFeatureLink[] newArray(int i12) {
            return new TariffCptLevelFeatureLink[i12];
        }
    }

    public TariffCptLevelFeatureLink(@k Body body) {
        this.f298450b = body;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptLevelFeatureLink) && L.f(this.f298450b, ((TariffCptLevelFeatureLink) obj).f298450b);
    }

    public final int hashCode() {
        return this.f298450b.hashCode();
    }

    @k
    public final String toString() {
        return "TariffCptLevelFeatureLink(body=" + this.f298450b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f298450b.writeToParcel(parcel, i12);
    }
}
