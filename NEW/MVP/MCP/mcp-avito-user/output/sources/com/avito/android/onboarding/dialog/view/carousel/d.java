package com.avito.android.onboarding.dialog.view.carousel;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.onboarding.UniversalLinearGradientColor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: OnboardingCarouselItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/onboarding/dialog/view/carousel/d;", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "_avito_onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends ShapeDrawable.ShaderFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<UniversalLinearGradientColor> f208991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f208992b;

    public d(List<UniversalLinearGradientColor> list, c cVar) {
        this.f208991a = list;
        this.f208992b = cVar;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    @Y61.k
    public final Shader resize(int i12, int i13) {
        float f12 = i12;
        List<UniversalLinearGradientColor> list = this.f208991a;
        List<UniversalLinearGradientColor> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (UniversalLinearGradientColor universalLinearGradientColor : list2) {
            C48063a c48063a = C48063a.f437606a;
            Context context = this.f208992b.f208985d;
            UniversalColor color = universalLinearGradientColor.getColor();
            if (color == null) {
                color = e.f208993a;
            }
            arrayList.add(Integer.valueOf(c48063a.a(context, color)));
        }
        int[] iArrL0 = C42745f0.L0(arrayList);
        List<UniversalLinearGradientColor> list3 = list;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf(((UniversalLinearGradientColor) it.next()).getPosition()));
        }
        return new LinearGradient(0.0f, 0.0f, f12, 0.0f, iArrL0, C42745f0.J0(arrayList2), Shader.TileMode.CLAMP);
    }
}
