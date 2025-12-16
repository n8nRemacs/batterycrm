package com.avito.android.short_term_rent.bookingform.items.dotted_text;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DottedTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/dotted_text/m;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f281500c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f281501b;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.dotted_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f281501b = (DescriptionParameterItem) viewFindViewById;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.dotted_text.m
    public final void D9(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f281501b.getLeftTextView(), attributedText, null);
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.dotted_text.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f281501b.setOnClickListener(new com.avito.android.service_booking_common.blueprints.geo_reference.g(18, aVar));
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.dotted_text.m
    public final void ed(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f281501b.getRightTextView(), attributedText, null);
    }
}
