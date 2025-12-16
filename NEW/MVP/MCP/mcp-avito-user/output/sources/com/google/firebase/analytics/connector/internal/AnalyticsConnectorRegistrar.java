package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.n;
import com.google.firebase.platforminfo.h;
import j.N;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import tZ0.C48621a;
import tZ0.InterfaceC48622b;
import tZ0.InterfaceC48624d;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
@RX0.a
@Keep
/* loaded from: classes13.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static com.google.firebase.analytics.connector.a lambda$getComponents$0(com.google.firebase.components.c cVar) {
        com.google.firebase.g gVar = (com.google.firebase.g) cVar.a(com.google.firebase.g.class);
        Context context = (Context) cVar.a(Context.class);
        InterfaceC48624d interfaceC48624d = (InterfaceC48624d) cVar.a(InterfaceC48624d.class);
        C36729v.j(gVar);
        C36729v.j(context);
        C36729v.j(interfaceC48624d);
        C36729v.j(context.getApplicationContext());
        if (com.google.firebase.analytics.connector.b.f360708c == null) {
            synchronized (com.google.firebase.analytics.connector.b.class) {
                try {
                    if (com.google.firebase.analytics.connector.b.f360708c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f361596b)) {
                            interfaceC48624d.a(new Executor() { // from class: com.google.firebase.analytics.connector.d
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new InterfaceC48622b() { // from class: com.google.firebase.analytics.connector.e
                                @Override // tZ0.InterfaceC48622b
                                public final void a(C48621a c48621a) {
                                    throw null;
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        com.google.firebase.analytics.connector.b.f360708c = new com.google.firebase.analytics.connector.b(zzdf.zza(context, (String) null, (String) null, (String) null, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return com.google.firebase.analytics.connector.b.f360708c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @N
    @Keep
    @SuppressLint({"MissingPermission"})
    @RX0.a
    public List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(com.google.firebase.analytics.connector.a.class);
        c10697bB.a(n.a(com.google.firebase.g.class));
        c10697bB.a(n.a(Context.class));
        c10697bB.a(n.a(InterfaceC48624d.class));
        c10697bB.c(new com.google.firebase.components.f() { // from class: com.google.firebase.analytics.connector.internal.c
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return AnalyticsConnectorRegistrar.lambda$getComponents$0(cVar);
            }
        });
        c10697bB.d(2);
        return Arrays.asList(c10697bB.b(), h.a("fire-analytics", "21.5.1"));
    }
}
