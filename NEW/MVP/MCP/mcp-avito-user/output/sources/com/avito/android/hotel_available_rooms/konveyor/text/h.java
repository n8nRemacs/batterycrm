package com.avito.android.hotel_available_rooms.konveyor.text;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HotelRoomTextView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_available_rooms/konveyor/text/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_available_rooms/konveyor/text/g;", "_avito_hotel-available-rooms_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f163083b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.l<? super DeepLink, G0> f163084c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f163085d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f163083b = (TextView) viewFindViewById;
        view.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 20));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.text.g
    public final void J2(int i12) {
        TextView textView = this.f163083b;
        textView.setTextAppearance(C35835l0.j(i12, textView.getContext()));
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.text.g
    public final void a(@l Y41.a<G0> aVar) {
        this.f163085d = aVar;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.text.g
    public final void g1(@k Y41.l<? super DeepLink, G0> lVar) {
        this.f163084c = lVar;
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.text.g
    public final void m0(@k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 12));
        j.c(this.f163083b, attributedText, null);
    }

    @Override // com.avito.android.hotel_available_rooms.konveyor.text.g
    public final void y(@k PrintableText printableText) {
        TextView textView = this.f163083b;
        textView.setText(printableText.k0(textView.getContext()));
    }
}
