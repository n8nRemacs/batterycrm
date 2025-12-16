package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacMiddlewareProcessing.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;", "LdL/d;", "", "middlewareName", "", "actionProcessingStartedAt", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessingInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMiddlewareName", "J", "getActionProcessingStartedAt", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacMiddlewareProcessingInfo implements d {
    public static final int $stable = 0;
    private final long actionProcessingStartedAt;

    @k
    private final String middlewareName;

    public IacMiddlewareProcessingInfo(@k String str, long j12) {
        this.middlewareName = str;
        this.actionProcessingStartedAt = j12;
    }

    public static /* synthetic */ IacMiddlewareProcessingInfo copy$default(IacMiddlewareProcessingInfo iacMiddlewareProcessingInfo, String str, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = iacMiddlewareProcessingInfo.middlewareName;
        }
        if ((i12 & 2) != 0) {
            j12 = iacMiddlewareProcessingInfo.actionProcessingStartedAt;
        }
        return iacMiddlewareProcessingInfo.copy(str, j12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getMiddlewareName() {
        return this.middlewareName;
    }

    /* renamed from: component2, reason: from getter */
    public final long getActionProcessingStartedAt() {
        return this.actionProcessingStartedAt;
    }

    @k
    public final IacMiddlewareProcessingInfo copy(@k String middlewareName, long actionProcessingStartedAt) {
        return new IacMiddlewareProcessingInfo(middlewareName, actionProcessingStartedAt);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacMiddlewareProcessingInfo)) {
            return false;
        }
        IacMiddlewareProcessingInfo iacMiddlewareProcessingInfo = (IacMiddlewareProcessingInfo) other;
        return L.f(this.middlewareName, iacMiddlewareProcessingInfo.middlewareName) && this.actionProcessingStartedAt == iacMiddlewareProcessingInfo.actionProcessingStartedAt;
    }

    public final long getActionProcessingStartedAt() {
        return this.actionProcessingStartedAt;
    }

    @k
    public final String getMiddlewareName() {
        return this.middlewareName;
    }

    public int hashCode() {
        return Long.hashCode(this.actionProcessingStartedAt) + (this.middlewareName.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacMiddlewareProcessingInfo(middlewareName=");
        sb2.append(this.middlewareName);
        sb2.append(", actionProcessingStartedAt=");
        return r.u(sb2, this.actionProcessingStartedAt, ')');
    }
}
