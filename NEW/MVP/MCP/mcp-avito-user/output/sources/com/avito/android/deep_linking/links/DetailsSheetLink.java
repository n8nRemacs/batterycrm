package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DetailsSheetLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DetailsSheetLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DetailsSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DetailsSheetLinkBody f133237b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ParametrizedEvent f133238c;

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailsSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final DetailsSheetLink createFromParcel(Parcel parcel) {
            return new DetailsSheetLink(DetailsSheetLinkBody.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsSheetLink[] newArray(int i12) {
            return new DetailsSheetLink[i12];
        }
    }

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLink$b;", "", "a", "b", "Lcom/avito/android/deep_linking/links/DetailsSheetLink$b$a;", "Lcom/avito/android/deep_linking/links/DetailsSheetLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: DetailsSheetLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLink$b$a;", "LJu/c$b;", "Lcom/avito/android/deep_linking/links/DetailsSheetLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133239b = new a();
        }

        /* compiled from: DetailsSheetLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLink$b$b;", "LJu/c$a;", "Lcom/avito/android/deep_linking/links/DetailsSheetLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.DetailsSheetLink$b$b, reason: collision with other inner class name */
        public static final class C3995b implements InterfaceC14249c.a, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3995b f133240b = new C3995b();
        }
    }

    public /* synthetic */ DetailsSheetLink(DetailsSheetLinkBody detailsSheetLinkBody, ParametrizedEvent parametrizedEvent, int i12, C42822w c42822w) {
        this(detailsSheetLinkBody, (i12 & 2) != 0 ? null : parametrizedEvent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsSheetLink)) {
            return false;
        }
        DetailsSheetLink detailsSheetLink = (DetailsSheetLink) obj;
        return kotlin.jvm.internal.L.f(this.f133237b, detailsSheetLink.f133237b) && kotlin.jvm.internal.L.f(this.f133238c, detailsSheetLink.f133238c);
    }

    public final int hashCode() {
        int iHashCode = this.f133237b.hashCode() * 31;
        ParametrizedEvent parametrizedEvent = this.f133238c;
        return iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsSheetLink(body=");
        sb2.append(this.f133237b);
        sb2.append(", displayEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.f133238c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133237b.writeToParcel(parcel, i12);
        ParametrizedEvent parametrizedEvent = this.f133238c;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
    }

    public DetailsSheetLink(@Y61.k DetailsSheetLinkBody detailsSheetLinkBody, @Y61.l ParametrizedEvent parametrizedEvent) {
        this.f133237b = detailsSheetLinkBody;
        this.f133238c = parametrizedEvent;
    }
}
