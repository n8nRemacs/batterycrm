package com.avito.android.lib.deprecated_design.circular_progress;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.PowerManager;
import android.view.animation.LinearInterpolator;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CircularProgressDrawable.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Animatable;", "a", "b", "c", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends Drawable implements Animatable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PowerManager f177880b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f177881c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RectF f177882d = new RectF();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Paint f177883e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f177884f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f177885g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.deprecated_design.circular_progress.c f177886h;

    /* compiled from: CircularProgressDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/a$b;", "", "<init>", "()V", "", "STYLE_NORMAL", "I", "STYLE_ROUNDED", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CircularProgressDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/a$c;", "", "<init>", "()V", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @P41.c
    public @interface c {
    }

    static {
        new b(null);
    }

    public a(PowerManager powerManager, n nVar, C42822w c42822w) {
        this.f177880b = powerManager;
        this.f177881c = nVar;
        Paint paint = new Paint();
        this.f177883e = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(nVar.f177926c);
        paint.setStrokeCap(nVar.f177932i == 1 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        paint.setColor(nVar.f177927d[0]);
        a();
    }

    public final void a() {
        boolean zIsPowerSaveMode;
        try {
            zIsPowerSaveMode = this.f177880b.isPowerSaveMode();
        } catch (Exception unused) {
            zIsPowerSaveMode = false;
        }
        if (zIsPowerSaveMode) {
            com.avito.android.lib.deprecated_design.circular_progress.c cVar = this.f177886h;
            if (cVar == null || !(cVar instanceof o)) {
                if (cVar != null) {
                    cVar.stop();
                }
                this.f177886h = new o(this);
                return;
            }
            return;
        }
        com.avito.android.lib.deprecated_design.circular_progress.c cVar2 = this.f177886h;
        if (cVar2 == null || (cVar2 instanceof o)) {
            if (cVar2 != null) {
                cVar2.stop();
            }
            this.f177886h = new i(this, this.f177881c);
        }
    }

    public final void b() {
        if (getCallback() == null) {
            stop();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@Y61.k Canvas canvas) {
        com.avito.android.lib.deprecated_design.circular_progress.c cVar;
        if (!this.f177885g || (cVar = this.f177886h) == null) {
            return;
        }
        cVar.a(canvas, this.f177883e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Integer num = this.f177884f;
        return num != null ? num.intValue() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Integer num = this.f177884f;
        return num != null ? num.intValue() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f177885g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@Y61.k Rect rect) {
        super.onBoundsChange(rect);
        float f12 = this.f177881c.f177926c;
        RectF rectF = this.f177882d;
        float f13 = f12 / 2.0f;
        rectF.left = rect.left + f13 + 0.5f;
        rectF.right = (rect.right - f13) - 0.5f;
        rectF.top = rect.top + f13 + 0.5f;
        rectF.bottom = (rect.bottom - f13) - 0.5f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        this.f177883e.setAlpha(i12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Y61.l ColorFilter colorFilter) {
        this.f177883e.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z12, boolean z13) {
        if (z13) {
            start();
        }
        return super.setVisible(z12, z13);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        a();
        com.avito.android.lib.deprecated_design.circular_progress.c cVar = this.f177886h;
        if (cVar != null) {
            cVar.start();
        }
        this.f177885g = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f177885g = false;
        com.avito.android.lib.deprecated_design.circular_progress.c cVar = this.f177886h;
        if (cVar != null) {
            cVar.stop();
        }
        invalidateSelf();
    }

    /* compiled from: CircularProgressDrawable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/deprecated_design/circular_progress/a$a;", "", "_design-modules_deprecated-components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.deprecated_design.circular_progress.a$a, reason: collision with other inner class name */
    public static final class C5243a {

        /* renamed from: a, reason: collision with root package name */
        public int[] f177887a;

        /* renamed from: b, reason: collision with root package name */
        public final PowerManager f177888b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final k f177889c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final LinearInterpolator f177890d;

        /* renamed from: e, reason: collision with root package name */
        public float f177891e;

        /* renamed from: f, reason: collision with root package name */
        public float f177892f;

        /* renamed from: g, reason: collision with root package name */
        public float f177893g;

        /* renamed from: h, reason: collision with root package name */
        public int f177894h;

        /* renamed from: i, reason: collision with root package name */
        public int f177895i;

        /* renamed from: j, reason: collision with root package name */
        public final int f177896j;

        @X41.j
        public C5243a(@Y61.k Context context, boolean z12) {
            this.f177889c = com.avito.android.lib.deprecated_design.circular_progress.b.f177898b;
            this.f177890d = com.avito.android.lib.deprecated_design.circular_progress.b.f177897a;
            this.f177891e = context.getResources().getDimension(R.dimen.cpb_default_stroke_width);
            this.f177892f = 1.0f;
            this.f177893g = 1.0f;
            if (z12) {
                this.f177887a = new int[]{C35835l0.d(R.attr.blue, context)};
                this.f177894h = 20;
                this.f177895i = 300;
            } else {
                this.f177887a = new int[]{C35835l0.d(R.attr.white, context)};
                this.f177894h = context.getResources().getInteger(R.integer.cpb_default_min_sweep_angle);
                this.f177895i = context.getResources().getInteger(R.integer.cpb_default_max_sweep_angle);
            }
            this.f177896j = 1;
            this.f177888b = (PowerManager) context.getSystemService("power");
        }

        @Y61.k
        public final a a() {
            LinearInterpolator linearInterpolator = this.f177890d;
            k kVar = this.f177889c;
            float f12 = this.f177891e;
            int[] iArr = this.f177887a;
            n nVar = new n(linearInterpolator, kVar, f12, iArr == null ? null : iArr, this.f177892f, this.f177893g, this.f177894h, this.f177895i, this.f177896j);
            PowerManager powerManager = this.f177888b;
            if (powerManager == null) {
                powerManager = null;
            }
            return new a(powerManager, nVar, null);
        }

        public /* synthetic */ C5243a(Context context, boolean z12, int i12, C42822w c42822w) {
            this(context, (i12 & 2) != 0 ? false : z12);
        }
    }
}
