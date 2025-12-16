package com.avito.android.authorization.confirm_3fa.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
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
import kotlin.jvm.internal.L;

/* compiled from: ConfirmEmailListInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "FollowLink", "ShowDialog", "ShowErrorToast", "StartLoading", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$FollowLink;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$ShowDialog;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$ShowErrorToast;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$StartLoading;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ConfirmEmailListInternalAction extends n {

    /* compiled from: ConfirmEmailListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$FollowLink;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowLink implements ConfirmEmailListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f93603b;

        public FollowLink(@k DeepLink deepLink) {
            this.f93603b = deepLink;
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
            return (obj instanceof FollowLink) && L.f(this.f93603b, ((FollowLink) obj).f93603b);
        }

        public final int hashCode() {
            return this.f93603b.hashCode();
        }

        @k
        public final String toString() {
            return a.v(new StringBuilder("FollowLink(link="), this.f93603b, ')');
        }
    }

    /* compiled from: ConfirmEmailListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$ShowDialog;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowDialog implements ConfirmEmailListInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserDialog f93604b;

        public ShowDialog(@k UserDialog userDialog) {
            this.f93604b = userDialog;
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
            return (obj instanceof ShowDialog) && L.f(this.f93604b, ((ShowDialog) obj).f93604b);
        }

        public final int hashCode() {
            return this.f93604b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=" + this.f93604b + ')';
        }
    }

    /* compiled from: ConfirmEmailListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$ShowErrorToast;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowErrorToast implements ConfirmEmailListInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f93605b;

        public ShowErrorToast(@k PrintableText printableText) {
            this.f93605b = printableText;
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
            return (obj instanceof ShowErrorToast) && L.f(this.f93605b, ((ShowErrorToast) obj).f93605b);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF314423d() {
            J.a.f90383b.getClass();
            return J.a.C2676a.d();
        }

        public final int hashCode() {
            return this.f93605b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowErrorToast(text="), this.f93605b, ')');
        }
    }

    /* compiled from: ConfirmEmailListInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction$StartLoading;", "Lcom/avito/android/authorization/confirm_3fa/mvi/entity/ConfirmEmailListInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StartLoading extends TrackableLoadingStarted implements ConfirmEmailListInternalAction {
    }
}
