package com.avito.android.imv_cars_details.presentation.items.seller_comment;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsPriceCommentView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/seller_comment/f;", "Lcom/avito/android/imv_cars_details/presentation/items/seller_comment/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f170224b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170225c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f170226d;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.price_comment_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170224b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price_comment_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170225c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.price_comment_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170226d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.seller_comment.e
    public final void c5(@l String str) {
        I5.a(this.f170226d, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.seller_comment.e
    public final void f(@l String str) {
        I5.a(this.f170225c, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.seller_comment.e
    public final void setTitle(@l String str) {
        I5.a(this.f170224b, str, false);
    }
}
