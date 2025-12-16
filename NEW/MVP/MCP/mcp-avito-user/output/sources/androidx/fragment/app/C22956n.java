package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import j.InterfaceC42145a;

/* compiled from: FragmentAnim.java */
/* renamed from: androidx.fragment.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C22956n {
    @InterfaceC42145a
    public static int a(int i12, @j.N Context context) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i12});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.n$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f46574a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f46575b;

        public a(Animation animation) {
            this.f46574a = animation;
            this.f46575b = null;
        }

        public a(Animator animator) {
            this.f46574a = null;
            this.f46575b = animator;
        }
    }

    /* compiled from: FragmentAnim.java */
    /* renamed from: androidx.fragment.app.n$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f46576b;

        /* renamed from: c, reason: collision with root package name */
        public final View f46577c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46578d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f46579e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f46580f;

        public b(@j.N Animation animation, @j.N ViewGroup viewGroup, @j.N View view) {
            super(false);
            this.f46580f = true;
            this.f46576b = viewGroup;
            this.f46577c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j12, @j.N Transformation transformation) {
            this.f46580f = true;
            if (this.f46578d) {
                return !this.f46579e;
            }
            if (!super.getTransformation(j12, transformation)) {
                this.f46578d = true;
                androidx.core.view.P.b(this.f46576b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z12 = this.f46578d;
            ViewGroup viewGroup = this.f46576b;
            if (z12 || !this.f46580f) {
                viewGroup.endViewTransition(this.f46577c);
                this.f46579e = true;
            } else {
                this.f46580f = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j12, @j.N Transformation transformation, float f12) {
            this.f46580f = true;
            if (this.f46578d) {
                return !this.f46579e;
            }
            if (!super.getTransformation(j12, transformation, f12)) {
                this.f46578d = true;
                androidx.core.view.P.b(this.f46576b, this);
            }
            return true;
        }
    }
}
