package com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImvCarsDetailsPollView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/h;", "Lcom/avito/android/imv_cars_details/presentation/items/imv_cars_details_poll_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_imv-cars-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f170153g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f170154b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f170155c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f170156d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f170157e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f170158f;

    public h(@k View view) {
        super(view);
        this.f170154b = view;
        View viewFindViewById = view.findViewById(R.id.imv_cars_details_poll_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170155c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.imv_cars_details_positive_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f170156d = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.imv_cars_details_negative_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f170157e = (Button) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.imv_cars_details_already_answered_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f170158f = (TextView) viewFindViewById4;
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void Dr() {
        D6.w(this.f170156d);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void JT(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f170157e;
        D6.G(button, true);
        button.setText(str);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(5, aVar));
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void Rj(@k String str, @k Y41.a<G0> aVar) {
        Button button = this.f170156d;
        D6.G(button, true);
        button.setText(str);
        button.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(6, aVar));
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void b(@l String str) {
        I5.a(this.f170155c, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void iR(@l String str) {
        I5.a(this.f170158f, str, false);
    }

    @Override // com.avito.android.imv_cars_details.presentation.items.imv_cars_details_poll_item.g
    public final void nf() {
        D6.w(this.f170157e);
    }
}
