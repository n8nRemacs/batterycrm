package com.avito.android.advert.item.services_review_volunteers;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServicesReviewVolunteersItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/services_review_volunteers/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/services_review_volunteers/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f80003e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f80004b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80005c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f80006d;

    public d(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.services_review_volunteers_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80004b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.services_review_volunteers_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80005c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.services_review_volunteers_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f80006d = button;
        button.getLayoutParams().width = ((C35835l0.g(view.getContext()).x - (com.avito.android.actions_sheet.a.d(view, R.dimen.content_horizontal_padding) * 2)) - com.avito.android.actions_sheet.a.d(view, R.dimen.contact_button_inner_padding)) / 2;
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.c
    public final void a(@k Y41.a<G0> aVar) {
        this.f80006d.setOnClickListener(new com.avito.android.advert.item.parking.h(17, aVar));
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.c
    public final void c1(@k String str) {
        this.f80006d.setText(str);
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.c
    public final void f(@k String str) {
        this.f80005c.setText(str);
    }

    @Override // com.avito.android.advert.item.services_review_volunteers.c
    public final void setTitle(@k String str) {
        this.f80004b.setText(str);
    }
}
