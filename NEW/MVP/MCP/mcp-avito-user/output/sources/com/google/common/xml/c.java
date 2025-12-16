package com.google.common.xml;

import com.google.common.escape.h;
import java.util.HashMap;

/* compiled from: XmlEscapers.java */
@a
@XY0.b
/* loaded from: classes6.dex */
public class c {
    static {
        int i12 = h.f360156a;
        h.b bVar = new h.b(null);
        bVar.f360158b = (char) 65533;
        bVar.f360159c = "�";
        char c12 = 0;
        while (true) {
            HashMap map = bVar.f360157a;
            if (c12 > 31) {
                map.put('&', "&amp;");
                map.put('<', "&lt;");
                map.put('>', "&gt;");
                bVar.a();
                map.put('\'', "&apos;");
                map.put('\"', "&quot;");
                bVar.a();
                map.put('\t', "&#x9;");
                map.put('\n', "&#xA;");
                map.put('\r', "&#xD;");
                bVar.a();
                return;
            }
            if (c12 != '\t' && c12 != '\n' && c12 != '\r') {
                map.put(Character.valueOf(c12), "�");
            }
            c12 = (char) (c12 + 1);
        }
    }
}
