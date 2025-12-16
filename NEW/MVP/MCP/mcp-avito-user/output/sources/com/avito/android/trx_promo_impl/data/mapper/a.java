package com.avito.android.trx_promo_impl.data.mapper;

import RF0.f;
import Y61.k;
import Y61.l;
import YF0.o;
import com.avito.android.remote.model.text.AttributedText;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: TrxPromoMapperV7.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/trx_promo_impl/data/mapper/a;", "", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @k
    ArrayList a(@k o.b bVar, boolean z12, @l Integer num, @l LocalDate localDate, @l LocalDate localDate2);

    @l
    AttributedText b(@k o.b bVar, boolean z12);

    @k
    LocalDate c(@k o.b bVar, boolean z12);

    @k
    LocalDate d(@k o.b bVar, boolean z12);

    @l
    RF0.k e(@k o.b bVar);

    @k
    f f(@k o.b bVar, boolean z12, @k LocalDate localDate);

    @k
    ArrayList g(@k o.b bVar, boolean z12);
}
