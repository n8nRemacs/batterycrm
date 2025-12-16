package com.avito.android.advert_core.divider;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDividerView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/divider/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/divider/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f83439b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f83440c;

    public h(@k View view) {
        super(view);
        this.f83439b = view;
        this.f83440c = view.findViewById(R.id.advert_details_divider_view);
    }

    @Override // com.avito.android.advert_core.divider.g
    public final void S50(int i12, int i13, @l Integer num) {
        View view = this.f83440c;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            View view2 = this.f83439b;
            layoutParams2.topMargin = D6.j(view2, i12);
            layoutParams2.bottomMargin = D6.j(view2, i13);
            if (num != null) {
                int iB2 = y6.b(num.intValue());
                layoutParams2.leftMargin = iB2;
                layoutParams2.rightMargin = iB2;
            }
        }
        view.setLayoutParams(layoutParams);
    }
}
