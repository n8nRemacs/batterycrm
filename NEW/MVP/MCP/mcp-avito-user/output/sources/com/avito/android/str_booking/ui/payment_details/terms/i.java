package com.avito.android.str_booking.ui.payment_details.terms;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.str_booking.ui.payment_details.terms.i;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StrBookingTermView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_booking/ui/payment_details/terms/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/payment_details/terms/g;", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f286147b = 0;

    /* compiled from: StrBookingTermView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f286148l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f286148l = str;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f286148l);
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.str_booking.ui.payment_details.terms.g
    public final void hl(@k c cVar) {
        View viewFindViewById = this.itemView.findViewById(R.id.dtv_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        final DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) viewFindViewById;
        View viewFindViewById2 = this.itemView.findViewById(R.id.tv_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        kotlin.c.b(descriptionParameterItem.getLeftTextView(), cVar.f286138b);
        kotlin.c.b(descriptionParameterItem.getRightTextView(), cVar.f286139c);
        final String str = cVar.f286141e;
        descriptionParameterItem.setLeftTextIconDrawable(str != null ? C35835l0.h(R.attr.ic_help16, this.itemView.getContext()) : null);
        descriptionParameterItem.setLeftTextIconClickListener(str != null ? new View.OnClickListener() { // from class: com.avito.android.str_booking.ui.payment_details.terms.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i.f286147b;
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(this.f286144b.itemView.getContext(), 0, 0, 6, null);
                p.a(kVar, new i.a(str));
                kVar.f(descriptionParameterItem.getIcon());
            }
        } : null);
        kotlin.c.b(textView, cVar.f286140d);
    }
}
