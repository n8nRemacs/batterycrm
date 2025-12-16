package com.vk.id.internal.auth;

import Y61.k;
import Y61.l;
import androidx.camera.core.Q;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AuthResult.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult;", "", "<init>", "()V", "Success", "Canceled", "NoBrowserAvailable", "AuthActiviyResultFailed", "OAuth", "Lcom/vk/id/internal/auth/AuthResult$AuthActiviyResultFailed;", "Lcom/vk/id/internal/auth/AuthResult$Canceled;", "Lcom/vk/id/internal/auth/AuthResult$NoBrowserAvailable;", "Lcom/vk/id/internal/auth/AuthResult$Success;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class AuthResult {

    /* compiled from: AuthResult.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$AuthActiviyResultFailed;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AuthActiviyResultFailed extends AuthResult {

        @l
        private final Throwable error;

        @k
        private final String message;

        public AuthActiviyResultFailed(@k String str, @l Throwable th2) {
            super(null);
            this.message = str;
            this.error = th2;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AuthActiviyResultFailed)) {
                return false;
            }
            AuthActiviyResultFailed authActiviyResultFailed = (AuthActiviyResultFailed) other;
            return L.f(this.message, authActiviyResultFailed.message) && L.f(this.error, authActiviyResultFailed.error);
        }

        @l
        public final Throwable getError() {
            return this.error;
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.error;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public String toString() {
            return "AuthActiviyResultFailed(message=" + this.message + ", error=" + this.error + ")";
        }
    }

    /* compiled from: AuthResult.kt */
    @P
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH×\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH×\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$Canceled;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Canceled extends AuthResult {

        @k
        private final String message;

        public Canceled(@k String str) {
            super(null);
            this.message = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Canceled) && L.f(this.message, ((Canceled) other).message);
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @k
        public String toString() {
            return AK.c.k("Canceled(message=", this.message, ")");
        }
    }

    /* compiled from: AuthResult.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$NoBrowserAvailable;", "Lcom/vk/id/internal/auth/AuthResult;", "", "message", "", "error", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "Ljava/lang/Throwable;", "getError", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NoBrowserAvailable extends AuthResult {

        @l
        private final Throwable error;

        @k
        private final String message;

        public NoBrowserAvailable(@k String str, @l Throwable th2) {
            super(null);
            this.message = str;
            this.error = th2;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoBrowserAvailable)) {
                return false;
            }
            NoBrowserAvailable noBrowserAvailable = (NoBrowserAvailable) other;
            return L.f(this.message, noBrowserAvailable.message) && L.f(this.error, noBrowserAvailable.error);
        }

        @l
        public final Throwable getError() {
            return this.error;
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            Throwable th2 = this.error;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public String toString() {
            return "NoBrowserAvailable(message=" + this.message + ", error=" + this.error + ")";
        }
    }

    /* compiled from: AuthResult.kt */
    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$OAuth;", "", "", "code", VoiceInfo.STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCode", "getState", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OAuth {

        @k
        private final String code;

        @k
        private final String state;

        public OAuth(@k String str, @k String str2) {
            this.code = str;
            this.state = str2;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OAuth)) {
                return false;
            }
            OAuth oAuth = (OAuth) other;
            return L.f(this.code, oAuth.code) && L.f(this.state, oAuth.state);
        }

        @k
        public final String getCode() {
            return this.code;
        }

        @k
        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.code.hashCode() * 31);
        }

        @k
        public String toString() {
            return Q.a("OAuth(code=", this.code, ", state=", this.state, ")");
        }
    }

    /* compiled from: AuthResult.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004H×\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH×\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH×\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/vk/id/internal/auth/AuthResult$Success;", "Lcom/vk/id/internal/auth/AuthResult;", "Lcom/vk/id/internal/auth/AuthResult$OAuth;", "oauth", "", "deviceId", "<init>", "(Lcom/vk/id/internal/auth/AuthResult$OAuth;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/vk/id/internal/auth/AuthResult$OAuth;", "getOauth", "()Lcom/vk/id/internal/auth/AuthResult$OAuth;", "Ljava/lang/String;", "getDeviceId", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success extends AuthResult {

        @k
        private final String deviceId;

        @l
        private final OAuth oauth;

        public Success(@l OAuth oAuth, @k String str) {
            super(null);
            this.oauth = oAuth;
            this.deviceId = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return L.f(this.oauth, success.oauth) && L.f(this.deviceId, success.deviceId);
        }

        @k
        public final String getDeviceId() {
            return this.deviceId;
        }

        @l
        public final OAuth getOauth() {
            return this.oauth;
        }

        public int hashCode() {
            OAuth oAuth = this.oauth;
            return this.deviceId.hashCode() + ((oAuth == null ? 0 : oAuth.hashCode()) * 31);
        }

        @k
        public String toString() {
            return "Success(oauth=" + this.oauth + ", deviceId=" + this.deviceId + ")";
        }
    }

    public /* synthetic */ AuthResult(C42822w c42822w) {
        this();
    }

    private AuthResult() {
    }
}
