package jK;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode;
import kotlin.Metadata;

/* compiled from: IacShortVibrationPlayer.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LjK/e;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jK.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C42270e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IacRingingMode f405548a;

    public C42270e(@k IacRingingMode iacRingingMode) {
        this.f405548a = iacRingingMode;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C42270e) && this.f405548a == ((C42270e) obj).f405548a;
    }

    public final int hashCode() {
        return this.f405548a.hashCode();
    }

    @k
    public final String toString() {
        return "IacShortVibrationPlayerState(ringingMode=" + this.f405548a + ')';
    }
}
