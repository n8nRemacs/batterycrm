package com.avito.android.tariff_cpt.common.item.button;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCptButtonItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/common/item/button/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/common/item/button/h;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f297531d = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f297532b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f297533c;

    public i(@k View view) {
        super(view);
        this.f297532b = (Button) view.findViewById(R.id.cpt_button);
        this.f297533c = (TextView) view.findViewById(R.id.cpt_text_agreement);
    }

    @Override // com.avito.android.tariff_cpt.common.item.button.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f297532b.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(15, aVar));
    }

    @Override // com.avito.android.tariff_cpt.common.item.button.h
    public final void setLoading(boolean z12) {
        Button button = this.f297532b;
        button.setLoading(z12);
        button.setClickable(!z12);
    }

    @Override // com.avito.android.tariff_cpt.common.item.button.h
    public final void setTitle(@k String str) {
        com.avito.android.lib.design.button.b.a(this.f297532b, str, false);
    }

    @Override // com.avito.android.tariff_cpt.common.item.button.h
    public final void u2(@l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f297533c;
        textView.setMovementMethod(linkMovementMethod);
        j.a(textView, attributedText, null);
    }
}
