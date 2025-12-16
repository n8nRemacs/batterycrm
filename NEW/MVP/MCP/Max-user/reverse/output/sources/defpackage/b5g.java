package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b5g {
    public final Context a;
    public final Context b;
    public final v3b c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public b5g(Context context, lzf lzfVar, Context context2, v3b v3bVar) {
        this.a = context;
        this.b = context2;
        this.c = v3bVar;
        gw0.w(new g56(new z41((hbd) a93.s0.x(context2).Y, new d53(v3bVar.a, 8), new z4g(3, null), 3), new a5g(this, null), 1), d7j.a(((q2b) lzfVar).a()));
    }

    public final TextPaint a(t5g t5gVar) {
        return (TextPaint) this.d.computeIfAbsent(t5gVar, new ni(28, new a7c(t5gVar, 11, this)));
    }
}
