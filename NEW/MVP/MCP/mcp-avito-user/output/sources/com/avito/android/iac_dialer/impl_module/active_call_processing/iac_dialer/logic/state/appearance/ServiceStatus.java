package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FgType.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;", "LdL/d;", "", "id", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "fgType", "<init>", "(ILcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;)V", "component1", "()I", "component2", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "copy", "(ILcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/ServiceStatus;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/FgType;", "getFgType", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ServiceStatus implements dL.d {
    public static final int $stable = 0;

    @Y61.k
    private final FgType fgType;
    private final int id;

    public ServiceStatus(int i12, @Y61.k FgType fgType) {
        this.id = i12;
        this.fgType = fgType;
    }

    public static /* synthetic */ ServiceStatus copy$default(ServiceStatus serviceStatus, int i12, FgType fgType, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = serviceStatus.id;
        }
        if ((i13 & 2) != 0) {
            fgType = serviceStatus.fgType;
        }
        return serviceStatus.copy(i12, fgType);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final FgType getFgType() {
        return this.fgType;
    }

    @Y61.k
    public final ServiceStatus copy(int id2, @Y61.k FgType fgType) {
        return new ServiceStatus(id2, fgType);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceStatus)) {
            return false;
        }
        ServiceStatus serviceStatus = (ServiceStatus) other;
        return this.id == serviceStatus.id && L.f(this.fgType, serviceStatus.fgType);
    }

    @Y61.k
    public final FgType getFgType() {
        return this.fgType;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.fgType.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @Y61.k
    public String toString() {
        return "ServiceStatus(id=" + this.id + ", fgType=" + this.fgType + ')';
    }
}
