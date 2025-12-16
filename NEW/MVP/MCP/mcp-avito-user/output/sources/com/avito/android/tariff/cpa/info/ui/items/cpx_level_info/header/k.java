package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header;

import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpxLevelInfoHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/header/j;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f294851e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f294852b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f294853c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f294854d;

    public k(@Y61.k View view) {
        super(view);
        this.f294852b = (TextView) view.findViewById(R.id.cpx_level_info_header_item_title);
        TextView textView = (TextView) view.findViewById(R.id.cpx_level_info_header_item_description);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f294853c = textView;
        this.f294854d = (Button) view.findViewById(R.id.cpx_level_info_header_item_button);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.j
    public final void QT(@l a aVar, @Y61.k Y41.a<G0> aVar2) {
        Button button = this.f294854d;
        if (aVar == null) {
            D6.w(button);
            button.setOnClickListener(null);
            return;
        }
        button.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(5, aVar2));
        button.setAppearanceFromAttr(aVar.f294835c);
        Integer num = aVar.f294834b;
        String str = aVar.f294833a;
        if (str != null && num != null) {
            button.setText(str);
            Button.g(button, null, C35835l0.h(num.intValue(), this.itemView.getContext()), false, null, 13);
        } else if (str != null && num == null) {
            button.setText(str);
            Button.g(button, null, null, false, null, 15);
        } else {
            if (str != null || num == null) {
                return;
            }
            button.setImageDrawable(C35835l0.h(num.intValue(), this.itemView.getContext()));
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.j
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f294853c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.header.j
    public final void setTitle(@Y61.k String str) {
        this.f294852b.setText(str);
    }
}
