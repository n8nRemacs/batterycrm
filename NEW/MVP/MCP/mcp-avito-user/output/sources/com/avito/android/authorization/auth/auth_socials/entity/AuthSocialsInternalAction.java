package com.avito.android.authorization.auth.auth_socials.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.remote.model.AuthSocialStatus;
import com.avito.android.remote.model.UserDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AuthSocialsInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "AuthSocialsLoaded", "OpenSocial", "ShowUserDialog", "StartAuthSocialsLoading", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$AuthSocialsLoaded;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$OpenSocial;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$ShowUserDialog;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$StartAuthSocialsLoading;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface AuthSocialsInternalAction extends n {

    /* compiled from: AuthSocialsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$AuthSocialsLoaded;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AuthSocialsLoaded implements AuthSocialsInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AuthSocialStatus> f92895b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f92896c;

        public AuthSocialsLoaded(@k List<AuthSocialStatus> list, boolean z12) {
            this.f92895b = list;
            this.f92896c = z12;
        }

        @Override // com.avito.android.analytics.screens.mvi.s
        @l
        /* renamed from: d */
        public final String getF131216d() {
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
            if (!(obj instanceof AuthSocialsLoaded)) {
                return false;
            }
            AuthSocialsLoaded authSocialsLoaded = (AuthSocialsLoaded) obj;
            return L.f(this.f92895b, authSocialsLoaded.f92895b) && this.f92896c == authSocialsLoaded.f92896c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f92896c) + (this.f92895b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AuthSocialsLoaded(socials=");
            sb2.append(this.f92895b);
            sb2.append(", isRemoteResponse=");
            return r.x(sb2, this.f92896c, ')');
        }
    }

    /* compiled from: AuthSocialsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$OpenSocial;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenSocial implements AuthSocialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f92897b;

        public OpenSocial(@k String str) {
            this.f92897b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenSocial) && L.f(this.f92897b, ((OpenSocial) obj).f92897b);
        }

        public final int hashCode() {
            return this.f92897b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenSocial(socialType="), this.f92897b, ')');
        }
    }

    /* compiled from: AuthSocialsInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$ShowUserDialog;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUserDialog implements AuthSocialsInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f92898b;

        public ShowUserDialog(@k UserDialog userDialog) {
            this.f92898b = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowUserDialog) && L.f(this.f92898b, ((ShowUserDialog) obj).f92898b);
        }

        public final int hashCode() {
            return this.f92898b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(userDialog=" + this.f92898b + ')';
        }
    }

    /* compiled from: AuthSocialsInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction$StartAuthSocialsLoading;", "Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartAuthSocialsLoading extends TrackableLoadingStarted implements AuthSocialsInternalAction {
    }
}
