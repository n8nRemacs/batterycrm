package com.avito.android.virtual_deal_room.client_edit.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.virtual_deal_room.client_edit.model.ClientSaveResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientEditInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Close", "EmailError", "EmailInput", "NameError", "NameInput", "PatronymicError", "PatronymicInput", "PhoneError", "PhoneInput", "SaveFailure", "SaveSuccess", "Saving", "SurnameError", "SurnameInput", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$Close;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$EmailError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$EmailInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$NameError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$NameInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PatronymicError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PatronymicInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PhoneError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PhoneInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SaveFailure;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SaveSuccess;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$Saving;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SurnameError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SurnameInput;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface ClientEditInternalAction extends n {

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$Close;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Close implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Close f326216b = new Close();

        private Close() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -2032014208;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$EmailError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmailError implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f326217b;

        public EmailError(@k PrintableText printableText) {
            this.f326217b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailError) && L.f(this.f326217b, ((EmailError) obj).f326217b);
        }

        public final int hashCode() {
            return this.f326217b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("EmailError(errorText="), this.f326217b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$EmailInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmailInput implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326218b;

        public EmailInput(@k String str) {
            this.f326218b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailInput) && L.f(this.f326218b, ((EmailInput) obj).f326218b);
        }

        public final int hashCode() {
            return this.f326218b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmailInput(text="), this.f326218b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$NameError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NameError implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f326219b;

        public NameError(@k PrintableText printableText) {
            this.f326219b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameError) && L.f(this.f326219b, ((NameError) obj).f326219b);
        }

        public final int hashCode() {
            return this.f326219b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("NameError(errorText="), this.f326219b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$NameInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NameInput implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326220b;

        public NameInput(@k String str) {
            this.f326220b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameInput) && L.f(this.f326220b, ((NameInput) obj).f326220b);
        }

        public final int hashCode() {
            return this.f326220b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("NameInput(text="), this.f326220b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PatronymicError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PatronymicError implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f326221b;

        public PatronymicError(@k PrintableText printableText) {
            this.f326221b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PatronymicError) && L.f(this.f326221b, ((PatronymicError) obj).f326221b);
        }

        public final int hashCode() {
            return this.f326221b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("PatronymicError(errorText="), this.f326221b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PatronymicInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PatronymicInput implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326222b;

        public PatronymicInput(@k String str) {
            this.f326222b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PatronymicInput) && L.f(this.f326222b, ((PatronymicInput) obj).f326222b);
        }

        public final int hashCode() {
            return this.f326222b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PatronymicInput(text="), this.f326222b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PhoneError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneError implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f326223b;

        public PhoneError(@k PrintableText printableText) {
            this.f326223b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneError) && L.f(this.f326223b, ((PhoneError) obj).f326223b);
        }

        public final int hashCode() {
            return this.f326223b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("PhoneError(errorText="), this.f326223b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$PhoneInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PhoneInput implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326224b;

        public PhoneInput(@k String str) {
            this.f326224b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PhoneInput) && L.f(this.f326224b, ((PhoneInput) obj).f326224b);
        }

        public final int hashCode() {
            return this.f326224b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PhoneInput(text="), this.f326224b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SaveFailure;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveFailure implements ClientEditInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f326225b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f326226c;

        public SaveFailure(@k ApiError apiError) {
            this.f326225b = apiError;
            this.f326226c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF308074d() {
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
            return (obj instanceof SaveFailure) && L.f(this.f326225b, ((SaveFailure) obj).f326225b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF308076c() {
            return this.f326226c;
        }

        public final int hashCode() {
            return this.f326225b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("SaveFailure(error="), this.f326225b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SaveSuccess;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveSuccess implements ClientEditInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ClientSaveResult.Saved f326227b;

        public SaveSuccess(@k ClientSaveResult.Saved saved) {
            this.f326227b = saved;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF308074d() {
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
            return (obj instanceof SaveSuccess) && L.f(this.f326227b, ((SaveSuccess) obj).f326227b);
        }

        public final int hashCode() {
            return this.f326227b.hashCode();
        }

        @k
        public final String toString() {
            return "SaveSuccess(saveResult=" + this.f326227b + ')';
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$Saving;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Saving extends TrackableLoadingStarted implements ClientEditInternalAction {
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SurnameError;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SurnameError implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f326228b;

        public SurnameError(@k PrintableText printableText) {
            this.f326228b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SurnameError) && L.f(this.f326228b, ((SurnameError) obj).f326228b);
        }

        public final int hashCode() {
            return this.f326228b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("SurnameError(errorText="), this.f326228b, ')');
        }
    }

    /* compiled from: ClientEditInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction$SurnameInput;", "Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditInternalAction;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SurnameInput implements ClientEditInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f326229b;

        public SurnameInput(@k String str) {
            this.f326229b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SurnameInput) && L.f(this.f326229b, ((SurnameInput) obj).f326229b);
        }

        public final int hashCode() {
            return this.f326229b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SurnameInput(text="), this.f326229b, ')');
        }
    }
}
