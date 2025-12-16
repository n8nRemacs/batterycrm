package com.avito.android.remote.model.payment.service;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.payment.PaymentMethod;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: PaymentSessionResult.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/payment/service/PaymentSessionResult;", "Landroid/os/Parcelable;", "", "sessionId", "title", "submitText", "", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "paymentMethods", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "getTitle", "getSubmitText", "Ljava/util/List;", "getPaymentMethods", "()Ljava/util/List;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PaymentSessionResult implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentSessionResult> CREATOR = new Creator();

    @c("items")
    @k
    private final List<List<PaymentMethod>> paymentMethods;

    @c("paymentSessionId")
    @k
    private final String sessionId;

    @c("submitText")
    @k
    private final String submitText;

    @c("title")
    @k
    private final String title;

    /* compiled from: PaymentSessionResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PaymentSessionResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PaymentSessionResult createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iL2 = 0;
                while (iL2 != i14) {
                    iL2 = a.l(PaymentSessionResult.class, parcel, arrayList2, iL2, 1);
                }
                arrayList.add(arrayList2);
            }
            return new PaymentSessionResult(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PaymentSessionResult[] newArray(int i12) {
            return new PaymentSessionResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentSessionResult(@k String str, @k String str2, @k String str3, @k List<? extends List<? extends PaymentMethod>> list) {
        this.sessionId = str;
        this.title = str2;
        this.submitText = str3;
        this.paymentMethods = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final List<List<PaymentMethod>> getPaymentMethods() {
        return this.paymentMethods;
    }

    @k
    public final String getSessionId() {
        return this.sessionId;
    }

    @k
    public final String getSubmitText() {
        return this.submitText;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.sessionId);
        parcel.writeString(this.title);
        parcel.writeString(this.submitText);
        Iterator itJ = C0.j(this.paymentMethods, parcel);
        while (itJ.hasNext()) {
            Iterator itJ2 = C0.j((List) itJ.next(), parcel);
            while (itJ2.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ2.next(), flags);
            }
        }
    }
}
