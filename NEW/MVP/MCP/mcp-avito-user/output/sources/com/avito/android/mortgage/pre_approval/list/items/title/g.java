package com.avito.android.mortgage.pre_approval.list.items.title;

import Y61.k;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D1;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/list/items/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/pre_approval/list/items/title/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f201962b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public String f201963c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f201964d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f201962b = (TextView) viewFindViewById;
        this.f201963c = "";
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 6);
        D1.a(valueAnimatorOfInt, -1);
        valueAnimatorOfInt.setDuration(1000L);
        valueAnimatorOfInt.addUpdateListener(new AV.a(this, 13));
        this.f201964d = valueAnimatorOfInt;
    }

    @Override // com.avito.android.mortgage.pre_approval.list.items.title.f
    public final void D(@k PrintableText printableText) {
        String strK0 = printableText.k0(this.itemView.getContext());
        this.f201963c = strK0;
        this.f201962b.setText(strK0);
    }

    @Override // com.avito.android.mortgage.pre_approval.list.items.title.f
    public final void aA(boolean z12) {
        ValueAnimator valueAnimator = this.f201964d;
        if (z12) {
            valueAnimator.start();
        } else {
            valueAnimator.end();
            this.f201962b.setText(this.f201963c);
        }
    }
}
