package com.avito.android.remote.model.payment.status.form;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.LinkAction;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentStatusFormResult.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "", "()V", "StatusForm", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult$StatusForm;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PaymentStatusFormResult {

    /* compiled from: PaymentStatusFormResult.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult$StatusForm;", "Lcom/avito/android/remote/model/payment/status/form/PaymentStatusFormResult;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/text/AttributedText;", "instructions", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/remote/model/LinkAction;", "action", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/LinkAction;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "getInstructions", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDisclaimer", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/remote/model/LinkAction;", "getAction", "()Lcom/avito/android/remote/model/LinkAction;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StatusForm extends PaymentStatusFormResult implements Parcelable {

        @k
        public static final Parcelable.Creator<StatusForm> CREATOR = new Creator();

        @c("action")
        @k
        private final LinkAction action;

        @c(ServiceTransportationWidget.DisclaimerField.TYPE)
        @k
        private final AttributedText disclaimer;

        @c("instructions")
        @k
        private final List<AttributedText> instructions;

        @c("title")
        @k
        private final String title;

        /* compiled from: PaymentStatusFormResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StatusForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StatusForm createFromParcel(@k Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(StatusForm.class, parcel, arrayList, iL2, 1);
                }
                return new StatusForm(string, arrayList, (AttributedText) parcel.readParcelable(StatusForm.class.getClassLoader()), (LinkAction) parcel.readParcelable(StatusForm.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final StatusForm[] newArray(int i12) {
                return new StatusForm[i12];
            }
        }

        public StatusForm(@k String str, @k List<AttributedText> list, @k AttributedText attributedText, @k LinkAction linkAction) {
            super(null);
            this.title = str;
            this.instructions = list;
            this.disclaimer = attributedText;
            this.action = linkAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final LinkAction getAction() {
            return this.action;
        }

        @k
        public final AttributedText getDisclaimer() {
            return this.disclaimer;
        }

        @k
        public final List<AttributedText> getInstructions() {
            return this.instructions;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Iterator itJ = C0.j(this.instructions, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            parcel.writeParcelable(this.disclaimer, flags);
            parcel.writeParcelable(this.action, flags);
        }
    }

    public /* synthetic */ PaymentStatusFormResult(C42822w c42822w) {
        this();
    }

    private PaymentStatusFormResult() {
    }
}
