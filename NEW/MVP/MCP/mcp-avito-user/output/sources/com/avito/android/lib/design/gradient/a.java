package com.avito.android.lib.design.gradient;

import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.g;
import androidx.core.graphics.drawable.h;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.gradient.b;
import com.avito.android.util.V0;
import j.InterfaceC42150f;
import j.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoRadialGradientDrawable.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/gradient/a;", "Lcom/avito/android/lib/design/gradient/b;", "Lcom/avito/android/lib/design/gradient/a$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends b<C5276a> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f179245c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C5276a f179246d;

    /* compiled from: AvitoRadialGradientDrawable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gradient/a$a;", "Lcom/avito/android/lib/design/gradient/b$a;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.lib.design.gradient.a$a, reason: collision with other inner class name */
    public static final class C5276a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f179247a;

        /* renamed from: b, reason: collision with root package name */
        public final int f179248b;

        /* renamed from: c, reason: collision with root package name */
        public final int f179249c;

        /* renamed from: d, reason: collision with root package name */
        public final int f179250d;

        /* renamed from: e, reason: collision with root package name */
        public final int f179251e;

        /* renamed from: f, reason: collision with root package name */
        public final float f179252f;

        /* renamed from: g, reason: collision with root package name */
        public final float f179253g;

        /* renamed from: h, reason: collision with root package name */
        public final float f179254h;

        /* renamed from: i, reason: collision with root package name */
        public final float f179255i;

        /* renamed from: j, reason: collision with root package name */
        public final float f179256j;

        /* renamed from: k, reason: collision with root package name */
        public final float f179257k;

        /* renamed from: l, reason: collision with root package name */
        public final int f179258l;

        /* compiled from: AvitoRadialGradientDrawable.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lib/design/gradient/a$a$a;", "Lcom/avito/android/lib/design/gradient/b$a$a;", "Lcom/avito/android/lib/design/gradient/a$a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.lib.design.gradient.a$a$a, reason: collision with other inner class name */
        public static final class C5277a extends b.a.AbstractC5278a<C5276a> {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Context f179259b;

            /* renamed from: c, reason: collision with root package name */
            public final int f179260c;

            /* renamed from: d, reason: collision with root package name */
            public final int f179261d;

            public /* synthetic */ C5277a(Context context, int i12, int i13, int i14, C42822w c42822w) {
                this(context, (i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? 0 : i13);
            }

            @k
            public final C5276a a() {
                TypedArray typedArrayObtainStyledAttributes = this.f179259b.obtainStyledAttributes(null, d.n.f178911B, this.f179260c, this.f179261d);
                C5276a c5276a = new C5276a(typedArrayObtainStyledAttributes.getColor(0, 0), typedArrayObtainStyledAttributes.getColor(4, 0), typedArrayObtainStyledAttributes.getColor(3, 0), typedArrayObtainStyledAttributes.getColor(9, 0), typedArrayObtainStyledAttributes.getColor(8, 0), typedArrayObtainStyledAttributes.getFloat(1, 0.0f), typedArrayObtainStyledAttributes.getFloat(2, 0.0f), typedArrayObtainStyledAttributes.getFloat(6, 0.0f), typedArrayObtainStyledAttributes.getFloat(7, 0.0f), typedArrayObtainStyledAttributes.getFloat(5, 0.0f), typedArrayObtainStyledAttributes.getFloat(10, 0.0f), this.f179264a, null);
                typedArrayObtainStyledAttributes.recycle();
                return c5276a;
            }

            public C5277a(@k Context context, @InterfaceC42150f int i12, @f0 int i13) {
                this.f179259b = context;
                this.f179260c = i12;
                this.f179261d = i13;
            }
        }

        public C5276a(int i12, int i13, int i14, int i15, int i16, float f12, float f13, float f14, float f15, float f16, float f17, int i17, C42822w c42822w) {
            this.f179247a = i12;
            this.f179248b = i13;
            this.f179249c = i14;
            this.f179250d = i15;
            this.f179251e = i16;
            this.f179252f = f12;
            this.f179253g = f13;
            this.f179254h = f14;
            this.f179255i = f15;
            this.f179256j = f16;
            this.f179257k = f17;
            this.f179258l = i17;
        }
    }

    public a(@k Context context, @k C5276a c5276a) {
        this.f179245c = context;
        this.f179246d = c5276a;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final b.a a() {
        return this.f179246d;
    }

    @Override // com.avito.android.lib.design.gradient.b
    public final Drawable b(b.a aVar) {
        C5276a c5276a = (C5276a) aVar;
        Rect rect = this.f179262a;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int iMax = Math.max(iWidth, iHeight);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c5276a.f179247a);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setGradientType(1);
        gradientDrawable2.setColors(new int[]{c5276a.f179248b, c5276a.f179249c});
        float f12 = iMax;
        gradientDrawable2.setGradientRadius(c5276a.f179256j * f12);
        gradientDrawable2.setGradientCenter(c5276a.f179252f, c5276a.f179253g);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setGradientType(1);
        gradientDrawable3.setColors(new int[]{c5276a.f179250d, c5276a.f179251e});
        gradientDrawable3.setGradientRadius(f12 * c5276a.f179257k);
        gradientDrawable3.setGradientCenter(c5276a.f179254h, c5276a.f179255i);
        GradientDrawable[] gradientDrawableArr = {gradientDrawable, gradientDrawable3, gradientDrawable2};
        for (int i12 = 0; i12 < 3; i12++) {
            gradientDrawableArr[i12].setSize(iMax, iMax);
        }
        LayerDrawable layerDrawable = new LayerDrawable(gradientDrawableArr);
        int i13 = c5276a.f179258l;
        if (iWidth == iHeight) {
            for (int i14 = 0; i14 < 3; i14++) {
                gradientDrawableArr[i14].setCornerRadius(i13);
            }
            return layerDrawable;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(V0.b(layerDrawable), iWidth, iHeight, true);
        Context context = this.f179245c;
        if (i13 <= 0) {
            return new BitmapDrawable(context.getResources(), bitmapCreateScaledBitmap);
        }
        g gVarA = h.a(context.getResources(), bitmapCreateScaledBitmap);
        gVarA.b(i13);
        return gVarA;
    }
}
