package com.avito.android.remote.model.payment.form;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.publish.drafts.LocalPublishState;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentGenericFormResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "", "()V", "Ok", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult$Ok;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PaymentGenericFormResult {

    /* compiled from: PaymentGenericFormResult.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b \u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult$Ok;", "Lcom/avito/android/remote/model/payment/form/PaymentGenericFormResult;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "information", "submitText", "paymentSessionId", "methodSignature", "", "Lcom/avito/android/remote/model/category_parameters/base/ParameterSlot;", LocalPublishState.FIELDS, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "getInformation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getSubmitText", "getPaymentSessionId", "getMethodSignature", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends PaymentGenericFormResult implements Parcelable {

        @k
        public static final Parcelable.Creator<Ok> CREATOR = new Creator();

        @c(LocalPublishState.FIELDS)
        @k
        private final List<ParameterSlot> fields;

        @c("information")
        @k
        private final AttributedText information;

        @c("methodSignature")
        @k
        private final String methodSignature;

        @c("paymentSessionId")
        @k
        private final String paymentSessionId;

        @c("submitText")
        @k
        private final String submitText;

        @c("title")
        @k
        private final String title;

        /* compiled from: PaymentGenericFormResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Ok> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Ok createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                AttributedText attributedText = (AttributedText) parcel.readParcelable(Ok.class.getClassLoader());
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(Ok.class, parcel, arrayList, iL2, 1);
                }
                return new Ok(string, attributedText, string2, string3, string4, arrayList);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Ok[] newArray(int i12) {
                return new Ok[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ok(@k String str, @k AttributedText attributedText, @k String str2, @k String str3, @k String str4, @k List<? extends ParameterSlot> list) {
            super(null);
            this.title = str;
            this.information = attributedText;
            this.submitText = str2;
            this.paymentSessionId = str3;
            this.methodSignature = str4;
            this.fields = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final List<ParameterSlot> getFields() {
            return this.fields;
        }

        @k
        public final AttributedText getInformation() {
            return this.information;
        }

        @k
        public final String getMethodSignature() {
            return this.methodSignature;
        }

        @k
        public final String getPaymentSessionId() {
            return this.paymentSessionId;
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
            parcel.writeString(this.title);
            parcel.writeParcelable(this.information, flags);
            parcel.writeString(this.submitText);
            parcel.writeString(this.paymentSessionId);
            parcel.writeString(this.methodSignature);
            Iterator itJ = C0.j(this.fields, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
        }
    }

    public /* synthetic */ PaymentGenericFormResult(C42822w c42822w) {
        this();
    }

    private PaymentGenericFormResult() {
    }
}
