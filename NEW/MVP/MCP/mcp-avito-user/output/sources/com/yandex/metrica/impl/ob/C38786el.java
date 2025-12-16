package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C39275yl;

/* renamed from: com.yandex.metrica.impl.ob.el, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38786el {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C39131sl f380505a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39275yl.a f380506b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39155tl f380507c;

    public C38786el() {
        this(new C39131sl(), new C39275yl.a(), new C39155tl());
    }

    @j.N
    public C38761dl a(@j.N Activity activity, @j.N C39227wl c39227wl, @j.N Ak ak2, @j.N Hk hk2, boolean z12) {
        if (z12) {
            return new C38761dl();
        }
        C39155tl c39155tl = this.f380507c;
        this.f380506b.getClass();
        return c39155tl.a(activity, hk2, c39227wl, ak2, new C39275yl(c39227wl, C39031oh.a()), this.f380505a);
    }

    @j.k0
    public C38786el(@j.N C39131sl c39131sl, @j.N C39275yl.a aVar, @j.N C39155tl c39155tl) {
        this.f380505a = c39131sl;
        this.f380506b = aVar;
        this.f380507c = c39155tl;
    }
}
