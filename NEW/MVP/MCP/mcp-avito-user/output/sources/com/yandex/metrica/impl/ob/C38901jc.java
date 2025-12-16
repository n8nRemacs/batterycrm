package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.jc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38901jc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final T7 f380894a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final Vb f380895b;

    public C38901jc(@j.N Context context) {
        this(C38899ja.a(context).e(), new Vb(context));
    }

    public void a(@j.N C38951lc c38951lc) {
        String strA = this.f380895b.a(c38951lc);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        this.f380894a.a(c38951lc.d(), strA);
    }

    @j.k0
    public C38901jc(@j.N T7 t72, @j.N Vb vb2) {
        this.f380894a = t72;
        this.f380895b = vb2;
    }
}
