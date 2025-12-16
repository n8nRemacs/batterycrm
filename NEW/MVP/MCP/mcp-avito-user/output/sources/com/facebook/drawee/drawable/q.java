package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: RoundedNinePatchDrawable.java */
@Nullsafe
/* loaded from: classes10.dex */
public class q extends p {
    @Override // com.facebook.drawee.drawable.p, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        com.facebook.imagepipeline.systrace.b.a();
        if (!this.f340100c && !this.f340101d && this.f340102e <= 0.0f) {
            super.draw(canvas);
            com.facebook.imagepipeline.systrace.b.a();
            return;
        }
        f();
        a();
        canvas.clipPath(this.f340103f);
        super.draw(canvas);
        com.facebook.imagepipeline.systrace.b.a();
    }
}
