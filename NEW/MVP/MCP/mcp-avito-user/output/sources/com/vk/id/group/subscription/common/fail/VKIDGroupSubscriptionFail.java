package com.vk.id.group.subscription.common.fail;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VKIDGroupSubscriptionFail.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\b\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "", "description", "", "<init>", "(Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "ServiceAccount", "AlreadyGroupMember", "Other", "Close", "Cancel", "Dismiss", "ClientLimitReached", "RemoteLimitReached", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$AlreadyGroupMember;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Cancel;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$ClientLimitReached;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Close;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Dismiss;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Other;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$RemoteLimitReached;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$ServiceAccount;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class VKIDGroupSubscriptionFail {

    @k
    private final String description;

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$AlreadyGroupMember;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AlreadyGroupMember extends VKIDGroupSubscriptionFail {
        public AlreadyGroupMember() {
            super("User can't subscribe to group he's already a member of", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof AlreadyGroupMember) && L.f(getDescription(), ((AlreadyGroupMember) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Cancel;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel extends VKIDGroupSubscriptionFail {
        public Cancel() {
            super("User clicked on the cancel button", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof Cancel) && L.f(getDescription(), ((Cancel) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$ClientLimitReached;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ClientLimitReached extends VKIDGroupSubscriptionFail {
        public ClientLimitReached() {
            super("User reached the limit of group subscription displays that you've set on the client side", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof ClientLimitReached) && L.f(getDescription(), ((ClientLimitReached) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Close;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Close extends VKIDGroupSubscriptionFail {
        public Close() {
            super("User clicked on the close button", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof Close) && L.f(getDescription(), ((Close) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Dismiss;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Dismiss extends VKIDGroupSubscriptionFail {
        public Dismiss() {
            super("User dismissed the sheet", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof Dismiss) && L.f(getDescription(), ((Dismiss) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$Other;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Other extends VKIDGroupSubscriptionFail {

        @k
        private final Throwable throwable;

        /* JADX WARN: Illegal instructions before constructor call */
        public Other(@k Throwable th2) {
            String message = th2.getMessage();
            super(message == null ? "" : message, null);
            this.throwable = th2;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!Other.class.equals(other != null ? other.getClass() : null)) {
                return false;
            }
            Other other2 = (Other) other;
            return L.f(getDescription(), other2.getDescription()) && L.f(this.throwable, other2.throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode() + (getDescription().hashCode() * 31);
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$RemoteLimitReached;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteLimitReached extends VKIDGroupSubscriptionFail {
        public RemoteLimitReached() {
            super("User reached the limit of group subscription displays that is controlled remotely", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof RemoteLimitReached) && L.f(getDescription(), ((RemoteLimitReached) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    /* compiled from: VKIDGroupSubscriptionFail.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail$ServiceAccount;", "Lcom/vk/id/group/subscription/common/fail/VKIDGroupSubscriptionFail;", "<init>", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "group-subscription-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ServiceAccount extends VKIDGroupSubscriptionFail {
        public ServiceAccount() {
            super("User can't subscribe to group with service account", null);
        }

        public boolean equals(@l Object other) {
            return (other instanceof ServiceAccount) && L.f(getDescription(), ((ServiceAccount) other).getDescription());
        }

        public int hashCode() {
            return getDescription().hashCode();
        }
    }

    public /* synthetic */ VKIDGroupSubscriptionFail(String str, C42822w c42822w) {
        this(str);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    private VKIDGroupSubscriptionFail(String str) {
        this.description = str;
    }
}
