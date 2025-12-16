package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.deser.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: JDKValueInstantiators.java */
/* loaded from: classes4.dex */
public abstract class k {

    /* compiled from: JDKValueInstantiators.java */
    public static class a extends x.a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final a f341648c = new a();
        private static final long serialVersionUID = 2;

        public a() {
            super((Class<?>) ArrayList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean k() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean m() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object y(com.fasterxml.jackson.databind.f fVar) {
            return new ArrayList();
        }
    }

    /* compiled from: JDKValueInstantiators.java */
    public static class b extends x.a implements Serializable {
        private static final long serialVersionUID = 2;

        /* renamed from: c, reason: collision with root package name */
        public final Object f341649c;

        public b(Object obj) {
            super(obj.getClass());
            this.f341649c = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean k() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean m() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object y(com.fasterxml.jackson.databind.f fVar) {
            return this.f341649c;
        }
    }

    /* compiled from: JDKValueInstantiators.java */
    public static class c extends x.a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final c f341650c = new c();
        private static final long serialVersionUID = 2;

        public c() {
            super((Class<?>) HashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean k() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean m() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object y(com.fasterxml.jackson.databind.f fVar) {
            return new HashMap();
        }
    }

    /* compiled from: JDKValueInstantiators.java */
    public static class d extends x.a implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        public static final d f341651c = new d();
        private static final long serialVersionUID = 2;

        public d() {
            super((Class<?>) LinkedHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean k() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final boolean m() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.x
        public final Object y(com.fasterxml.jackson.databind.f fVar) {
            return new LinkedHashMap();
        }
    }

    public static x.a a(Class cls) {
        if (cls == com.fasterxml.jackson.core.e.class) {
            return new com.fasterxml.jackson.databind.deser.std.r();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return a.f341648c;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new b(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new b(list);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return d.f341651c;
        }
        if (cls == HashMap.class) {
            return c.f341650c;
        }
        Map map = Collections.EMPTY_MAP;
        if (map.getClass() == cls) {
            return new b(map);
        }
        return null;
    }
}
