package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class Nk implements Cl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Pattern f379014a;

    public Nk(@j.N Pattern pattern) {
        this.f379014a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N Object obj) {
        return this.f379014a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.BAD_REGEXP_MATCHED;
    }
}
