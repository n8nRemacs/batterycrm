package com.vk.id.exchangetoken;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VKIDExchangeTokenFail.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail;", "", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "FailedApiCall", "FailedOAuthState", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail$FailedApiCall;", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail$FailedOAuthState;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VKIDExchangeTokenFail {

    @k
    private final String description;

    /* compiled from: VKIDExchangeTokenFail.kt */
    @P
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail$FailedApiCall;", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail;", "", "description", "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedApiCall extends VKIDExchangeTokenFail {

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

        @k
        public String toString() {
            return "FailedApiCall(description=" + getDescription() + ", throwable=" + this.throwable + ")";
        }
    }

    /* compiled from: VKIDExchangeTokenFail.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail$FailedOAuthState;", "Lcom/vk/id/exchangetoken/VKIDExchangeTokenFail;", "description", "", "<init>", "(Ljava/lang/String;)V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FailedOAuthState extends VKIDExchangeTokenFail {
        public FailedOAuthState(@k String str) {
            super(str, null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof FailedOAuthState) && L.f(getDescription(), ((FailedOAuthState) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    public /* synthetic */ VKIDExchangeTokenFail(String str, C42822w c42822w) {
        this(str);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    private VKIDExchangeTokenFail(String str) {
        this.description = str;
    }
}
