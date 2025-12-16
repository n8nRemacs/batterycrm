package com.avito.android.legal_request.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequestInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "HandleBeduinAction", "HandleBeduinEvent", "HandleBeduinState", "ShowBeduinScreen", "ShowError", "StartLoading", "StartProcessing", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinAction;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinEvent;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinState;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$ShowBeduinScreen;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$ShowError;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$StartLoading;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$StartProcessing;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface LegalRequestInternalAction extends n {

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinAction;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinAction implements LegalRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC40047a f175270b;

        public HandleBeduinAction(@k InterfaceC40047a interfaceC40047a) {
            this.f175270b = interfaceC40047a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinAction) && L.f(this.f175270b, ((HandleBeduinAction) obj).f175270b);
        }

        public final int hashCode() {
            return this.f175270b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinAction(beduinAction=" + this.f175270b + ')';
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinEvent;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinEvent implements LegalRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BeduinOneTimeEvent f175271b;

        public HandleBeduinEvent(@k BeduinOneTimeEvent beduinOneTimeEvent) {
            this.f175271b = beduinOneTimeEvent;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinEvent) && L.f(this.f175271b, ((HandleBeduinEvent) obj).f175271b);
        }

        public final int hashCode() {
            return this.f175271b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinEvent(beduinOneTimeEvent=" + this.f175271b + ')';
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$HandleBeduinState;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HandleBeduinState implements LegalRequestInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AbstractC40048c f175272b;

        public HandleBeduinState(@k AbstractC40048c abstractC40048c) {
            this.f175272b = abstractC40048c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HandleBeduinState) && L.f(this.f175272b, ((HandleBeduinState) obj).f175272b);
        }

        public final int hashCode() {
            return this.f175272b.hashCode();
        }

        @k
        public final String toString() {
            return "HandleBeduinState(beduinState=" + this.f175272b + ')';
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$ShowBeduinScreen;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowBeduinScreen implements LegalRequestInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowBeduinScreen)) {
                return false;
            }
            ((ShowBeduinScreen) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowBeduinScreen(rendererState=null)";
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$ShowError;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements LegalRequestInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShowError)) {
                return false;
            }
            ((ShowError) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowError(error=null)";
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$StartLoading;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "()V", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading implements LegalRequestInternalAction {
        static {
            new StartLoading();
        }

        private StartLoading() {
        }
    }

    /* compiled from: LegalRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction$StartProcessing;", "Lcom/avito/android/legal_request/mvi/entity/LegalRequestInternalAction;", "_avito_legal-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartProcessing implements LegalRequestInternalAction {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StartProcessing)) {
                return false;
            }
            ((StartProcessing) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "StartProcessing(json=null)";
        }
    }
}
