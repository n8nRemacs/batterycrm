package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.hk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C38860hk {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38760dk f380731a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C38710bk f380732b;

    public C38860hk(@j.N Context context) {
        this(new C38760dk(context), new C38710bk());
    }

    @j.N
    public Wk a(@j.N Activity activity, @j.P C38811fl c38811fl) {
        if (c38811fl == null) {
            return Wk.NULL_UI_ACCESS_CONFIG;
        }
        if (!c38811fl.f380597a) {
            return Wk.UI_PARING_FEATURE_DISABLED;
        }
        C39227wl c39227wl = c38811fl.f380601e;
        return c39227wl == null ? Wk.NULL_UI_PARSING_CONFIG : this.f380731a.a(activity, c39227wl) ? Wk.FORBIDDEN_FOR_APP : this.f380732b.a(activity, c38811fl.f380601e) ? Wk.FORBIDDEN_FOR_ACTIVITY : Wk.OK;
    }

    @j.k0
    public C38860hk(@j.N C38760dk c38760dk, @j.N C38710bk c38710bk) {
        this.f380731a = c38760dk;
        this.f380732b = c38710bk;
    }
}
