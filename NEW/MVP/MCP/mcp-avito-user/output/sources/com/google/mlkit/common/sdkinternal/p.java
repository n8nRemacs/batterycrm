package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.components.b;
import j.P;
import java.util.UUID;

/* compiled from: com.google.mlkit:common@@18.10.0 */
@RX0.a
/* loaded from: classes6.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    @RX0.a
    public static final com.google.firebase.components.b<?> f362380b;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final Context f362381a;

    static {
        b.C10697b c10697bB = com.google.firebase.components.b.b(p.class);
        c10697bB.a(com.google.firebase.components.n.a(C37642k.class));
        c10697bB.a(com.google.firebase.components.n.a(Context.class));
        c10697bB.c(new com.google.firebase.components.f() { // from class: com.google.mlkit.common.sdkinternal.J
            @Override // com.google.firebase.components.f
            public final Object a(com.google.firebase.components.c cVar) {
                return new p((Context) cVar.a(Context.class));
            }
        });
        f362380b = c10697bB.b();
    }

    public p(@j.N Context context) {
        this.f362381a = context;
    }

    @RX0.a
    public final synchronized void a(@j.N NZ0.d dVar) {
        String strB = b(dVar);
        e().edit().remove("downloading_model_id_" + dVar.a()).remove("downloading_model_hash_" + dVar.a()).remove("downloading_model_type_" + strB).remove("downloading_begin_time_" + dVar.a()).remove("model_first_use_time_" + dVar.a()).apply();
    }

    @RX0.a
    @P
    public final synchronized String b(@j.N NZ0.d dVar) {
        return e().getString("downloading_model_hash_" + dVar.a(), null);
    }

    @j.N
    @RX0.a
    public final synchronized String c() {
        String string = e().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        e().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    @RX0.a
    public final synchronized long d(@j.N NZ0.d dVar) {
        return e().getLong("downloading_begin_time_" + dVar.a(), 0L);
    }

    @j.N
    public final SharedPreferences e() {
        return this.f362381a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
