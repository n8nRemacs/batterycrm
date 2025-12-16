package com.avito.android.mandatory_verification.presentation.mvi.entity;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mandatory_verification.data.model.MandatoryVerificationData;
import com.avito.android.mandatory_verification.domain.file_uploader.a;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationInternalAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "BuildFileDeleteSuccess", "BuildFileUploadError", "BuildFileUploadSuccess", "BuildInitial", "BuildVerificationSuccess", "Cancel", "FollowDeeplink", "OpenFilePicker", "ProceedBlocked", "ProceedSuccess", "ShowError", "ShowLoading", "ShowToast", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileDeleteSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileUploadError;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileUploadSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildInitial;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildVerificationSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$Cancel;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$FollowDeeplink;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$OpenFilePicker;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ProceedBlocked;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ProceedSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowError;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowLoading;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowToast;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface MandatoryVerificationInternalAction extends n {

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileDeleteSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildFileDeleteSuccess implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final BuildFileDeleteSuccess f184783b = new BuildFileDeleteSuccess();

        private BuildFileDeleteSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof BuildFileDeleteSuccess);
        }

        public final int hashCode() {
            return -1963629888;
        }

        @k
        public final String toString() {
            return "BuildFileDeleteSuccess";
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileUploadError;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildFileUploadError implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f184784b;

        public BuildFileUploadError(@k PrintableText printableText) {
            this.f184784b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildFileUploadError) && L.f(this.f184784b, ((BuildFileUploadError) obj).f184784b);
        }

        public final int hashCode() {
            return this.f184784b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("BuildFileUploadError(message="), this.f184784b, ')');
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildFileUploadSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildFileUploadSuccess implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f184785b;

        public BuildFileUploadSuccess(@k a aVar) {
            this.f184785b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildFileUploadSuccess) && L.f(this.f184785b, ((BuildFileUploadSuccess) obj).f184785b);
        }

        public final int hashCode() {
            return this.f184785b.hashCode();
        }

        @k
        public final String toString() {
            return "BuildFileUploadSuccess(fileData=" + this.f184785b + ')';
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildInitial;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildInitial implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MandatoryVerificationData f184786b;

        public BuildInitial(@k MandatoryVerificationData mandatoryVerificationData) {
            this.f184786b = mandatoryVerificationData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildInitial) && L.f(this.f184786b, ((BuildInitial) obj).f184786b);
        }

        public final int hashCode() {
            return this.f184786b.hashCode();
        }

        @k
        public final String toString() {
            return "BuildInitial(data=" + this.f184786b + ')';
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$BuildVerificationSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BuildVerificationSuccess implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final MandatoryVerificationData.AccountVerification f184787b;

        public BuildVerificationSuccess(@k MandatoryVerificationData.AccountVerification accountVerification) {
            this.f184787b = accountVerification;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildVerificationSuccess) && L.f(this.f184787b, ((BuildVerificationSuccess) obj).f184787b);
        }

        public final int hashCode() {
            return this.f184787b.hashCode();
        }

        @k
        public final String toString() {
            return "BuildVerificationSuccess(accountVerification=" + this.f184787b + ')';
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$Cancel;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cancel implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Cancel f184788b = new Cancel();

        private Cancel() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -1592958388;
        }

        @k
        public final String toString() {
            return "Cancel";
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$FollowDeeplink;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FollowDeeplink implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f184789b;

        public FollowDeeplink(@k DeepLink deepLink) {
            this.f184789b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowDeeplink) && L.f(this.f184789b, ((FollowDeeplink) obj).f184789b);
        }

        public final int hashCode() {
            return this.f184789b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f184789b, ')');
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$OpenFilePicker;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenFilePicker implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<String> f184790b;

        public OpenFilePicker(@k List<String> list) {
            this.f184790b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenFilePicker) && L.f(this.f184790b, ((OpenFilePicker) obj).f184790b);
        }

        public final int hashCode() {
            return this.f184790b.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("OpenFilePicker(mimeTypes="), this.f184790b, ')');
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ProceedBlocked;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedBlocked implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ProceedBlocked f184791b = new ProceedBlocked();

        private ProceedBlocked() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ProceedBlocked);
        }

        public final int hashCode() {
            return -1181966544;
        }

        @k
        public final String toString() {
            return "ProceedBlocked";
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ProceedSuccess;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ProceedSuccess implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ProceedSuccess f184792b = new ProceedSuccess();

        private ProceedSuccess() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ProceedSuccess);
        }

        public final int hashCode() {
            return 1267268935;
        }

        @k
        public final String toString() {
            return "ProceedSuccess";
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowError;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowError implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Throwable f184793b;

        public ShowError(@k Throwable th2) {
            this.f184793b = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowError) && L.f(this.f184793b, ((ShowError) obj).f184793b);
        }

        public final int hashCode() {
            return this.f184793b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowError(throwable="), this.f184793b, ')');
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowLoading;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "<init>", "()V", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowLoading implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ShowLoading f184794b = new ShowLoading();

        private ShowLoading() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ShowLoading);
        }

        public final int hashCode() {
            return 1241650925;
        }

        @k
        public final String toString() {
            return "ShowLoading";
        }
    }

    /* compiled from: MandatoryVerificationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction$ShowToast;", "Lcom/avito/android/mandatory_verification/presentation/mvi/entity/MandatoryVerificationInternalAction;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowToast implements MandatoryVerificationInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f184795b;

        public ShowToast(@k PrintableText printableText) {
            this.f184795b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToast) && L.f(this.f184795b, ((ShowToast) obj).f184795b);
        }

        public final int hashCode() {
            return this.f184795b.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowToast(message="), this.f184795b, ')');
        }
    }
}
