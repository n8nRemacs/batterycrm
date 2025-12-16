package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.collection.C20199a;
import androidx.vectordrawable.graphics.drawable.b;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.X;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes10.dex */
public class c extends h implements androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f54873h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final C1933c f54874c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f54875d;

    /* renamed from: e, reason: collision with root package name */
    public Animator.AnimatorListener f54876e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList<b.a> f54877f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable.Callback f54878g;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j12) {
            c.this.scheduleSelf(runnable, j12);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            c cVar = c.this;
            ArrayList arrayList = new ArrayList(cVar.f54877f);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((b.a) arrayList.get(i12)).b(cVar);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            c cVar = c.this;
            ArrayList arrayList = new ArrayList(cVar.f54877f);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((b.a) arrayList.get(i12)).c(cVar);
            }
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    public static class C1933c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public i f54881a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f54882b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Animator> f54883c;

        /* renamed from: d, reason: collision with root package name */
        public C20199a<Animator, String> f54884d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null);
    }

    @P
    public static c a(@InterfaceC42165v int i12, @N Context context) throws Resources.NotFoundException {
        c cVar = new c(context);
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        Drawable drawable = resources.getDrawable(i12, theme);
        cVar.f54887b = drawable;
        drawable.setCallback(cVar.f54878g);
        new d(cVar.f54887b.getConstantState());
        return cVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final void b(@N b.a aVar) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(aVar.a());
            return;
        }
        if (aVar == null) {
            return;
        }
        if (this.f54877f == null) {
            this.f54877f = new ArrayList<>();
        }
        if (this.f54877f.contains(aVar)) {
            return;
        }
        this.f54877f.add(aVar);
        if (this.f54876e == null) {
            this.f54876e = new b();
        }
        this.f54874c.f54882b.addListener(this.f54876e);
    }

    public final boolean c(@N b.a aVar) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(aVar.a());
        }
        ArrayList<b.a> arrayList = this.f54877f;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(aVar);
        if (this.f54877f.size() == 0 && (animatorListener = this.f54876e) != null) {
            this.f54874c.f54882b.removeListener(animatorListener);
            this.f54876e = null;
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1933c c1933c = this.f54874c;
        c1933c.f54881a.draw(canvas);
        if (c1933c.f54882b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getAlpha() : this.f54874c.f54881a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f54874c.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getColorFilter() : this.f54874c.f54881a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f54887b != null) {
            return new d(this.f54887b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f54874c.f54881a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f54874c.f54881a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.getOpacity() : this.f54874c.f54881a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        if (r3.f54882b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cd, code lost:
    
        r3.f54882b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d4, code lost:
    
        r3.f54882b.playTogether(r3.f54883c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.f54887b
            if (r0 == 0) goto L8
            r0.inflate(r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            androidx.vectordrawable.graphics.drawable.c$c r3 = r8.f54874c
            if (r0 == r2) goto Lc9
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lc9
        L1f:
            r4 = 2
            if (r0 != r4) goto Lc3
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L68
            int[] r0 = androidx.vectordrawable.graphics.drawable.a.f54869e
            android.content.res.TypedArray r0 = androidx.core.content.res.l.e(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L64
            androidx.vectordrawable.graphics.drawable.i r6 = new androidx.vectordrawable.graphics.drawable.i
            r6.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r7 = androidx.core.content.res.i.f44673a
            android.graphics.drawable.Drawable r4 = r9.getDrawable(r4, r12)
            r6.f54887b = r4
            androidx.vectordrawable.graphics.drawable.i$i r4 = new androidx.vectordrawable.graphics.drawable.i$i
            android.graphics.drawable.Drawable r7 = r6.f54887b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r4.<init>(r7)
            r6.f54893g = r5
            android.graphics.drawable.Drawable$Callback r4 = r8.f54878g
            r6.setCallback(r4)
            androidx.vectordrawable.graphics.drawable.i r4 = r3.f54881a
            if (r4 == 0) goto L62
            r5 = 0
            r4.setCallback(r5)
        L62:
            r3.f54881a = r6
        L64:
            r0.recycle()
            goto Lc3
        L68:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lc3
            int[] r0 = androidx.vectordrawable.graphics.drawable.a.f54870f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r5 = r0.getResourceId(r2, r5)
            if (r5 == 0) goto Lc0
            android.content.Context r6 = r8.f54875d
            if (r6 == 0) goto Lb5
            android.animation.Animator r5 = android.animation.AnimatorInflater.loadAnimator(r6, r5)
            androidx.vectordrawable.graphics.drawable.i r6 = r3.f54881a
            androidx.vectordrawable.graphics.drawable.i$h r6 = r6.f54889c
            androidx.vectordrawable.graphics.drawable.i$g r6 = r6.f54939b
            androidx.collection.a<java.lang.String, java.lang.Object> r6 = r6.f54937o
            java.lang.Object r6 = r6.get(r4)
            r5.setTarget(r6)
            java.util.ArrayList<android.animation.Animator> r6 = r3.f54883c
            if (r6 != 0) goto Laa
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.f54883c = r6
            androidx.collection.a r6 = new androidx.collection.a
            r6.<init>()
            r3.f54884d = r6
        Laa:
            java.util.ArrayList<android.animation.Animator> r6 = r3.f54883c
            r6.add(r5)
            androidx.collection.a<android.animation.Animator, java.lang.String> r3 = r3.f54884d
            r3.put(r5, r4)
            goto Lc0
        Lb5:
            r0.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Context can't be null when inflating animators"
            r9.<init>(r10)
            throw r9
        Lc0:
            r0.recycle()
        Lc3:
            int r0 = r10.next()
            goto L12
        Lc9:
            android.animation.AnimatorSet r9 = r3.f54882b
            if (r9 != 0) goto Ld4
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r3.f54882b = r9
        Ld4:
            android.animation.AnimatorSet r9 = r3.f54882b
            java.util.ArrayList<android.animation.Animator> r10 = r3.f54883c
            r9.playTogether(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.c.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.isAutoMirrored() : this.f54874c.f54881a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f54887b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f54874c.f54882b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.isStateful() : this.f54874c.f54881a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f54874c.f54881a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.setLevel(i12) : this.f54874c.f54881a.setLevel(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f54887b;
        return drawable != null ? drawable.setState(iArr) : this.f54874c.f54881a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setAlpha(i12);
        } else {
            this.f54874c.f54881a.setAlpha(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setAutoMirrored(z12);
        } else {
            this.f54874c.f54881a.setAutoMirrored(z12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f54874c.f54881a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i12) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.a(drawable, i12);
        } else {
            this.f54874c.f54881a.setTint(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.b(drawable, colorStateList);
        } else {
            this.f54874c.f54881a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            androidx.core.graphics.drawable.c.c(drawable, mode);
        } else {
            this.f54874c.f54881a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            return drawable.setVisible(z12, z13);
        }
        this.f54874c.f54881a.setVisible(z12, z13);
        return super.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1933c c1933c = this.f54874c;
        if (c1933c.f54882b.isStarted()) {
            return;
        }
        c1933c.f54882b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f54887b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f54874c.f54882b.end();
        }
    }

    public c(@P Context context) {
        this.f54876e = null;
        this.f54877f = null;
        this.f54878g = new a();
        this.f54875d = context;
        this.f54874c = new C1933c();
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    @X
    public static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f54885a;

        public d(Drawable.ConstantState constantState) {
            this.f54885a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f54885a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f54885a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f54885a.newDrawable();
            cVar.f54887b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f54878g);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f54885a.newDrawable(resources);
            cVar.f54887b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f54878g);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f54885a.newDrawable(resources, theme);
            cVar.f54887b = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f54878g);
            return cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
