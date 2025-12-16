package com.avito.android.advert.item.gig.duties;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDutiesItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/gig/duties/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/gig/duties/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f75745b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinearLayout f75746c;

    public e(@k View view) {
        super(view);
        this.f75745b = view;
        View viewFindViewById = view.findViewById(R.id.advert_details_duties_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f75746c = (LinearLayout) viewFindViewById;
    }

    @Override // com.avito.android.advert.item.gig.duties.d
    public final void DU(@k List<String> list) {
        LinearLayout linearLayout = this.f75746c;
        linearLayout.removeAllViews();
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            a aVar = new a(this.f75745b.getContext(), null, 0, 6, null);
            I5.a(aVar.textView, (String) obj, false);
            if (i12 > 0) {
                aVar.setPadding(aVar.getPaddingLeft(), y6.b(8), aVar.getPaddingRight(), aVar.getPaddingBottom());
            }
            linearLayout.addView(aVar);
            i12 = i13;
        }
    }
}
