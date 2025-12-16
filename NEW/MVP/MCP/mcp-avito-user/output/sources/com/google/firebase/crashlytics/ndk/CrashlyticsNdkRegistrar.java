package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.b;
import com.google.firebase.components.n;
import com.google.firebase.crashlytics.internal.common.C37586h;
import java.util.Arrays;
import java.util.List;
import mZ0.C44035b;

/* loaded from: classes4.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<com.google.firebase.components.b<?>> getComponents() {
        b.C10697b c10697bB = com.google.firebase.components.b.b(com.google.firebase.crashlytics.internal.a.class);
        c10697bB.f360732a = "fire-cls-ndk";
        c10697bB.a(n.a(Context.class));
        c10697bB.f360737f = new com.google.firebase.components.f() { // from class: com.google.firebase.crashlytics.ndk.b
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                this.f361492b.getClass();
                Context context = (Context) cVar.a(Context.class);
                return new e(new c(context, new JniNativeApi(context), new C44035b(context)), !(C37586h.e(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
            }
        };
        c10697bB.d(2);
        return Arrays.asList(c10697bB.b(), com.google.firebase.platforminfo.h.a("fire-cls-ndk", "18.3.7"));
    }
}
