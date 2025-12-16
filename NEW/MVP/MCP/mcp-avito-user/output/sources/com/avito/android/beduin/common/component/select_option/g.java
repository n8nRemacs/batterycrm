package com.avito.android.beduin.common.component.select_option;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinSelectOptionLayout.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/g;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "text", "setSelectedText", "Lcom/avito/android/beduin/common/component/select_option/Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "setBackground", "(Lcom/avito/android/beduin/common/component/select_option/Style;)V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f102499b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f102500c;

    /* compiled from: BeduinSelectOptionLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102501a;

        static {
            int[] iArr = new int[Style.values().length];
            try {
                iArr[Style.WITH_BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102501a = iArr;
        }
    }

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.beduin_select_option, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.select_option_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102499b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.select_option_selected_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f102500c = (TextView) viewFindViewById2;
    }

    public final void setBackground(@l Style style) {
        if ((style == null ? -1 : a.f102501a[style.ordinal()]) == 1) {
            setBackgroundResource(R.drawable.bg_beduin_select_option_modifcation);
        } else {
            setBackground((Drawable) null);
        }
    }

    public final void setSelectedText(@k String text) {
        this.f102500c.setText(text);
    }

    public final void setTitle(@k String title) {
        this.f102499b.setText(title);
    }
}
