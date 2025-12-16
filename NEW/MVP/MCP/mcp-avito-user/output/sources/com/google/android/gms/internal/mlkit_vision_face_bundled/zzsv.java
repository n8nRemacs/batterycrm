package com.google.android.gms.internal.mlkit_vision_face_bundled;

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

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
public final class zzsv {

    /* renamed from: a, reason: collision with root package name */
    public final p f353986a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicLong f353987b = new AtomicLong(-1);

    @k0
    public zzsv(Context context) {
        D d12 = D.f349312c;
        D.a aVar = new D.a(null);
        aVar.f349314a = "mlkit:vision";
        this.f353986a = new p(context, p.f349461k, new D(aVar.f349314a, null), h.a.f348930c);
    }

    public static zzsv zza(Context context) {
        return new zzsv(context);
    }

    public final synchronized void zzc(int i12, int i13, long j12, long j13) {
        AtomicLong atomicLong = this.f353987b;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (atomicLong.get() != -1 && jElapsedRealtime - this.f353987b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
            return;
        }
        this.f353986a.d(new TelemetryData(0, Arrays.asList(new MethodInvocation(25503, i13, 0, j12, j13, null, null, 0, -1)))).e(new InterfaceC37023f() { // from class: com.google.android.gms.internal.mlkit_vision_face_bundled.zzsu
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public final void onFailure(Exception exc) {
                zzsv zzsvVar = this.zza;
                zzsvVar.f353987b.set(jElapsedRealtime);
            }
        });
    }
}
