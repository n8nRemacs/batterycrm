package com.avito.android.auto_select.contact_me.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.actions_sheet.a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeContact;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectContactMeInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CloseScreen", "ContactClicked", "DeepLinkClicked", "Init", "LogItemCall", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$CloseScreen;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$ContactClicked;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$DeepLinkClicked;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$Init;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$LogItemCall;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AutoSelectContactMeInternalAction extends n {

    /* compiled from: AutoSelectContactMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$CloseScreen;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CloseScreen implements AutoSelectContactMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final CloseScreen f96005b = new CloseScreen();

        private CloseScreen() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof CloseScreen);
        }

        public final int hashCode() {
            return -1025446941;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutoSelectContactMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$ContactClicked;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContactClicked implements AutoSelectContactMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoSelectContactMeContact f96006b;

        public ContactClicked(@k AutoSelectContactMeContact autoSelectContactMeContact) {
            this.f96006b = autoSelectContactMeContact;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ContactClicked) && L.f(this.f96006b, ((ContactClicked) obj).f96006b);
        }

        public final int hashCode() {
            return this.f96006b.hashCode();
        }

        @k
        public final String toString() {
            return "ContactClicked(contact=" + this.f96006b + ')';
        }
    }

    /* compiled from: AutoSelectContactMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$DeepLinkClicked;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeepLinkClicked implements AutoSelectContactMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f96007b;

        public DeepLinkClicked(@k DeepLink deepLink) {
            this.f96007b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeepLinkClicked) && L.f(this.f96007b, ((DeepLinkClicked) obj).f96007b);
        }

        public final int hashCode() {
            return this.f96007b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("DeepLinkClicked(deepLink="), this.f96007b, ')');
        }
    }

    /* compiled from: AutoSelectContactMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$Init;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements AutoSelectContactMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoSelectContactMeBottomSheetOpenArguments f96008b;

        public Init(@k AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments) {
            this.f96008b = autoSelectContactMeBottomSheetOpenArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f96008b, ((Init) obj).f96008b);
        }

        public final int hashCode() {
            return this.f96008b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(openParams=" + this.f96008b + ')';
        }
    }

    /* compiled from: AutoSelectContactMeInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction$LogItemCall;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogItemCall implements AutoSelectContactMeInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AutoSelectContactMeContact f96009b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f96010c;

        public LogItemCall(@k AutoSelectContactMeContact autoSelectContactMeContact, @k String str) {
            this.f96009b = autoSelectContactMeContact;
            this.f96010c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogItemCall)) {
                return false;
            }
            LogItemCall logItemCall = (LogItemCall) obj;
            return L.f(this.f96009b, logItemCall.f96009b) && L.f(this.f96010c, logItemCall.f96010c);
        }

        public final int hashCode() {
            return this.f96010c.hashCode() + (this.f96009b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LogItemCall(contact=");
            sb2.append(this.f96009b);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f96010c, ')');
        }
    }
}
