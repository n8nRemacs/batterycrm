package wK0;

import Y61.k;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import com.avito.android.util.C35779e0;
import com.google.android.material.shape.o;
import com.google.android.material.shape.q;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ShapeStateDrawable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LwK0/c;", "Landroid/graphics/drawable/StateListDrawable;", "a", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CustomColorsKotlin"})
/* renamed from: wK0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC49528c extends StateListDrawable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f441377b = new a(null);

    /* compiled from: ShapeStateDrawable.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwK0/c$a;", "", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wK0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static q a() {
            q.b bVar = new q.b();
            o oVar = new o(1.0f);
            bVar.f357097e = oVar;
            bVar.f357098f = oVar;
            bVar.f357099g = oVar;
            bVar.f357100h = oVar;
            return bVar.a();
        }

        public static LayerDrawable b(a aVar, q qVar, int i12, int i13, int i14, int i15, ColorStateList colorStateList, ColorStateList colorStateList2, Float f12, ColorStateList colorStateList3, int i16) {
            Integer numA;
            if ((i16 & 2) != 0) {
                i12 = 0;
            }
            if ((i16 & 4) != 0) {
                i13 = 0;
            }
            if ((i16 & 8) != 0) {
                i14 = 0;
            }
            if ((i16 & 16) != 0) {
                i15 = 0;
            }
            if ((i16 & 64) != 0) {
                colorStateList2 = null;
            }
            if ((i16 & 128) != 0) {
                f12 = null;
            }
            if ((i16 & 256) != 0) {
                colorStateList3 = null;
            }
            aVar.getClass();
            com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(qVar);
            kVar.n(colorStateList);
            if (f12 != null) {
                kVar.v(f12.floatValue());
                kVar.u(colorStateList3);
            }
            if (colorStateList2 == null) {
                colorStateList2 = ColorStateList.valueOf((colorStateList == null || (numA = C35779e0.a(colorStateList)) == null) ? 0 : numA.intValue());
            }
            com.google.android.material.shape.k kVar2 = new com.google.android.material.shape.k(qVar);
            kVar2.n(ColorStateList.valueOf(-16777216));
            LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) C42745f0.V(new RippleDrawable(colorStateList2, kVar, kVar2)).toArray(new RippleDrawable[0]));
            layerDrawable.setLayerInset(0, i12, i13, i14, i15);
            return layerDrawable;
        }

        public a() {
        }
    }
}
