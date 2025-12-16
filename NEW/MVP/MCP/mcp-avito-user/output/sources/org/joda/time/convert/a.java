package org.joda.time.convert;

import org.joda.time.AbstractC44854a;
import org.joda.time.C44866h;
import org.joda.time.chrono.x;

/* compiled from: AbstractConverter.java */
/* loaded from: classes7.dex */
public abstract class a implements c {
    public AbstractC44854a b(Object obj) {
        C44866h.b bVar = C44866h.f420908a;
        return x.V();
    }

    public long c(Object obj, AbstractC44854a abstractC44854a) {
        return C44866h.a();
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Converter["), a() == null ? "null" : a().getName(), "]");
    }
}
