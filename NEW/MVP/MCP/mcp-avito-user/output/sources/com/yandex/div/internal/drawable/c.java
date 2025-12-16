package com.yandex.div.internal.drawable;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NinePatchDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yandex/div/internal/drawable/c;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public int f370107a;

    /* renamed from: b, reason: collision with root package name */
    public int f370108b;

    /* renamed from: c, reason: collision with root package name */
    public int f370109c;

    /* renamed from: d, reason: collision with root package name */
    public int f370110d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public NinePatch f370111e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Paint f370112f = new Paint(3);

    /* compiled from: NinePatchDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/drawable/c$a;", "", "<init>", "()V", "", "REGIONS_COLOR", "I", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        NinePatch ninePatch = this.f370111e;
        if (ninePatch == null) {
            return;
        }
        ninePatch.draw(canvas, new Rect(0, 0, getBounds().width(), getBounds().height()), this.f370112f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f370112f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f370112f.setAlpha(i12);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
