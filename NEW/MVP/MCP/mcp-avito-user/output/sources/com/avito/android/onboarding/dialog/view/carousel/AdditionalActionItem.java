package com.avito.android.onboarding.dialog.view.carousel;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.onboarding.AdditionalAction;
import com.avito.android.remote.model.onboarding.ButtonAction;
import com.avito.android.remote.model.onboarding.RequestType;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnboardingCarouselItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/AdditionalActionItem;", "Landroid/os/Parcelable;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AdditionalActionItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdditionalActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f208961b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f208962c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final ButtonAction f208963d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Uri f208964e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f208965f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final RequestType f208966g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final AdditionalAction.Style f208967h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f208968i;

    /* compiled from: OnboardingCarouselItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalActionItem> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalActionItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            ButtonAction buttonActionValueOf = parcel.readInt() == 0 ? null : ButtonAction.valueOf(parcel.readString());
            Uri uri = (Uri) parcel.readParcelable(AdditionalActionItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(AdditionalActionItem.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                }
                linkedHashMap = linkedHashMap2;
            }
            return new AdditionalActionItem(j12, string, buttonActionValueOf, uri, linkedHashMap, parcel.readInt() == 0 ? null : RequestType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : AdditionalAction.Style.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalActionItem[] newArray(int i12) {
            return new AdditionalActionItem[i12];
        }
    }

    public AdditionalActionItem(long j12, @Y61.l String str, @Y61.l ButtonAction buttonAction, @Y61.l Uri uri, @Y61.l Map<String, ? extends Object> map, @Y61.l RequestType requestType, @Y61.l AdditionalAction.Style style, boolean z12) {
        this.f208961b = j12;
        this.f208962c = str;
        this.f208963d = buttonAction;
        this.f208964e = uri;
        this.f208965f = map;
        this.f208966g = requestType;
        this.f208967h = style;
        this.f208968i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalActionItem)) {
            return false;
        }
        AdditionalActionItem additionalActionItem = (AdditionalActionItem) obj;
        return this.f208961b == additionalActionItem.f208961b && L.f(this.f208962c, additionalActionItem.f208962c) && this.f208963d == additionalActionItem.f208963d && L.f(this.f208964e, additionalActionItem.f208964e) && L.f(this.f208965f, additionalActionItem.f208965f) && this.f208966g == additionalActionItem.f208966g && this.f208967h == additionalActionItem.f208967h && this.f208968i == additionalActionItem.f208968i;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f208961b) * 31;
        String str = this.f208962c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ButtonAction buttonAction = this.f208963d;
        int iHashCode3 = (iHashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
        Uri uri = this.f208964e;
        int iHashCode4 = (iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31;
        Map<String, Object> map = this.f208965f;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        RequestType requestType = this.f208966g;
        int iHashCode6 = (iHashCode5 + (requestType == null ? 0 : requestType.hashCode())) * 31;
        AdditionalAction.Style style = this.f208967h;
        return Boolean.hashCode(this.f208968i) + ((iHashCode6 + (style != null ? style.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalActionItem(id=");
        sb2.append(this.f208961b);
        sb2.append(", buttonTitle=");
        sb2.append(this.f208962c);
        sb2.append(", buttonAction=");
        sb2.append(this.f208963d);
        sb2.append(", uri=");
        sb2.append(this.f208964e);
        sb2.append(", params=");
        sb2.append(this.f208965f);
        sb2.append(", requestType=");
        sb2.append(this.f208966g);
        sb2.append(", style=");
        sb2.append(this.f208967h);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f208968i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f208961b);
        parcel.writeString(this.f208962c);
        ButtonAction buttonAction = this.f208963d;
        if (buttonAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(buttonAction.name());
        }
        parcel.writeParcelable(this.f208964e, i12);
        Map<String, Object> map = this.f208965f;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        RequestType requestType = this.f208966g;
        if (requestType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(requestType.name());
        }
        AdditionalAction.Style style = this.f208967h;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        parcel.writeInt(this.f208968i ? 1 : 0);
    }
}
