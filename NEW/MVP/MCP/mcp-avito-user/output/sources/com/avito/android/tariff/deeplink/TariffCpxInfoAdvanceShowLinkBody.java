package com.avito.android.tariff.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoAdvanceShowLink.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/deeplink/TariffCpxInfoAdvanceShowLinkBody;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TariffCpxInfoAdvanceShowLinkBody implements Parcelable {

    @k
    public static final Parcelable.Creator<TariffCpxInfoAdvanceShowLinkBody> CREATOR = new a();

    @c("button")
    @k
    private final ButtonAction button;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: TariffCpxInfoAdvanceShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxInfoAdvanceShowLinkBody> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoAdvanceShowLinkBody createFromParcel(Parcel parcel) {
            return new TariffCpxInfoAdvanceShowLinkBody((AttributedText) parcel.readParcelable(TariffCpxInfoAdvanceShowLinkBody.class.getClassLoader()), (ButtonAction) parcel.readParcelable(TariffCpxInfoAdvanceShowLinkBody.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxInfoAdvanceShowLinkBody[] newArray(int i12) {
            return new TariffCpxInfoAdvanceShowLinkBody[i12];
        }
    }

    public TariffCpxInfoAdvanceShowLinkBody(@k AttributedText attributedText, @k ButtonAction buttonAction) {
        this.title = attributedText;
        this.button = buttonAction;
    }

    public static TariffCpxInfoAdvanceShowLinkBody a(TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody, ButtonAction buttonAction) {
        AttributedText attributedText = tariffCpxInfoAdvanceShowLinkBody.title;
        tariffCpxInfoAdvanceShowLinkBody.getClass();
        return new TariffCpxInfoAdvanceShowLinkBody(attributedText, buttonAction);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TariffCpxInfoAdvanceShowLinkBody)) {
            return false;
        }
        TariffCpxInfoAdvanceShowLinkBody tariffCpxInfoAdvanceShowLinkBody = (TariffCpxInfoAdvanceShowLinkBody) obj;
        return L.f(this.title, tariffCpxInfoAdvanceShowLinkBody.title) && L.f(this.button, tariffCpxInfoAdvanceShowLinkBody.button);
    }

    public final int hashCode() {
        return this.button.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoAdvanceShowLinkBody(title=");
        sb2.append(this.title);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeParcelable(this.button, i12);
    }
}
