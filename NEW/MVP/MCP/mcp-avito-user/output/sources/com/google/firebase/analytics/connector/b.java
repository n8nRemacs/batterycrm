package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.internal.C36729v;
import com.google.common.collect.AbstractC37401r1;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.analytics.connector.internal.g;
import eY0.C40073a;
import j.N;
import j.k0;
import j.l0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
/* loaded from: classes13.dex */
public class b implements com.google.firebase.analytics.connector.a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f360708c;

    /* renamed from: a, reason: collision with root package name */
    @k0
    public final C40073a f360709a;

    /* renamed from: b, reason: collision with root package name */
    @k0
    public final ConcurrentHashMap f360710b;

    /* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
    public class a implements a.InterfaceC10696a {
        public a() {
            throw null;
        }
    }

    public b(C40073a c40073a) {
        C36729v.j(c40073a);
        this.f360709a = c40073a;
        this.f360710b = new ConcurrentHashMap();
    }

    @Override // com.google.firebase.analytics.connector.a
    @RX0.a
    public final void a(@N String str, @N String str2, @N Bundle bundle) {
        boolean z12;
        boolean z13 = false;
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.f360715c.contains(str)) {
            return;
        }
        if (com.google.firebase.analytics.connector.internal.b.f360714b.contains(str2)) {
            z12 = false;
            break;
        }
        AbstractC37401r1<String> abstractC37401r1 = com.google.firebase.analytics.connector.internal.b.f360716d;
        int size = abstractC37401r1.size();
        int i12 = 0;
        while (i12 < size) {
            String str3 = abstractC37401r1.get(i12);
            i12++;
            if (bundle.containsKey(str3)) {
                z12 = false;
                break;
            }
        }
        z12 = true;
        if (z12) {
            if (!"_cmp".equals(str2)) {
                z13 = true;
            } else if (!com.google.firebase.analytics.connector.internal.b.f360715c.contains(str)) {
                AbstractC37401r1<String> abstractC37401r12 = com.google.firebase.analytics.connector.internal.b.f360716d;
                int size2 = abstractC37401r12.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size2) {
                        switch (str) {
                            case "fcm":
                                bundle.putString("_cis", "fcm_integration");
                                break;
                            case "fdl":
                                bundle.putString("_cis", "fdl_integration");
                                break;
                            case "fiam":
                                bundle.putString("_cis", "fiam_integration");
                                break;
                        }
                    } else {
                        String str4 = abstractC37401r12.get(i13);
                        i13++;
                        if (bundle.containsKey(str4)) {
                            break;
                        }
                    }
                }
            }
            if (z13) {
                if ("clx".equals(str) && "_ae".equals(str2)) {
                    bundle.putLong("_r", 1L);
                }
                this.f360709a.f395233a.zzb(str, str2, bundle);
            }
        }
    }

    @Override // com.google.firebase.analytics.connector.a
    @RX0.a
    public final void b(@N String str) {
        if (com.google.firebase.analytics.connector.internal.b.f360715c.contains("fcm")) {
            return;
        }
        this.f360709a.f395233a.zza("fcm", "_ln", (Object) str, true);
    }

    @Override // com.google.firebase.analytics.connector.a
    @N
    @RX0.a
    @l0
    public final a.InterfaceC10696a c(@N String str, @N a.b bVar) {
        if (com.google.firebase.analytics.connector.internal.b.f360715c.contains(str)) {
            return null;
        }
        boolean zIsEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f360710b;
        if (!zIsEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean zEquals = "fiam".equals(str);
        C40073a c40073a = this.f360709a;
        com.google.firebase.analytics.connector.internal.a eVar = zEquals ? new com.google.firebase.analytics.connector.internal.e(c40073a, bVar) : "clx".equals(str) ? new g(c40073a, bVar) : null;
        if (eVar == null) {
            return null;
        }
        concurrentHashMap.put(str, eVar);
        return new a();
    }
}
