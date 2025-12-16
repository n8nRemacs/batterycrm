package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.wh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39223wh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final String f382131a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final String f382132b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C38774e9 f382133c;

    public C39223wh(@j.N String str, @j.N String str2) {
        this(str, str2, F0.g().s());
    }

    @j.P
    public String a() {
        C38774e9 c38774e9 = this.f382133c;
        String str = this.f382131a;
        String str2 = this.f382132b;
        c38774e9.getClass();
        return c38774e9.a(new Rd(androidx.compose.ui.graphics.colorspace.e.n("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), (String) null);
    }

    @j.k0
    public C39223wh(@j.N String str, @j.N String str2, @j.N C38774e9 c38774e9) {
        this.f382131a = str;
        this.f382132b = str2;
        this.f382133c = c38774e9;
    }

    public void a(@j.P String str) {
        this.f382133c.a(this.f382131a, this.f382132b, str);
    }
}
