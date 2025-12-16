package com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.body_condition.h;
import com.avito.android.btob_business_trip.screens.selectItemScreen.t;
import com.avito.android.lib.design.bottom_sheet.d;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.LinkAttribute;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import xp.C49980a;

/* compiled from: SelectAgentFaqDialog.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/small/dialog/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends d {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final l<String, G0> f121411E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final l<String, G0> f121412F;

    /* compiled from: SelectAgentFaqDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.comfortable_deal.deal.item.digitalregistration.small.dialog.a$a, reason: collision with other inner class name */
    public static final class C3585a extends N implements l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f121413l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Context f121414m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ a f121415n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3585a(String str, Context context, a aVar) {
            super(1);
            this.f121413l = str;
            this.f121414m = context;
            this.f121415n = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            String str = this.f121413l;
            if (str != null) {
                View viewFindViewById = view2.findViewById(R.id.phone_input);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
                }
                Input.t((Input) viewFindViewById, str, false, 6);
            }
            View viewFindViewById2 = view2.findViewById(R.id.recall_description);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            a aVar = this.f121415n;
            l<String, G0> lVar = aVar.f121412F;
            Context context = this.f121414m;
            AttributedText attributedText = new AttributedText(context.getString(R.string.client_room_digital_registration_description_attributed_base), C42745f0.U(new FontAttribute("text1", context.getString(R.string.client_room_digital_registration_dialog_description), C42745f0.U(new FontParameter.TextStyleParameter(null, "m20"), new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK))), new LinkAttribute("link1", context.getString(R.string.client_room_digital_registration_additional_description), context.getString(R.string.client_room_digital_registration_dialog_additional_link_description), C42745f0.U(new FontParameter.TextStyleParameter(null, "m20"), new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK), FontParameter.UnderlineParameter.INSTANCE))), 1);
            attributedText.setOnUrlClickListener(new t(4, lVar));
            j.a(textView, attributedText, null);
            View viewFindViewById3 = view2.findViewById(R.id.text_disclaimer);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById3;
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            j.a(textView2, C49980a.a(context, aVar.f121412F), null);
            View viewFindViewById4 = view2.findViewById(R.id.submit_button);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            ((Button) viewFindViewById4).setOnClickListener(new h(19, view2, aVar));
            return G0.f406611a;
        }
    }

    public /* synthetic */ a(Context context, String str, l lVar, l lVar2, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : str, lVar, lVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Context context, @Y61.l String str, @k l<? super String, G0> lVar, @k l<? super String, G0> lVar2) {
        super(context, 0, 2, null);
        this.f121411E = lVar;
        this.f121412F = lVar2;
        C(R.layout.deal_digital_registration_bottom_sheet_layout, new C3585a(str, context, this));
        d.M(this, null, false, true, 3);
        d.I(this, true);
    }
}
