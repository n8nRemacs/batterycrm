package com.google.common.html;

import com.google.common.escape.h;
import java.util.HashMap;

/* compiled from: HtmlEscapers.java */
@a
@XY0.b
/* loaded from: classes6.dex */
public final class b {
    static {
        int i12 = h.f360156a;
        h.b bVar = new h.b(null);
        HashMap map = bVar.f360157a;
        map.put('\"', "&quot;");
        map.put('\'', "&#39;");
        map.put('&', "&amp;");
        map.put('<', "&lt;");
        map.put('>', "&gt;");
        bVar.a();
    }
}
