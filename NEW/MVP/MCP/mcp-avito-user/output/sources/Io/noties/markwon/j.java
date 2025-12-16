package io.noties.markwon;

import io.noties.markwon.core.q;
import io.noties.markwon.g;
import io.noties.markwon.l;
import io.noties.markwon.n;
import j.N;
import org.commonmark.parser.d;

/* compiled from: MarkwonPlugin.java */
/* loaded from: classes8.dex */
public interface j {

    /* compiled from: MarkwonPlugin.java */
    public interface a<P extends j> {
        void a(@N P p12);
    }

    /* compiled from: MarkwonPlugin.java */
    public interface b {
        @N
        j a();

        <P extends j> void b(@N Class<P> cls, @N a<? super P> aVar);
    }

    void afterRender(@N Q61.v vVar, @N n nVar);

    void beforeRender(@N Q61.v vVar);

    void configure(@N b bVar);

    void configureConfiguration(@N g.b bVar);

    void configureParser(@N d.b bVar);

    void configureSpansFactory(@N l.a aVar);

    void configureTheme(@N q.a aVar);

    void configureVisitor(@N n.b bVar);

    @N
    String processMarkdown(@N String str);
}
