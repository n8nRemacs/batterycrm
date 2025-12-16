package com.facebook.drawee.view;

import I41.h;
import IW0.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.facebook.common.internal.n;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.view.a;

/* compiled from: DraweeView.java */
/* loaded from: classes10.dex */
public class d<DH extends IW0.b> extends ImageView {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f340172g = false;

    /* renamed from: b, reason: collision with root package name */
    public final a.C10532a f340173b;

    /* renamed from: c, reason: collision with root package name */
    public float f340174c;

    /* renamed from: d, reason: collision with root package name */
    public b<DH> f340175d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f340176e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f340177f;

    public d(Context context) {
        super(context);
        this.f340173b = new a.C10532a();
        this.f340174c = 0.0f;
        this.f340176e = false;
        this.f340177f = false;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z12) {
        f340172g = z12;
    }

    public final void a(Context context) {
        try {
            com.facebook.imagepipeline.systrace.b.a();
            if (this.f340176e) {
                com.facebook.imagepipeline.systrace.b.a();
                return;
            }
            boolean z12 = true;
            this.f340176e = true;
            this.f340175d = new b<>();
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                com.facebook.imagepipeline.systrace.b.a();
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!f340172g || context.getApplicationInfo().targetSdkVersion < 24) {
                z12 = false;
            }
            this.f340177f = z12;
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th2) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th2;
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.f340177f || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public float getAspectRatio() {
        return this.f340174c;
    }

    @h
    public IW0.a getController() {
        return this.f340175d.f340170e;
    }

    public DH getHierarchy() {
        DH dh2 = this.f340175d.f340169d;
        dh2.getClass();
        return dh2;
    }

    @h
    public Drawable getTopLevelDrawable() {
        DH dh2 = this.f340175d.f340169d;
        if (dh2 == null) {
            return null;
        }
        return dh2.a();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        b<DH> bVar = this.f340175d;
        bVar.f340171f.a(DraweeEventTracker.Event.f339967p);
        bVar.f340167b = true;
        bVar.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        b<DH> bVar = this.f340175d;
        bVar.f340171f.a(DraweeEventTracker.Event.f339968q);
        bVar.f340167b = false;
        bVar.b();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        b<DH> bVar = this.f340175d;
        bVar.f340171f.a(DraweeEventTracker.Event.f339967p);
        bVar.f340167b = true;
        bVar.b();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i12, int i13) {
        a.C10532a c10532a = this.f340173b;
        c10532a.f340164a = i12;
        c10532a.f340165b = i13;
        float f12 = this.f340174c;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (f12 > 0.0f && layoutParams != null) {
            int i14 = layoutParams.height;
            if (i14 == 0 || i14 == -2) {
                c10532a.f340165b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c10532a.f340164a) - paddingRight) / f12) + paddingBottom), c10532a.f340165b), 1073741824);
            } else {
                int i15 = layoutParams.width;
                if (i15 == 0 || i15 == -2) {
                    c10532a.f340164a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c10532a.f340165b) - paddingBottom) * f12) + paddingRight), c10532a.f340164a), 1073741824);
                }
            }
        }
        super.onMeasure(c10532a.f340164a, c10532a.f340165b);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        b<DH> bVar = this.f340175d;
        bVar.f340171f.a(DraweeEventTracker.Event.f339968q);
        bVar.f340167b = false;
        bVar.b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        b<DH> bVar = this.f340175d;
        if (!bVar.c() ? false : bVar.f340170e.g2(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i12) {
        super.onVisibilityChanged(view, i12);
        b();
    }

    public void setAspectRatio(float f12) {
        if (f12 == this.f340174c) {
            return;
        }
        this.f340174c = f12;
        requestLayout();
    }

    public void setController(@h IW0.a aVar) {
        this.f340175d.e(aVar);
        DH dh2 = this.f340175d.f340169d;
        super.setImageDrawable(dh2 == null ? null : dh2.a());
    }

    public void setHierarchy(DH dh2) {
        b<DH> bVar = this.f340175d;
        bVar.f340171f.a(DraweeEventTracker.Event.f339953b);
        boolean zC2 = bVar.c();
        DH dh3 = bVar.f340169d;
        GW0.d dVarA = dh3 == null ? null : dh3.a();
        if (dVarA != null) {
            dVarA.o(null);
        }
        dh2.getClass();
        bVar.f340169d = dh2;
        GW0.d dVarA2 = dh2.a();
        bVar.d(dVarA2 == null || dVarA2.isVisible());
        DH dh4 = bVar.f340169d;
        GW0.d dVarA3 = dh4 != null ? dh4.a() : null;
        if (dVarA3 != null) {
            dVarA3.o(bVar);
        }
        if (zC2) {
            bVar.f340170e.i2(dh2);
        }
        DH dh5 = this.f340175d.f340169d;
        super.setImageDrawable(dh5 == null ? null : dh5.a());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.f340175d.e(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(@h Drawable drawable) {
        a(getContext());
        this.f340175d.e(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i12) {
        a(getContext());
        this.f340175d.e(null);
        super.setImageResource(i12);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.f340175d.e(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z12) {
        this.f340177f = z12;
    }

    @Override // android.view.View
    public final String toString() {
        n.b bVarB = n.b(this);
        b<DH> bVar = this.f340175d;
        bVarB.b(bVar != null ? bVar.toString() : "<no holder set>", "holder");
        return bVarB.toString();
    }

    public d(Context context, @h AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f340173b = new a.C10532a();
        this.f340174c = 0.0f;
        this.f340176e = false;
        this.f340177f = false;
        a(context);
    }

    public d(Context context, int i12) {
        super(context, null, R.style.Widget_Avito_Rds_SimpleDraweeView);
        this.f340173b = new a.C10532a();
        this.f340174c = 0.0f;
        this.f340176e = false;
        this.f340177f = false;
        a(context);
    }

    @TargetApi(21)
    public d(Context context, AttributeSet attributeSet, int i12, int i13) {
        super(context, attributeSet, i12, i13);
        this.f340173b = new a.C10532a();
        this.f340174c = 0.0f;
        this.f340176e = false;
        this.f340177f = false;
        a(context);
    }
}
