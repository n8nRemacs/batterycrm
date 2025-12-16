package G2;

import AK.c;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.b;
import coil.decode.g;
import coil.view.Scale;
import j.X;
import j.k0;
import java.util.ArrayList;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: CrossfadeDrawable.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"LG2/a;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable$Callback;", "Landroidx/vectordrawable/graphics/drawable/b;", "a", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends Drawable implements Drawable.Callback, b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Scale f6213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6214c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6215d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f6216e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ArrayList f6217f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6218g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6219h;

    /* renamed from: i, reason: collision with root package name */
    public long f6220i;

    /* renamed from: j, reason: collision with root package name */
    public int f6221j;

    /* renamed from: k, reason: collision with root package name */
    public int f6222k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public Drawable f6223l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final Drawable f6224m;

    /* compiled from: CrossfadeDrawable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LG2/a$a;", "", "<init>", "()V", "", "DEFAULT_DURATION", "I", "STATE_DONE", "STATE_RUNNING", "STATE_START", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: G2.a$a, reason: collision with other inner class name */
    public static final class C0328a {
        public /* synthetic */ C0328a(C42822w c42822w) {
            this();
        }

        public C0328a() {
        }
    }

    static {
        new C0328a(null);
    }

    public /* synthetic */ a(Drawable drawable, Drawable drawable2, Scale scale, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(drawable, drawable2, (i13 & 4) != 0 ? Scale.f58756c : scale, (i13 & 8) != 0 ? 100 : i12, (i13 & 16) != 0 ? true : z12, (i13 & 32) != 0 ? false : z13);
    }

    public final int a(Integer num, Integer num2) {
        if (this.f6216e || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final void b() {
        this.f6222k = 2;
        this.f6223l = null;
        ArrayList arrayList = this.f6217f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((b.a) arrayList.get(i12)).b(this);
        }
    }

    @k0
    public final void c(@k Drawable drawable, @k Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dA2 = g.a(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f6213b);
        double d12 = 2;
        int iA2 = kotlin.math.b.a((iWidth - (intrinsicWidth * dA2)) / d12);
        int iA3 = kotlin.math.b.a((iHeight - (dA2 * intrinsicHeight)) / d12);
        drawable.setBounds(rect.left + iA2, rect.top + iA3, rect.right - iA2, rect.bottom - iA3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i12 = this.f6222k;
        if (i12 == 0) {
            Drawable drawable2 = this.f6223l;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f6221j);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f6224m;
        if (i12 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f6221j);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f6220i) / this.f6214c;
        double dE2 = s.e(dUptimeMillis, 0.0d, 1.0d);
        int i13 = this.f6221j;
        int i14 = (int) (dE2 * i13);
        if (this.f6215d) {
            i13 -= i14;
        }
        boolean z12 = dUptimeMillis >= 1.0d;
        if (!z12 && (drawable = this.f6223l) != null) {
            drawable.setAlpha(i13);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i14);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z12) {
            b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6221j;
    }

    @Override // android.graphics.drawable.Drawable
    @l
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i12 = this.f6222k;
        if (i12 == 0) {
            Drawable drawable = this.f6223l;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f6224m;
        if (i12 != 1) {
            if (i12 == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f6223l;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6219h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6218g;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC42830m
    public final int getOpacity() {
        Drawable drawable = this.f6223l;
        int i12 = this.f6222k;
        if (i12 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f6224m;
        if (i12 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@k Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6222k == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            c(drawable, rect);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 != null) {
            c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i12) {
        Drawable drawable = this.f6223l;
        boolean level = drawable != null ? drawable.setLevel(i12) : false;
        Drawable drawable2 = this.f6224m;
        return level || (drawable2 != null ? drawable2.setLevel(i12) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@k int[] iArr) {
        Drawable drawable = this.f6223l;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f6224m;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@k Drawable drawable, @k Runnable runnable, long j12) {
        scheduleSelf(runnable, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
        if (i12 < 0 || i12 >= 256) {
            throw new IllegalArgumentException(c.g(i12, "Invalid alpha: ").toString());
        }
        this.f6221j = i12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i12) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            drawable.setTint(i12);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 != null) {
            drawable2.setTint(i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @X
    public final void setTintBlendMode(@l BlendMode blendMode) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(@l ColorStateList colorStateList) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@l PorterDuff.Mode mode) {
        Drawable drawable = this.f6223l;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f6224m;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f6223l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f6224m;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f6222k != 0) {
            return;
        }
        this.f6222k = 1;
        this.f6220i = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f6217f;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((b.a) arrayList.get(i12)).c(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f6223l;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f6224m;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f6222k != 2) {
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@k Drawable drawable, @k Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @j
    public a(@l Drawable drawable, @l Drawable drawable2, @k Scale scale, int i12, boolean z12, boolean z13) {
        this.f6213b = scale;
        this.f6214c = i12;
        this.f6215d = z12;
        this.f6216e = z13;
        this.f6217f = new ArrayList();
        this.f6218g = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f6219h = a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f6221j = 255;
        this.f6223l = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f6224m = drawableMutate;
        if (i12 > 0) {
            Drawable drawable3 = this.f6223l;
            if (drawable3 != null) {
                drawable3.setCallback(this);
            }
            if (drawableMutate == null) {
                return;
            }
            drawableMutate.setCallback(this);
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }
}
