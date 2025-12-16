package com.avito.android.mortgage.sending_confirm.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.mortgage.sending_confirm.model.SendingConfirmArguments;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SendingConfirmInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "CheckClick", "Init", "LegalSendingCompleted", "LegalSendingFailed", "LegalSendingStarted", "SetErrorOnCheckboxes", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$CheckClick;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$Init;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingCompleted;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingFailed;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingStarted;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$SetErrorOnCheckboxes;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface SendingConfirmInternalAction extends n {

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$CheckClick;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CheckClick implements SendingConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f203572b;

        public CheckClick(@k String str) {
            this.f203572b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CheckClick) && L.f(this.f203572b, ((CheckClick) obj).f203572b);
        }

        public final int hashCode() {
            return this.f203572b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CheckClick(checkName="), this.f203572b, ')');
        }
    }

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$Init;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Init implements SendingConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SendingConfirmArguments f203573b;

        public Init(@k SendingConfirmArguments sendingConfirmArguments) {
            this.f203573b = sendingConfirmArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && L.f(this.f203573b, ((Init) obj).f203573b);
        }

        public final int hashCode() {
            return this.f203573b.hashCode();
        }

        @k
        public final String toString() {
            return "Init(arguments=" + this.f203573b + ')';
        }
    }

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingCompleted;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LegalSendingCompleted implements SendingConfirmInternalAction, TrackableContent {
        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }
    }

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingFailed;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LegalSendingFailed implements SendingConfirmInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f203574b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final J.a f203575c;

        public LegalSendingFailed(@k ApiError apiError) {
            this.f203574b = apiError;
            this.f203575c = new J.a(apiError);
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF314462e() {
            return null;
        }

        @Override // com.avito.android.analytics.screens.mvi.t
        @l
        /* renamed from: e */
        public final String getF314460f() {
            return null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LegalSendingFailed) && L.f(this.f203574b, ((LegalSendingFailed) obj).f203574b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g, reason: from getter */
        public final J.a getF314423d() {
            return this.f203575c;
        }

        public final int hashCode() {
            return this.f203574b.hashCode();
        }

        @k
        public final String toString() {
            return c.n(new StringBuilder("LegalSendingFailed(error="), this.f203574b, ')');
        }
    }

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$LegalSendingStarted;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LegalSendingStarted extends TrackableLoadingStarted implements SendingConfirmInternalAction {
    }

    /* compiled from: SendingConfirmInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction$SetErrorOnCheckboxes;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetErrorOnCheckboxes implements SendingConfirmInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f203576b;

        public SetErrorOnCheckboxes(@k ArrayList arrayList) {
            this.f203576b = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetErrorOnCheckboxes) && this.f203576b.equals(((SetErrorOnCheckboxes) obj).f203576b);
        }

        public final int hashCode() {
            return this.f203576b.hashCode();
        }

        @k
        public final String toString() {
            return e.p(new StringBuilder("SetErrorOnCheckboxes(checkNames="), this.f203576b, ')');
        }
    }
}
