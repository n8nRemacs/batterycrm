package com.avito.android.beduin.common.utils;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.avito.android.beduin.common.component.image.BeduinLinearGradient;
import com.avito.android.beduin.common.component.image.BeduinLinearGradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: SimpleDraweeViews.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/utils/A;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BeduinLinearGradient f103506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f103507b;

    public A(BeduinLinearGradient beduinLinearGradient, Context context) {
        this.f103506a = beduinLinearGradient;
        this.f103507b = context;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @Y61.k
    public final Shader resize(int i12, int i13) {
        float f12 = i13;
        BeduinLinearGradient beduinLinearGradient = this.f103506a;
        List<BeduinLinearGradientColor> colors = beduinLinearGradient.getColors();
        ArrayList arrayList = new ArrayList(C42745f0.q(colors, 10));
        Iterator<T> it = colors.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(C48063a.f437606a.a(this.f103507b, ((BeduinLinearGradientColor) it.next()).getColor())));
        }
        int[] iArrL0 = C42745f0.L0(arrayList);
        List<BeduinLinearGradientColor> colors2 = beduinLinearGradient.getColors();
        ArrayList arrayList2 = new ArrayList(C42745f0.q(colors2, 10));
        Iterator<T> it2 = colors2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Float.valueOf(((BeduinLinearGradientColor) it2.next()).getPosition()));
        }
        return new LinearGradient(0.0f, 0.0f, 0.0f, f12, iArrL0, C42745f0.J0(arrayList2), Shader.TileMode.CLAMP);
    }
}
