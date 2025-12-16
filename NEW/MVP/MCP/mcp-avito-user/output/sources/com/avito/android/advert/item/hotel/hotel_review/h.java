package com.avito.android.advert.item.hotel.hotel_review;

import VU.b;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35976x4;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertHotelReviewView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/hotel/hotel_review/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/hotel/hotel_review/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f76266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f76267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final RecyclerView f76268d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f76269e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f76270f;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76266b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f76267c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.badges);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f76268d = recyclerView;
        View viewFindViewById4 = view.findViewById(R.id.action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f76269e = (Button) viewFindViewById4;
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        C35976x4.a(recyclerView);
        recyclerView.l(new i(), -1);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void Pm(@l Y41.a<G0> aVar) {
        D6.a(aVar, this.f76269e);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void b(@l String str) {
        I5.a(this.f76266b, str, false);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void eV(@l RecyclerView.Adapter<?> adapter) {
        this.f76268d.setAdapter(adapter);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void ex(@l ButtonAction buttonAction) {
        VU.b bVarC;
        int i12 = buttonAction != null ? 0 : 8;
        Button button = this.f76269e;
        button.setVisibility(i12);
        if (buttonAction == null) {
            return;
        }
        String style = buttonAction.getStyle();
        if (style != null) {
            b.a aVar = VU.b.f17147t;
            Context context = button.getContext();
            aVar.getClass();
            bVarC = b.a.b(context, style);
        } else {
            b.a aVar2 = VU.b.f17147t;
            Context context2 = button.getContext();
            int iJ2 = C35835l0.j(R.attr.buttonSecondaryMedium, button.getContext());
            aVar2.getClass();
            bVarC = b.a.c(iJ2, context2);
        }
        button.setStyle(bVarC);
        button.setText(buttonAction.getTitle());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f76270f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void oF(boolean z12) {
        this.f76268d.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void q(@l AttributedText attributedText) {
        j.a(this.f76267c, attributedText, null);
    }

    @Override // com.avito.android.advert.item.hotel.hotel_review.g
    public final void t(@l Y41.a<G0> aVar) {
        this.f76270f = aVar;
    }
}
