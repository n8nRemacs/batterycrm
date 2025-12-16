package com.avito.android.mortgage.landing.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mortgage.api.model.landing.LandingHeaderAction;
import com.avito.android.mortgage.api.model.landing.TitlePart;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewHeader;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LandingViewHeader implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingViewHeader> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f200242b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<TitlePart> f200243c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f200244d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final LandingHeaderAction f200245e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LandingHeaderAction f200246f;

    /* compiled from: LandingState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LandingViewHeader> {
        @Override // android.os.Parcelable.Creator
        public final LandingViewHeader createFromParcel(Parcel parcel) {
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(LandingViewHeader.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TitlePart.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LandingViewHeader(universalImage, arrayList, (AttributedText) parcel.readParcelable(LandingViewHeader.class.getClassLoader()), parcel.readInt() == 0 ? null : LandingHeaderAction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LandingHeaderAction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final LandingViewHeader[] newArray(int i12) {
            return new LandingViewHeader[i12];
        }
    }

    public LandingViewHeader(@l UniversalImage universalImage, @k List<TitlePart> list, @l AttributedText attributedText, @l LandingHeaderAction landingHeaderAction, @l LandingHeaderAction landingHeaderAction2) {
        this.f200242b = universalImage;
        this.f200243c = list;
        this.f200244d = attributedText;
        this.f200245e = landingHeaderAction;
        this.f200246f = landingHeaderAction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LandingViewHeader)) {
            return false;
        }
        LandingViewHeader landingViewHeader = (LandingViewHeader) obj;
        return L.f(this.f200242b, landingViewHeader.f200242b) && L.f(this.f200243c, landingViewHeader.f200243c) && L.f(this.f200244d, landingViewHeader.f200244d) && L.f(this.f200245e, landingViewHeader.f200245e) && L.f(this.f200246f, landingViewHeader.f200246f);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f200242b;
        int iE2 = H.e((universalImage == null ? 0 : universalImage.hashCode()) * 31, 31, this.f200243c);
        AttributedText attributedText = this.f200244d;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        LandingHeaderAction landingHeaderAction = this.f200245e;
        int iHashCode2 = (iHashCode + (landingHeaderAction == null ? 0 : landingHeaderAction.hashCode())) * 31;
        LandingHeaderAction landingHeaderAction2 = this.f200246f;
        return iHashCode2 + (landingHeaderAction2 != null ? landingHeaderAction2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "LandingViewHeader(image=" + this.f200242b + ", titleParts=" + this.f200243c + ", subtitle=" + this.f200244d + ", primaryAction=" + this.f200245e + ", secondaryAction=" + this.f200246f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f200242b, i12);
        Iterator itJ = C0.j(this.f200243c, parcel);
        while (itJ.hasNext()) {
            ((TitlePart) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f200244d, i12);
        LandingHeaderAction landingHeaderAction = this.f200245e;
        if (landingHeaderAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingHeaderAction.writeToParcel(parcel, i12);
        }
        LandingHeaderAction landingHeaderAction2 = this.f200246f;
        if (landingHeaderAction2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            landingHeaderAction2.writeToParcel(parcel, i12);
        }
    }
}
