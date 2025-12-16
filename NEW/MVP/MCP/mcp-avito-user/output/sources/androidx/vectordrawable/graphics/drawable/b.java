package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import j.X;

/* compiled from: Animatable2Compat.java */
/* loaded from: classes10.dex */
public interface b extends Animatable {

    /* compiled from: Animatable2Compat.java */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public Animatable2.AnimationCallback f54871a;

        /* compiled from: Animatable2Compat.java */
        /* renamed from: androidx.vectordrawable.graphics.drawable.b$a$a, reason: collision with other inner class name */
        public class C1932a extends Animatable2.AnimationCallback {
            public C1932a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationEnd(Drawable drawable) {
                a.this.b(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public final void onAnimationStart(Drawable drawable) {
                a.this.c(drawable);
            }
        }

        @X
        public final Animatable2.AnimationCallback a() {
            if (this.f54871a == null) {
                this.f54871a = new C1932a();
            }
            return this.f54871a;
        }

        public void b(Drawable drawable) {
        }

        public void c(Drawable drawable) {
        }
    }
}
