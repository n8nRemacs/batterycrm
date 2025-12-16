package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* compiled from: IgnorePropertiesUtil.java */
/* loaded from: classes4.dex */
public class n {

    /* compiled from: IgnorePropertiesUtil.java */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public final Set<String> f342621b;

        /* renamed from: c, reason: collision with root package name */
        public final Set<String> f342622c;

        public a(Set<String> set, Set<String> set2) {
            this.f342621b = set == null ? Collections.emptySet() : set;
            this.f342622c = set2;
        }

        public final boolean a(Object obj) {
            Set<String> set = this.f342622c;
            return !(set == null || set.contains(obj)) || this.f342621b.contains(obj);
        }
    }

    public static a a(Set<String> set, Set<String> set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return new a(set, set2);
    }

    public static boolean b(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        return collection2 == null ? collection.contains(obj) : collection == null ? !collection2.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
    }
}
