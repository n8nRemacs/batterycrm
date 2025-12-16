package com.avito.android.publish.slots.sell_faster_banner;

import Y61.k;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SellFasterBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/sell_faster_banner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/sell_faster_banner/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f244853e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Banner f244854b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f244855c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f244856d;

    public i(@k View view) {
        super(view);
        Banner banner = (Banner) view.findViewById(R.id.sell_faster_banner);
        this.f244854b = banner;
        LinearLayout linearLayout = (LinearLayout) banner.findViewById(R.id.discount_banner_content);
        this.f244855c = (TextView) linearLayout.findViewById(R.id.discount_banner_subtitle);
        TextView textView = (TextView) linearLayout.findViewById(R.id.discount_banner_details);
        this.f244856d = textView;
        String string = view.getContext().getString(R.string.details_underlined_text);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(new UnderlineSpan(), 0, string.length(), 0);
        textView.setText(spannableString);
    }

    @Override // com.avito.android.publish.slots.sell_faster_banner.h
    public final void RH(@k Y41.a<G0> aVar) {
        this.f244856d.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(7, aVar));
    }

    @Override // com.avito.android.publish.slots.sell_faster_banner.h
    public final void b(@k String str) {
        this.f244854b.setTitle(str);
    }

    @Override // com.avito.android.publish.slots.sell_faster_banner.h
    public final void j(@k String str) {
        this.f244855c.setText(str);
    }
}
