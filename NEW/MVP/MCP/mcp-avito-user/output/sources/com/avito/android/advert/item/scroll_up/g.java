package com.avito.android.advert.item.scroll_up;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsScrollUpView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/scroll_up/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/scroll_up/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.appcompat.view.d f79335b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f79336c;

    public g(@k View view) {
        super(view);
        this.f79335b = new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23);
        this.f79336c = (Button) view.findViewById(R.id.btn_scroll_up);
    }

    @Override // com.avito.android.advert.item.scroll_up.f
    public final void U8(@k View.OnClickListener onClickListener) {
        this.f79336c.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advert.item.scroll_up.f
    public final void setTitle(@k String str) {
        FV.a aVar = FV.a.f4720a;
        androidx.appcompat.view.d dVar = this.f79335b;
        int iB2 = y6.b(3);
        aVar.getClass();
        this.f79336c.setState(new UU.a(FV.a.i(str, dVar, R.attr.textIconArrowUp, iB2), null, false, false, false, null, null, null, null, false, 1022, null));
    }
}
