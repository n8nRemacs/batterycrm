package com.avito.android.service_order_widget.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrderRequestResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "redirectLink", "Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$Action;", "newPrimaryAction", "", "message", "Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$ButtonSytle;", "newButtonStyle", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$Action;Ljava/lang/String;Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$ButtonSytle;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$Action;", "d", "()Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$Action;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$ButtonSytle;", "c", "()Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$ButtonSytle;", "Action", "ButtonSytle", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceOrderRequestResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceOrderRequestResponse> CREATOR = new a();

    @c("message")
    @k
    private final String message;

    @c("newButtonStyle")
    @l
    private final ButtonSytle newButtonStyle;

    @c("newPrimaryAction")
    @k
    private final Action newPrimaryAction;

    @c("redirectLink")
    @l
    private final DeepLink redirectLink;

    /* compiled from: ServiceOrderRequestResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$Action;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* compiled from: ServiceOrderRequestResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.title, action.title) && L.f(this.uri, action.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final DeepLink getUri() {
            return this.uri;
        }

        public final int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServiceOrderRequestResponse.kt */
    @d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/service_order_widget/api/model/ServiceOrderRequestResponse$ButtonSytle;", "Landroid/os/Parcelable;", "", "avito", "avitoRe23", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ButtonSytle implements Parcelable {

        @k
        public static final Parcelable.Creator<ButtonSytle> CREATOR = new a();

        @c("avito")
        @k
        private final String avito;

        @c("avitoRe23")
        @k
        private final String avitoRe23;

        /* compiled from: ServiceOrderRequestResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ButtonSytle> {
            @Override // android.os.Parcelable.Creator
            public final ButtonSytle createFromParcel(Parcel parcel) {
                return new ButtonSytle(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ButtonSytle[] newArray(int i12) {
                return new ButtonSytle[i12];
            }
        }

        public ButtonSytle(@k String str, @k String str2) {
            this.avito = str;
            this.avitoRe23 = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getAvito() {
            return this.avito;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getAvitoRe23() {
            return this.avitoRe23;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonSytle)) {
                return false;
            }
            ButtonSytle buttonSytle = (ButtonSytle) obj;
            return L.f(this.avito, buttonSytle.avito) && L.f(this.avitoRe23, buttonSytle.avitoRe23);
        }

        public final int hashCode() {
            return this.avitoRe23.hashCode() + (this.avito.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonSytle(avito=");
            sb2.append(this.avito);
            sb2.append(", avitoRe23=");
            return C22026a.c(sb2, this.avitoRe23, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.avito);
            parcel.writeString(this.avitoRe23);
        }
    }

    /* compiled from: ServiceOrderRequestResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ServiceOrderRequestResponse> {
        @Override // android.os.Parcelable.Creator
        public final ServiceOrderRequestResponse createFromParcel(Parcel parcel) {
            return new ServiceOrderRequestResponse((DeepLink) parcel.readParcelable(ServiceOrderRequestResponse.class.getClassLoader()), Action.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : ButtonSytle.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceOrderRequestResponse[] newArray(int i12) {
            return new ServiceOrderRequestResponse[i12];
        }
    }

    public ServiceOrderRequestResponse(@l DeepLink deepLink, @k Action action, @k String str, @l ButtonSytle buttonSytle) {
        this.redirectLink = deepLink;
        this.newPrimaryAction = action;
        this.message = str;
        this.newButtonStyle = buttonSytle;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ButtonSytle getNewButtonStyle() {
        return this.newButtonStyle;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Action getNewPrimaryAction() {
        return this.newPrimaryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getRedirectLink() {
        return this.redirectLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceOrderRequestResponse)) {
            return false;
        }
        ServiceOrderRequestResponse serviceOrderRequestResponse = (ServiceOrderRequestResponse) obj;
        return L.f(this.redirectLink, serviceOrderRequestResponse.redirectLink) && L.f(this.newPrimaryAction, serviceOrderRequestResponse.newPrimaryAction) && L.f(this.message, serviceOrderRequestResponse.message) && L.f(this.newButtonStyle, serviceOrderRequestResponse.newButtonStyle);
    }

    @k
    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        DeepLink deepLink = this.redirectLink;
        int iD2 = H.d((this.newPrimaryAction.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31)) * 31, 31, this.message);
        ButtonSytle buttonSytle = this.newButtonStyle;
        return iD2 + (buttonSytle != null ? buttonSytle.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ServiceOrderRequestResponse(redirectLink=" + this.redirectLink + ", newPrimaryAction=" + this.newPrimaryAction + ", message=" + this.message + ", newButtonStyle=" + this.newButtonStyle + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.redirectLink, i12);
        this.newPrimaryAction.writeToParcel(parcel, i12);
        parcel.writeString(this.message);
        ButtonSytle buttonSytle = this.newButtonStyle;
        if (buttonSytle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonSytle.writeToParcel(parcel, i12);
        }
    }
}
