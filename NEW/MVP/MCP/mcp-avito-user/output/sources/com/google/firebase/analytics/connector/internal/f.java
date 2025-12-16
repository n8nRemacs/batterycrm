package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import eY0.C40073a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
final class f implements C40073a.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f360721a;

    public f(g gVar) {
        this.f360721a = gVar;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC36933n3
    public final void a(String str, String str2, Bundle bundle, long j12) {
        if (str == null || b.f360713a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j12);
        bundle2.putBundle("params", bundle);
        this.f360721a.f360722a.a(3, bundle2);
    }
}
