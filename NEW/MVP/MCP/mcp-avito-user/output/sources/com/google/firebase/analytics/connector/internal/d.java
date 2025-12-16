package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C36912k3;
import com.google.android.gms.measurement.internal.C36920l4;
import com.google.common.collect.H1;
import eY0.C40073a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
final class d implements C40073a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f360718a;

    public d(e eVar) {
        this.f360718a = eVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36933n3
    public final void a(String str, String str2, Bundle bundle, long j12) {
        e eVar = this.f360718a;
        if (eVar.f360719a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            H1<String> h12 = b.f360713a;
            String strA = C36920l4.a(str2, C36912k3.f355242c, C36912k3.f355240a);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            eVar.f360720b.a(2, bundle2);
        }
    }
}
