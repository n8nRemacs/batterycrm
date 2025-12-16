package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.avito.android.R;
import com.avito.android.util.C35767c4;
import com.yandex.div.internal.widget.AspectImageView;
import j.InterfaceC42153i;
import java.util.concurrent.Future;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import y21.C50044a;

/* compiled from: LoadableImageView.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\t\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0011\u0010\bJ\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\u0013\u0010\fJ\u001f\u0010\u0016\u001a\u00020\u00062\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\fR$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010-\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R.\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\b¨\u00065"}, d2 = {"Lcom/yandex/div/core/widget/B;", "Lcom/yandex/div/internal/widget/AspectImageView;", "Lcom/yandex/div/core/view2/divs/widgets/A;", "Lcom/yandex/div/core/widget/h;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/G0;", "setPlaceholder", "(Landroid/graphics/drawable/Drawable;)V", "setPreview", "Landroid/graphics/Bitmap;", "bitmap", "(Landroid/graphics/Bitmap;)V", "setImage", "Ljava/util/concurrent/Future;", "getLoadingTask", "()Ljava/util/concurrent/Future;", "setImageDrawable", "bm", "setImageBitmap", "Lkotlin/Function0;", "callback", "setImageChangeCallback", "(LY41/a;)V", "h", "Landroid/graphics/Bitmap;", "getCurrentBitmapWithoutFilters$div_release", "()Landroid/graphics/Bitmap;", "setCurrentBitmapWithoutFilters$div_release", "currentBitmapWithoutFilters", "Lv21/e;", "i", "Lv21/e;", "getLoadReference$div_release", "()Lv21/e;", "setLoadReference$div_release", "(Lv21/e;)V", "loadReference", "Lcom/yandex/div/core/widget/i;", "k", "Lcom/yandex/div/core/widget/i;", "getDelegate", "()Lcom/yandex/div/core/widget/i;", "setDelegate", "(Lcom/yandex/div/core/widget/i;)V", "delegate", "value", "l", "Landroid/graphics/drawable/Drawable;", "getExternalImage", "()Landroid/graphics/drawable/Drawable;", "setExternalImage", "externalImage", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class B extends AspectImageView implements com.yandex.div.core.view2.divs.widgets.A, h {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Bitmap currentBitmapWithoutFilters;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public v21.e loadReference;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f369237j;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public i delegate;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Drawable externalImage;

    public B(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.A
    public final void b() {
        setTag(R.id.bitmap_load_references_tag, null);
    }

    @Override // android.view.View
    public final void buildDrawingCache(boolean z12) {
        i delegate = getDelegate();
        if (delegate != null) {
            delegate.d();
        }
        super.buildDrawingCache(z12);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.A
    public final void d(@Y61.k Future<?> future) {
        setTag(R.id.bitmap_load_references_tag, future);
    }

    @Y61.l
    /* renamed from: getCurrentBitmapWithoutFilters$div_release, reason: from getter */
    public final Bitmap getCurrentBitmapWithoutFilters() {
        return this.currentBitmapWithoutFilters;
    }

    @Y61.l
    public i getDelegate() {
        return this.delegate;
    }

    @Y61.l
    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    @Y61.l
    /* renamed from: getLoadReference$div_release, reason: from getter */
    public final v21.e getLoadReference() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.A
    @Y61.l
    public Future<?> getLoadingTask() {
        Object tag = getTag(R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@Y61.k Drawable drawable) {
        Drawable drawableA;
        i delegate = getDelegate();
        if (delegate != null && (drawableA = delegate.a()) != null) {
            drawable = drawableA;
        }
        super.invalidateDrawable(drawable);
    }

    public final boolean l() {
        return L.f(getTag(R.id.image_loaded_flag), Boolean.TRUE);
    }

    public final Drawable m(Drawable drawable) {
        if (!n()) {
            return drawable;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return (Build.VERSION.SDK_INT < 28 || !C35767c4.w(drawable)) ? drawable : new C50044a(drawable, getContext().getResources().getDisplayMetrics().density);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            bitmap.setDensity(160);
        }
        bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        return drawable;
    }

    public final boolean n() {
        return (getLayoutParams().width == -2 && getLayoutParams().height == -2) || getImageScale() == AspectImageView.Scale.f370232b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@Y61.k View view, int i12) {
        i delegate = getDelegate();
        if (delegate == null || delegate.b()) {
            return;
        }
        super.onVisibilityChanged(view, i12);
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Y61.l Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public void setDelegate(@Y61.l i iVar) {
        this.delegate = iVar;
    }

    public final void setExternalImage(@Y61.l Drawable drawable) {
        this.externalImage = drawable == null ? null : m(drawable);
        invalidate();
    }

    public void setImage(@Y61.l Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @InterfaceC42153i
    public void setImageBitmap(@Y61.l Bitmap bm) {
        if (this.externalImage == null) {
            if (n() && bm != null) {
                bm.setDensity(160);
            }
            super.setImageBitmap(bm);
            Y41.a<G0> aVar = this.f369237j;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        Drawable drawable = getDrawable();
        Drawable drawable2 = this.externalImage;
        if (drawable != drawable2) {
            super.setImageDrawable(drawable2);
        }
        Y41.a<G0> aVar2 = this.f369237j;
        if (aVar2 == null) {
            return;
        }
        aVar2.invoke();
    }

    public final void setImageChangeCallback(@Y61.l Y41.a<G0> callback) {
        this.f369237j = callback;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @InterfaceC42153i
    public void setImageDrawable(@Y61.l Drawable drawable) {
        if (this.externalImage == null) {
            super.setImageDrawable(drawable == null ? null : m(drawable));
            Y41.a<G0> aVar = this.f369237j;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        Y41.a<G0> aVar2 = this.f369237j;
        if (aVar2 == null) {
            return;
        }
        aVar2.invoke();
    }

    public final void setLoadReference$div_release(@Y61.l v21.e eVar) {
        this.loadReference = eVar;
    }

    public void setPlaceholder(@Y61.l Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(@Y61.l Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(@Y61.l Drawable drawable) {
        i delegate = getDelegate();
        if (delegate != null) {
            delegate.c();
        }
        super.unscheduleDrawable(drawable);
    }

    public void setImage(@Y61.l Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(@Y61.l Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
