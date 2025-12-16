package com.avito.android.service_order_widget.link;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.error.DeeplinkParsingError;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;
import q50.InterfaceC47204b;

/* compiled from: SendServiceOrderRequestLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestWithPhotoLink;", "Lcom/avito/android/service_order_widget/link/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class SendServiceOrderRequestWithPhotoLink extends DeepLink implements com.avito.android.service_order_widget.link.a {

    @Y61.k
    public static final Parcelable.Creator<SendServiceOrderRequestWithPhotoLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f278943b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f278944c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f278945d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f278946e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f278947f;

    /* compiled from: SendServiceOrderRequestLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendServiceOrderRequestWithPhotoLink> {
        @Override // android.os.Parcelable.Creator
        public final SendServiceOrderRequestWithPhotoLink createFromParcel(Parcel parcel) {
            return new SendServiceOrderRequestWithPhotoLink(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendServiceOrderRequestWithPhotoLink[] newArray(int i12) {
            return new SendServiceOrderRequestWithPhotoLink[i12];
        }
    }

    /* compiled from: SendServiceOrderRequestLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestWithPhotoLink$b;", "LKu/a;", "Lcom/avito/android/service_order_widget/link/SendServiceOrderRequestWithPhotoLink;", "<init>", "()V", "_avito_service-order-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<SendServiceOrderRequestWithPhotoLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) throws DeeplinkParsingError.WrongParameterValue {
            String strP = Ku.i.p(uri, "formId");
            String strP2 = Ku.i.p(uri, "itemId");
            String queryParameter = uri.getQueryParameter("endpointVersion");
            Integer numY0 = queryParameter != null ? C43066x.y0(queryParameter) : null;
            String queryParameter2 = uri.getQueryParameter("imageIds");
            return new SendServiceOrderRequestWithPhotoLink(strP, queryParameter2 != null ? C43066x.e0(queryParameter2, new char[]{','}) : C42784z0.f406748b, strP2, numY0, uri.getQueryParameter("messageDraft"));
        }
    }

    public SendServiceOrderRequestWithPhotoLink(@Y61.k String str, @Y61.k List list, @Y61.k String str2, @Y61.l Integer num, @Y61.l String str3) {
        this.f278943b = str;
        this.f278944c = str2;
        this.f278945d = num;
        this.f278946e = list;
        this.f278947f = str3;
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF278943b() {
        return this.f278943b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.l
    /* renamed from: e, reason: from getter */
    public final Integer getF278945d() {
        return this.f278945d;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendServiceOrderRequestWithPhotoLink)) {
            return false;
        }
        SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink = (SendServiceOrderRequestWithPhotoLink) obj;
        return L.f(this.f278943b, sendServiceOrderRequestWithPhotoLink.f278943b) && L.f(this.f278944c, sendServiceOrderRequestWithPhotoLink.f278944c) && L.f(this.f278945d, sendServiceOrderRequestWithPhotoLink.f278945d) && L.f(this.f278946e, sendServiceOrderRequestWithPhotoLink.f278946e) && L.f(this.f278947f, sendServiceOrderRequestWithPhotoLink.f278947f);
    }

    @Override // com.avito.android.service_order_widget.link.a
    @Y61.k
    /* renamed from: getItemId, reason: from getter */
    public final String getF278944c() {
        return this.f278944c;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f278943b.hashCode() * 31, 31, this.f278944c);
        Integer num = this.f278945d;
        int iE2 = H.e((iD2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f278946e);
        String str = this.f278947f;
        return iE2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendServiceOrderRequestWithPhotoLink(formId=");
        sb2.append(this.f278943b);
        sb2.append(", itemId=");
        sb2.append(this.f278944c);
        sb2.append(", endpointVersion=");
        sb2.append(this.f278945d);
        sb2.append(", images=");
        sb2.append(this.f278946e);
        sb2.append(", messageDraft=");
        return C22026a.c(sb2, this.f278947f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f278943b);
        parcel.writeString(this.f278944c);
        Integer num = this.f278945d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeStringList(this.f278946e);
        parcel.writeString(this.f278947f);
    }
}
