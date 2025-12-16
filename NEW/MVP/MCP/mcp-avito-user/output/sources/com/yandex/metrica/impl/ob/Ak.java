package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.C39107rl;

/* loaded from: classes7.dex */
class Ak {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38884ik f377780a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final C39202vk f377781b;

    /* renamed from: c, reason: collision with root package name */
    private final int f377782c;

    public Ak(@j.N AbstractC39274yk<?> abstractC39274yk, int i12) {
        this(abstractC39274yk, i12, new C38884ik(abstractC39274yk.b()));
    }

    @j.P
    public C39107rl.b a(@j.P String str) {
        if (str == null) {
            return null;
        }
        Pair<Boolean, C39107rl.b> pairA = this.f377781b.a(this.f377782c, str);
        if (pairA != null) {
            return (C39107rl.b) pairA.second;
        }
        C39107rl.b bVarA = this.f377780a.a(str);
        this.f377781b.a(this.f377782c, str, bVarA != null, bVarA);
        return bVarA;
    }

    @j.k0
    public Ak(@j.N AbstractC39274yk<?> abstractC39274yk, int i12, @j.N C38884ik c38884ik) {
        this.f377782c = i12;
        this.f377780a = c38884ik;
        this.f377781b = abstractC39274yk.a();
    }
}
