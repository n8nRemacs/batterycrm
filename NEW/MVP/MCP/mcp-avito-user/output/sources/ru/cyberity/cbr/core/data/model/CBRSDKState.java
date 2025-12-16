package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRSDKState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState;", "", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "name", "getName", "ActionCompleted", "Approved", "Failed", "FinallyRejected", "Incomplete", "Initial", "Pending", "Ready", "TemporarilyDeclined", "Lru/cyberity/cbr/core/data/model/CBRSDKState$ActionCompleted;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Approved;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$FinallyRejected;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Incomplete;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Initial;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Pending;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Ready;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$TemporarilyDeclined;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBRSDKState {

    @Y61.k
    private final String message;

    @Y61.k
    private final String name;

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Approved;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Approved extends CBRSDKState {

        @Y61.k
        public static final Approved INSTANCE = new Approved();

        private Approved() {
            super("Applicant has been approved", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "message", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "ApplicantMisconfigured", "ApplicantNotFound", "InitialLoadingFailed", "InvalidParameters", "NetworkError", "Unauthorized", "Unknown", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$ApplicantMisconfigured;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$ApplicantNotFound;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$InitialLoadingFailed;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$InvalidParameters;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$NetworkError;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$Unauthorized;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$Unknown;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static abstract class Failed extends CBRSDKState {

        @Y61.l
        private final Exception exception;

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$ApplicantMisconfigured;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class ApplicantMisconfigured extends Failed {

            @Y61.k
            public static final ApplicantMisconfigured INSTANCE = new ApplicantMisconfigured();

            /* JADX WARN: Multi-variable type inference failed */
            private ApplicantMisconfigured() {
                super("Applicant is found, but is misconfigured (most likely lacks of idDocs)", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$ApplicantNotFound;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class ApplicantNotFound extends Failed {
            public ApplicantNotFound(@Y61.k Exception exc) {
                super("No applicant is found for the given parameters", exc, null);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$InitialLoadingFailed;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class InitialLoadingFailed extends Failed {
            public InitialLoadingFailed(@Y61.k Exception exc) {
                super("An error while initial loading the SDK", exc, null);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$InvalidParameters;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "messages", "", "", "(Ljava/util/List;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class InvalidParameters extends Failed {
            /* JADX WARN: Multi-variable type inference failed */
            public InvalidParameters(@Y61.k List<String> list) {
                super("An attempt to setup with invalid parameters.\n".concat(C42745f0.O(list, "\n", null, null, null, 62)), null, 2, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$NetworkError;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class NetworkError extends Failed {
            public NetworkError(@Y61.k Exception exc) {
                super("A network error occured (the user will be presented with Network Oops screen)", exc, null);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$Unauthorized;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Unauthorized extends Failed {

            @Y61.k
            public static final Unauthorized INSTANCE = new Unauthorized();

            /* JADX WARN: Multi-variable type inference failed */
            private Unauthorized() {
                super("Your token isn't valid or the SDK can't refresh your token. Do you have a valid token updater?", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* compiled from: CBRSDKState.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed$Unknown;", "Lru/cyberity/cbr/core/data/model/CBRSDKState$Failed;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Exception;)V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Unknown extends Failed {
            public Unknown(@Y61.k Exception exc) {
                super("Unknown error", exc, null);
            }
        }

        public /* synthetic */ Failed(String str, Exception exc, C42822w c42822w) {
            this(str, exc);
        }

        @Y61.l
        public final Exception getException() {
            return this.exception;
        }

        private Failed(String str, Exception exc) {
            super(str, null);
            this.exception = exc;
        }

        public /* synthetic */ Failed(String str, Exception exc, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : exc, null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$FinallyRejected;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class FinallyRejected extends CBRSDKState {

        @Y61.k
        public static final FinallyRejected INSTANCE = new FinallyRejected();

        private FinallyRejected() {
            super("Applicant has been finally rejected", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Incomplete;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Incomplete extends CBRSDKState {

        @Y61.k
        public static final Incomplete INSTANCE = new Incomplete();

        private Incomplete() {
            super("Some but not all verification steps are passed over", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Initial;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Initial extends CBRSDKState {

        @Y61.k
        public static final Initial INSTANCE = new Initial();

        private Initial() {
            super("No verification steps are passed yet", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Pending;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Pending extends CBRSDKState {

        @Y61.k
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super("Verification is in pending state", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$Ready;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Ready extends CBRSDKState {

        @Y61.k
        public static final Ready INSTANCE = new Ready();

        private Ready() {
            super("SDK is ready", null);
        }
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$TemporarilyDeclined;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "()V", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class TemporarilyDeclined extends CBRSDKState {

        @Y61.k
        public static final TemporarilyDeclined INSTANCE = new TemporarilyDeclined();

        private TemporarilyDeclined() {
            super("Applicant has been declined temporarily", null);
        }
    }

    public /* synthetic */ CBRSDKState(String str, C42822w c42822w) {
        this(str);
    }

    @Y61.k
    public final String getMessage() {
        return this.message;
    }

    @Y61.k
    public final String getName() {
        return this.name;
    }

    /* compiled from: CBRSDKState.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState$ActionCompleted;", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", "actionId", "", "type", "Lru/cyberity/cbr/core/data/model/FlowActionType;", "answer", "payload", "", "", "(Ljava/lang/String;Lru/cyberity/cbr/core/data/model/FlowActionType;Ljava/lang/String;Ljava/util/Map;)V", "getActionId", "()Ljava/lang/String;", "getAnswer", "getPayload", "()Ljava/util/Map;", "getType", "()Lru/cyberity/cbr/core/data/model/FlowActionType;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "", "toString", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class ActionCompleted extends CBRSDKState {

        @Y61.k
        private final String actionId;

        @Y61.l
        private final String answer;

        @Y61.k
        private final Map<String, Object> payload;

        @Y61.k
        private final FlowActionType type;

        public /* synthetic */ ActionCompleted(String str, FlowActionType flowActionType, String str2, Map map, int i12, C42822w c42822w) {
            this(str, flowActionType, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? P0.c() : map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionCompleted copy$default(ActionCompleted actionCompleted, String str, FlowActionType flowActionType, String str2, Map map, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = actionCompleted.actionId;
            }
            if ((i12 & 2) != 0) {
                flowActionType = actionCompleted.type;
            }
            if ((i12 & 4) != 0) {
                str2 = actionCompleted.answer;
            }
            if ((i12 & 8) != 0) {
                map = actionCompleted.payload;
            }
            return actionCompleted.copy(str, flowActionType, str2, map);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getActionId() {
            return this.actionId;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final FlowActionType getType() {
            return this.type;
        }

        @Y61.l
        /* renamed from: component3, reason: from getter */
        public final String getAnswer() {
            return this.answer;
        }

        @Y61.k
        public final Map<String, Object> component4() {
            return this.payload;
        }

        @Y61.k
        public final ActionCompleted copy(@Y61.k String actionId, @Y61.k FlowActionType type, @Y61.l String answer, @Y61.k Map<String, ? extends Object> payload) {
            return new ActionCompleted(actionId, type, answer, payload);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ActionCompleted)) {
                return false;
            }
            ActionCompleted actionCompleted = (ActionCompleted) other;
            return L.f(this.actionId, actionCompleted.actionId) && L.f(this.type, actionCompleted.type) && L.f(this.answer, actionCompleted.answer) && L.f(this.payload, actionCompleted.payload);
        }

        @Y61.k
        public final String getActionId() {
            return this.actionId;
        }

        @Y61.l
        public final String getAnswer() {
            return this.answer;
        }

        @Y61.k
        public final Map<String, Object> getPayload() {
            return this.payload;
        }

        @Y61.k
        public final FlowActionType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + (this.actionId.hashCode() * 31)) * 31;
            String str = this.answer;
            return this.payload.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ActionCompleted(actionId=");
            sb2.append(this.actionId);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", answer=");
            sb2.append(this.answer);
            sb2.append(", payload=");
            return androidx.appcompat.app.r.w(sb2, this.payload, ')');
        }

        public ActionCompleted(@Y61.k String str, @Y61.k FlowActionType flowActionType, @Y61.l String str2, @Y61.k Map<String, ? extends Object> map) {
            super("Flow Action", null);
            this.actionId = str;
            this.type = flowActionType;
            this.answer = str2;
            this.payload = map;
        }
    }

    private CBRSDKState(String str) {
        this.message = str;
        String strL0 = m0.f406844a.b(getClass()).l0();
        this.name = strL0 == null ? "" : strL0;
    }
}
