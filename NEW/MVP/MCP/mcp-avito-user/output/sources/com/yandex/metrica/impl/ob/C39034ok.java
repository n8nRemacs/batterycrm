package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39107rl;
import java.util.regex.Pattern;

/* renamed from: com.yandex.metrica.impl.ob.ok, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39034ok implements Cl {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Pattern f381268a;

    public C39034ok(@j.N Pattern pattern) {
        this.f381268a = pattern;
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    public boolean a(@j.N Object obj) {
        return !this.f381268a.matcher((String) obj).matches();
    }

    @Override // com.yandex.metrica.impl.ob.Cl
    @j.N
    public C39107rl.b a() {
        return C39107rl.b.REGEXP_NOT_MATCHED;
    }
}
