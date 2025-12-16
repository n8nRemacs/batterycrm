package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacActionProcessing.kt */
@P
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u0006¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;", "LdL/d;", "", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionEffect;", "effects", "<init>", "(Ljava/util/List;)V", "effect", "Lkotlin/G0;", "addEffect", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionEffect;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionOutput;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getEffects", "setEffects", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacActionOutput implements d {
    public static final int $stable = 8;

    @l
    private List<IacActionEffect> effects;

    public IacActionOutput(@l List<IacActionEffect> list) {
        this.effects = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacActionOutput copy$default(IacActionOutput iacActionOutput, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = iacActionOutput.effects;
        }
        return iacActionOutput.copy(list);
    }

    public final void addEffect(@k IacActionEffect effect) {
        G0 g02;
        List<IacActionEffect> list = this.effects;
        if (list != null) {
            list.add(effect);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            this.effects = C42745f0.e0(effect);
        }
    }

    @l
    public final List<IacActionEffect> component1() {
        return this.effects;
    }

    @k
    public final IacActionOutput copy(@l List<IacActionEffect> effects) {
        return new IacActionOutput(effects);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IacActionOutput) && L.f(this.effects, ((IacActionOutput) other).effects);
    }

    @l
    public final List<IacActionEffect> getEffects() {
        return this.effects;
    }

    public int hashCode() {
        List<IacActionEffect> list = this.effects;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setEffects(@l List<IacActionEffect> list) {
        this.effects = list;
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("IacActionOutput(effects="), this.effects, ')');
    }
}
