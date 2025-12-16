package com.avito.android.authorization.confirm_3fa.adapter;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EmailListItemView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/confirm_3fa/adapter/EmailListItemView;", "Lcom/avito/android/lib/design/list_item/ListItem;", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/CharSequence;)V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmailListItemView extends ListItem {
    @j
    public EmailListItemView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setText(@k CharSequence text) {
        setTitle(text);
    }

    public EmailListItemView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        Drawable drawableH = C35835l0.h(R.attr.ic_arrowRight20, context);
        if (drawableH != null) {
            drawableH.setTintList(context.getColorStateList(R.color.common_black));
        } else {
            drawableH = null;
        }
        g(null, drawableH);
    }
}
