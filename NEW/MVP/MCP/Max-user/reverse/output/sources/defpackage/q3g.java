package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class q3g extends f8j {
    public final /* synthetic */ h2f a;
    public final /* synthetic */ s3g b;

    public q3g(s3g s3gVar, h2f h2fVar) {
        this.b = s3gVar;
        this.a = h2fVar;
    }

    @Override // defpackage.f8j
    public final void b(int i) {
        this.b.m = true;
        this.a.c(i);
    }

    @Override // defpackage.f8j
    public final void c(Typeface typeface) {
        s3g s3gVar = this.b;
        s3gVar.n = Typeface.create(typeface, s3gVar.c);
        s3gVar.m = true;
        this.a.d(s3gVar.n, false);
    }
}
