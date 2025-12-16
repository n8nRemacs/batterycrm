package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.internal.A;
import com.google.android.gms.common.api.internal.InterfaceC36673v;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class p extends com.google.android.gms.common.api.h implements C {

    /* renamed from: k, reason: collision with root package name */
    public static final C36616a f349461k = new C36616a("ClientTelemetry.API", new o(), new C36616a.g());

    public final Task<Void> d(final TelemetryData telemetryData) {
        A.a aVarA = A.a();
        aVarA.f348954c = new Feature[]{zaf.zaa};
        aVarA.f348953b = false;
        aVarA.f348952a = new InterfaceC36673v() { // from class: com.google.android.gms.common.internal.service.n
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.InterfaceC36673v
            public final void accept(Object obj, Object obj2) {
                C37028k c37028k = (C37028k) obj2;
                C36616a c36616a = p.f349461k;
                j jVar = (j) ((q) obj).getService();
                Parcel parcelE4 = jVar.e4();
                zac.zac(parcelE4, telemetryData);
                try {
                    jVar.f350195a.transact(1, parcelE4, null, 1);
                    parcelE4.recycle();
                    c37028k.b(null);
                } catch (Throwable th2) {
                    parcelE4.recycle();
                    throw th2;
                }
            }
        };
        return doBestEffortWrite(aVarA.a());
    }
}
