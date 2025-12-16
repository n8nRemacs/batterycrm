package com.avito.android.advert.item.similars_button;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AdvertDetailsSimilarsButtonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/similars_button/b;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/similars_button/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends com.avito.konveyor.adapter.b implements a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80347d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f80348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80349c;

    public b(@k View view) {
        super(view);
        this.f80348b = (Button) view;
        this.f80349c = D6.j(view, 24);
    }

    @Override // com.avito.android.advert.item.similars_button.a
    public final void X10() {
        ViewGroup.LayoutParams layoutParams = this.f80348b.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.topMargin = this.f80349c;
    }

    @Override // com.avito.android.advert.item.similars_button.a
    public final void c(@k Y41.a<G0> aVar) {
        this.f80348b.setOnClickListener(new com.avito.android.advert.item.parking.h(21, aVar));
    }

    @Override // com.avito.android.advert.item.similars_button.a
    public final void setText(@k String str) {
        this.f80348b.setText(str);
    }
}
