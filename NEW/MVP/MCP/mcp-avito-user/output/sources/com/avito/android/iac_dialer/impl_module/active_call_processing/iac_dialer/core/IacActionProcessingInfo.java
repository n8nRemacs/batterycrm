package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacActionProcessing.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014JV\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0011J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b'\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0014R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b*\u0010\u0014\"\u0004\b+\u0010,R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010(\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010,R\"\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010,¨\u00061"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "LdL/d;", "", "index", "", "actionWithParams", "actionName", "", "scheduledAt", "processingStartedAt", "calculatingFinishedAt", "publishingFinishedAt", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJJ)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()J", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;JJJJ)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessingInfo;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "setIndex", "(I)V", "Ljava/lang/String;", "getActionWithParams", "getActionName", "J", "getScheduledAt", "getProcessingStartedAt", "setProcessingStartedAt", "(J)V", "getCalculatingFinishedAt", "setCalculatingFinishedAt", "getPublishingFinishedAt", "setPublishingFinishedAt", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacActionProcessingInfo implements d {
    public static final int $stable = 8;

    @k
    private final String actionName;

    @k
    private final String actionWithParams;
    private long calculatingFinishedAt;
    private int index;
    private long processingStartedAt;
    private long publishingFinishedAt;
    private final long scheduledAt;

    public IacActionProcessingInfo(int i12, @k String str, @k String str2, long j12, long j13, long j14, long j15) {
        this.index = i12;
        this.actionWithParams = str;
        this.actionName = str2;
        this.scheduledAt = j12;
        this.processingStartedAt = j13;
        this.calculatingFinishedAt = j14;
        this.publishingFinishedAt = j15;
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getActionWithParams() {
        return this.actionWithParams;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getScheduledAt() {
        return this.scheduledAt;
    }

    /* renamed from: component5, reason: from getter */
    public final long getProcessingStartedAt() {
        return this.processingStartedAt;
    }

    /* renamed from: component6, reason: from getter */
    public final long getCalculatingFinishedAt() {
        return this.calculatingFinishedAt;
    }

    /* renamed from: component7, reason: from getter */
    public final long getPublishingFinishedAt() {
        return this.publishingFinishedAt;
    }

    @k
    public final IacActionProcessingInfo copy(int index, @k String actionWithParams, @k String actionName, long scheduledAt, long processingStartedAt, long calculatingFinishedAt, long publishingFinishedAt) {
        return new IacActionProcessingInfo(index, actionWithParams, actionName, scheduledAt, processingStartedAt, calculatingFinishedAt, publishingFinishedAt);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacActionProcessingInfo)) {
            return false;
        }
        IacActionProcessingInfo iacActionProcessingInfo = (IacActionProcessingInfo) other;
        return this.index == iacActionProcessingInfo.index && L.f(this.actionWithParams, iacActionProcessingInfo.actionWithParams) && L.f(this.actionName, iacActionProcessingInfo.actionName) && this.scheduledAt == iacActionProcessingInfo.scheduledAt && this.processingStartedAt == iacActionProcessingInfo.processingStartedAt && this.calculatingFinishedAt == iacActionProcessingInfo.calculatingFinishedAt && this.publishingFinishedAt == iacActionProcessingInfo.publishingFinishedAt;
    }

    @k
    public final String getActionName() {
        return this.actionName;
    }

    @k
    public final String getActionWithParams() {
        return this.actionWithParams;
    }

    public final long getCalculatingFinishedAt() {
        return this.calculatingFinishedAt;
    }

    public final int getIndex() {
        return this.index;
    }

    public final long getProcessingStartedAt() {
        return this.processingStartedAt;
    }

    public final long getPublishingFinishedAt() {
        return this.publishingFinishedAt;
    }

    public final long getScheduledAt() {
        return this.scheduledAt;
    }

    public int hashCode() {
        return Long.hashCode(this.publishingFinishedAt) + r.g(r.g(r.g(H.d(H.d(Integer.hashCode(this.index) * 31, 31, this.actionWithParams), 31, this.actionName), 31, this.scheduledAt), 31, this.processingStartedAt), 31, this.calculatingFinishedAt);
    }

    public final void setCalculatingFinishedAt(long j12) {
        this.calculatingFinishedAt = j12;
    }

    public final void setIndex(int i12) {
        this.index = i12;
    }

    public final void setProcessingStartedAt(long j12) {
        this.processingStartedAt = j12;
    }

    public final void setPublishingFinishedAt(long j12) {
        this.publishingFinishedAt = j12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacActionProcessingInfo(index=");
        sb2.append(this.index);
        sb2.append(", actionWithParams=");
        sb2.append(this.actionWithParams);
        sb2.append(", actionName=");
        sb2.append(this.actionName);
        sb2.append(", scheduledAt=");
        sb2.append(this.scheduledAt);
        sb2.append(", processingStartedAt=");
        sb2.append(this.processingStartedAt);
        sb2.append(", calculatingFinishedAt=");
        sb2.append(this.calculatingFinishedAt);
        sb2.append(", publishingFinishedAt=");
        return r.u(sb2, this.publishingFinishedAt, ')');
    }
}
