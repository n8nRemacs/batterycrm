package com.avito.android.tariff.cpa.configure_advance.items.header;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/items/header/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f294354b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f294355c;

    public a(@k String str, @l AttributedText attributedText) {
        this.f294354b = str;
        this.f294355c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF250003b() {
        return 1183834501;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF293163e() {
        return "header_item";
    }
}
