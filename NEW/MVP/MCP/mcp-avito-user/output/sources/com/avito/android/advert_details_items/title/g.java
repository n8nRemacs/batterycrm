package com.avito.android.advert_details_items.title;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTitleView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/title/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/title/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f85731b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TextView f85732c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85733d;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_details_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85731b = (TextView) viewFindViewById;
        this.f85732c = (TextView) view.findViewById(R.id.advert_details_subtitle);
        this.f85733d = C35835l0.d(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.advert_details_items.title.f
    public final void k(@l AttributedText attributedText) {
        TextView textView = this.f85732c;
        if (textView != null) {
            j.a(textView, attributedText, null);
        }
    }

    @Override // com.avito.android.advert_details_items.title.f
    public final void setTitle(@k String str) {
        I5.a(this.f85731b, str, false);
    }

    @Override // com.avito.android.advert_details_items.title.f
    public final void y1() {
        this.f85731b.setTextColor(this.f85733d);
    }
}
