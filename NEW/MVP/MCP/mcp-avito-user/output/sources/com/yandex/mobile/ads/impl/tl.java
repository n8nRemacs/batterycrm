package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class tl {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f390222a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f390223b = new ArrayList();

    public static void a(tl tlVar, long j12) {
        tlVar.f390222a.put("exo_len", Long.valueOf(j12));
        tlVar.f390223b.remove("exo_len");
    }

    public final List<String> b() {
        return Collections.unmodifiableList(new ArrayList(this.f390223b));
    }

    public static void a(tl tlVar, @j.P Uri uri) {
        if (uri == null) {
            tlVar.f390223b.add("exo_redir");
            tlVar.f390222a.remove("exo_redir");
            return;
        }
        String string = uri.toString();
        HashMap map = tlVar.f390222a;
        string.getClass();
        map.put("exo_redir", string);
        tlVar.f390223b.remove("exo_redir");
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap(this.f390222a);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(map);
    }
}
