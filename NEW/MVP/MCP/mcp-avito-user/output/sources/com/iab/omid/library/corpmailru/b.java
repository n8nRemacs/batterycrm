package com.iab.omid.library.corpmailru;

import android.content.Context;
import com.iab.omid.library.corpmailru.b.d;
import com.iab.omid.library.corpmailru.b.f;
import com.iab.omid.library.corpmailru.d.e;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f363967a;

    private void b(Context context) {
        e.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.3.20-Corpmailru";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        f.a().a(context);
        com.iab.omid.library.corpmailru.b.b.a().a(context);
        com.iab.omid.library.corpmailru.d.b.a(context);
        d.a().a(context);
    }

    public boolean b() {
        return this.f363967a;
    }

    public void a(boolean z12) {
        this.f363967a = z12;
    }
}
