package com.avito.android.iac_dialer.impl_module.notifications;

import Y61.k;
import Y61.l;
import android.app.Service;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacServiceHolder.kt */
@P
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/notifications/IacServiceHolder;", "", "service", "Landroid/app/Service;", "id", "", "(Landroid/app/Service;I)V", "getId", "()I", "getService", "()Landroid/app/Service;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacServiceHolder {
    public static final int $stable = 8;
    private final int id;

    @k
    private final Service service;

    public IacServiceHolder(@k Service service, int i12) {
        this.service = service;
        this.id = i12;
    }

    public static /* synthetic */ IacServiceHolder copy$default(IacServiceHolder iacServiceHolder, Service service, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            service = iacServiceHolder.service;
        }
        if ((i13 & 2) != 0) {
            i12 = iacServiceHolder.id;
        }
        return iacServiceHolder.copy(service, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Service getService() {
        return this.service;
    }

    /* renamed from: component2, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @k
    public final IacServiceHolder copy(@k Service service, int id2) {
        return new IacServiceHolder(service, id2);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacServiceHolder)) {
            return false;
        }
        IacServiceHolder iacServiceHolder = (IacServiceHolder) other;
        return L.f(this.service, iacServiceHolder.service) && this.id == iacServiceHolder.id;
    }

    public final int getId() {
        return this.id;
    }

    @k
    public final Service getService() {
        return this.service;
    }

    public int hashCode() {
        return Integer.hashCode(this.id) + (this.service.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacServiceHolder(service=");
        sb2.append(this.service);
        sb2.append(", id=");
        return r.t(sb2, this.id, ')');
    }
}
