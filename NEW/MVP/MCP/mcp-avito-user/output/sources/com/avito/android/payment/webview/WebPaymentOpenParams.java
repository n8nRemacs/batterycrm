package com.avito.android.payment.webview;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.payment.WebPaymentResourceProviderImpl;
import com.avito.android.payment.data.DialogInfo;
import com.avito.android.util.OpenParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.webrtc.h;

/* compiled from: WebPaymentOpenParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/webview/WebPaymentOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WebPaymentOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<WebPaymentOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f214820b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f214821c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DialogInfo f214822d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final WebPaymentResourceProviderImpl f214823e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Map<String, Object> f214824f;

    /* compiled from: WebPaymentOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WebPaymentOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final WebPaymentOpenParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DialogInfo dialogInfo = (DialogInfo) parcel.readParcelable(WebPaymentOpenParams.class.getClassLoader());
            WebPaymentResourceProviderImpl webPaymentResourceProviderImpl = (WebPaymentResourceProviderImpl) parcel.readParcelable(WebPaymentOpenParams.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(WebPaymentOpenParams.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new WebPaymentOpenParams(string, string2, dialogInfo, webPaymentResourceProviderImpl, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final WebPaymentOpenParams[] newArray(int i12) {
            return new WebPaymentOpenParams[i12];
        }
    }

    public WebPaymentOpenParams(@k String str, @k String str2, @l DialogInfo dialogInfo, @l WebPaymentResourceProviderImpl webPaymentResourceProviderImpl, @l Map<String, ? extends Object> map) {
        this.f214820b = str;
        this.f214821c = str2;
        this.f214822d = dialogInfo;
        this.f214823e = webPaymentResourceProviderImpl;
        this.f214824f = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f214820b);
        parcel.writeString(this.f214821c);
        parcel.writeParcelable(this.f214822d, i12);
        parcel.writeParcelable(this.f214823e, i12);
        Map<String, Object> map = this.f214824f;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
