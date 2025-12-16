package com.avito.android.cpx_promo.impl.interactor.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: AttributedTextWithIcon.kt */
@d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/AttributedTextWithIcon;", "Landroid/os/Parcelable;", "ClickableIcon", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AttributedTextWithIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<AttributedTextWithIcon> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f126995b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ClickableIcon f126996c;

    /* compiled from: AttributedTextWithIcon.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/impl/interactor/model/AttributedTextWithIcon$ClickableIcon;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class ClickableIcon implements Parcelable {

        @k
        public static final Parcelable.Creator<ClickableIcon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f126997b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UniversalColor f126998c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f126999d;

        /* compiled from: AttributedTextWithIcon.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ClickableIcon> {
            @Override // android.os.Parcelable.Creator
            public final ClickableIcon createFromParcel(Parcel parcel) {
                return new ClickableIcon(parcel.readString(), (UniversalColor) parcel.readParcelable(ClickableIcon.class.getClassLoader()), (DeepLink) parcel.readParcelable(ClickableIcon.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ClickableIcon[] newArray(int i12) {
                return new ClickableIcon[i12];
            }
        }

        public ClickableIcon(@k String str, @k UniversalColor universalColor, @l DeepLink deepLink) {
            this.f126997b = str;
            this.f126998c = universalColor;
            this.f126999d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f126997b);
            parcel.writeParcelable(this.f126998c, i12);
            parcel.writeParcelable(this.f126999d, i12);
        }
    }

    /* compiled from: AttributedTextWithIcon.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AttributedTextWithIcon> {
        @Override // android.os.Parcelable.Creator
        public final AttributedTextWithIcon createFromParcel(Parcel parcel) {
            return new AttributedTextWithIcon((AttributedText) parcel.readParcelable(AttributedTextWithIcon.class.getClassLoader()), parcel.readInt() == 0 ? null : ClickableIcon.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AttributedTextWithIcon[] newArray(int i12) {
            return new AttributedTextWithIcon[i12];
        }
    }

    public AttributedTextWithIcon(@k AttributedText attributedText, @l ClickableIcon clickableIcon) {
        this.f126995b = attributedText;
        this.f126996c = clickableIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f126995b, i12);
        ClickableIcon clickableIcon = this.f126996c;
        if (clickableIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clickableIcon.writeToParcel(parcel, i12);
        }
    }
}
