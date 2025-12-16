package com.avito.android.tariff.cpa.info.ui.items.level_info;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LevelInfoItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/level_info/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/level_info/i;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f294923f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f294924b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f294925c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f294926d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Spinner f294927e;

    public j(@k View view) {
        super(view);
        this.f294924b = (TextView) view.findViewById(R.id.title);
        TextView textView = (TextView) view.findViewById(R.id.description);
        this.f294925c = textView;
        this.f294926d = (Button) view.findViewById(R.id.button);
        this.f294927e = (Spinner) view.findViewById(R.id.progress_bar);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.level_info.i
    public final void MK(boolean z12) {
        this.f294926d.setEnabled(!z12);
        this.f294924b.setAlpha(z12 ? 0.5f : 1.0f);
        this.f294925c.setAlpha(z12 ? 0.5f : 1.0f);
        D6.G(this.f294927e, z12);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.level_info.i
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f294925c, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.level_info.i
    public final void r1(@l String str, @k Y41.a<G0> aVar) {
        Button button = this.f294926d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(7, aVar));
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.level_info.i
    public final void setTitle(@k String str) {
        this.f294924b.setText(str);
    }
}
