package com.avito.android.beduin.common.component.label.joiner.token_mapper;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.beduin.common.component.docking_badge.CustomBadgeType;
import com.avito.android.beduin.common.utils.C;
import com.avito.android.beduin.network.model.LabelToken;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import com.avito.android.lib.design.docking_badge.DockingBadgeSize;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DockingBadgeMapper.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/c;", "Lcom/avito/android/beduin/common/component/label/joiner/token_mapper/s;", "Lcom/avito/android/beduin/network/model/LabelToken$DockingBadgeToken;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements s<LabelToken.DockingBadgeToken> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.beduin.common.component.label.joiner.token_mapper.s
    public final CharSequence a(Context context, LabelToken labelToken) {
        LabelToken.DockingBadgeToken dockingBadgeToken = (LabelToken.DockingBadgeToken) labelToken;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23);
        String title = dockingBadgeToken.getTitle();
        CustomBadgeType customBadgeType = new CustomBadgeType(dockingBadgeToken.getBadgeColor(), dockingBadgeToken.getTextColor(), null, null);
        DockingBadgeSize size = dockingBadgeToken.getSize();
        if (size == null) {
            LabelToken.DockingBadgeToken.INSTANCE.getClass();
            size = LabelToken.DockingBadgeToken.DEFAULT_SIZE;
        }
        DockingBadgeType dockingBadgeTypeA = com.avito.android.beduin.common.component.docking_badge.e.a(context, customBadgeType, null, size);
        DockingBadgeSize size2 = dockingBadgeToken.getSize();
        if (size2 == null) {
            LabelToken.DockingBadgeToken.INSTANCE.getClass();
            size2 = LabelToken.DockingBadgeToken.DEFAULT_SIZE;
        }
        DockingBadgeSize dockingBadgeSize = size2;
        DockingBadgeEdgeType startEdgeType = dockingBadgeToken.getStartEdgeType();
        DockingBadgeEdgeType endEdgeType = dockingBadgeToken.getEndEdgeType();
        if (endEdgeType == null) {
            endEdgeType = dockingBadgeToken.getStartEdgeType();
        }
        DockingBadge dockingBadge = new DockingBadge(contextThemeWrapper, title, dockingBadgeTypeA, dockingBadgeSize, startEdgeType, endEdgeType);
        dockingBadge.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        dockingBadge.layout(0, 0, dockingBadge.getMeasuredWidth(), dockingBadge.getMeasuredHeight());
        Resources resources = dockingBadge.getResources();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        if (!dockingBadge.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dockingBadge.getWidth(), dockingBadge.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-dockingBadge.getScrollX(), -dockingBadge.getScrollY());
        dockingBadge.draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapCreateBitmap);
        int intrinsicWidth = bitmapDrawable.getIntrinsicWidth();
        int intrinsicHeight = bitmapDrawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 0;
        }
        if (intrinsicHeight <= 0) {
            intrinsicHeight = 0;
        }
        bitmapDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        com.avito.android.lib.util.a aVar = new com.avito.android.lib.util.a(bitmapDrawable, y6.b(dockingBadgeToken.getOffsetFromCenter()));
        SpannableString spannableString = new SpannableString(dockingBadgeToken.getTitle());
        C.a(spannableString, aVar);
        return spannableString;
    }
}
