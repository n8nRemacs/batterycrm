package com.avito.android.tariff_cpt.info.ui.items.level_header;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.tariff_cpt.info.ui.items.level_header.a;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CptInfoLevelHeaderItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_header/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/level_header/i;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f298416f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298417b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f298418c;

    /* renamed from: d, reason: collision with root package name */
    public final Button f298419d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f298420e;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f298417b = aVar;
        this.f298418c = (TextView) view.findViewById(R.id.cpt_info_level_header_title);
        this.f298419d = (Button) view.findViewById(R.id.cpt_info_level_header_button);
        this.f298420e = (TextView) view.findViewById(R.id.cpt_info_level_header_description);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_header.i
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f298420e, attributedText, this.f298417b);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_header.i
    public final void ru(@k a.C9113a c9113a, @k Y41.a<G0> aVar) {
        com.avito.android.sx_address.address_video_verification.view.b bVar = new com.avito.android.sx_address.address_video_verification.view.b(21, aVar);
        Button button = this.f298419d;
        button.setOnClickListener(bVar);
        button.setAppearanceFromAttr(c9113a.f298402d);
        Integer num = c9113a.f298401c;
        String str = c9113a.f298400b;
        if (str != null && num != null) {
            button.setText(str);
            Button.g(button, null, C35835l0.h(num.intValue(), this.itemView.getContext()), false, null, 13);
        } else if (str != null && num == null) {
            button.setText(str);
        } else {
            if (str != null || num == null) {
                return;
            }
            button.setImageDrawable(C35835l0.h(num.intValue(), this.itemView.getContext()));
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.level_header.i
    public final void setTitle(@k String str) {
        this.f298418c.setText(str);
    }
}
