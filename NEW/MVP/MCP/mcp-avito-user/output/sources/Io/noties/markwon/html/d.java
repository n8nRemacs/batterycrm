package io.noties.markwon.html;

import j.N;
import j.P;

/* compiled from: HtmlEmptyTagReplacement.java */
/* loaded from: classes8.dex */
public class d {
    @P
    public static String a(@N f fVar) {
        String str = ((g) fVar).f401739a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = fVar.b().get("alt");
            return (str2 == null || str2.length() == 0) ? "￼" : str2;
        }
        if ("iframe".equals(str)) {
            return " ";
        }
        return null;
    }
}
