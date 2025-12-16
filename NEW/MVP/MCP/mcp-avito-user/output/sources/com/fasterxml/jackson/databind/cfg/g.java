package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.ser.std.M;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* compiled from: ContextAttributes.java */
/* loaded from: classes4.dex */
public abstract class g {
    public abstract Object a(Object obj);

    public abstract a b(IdentityHashMap identityHashMap);

    /* compiled from: ContextAttributes.java */
    public static class a extends g implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        public static final a f341491d = new a(Collections.emptyMap());

        /* renamed from: e, reason: collision with root package name */
        public static final Object f341492e = new Object();
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Map<?, ?> f341493b;

        /* renamed from: c, reason: collision with root package name */
        public final transient HashMap f341494c;

        public a(Map<?, ?> map) {
            this.f341493b = map;
            this.f341494c = null;
        }

        @Override // com.fasterxml.jackson.databind.cfg.g
        public final Object a(Object obj) {
            Object obj2;
            HashMap map = this.f341494c;
            if (map == null || (obj2 = map.get(obj)) == null) {
                return this.f341493b.get(obj);
            }
            if (obj2 == f341492e) {
                return null;
            }
            return obj2;
        }

        @Override // com.fasterxml.jackson.databind.cfg.g
        public final a b(IdentityHashMap identityHashMap) {
            Object obj = M.f342352c;
            HashMap map = this.f341494c;
            if (map != null) {
                map.put(obj, identityHashMap);
                return this;
            }
            HashMap map2 = new HashMap();
            map2.put(obj, identityHashMap);
            return new a(this.f341493b, map2);
        }

        public a(Map map, HashMap map2) {
            this.f341493b = map;
            this.f341494c = map2;
        }
    }
}
