package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class r3g extends h2f {
    public final /* synthetic */ Context c;
    public final /* synthetic */ TextPaint d;
    public final /* synthetic */ h2f e;
    public final /* synthetic */ s3g f;

    public r3g(s3g s3gVar, Context context, TextPaint textPaint, h2f h2fVar) {
        this.f = s3gVar;
        this.c = context;
        this.d = textPaint;
        this.e = h2fVar;
    }

    @Override // defpackage.h2f
    public final void c(int i) {
        this.e.c(i);
    }

    @Override // defpackage.h2f
    public final void d(Typeface typeface, boolean z) {
        this.f.g(this.c, this.d, typeface);
        this.e.d(typeface, z);
    }
}
