package com.avito.android.lib.design.text_view;

import PK0.n;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.core.content.res.i;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.icons.TextIconWeight;
import com.avito.android.lib.util.x;
import com.avito.android.util.C35763c0;
import com.avito.android.util.C35771d0;
import j.f0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: TextStyleDataUtils.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/text_view/d;", "", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f180938a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f180939b;

    /* compiled from: TextStyleDataUtils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<TextIconWeight> f180940a = kotlin.enums.c.a(TextIconWeight.values());
    }

    @k
    public static n a(@f0 int i12, @k Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i12, d.n.f178938O0);
        n nVarB = b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        return nVarB;
    }

    @k
    public static n b(@k TypedArray typedArray, @k Context context) {
        Typeface typeface;
        PK0.b bVar;
        ColorStateList colorStateListA = x.a(typedArray, context, 2);
        C35763c0 c35763c0 = colorStateListA != null ? new C35763c0(colorStateListA, f180939b) : null;
        int resourceId = typedArray.getResourceId(8, 0);
        Integer numValueOf = !typedArray.hasValue(7) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(7, 0));
        Integer numValueOf2 = !typedArray.hasValue(9) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(9, 0));
        Integer numValueOf3 = !typedArray.hasValue(3) ? null : Integer.valueOf(typedArray.getColor(3, 0));
        int resourceId2 = typedArray.getResourceId(5, 0);
        Integer numValueOf4 = Integer.valueOf(resourceId2);
        if (resourceId2 == 0) {
            numValueOf4 = null;
        }
        if (numValueOf4 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(numValueOf4.intValue(), d.n.f178938O0);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
            Integer numValueOf5 = Integer.valueOf(resourceId3);
            if (resourceId3 == 0) {
                numValueOf5 = null;
            }
            Typeface typefaceC = numValueOf5 != null ? i.c(numValueOf5.intValue(), context) : null;
            typedArrayObtainStyledAttributes.recycle();
            typeface = typefaceC;
        } else {
            typeface = null;
        }
        kotlin.enums.a<TextIconWeight> aVar = a.f180940a;
        TextIconWeight[] textIconWeightArr = TextIconWeight.f179280b;
        TextIconWeight textIconWeight = (TextIconWeight) C42745f0.K(typedArray.getInt(6, 1), aVar);
        int resourceId4 = typedArray.getResourceId(4, 0);
        Integer numValueOf6 = Integer.valueOf(resourceId4);
        if (resourceId4 == 0) {
            numValueOf6 = null;
        }
        Typeface typefaceC2 = numValueOf6 != null ? i.c(numValueOf6.intValue(), context) : null;
        Float fValueOf = !typedArray.hasValue(1) ? null : Float.valueOf(typedArray.getDimension(1, 0.0f));
        Integer numValueOf7 = !typedArray.hasValue(11) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(11, 0));
        Integer numValueOf8 = !typedArray.hasValue(12) ? null : Integer.valueOf(typedArray.getDimensionPixelSize(12, 0));
        f180938a.getClass();
        int resourceId5 = typedArray.getResourceId(10, 0);
        Integer numValueOf9 = Integer.valueOf(resourceId5);
        if (resourceId5 == 0) {
            numValueOf9 = null;
        }
        if (numValueOf9 != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(numValueOf9.intValue(), d.n.f178931L);
            String string = typedArrayObtainStyledAttributes2.getString(2);
            if (string == null) {
                string = "";
            }
            String str = string;
            int i12 = typedArrayObtainStyledAttributes2.getInt(0, 3);
            boolean z12 = typedArrayObtainStyledAttributes2.getBoolean(5, false);
            int resourceId6 = typedArrayObtainStyledAttributes2.getResourceId(4, R.attr.textM10);
            ColorStateList colorStateListA2 = x.a(typedArray, context, 3);
            PK0.b bVar2 = new PK0.b(str, i12, z12, resourceId6, colorStateListA2 != null ? C35771d0.b(colorStateListA2) : null, x.b(typedArray, context, 1), null, 64, null);
            typedArrayObtainStyledAttributes2.recycle();
            bVar = bVar2;
        } else {
            bVar = null;
        }
        return new n(fValueOf, c35763c0, typefaceC2, resourceId, numValueOf, numValueOf2, numValueOf3, c35763c0, typeface, textIconWeight, numValueOf7, numValueOf8, bVar);
    }
}
