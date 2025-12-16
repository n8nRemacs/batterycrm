package com.avito.android.str_insurance;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceLink.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/str_insurance/Offer;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "insights", "Lcom/avito/android/deep_linking/links/DeepLink;", "detailsUri", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Offer implements Parcelable {

    @k
    public static final Parcelable.Creator<Offer> CREATOR = new a();

    @c("detailsUri")
    @k
    private final DeepLink detailsUri;

    @c("insights")
    @k
    private final List<AttributedText> insights;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Offer> {
        @Override // android.os.Parcelable.Creator
        public final Offer createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Offer.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(Offer.class, parcel, arrayList, iL2, 1);
            }
            return new Offer(attributedText, arrayList, (DeepLink) parcel.readParcelable(Offer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Offer[] newArray(int i12) {
            return new Offer[i12];
        }
    }

    public Offer(@k AttributedText attributedText, @k List<AttributedText> list, @k DeepLink deepLink) {
        this.title = attributedText;
        this.insights = list;
        this.detailsUri = deepLink;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getDetailsUri() {
        return this.detailsUri;
    }

    @k
    public final List<AttributedText> d() {
        return this.insights;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offer)) {
            return false;
        }
        Offer offer = (Offer) obj;
        return L.f(this.title, offer.title) && L.f(this.insights, offer.insights) && L.f(this.detailsUri, offer.detailsUri);
    }

    public final int hashCode() {
        return this.detailsUri.hashCode() + H.e(this.title.hashCode() * 31, 31, this.insights);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Offer(title=");
        sb2.append(this.title);
        sb2.append(", insights=");
        sb2.append(this.insights);
        sb2.append(", detailsUri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.detailsUri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        Iterator itJ = C0.j(this.insights, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.detailsUri, i12);
    }
}
