package com.avito.android.iac_dialer.impl_module.telecom.stub;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.b;
import com.avito.android.iac_dialer.impl_module.telecom.IacConnectionInputData;
import com.avito.android.util.R0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: IacConnectionStub.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/stub/b;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final IacConnectionInputData f166482a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f166483b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.iac_dialer.impl_module.audio.audio_devices.b f166484c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f166485d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Y41.a<G0> f166486e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f166487f;

    /* compiled from: IacConnectionStub.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/iac_dialer/impl_module/telecom/stub/b$a", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/b$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b.a {
        public a() {
        }

        @Override // com.avito.android.iac_dialer.impl_module.audio.audio_devices.b.a
        public final void a(@k AudioState audioState) {
            b.this.f166482a.getCallbacks().getOnAudioStateChanged().invoke(audioState);
        }
    }

    public b(@k IacConnectionInputData iacConnectionInputData, @k R0 r02, @k com.avito.android.iac_dialer.impl_module.audio.audio_devices.b bVar, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f166482a = iacConnectionInputData;
        this.f166483b = r02;
        this.f166484c = bVar;
        this.f166485d = aVar;
        this.f166486e = aVar2;
        a aVar3 = new a();
        this.f166487f = aVar3;
        bVar.c(aVar3);
        iacConnectionInputData.getCallbacks().getOnCallAdded().invoke(new com.avito.android.iac_dialer.impl_module.telecom.stub.a(this));
    }

    public final void a(@k String str) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacConnection_".concat(C43066x.u0(3, this.f166482a.getCallId())), str, null);
    }
}
