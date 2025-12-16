package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: CallStorage.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "LdL/d;", "", "waitDialingBottomSheetLastShowTime", "waitRingingBottomSheetLastShowTime", "<init>", "(JJ)V", "component1", "()J", "component2", "copy", "(JJ)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/CallStorage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getWaitDialingBottomSheetLastShowTime", "getWaitRingingBottomSheetLastShowTime", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CallStorage implements dL.d {
    public static final int $stable = 0;
    private final long waitDialingBottomSheetLastShowTime;
    private final long waitRingingBottomSheetLastShowTime;

    public CallStorage(long j12, long j13) {
        this.waitDialingBottomSheetLastShowTime = j12;
        this.waitRingingBottomSheetLastShowTime = j13;
    }

    public static /* synthetic */ CallStorage copy$default(CallStorage callStorage, long j12, long j13, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = callStorage.waitDialingBottomSheetLastShowTime;
        }
        if ((i12 & 2) != 0) {
            j13 = callStorage.waitRingingBottomSheetLastShowTime;
        }
        return callStorage.copy(j12, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getWaitDialingBottomSheetLastShowTime() {
        return this.waitDialingBottomSheetLastShowTime;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWaitRingingBottomSheetLastShowTime() {
        return this.waitRingingBottomSheetLastShowTime;
    }

    @Y61.k
    public final CallStorage copy(long waitDialingBottomSheetLastShowTime, long waitRingingBottomSheetLastShowTime) {
        return new CallStorage(waitDialingBottomSheetLastShowTime, waitRingingBottomSheetLastShowTime);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CallStorage)) {
            return false;
        }
        CallStorage callStorage = (CallStorage) other;
        return this.waitDialingBottomSheetLastShowTime == callStorage.waitDialingBottomSheetLastShowTime && this.waitRingingBottomSheetLastShowTime == callStorage.waitRingingBottomSheetLastShowTime;
    }

    public final long getWaitDialingBottomSheetLastShowTime() {
        return this.waitDialingBottomSheetLastShowTime;
    }

    public final long getWaitRingingBottomSheetLastShowTime() {
        return this.waitRingingBottomSheetLastShowTime;
    }

    public int hashCode() {
        return Long.hashCode(this.waitRingingBottomSheetLastShowTime) + (Long.hashCode(this.waitDialingBottomSheetLastShowTime) * 31);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CallStorage(waitDialingBottomSheetLastShowTime=");
        sb2.append(this.waitDialingBottomSheetLastShowTime);
        sb2.append(", waitRingingBottomSheetLastShowTime=");
        return androidx.appcompat.app.r.u(sb2, this.waitRingingBottomSheetLastShowTime, ')');
    }
}
