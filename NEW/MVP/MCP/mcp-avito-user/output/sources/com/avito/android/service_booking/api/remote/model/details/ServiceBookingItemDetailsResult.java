package com.avito.android.service_booking.api.remote.model.details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.service_booking.ServiceBookingBlock;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItemDetailsResult.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001:\u0002&'Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0007\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b!\u0010\u001dR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult;", "", "", "hasCloseButton", "", "title", "prevActionButton", "", "Lcom/avito/android/service_booking/ServiceBookingBlock;", "params", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction;", "actions", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsButtonsAction;", "buttons", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboardingAction", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Z", "d", "()Z", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "g", "Ljava/util/List;", "f", "()Ljava/util/List;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "a", "b", "Lcom/avito/android/deep_linking/links/DeepLink;", "e", "()Lcom/avito/android/deep_linking/links/DeepLink;", "ServiceBookingItemDetailsAction", "ServiceBookingItemDetailsButtonsAction", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingItemDetailsResult {

    @c("actions")
    @l
    private final List<ServiceBookingItemDetailsAction> actions;

    @c("buttons")
    @l
    private final List<ServiceBookingItemDetailsButtonsAction> buttons;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final AttributedText disclaimer;

    @c("hasCloseButton")
    private final boolean hasCloseButton;

    @c("onboardingAction")
    @l
    private final DeepLink onboardingAction;

    @c("params")
    @k
    private final List<ServiceBookingBlock> params;

    @c("prevActionButton")
    @k
    private final String prevActionButton;

    @c("title")
    @k
    private final String title;

    /* compiled from: ServiceBookingItemDetailsResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ActionType;", "actionType", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ButtonType;", "buttonType", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ActionType;Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ButtonType;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ActionType;", "c", "()Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ActionType;", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ButtonType;", "d", "()Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ButtonType;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "ActionType", "ButtonType", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ServiceBookingItemDetailsAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingItemDetailsAction> CREATOR = new a();

        @c("action")
        @k
        private final ActionType actionType;

        @c("type")
        @k
        private final ButtonType buttonType;

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink uri;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ServiceBookingItemDetailsResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ActionType;", "", "(Ljava/lang/String;I)V", "CONFIRM", "EDIT", "CANCEL", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ActionType {

            @c("cancel")
            public static final ActionType CANCEL;

            @c("confirm")
            public static final ActionType CONFIRM;

            @c("edit")
            public static final ActionType EDIT;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ActionType[] f274171b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f274172c;

            static {
                ActionType actionType = new ActionType("CONFIRM", 0);
                CONFIRM = actionType;
                ActionType actionType2 = new ActionType("EDIT", 1);
                EDIT = actionType2;
                ActionType actionType3 = new ActionType("CANCEL", 2);
                CANCEL = actionType3;
                ActionType[] actionTypeArr = {actionType, actionType2, actionType3};
                f274171b = actionTypeArr;
                f274172c = kotlin.enums.c.a(actionTypeArr);
            }

            private ActionType(String str, int i12) {
            }

            public static ActionType valueOf(String str) {
                return (ActionType) Enum.valueOf(ActionType.class, str);
            }

            public static ActionType[] values() {
                return (ActionType[]) f274171b.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ServiceBookingItemDetailsResult.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction$ButtonType;", "", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ButtonType {

            @c("primary")
            public static final ButtonType PRIMARY;

            @c("secondary")
            public static final ButtonType SECONDARY;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ButtonType[] f274173b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f274174c;

            static {
                ButtonType buttonType = new ButtonType("PRIMARY", 0);
                PRIMARY = buttonType;
                ButtonType buttonType2 = new ButtonType("SECONDARY", 1);
                SECONDARY = buttonType2;
                ButtonType[] buttonTypeArr = {buttonType, buttonType2};
                f274173b = buttonTypeArr;
                f274174c = kotlin.enums.c.a(buttonTypeArr);
            }

            private ButtonType(String str, int i12) {
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) f274173b.clone();
            }
        }

        /* compiled from: ServiceBookingItemDetailsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingItemDetailsAction> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingItemDetailsAction createFromParcel(Parcel parcel) {
                return new ServiceBookingItemDetailsAction(ActionType.valueOf(parcel.readString()), ButtonType.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(ServiceBookingItemDetailsAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingItemDetailsAction[] newArray(int i12) {
                return new ServiceBookingItemDetailsAction[i12];
            }
        }

        public ServiceBookingItemDetailsAction(@k ActionType actionType, @k ButtonType buttonType, @k String str, @k DeepLink deepLink) {
            this.actionType = actionType;
            this.buttonType = buttonType;
            this.title = str;
            this.uri = deepLink;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final ActionType getActionType() {
            return this.actionType;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServiceBookingItemDetailsAction)) {
                return false;
            }
            ServiceBookingItemDetailsAction serviceBookingItemDetailsAction = (ServiceBookingItemDetailsAction) obj;
            return this.actionType == serviceBookingItemDetailsAction.actionType && this.buttonType == serviceBookingItemDetailsAction.buttonType && L.f(this.title, serviceBookingItemDetailsAction.title) && L.f(this.uri, serviceBookingItemDetailsAction.uri);
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
            return this.uri.hashCode() + H.d((this.buttonType.hashCode() + (this.actionType.hashCode() * 31)) * 31, 31, this.title);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceBookingItemDetailsAction(actionType=");
            sb2.append(this.actionType);
            sb2.append(", buttonType=");
            sb2.append(this.buttonType);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.actionType.name());
            parcel.writeString(this.buttonType.name());
            parcel.writeString(this.title);
            parcel.writeParcelable(this.uri, i12);
        }
    }

    /* compiled from: ServiceBookingItemDetailsResult.kt */
    @d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsButtonsAction;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/service_booking/api/remote/model/details/ServiceBookingItemDetailsResult$ServiceBookingItemDetailsAction;", "actions", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito-discouraged_avito-network_service-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceBookingItemDetailsButtonsAction implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceBookingItemDetailsButtonsAction> CREATOR = new a();

        @c("actions")
        @k
        private final List<ServiceBookingItemDetailsAction> actions;

        /* compiled from: ServiceBookingItemDetailsResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServiceBookingItemDetailsButtonsAction> {
            @Override // android.os.Parcelable.Creator
            public final ServiceBookingItemDetailsButtonsAction createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ServiceBookingItemDetailsAction.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ServiceBookingItemDetailsButtonsAction(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ServiceBookingItemDetailsButtonsAction[] newArray(int i12) {
                return new ServiceBookingItemDetailsButtonsAction[i12];
            }
        }

        public ServiceBookingItemDetailsButtonsAction(@k List<ServiceBookingItemDetailsAction> list) {
            this.actions = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ServiceBookingItemDetailsButtonsAction) && L.f(this.actions, ((ServiceBookingItemDetailsButtonsAction) obj).actions);
        }

        @k
        public final List<ServiceBookingItemDetailsAction> getActions() {
            return this.actions;
        }

        public final int hashCode() {
            return this.actions.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("ServiceBookingItemDetailsButtonsAction(actions="), this.actions, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.actions, parcel);
            while (itJ.hasNext()) {
                ((ServiceBookingItemDetailsAction) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceBookingItemDetailsResult(boolean z12, @k String str, @k String str2, @k List<? extends ServiceBookingBlock> list, @l AttributedText attributedText, @l List<ServiceBookingItemDetailsAction> list2, @l List<ServiceBookingItemDetailsButtonsAction> list3, @l DeepLink deepLink) {
        this.hasCloseButton = z12;
        this.title = str;
        this.prevActionButton = str2;
        this.params = list;
        this.disclaimer = attributedText;
        this.actions = list2;
        this.buttons = list3;
        this.onboardingAction = deepLink;
    }

    @l
    public final List<ServiceBookingItemDetailsAction> a() {
        return this.actions;
    }

    @l
    public final List<ServiceBookingItemDetailsButtonsAction> b() {
        return this.buttons;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final DeepLink getOnboardingAction() {
        return this.onboardingAction;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingItemDetailsResult)) {
            return false;
        }
        ServiceBookingItemDetailsResult serviceBookingItemDetailsResult = (ServiceBookingItemDetailsResult) obj;
        return this.hasCloseButton == serviceBookingItemDetailsResult.hasCloseButton && L.f(this.title, serviceBookingItemDetailsResult.title) && L.f(this.prevActionButton, serviceBookingItemDetailsResult.prevActionButton) && L.f(this.params, serviceBookingItemDetailsResult.params) && L.f(this.disclaimer, serviceBookingItemDetailsResult.disclaimer) && L.f(this.actions, serviceBookingItemDetailsResult.actions) && L.f(this.buttons, serviceBookingItemDetailsResult.buttons) && L.f(this.onboardingAction, serviceBookingItemDetailsResult.onboardingAction);
    }

    @k
    public final List<ServiceBookingBlock> f() {
        return this.params;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getPrevActionButton() {
        return this.prevActionButton;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = H.e(H.d(H.d(Boolean.hashCode(this.hasCloseButton) * 31, 31, this.title), 31, this.prevActionButton), 31, this.params);
        AttributedText attributedText = this.disclaimer;
        int iHashCode = (iE2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<ServiceBookingItemDetailsAction> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<ServiceBookingItemDetailsButtonsAction> list2 = this.buttons;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DeepLink deepLink = this.onboardingAction;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingItemDetailsResult(hasCloseButton=");
        sb2.append(this.hasCloseButton);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", prevActionButton=");
        sb2.append(this.prevActionButton);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", buttons=");
        sb2.append(this.buttons);
        sb2.append(", onboardingAction=");
        return a.v(sb2, this.onboardingAction, ')');
    }
}
