package com.avito.android.constructor_advert.ui.serp.constructor;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeIcon;
import com.avito.android.remote.model.badge_bar.SerpBadgeStyle;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.EnumMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import sK0.C48065c;

/* compiled from: BadgeHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/c;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/b;", "<init>", "()V", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final EnumMap f125811a = new EnumMap(BadgeType.class);

    /* compiled from: BadgeHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BadgeType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BadgeType badgeType = BadgeType.f125731b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public c() {
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.b
    @Y61.k
    public final View a(@Y61.k SerpBadge serpBadge, @Y61.k Context context) {
        Uri uri;
        BadgeType badgeType = serpBadge.getIcon() == null ? BadgeType.f125731b : BadgeType.f125732c;
        int iOrdinal = badgeType.ordinal();
        EnumMap enumMap = this.f125811a;
        if (iOrdinal == 0) {
            List list = (List) enumMap.get(badgeType);
            View view = list != null ? (View) C42745f0.o0(list) : null;
            BadgeView badgeView = view instanceof BadgeView ? (BadgeView) view : null;
            if (badgeView == null) {
                badgeView = new BadgeView(context, null, 0, 0, 14, null);
            }
            SerpBadgeStyle style = serpBadge.getStyle();
            badgeView.setBackgroundColor(C48065c.b(context, style != null ? style.getBackgroundColor() : null, C35835l0.d(R.attr.constantWhite, context)));
            SerpBadgeStyle style2 = serpBadge.getStyle();
            badgeView.setTextColor(C48065c.b(context, style2 != null ? style2.getFontColor() : null, C35835l0.d(R.attr.constantBlack, context)));
            badgeView.setText(serpBadge.getTitle());
            return badgeView;
        }
        if (iOrdinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        List list2 = (List) enumMap.get(badgeType);
        View view2 = list2 != null ? (View) C42745f0.o0(list2) : null;
        SimpleDraweeView simpleDraweeView = view2 instanceof SimpleDraweeView ? (SimpleDraweeView) view2 : null;
        if (simpleDraweeView == null) {
            simpleDraweeView = new SimpleDraweeView(context);
        }
        SerpBadgeIcon icon = serpBadge.getIcon();
        if (icon == null || (uri = icon.getUri()) == null) {
            uri = Uri.EMPTY;
        }
        com.avito.android.image_loader.p pVar = new com.avito.android.image_loader.p(uri);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        Paint paint = shapeDrawable.getPaint();
        SerpBadgeStyle style3 = serpBadge.getStyle();
        paint.setColor(C48065c.b(context, style3 != null ? style3.getBackgroundColor() : null, R.color.legacy_constant_white));
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = D6.i(2, context);
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        simpleDraweeView.setBackground(shapeDrawable);
        SerpBadgeIcon icon2 = serpBadge.getIcon();
        simpleDraweeView.setColorFilter(new PorterDuffColorFilter(C48065c.b(context, icon2 != null ? icon2.getTintColor() : null, R.color.legacy_constant_white), PorterDuff.Mode.SRC_IN));
        simpleDraweeView.setLayoutParams(new ViewGroup.LayoutParams(D6.i(16, context), D6.i(16, context)));
        C35949t5.c(simpleDraweeView, pVar, null, null, null, 14);
        return simpleDraweeView;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.b
    public final void b(@Y61.k View view) {
        BadgeType badgeType = view instanceof BadgeView ? BadgeType.f125731b : BadgeType.f125732c;
        EnumMap enumMap = this.f125811a;
        List list = (List) enumMap.get(badgeType);
        if (list != null) {
            list.add(view);
        } else {
            enumMap.put((EnumMap) badgeType, (BadgeType) C42745f0.j(view));
        }
    }
}
