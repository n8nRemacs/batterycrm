package com.avito.android.service_order_widget.link;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import q50.InterfaceC47204b;

/* compiled from: SendServiceOrderRequestLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestOldLink;", "Lcom/avito/android/service_order_widget/link/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class SendServiceOrderRequestOldLink extends DeepLink implements com.avito.android.service_order_widget.link.a {

    @Y61.k
    public static final Parcelable.Creator<SendServiceOrderRequestOldLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f278940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f278941c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f278942d;

    /* compiled from: SendServiceOrderRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendServiceOrderRequestOldLink> {
        @Override // android.os.Parcelable.Creator
        public final SendServiceOrderRequestOldLink createFromParcel(Parcel parcel) {
            return new SendServiceOrderRequestOldLink(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SendServiceOrderRequestOldLink[] newArray(int i12) {
            return new SendServiceOrderRequestOldLink[i12];
        }
    }

    /* compiled from: SendServiceOrderRequestLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestOldLink$b;", "LKu/a;", "Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestOldLink;", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<SendServiceOrderRequestOldLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
            String strP = Ku.i.p(uri, "formId");
            String strP2 = Ku.i.p(uri, "itemId");
            String queryParameter = uri.getQueryParameter("endpointVersion");
            return new SendServiceOrderRequestOldLink(strP, strP2, queryParameter != null ? C43066x.y0(queryParameter) : null);
        }
    }

    public SendServiceOrderRequestOldLink(@Y61.k String str, @Y61.k String str2, @Y61.l Integer num) {
        this.f278940b = str;
        this.f278941c = str2;
        this.f278942d = num;
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF278940b() {
        return this.f278940b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Integer getF278942d() {
        return this.f278942d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendServiceOrderRequestOldLink)) {
            return false;
        }
        SendServiceOrderRequestOldLink sendServiceOrderRequestOldLink = (SendServiceOrderRequestOldLink) obj;
        return L.f(this.f278940b, sendServiceOrderRequestOldLink.f278940b) && L.f(this.f278941c, sendServiceOrderRequestOldLink.f278941c) && L.f(this.f278942d, sendServiceOrderRequestOldLink.f278942d);
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public final String getF278941c() {
        return this.f278941c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f278940b.hashCode() * 31, 31, this.f278941c);
        Integer num = this.f278942d;
        return iD2 + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendServiceOrderRequestOldLink(formId=");
        sb2.append(this.f278940b);
        sb2.append(", itemId=");
        sb2.append(this.f278941c);
        sb2.append(", endpointVersion=");
        return s.j(sb2, this.f278942d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f278940b);
        parcel.writeString(this.f278941c);
        Integer num = this.f278942d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
