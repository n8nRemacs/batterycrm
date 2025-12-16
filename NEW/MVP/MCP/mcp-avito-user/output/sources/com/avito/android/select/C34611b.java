package com.avito.android.select;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ColorFilterIconFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/b;", "Lcom/avito/android/select/a;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.select.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34611b implements InterfaceC34610a {
    @Inject
    public C34611b() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.avito.android.select.InterfaceC34610a
    @Y61.l
    public final Drawable a(@Y61.k Context context, @Y61.l String str, @Y61.l Integer num) throws Resources.NotFoundException {
        Drawable drawableH;
        if (str == null) {
            if (num == null) {
                return null;
            }
            int iIntValue = num.intValue();
            float[] fArr = new float[3];
            Color.colorToHSV(iIntValue, fArr);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.color_indicator_size);
            gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
            gradientDrawable.setColor(iIntValue);
            float f12 = fArr[1];
            if (fArr[2] <= 0.9f || f12 > 0.05f) {
                return gradientDrawable;
            }
            GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(1);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.color_indicator_size);
            gradientDrawableE.setSize(dimensionPixelSize2, dimensionPixelSize2);
            gradientDrawableE.setColor(0);
            gradientDrawableE.setStroke(y6.b(1), context.getColor(R.color.gray12));
            return new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawableE});
        }
        switch (str.hashCode()) {
            case -1800583133:
                if (str.equals("golden_wood")) {
                    return context.getDrawable(R.drawable.ic_golden_wood_circle_24);
                }
                break;
            case -1240337143:
                if (str.equals("golden")) {
                    return context.getDrawable(R.drawable.expected_ic_golden_gradient_circle_24);
                }
                break;
            case -923272439:
                if (str.equals("gray_wood")) {
                    return context.getDrawable(R.drawable.ic_gray_wood_circle_24);
                }
                break;
            case -902311155:
                if (str.equals("silver")) {
                    return context.getDrawable(R.drawable.expected_ic_silver_gradient_circle_24);
                }
                break;
            case -7673127:
                if (str.equals("see_through")) {
                    return context.getDrawable(R.drawable.ic_see_through_circle_24);
                }
                break;
            case 258663683:
                if (str.equals("white_wood")) {
                    return context.getDrawable(R.drawable.ic_white_wood_circle_24);
                }
                break;
            case 1251774591:
                if (str.equals("dark_brown_wood")) {
                    return context.getDrawable(R.drawable.ic_dark_brown_wood_circle_24);
                }
                break;
            case 1253160394:
                if (str.equals("multicolor")) {
                    return context.getDrawable(R.drawable.expected_ic_multicolor_circle_24);
                }
                break;
            case 1958905567:
                if (str.equals("light_brown_wood")) {
                    return context.getDrawable(R.drawable.ic_light_brown_wood_circle_24);
                }
                break;
        }
        Integer numA = com.avito.android.lib.util.q.a(str);
        if (numA == null || (drawableH = C35835l0.h(numA.intValue(), context)) == null) {
            return null;
        }
        if (num != null) {
            V0.a(drawableH, num.intValue());
        }
        return drawableH;
    }
}
