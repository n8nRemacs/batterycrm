package com.avito.android.brandspace.view;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: BrandspaceToolbar.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/brandspace/view/BrandspaceToolbar;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_brandspace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BrandspaceToolbar extends Toolbar {

    /* renamed from: V, reason: collision with root package name */
    @k
    public final Paint f107783V;

    /* renamed from: W, reason: collision with root package name */
    public final float f107784W;

    public BrandspaceToolbar(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        paint.setColor(C35835l0.d(R.attr.gray12, getContext()));
        paint.setStyle(Paint.Style.FILL);
        this.f107783V = paint;
        this.f107784W = y6.b(1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@k Canvas canvas) {
        float height = getHeight();
        canvas.drawRect(new RectF(0.0f, height - this.f107784W, getWidth(), height), this.f107783V);
        super.dispatchDraw(canvas);
    }
}
