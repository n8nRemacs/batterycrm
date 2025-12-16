package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.ob.C39054pf;

/* loaded from: classes7.dex */
public class Zc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Vb f379998a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Yc f379999b;

    public Zc(@j.N Vb vb2, @j.N Yc yc2) {
        this.f379998a = vb2;
        this.f379999b = yc2;
    }

    @j.P
    public C39054pf.a a(long j12, @j.P String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                C38951lc c38951lcA = this.f379998a.a(j12, str);
                if (c38951lcA != null) {
                    return this.f379999b.a(c38951lcA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
