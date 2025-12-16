package com.avito.android.code_check.phone_list.adapter;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.avito.android.R;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhoneListItemView.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/PhoneListItemView;", "Lcom/avito/android/lib/design/list_item/ListItem;", "", "text", "Lkotlin/G0;", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/content/res/ColorStateList;", "getRedColor", "()Landroid/content/res/ColorStateList;", "redColor", "getBlackColor", "blackColor", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PhoneListItemView extends ListItem {

    /* compiled from: PhoneListItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118923a;

        static {
            int[] iArr = new int[LeftIconType.values().length];
            try {
                LeftIconType leftIconType = LeftIconType.f118919b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LeftIconType leftIconType2 = LeftIconType.f118919b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f118923a = iArr;
        }
    }

    @j
    public PhoneListItemView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ColorStateList getBlackColor() {
        return getContext().getColorStateList(R.color.common_black);
    }

    private final ColorStateList getRedColor() {
        return getContext().getColorStateList(R.color.common_red);
    }

    public final void n(@l LeftIconType leftIconType, boolean z12) {
        Drawable drawableH;
        Drawable drawableH2 = null;
        if (!z12 || (drawableH = C35835l0.h(R.attr.ic_arrowRight20, getContext())) == null) {
            drawableH = null;
        } else {
            drawableH.setTintList(getBlackColor());
        }
        int i12 = leftIconType == null ? -1 : a.f118923a[leftIconType.ordinal()];
        if (i12 == 1) {
            drawableH2 = C35835l0.h(R.attr.ic_attentionRound20, getContext());
            setLeftIconColor(getRedColor());
        } else if (i12 == 2) {
            drawableH2 = C35835l0.h(R.attr.ic_addRound20, getContext());
            setLeftIconColor(getBlackColor());
        }
        g(drawableH2, drawableH);
        setClickable(z12);
        setFocusable(z12);
    }

    public final void setText(@k CharSequence text) {
        setTitle(text);
    }

    public PhoneListItemView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
