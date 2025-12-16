package com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantToNoteGroupItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/h;", "Lcom/avito/android/str_seller_orders/strsellerorders/mvi/items/importanto_to_note_group/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f289992f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f289993b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f289994c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f289995d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f289996e;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f289993b = aVar;
        this.f289994c = (ImageView) view.findViewById(R.id.icon_iv);
        this.f289995d = (TextView) view.findViewById(R.id.group_title_tv);
        this.f289996e = (TextView) view.findViewById(R.id.group_subtitle_tv);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.g
    public final void R(@l AttributedText attributedText) {
        j.a(this.f289996e, attributedText, this.f289993b);
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.g
    public final void Z(@l String str) {
        Integer numA;
        int iIntValue = (str == null || (numA = q.a(str)) == null) ? R.attr.ic_check20 : numA.intValue();
        ImageView imageView = this.f289994c;
        imageView.setImageDrawable(C35835l0.h(iIntValue, imageView.getContext()));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.g
    public final void a(@k Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.str_calendar.booking_calendar.items.day.h(18, aVar));
    }

    @Override // com.avito.android.str_seller_orders.strsellerorders.mvi.items.importanto_to_note_group.g
    public final void w(@l AttributedText attributedText) {
        j.a(this.f289995d, attributedText, this.f289993b);
    }
}
