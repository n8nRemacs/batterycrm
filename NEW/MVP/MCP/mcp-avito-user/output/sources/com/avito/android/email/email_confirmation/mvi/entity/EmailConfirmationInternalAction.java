package com.avito.android.email.email_confirmation.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;

/* compiled from: EmailConfirmationInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "ConfirmationFailed", "ConfirmationStarted", "ConfirmationSuccessfullyFinished", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationFailed;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationStarted;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationSuccessfullyFinished;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailConfirmationInternalAction extends n {

    /* compiled from: EmailConfirmationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationFailed;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmationFailed implements EmailConfirmationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ConfirmationFailed f147141b = new ConfirmationFailed();

        private ConfirmationFailed() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ConfirmationFailed);
        }

        public final int hashCode() {
            return -1001247808;
        }

        @k
        public final String toString() {
            return "ConfirmationFailed";
        }
    }

    /* compiled from: EmailConfirmationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationStarted;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmationStarted implements EmailConfirmationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ConfirmationStarted f147142b = new ConfirmationStarted();

        private ConfirmationStarted() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ConfirmationStarted);
        }

        public final int hashCode() {
            return -1784506018;
        }

        @k
        public final String toString() {
            return "ConfirmationStarted";
        }
    }

    /* compiled from: EmailConfirmationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction$ConfirmationSuccessfullyFinished;", "Lcom/avito/android/email/email_confirmation/mvi/entity/EmailConfirmationInternalAction;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ConfirmationSuccessfullyFinished implements EmailConfirmationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ConfirmationSuccessfullyFinished f147143b = new ConfirmationSuccessfullyFinished();

        private ConfirmationSuccessfullyFinished() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ConfirmationSuccessfullyFinished);
        }

        public final int hashCode() {
            return -2050835076;
        }

        @k
        public final String toString() {
            return "ConfirmationSuccessfullyFinished";
        }
    }
}
