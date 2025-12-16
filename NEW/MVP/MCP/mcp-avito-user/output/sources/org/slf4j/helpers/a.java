package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.spi.MDCAdapter;

/* compiled from: BasicMDCAdapter.java */
/* loaded from: classes7.dex */
public class a implements MDCAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final InheritableThreadLocal<Map<String, String>> f421822a = new C12237a();

    /* compiled from: BasicMDCAdapter.java */
    /* renamed from: org.slf4j.helpers.a$a, reason: collision with other inner class name */
    public class C12237a extends InheritableThreadLocal<Map<String, String>> {
        @Override // java.lang.InheritableThreadLocal
        public final Map<String, String> childValue(Map<String, String> map) {
            Map<String, String> map2 = map;
            if (map2 == null) {
                return null;
            }
            return new HashMap(map2);
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public final Map<String, String> a() {
        Map<String, String> map = this.f421822a.get();
        if (map != null) {
            return new HashMap(map);
        }
        return null;
    }

    @Override // org.slf4j.spi.MDCAdapter
    public final void b(Map<String, String> map) {
        this.f421822a.set(new HashMap(map));
    }

    @Override // org.slf4j.spi.MDCAdapter
    public final void clear() {
        InheritableThreadLocal<Map<String, String>> inheritableThreadLocal = this.f421822a;
        Map<String, String> map = inheritableThreadLocal.get();
        if (map != null) {
            map.clear();
            inheritableThreadLocal.remove();
        }
    }

    @Override // org.slf4j.spi.MDCAdapter
    public final void remove(String str) {
        Map<String, String> map = this.f421822a.get();
        if (map != null) {
            map.remove(str);
        }
    }
}
