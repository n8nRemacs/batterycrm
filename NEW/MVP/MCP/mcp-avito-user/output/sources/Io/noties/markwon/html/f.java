package io.noties.markwon.html;

import j.N;
import j.P;
import java.util.List;
import java.util.Map;

/* compiled from: HtmlTag.java */
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: HtmlTag.java */
    public interface a extends f {
        @P
        a c();

        @N
        List<a> e();
    }

    /* compiled from: HtmlTag.java */
    public interface b extends f {
    }

    @N
    a a();

    @N
    Map<String, String> b();

    boolean d();

    int f();

    boolean isClosed();

    @N
    String name();

    int start();
}
