package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.util.LruCache;

/* loaded from: classes2.dex */
public final class t4g extends LruCache {
    public final /* synthetic */ cie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4g(cie cieVar) {
        super(3);
        this.a = cieVar;
    }

    @Override // android.util.LruCache
    public final Object create(Object obj) {
        q4g q4gVar = (q4g) obj;
        t5g t5gVar = q4gVar.a;
        int i = q4gVar.b;
        TextPaint textPaint = new TextPaint(1);
        t5g.c(t5gVar, (Context) this.a.a, textPaint, null, t75.b, 4);
        textPaint.setColor(i);
        return textPaint;
    }
}
