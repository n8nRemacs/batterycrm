package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRLivenessReason.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0011\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "Ljava/io/Serializable;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "CameraInitializationIssue", "CameraPermissionDenied", "CancelledByHostApplication", "CompletedUnsuccessfullyAllowContinue", "ContextSwitch", "InitializationError", "InvalideDeviceLicenseKeyIndetifier", "LicenseExpiredOrInvalid", "LockedOut", "MissingGuidanceImages", "NetworkError", "PortraitRequired", "Timeout", "UnknownInternalError", "UserCancelled", "VeritifcationSuccessfully", "VersionDeprecated", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CameraInitializationIssue;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CameraPermissionDenied;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CancelledByHostApplication;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CompletedUnsuccessfullyAllowContinue;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$ContextSwitch;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$InitializationError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$InvalideDeviceLicenseKeyIndetifier;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$LicenseExpiredOrInvalid;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$LockedOut;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$MissingGuidanceImages;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$NetworkError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$PortraitRequired;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$Timeout;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$UnknownInternalError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$UserCancelled;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$VeritifcationSuccessfully;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason$VersionDeprecated;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBRLivenessReason implements Serializable {

    @Y61.k
    private final String message;

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CameraInitializationIssue;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CameraInitializationIssue extends CBRLivenessReason {

        @Y61.k
        public static final CameraInitializationIssue INSTANCE = new CameraInitializationIssue();

        private CameraInitializationIssue() {
            super("Session failed because of an unexpected camera error.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CameraPermissionDenied;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CameraPermissionDenied extends CBRLivenessReason {

        @Y61.k
        public static final CameraPermissionDenied INSTANCE = new CameraPermissionDenied();

        private CameraPermissionDenied() {
            super("Camera is required but access prevented by user settings.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CancelledByHostApplication;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CancelledByHostApplication extends CBRLivenessReason {

        @Y61.k
        public static final CancelledByHostApplication INSTANCE = new CancelledByHostApplication();

        private CancelledByHostApplication() {
            super("Canceled by host application", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$CompletedUnsuccessfullyAllowContinue;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CompletedUnsuccessfullyAllowContinue extends CBRLivenessReason {

        @Y61.k
        public static final CompletedUnsuccessfullyAllowContinue INSTANCE = new CompletedUnsuccessfullyAllowContinue();

        private CompletedUnsuccessfullyAllowContinue() {
            super("Session completed unsuccessfully but allows to continue", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$ContextSwitch;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ContextSwitch extends CBRLivenessReason {

        @Y61.k
        public static final ContextSwitch INSTANCE = new ContextSwitch();

        private ContextSwitch() {
            super("Session cancelled because a Context Switch occurred during session.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$InitializationError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class InitializationError extends CBRLivenessReason {

        @Y61.k
        private final Exception exception;

        public InitializationError(@Y61.k Exception exc) {
            super("Liveness initialization is failed", null);
            this.exception = exc;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitializationError) && L.f(this.exception, ((InitializationError) other).exception);
        }

        @Y61.k
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @Y61.k
        public String toString() {
            return "InitializationError(exception=" + this.exception + ')';
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$InvalideDeviceLicenseKeyIndetifier;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class InvalideDeviceLicenseKeyIndetifier extends CBRLivenessReason {

        @Y61.k
        public static final InvalideDeviceLicenseKeyIndetifier INSTANCE = new InvalideDeviceLicenseKeyIndetifier();

        private InvalideDeviceLicenseKeyIndetifier() {
            super("The Device License Key Identifier provided was invalid.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$LicenseExpiredOrInvalid;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LicenseExpiredOrInvalid extends CBRLivenessReason {

        @Y61.k
        public static final LicenseExpiredOrInvalid INSTANCE = new LicenseExpiredOrInvalid();

        private LicenseExpiredOrInvalid() {
            super("License was expired, contained invalid text, or you are attempting to initialize in an App that is not specified in your license.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$LockedOut;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class LockedOut extends CBRLivenessReason {

        @Y61.k
        public static final LockedOut INSTANCE = new LockedOut();

        private LockedOut() {
            super("ZoOm is in a lockout state.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$MissingGuidanceImages;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class MissingGuidanceImages extends CBRLivenessReason {

        @Y61.k
        public static final MissingGuidanceImages INSTANCE = new MissingGuidanceImages();

        private MissingGuidanceImages() {
            super("Session cancelled because guidance images were not provided.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$NetworkError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class NetworkError extends CBRLivenessReason {

        @Y61.l
        private final Exception exception;

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NetworkError) && L.f(this.exception, ((NetworkError) other).exception);
        }

        @Y61.l
        public final Exception getException() {
            return this.exception;
        }

        public int hashCode() {
            Exception exc = this.exception;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        @Y61.k
        public String toString() {
            return "NetworkError(exception=" + this.exception + ')';
        }

        public NetworkError(@Y61.l Exception exc) {
            super("Network connectivity issue encountered.", null);
            this.exception = exc;
        }

        public /* synthetic */ NetworkError(Exception exc, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : exc);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$PortraitRequired;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PortraitRequired extends CBRLivenessReason {

        @Y61.k
        public static final PortraitRequired INSTANCE = new PortraitRequired();

        private PortraitRequired() {
            super("Portrait mode is required.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$Timeout;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Timeout extends CBRLivenessReason {

        @Y61.k
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
            super("Session cancelled due to timeout.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$UnknownInternalError;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UnknownInternalError extends CBRLivenessReason {

        @Y61.k
        public static final UnknownInternalError INSTANCE = new UnknownInternalError();

        private UnknownInternalError() {
            super("Session failed because of an unhandled internal error.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$UserCancelled;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class UserCancelled extends CBRLivenessReason {

        @Y61.k
        public static final UserCancelled INSTANCE = new UserCancelled();

        private UserCancelled() {
            super("User cancelled before completing session.", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$VeritifcationSuccessfully;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VeritifcationSuccessfully extends CBRLivenessReason {

        @Y61.k
        public static final VeritifcationSuccessfully INSTANCE = new VeritifcationSuccessfully();

        private VeritifcationSuccessfully() {
            super("The Liveness session was performed successfully ", null);
        }
    }

    /* compiled from: CBRLivenessReason.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRLivenessReason$VersionDeprecated;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class VersionDeprecated extends CBRLivenessReason {

        @Y61.k
        public static final VersionDeprecated INSTANCE = new VersionDeprecated();

        private VersionDeprecated() {
            super("Current version of SDK is deprecated.", null);
        }
    }

    public /* synthetic */ CBRLivenessReason(String str, C42822w c42822w) {
        this(str);
    }

    private CBRLivenessReason(String str) {
        this.message = str;
    }
}
