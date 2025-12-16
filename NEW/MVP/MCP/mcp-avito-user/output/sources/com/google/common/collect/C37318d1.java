package com.google.common.collect;

import com.google.common.collect.C37381n4;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: HashBasedTable.java */
@XY0.b
@InterfaceC37329f0
/* renamed from: com.google.common.collect.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C37318d1<R, C, V> extends C37381n4<R, C, V> {
    private static final long serialVersionUID = 0;

    /* compiled from: HashBasedTable.java */
    /* renamed from: com.google.common.collect.d1$a */
    public static class a<C, V> implements com.google.common.base.e0<Map<C, V>>, Serializable {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.e0
        public final Object get() {
            return new LinkedHashMap(M2.c(0));
        }
    }

    public C37318d1() {
        throw null;
    }

    @Override // com.google.common.collect.C37381n4
    public final Map k(Object obj) {
        return new C37381n4.c(obj);
    }

    @Override // com.google.common.collect.C37381n4
    public final Map u(Object obj) {
        return new C37381n4.g(obj);
    }
}
