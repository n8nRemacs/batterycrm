package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38889j0 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final K0 f380801a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Map<Boolean, String> f380802b = new HashMap();

    public C38889j0(@j.N K0 k02) {
        this.f380801a = k02;
    }

    public void a(@j.P Intent intent) {
        if (intent != null) {
            a(intent.getDataString(), false);
        }
    }

    public void b(@j.P String str) {
        a(str, true);
    }

    public void a(@j.P String str) {
        a(str, false);
    }

    private void a(@j.P String str, boolean z12) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!A2.a(str, this.f380802b.get(Boolean.valueOf(!z12)))) {
            this.f380801a.a(str, z12);
        }
        this.f380802b.put(Boolean.valueOf(z12), str);
    }
}
