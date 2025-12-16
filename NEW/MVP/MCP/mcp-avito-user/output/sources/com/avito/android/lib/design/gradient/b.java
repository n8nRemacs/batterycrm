package com.avito.android.lib.design.gradient;

import Y61.k;
import Y61.l;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.avito.android.lib.design.gradient.b.a;
import j.U;
import kotlin.C42727D;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseAvitoGradientDrawable.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/gradient/b;", "Lcom/avito/android/lib/design/gradient/b$a;", "T", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class b<T extends a> extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Rect f179262a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f179263b = C42727D.b(LazyThreadSafetyMode.f406616d, new C5279b(this));

    /* compiled from: BaseAvitoGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gradient/b$a;", "", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: BaseAvitoGradientDrawable.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/gradient/b$a$a;", "Lcom/avito/android/lib/design/gradient/b$a;", "T", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.gradient.b$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC5278a<T extends a> {

            /* renamed from: a, reason: collision with root package name */
            @U
            public int f179264a;
        }
    }

    /* compiled from: BaseAvitoGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/gradient/b$a;", "T", "Landroid/graphics/drawable/Drawable;", "invoke", "()Landroid/graphics/drawable/Drawable;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.lib.design.gradient.b$b, reason: collision with other inner class name */
    public static final class C5279b extends N implements Y41.a<Drawable> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b<T> f179265l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5279b(b<T> bVar) {
            super(0);
            this.f179265l = bVar;
        }

        @Override // Y41.a
        public final Drawable invoke() {
            b<T> bVar = this.f179265l;
            return bVar.b(bVar.a());
        }
    }

    @k
    public abstract T a();

    @k
    public abstract Drawable b(@k T t12);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(@k Canvas canvas) {
        ((Drawable) this.f179263b.getValue()).draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC42830m
    public final int getOpacity() {
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.C] */
    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@k Rect rect) {
        this.f179262a.set(rect);
        ((Drawable) this.f179263b.getValue()).setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i12) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@l ColorFilter colorFilter) {
    }
}
