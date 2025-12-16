package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.splitter;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;

/* compiled from: Splitter.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;", "LdL/d;", "", "dontEnableSpeakerPhoneOnVideoCall", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/splitter/Splitter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Z", "getDontEnableSpeakerPhoneOnVideoCall", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Splitter implements d {
    public static final int $stable = 0;
    private final boolean dontEnableSpeakerPhoneOnVideoCall;

    public Splitter(boolean z12) {
        this.dontEnableSpeakerPhoneOnVideoCall = z12;
    }

    public static /* synthetic */ Splitter copy$default(Splitter splitter, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = splitter.dontEnableSpeakerPhoneOnVideoCall;
        }
        return splitter.copy(z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDontEnableSpeakerPhoneOnVideoCall() {
        return this.dontEnableSpeakerPhoneOnVideoCall;
    }

    @k
    public final Splitter copy(boolean dontEnableSpeakerPhoneOnVideoCall) {
        return new Splitter(dontEnableSpeakerPhoneOnVideoCall);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Splitter) && this.dontEnableSpeakerPhoneOnVideoCall == ((Splitter) other).dontEnableSpeakerPhoneOnVideoCall;
    }

    public final boolean getDontEnableSpeakerPhoneOnVideoCall() {
        return this.dontEnableSpeakerPhoneOnVideoCall;
    }

    public int hashCode() {
        return Boolean.hashCode(this.dontEnableSpeakerPhoneOnVideoCall);
    }

    @k
    public String toString() {
        return r.x(new StringBuilder("Splitter(dontEnableSpeakerPhoneOnVideoCall="), this.dontEnableSpeakerPhoneOnVideoCall, ')');
    }
}
