package com.avito.android.iac_dialer.impl_module.telecom.stub;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.telecom.stub.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;

/* compiled from: IacConnectionStub.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/stub/a;", "Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.iac_dialer.impl_module.telecom.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f166481a;

    public a(@k b bVar) {
        this.f166481a = bVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    @l
    public final Object a(@k Continuation<? super Z<G0>> continuation) {
        b bVar = this.f166481a;
        bVar.a("setActive()");
        bVar.f166485d.invoke();
        int i12 = Z.f406624c;
        return G0.f406611a;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final void b(@k TerminateReasonBundle terminateReasonBundle) {
        b bVar = this.f166481a;
        bVar.getClass();
        bVar.a("disconnect(reason=" + terminateReasonBundle + ')');
        bVar.f166484c.b(bVar.f166487f);
        ((c.b) bVar.f166486e).invoke();
        bVar.f166482a.getCallbacks().getOnDisconnected().invoke(terminateReasonBundle);
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final boolean c() {
        return false;
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    public final void d(@k AudioDevice audioDevice) {
        b bVar = this.f166481a;
        bVar.getClass();
        bVar.a("requestAudioDevice(" + audioDevice + ')');
        bVar.f166484c.a(audioDevice);
    }

    @Override // com.avito.android.iac_dialer.impl_module.telecom.a
    @l
    public final Object e(boolean z12, @k Continuation<? super Z<G0>> continuation) {
        b bVar = this.f166481a;
        bVar.a("answer()");
        ((c.a) bVar.f166485d).invoke();
        int i12 = Z.f406624c;
        return G0.f406611a;
    }
}
