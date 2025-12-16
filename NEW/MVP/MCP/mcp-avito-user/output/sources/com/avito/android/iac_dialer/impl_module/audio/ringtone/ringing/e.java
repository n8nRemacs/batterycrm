package com.avito.android.iac_dialer.impl_module.audio.ringtone.ringing;

import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.ringtone.IacRingingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacRingingPlayer.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/ringtone/ringing/e;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f165885a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final IacRingingMode f165886b;

    public e(@Y61.l String str, @Y61.k IacRingingMode iacRingingMode) {
        this.f165885a = str;
        this.f165886b = iacRingingMode;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f165885a, eVar.f165885a) && this.f165886b == eVar.f165886b;
    }

    public final int hashCode() {
        String str = this.f165885a;
        return this.f165886b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        return "IacRingingPlayerState(playForCallId=" + this.f165885a + ", ringingMode=" + this.f165886b + ')';
    }
}
