package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39205w;
import com.yandex.metrica.impl.ob.E;
import java.util.List;

/* loaded from: classes7.dex */
public class Ac {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final List<E.b.a> f377769a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final List<C39205w.a> f377770b;

    public Ac(@j.N List<E.b.a> list, @j.N List<C39205w.a> list2) {
        this.f377769a = list;
        this.f377770b = list2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Preconditions{possibleChargeTypes=");
        sb2.append(this.f377769a);
        sb2.append(", appStatuses=");
        return androidx.compose.foundation.H.p(sb2, this.f377770b, '}');
    }
}
