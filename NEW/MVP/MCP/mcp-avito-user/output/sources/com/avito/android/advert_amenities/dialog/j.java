package com.avito.android.advert_amenities.dialog;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CloseAmenitiesDialogItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_amenities/dialog/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_amenities/dialog/i;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f81171d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f81172b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f81173c;

    public j(@k View view) {
        super(view);
        this.f81172b = view;
        this.f81173c = (TextView) view.findViewById(R.id.close_dialog_btn);
    }

    @Override // com.avito.android.advert_amenities.dialog.i
    public final void F(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f81173c, attributedText, null);
    }

    @Override // com.avito.android.advert_amenities.dialog.i
    public final void a(@k Y41.a<G0> aVar) {
        this.f81173c.setOnClickListener(new com.avito.android.advert.item.parking.h(28, aVar));
    }

    @Override // com.avito.android.advert_amenities.dialog.i
    public final void zS() {
        if (this.f81172b.getContext().getResources().getConfiguration().orientation == 2) {
            D6.c(this.f81172b, null, null, null, Integer.valueOf(y6.b(40)), 7);
        }
    }
}
