package com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal;

import Y61.k;
import Y61.l;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetToDealItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/get_to_deal/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/developments_agency_search/screen/deal_room/adapter/get_to_deal/h;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f137398d = 0;

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f137399b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Button f137400c;

    /* compiled from: GetToDealItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/developments_agency_search/screen/deal_room/adapter/get_to_deal/i$a", "Landroid/text/style/ClickableSpan;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ClickableSpan {
        public a() {
        }

        @Override // android.text.style.ClickableSpan
        public final void onClick(@k View view) {
            Y41.a<G0> aVar = i.this.f137399b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public i(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.developer_requirements);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        I5.a(textView, new SpannableStringBuilder().append((CharSequence) textView.getContext().getString(R.string.das_deal_room_booking_stage_developer_requirements_part_1)).append((CharSequence) " ").append(textView.getContext().getString(R.string.das_deal_room_booking_stage_developer_requirements_part_2), new a(), 17).append((CharSequence) "."), false);
        View viewFindViewById2 = view.findViewById(R.id.get_to_deal_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f137400c = (Button) viewFindViewById2;
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.h
    public final void Rp(@k Y41.a<G0> aVar) {
        this.f137399b = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f137399b = null;
        this.f137400c.setOnClickListener(null);
    }

    @Override // com.avito.android.developments_agency_search.screen.deal_room.adapter.get_to_deal.h
    public final void wf(@k Y41.a<G0> aVar) {
        this.f137400c.setOnClickListener(new com.avito.android.crm_paid_cvs.view.list_items.select_filter.k(18, aVar));
    }
}
