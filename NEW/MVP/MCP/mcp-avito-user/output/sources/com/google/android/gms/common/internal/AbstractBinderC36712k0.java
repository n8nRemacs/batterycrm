package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* renamed from: com.google.android.gms.common.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractBinderC36712k0 extends zzb implements InterfaceC36721p {
    public AbstractBinderC36712k0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean e4(int i12, Parcel parcel, Parcel parcel2) {
        if (i12 == 1) {
            int i13 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            v0 v0Var = (v0) this;
            C36729v.k(v0Var.f349470a, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC36699e abstractC36699e = v0Var.f349470a;
            abstractC36699e.getClass();
            x0 x0Var = new x0(abstractC36699e, i13, strongBinder, bundle);
            Handler handler = abstractC36699e.f349409m;
            handler.sendMessage(handler.obtainMessage(1, v0Var.f349471b, -1, x0Var));
            v0Var.f349470a = null;
        } else if (i12 == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i12 != 3) {
                return false;
            }
            int i14 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) zzc.zza(parcel, zzk.CREATOR);
            zzc.zzb(parcel);
            v0 v0Var2 = (v0) this;
            AbstractC36699e abstractC36699e2 = v0Var2.f349470a;
            C36729v.k(abstractC36699e2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C36729v.j(zzkVar);
            abstractC36699e2.f349396C = zzkVar;
            if (abstractC36699e2.usesClientTelemetry()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f349497e;
                C36731x c36731xA = C36731x.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f349306b;
                synchronized (c36731xA) {
                    if (rootTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = C36731x.f349475c;
                    } else {
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = c36731xA.f349476a;
                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f349369b < rootTelemetryConfiguration.f349369b) {
                        }
                    }
                    c36731xA.f349476a = rootTelemetryConfiguration;
                }
            }
            Bundle bundle2 = zzkVar.f349494b;
            C36729v.k(v0Var2.f349470a, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC36699e abstractC36699e3 = v0Var2.f349470a;
            abstractC36699e3.getClass();
            x0 x0Var2 = new x0(abstractC36699e3, i14, strongBinder2, bundle2);
            Handler handler2 = abstractC36699e3.f349409m;
            handler2.sendMessage(handler2.obtainMessage(1, v0Var2.f349471b, -1, x0Var2));
            v0Var2.f349470a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
