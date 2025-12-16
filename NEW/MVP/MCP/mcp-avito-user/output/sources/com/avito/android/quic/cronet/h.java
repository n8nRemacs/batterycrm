package com.avito.android.quic.cronet;

import com.avito.android.quic.cronet.t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import okhttp3.Protocol;

/* compiled from: CronetEngineProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class h extends H implements Y41.q<org.chromium.net.CronetException, String, Protocol, G0> {
    @Override // Y41.q
    public final G0 invoke(org.chromium.net.CronetException cronetException, String str, Protocol protocol) {
        ((g) this.receiver).f246206d.f246225a.accept(new t.a(cronetException, str, protocol));
        return G0.f406611a;
    }
}
