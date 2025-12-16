package com.avito.android.auto_reseller_contacts.buy_contact_bottom_sheet;

import Se.C15176c;
import Y41.l;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.lib.util.q;
import com.avito.android.remote.model.auto_contact_models.Benefit;
import com.avito.android.remote.model.auto_contact_models.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BuyContactBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSe/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LSe/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class b extends N implements l<C15176c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BuyContactBottomSheet f95704l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BuyContactBottomSheet buyContactBottomSheet) {
        super(1);
        this.f95704l = buyContactBottomSheet;
    }

    @Override // Y41.l
    public final G0 invoke(C15176c c15176c) {
        C15176c c15176c2 = c15176c;
        BuyContactBottomSheet buyContactBottomSheet = this.f95704l;
        TextView textView = buyContactBottomSheet.f95692m0;
        if (textView == null) {
            textView = null;
        }
        I5.a(textView, c15176c2.f15100a, false);
        TextView textView2 = buyContactBottomSheet.f95691l0;
        if (textView2 == null) {
            textView2 = null;
        }
        I5.a(textView2, c15176c2.f15103d, false);
        TextView textView3 = buyContactBottomSheet.f95693n0;
        if (textView3 == null) {
            textView3 = null;
        }
        com.avito.android.util.text.a aVar = buyContactBottomSheet.f95696q0;
        if (aVar == null) {
            aVar = null;
        }
        j.a(textView3, c15176c2.f15104e, aVar);
        LinearLayout linearLayout = buyContactBottomSheet.f95694o0;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        for (Benefit benefit : c15176c2.f15101b) {
            LinearLayout linearLayout2 = buyContactBottomSheet.f95694o0;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            LayoutInflater layoutInflater = buyContactBottomSheet.getLayoutInflater();
            LinearLayout linearLayout3 = buyContactBottomSheet.f95694o0;
            if (linearLayout3 == null) {
                linearLayout3 = null;
            }
            View viewInflate = layoutInflater.inflate(R.layout.buy_contact_benefit, (ViewGroup) linearLayout3, false);
            View viewFindViewById = viewInflate.findViewById(R.id.benefit_text);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView4 = (TextView) viewFindViewById;
            View viewFindViewById2 = viewInflate.findViewById(R.id.benefit_icon);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById2;
            Integer numA = q.a(benefit.getIcon().getName());
            int iIntValue = numA != null ? numA.intValue() : R.attr.ic_checkThin20;
            Integer numA2 = com.avito.android.lib.util.e.a(benefit.getIcon().getColor());
            Drawable drawableL = C35835l0.l(C35835l0.h(iIntValue, viewInflate.getContext()), C35835l0.d(numA2 != null ? numA2.intValue() : R.attr.black, viewInflate.getContext()));
            textView4.setText(benefit.getText());
            simpleDraweeView.setBackground(drawableL);
            linearLayout2.addView(viewInflate);
        }
        Button button = c15176c2.f15102c;
        DeepLink uri = button != null ? button.getUri() : null;
        if (button != null && uri != null) {
            com.avito.android.lib.design.button.Button button2 = buyContactBottomSheet.f95690k0;
            if (button2 == null) {
                button2 = null;
            }
            button2.setText(button.getTitle());
            com.avito.android.lib.design.button.Button button3 = buyContactBottomSheet.f95690k0;
            (button3 != null ? button3 : null).setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(8, buyContactBottomSheet, uri));
        }
        return G0.f406611a;
    }
}
