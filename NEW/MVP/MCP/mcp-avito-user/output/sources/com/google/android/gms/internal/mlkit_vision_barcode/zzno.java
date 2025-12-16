package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.p;
import com.google.android.gms.tasks.InterfaceC37023f;
import j.k0;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* loaded from: classes6.dex */
public final class zzno {

    /* renamed from: a, reason: collision with root package name */
    public final p f352214a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f352215b = new AtomicLong(-1);

    @k0
    public zzno(Context context) {
        D d12 = D.f349312c;
        D.a aVar = new D.a(null);
        aVar.f349314a = "mlkit:vision";
        this.f352214a = new p(context, p.f349461k, new D(aVar.f349314a, null), h.a.f348930c);
    }

    public static zzno zza(Context context) {
        return new zzno(context);
    }

    public final synchronized void zzc(int i12, int i13, long j12, long j13) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f352215b.get() != -1 && jElapsedRealtime - this.f352215b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f352214a.d(new TelemetryData(0, Arrays.asList(new MethodInvocation(i12, i13, 0, j12, j13, null, null, 0, -1)))).e(new InterfaceC37023f() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zznn
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public final void onFailure(Exception exc) {
                zzno zznoVar = this.zza;
                zznoVar.f352215b.set(jElapsedRealtime);
            }
        });
    }
}
