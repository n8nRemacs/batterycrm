package com.yandex.metrica.impl.ob;

import android.os.Process;

/* loaded from: classes7.dex */
class C7 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final String f377891a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f377892b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f377893c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final C39046p7 f377894d;

    public C7(@j.N String str, boolean z12, @j.P C39046p7 c39046p7) {
        this(str, z12, c39046p7, A2.a(23) && Process.is64Bit());
    }

    @j.k0
    public C7(@j.N String str, boolean z12, @j.P C39046p7 c39046p7, boolean z13) {
        this.f377891a = str;
        this.f377893c = z12;
        this.f377894d = c39046p7;
        this.f377892b = z13;
    }
}
