package com.yandex.div.core.tooltip;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C22816e;
import androidx.core.view.C22833m0;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37931a;
import com.yandex.div2.D4;
import com.yandex.div2.DivTooltip;
import com.yandex.div2.O0;
import j.k0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.L;

/* compiled from: DivTooltipController.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0096\u0001\b\u0000\u0010\t\"G\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00002G\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Landroid/view/View;", "Lkotlin/S;", "name", "contentView", "", "width", "height", "Lcom/yandex/div/core/util/h;", "CreatePopupCall", "div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class h {

    /* compiled from: DivTooltipController.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DivTooltip.Position.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[7] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[2] = 7;
            iArr[6] = 8;
        }
    }

    public static final boolean a(C38029k c38029k, View view, Point point) {
        Rect rect = new Rect();
        c38029k.getWindowVisibleDisplayFrame(rect);
        int i12 = rect.left;
        int i13 = point.x;
        if (i12 <= i13 && rect.top <= point.y && rect.right >= view.getWidth() + i13) {
            if (rect.bottom >= view.getHeight() + point.y) {
                return true;
            }
        }
        return false;
    }

    @k0
    @Y61.k
    public static final Point b(@Y61.k View view, @Y61.k View view2, @Y61.k DivTooltip divTooltip, @Y61.k com.yandex.div.json.expressions.e eVar) {
        int width;
        int height;
        O0 o02;
        O0 o03;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int iO2 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        DivTooltip.Position positionA = divTooltip.f372142g.a(eVar);
        int i12 = point.x;
        switch (positionA) {
            case LEFT:
            case TOP_LEFT:
            case BOTTOM_LEFT:
                width = -view.getWidth();
                break;
            case TOP:
            case BOTTOM:
                width = (view2.getWidth() / 2) - (view.getWidth() / 2);
                break;
            case TOP_RIGHT:
            case RIGHT:
            case BOTTOM_RIGHT:
                width = view2.getWidth();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.x = i12 + width;
        int i13 = point.y;
        switch (positionA) {
            case LEFT:
            case RIGHT:
                height = (view2.getHeight() / 2) - (view.getHeight() / 2);
                break;
            case TOP_LEFT:
            case TOP:
            case TOP_RIGHT:
                height = -view.getHeight();
                break;
            case BOTTOM_RIGHT:
            case BOTTOM:
            case BOTTOM_LEFT:
                height = view2.getHeight();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        point.y = i13 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        int i14 = point.x;
        D4 d42 = divTooltip.f372141f;
        point.x = i14 + ((d42 == null || (o02 = d42.f371170a) == null) ? 0 : C37931a.O(o02, displayMetrics, eVar));
        int i15 = point.y;
        if (d42 != null && (o03 = d42.f371171b) != null) {
            iO2 = C37931a.O(o03, displayMetrics, eVar);
        }
        point.y = i15 + iO2;
        return point;
    }

    public static final Q c(View view, String str) {
        Q qC2;
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<DivTooltip> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (DivTooltip divTooltip : list) {
                if (L.f(divTooltip.f372140e, str)) {
                    return new Q(divTooltip, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            Iterator itA = C22816e.a((ViewGroup) view);
            do {
                C22833m0 c22833m0 = (C22833m0) itA;
                if (c22833m0.hasNext()) {
                    qC2 = c((View) c22833m0.next(), str);
                }
            } while (qC2 == null);
            return qC2;
        }
        return null;
    }
}
