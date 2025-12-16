package com.vk.id.logout;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VKIDLogoutFail.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail;", "", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "FailedApiCall", "AccessTokenTokenExpired", "NotAuthenticated", "Lcom/vk/id/logout/VKIDLogoutFail$AccessTokenTokenExpired;", "Lcom/vk/id/logout/VKIDLogoutFail$FailedApiCall;", "Lcom/vk/id/logout/VKIDLogoutFail$NotAuthenticated;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VKIDLogoutFail {

    @k
    private final String description;

    /* compiled from: VKIDLogoutFail.kt */
    @P
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail$AccessTokenTokenExpired;", "Lcom/vk/id/logout/VKIDLogoutFail;", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccessTokenTokenExpired extends VKIDLogoutFail {
        public boolean equals(@l Object other) {
            return (other instanceof AccessTokenTokenExpired) && L.f(getDescription(), ((AccessTokenTokenExpired) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDLogoutFail.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail$FailedApiCall;", "Lcom/vk/id/logout/VKIDLogoutFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedApiCall extends VKIDLogoutFail {

        @k
        private final Throwable throwable;

        public FailedApiCall(@k String str, @k Throwable th2) {
            super(str, null);
            this.throwable = th2;
        }

        public boolean equals(@l Object other) {
            if (other instanceof FailedApiCall) {
                FailedApiCall failedApiCall = (FailedApiCall) other;
                if (L.f(getDescription(), failedApiCall.getDescription()) && L.f(this.throwable, failedApiCall.throwable)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.throwable.hashCode() + (getDescription().hashCode() * 31);
        }
    }

    /* compiled from: VKIDLogoutFail.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/vk/id/logout/VKIDLogoutFail$NotAuthenticated;", "Lcom/vk/id/logout/VKIDLogoutFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotAuthenticated extends VKIDLogoutFail {
        public NotAuthenticated(@k String str) {
            super(str, null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof VKIDLogoutFail) && L.f(getDescription(), ((VKIDLogoutFail) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    public /* synthetic */ VKIDLogoutFail(String str, C42822w c42822w) {
        this(str);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    private VKIDLogoutFail(String str) {
        this.description = str;
    }
}
