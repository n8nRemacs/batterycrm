package com.avito.android.comparison.items.option_icon_value_item;

import Qq.InterfaceC14923a;
import Y61.k;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OptionIconValueView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comparison/items/option_icon_value_item/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comparison/items/option_icon_value_item/f;", "LQq/a;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f, InterfaceC14923a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f124053b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f124054c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f124055d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.icon_value);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f124053b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.left_divider);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f124054c = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.right_divider);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f124055d = viewFindViewById3;
    }

    @Override // com.avito.android.comparison.items.option_icon_value_item.f
    public final void WY(int i12) {
        this.f124053b.setImageResource(i12);
    }

    @Override // Qq.InterfaceC14923a
    public final void ey(boolean z12) {
        D6.G(this.f124055d, z12);
    }

    @Override // Qq.InterfaceC14923a
    public final void oS(boolean z12) {
        D6.G(this.f124054c, z12);
    }

    @Override // Qq.InterfaceC14923a
    public final void dr() {
    }
}
