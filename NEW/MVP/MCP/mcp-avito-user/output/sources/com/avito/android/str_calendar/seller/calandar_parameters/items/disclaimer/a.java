package com.avito.android.str_calendar.seller.calandar_parameters.items.disclaimer;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DisclaimerItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/items/disclaimer/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f287127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f287128c;

    public a(String str, AttributedText attributedText, int i12, C42822w c42822w) {
        this.f287127b = (i12 & 1) != 0 ? "disclaimer_item" : str;
        this.f287128c = attributedText;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return getF287127b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF287127b() {
        return this.f287127b;
    }
}
