package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.n;
import com.google.firebase.installations.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(FirebaseCrashlytics.class);
        c10697bB.f360732a = "fire-cls";
        c10697bB.a(n.a(com.google.firebase.g.class));
        c10697bB.a(n.a(i.class));
        c10697bB.a(new n(0, 2, com.google.firebase.crashlytics.internal.a.class));
        c10697bB.a(new n(0, 2, com.google.firebase.analytics.connector.a.class));
        c10697bB.f360737f = new a(this);
        c10697bB.d(2);
        return Arrays.asList(c10697bB.b(), com.google.firebase.platforminfo.h.a("fire-cls", "18.3.7"));
    }
}
