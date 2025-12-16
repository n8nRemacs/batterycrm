package com.avito.android.publish.slots.cpa_tariff.item;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.deprecated_banner.Banner;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpaTariffSlotView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/cpa_tariff/item/g;", "Lcom/avito/android/publish/slots/cpa_tariff/item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f243385c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f243386b;

    public g(@k View view) {
        super(view);
        this.f243386b = (Banner) view;
    }

    @Override // com.avito.android.publish.slots.cpa_tariff.item.f
    public final void setText(@k String str) {
        XU.a content = this.f243386b.getContent();
        content.f18891b = str;
        TextView textView = content.f18895f;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.publish.slots.cpa_tariff.item.f
    public final void setTitle(@k String str) {
        XU.a content = this.f243386b.getContent();
        content.f18890a = str;
        TextView textView = content.f18894e;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.publish.slots.cpa_tariff.item.f
    public final void yO(@k String str, @k Y41.a<G0> aVar) {
        this.f243386b.getContent().a(str, new com.avito.android.publish.slots.cpa_ddu_upload.k(1, aVar));
    }
}
