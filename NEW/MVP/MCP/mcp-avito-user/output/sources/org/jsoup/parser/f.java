package org.jsoup.parser;

import a71.C19692b;

/* compiled from: ParseSettings.java */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: c, reason: collision with root package name */
    public static final f f421221c = new f(false, false);

    /* renamed from: d, reason: collision with root package name */
    public static final f f421222d = new f(true, true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f421223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f421224b;

    public f(boolean z12, boolean z13) {
        this.f421223a = z12;
        this.f421224b = z13;
    }

    public final void a(org.jsoup.nodes.b bVar) {
        if (bVar == null || this.f421224b) {
            return;
        }
        for (int i12 = 0; i12 < bVar.f421074b; i12++) {
            String[] strArr = bVar.f421075c;
            strArr[i12] = C19692b.a(strArr[i12]);
        }
    }

    public final String b(String str) {
        String strTrim = str.trim();
        return !this.f421223a ? C19692b.a(strTrim) : strTrim;
    }
}
