package com.avito.android.seller_coach.hints_dialog.item.empty_hints;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.seller_coach.hints_dialog.item.hint.d;
import kotlin.Metadata;

/* compiled from: EmptyHintItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/seller_coach/hints_dialog/item/empty_hints/h;", "Lcom/avito/android/seller_coach/hints_dialog/item/empty_hints/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_seller-coach_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f267471d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f267472b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f267473c;

    public h(@k View view) {
        super(view);
        this.f267472b = view;
        this.f267473c = (Button) view.findViewById(R.id.btn_advice_empty);
    }

    @Override // com.avito.android.seller_coach.hints_dialog.item.empty_hints.g
    public final void JZ(@k d.a aVar) {
        this.f267473c.setOnClickListener(new com.avito.android.review_gallery.g(aVar, 18));
    }
}
