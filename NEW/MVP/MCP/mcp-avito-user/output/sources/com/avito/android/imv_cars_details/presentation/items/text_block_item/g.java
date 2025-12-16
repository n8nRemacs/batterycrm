package com.avito.android.imv_cars_details.presentation.items.text_block_item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsTextBlockView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/g;", "Lcom/avito/android/imv_cars_details/presentation/items/text_block_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f170238e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f170239b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170240c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f170241d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170239b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170240c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.anchor_subtitle);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170241d = (TextView) viewFindViewById3;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.text_block_item.f
    public final void gZ(@k Y41.a<G0> aVar) {
        this.f170241d.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(7, aVar));
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.text_block_item.f
    public final void u20(@l String str, @l String str2, @l String str3) {
        I5.a(this.f170239b, str, false);
        I5.a(this.f170240c, str2, false);
        I5.a(this.f170241d, str3, false);
    }
}
