package com.avito.android.remote.model.payment;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentMethod.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u001f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/payment/PaymentMethod;", "Landroid/os/Parcelable;", "title", "", "signature", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "getSignature", "()Ljava/lang/String;", "getTitle", "ButtonMethod", "SelectableMethod", "Lcom/avito/android/remote/model/payment/PaymentMethod$ButtonMethod;", "Lcom/avito/android/remote/model/payment/PaymentMethod$SelectableMethod;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PaymentMethod implements Parcelable {

    @k
    private final transient DeepLink deepLink;

    @k
    private final transient String signature;

    @k
    private final transient String title;

    /* compiled from: PaymentMethod.kt */
    @d
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/payment/PaymentMethod$ButtonMethod;", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "", "title", "signature", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSignature", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ButtonMethod extends PaymentMethod {

        @k
        public static final Parcelable.Creator<ButtonMethod> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("signature")
        @k
        private final String signature;

        @c("title")
        @k
        private final String title;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ButtonMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonMethod createFromParcel(@k Parcel parcel) {
                return new ButtonMethod(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ButtonMethod.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ButtonMethod[] newArray(int i12) {
                return new ButtonMethod[i12];
            }
        }

        public ButtonMethod(@k String str, @k String str2, @k DeepLink deepLink) {
            super(str, str2, deepLink, null);
            this.title = str;
            this.signature = str2;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public String getSignature() {
            return this.signature;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.signature);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: PaymentMethod.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b\u000b\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b$\u0010\u001a¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/payment/PaymentMethod$SelectableMethod;", "Lcom/avito/android/remote/model/payment/PaymentMethod;", "", "label", "description", "information", "title", "signature", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "isButtonDisabled", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getDescription", "getInformation", "getTitle", "getSignature", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getErrorMessage", "_avito-discouraged_avito-api_payment"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectableMethod extends PaymentMethod {

        @k
        public static final Parcelable.Creator<SelectableMethod> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("description")
        @l
        private final String description;

        @c("errorMessage")
        @l
        private final String errorMessage;

        @c("information")
        @l
        private final String information;

        @c("isButtonDisabled")
        @l
        private final Boolean isButtonDisabled;

        @c("label")
        @l
        private final String label;

        @c("signature")
        @k
        private final String signature;

        @c("title")
        @k
        private final String title;

        /* compiled from: PaymentMethod.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectableMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectableMethod createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(SelectableMethod.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SelectableMethod(string, string2, string3, string4, string5, deepLink, boolValueOf, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectableMethod[] newArray(int i12) {
                return new SelectableMethod[i12];
            }
        }

        public SelectableMethod(@l String str, @l String str2, @l String str3, @k String str4, @k String str5, @k DeepLink deepLink, @l Boolean bool, @l String str6) {
            super(str4, str5, deepLink, null);
            this.label = str;
            this.description = str2;
            this.information = str3;
            this.title = str4;
            this.signature = str5;
            this.deepLink = deepLink;
            this.isButtonDisabled = bool;
            this.errorMessage = str6;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final String getDescription() {
            return this.description;
        }

        @l
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @l
        public final String getInformation() {
            return this.information;
        }

        @l
        public final String getLabel() {
            return this.label;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public String getSignature() {
            return this.signature;
        }

        @Override // com.avito.android.remote.model.payment.PaymentMethod
        @k
        public String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: isButtonDisabled, reason: from getter */
        public final Boolean getIsButtonDisabled() {
            return this.isButtonDisabled;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.label);
            parcel.writeString(this.description);
            parcel.writeString(this.information);
            parcel.writeString(this.title);
            parcel.writeString(this.signature);
            parcel.writeParcelable(this.deepLink, flags);
            Boolean bool = this.isButtonDisabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeString(this.errorMessage);
        }
    }

    public /* synthetic */ PaymentMethod(String str, String str2, DeepLink deepLink, C42822w c42822w) {
        this(str, str2, deepLink);
    }

    @k
    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public String getSignature() {
        return this.signature;
    }

    @k
    public String getTitle() {
        return this.title;
    }

    private PaymentMethod(String str, String str2, DeepLink deepLink) {
        this.title = str;
        this.signature = str2;
        this.deepLink = deepLink;
    }
}
