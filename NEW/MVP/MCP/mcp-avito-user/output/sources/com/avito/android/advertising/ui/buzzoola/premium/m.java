package com.avito.android.advertising.ui.buzzoola.premium;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.layout.RatioFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BuzzoolaPremiumJuristicItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advertising/ui/buzzoola/premium/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advertising/ui/buzzoola/premium/l;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f88655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RatioFrameLayout f88656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Float f88657d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f88658e;

    public m(@Y61.k View view) {
        super(view);
        this.f88655b = view;
        this.f88656c = (RatioFrameLayout) view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f88658e = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.l
    public final void LK(@Y61.l Integer num, @Y61.k String str) {
        TextView textView = this.f88658e;
        textView.setText(str);
        if (num != null) {
            textView.setTextColor(num.intValue());
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.l
    public final void o00(@Y61.l Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            View view = this.f88655b;
            Drawable background = view.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable == null) {
                return;
            }
            GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
            gradientDrawable2.setColor(iIntValue);
            view.setBackground(gradientDrawable2);
        }
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.l
    public final void q0(float f12) {
        if (L.d(this.f88657d, f12)) {
            return;
        }
        RatioFrameLayout ratioFrameLayout = this.f88656c;
        ratioFrameLayout.setRatio(f12);
        ratioFrameLayout.requestLayout();
        this.f88657d = Float.valueOf(f12);
    }

    @Override // com.avito.android.advertising.ui.buzzoola.premium.l
    public final void x0(@Y61.k View.OnClickListener onClickListener) {
        this.f88655b.setOnClickListener(onClickListener);
    }
}
