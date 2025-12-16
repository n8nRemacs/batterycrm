package com.avito.android.delivery_tarifikator.domain;

import android.content.Context;
import com.squareup.anvil.annotations.ContributesBinding;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: TarifikatorSettingsValidator.kt */
@kotlin.jvm.internal.s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/domain/u0;", "Lcom/avito/android/delivery_tarifikator/domain/t0;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes12.dex */
public final class u0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f135339a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final U f135340b;

    /* renamed from: c, reason: collision with root package name */
    public final NumberFormat f135341c;

    @Inject
    public u0(@Y61.k Context context, @Y61.k U u12) {
        this.f135339a = context;
        this.f135340b = u12;
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("ru"));
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            decimalFormat.setGroupingSize(3);
            decimalFormat.getDecimalFormatSymbols().setGroupingSeparator((char) 160);
        }
        numberFormat.setGroupingUsed(true);
        this.f135341c = numberFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    @Override // com.avito.android.delivery_tarifikator.domain.t0
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap a(@Y61.k Ov.j r19, @Y61.k java.util.List r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.domain.u0.a(Ov.j, java.util.List):java.util.LinkedHashMap");
    }
}
