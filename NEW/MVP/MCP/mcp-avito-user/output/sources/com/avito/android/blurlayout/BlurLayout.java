package com.avito.android.blurlayout;

import Lj.ViewOnLayoutChangeListenerC14402a;
import Lj.b;
import X41.j;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.g;
import androidx.core.graphics.drawable.h;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.C22829k0;
import androidx.core.view.C22833m0;
import j.U;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BlurLayout.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0003\u0014\u0015\u0016B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\r\u001a\u0004\u0018\u00010\b8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/avito/android/blurlayout/BlurLayout;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "d", "Ljava/lang/Integer;", "getBlurRadius", "()Ljava/lang/Integer;", "blurRadius", "", "e", "F", "getTargetChildBackgroundCornerRadius", "()F", "targetChildBackgroundCornerRadius", "a", "b", "c", "blur-layout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class BlurLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f106790f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    public static p<? super Bitmap, ? super Integer, Bitmap> f106791g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f106792b;

    /* renamed from: c, reason: collision with root package name */
    public View f106793c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public final Integer blurRadius;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @U
    public final float targetChildBackgroundCornerRadius;

    /* compiled from: BlurLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blurlayout/BlurLayout$a;", "", "blur-layout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface a {
        /* renamed from: f */
        int getF178443n();
    }

    /* compiled from: BlurLayout.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RF\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/blurlayout/BlurLayout$b;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroid/graphics/Bitmap;", "Lkotlin/S;", "name", "bitmap", "", "blurRadius", "onApplyBlur", "LY41/p;", "blur-layout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BlurLayout.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blurlayout/BlurLayout$c;", "", "blur-layout_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface c {
        /* renamed from: a */
        float getF178442m();
    }

    /* compiled from: View.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "androidx/core/view/t0", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class d implements View.OnLayoutChangeListener {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@k View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            BitmapDrawable bitmapDrawable;
            boolean zF2;
            view.removeOnLayoutChangeListener(this);
            BlurLayout blurLayout = BlurLayout.this;
            Integer blurRadius = blurLayout.getBlurRadius();
            if (blurRadius == null) {
                throw new IllegalStateException("Blur radius must be specified explicitly or should be provided by child implementing BlurRadiusProvider");
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blurLayout.getWidth(), blurLayout.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Drawable background = blurLayout.getBackground();
            if (background != null) {
                background.setBounds(0, 0, blurLayout.getWidth(), blurLayout.getHeight());
                background.draw(canvas);
            }
            Iterator<View> it = new C22829k0(blurLayout).iterator();
            do {
                C22833m0 c22833m0 = (C22833m0) it;
                if (!c22833m0.hasNext()) {
                    break;
                }
                View view2 = (View) c22833m0.next();
                zF2 = L.f(view2, view);
                float left = view2.getLeft();
                float top = view2.getTop();
                int iSave = canvas.save();
                canvas.translate(left, top);
                if (zF2) {
                    Drawable background2 = view.getBackground();
                    if (background2 != null) {
                        background2.setBounds(0, 0, view.getWidth(), view.getHeight());
                        background2.draw(canvas);
                    }
                } else {
                    try {
                        view2.draw(canvas);
                    } catch (Throwable th2) {
                        canvas.restoreToCount(iSave);
                        throw th2;
                    }
                }
                canvas.restoreToCount(iSave);
            } while (!zF2);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
            bitmapCreateBitmap.recycle();
            p<? super Bitmap, ? super Integer, Bitmap> pVar = BlurLayout.f106791g;
            if (pVar == null) {
                pVar = null;
            }
            Bitmap bitmapInvoke = pVar.invoke(bitmapCreateBitmap2, blurRadius);
            bitmapCreateBitmap2.recycle();
            if (blurLayout.getTargetChildBackgroundCornerRadius() > 0.0f) {
                g gVarA = h.a(blurLayout.getContext().getResources(), bitmapInvoke);
                gVarA.b(blurLayout.getTargetChildBackgroundCornerRadius());
                bitmapDrawable = gVarA;
            } else {
                bitmapDrawable = new BitmapDrawable(blurLayout.getContext().getResources(), bitmapInvoke);
            }
            view.setBackground(bitmapDrawable);
        }
    }

    public /* synthetic */ BlurLayout(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer getBlurRadius() {
        View view = this.f106793c;
        if (view == null) {
            view = null;
        }
        a aVar = view instanceof a ? (a) view : null;
        return aVar != null ? Integer.valueOf(aVar.getF178443n()) : this.blurRadius;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getTargetChildBackgroundCornerRadius() {
        View view = this.f106793c;
        if (view == null) {
            view = null;
        }
        c cVar = view instanceof c ? (c) view : null;
        return cVar != null ? cVar.getF178442m() : this.targetChildBackgroundCornerRadius;
    }

    @Override // android.view.ViewGroup
    public final void addView(@k View view, int i12, @l ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i12, layoutParams);
        int id2 = view.getId();
        Integer num = this.f106792b;
        if (num != null && id2 == num.intValue()) {
            this.f106793c = view;
            c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        BitmapDrawable bitmapDrawable;
        boolean zF2;
        View view = this.f106793c;
        View view2 = view;
        if (view == null) {
            view2 = null;
        }
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!view2.isLaidOut() || view2.isLayoutRequested()) {
            view2.addOnLayoutChangeListener(new d());
            return;
        }
        Integer blurRadius = getBlurRadius();
        if (blurRadius == null) {
            throw new IllegalStateException("Blur radius must be specified explicitly or should be provided by child implementing BlurRadiusProvider");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.setBounds(0, 0, getWidth(), getHeight());
            background.draw(canvas);
        }
        Iterator<View> it = new C22829k0(this).iterator();
        do {
            C22833m0 c22833m0 = (C22833m0) it;
            if (!c22833m0.hasNext()) {
                break;
            }
            View view3 = (View) c22833m0.next();
            zF2 = L.f(view3, view2);
            float left = view3.getLeft();
            float top = view3.getTop();
            int iSave = canvas.save();
            canvas.translate(left, top);
            if (zF2) {
                Drawable background2 = view2.getBackground();
                if (background2 != null) {
                    background2.setBounds(0, 0, view2.getWidth(), view2.getHeight());
                    background2.draw(canvas);
                }
            } else {
                try {
                    view3.draw(canvas);
                } catch (Throwable th2) {
                    canvas.restoreToCount(iSave);
                    throw th2;
                }
            }
            canvas.restoreToCount(iSave);
        } while (!zF2);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, view2.getLeft(), view2.getTop(), view2.getWidth(), view2.getHeight());
        bitmapCreateBitmap.recycle();
        p<? super Bitmap, ? super Integer, Bitmap> pVar = f106791g;
        Bitmap bitmapInvoke = (pVar != null ? pVar : null).invoke(bitmapCreateBitmap2, blurRadius);
        bitmapCreateBitmap2.recycle();
        if (getTargetChildBackgroundCornerRadius() > 0.0f) {
            g gVarA = h.a(getContext().getResources(), bitmapInvoke);
            gVarA.b(getTargetChildBackgroundCornerRadius());
            bitmapDrawable = gVarA;
        } else {
            bitmapDrawable = new BitmapDrawable(getContext().getResources(), bitmapInvoke);
        }
        view2.setBackground(bitmapDrawable);
    }

    @j
    public BlurLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.C0629b.f10092a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        Object obj = null;
        this.f106792b = resourceId == 0 ? null : Integer.valueOf(resourceId);
        int i12 = typedArrayObtainStyledAttributes.getInt(0, -1);
        this.blurRadius = i12 == -1 ? null : Integer.valueOf(i12);
        this.targetChildBackgroundCornerRadius = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC14402a(this));
            return;
        }
        C22833m0 c22833m0 = (C22833m0) new C22829k0(this).iterator();
        if (c22833m0.hasNext()) {
            Object next = c22833m0.next();
            if (!c22833m0.hasNext()) {
                obj = next;
            }
        }
        View view = (View) obj;
        if (view == null || this.f106793c != null) {
            return;
        }
        this.f106793c = view;
        c();
    }
}
