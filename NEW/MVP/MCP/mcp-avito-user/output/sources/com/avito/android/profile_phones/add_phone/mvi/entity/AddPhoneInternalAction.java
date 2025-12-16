package com.avito.android.profile_phones.add_phone.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AddPhoneInternalAction.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AddPhoneResultOk", "Error", "ErrorDialog", "Loading", "Ok", "OkWithDeeplink", "PhoneReverificationInfoAccepted", "RoutingFinish", "RoutingGoBack", "RoutingGoToPhoneAllowReverificationInfo", "RoutingGoToPhoneDisallowReverificationInfo", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$AddPhoneResultOk;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Error;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$ErrorDialog;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Loading;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Ok;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$OkWithDeeplink;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$PhoneReverificationInfoAccepted;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingFinish;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoBack;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoToPhoneAllowReverificationInfo;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoToPhoneDisallowReverificationInfo;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AddPhoneInternalAction extends n {

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$AddPhoneResultOk;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AddPhoneResultOk implements AddPhoneInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226900b;

        /* renamed from: c, reason: collision with root package name */
        public final long f226901c;

        public AddPhoneResultOk(@k String str, long j12) {
            this.f226900b = str;
            this.f226901c = j12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212751d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddPhoneResultOk)) {
                return false;
            }
            AddPhoneResultOk addPhoneResultOk = (AddPhoneResultOk) obj;
            return L.f(this.f226900b, addPhoneResultOk.f226900b) && this.f226901c == addPhoneResultOk.f226901c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f226901c) + r.e(5, this.f226900b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AddPhoneResultOk(phone=");
            sb2.append(this.f226900b);
            sb2.append(", codeLength=5, timeout=");
            return r.u(sb2, this.f226901c, ')');
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Error;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements AddPhoneInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f226902b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f226903c;

        public Error(@l String str, @l Throwable th2) {
            this.f226902b = str;
            this.f226903c = th2;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF212751d() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF112001c() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f226902b, error.f226902b) && L.f(this.f226903c, error.f226903c);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF212758c() {
            J.a.f90383b.getClass();
            return J.a.C2676a.c(this.f226903c);
        }

        public final int hashCode() {
            String str = this.f226902b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Throwable th2 = this.f226903c;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(text=");
            sb2.append(this.f226902b);
            sb2.append(", throwable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f226903c, ')');
        }

        public /* synthetic */ Error(String str, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : th2);
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$ErrorDialog;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorDialog implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f226904b;

        public ErrorDialog(@k UserDialog userDialog) {
            this.f226904b = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDialog) && L.f(this.f226904b, ((ErrorDialog) obj).f226904b);
        }

        public final int hashCode() {
            return this.f226904b.hashCode();
        }

        @k
        public final String toString() {
            return "ErrorDialog(userDialog=" + this.f226904b + ')';
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Loading;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements AddPhoneInternalAction {
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$Ok;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Ok f226905b = new Ok();

        private Ok() {
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$OkWithDeeplink;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OkWithDeeplink implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f226906b;

        public OkWithDeeplink(@k DeepLink deepLink) {
            this.f226906b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OkWithDeeplink) && L.f(this.f226906b, ((OkWithDeeplink) obj).f226906b);
        }

        public final int hashCode() {
            return this.f226906b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("OkWithDeeplink(deeplink="), this.f226906b, ')');
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$PhoneReverificationInfoAccepted;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneReverificationInfoAccepted implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226907b;

        public PhoneReverificationInfoAccepted(@k String str) {
            this.f226907b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneReverificationInfoAccepted) && L.f(this.f226907b, ((PhoneReverificationInfoAccepted) obj).f226907b);
        }

        public final int hashCode() {
            return this.f226907b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneReverificationInfoAccepted(phone="), this.f226907b, ')');
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingFinish;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RoutingFinish implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f226908b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f226909c;

        /* JADX WARN: Multi-variable type inference failed */
        public RoutingFinish() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutingFinish)) {
                return false;
            }
            RoutingFinish routingFinish = (RoutingFinish) obj;
            return L.f(this.f226908b, routingFinish.f226908b) && L.f(this.f226909c, routingFinish.f226909c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f226908b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            String str = this.f226909c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RoutingFinish(message=");
            sb2.append(this.f226908b);
            sb2.append(", phone=");
            return C22026a.c(sb2, this.f226909c, ')');
        }

        public /* synthetic */ RoutingFinish(PrintableText printableText, String str, int i12, C42822w c42822w) {
            this((i12 & 2) != 0 ? null : str, (i12 & 1) != 0 ? null : printableText);
        }

        public RoutingFinish(@l String str, @l PrintableText printableText) {
            this.f226908b = printableText;
            this.f226909c = str;
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoBack;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "()V", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RoutingGoBack implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final RoutingGoBack f226910b = new RoutingGoBack();

        private RoutingGoBack() {
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoToPhoneAllowReverificationInfo;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RoutingGoToPhoneAllowReverificationInfo implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226911b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f226912c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f226913d;

        public RoutingGoToPhoneAllowReverificationInfo(@k String str, @k String str2, @l String str3) {
            this.f226911b = str;
            this.f226912c = str2;
            this.f226913d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutingGoToPhoneAllowReverificationInfo)) {
                return false;
            }
            RoutingGoToPhoneAllowReverificationInfo routingGoToPhoneAllowReverificationInfo = (RoutingGoToPhoneAllowReverificationInfo) obj;
            return L.f(this.f226911b, routingGoToPhoneAllowReverificationInfo.f226911b) && L.f(this.f226912c, routingGoToPhoneAllowReverificationInfo.f226912c) && L.f(this.f226913d, routingGoToPhoneAllowReverificationInfo.f226913d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f226911b.hashCode() * 31, 31, this.f226912c);
            String str = this.f226913d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RoutingGoToPhoneAllowReverificationInfo(phone=");
            sb2.append(this.f226911b);
            sb2.append(", phoneFormatted=");
            sb2.append(this.f226912c);
            sb2.append(", userEmail=");
            return C22026a.c(sb2, this.f226913d, ')');
        }
    }

    /* compiled from: AddPhoneInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction$RoutingGoToPhoneDisallowReverificationInfo;", "Lcom/avito/android/profile_phones/add_phone/mvi/entity/AddPhoneInternalAction;", "_avito_profile-phones_impl-verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RoutingGoToPhoneDisallowReverificationInfo implements AddPhoneInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f226914b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f226915c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f226916d;

        public RoutingGoToPhoneDisallowReverificationInfo(@k String str, @k String str2, @l String str3) {
            this.f226914b = str;
            this.f226915c = str2;
            this.f226916d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoutingGoToPhoneDisallowReverificationInfo)) {
                return false;
            }
            RoutingGoToPhoneDisallowReverificationInfo routingGoToPhoneDisallowReverificationInfo = (RoutingGoToPhoneDisallowReverificationInfo) obj;
            return L.f(this.f226914b, routingGoToPhoneDisallowReverificationInfo.f226914b) && L.f(this.f226915c, routingGoToPhoneDisallowReverificationInfo.f226915c) && L.f(this.f226916d, routingGoToPhoneDisallowReverificationInfo.f226916d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f226914b.hashCode() * 31, 31, this.f226915c);
            String str = this.f226916d;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RoutingGoToPhoneDisallowReverificationInfo(phone=");
            sb2.append(this.f226914b);
            sb2.append(", phoneFormatted=");
            sb2.append(this.f226915c);
            sb2.append(", userEmail=");
            return C22026a.c(sb2, this.f226916d, ')');
        }
    }
}
