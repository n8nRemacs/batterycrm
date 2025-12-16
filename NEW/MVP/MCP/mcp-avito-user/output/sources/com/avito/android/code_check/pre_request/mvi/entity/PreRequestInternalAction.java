package com.avito.android.code_check.pre_request.mvi.entity;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.mvi.TrackableContent;
import com.avito.android.analytics.screens.mvi.TrackableError;
import com.avito.android.analytics.screens.mvi.TrackableLoadingStarted;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.code_check_public.a;
import com.avito.android.code_check_public.c;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PreRequestInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "Loading", "Navigate", "Requested", "ShowUserDialog", "ToastMessage", "UnknownError", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Loading;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Navigate;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Requested;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$ToastMessage;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$UnknownError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PreRequestInternalAction extends n {

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Loading;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableLoadingStarted;", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading extends TrackableLoadingStarted implements PreRequestInternalAction {
    }

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Navigate;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Navigate implements PreRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f119208b;

        public Navigate(@k a aVar) {
            this.f119208b = aVar;
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
            return (obj instanceof Navigate) && L.f(this.f119208b, ((Navigate) obj).f119208b);
        }

        public final int hashCode() {
            return this.f119208b.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f119208b + ')';
        }
    }

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$Requested;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Requested implements PreRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f119209b;

        /* JADX WARN: Multi-variable type inference failed */
        public Requested() {
            this(null, 1, 0 == true ? 1 : 0);
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
            return (obj instanceof Requested) && L.f(this.f119209b, ((Requested) obj).f119209b);
        }

        public final int hashCode() {
            a aVar = this.f119209b;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        @k
        public final String toString() {
            return "Requested(nextNavigation=" + this.f119209b + ')';
        }

        public Requested(@l a aVar) {
            this.f119209b = aVar;
        }

        public /* synthetic */ Requested(a aVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : aVar);
        }
    }

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$ShowUserDialog;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowUserDialog implements PreRequestInternalAction, TrackableContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final c<UserDialog> f119210b;

        public ShowUserDialog(@k c<UserDialog> cVar) {
            this.f119210b = cVar;
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
            return (obj instanceof ShowUserDialog) && L.f(this.f119210b, ((ShowUserDialog) obj).f119210b);
        }

        public final int hashCode() {
            return this.f119210b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f119210b + ')';
        }
    }

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$ToastMessage;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableContent;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ToastMessage implements PreRequestInternalAction, TrackableContent {
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
            if (!(obj instanceof ToastMessage)) {
                return false;
            }
            ((ToastMessage) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ToastMessage(text=null)";
        }
    }

    /* compiled from: PreRequestInternalAction.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction$UnknownError;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lcom/avito/android/analytics/screens/mvi/TrackableError;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError implements PreRequestInternalAction, TrackableError {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f119211b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f119212c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f119213d;

        public UnknownError() {
            this(null, null, null, 7, null);
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
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return L.f(this.f119211b, unknownError.f119211b) && L.f(this.f119212c, unknownError.f119212c) && L.f(this.f119213d, unknownError.f119213d);
        }

        @Override // com.avito.android.analytics.screens.mvi.TrackableError
        @k
        /* renamed from: g */
        public final J.a getF131362b() {
            J.a.f90383b.getClass();
            return J.a.C2676a.a(this.f119212c, this.f119213d);
        }

        public final int hashCode() {
            PrintableText printableText = this.f119211b;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f119212c;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f119213d;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnknownError(message=");
            sb2.append(this.f119211b);
            sb2.append(", apiError=");
            sb2.append(this.f119212c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f119213d, ')');
        }

        public UnknownError(@l PrintableText printableText, @l ApiError apiError, @l Throwable th2) {
            this.f119211b = printableText;
            this.f119212c = apiError;
            this.f119213d = th2;
        }

        public /* synthetic */ UnknownError(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText, (i12 & 2) != 0 ? null : apiError, (i12 & 4) != 0 ? null : th2);
        }
    }
}
