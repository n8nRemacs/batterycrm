package com.avito.android.advert.item.ownership_discrepancy;

import Y41.l;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsOwnershipDiscrepancyBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll6/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ll6/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class b extends N implements l<l6.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsOwnershipDiscrepancyBottomSheet f78099l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet) {
        super(1);
        this.f78099l = advertDetailsOwnershipDiscrepancyBottomSheet;
    }

    @Override // Y41.l
    public final G0 invoke(l6.c cVar) {
        l6.c cVar2 = cVar;
        AdvertDetailsOwnershipDiscrepancyBottomSheet advertDetailsOwnershipDiscrepancyBottomSheet = this.f78099l;
        TextView textView = advertDetailsOwnershipDiscrepancyBottomSheet.f78082p0;
        if (textView != null) {
            I5.a(textView, cVar2.f413529c, false);
        }
        TextView textView2 = advertDetailsOwnershipDiscrepancyBottomSheet.f78083q0;
        if (textView2 != null) {
            I5.a(textView2, cVar2.f413528b, false);
        }
        Button button = advertDetailsOwnershipDiscrepancyBottomSheet.f78084r0;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, cVar2.f413530d, false);
        }
        List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list = cVar2.f413531e;
        if (list != null && !list.isEmpty()) {
            LinearLayout linearLayout = advertDetailsOwnershipDiscrepancyBottomSheet.f78081o0;
            if (linearLayout == null) {
                linearLayout = null;
            }
            D6.H(linearLayout);
            LinearLayout linearLayout2 = advertDetailsOwnershipDiscrepancyBottomSheet.f78081o0;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            linearLayout2.removeAllViews();
            for (AdvertParameters.Button.OwnershipDiscrepancy.KeyValue keyValue : list) {
                String key = keyValue.getKey();
                String value = keyValue.getValue();
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(advertDetailsOwnershipDiscrepancyBottomSheet.getContext());
                LinearLayout linearLayout3 = advertDetailsOwnershipDiscrepancyBottomSheet.f78081o0;
                if (linearLayout3 == null) {
                    linearLayout3 = null;
                }
                View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_core_with_leading_icon_key_value, (ViewGroup) linearLayout3, false);
                View viewFindViewById = viewInflate.findViewById(R.id.text_view);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView3 = (TextView) viewFindViewById;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView3.getContext().getString(R.string.advert_core_advert_details_flat_text, key, value));
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.gray48, textView3.getContext())), 0, key.length() + 1, 33);
                textView3.setText(spannableStringBuilder);
                LinearLayout linearLayout4 = advertDetailsOwnershipDiscrepancyBottomSheet.f78081o0;
                if (linearLayout4 == null) {
                    linearLayout4 = null;
                }
                linearLayout4.addView(viewInflate);
            }
        }
        Button button2 = advertDetailsOwnershipDiscrepancyBottomSheet.f78084r0;
        if (button2 != null) {
            button2.setOnClickListener(new B(advertDetailsOwnershipDiscrepancyBottomSheet, 4));
        }
        return G0.f406611a;
    }
}
