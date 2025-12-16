package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: IacFinishedFallbackScreenAction.kt */
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "LdL/d;", "<init>", "()V", "OnBackOrCloseClicked", "OnMessengerClicked", "OnRecallByGsmClicked", "OnRecallByIacClicked", "OnResultForClosingActionInterceptorLinkObserved", "OnScreenCreated", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnBackOrCloseClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnMessengerClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnRecallByGsmClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnRecallByIacClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnResultForClosingActionInterceptorLinkObserved;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnScreenCreated;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacFinishedFallbackScreenAction implements d {
    public static final int $stable = 0;

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnBackOrCloseClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnBackOrCloseClicked extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnBackOrCloseClicked INSTANCE = new OnBackOrCloseClicked();

        private OnBackOrCloseClicked() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnBackOrCloseClicked);
        }

        public int hashCode() {
            return -1733252845;
        }

        @k
        public String toString() {
            return "OnBackOrCloseClicked";
        }
    }

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnMessengerClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnMessengerClicked extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnMessengerClicked INSTANCE = new OnMessengerClicked();

        private OnMessengerClicked() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnMessengerClicked);
        }

        public int hashCode() {
            return 1084241870;
        }

        @k
        public String toString() {
            return "OnMessengerClicked";
        }
    }

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnRecallByGsmClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnRecallByGsmClicked extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnRecallByGsmClicked INSTANCE = new OnRecallByGsmClicked();

        private OnRecallByGsmClicked() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnRecallByGsmClicked);
        }

        public int hashCode() {
            return 1013773576;
        }

        @k
        public String toString() {
            return "OnRecallByGsmClicked";
        }
    }

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnRecallByIacClicked;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnRecallByIacClicked extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnRecallByIacClicked INSTANCE = new OnRecallByIacClicked();

        private OnRecallByIacClicked() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnRecallByIacClicked);
        }

        public int hashCode() {
            return -1453045634;
        }

        @k
        public String toString() {
            return "OnRecallByIacClicked";
        }
    }

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnResultForClosingActionInterceptorLinkObserved;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnResultForClosingActionInterceptorLinkObserved extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnResultForClosingActionInterceptorLinkObserved INSTANCE = new OnResultForClosingActionInterceptorLinkObserved();

        private OnResultForClosingActionInterceptorLinkObserved() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnResultForClosingActionInterceptorLinkObserved);
        }

        public int hashCode() {
            return -635456146;
        }

        @k
        public String toString() {
            return "OnResultForClosingActionInterceptorLinkObserved";
        }
    }

    /* compiled from: IacFinishedFallbackScreenAction.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction$OnScreenCreated;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_fallback_screen/mvi/entity/IacFinishedFallbackScreenAction;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnScreenCreated extends IacFinishedFallbackScreenAction {
        public static final int $stable = 0;

        @k
        public static final OnScreenCreated INSTANCE = new OnScreenCreated();

        private OnScreenCreated() {
            super(null);
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof OnScreenCreated);
        }

        public int hashCode() {
            return 1310370018;
        }

        @k
        public String toString() {
            return "OnScreenCreated";
        }
    }

    public /* synthetic */ IacFinishedFallbackScreenAction(C42822w c42822w) {
        this();
    }

    private IacFinishedFallbackScreenAction() {
    }
}
