package com.avito.android.mortgage.landing.list.items.steps.with_background;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.landing.list.items.steps.d;
import com.avito.android.mortgage.landing.list.items.steps.e;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StepsViewWithBg.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/steps/with_background/a;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/steps/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f199993b;

    public a(@k View view) {
        super(view);
        this.f199993b = new e(view);
        this.itemView.setClipToOutline(true);
        this.itemView.setBackgroundResource(R.drawable.action_banner_item_bg);
        View view2 = this.itemView;
        view2.setPadding(view2.getPaddingLeft(), y6.b(16), view2.getPaddingRight(), y6.b(20));
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void PK(@l UniversalImage universalImage) {
        this.f199993b.PK(universalImage);
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void Z30(@k Y41.l lVar, @k AttributedText attributedText) {
        this.f199993b.Z30(lVar, attributedText);
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void im(@l UniversalImage universalImage) {
        this.f199993b.im(universalImage);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199993b.getClass();
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void vy(@l UniversalImage universalImage) {
        this.f199993b.vy(universalImage);
    }
}
