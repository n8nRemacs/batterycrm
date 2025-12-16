package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.measurement.zzdf;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
/* loaded from: classes6.dex */
final class zzeo extends zzdf.zza {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f350716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Activity f350717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zzdf.zzd f350718h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeo(zzdf.zzd zzdVar, Bundle bundle, Activity activity) {
        super(true);
        this.f350716f = bundle;
        this.f350717g = activity;
        this.f350718h = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdf.zza
    public final void zza() {
        Bundle bundle;
        if (this.f350716f != null) {
            bundle = new Bundle();
            if (this.f350716f.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f350716f.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        zzcu zzcuVar = zzdf.this.f350620i;
        C36729v.j(zzcuVar);
        zzcuVar.onActivityCreated(new f(this.f350717g), bundle, this.f350622c);
    }
}
