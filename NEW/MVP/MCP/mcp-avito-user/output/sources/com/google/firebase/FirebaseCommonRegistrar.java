package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.internal.P0;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.u;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import gZ0.InterfaceC40638a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;

/* loaded from: classes10.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.b<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.platforminfo.c.b());
        final u uVar = new u(InterfaceC40638a.class, Executor.class);
        String string = null;
        b.C10697b c10697b = new b.C10697b(com.google.firebase.heartbeatinfo.f.class, new Class[]{com.google.firebase.heartbeatinfo.i.class, HeartBeatInfo.class}, (b.a) null);
        c10697b.a(com.google.firebase.components.n.a(Context.class));
        c10697b.a(com.google.firebase.components.n.a(g.class));
        c10697b.a(new com.google.firebase.components.n(2, 0, com.google.firebase.heartbeatinfo.g.class));
        c10697b.a(new com.google.firebase.components.n(1, 1, com.google.firebase.platforminfo.i.class));
        c10697b.a(new com.google.firebase.components.n((u<?>) uVar, 1, 0));
        c10697b.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.heartbeatinfo.d
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new f((Context) cVar.a(Context.class), ((com.google.firebase.g) cVar.a(com.google.firebase.g.class)).d(), cVar.h(g.class), cVar.b(com.google.firebase.platforminfo.i.class), (Executor) cVar.f(uVar));
            }
        };
        arrayList.add(c10697b.b());
        arrayList.add(com.google.firebase.platforminfo.h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.platforminfo.h.a("fire-core", "20.4.2"));
        arrayList.add(com.google.firebase.platforminfo.h.a("device-name", a(Build.PRODUCT)));
        arrayList.add(com.google.firebase.platforminfo.h.a("device-model", a(Build.DEVICE)));
        arrayList.add(com.google.firebase.platforminfo.h.a("device-brand", a(Build.BRAND)));
        arrayList.add(com.google.firebase.platforminfo.h.b("android-target-sdk", new P0(26)));
        arrayList.add(com.google.firebase.platforminfo.h.b("android-min-sdk", new P0(27)));
        arrayList.add(com.google.firebase.platforminfo.h.b("android-platform", new P0(28)));
        arrayList.add(com.google.firebase.platforminfo.h.b("android-installer", new P0(29)));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (string != null) {
            arrayList.add(com.google.firebase.platforminfo.h.a("kotlin", string));
        }
        return arrayList;
    }
}
