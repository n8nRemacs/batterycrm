package io.noties.markwon.html.jsoup.nodes;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Map;

/* compiled from: CommonMarkEntities.java */
/* loaded from: classes8.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, String> f401764a;

    static {
        Map<String, String> map;
        try {
            Field declaredField = org.commonmark.internal.util.b.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(null);
        } catch (Throwable th2) {
            Map<String, String> mapEmptyMap = Collections.emptyMap();
            th2.printStackTrace();
            map = mapEmptyMap;
        }
        f401764a = map;
    }
}
