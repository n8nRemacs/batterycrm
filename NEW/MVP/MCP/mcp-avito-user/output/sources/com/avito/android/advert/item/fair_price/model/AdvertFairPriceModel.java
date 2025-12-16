package com.avito.android.advert.item.fair_price.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import j.InterfaceC42150f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertFairPriceModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/fair_price/model/AdvertFairPriceModel;", "Landroid/os/Parcelable;", "Explanation", "Icon", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertFairPriceModel implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertFairPriceModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f75401b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f75402c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Icon f75403d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Explanation f75404e;

    /* compiled from: AdvertFairPriceModel.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/fair_price/model/AdvertFairPriceModel$Explanation;", "Landroid/os/Parcelable;", "ActionButton", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Explanation implements Parcelable {

        @k
        public static final Parcelable.Creator<Explanation> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ActionButton f75405b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<String> f75406c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f75407d;

        /* compiled from: AdvertFairPriceModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fair_price/model/AdvertFairPriceModel$Explanation$ActionButton;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class ActionButton implements Parcelable {

            @k
            public static final Parcelable.Creator<ActionButton> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f75408b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f75409c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final DeepLink f75410d;

            /* compiled from: AdvertFairPriceModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ActionButton> {
                @Override // android.os.Parcelable.Creator
                public final ActionButton createFromParcel(Parcel parcel) {
                    return new ActionButton(parcel.readInt(), (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ActionButton[] newArray(int i12) {
                    return new ActionButton[i12];
                }
            }

            public ActionButton(@InterfaceC42150f int i12, @k DeepLink deepLink, @k String str) {
                this.f75408b = i12;
                this.f75409c = str;
                this.f75410d = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionButton)) {
                    return false;
                }
                ActionButton actionButton = (ActionButton) obj;
                return this.f75408b == actionButton.f75408b && L.f(this.f75409c, actionButton.f75409c) && L.f(this.f75410d, actionButton.f75410d);
            }

            public final int hashCode() {
                return this.f75410d.hashCode() + H.d(Integer.hashCode(this.f75408b) * 31, 31, this.f75409c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ActionButton(style=");
                sb2.append(this.f75408b);
                sb2.append(", text=");
                sb2.append(this.f75409c);
                sb2.append(", url=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f75410d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f75408b);
                parcel.writeString(this.f75409c);
                parcel.writeParcelable(this.f75410d, i12);
            }
        }

        /* compiled from: AdvertFairPriceModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Explanation> {
            @Override // android.os.Parcelable.Creator
            public final Explanation createFromParcel(Parcel parcel) {
                return new Explanation(ActionButton.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Explanation[] newArray(int i12) {
                return new Explanation[i12];
            }
        }

        public Explanation(@k ActionButton actionButton, @k List<String> list, @k String str) {
            this.f75405b = actionButton;
            this.f75406c = list;
            this.f75407d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Explanation)) {
                return false;
            }
            Explanation explanation = (Explanation) obj;
            return L.f(this.f75405b, explanation.f75405b) && L.f(this.f75406c, explanation.f75406c) && L.f(this.f75407d, explanation.f75407d);
        }

        public final int hashCode() {
            return this.f75407d.hashCode() + H.e(this.f75405b.hashCode() * 31, 31, this.f75406c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Explanation(button=");
            sb2.append(this.f75405b);
            sb2.append(", texts=");
            sb2.append(this.f75406c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f75407d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f75405b.writeToParcel(parcel, i12);
            parcel.writeStringList(this.f75406c);
            parcel.writeString(this.f75407d);
        }
    }

    /* compiled from: AdvertFairPriceModel.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/fair_price/model/AdvertFairPriceModel$Icon;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f75411b;

        /* renamed from: c, reason: collision with root package name */
        public final int f75412c;

        /* compiled from: AdvertFairPriceModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Icon> {
            @Override // android.os.Parcelable.Creator
            public final Icon createFromParcel(Parcel parcel) {
                return new Icon(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@InterfaceC42150f int i12, @InterfaceC42150f int i13) {
            this.f75411b = i12;
            this.f75412c = i13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return this.f75411b == icon.f75411b && this.f75412c == icon.f75412c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f75412c) + (Integer.hashCode(this.f75411b) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(color=");
            sb2.append(this.f75411b);
            sb2.append(", name=");
            return r.t(sb2, this.f75412c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f75411b);
            parcel.writeInt(this.f75412c);
        }
    }

    /* compiled from: AdvertFairPriceModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertFairPriceModel> {
        @Override // android.os.Parcelable.Creator
        public final AdvertFairPriceModel createFromParcel(Parcel parcel) {
            return new AdvertFairPriceModel(parcel.readString(), parcel.readString(), Icon.CREATOR.createFromParcel(parcel), Explanation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertFairPriceModel[] newArray(int i12) {
            return new AdvertFairPriceModel[i12];
        }
    }

    public AdvertFairPriceModel(@k String str, @k String str2, @k Icon icon, @k Explanation explanation) {
        this.f75401b = str;
        this.f75402c = str2;
        this.f75403d = icon;
        this.f75404e = explanation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertFairPriceModel)) {
            return false;
        }
        AdvertFairPriceModel advertFairPriceModel = (AdvertFairPriceModel) obj;
        return L.f(this.f75401b, advertFairPriceModel.f75401b) && L.f(this.f75402c, advertFairPriceModel.f75402c) && L.f(this.f75403d, advertFairPriceModel.f75403d) && L.f(this.f75404e, advertFairPriceModel.f75404e);
    }

    public final int hashCode() {
        return this.f75404e.hashCode() + ((this.f75403d.hashCode() + H.d(this.f75401b.hashCode() * 31, 31, this.f75402c)) * 31);
    }

    @k
    public final String toString() {
        return "AdvertFairPriceModel(price=" + this.f75401b + ", description=" + this.f75402c + ", icon=" + this.f75403d + ", explanation=" + this.f75404e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f75401b);
        parcel.writeString(this.f75402c);
        this.f75403d.writeToParcel(parcel, i12);
        this.f75404e.writeToParcel(parcel, i12);
    }
}
