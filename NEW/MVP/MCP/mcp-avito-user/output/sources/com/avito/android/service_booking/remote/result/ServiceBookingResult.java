package com.avito.android.service_booking.remote.result;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.service_booking.ServiceBookingBlock;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingResult.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult;", "Landroid/os/Parcelable;", "Failure", "Ok", "PartnerServiceError", "ServiceBookingBduiBlock", "ServiceBookingNextAction", "ServiceBookingOnStartAnimation", "WrongSlotError", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$Failure;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$Ok;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$PartnerServiceError;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$WrongSlotError;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ServiceBookingResult extends Parcelable {

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$Failure;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends ServiceBookingError implements ServiceBookingResult {

        @k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        @c("message")
        @k
        private final String message;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && L.f(this.message, ((Failure) obj).message);
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        @k
        public final String getMessage() {
            return this.message;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final int hashCode() {
            return this.message.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u00002\u00020\u0001B|\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R!\u0010\u0004\u001a\t\u0018\u00010\u0002¢\u0006\u0002\b\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b$\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b)\u0010'R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$Ok;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingBduiBlock;", "LK51/e;", "bdui", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation;", "onStartAnimation", "", "hasNextButton", "hasCloseButton", "hasBackButton", "", "title", "prevActionButton", "returnButtonText", "", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "params", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingNextAction;", "nextAction", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingAction", "<init>", "(Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingBduiBlock;Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingNextAction;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingBduiBlock;", "getBdui", "()Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingBduiBlock;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation;", "getOnStartAnimation", "()Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation;", "Ljava/lang/Boolean;", "getHasNextButton", "()Ljava/lang/Boolean;", "Z", "getHasCloseButton", "()Z", "getHasBackButton", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getPrevActionButton", "getReturnButtonText", "Ljava/util/List;", "getParams", "()Ljava/util/List;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingNextAction;", "getNextAction", "()Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingNextAction;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnboardingAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements ServiceBookingResult {

        @k
        public static final Parcelable.Creator<Ok> CREATOR = new a();

        @c("bdui")
        @l
        private final ServiceBookingBduiBlock bdui;

        @c("hasBackButton")
        @l
        private final Boolean hasBackButton;

        @c("hasCloseButton")
        private final boolean hasCloseButton;

        @c("hasNextButton")
        @l
        private final Boolean hasNextButton;

        @c("nextAction")
        @l
        private final ServiceBookingNextAction nextAction;

        @c("onStartAnimation")
        @l
        private final ServiceBookingOnStartAnimation onStartAnimation;

        @c("onboardingAction")
        @l
        private final DeepLink onboardingAction;

        @c("params")
        @k
        private final List<ServiceBookingBlock> params;

        @c("prevActionButton")
        @l
        private final String prevActionButton;

        @c("returnButtonText")
        @l
        private final String returnButtonText;

        @c("title")
        @l
        private final String title;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Ok> {
            @Override // android.os.Parcelable.Creator
            public final Ok createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                Boolean boolValueOf2;
                ServiceBookingBduiBlock serviceBookingBduiBlockCreateFromParcel = parcel.readInt() == 0 ? null : ServiceBookingBduiBlock.CREATOR.createFromParcel(parcel);
                ServiceBookingOnStartAnimation serviceBookingOnStartAnimationCreateFromParcel = parcel.readInt() == 0 ? null : ServiceBookingOnStartAnimation.CREATOR.createFromParcel(parcel);
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Ok.class, parcel, arrayList, iL2, 1);
                }
                return new Ok(serviceBookingBduiBlockCreateFromParcel, serviceBookingOnStartAnimationCreateFromParcel, boolValueOf, z12, boolValueOf2, string, string2, string3, arrayList, parcel.readInt() != 0 ? ServiceBookingNextAction.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(Ok.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Ok[] newArray(int i12) {
                return new Ok[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ok(@l ServiceBookingBduiBlock serviceBookingBduiBlock, @l ServiceBookingOnStartAnimation serviceBookingOnStartAnimation, @l Boolean bool, boolean z12, @l Boolean bool2, @l String str, @l String str2, @l String str3, @k List<? extends ServiceBookingBlock> list, @l ServiceBookingNextAction serviceBookingNextAction, @l DeepLink deepLink) {
            this.bdui = serviceBookingBduiBlock;
            this.onStartAnimation = serviceBookingOnStartAnimation;
            this.hasNextButton = bool;
            this.hasCloseButton = z12;
            this.hasBackButton = bool2;
            this.title = str;
            this.prevActionButton = str2;
            this.returnButtonText = str3;
            this.params = list;
            this.nextAction = serviceBookingNextAction;
            this.onboardingAction = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ServiceBookingBduiBlock serviceBookingBduiBlock = this.bdui;
            if (serviceBookingBduiBlock == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                serviceBookingBduiBlock.writeToParcel(parcel, i12);
            }
            ServiceBookingOnStartAnimation serviceBookingOnStartAnimation = this.onStartAnimation;
            if (serviceBookingOnStartAnimation == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                serviceBookingOnStartAnimation.writeToParcel(parcel, i12);
            }
            Boolean bool = this.hasNextButton;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            parcel.writeInt(this.hasCloseButton ? 1 : 0);
            Boolean bool2 = this.hasBackButton;
            if (bool2 == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool2);
            }
            parcel.writeString(this.title);
            parcel.writeString(this.prevActionButton);
            parcel.writeString(this.returnButtonText);
            Iterator itJ = C0.j(this.params, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            ServiceBookingNextAction serviceBookingNextAction = this.nextAction;
            if (serviceBookingNextAction == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                serviceBookingNextAction.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.onboardingAction, i12);
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$PartnerServiceError;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingError;", "", "title", "message", "", "hasReloadButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getMessage", "Z", "c", "()Z", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PartnerServiceError extends ServiceBookingError implements ServiceBookingResult {

        @k
        public static final Parcelable.Creator<PartnerServiceError> CREATOR = new a();

        @c("hasReloadButton")
        private final boolean hasReloadButton;

        @c("message")
        @k
        private final String message;

        @c("title")
        @k
        private final String title;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PartnerServiceError> {
            @Override // android.os.Parcelable.Creator
            public final PartnerServiceError createFromParcel(Parcel parcel) {
                return new PartnerServiceError(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final PartnerServiceError[] newArray(int i12) {
                return new PartnerServiceError[i12];
            }
        }

        public PartnerServiceError(@k String str, @k String str2, boolean z12) {
            super(null);
            this.title = str;
            this.message = str2;
            this.hasReloadButton = z12;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getHasReloadButton() {
            return this.hasReloadButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PartnerServiceError)) {
                return false;
            }
            PartnerServiceError partnerServiceError = (PartnerServiceError) obj;
            return L.f(this.title, partnerServiceError.title) && L.f(this.message, partnerServiceError.message) && this.hasReloadButton == partnerServiceError.hasReloadButton;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        @k
        public final String getMessage() {
            return this.message;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final int hashCode() {
            return Boolean.hashCode(this.hasReloadButton) + H.d(this.title.hashCode() * 31, 31, this.message);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PartnerServiceError(title=");
            sb2.append(this.title);
            sb2.append(", message=");
            sb2.append(this.message);
            sb2.append(", hasReloadButton=");
            return r.x(sb2, this.hasReloadButton, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.message);
            parcel.writeInt(this.hasReloadButton ? 1 : 0);
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0016\u0012\r\u0010\u0004\u001a\t\u0018\u00010\u0002¢\u0006\u0002\b\u0003¢\u0006\u0004\b\u0005\u0010\u0006R!\u0010\u0004\u001a\t\u0018\u00010\u0002¢\u0006\u0002\b\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingBduiBlock;", "Landroid/os/Parcelable;", "Lcom/google/gson/k;", "LK51/e;", "content", "<init>", "(Lcom/google/gson/k;)V", "Lcom/google/gson/k;", "getContent", "()Lcom/google/gson/k;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingBduiBlock implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingBduiBlock> CREATOR = new a();

        @c("content")
        @l
        private final com.google.gson.k content;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingBduiBlock> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingBduiBlock createFromParcel(Parcel parcel) {
                return new ServiceBookingBduiBlock((com.google.gson.k) parcel.readValue(ServiceBookingBduiBlock.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingBduiBlock[] newArray(int i12) {
                return new ServiceBookingBduiBlock[i12];
            }
        }

        public ServiceBookingBduiBlock(@l com.google.gson.k kVar) {
            this.content = kVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceBookingBduiBlock) && L.f(this.content, ((ServiceBookingBduiBlock) obj).content);
        }

        public final int hashCode() {
            com.google.gson.k kVar = this.content;
            if (kVar == null) {
                return 0;
            }
            return kVar.f362194b.hashCode();
        }

        @k
        public final String toString() {
            return "ServiceBookingBduiBlock(content=" + this.content + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeValue(this.content);
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingNextAction;", "Landroid/os/Parcelable;", "", "title", "titleChanged", "nextStep", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getTitleChanged", "getNextStep", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingNextAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingNextAction> CREATOR = new a();

        @c("nextStep")
        @k
        private final String nextStep;

        @c("title")
        @k
        private final String title;

        @c("titleChanged")
        @l
        private final String titleChanged;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingNextAction> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingNextAction createFromParcel(Parcel parcel) {
                return new ServiceBookingNextAction(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingNextAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingNextAction[] newArray(int i12) {
                return new ServiceBookingNextAction[i12];
            }
        }

        public ServiceBookingNextAction(@k String str, @l String str2, @k String str3, @l DeepLink deepLink) {
            this.title = str;
            this.titleChanged = str2;
            this.nextStep = str3;
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
            if (!(obj instanceof ServiceBookingNextAction)) {
                return false;
            }
            ServiceBookingNextAction serviceBookingNextAction = (ServiceBookingNextAction) obj;
            return L.f(this.title, serviceBookingNextAction.title) && L.f(this.titleChanged, serviceBookingNextAction.titleChanged) && L.f(this.nextStep, serviceBookingNextAction.nextStep) && L.f(this.uri, serviceBookingNextAction.uri);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.titleChanged;
            int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.nextStep);
            DeepLink deepLink = this.uri;
            return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingNextAction(title=");
            sb2.append(this.title);
            sb2.append(", titleChanged=");
            sb2.append(this.titleChanged);
            sb2.append(", nextStep=");
            sb2.append(this.nextStep);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeString(this.titleChanged);
            parcel.writeString(this.nextStep);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation;", "Landroid/os/Parcelable;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation$ServiceBookingAnimationUrl;", "animationUrl", "<init>", "(Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation$ServiceBookingAnimationUrl;)V", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation$ServiceBookingAnimationUrl;", "getAnimationUrl", "()Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation$ServiceBookingAnimationUrl;", "ServiceBookingAnimationUrl", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingOnStartAnimation implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingOnStartAnimation> CREATOR = new a();

        @c("animationUrl")
        @l
        private final ServiceBookingAnimationUrl animationUrl;

        /* compiled from: ServiceBookingResult.kt */
        @d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$ServiceBookingOnStartAnimation$ServiceBookingAnimationUrl;", "Landroid/os/Parcelable;", "", "portraitUrl", "landscapeUrl", "tabletPortraitUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getPortraitUrl", "()Ljava/lang/String;", "getLandscapeUrl", "getTabletPortraitUrl", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ServiceBookingAnimationUrl implements Parcelable {

            @k
            public static final Parcelable.Creator<ServiceBookingAnimationUrl> CREATOR = new a();

            @c("landscapeUrl")
            @l
            private final String landscapeUrl;

            @c("portraitUrl")
            @l
            private final String portraitUrl;

            @c("tabletPortraitUrl")
            @l
            private final String tabletPortraitUrl;

            /* compiled from: ServiceBookingResult.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ServiceBookingAnimationUrl> {
                @Override // android.os.Parcelable.Creator
                public final ServiceBookingAnimationUrl createFromParcel(Parcel parcel) {
                    return new ServiceBookingAnimationUrl(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ServiceBookingAnimationUrl[] newArray(int i12) {
                    return new ServiceBookingAnimationUrl[i12];
                }
            }

            public ServiceBookingAnimationUrl(@l String str, @l String str2, @l String str3) {
                this.portraitUrl = str;
                this.landscapeUrl = str2;
                this.tabletPortraitUrl = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ServiceBookingAnimationUrl)) {
                    return false;
                }
                ServiceBookingAnimationUrl serviceBookingAnimationUrl = (ServiceBookingAnimationUrl) obj;
                return L.f(this.portraitUrl, serviceBookingAnimationUrl.portraitUrl) && L.f(this.landscapeUrl, serviceBookingAnimationUrl.landscapeUrl) && L.f(this.tabletPortraitUrl, serviceBookingAnimationUrl.tabletPortraitUrl);
            }

            public final int hashCode() {
                String str = this.portraitUrl;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.landscapeUrl;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.tabletPortraitUrl;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ServiceBookingAnimationUrl(portraitUrl=");
                sb2.append(this.portraitUrl);
                sb2.append(", landscapeUrl=");
                sb2.append(this.landscapeUrl);
                sb2.append(", tabletPortraitUrl=");
                return C22026a.c(sb2, this.tabletPortraitUrl, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.portraitUrl);
                parcel.writeString(this.landscapeUrl);
                parcel.writeString(this.tabletPortraitUrl);
            }
        }

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingOnStartAnimation> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingOnStartAnimation createFromParcel(Parcel parcel) {
                return new ServiceBookingOnStartAnimation(parcel.readInt() == 0 ? null : ServiceBookingAnimationUrl.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingOnStartAnimation[] newArray(int i12) {
                return new ServiceBookingOnStartAnimation[i12];
            }
        }

        public ServiceBookingOnStartAnimation(@l ServiceBookingAnimationUrl serviceBookingAnimationUrl) {
            this.animationUrl = serviceBookingAnimationUrl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceBookingOnStartAnimation) && L.f(this.animationUrl, ((ServiceBookingOnStartAnimation) obj).animationUrl);
        }

        public final int hashCode() {
            ServiceBookingAnimationUrl serviceBookingAnimationUrl = this.animationUrl;
            if (serviceBookingAnimationUrl == null) {
                return 0;
            }
            return serviceBookingAnimationUrl.hashCode();
        }

        @k
        public final String toString() {
            return "ServiceBookingOnStartAnimation(animationUrl=" + this.animationUrl + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ServiceBookingAnimationUrl serviceBookingAnimationUrl = this.animationUrl;
            if (serviceBookingAnimationUrl == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                serviceBookingAnimationUrl.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: ServiceBookingResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/android/service_booking/remote/result/ServiceBookingResult$WrongSlotError;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingResult;", "Lcom/avito/android/service_booking/remote/result/ServiceBookingError;", "", "message", "moveToStepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "c", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WrongSlotError extends ServiceBookingError implements ServiceBookingResult {

        @k
        public static final Parcelable.Creator<WrongSlotError> CREATOR = new a();

        @c("message")
        @k
        private final String message;

        @c("moveToStepId")
        @l
        private final String moveToStepId;

        /* compiled from: ServiceBookingResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<WrongSlotError> {
            @Override // android.os.Parcelable.Creator
            public final WrongSlotError createFromParcel(Parcel parcel) {
                return new WrongSlotError(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final WrongSlotError[] newArray(int i12) {
                return new WrongSlotError[i12];
            }
        }

        public WrongSlotError(@k String str, @l String str2) {
            super(null);
            this.message = str;
            this.moveToStepId = str2;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getMoveToStepId() {
            return this.moveToStepId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WrongSlotError)) {
                return false;
            }
            WrongSlotError wrongSlotError = (WrongSlotError) obj;
            return L.f(this.message, wrongSlotError.message) && L.f(this.moveToStepId, wrongSlotError.moveToStepId);
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        @k
        public final String getMessage() {
            return this.message;
        }

        @Override // com.avito.android.service_booking.remote.result.ServiceBookingError
        public final int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.moveToStepId;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("WrongSlotError(message=");
            sb2.append(this.message);
            sb2.append(", moveToStepId=");
            return C22026a.c(sb2, this.moveToStepId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.message);
            parcel.writeString(this.moveToStepId);
        }
    }
}
