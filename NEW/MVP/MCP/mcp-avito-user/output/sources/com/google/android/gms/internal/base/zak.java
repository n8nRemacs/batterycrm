package com.google.android.gms.internal.base;

import aZ0.InterfaceC19845a;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import j.P;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class zak extends Drawable implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public int f350201b;

    /* renamed from: c, reason: collision with root package name */
    public long f350202c;

    /* renamed from: d, reason: collision with root package name */
    public int f350203d;

    /* renamed from: e, reason: collision with root package name */
    public int f350204e;

    /* renamed from: f, reason: collision with root package name */
    public int f350205f;

    /* renamed from: g, reason: collision with root package name */
    public int f350206g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f350207h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350208i;

    /* renamed from: j, reason: collision with root package name */
    public final zaj f350209j;

    /* renamed from: k, reason: collision with root package name */
    public final Drawable f350210k;

    /* renamed from: l, reason: collision with root package name */
    public final Drawable f350211l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f350212m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f350213n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f350214o;

    /* renamed from: p, reason: collision with root package name */
    public int f350215p;

    public zak(@P Drawable drawable, @P Drawable drawable2) {
        this(null);
        drawable = drawable == null ? zai.f350197a : drawable;
        this.f350210k = drawable;
        drawable.setCallback(this);
        zaj zajVar = this.f350209j;
        zajVar.f350200b = drawable.getChangingConfigurations() | zajVar.f350200b;
        drawable2 = drawable2 == null ? zai.f350197a : drawable2;
        this.f350211l = drawable2;
        drawable2.setCallback(this);
        zaj zajVar2 = this.f350209j;
        zajVar2.f350200b = drawable2.getChangingConfigurations() | zajVar2.f350200b;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f350201b
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3a
            if (r0 == r1) goto Lb
        L9:
            r4 = r3
            goto L43
        Lb:
            long r0 = r7.f350202c
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f350202c
            long r0 = r0 - r4
            int r4 = r7.f350205f
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r2
        L28:
            if (r4 == 0) goto L2c
            r7.f350201b = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f350203d
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f350206g = r0
            goto L43
        L3a:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.f350202c = r4
            r7.f350201b = r1
            r4 = r2
        L43:
            int r0 = r7.f350206g
            boolean r1 = r7.f350207h
            android.graphics.drawable.Drawable r5 = r7.f350210k
            android.graphics.drawable.Drawable r6 = r7.f350211l
            if (r4 == 0) goto L62
            if (r1 == 0) goto L52
            if (r0 != 0) goto L57
            goto L53
        L52:
            r2 = r0
        L53:
            r5.draw(r8)
            r0 = r2
        L57:
            int r1 = r7.f350204e
            if (r0 != r1) goto L61
            r6.setAlpha(r1)
            r6.draw(r8)
        L61:
            return
        L62:
            if (r1 == 0) goto L6b
            int r1 = r7.f350204e
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = r3
        L6b:
            r5.draw(r8)
            if (r2 == 0) goto L75
            int r1 = r7.f350204e
            r5.setAlpha(r1)
        L75:
            if (r0 <= 0) goto L82
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.f350204e
            r6.setAlpha(r8)
        L82:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        zaj zajVar = this.f350209j;
        return changingConfigurations | zajVar.f350199a | zajVar.f350200b;
    }

    @Override // android.graphics.drawable.Drawable
    @P
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        zaj zajVar = this.f350209j;
        zajVar.f350199a = changingConfigurations;
        return zajVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f350210k.getIntrinsicHeight(), this.f350211l.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f350210k.getIntrinsicWidth(), this.f350211l.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f350214o) {
            this.f350215p = Drawable.resolveOpacity(this.f350210k.getOpacity(), this.f350211l.getOpacity());
            this.f350214o = true;
        }
        return this.f350215p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC19845a
    public final Drawable mutate() {
        if (!this.f350208i && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f350210k.mutate();
            this.f350211l.mutate();
            this.f350208i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f350210k.setBounds(rect);
        this.f350211l.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j12) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (this.f350206g == this.f350204e) {
            this.f350206g = i12;
        }
        this.f350204e = i12;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@P ColorFilter colorFilter) {
        this.f350210k.setColorFilter(colorFilter);
        this.f350211l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.f350211l;
    }

    public final void zab(int i12) {
        this.f350203d = this.f350204e;
        this.f350206g = 0;
        this.f350205f = 250;
        this.f350201b = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f350212m) {
            boolean z12 = false;
            if (this.f350210k.getConstantState() != null && this.f350211l.getConstantState() != null) {
                z12 = true;
            }
            this.f350213n = z12;
            this.f350212m = true;
        }
        return this.f350213n;
    }

    public zak(@P zaj zajVar) {
        this.f350201b = 0;
        this.f350204e = 255;
        this.f350206g = 0;
        this.f350207h = true;
        zaj zajVar2 = new zaj();
        if (zajVar != null) {
            zajVar2.f350199a = zajVar.f350199a;
            zajVar2.f350200b = zajVar.f350200b;
        }
        this.f350209j = zajVar2;
    }
}
