package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.analytics.connector.a;
import j.P;
import jZ0.C42336c;
import jZ0.C42337d;
import jZ0.InterfaceC42335b;
import java.util.Locale;

/* compiled from: CrashlyticsAnalyticsListener.java */
/* loaded from: classes4.dex */
class d implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public C42336c f360866a;

    /* renamed from: b, reason: collision with root package name */
    public C42337d f360867b;

    @Override // com.google.firebase.analytics.connector.a.b
    public final void a(int i12, @P Bundle bundle) {
        com.google.firebase.crashlytics.internal.d dVar = com.google.firebase.crashlytics.internal.d.f361031a;
        Locale locale = Locale.US;
        bundle.toString();
        dVar.a(2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            InterfaceC42335b interfaceC42335b = "clx".equals(bundle2.getString("_o")) ? this.f360866a : this.f360867b;
            if (interfaceC42335b == null) {
                return;
            }
            interfaceC42335b.onEvent(string, bundle2);
        }
    }
}
