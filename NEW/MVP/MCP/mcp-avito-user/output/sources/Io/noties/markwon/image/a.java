package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.r;
import j.F;
import j.N;
import j.P;

/* compiled from: AsyncDrawable.java */
/* loaded from: classes8.dex */
public class a extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final String f401902a;

    /* renamed from: b, reason: collision with root package name */
    public final i f401903b;

    /* renamed from: c, reason: collision with root package name */
    public final k f401904c;

    /* renamed from: d, reason: collision with root package name */
    public int f401905d;

    /* renamed from: e, reason: collision with root package name */
    public float f401906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f401907f;

    /* compiled from: AsyncDrawable.java */
    /* renamed from: io.noties.markwon.image.a$a, reason: collision with other inner class name */
    public class C11435a implements Drawable.Callback {
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@N Drawable drawable) {
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@N Drawable drawable, @N Runnable runnable, long j12) {
            throw null;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@N Drawable drawable, @N Runnable runnable) {
            throw null;
        }
    }

    public a(@N String str, @N b bVar, @N k kVar, @P i iVar) {
        this.f401902a = str;
        this.f401904c = kVar;
        this.f401903b = iVar;
        bVar.getClass();
    }

    public final boolean a() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@N Canvas canvas) {
        if (a()) {
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (a()) {
            throw null;
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (a()) {
            throw null;
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (a()) {
            throw null;
        }
        return -2;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AsyncDrawable{destination='");
        sb2.append(this.f401902a);
        sb2.append("', imageSize=");
        sb2.append(this.f401903b);
        sb2.append(", result=");
        sb2.append((Object) null);
        sb2.append(", canvasWidth=");
        sb2.append(this.f401905d);
        sb2.append(", textSize=");
        sb2.append(this.f401906e);
        sb2.append(", waitingForDimensions=");
        return r.x(sb2, this.f401907f, '}');
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@F int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
    }
}
