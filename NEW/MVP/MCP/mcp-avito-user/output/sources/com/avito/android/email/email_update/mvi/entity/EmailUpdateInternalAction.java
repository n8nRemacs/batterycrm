package com.avito.android.email.email_update.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.ProfileShort;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmailUpdateInternalAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "EmailUpdateFailed", "EmailUpdated", "ErrorLoadingProfile", "ProfileLoaded", "StartUpdating", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$EmailUpdateFailed;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$EmailUpdated;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$ErrorLoadingProfile;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$ProfileLoaded;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$StartUpdating;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailUpdateInternalAction extends n {

    /* compiled from: EmailUpdateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$EmailUpdateFailed;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmailUpdateFailed implements EmailUpdateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f147225b;

        public EmailUpdateFailed(@k Throwable th2) {
            this.f147225b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailUpdateFailed) && L.f(this.f147225b, ((EmailUpdateFailed) obj).f147225b);
        }

        public final int hashCode() {
            return this.f147225b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("EmailUpdateFailed(throwable="), this.f147225b, ')');
        }
    }

    /* compiled from: EmailUpdateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$EmailUpdated;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmailUpdated implements EmailUpdateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f147226b;

        public EmailUpdated(@k String str) {
            this.f147226b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EmailUpdated) && L.f(this.f147226b, ((EmailUpdated) obj).f147226b);
        }

        public final int hashCode() {
            return this.f147226b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("EmailUpdated(newEmail="), this.f147226b, ')');
        }
    }

    /* compiled from: EmailUpdateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$ErrorLoadingProfile;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorLoadingProfile implements EmailUpdateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ErrorLoadingProfile f147227b = new ErrorLoadingProfile();

        private ErrorLoadingProfile() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ErrorLoadingProfile);
        }

        public final int hashCode() {
            return 695688007;
        }

        @k
        public final String toString() {
            return "ErrorLoadingProfile";
        }
    }

    /* compiled from: EmailUpdateInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$ProfileLoaded;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProfileLoaded implements EmailUpdateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ProfileShort f147228b;

        public ProfileLoaded(@k ProfileShort profileShort) {
            this.f147228b = profileShort;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ProfileLoaded) && L.f(this.f147228b, ((ProfileLoaded) obj).f147228b);
        }

        public final int hashCode() {
            return this.f147228b.hashCode();
        }

        @k
        public final String toString() {
            return "ProfileLoaded(profile=" + this.f147228b + ')';
        }
    }

    /* compiled from: EmailUpdateInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction$StartUpdating;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StartUpdating implements EmailUpdateInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final StartUpdating f147229b = new StartUpdating();

        private StartUpdating() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof StartUpdating);
        }

        public final int hashCode() {
            return 1717754266;
        }

        @k
        public final String toString() {
            return "StartUpdating";
        }
    }
}
