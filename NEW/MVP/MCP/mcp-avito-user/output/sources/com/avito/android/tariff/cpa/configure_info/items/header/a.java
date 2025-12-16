package com.avito.android.tariff.cpa.configure_info.items.header;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_info/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294514b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f294515c;

    public a(@k String str, @k AttributedText attributedText) {
        this.f294514b = str;
        this.f294515c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return 1183834501;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF289436b() {
        return "header_item";
    }
}
